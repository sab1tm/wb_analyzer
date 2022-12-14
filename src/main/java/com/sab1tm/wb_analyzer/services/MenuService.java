package com.sab1tm.wb_analyzer.services;

import com.sab1tm.wb_analyzer.data.menu.MenuEntity;
import com.sab1tm.wb_analyzer.data.node.NodeEntity;
import com.sab1tm.wb_analyzer.data.menu.MenuDTO;
import com.sab1tm.wb_analyzer.feign.MenuFeignClient;
import com.sab1tm.wb_analyzer.reposities.MenuRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@AllArgsConstructor
public class MenuService {

    private final MenuFeignClient feignClient;
    private final MenuRepository repository;
    private final NodeService nodeService;

    public List<MenuEntity> updateMenu() {

        MenuDTO dto = feignClient.getMenu();

        if (Objects.nonNull(dto.getData())) {
            for (MenuEntity menu : dto.getData()) {
                if (Objects.nonNull(menu.getNodes()))
                    for (NodeEntity node : menu.getNodes())
                        nodeService.save(node);
                save(menu);
            }
        }

        return repository.findAll();
    }

    public MenuEntity save(MenuEntity entity) {
        return repository.save(entity);
    }

    public List<MenuEntity> getAll() {
        return repository.findAllOrderByUpdated();
    }

    public Optional<MenuEntity> getById(Long id) {
        return repository.findById(id);
    }
}
