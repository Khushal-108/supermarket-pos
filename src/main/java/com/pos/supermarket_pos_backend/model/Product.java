package com.pos.supermarket_pos_backend.model;


import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name = "products")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,unique = true)
    private String barcode;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private BigDecimal price;
    @Column(nullable = false, precision = 12, scale = 2)
    private Integer stockQuantity;
    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;

}
