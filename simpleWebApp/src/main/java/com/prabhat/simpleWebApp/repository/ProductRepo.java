package com.prabhat.simpleWebApp.repository;

import com.prabhat.simpleWebApp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> { // Here, the JpaRepository takes two thing class and primary key

}
