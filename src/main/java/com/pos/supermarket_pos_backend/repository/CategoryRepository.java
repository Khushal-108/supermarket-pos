package com.pos.supermarket_pos_backend.repository;

import com.pos.supermarket_pos_backend.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category,Long> {
     boolean existsByNameIgnoreCase(String name);
}
