package com.coders.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coders.demo.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
