package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import com.example.demo.model.Product;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/products")
public class DemoApplication {

    List<Product> productList = new ArrayList<>();

    @GetMapping
    public List<Product> getAllProducts() {
        return productList;
    }

    @PostMapping
    public String addProduct(@RequestBody Product product) {
        productList.add(product);
        return "Product Added Successfully!";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
