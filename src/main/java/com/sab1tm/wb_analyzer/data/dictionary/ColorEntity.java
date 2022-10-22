package com.sab1tm.wb_analyzer.data.dictionary;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "colors")
@Data
public class ColorEntity {

    @Id
    private Long id;
    private String name;

}
