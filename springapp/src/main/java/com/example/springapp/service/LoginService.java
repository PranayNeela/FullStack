package com.example.springapp.service;

import  com.example.springapp.model.Login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.repository.LoginRepo;




@Service
public class LoginService {

    @Autowired
    private LoginRepo lRepo;

    public Login Login(Login login){
        return lRepo.save(login);
    }

    public List<Login> getAllLogins(){
        return lRepo.findAll();
    }
}
