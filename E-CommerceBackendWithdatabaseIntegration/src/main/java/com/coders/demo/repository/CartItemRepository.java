package com.coders.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coders.demo.entity.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {

}
