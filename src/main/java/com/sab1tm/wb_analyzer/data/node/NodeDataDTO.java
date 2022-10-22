package com.sab1tm.wb_analyzer.data.node;

import com.sab1tm.wb_analyzer.data.product.ProductEntity;
import lombok.Data;

import java.util.List;

@Data
public class NodeDataDTO {

    private List<ProductEntity> products;

}
