package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.Product;
import com.example.springapp.repository.ProductRepo;
import com.example.springapp.repository.UserRepo;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Autowired  
    private UserRepo userService;

    @Autowired
    private UserService service;

    public Product addProduct(Product product) {
        if(service.getUserById(product.getUser().getId()) != null) {
            product.setUser(userService.findById(product.getUser().getId()).orElse(null));
        }
        return productRepo.save(product);
    }

    public Product getProductById(Long id) {
        return productRepo.findById(id).orElse(null);
    }

    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    public void deleteProduct(Long id) {
        productRepo.deleteById(id);
    }

}
