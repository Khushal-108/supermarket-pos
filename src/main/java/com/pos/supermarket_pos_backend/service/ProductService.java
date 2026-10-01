package com.pos.supermarket_pos_backend.service;


import com.pos.supermarket_pos_backend.model.Category;
import com.pos.supermarket_pos_backend.model.Product;
import com.pos.supermarket_pos_backend.repository.CategoryRepository;
import com.pos.supermarket_pos_backend.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Supplier;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final CategoryService categoryService;
    private final ProductRepository productRepository;
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    public Product create(Product product) {
        if(productRepository.existsByBarcode(product.getBarcode())){
            throw new RuntimeException("Barcode already exist: "+product.getBarcode());
        }
        product.setCategory(categoryService.getById(product.getCategory().getId()));
        return productRepository.save(product);
    }

    public Product getById(Long id) {
        return productRepository.findById(id).orElseThrow(()->new RuntimeException("Product not found: "+id));
    }
}
