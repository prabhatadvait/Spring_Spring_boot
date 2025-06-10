package com.prabhat.SpringSecEx.service;

import com.prabhat.SpringSecEx.model.UserPrincipal;
import com.prabhat.SpringSecEx.model.Users;
import com.prabhat.SpringSecEx.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{

        Users user =   repo.findByUsername(username);

        if(user == null){
            System.out.println("User not found");
            throw new UsernameNotFoundException("user not found");
        }

        return new UserPrincipal(user);
    }
}

// Now , we have to create the UsserDetails instance but this is interface so we will create a class in model called
// UserPrincipal
