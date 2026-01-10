package com.coders.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coders.demo.entity.Cart;

public interface CartRepository  extends JpaRepository<Cart, Long>{

}
