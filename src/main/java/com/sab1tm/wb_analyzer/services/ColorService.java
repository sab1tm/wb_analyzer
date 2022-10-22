package com.sab1tm.wb_analyzer.services;

import com.sab1tm.wb_analyzer.data.dictionary.ColorEntity;
import com.sab1tm.wb_analyzer.reposities.ColorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ColorService {

    private final ColorRepository repository;

    public ColorEntity save(ColorEntity entity) {
        return repository.save(entity);
    }

}
