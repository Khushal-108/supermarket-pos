package com.pos.supermarket_pos_backend.service;


import com.pos.supermarket_pos_backend.model.Category;
import com.pos.supermarket_pos_backend.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;
    public Category create(Category category) {
        if(categoryRepository.existsByNameIgnoreCase(category.getName())){
            throw new RuntimeException("Category already exists: "+category.getName());
        }
        return categoryRepository.save(category);
    }

    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    public Category getById(Long id) {
        return categoryRepository.findById(id).orElseThrow(()->new RuntimeException("Category not found: "+id));
    }
}
