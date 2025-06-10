package com.prabhat.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller // That is HomeController is Controller
@RestController
public class HomeController {

    @RequestMapping("/") // This is request and looking for page(layout)
    public String greet(){
        return "Welcome to my world!!";
    }

    @RequestMapping("/about")
    public String about(){
        return "We Don't Teach , We Educate!";
    }
}
