package com.sab1tm.wb_analyzer.services;

import com.sab1tm.wb_analyzer.WbAnalyzerApplication;
import com.sab1tm.wb_analyzer.data.dictionary.ColorEntity;
import com.sab1tm.wb_analyzer.data.dictionary.SizeEntity;
import com.sab1tm.wb_analyzer.data.node.NodeDTO;
import com.sab1tm.wb_analyzer.data.node.NodeEntity;
import com.sab1tm.wb_analyzer.data.product.ProductEntity;
import com.sab1tm.wb_analyzer.feign.ProductFeignClient;
import com.sab1tm.wb_analyzer.reposities.ProductRepository;
import com.sab1tm.wb_analyzer.utils.TimeUtils;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@AllArgsConstructor
public class ProductService {

    private final ProductFeignClient feignClient;
    private final ProductRepository repository;
    private final ColorService colorService;
    private final SizeService sizeService;

    private static Logger LOG = LoggerFactory
            .getLogger(ProductService.class);

    public List<ProductEntity> updateProducts(NodeEntity node) {

        Integer page = 0;
        while (true) {
            NodeDTO dto = feignClient.getNodeProducts(node.getShardKey(), node.getQuery(), ++page);

            if (Objects.nonNull(dto)) {
                LOG.info("\t\t\t\tpage: {}, code: {}, name: {}", page, node.getId(), node.getName());
                if (Objects.nonNull(dto.getData()) && Objects.nonNull(dto.getData().getProducts())) {
                    for (ProductEntity product : dto.getData().getProducts()) {
                        for (ColorEntity color : product.getColors())
                            colorService.save(color);
                        for (SizeEntity size : product.getSizes())
                            sizeService.save(size);
                        save(product);
                        LOG.info("\t\t\t\t\tcode: {}, name: {}", product.getId(), product.getName());
                        TimeUtils.sleep(2000);
                    }
                } else {
                    break;
                }
            }
        }

        return repository.findAll();
    }

    public ProductEntity save(ProductEntity entity) {
        return repository.save(entity);
    }
}
