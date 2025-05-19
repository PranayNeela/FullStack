package com.example.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springapp.model.Login;

public interface LoginRepo extends JpaRepository<Login, Long> {
    // Custom query methods can be defined here if needed
    // For example, you can add a method to find a user by username or email
    // Optional<Login> findByUsername(String username);
    // Optional<Login> findByEmail(String email);
    
}
