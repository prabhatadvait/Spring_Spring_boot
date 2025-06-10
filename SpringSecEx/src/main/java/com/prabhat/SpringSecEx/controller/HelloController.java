package com.prabhat.SpringSecEx.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String greet(HttpServletRequest request){ // to print the session id we used HttpServlet
        return "Welcome, Prabhat! Here\n" + request.getSession().getId();// request.getSes is for printing the sessionid
    }
}
