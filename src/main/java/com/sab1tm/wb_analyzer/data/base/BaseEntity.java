package com.sab1tm.wb_analyzer.data.base;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.sql.Timestamp;

@Data
@MappedSuperclass
public class BaseEntity {

    @Id
    private Long id;

    @UpdateTimestamp
    private Timestamp updated;

    @Column(columnDefinition = "TEXT")
    private String name;

    @Column(columnDefinition = "TEXT")
    private String shardKey;

    @Column(columnDefinition = "TEXT")
    private String query;

    private Integer type;

}
