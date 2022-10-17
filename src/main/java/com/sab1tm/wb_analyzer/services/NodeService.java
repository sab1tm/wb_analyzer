package com.sab1tm.wb_analyzer.services;

import com.sab1tm.wb_analyzer.data.node.NodeEntity;
import com.sab1tm.wb_analyzer.reposities.NodeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class NodeService {

    private final NodeRepository repository;

    public NodeEntity save(NodeEntity entity) {
        return repository.save(entity);
    }

    public Optional<NodeEntity> getById(Long id) {
        return repository.findById(id);
    }
}
