package com.sab1tm.wb_analyzer.services;

import com.sab1tm.wb_analyzer.data.dictionary.SizeEntity;
import com.sab1tm.wb_analyzer.reposities.SizeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SizeService {

    private final SizeRepository repository;

    public SizeEntity save(SizeEntity entity) {
        return repository.save(entity);
    }

}
