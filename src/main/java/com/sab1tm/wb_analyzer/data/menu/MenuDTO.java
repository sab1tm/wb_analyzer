package com.sab1tm.wb_analyzer.data.menu;

import lombok.Data;

import java.util.List;

@Data
public class MenuDTO {

    private Integer version;

    private List<MenuEntity> data;

}
