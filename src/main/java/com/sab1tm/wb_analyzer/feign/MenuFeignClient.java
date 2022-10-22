package com.sab1tm.wb_analyzer.feign;

import com.sab1tm.wb_analyzer.data.menu.MenuDTO;
import com.sab1tm.wb_analyzer.data.node.NodeDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "menu", url = "https://catalog.wb.ru/")
public interface MenuFeignClient {

    @RequestMapping(method = RequestMethod.GET, value = "/menu/v5/api?lang=ru&locale=kz")
    MenuDTO getMenu();

}
