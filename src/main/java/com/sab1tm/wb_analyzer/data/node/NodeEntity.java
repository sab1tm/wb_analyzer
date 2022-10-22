package com.sab1tm.wb_analyzer.data.node;

import com.sab1tm.wb_analyzer.data.base.BaseNodeEntity;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "nodes")
@Data
public class NodeEntity extends BaseNodeEntity {

}
