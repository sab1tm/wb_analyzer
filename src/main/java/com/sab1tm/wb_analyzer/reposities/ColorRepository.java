package com.sab1tm.wb_analyzer.reposities;

import com.sab1tm.wb_analyzer.data.dictionary.ColorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColorRepository extends JpaRepository<ColorEntity, Long> {
}
