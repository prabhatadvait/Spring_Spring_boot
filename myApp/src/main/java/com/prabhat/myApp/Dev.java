package com.prabhat.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // this says this is the class i have to manage, this will create the object in the container
public class Dev {

    //@Autowired // this says i have create object of Dev but Dev is dependent on Laptop so, let me connect those two
    // this @Autowired is  called as field Injection.
//    private Laptop  laptop;  // This is Laptop reference and , laptop is instance variable that is bydefault it get null


    // This is constructor Injection
//    public Dev(Laptop laptop){
//        this.laptop = laptop;
//    }

//    //Setter Injection
//    @Autowired
//    public void setLaptop(Laptop laptop){
//        this.laptop = laptop;
//    }
    @Autowired
    private Computer comp;

    public void build(){

        comp.compile();
        System.out.println("Welcome to the Prabhat's World.");
    }
}
