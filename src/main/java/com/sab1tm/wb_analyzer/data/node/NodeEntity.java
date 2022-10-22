package com.sab1tm.wb_analyzer.data.node;

import com.sab1tm.wb_analyzer.data.base.BaseNodeEntity;
import com.sab1tm.wb_analyzer.data.product.ProductEntity;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "nodes")
@Data
public class NodeEntity extends BaseNodeEntity {

    @OneToMany(fetch = FetchType.EAGER, orphanRemoval = true)
    private List<ProductEntity> products;

}
