package com.coders.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coders.demo.entity.Product;
import com.coders.demo.service.ProductService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {
private final ProductService productService = new ProductService();


@PostMapping
public Product add(@RequestBody Product product) {
return productService.save(product);
}


@GetMapping
public List<Product> list() {
return productService.getAll();
}
}