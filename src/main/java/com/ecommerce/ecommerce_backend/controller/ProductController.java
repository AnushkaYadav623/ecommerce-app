package com.ecommerce.ecommerce_backend.controller;


import com.ecommerce.ecommerce_backend.model.Product;
import com.ecommerce.ecommerce_backend.service.ProductService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "*")
public class ProductController {

    private final ProductService service;

    
    public ProductController(ProductService service){
        this.service = service;
    }

    @PostMapping
    public Product create(@RequestBody Product product){
        return service.save(product);
    }

    @GetMapping
    public List<Product> getAll(){
        return service.getAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
}