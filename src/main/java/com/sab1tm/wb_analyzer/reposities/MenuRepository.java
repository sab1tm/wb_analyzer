package com.sab1tm.wb_analyzer.reposities;

import com.sab1tm.wb_analyzer.data.menu.MenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MenuRepository extends JpaRepository<MenuEntity, Long> {

    @Query("select m from MenuEntity m order by m.updated")
    List<MenuEntity> findAllOrderByUpdated();

}
