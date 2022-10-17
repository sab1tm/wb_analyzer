package com.sab1tm.wb_analyzer.data.menu;

import com.sab1tm.wb_analyzer.data.node.NodeEntity;
import com.sab1tm.wb_analyzer.data.base.BaseEntity;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "menus")
@Data
public class MenuEntity extends BaseEntity {

    @OneToMany
    private List<NodeEntity> nodes;

}
