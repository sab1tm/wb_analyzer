package com.sab1tm.wb_analyzer.data.product;

import com.sab1tm.wb_analyzer.data.base.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "products")
@Data
public class ProductEntity extends BaseEntity {
}
