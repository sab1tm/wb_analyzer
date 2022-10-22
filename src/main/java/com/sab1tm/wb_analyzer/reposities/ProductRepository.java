package com.sab1tm.wb_analyzer.reposities;

import com.sab1tm.wb_analyzer.data.product.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
