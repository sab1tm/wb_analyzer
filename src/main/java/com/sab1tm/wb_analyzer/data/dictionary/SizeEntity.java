package com.sab1tm.wb_analyzer.data.dictionary;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "sizes")
@Data
public class SizeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Long optionId;
    private String origName;
    private Integer rank;

}
