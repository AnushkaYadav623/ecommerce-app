package com.ecommerce.ecommerce_backend.service;


import com.ecommerce.ecommerce_backend.model.Order;
import com.ecommerce.ecommerce_backend.repository.OrderRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderService {
    private final OrderRepository repo;

    
    public OrderService(OrderRepository repo){
        this.repo = repo;
    }

    public Order save(Order order){
        return repo.save(order);
    }

    public List<Order> getAll(){
        return repo.findAll();
    }
}