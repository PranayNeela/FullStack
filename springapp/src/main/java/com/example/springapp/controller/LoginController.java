package com.example.springapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.model.Login;
import com.example.springapp.service.LoginService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


public class LoginController {

    @Autowired
    private LoginService service;

    @CrossOrigin(origins = "http://localhost:8081")
    @PostMapping("/login")
    public ResponseEntity<Login> createLogin(@RequestBody Login login){
        if(service.Login(login)!=null){
            return ResponseEntity.status(201).body(service.Login(login));
        }
        return ResponseEntity.status(400).build();        
    }


    @CrossOrigin(origins = "http://localhost:8081")
    @GetMapping("/login")
    public ResponseEntity<List<Login>> getAllLogins(){
        if(service.getAllLogins()!=null){
            return ResponseEntity.status(200).body(service.getAllLogins());
        }
        return ResponseEntity.status(404).build();
    }

    
}
