package com.pos.supermarket_pos_backend.repository;

import com.pos.supermarket_pos_backend.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {

}
