package com.sab1tm.wb_analyzer.feign;

import com.sab1tm.wb_analyzer.data.menu.MenuDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "catalog", url = "https://catalog.wb.ru/")
public interface CatalogFeignClient {

    @RequestMapping(method = RequestMethod.GET, value = "/menu/v5/api?lang=ru&locale=kz")
    ResponseEntity<MenuDTO> getMenu();

    @RequestMapping(method = RequestMethod.GET, value = "/catalog/{shardKey}/catalog?{query}")
    ResponseEntity<MenuDTO> getCatalog(@PathVariable String shardKey, @PathVariable String query);

}
