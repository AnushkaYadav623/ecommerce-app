package com.ecommerce.ecommerce_backend.controller;

import com.ecommerce.ecommerce_backend.model.Order;
import com.ecommerce.ecommerce_backend.service.OrderService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/orders")
@CrossOrigin(origins = "*")
public class OrderController {

    private final OrderService service;

    
    public OrderController(OrderService service){
        this.service = service;
    }

    @PostMapping
    public Order create(@RequestBody Order order){
        return service.save(order);
    }

    @GetMapping
    public List<Order> getAll(){
        return service.getAll();
    }
}