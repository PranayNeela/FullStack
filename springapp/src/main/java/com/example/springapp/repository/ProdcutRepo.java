package com.example.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springapp.model.Product;

public interface ProdcutRepo extends JpaRepository<Product, Long> {
    // This interface will automatically provide CRUD operations for the Product entity
    // You can add custom query methods here if needed

}
