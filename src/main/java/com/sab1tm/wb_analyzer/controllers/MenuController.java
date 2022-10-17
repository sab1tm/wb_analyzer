package com.sab1tm.wb_analyzer.controllers;

import com.sab1tm.wb_analyzer.data.menu.MenuEntity;
import com.sab1tm.wb_analyzer.services.MenuService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/menu")
@AllArgsConstructor
public class MenuController {

    private final MenuService service;

    @GetMapping
    public List<MenuEntity> getMenu() {
        return service.updateMenu();
    }
}
