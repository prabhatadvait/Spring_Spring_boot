package com.prabhat.simpleWebApp.service;

import com.prabhat.simpleWebApp.model.Product;
import com.prabhat.simpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

//    These changes are after JPA
    //connecting to the Repository ,
    @Autowired
    ProductRepo repo;

    public List<Product> getProducts(){
        return repo.findAll();
    }

    // Below method is created to get the data in postman by using prodId ,localhost:8080/products/102
    public Product getProductById(int proId){
        return repo.findById(proId).orElse(new Product());
    }

    // to add the data that is from client side we are going to send the json
    public void addProduct(Product prod){
        repo.save(prod);
    }

    //To update any data (that is put)
    public void updateProduct(Product prod) {
        repo.save(prod);
    }

    // To delete the data
    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
    }

//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(101,"IPhone",50000),
//            new Product(102,"Samsung",70000),
//            new Product(103,"Shure-Mic",10000)));

//    public List<Product> getProducts() {
//        return getProducts();
//    }


    // Below method is created to get the data in postman by using prodId ,localhost:8080/products/102
//    public Product getProductById(int prodId) {
//        return products.stream() // Stream api is used to process the collection of objects.
//                .filter(p-> p.getProdId()== prodId) // filter prodId that i am looking for.
//                .findFirst() // stop at only one finding
//                .orElse(new Product(100,"No Item",0)); // or else return this as it was not in data
//    }
//
//    // to add the data that is from client side we are going to send the json
//    public void addProduct(Product prod){
//        products.add(prod);
//    }

    //To update any data (that is put)
//    public void updateProduct(Product prod) {
//        int index =0;
//        for(int i=0;i< products.size();i++){
//            if(products.get(i).getProdId() == prod.getProdId())
//                index=i;
//        }
//        products.set(index,prod);
//    }


//    public void deleteProduct(int prodId) {
//        int index =0;
//        for(int i=0;i< products.size();i++){
//            if(products.get(i).getProdId() == prodId)
//                index=i;
//        }
//        products.remove(index);
//    }
}
