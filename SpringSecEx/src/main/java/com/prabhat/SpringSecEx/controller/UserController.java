package com.prabhat.SpringSecEx.controller;

import com.prabhat.SpringSecEx.model.Users;
import com.prabhat.SpringSecEx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/register")
    public Users register(@RequestBody Users user){
        return service.register(user);
    }


    // This is for JWT
    @PostMapping("/login")
    public String login(@RequestBody Users user){
        return service.verifty(user);
    }

}
