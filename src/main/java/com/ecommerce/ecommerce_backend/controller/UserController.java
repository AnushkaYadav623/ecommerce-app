package com.ecommerce.ecommerce_backend.controller;

import com.ecommerce.ecommerce_backend.model.User;
import com.ecommerce.ecommerce_backend.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*")
public class UserController {

    private final UserService service;

    public UserController(UserService service){
        this.service = service;
    }

    @PostMapping
    public User create(@RequestBody User user){
        return service.save(user);
    }

    @GetMapping
    public List<User> getAll(){
        return service.getAll();
    }
}
