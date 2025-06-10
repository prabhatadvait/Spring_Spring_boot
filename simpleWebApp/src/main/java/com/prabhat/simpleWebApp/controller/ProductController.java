package com.prabhat.simpleWebApp.controller;

import com.prabhat.simpleWebApp.model.Product;
import com.prabhat.simpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts(); // this getProducts() should be in ProductService
    }


    // Below method is created to get the data in postman by using prodId ,localhost:8080/products/102
    @GetMapping ("/products/{prodId}") // {prodId} should match with int prodId so we have used @PathVariable
    public Product getProductById(@PathVariable int prodId){
        return service.getProductById(prodId);
    }

    //to add the data that is from client side we are going to send the json
    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod){ // but to save the data we need to use @RequestBody
//        System.out.println(prod); // this was to just check
        service.addProduct(prod);
    }

    //To update any data (that is put)
    @PutMapping("/products")
    public void updateProduct(@RequestBody Product prod){
        System.out.println(prod);
        service.updateProduct(prod);
    }

    //To delete the data
    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
        service.deleteProduct(prodId);
    }
}
