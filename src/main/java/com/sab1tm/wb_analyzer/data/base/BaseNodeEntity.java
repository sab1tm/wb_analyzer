package com.sab1tm.wb_analyzer.data.base;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@Data
@MappedSuperclass
public class BaseNodeEntity extends BaseEntity {

    @Column(columnDefinition = "TEXT")
    private String name;

    @Column(columnDefinition = "TEXT")
    private String shardKey;

    @Column(columnDefinition = "TEXT")
    private String query;

    private Integer type;

}
