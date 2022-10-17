package com.sab1tm.wb_analyzer.reposities;

import com.sab1tm.wb_analyzer.data.node.NodeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NodeRepository extends JpaRepository<NodeEntity, Long> {
}
