package com.sab1tm.wb_analyzer.data.product;

import com.sab1tm.wb_analyzer.data.base.BaseEntity;
import com.sab1tm.wb_analyzer.data.dictionary.ColorEntity;
import com.sab1tm.wb_analyzer.data.dictionary.SizeEntity;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "products")
@Data
public class ProductEntity extends BaseEntity {

    private Integer time;
    private Integer time2;
    private Integer dist;
    private Long root;
    private Integer kindId;
    private Integer subjectId;
    private Integer subjectParentId;
    private String name;
    private String brand;
    private Integer brandId;
    private Integer siteBrandId;
    private Integer sale;
    private Long priceU;
    private Long salePriceU;
    private Long averagePrice;
    private Integer benefit;
    private Integer pics;
    private Integer rating;
    private Integer feedbacks;
    private Boolean isNew;
    @ManyToMany
    private List<ColorEntity> colors;
    @ManyToMany
    private List<SizeEntity> sizes;
    private Boolean diffPrice;

}
