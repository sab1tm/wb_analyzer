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

    @RequestMapping(method = RequestMethod.GET, value = "/catalog/{shardKey}/catalog?{query}&limit=100&sort=newly&page={page}&spp=25&regions=1,4,22,30,31,40,48,58,66,69,70,102&pricemarginCoeff=1.0&offlineBonus=0&onlineBonus=0&reg=1&appType=128&emp=0&locale=kz&lang=ru&curr=kzt&couponsGeo=7,3,1,6,21,16&dest=12358388,12358412,-3486954,83")
    ResponseEntity<MenuDTO> getCatalog(@PathVariable String shardKey, @PathVariable String query, @PathVariable Integer page);

}
