package com.sab1tm.wb_analyzer.reposities;

import com.sab1tm.wb_analyzer.data.menu.MenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<MenuEntity, Long> {
}
