package com.pos.supermarket_pos_backend.controller;

import com.pos.supermarket_pos_backend.model.Product;
import com.pos.supermarket_pos_backend.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.security.Provider;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public List<Product> getAll(){
        return productService.getAll();
    }
    @PostMapping
    public Product create(@RequestBody Product product){
        return productService.create(product);
    }
    @GetMapping("/{id}")
    public Product getById(@PathVariable Long id){
        return productService.getById(id);
    }

}
