package com.coders.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coders.demo.entity.Order;

public interface OrderRepository  extends JpaRepository<Order, Long>{

}
