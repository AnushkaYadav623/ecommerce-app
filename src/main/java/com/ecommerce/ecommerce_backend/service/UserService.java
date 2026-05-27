package com.ecommerce.ecommerce_backend.service;

import com.ecommerce.ecommerce_backend.model.User;
import com.ecommerce.ecommerce_backend.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public User save(User user){
        return repo.save(user);
    }

    public List<User> getAll(){
        return repo.findAll();
    }
}
