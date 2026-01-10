package com.coders.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.coders.demo.entity.Product;
import com.coders.demo.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {
private final ProductRepository productRepository = null;


public Product save(Product product) {
return productRepository.save(product);
}


public List<Product> getAll() {
return productRepository.findAll();
}
}
