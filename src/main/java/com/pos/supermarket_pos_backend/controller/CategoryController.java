package com.pos.supermarket_pos_backend.controller;


import com.pos.supermarket_pos_backend.model.Category;
import com.pos.supermarket_pos_backend.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryRepository categoryRepository;

    @PostMapping
    public Category create(@RequestBody Category category){
        return categoryRepository.save(category);
    }
    @GetMapping
    public List<Category> getAll(){
        return categoryRepository.findAll();
    }

}
