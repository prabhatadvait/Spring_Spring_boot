package com.prabhat.SpringSecEx.repo;

import com.prabhat.SpringSecEx.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users,Integer> {

    Users findByUsername(String username);


}

//Encryption
//plain -> hash1 -> hash2 to do hashing multiple times , we use bcrypt.
