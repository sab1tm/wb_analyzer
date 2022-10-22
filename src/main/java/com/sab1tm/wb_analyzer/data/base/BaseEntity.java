package com.sab1tm.wb_analyzer.data.base;

import lombok.Data;
import org.hibernate.annotations.UpdateTimestamp;

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

}
