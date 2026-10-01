package com.pos.supermarket_pos_backend.controller;


import com.pos.supermarket_pos_backend.model.Category;
import com.pos.supermarket_pos_backend.repository.CategoryRepository;
import com.pos.supermarket_pos_backend.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;

    @PostMapping
    public Category create(@RequestBody Category category){
        return categoryService.create(category);
    }
    @GetMapping
    public List<Category> getAll(){

        return categoryService.getAll();
    }
    @GetMapping("/{id}")
    public Category getById( @PathVariable Long id){
        return categoryService.getById(id);
    }

}
