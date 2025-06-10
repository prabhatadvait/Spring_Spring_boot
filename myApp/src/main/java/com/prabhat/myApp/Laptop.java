package com.prabhat.myApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component // telling springboot to create object of this class
// challenge is how to connect the this Laptop to Dev.
// 1. one way is to use Application context into the Dev to connect Laptop.java to it
// 2. Use @Autowired in Dev to connect the dev to the Laptop , this is field injection
// 3. We can use Constructor Injection also
@Primary
public class Laptop implements Computer {

    public void compile(){
        System.out.println("Compiling with 404 bugs");
    }
}
