package com.coders.demo.service;

import org.springframework.stereotype.Service;

import com.coders.demo.entity.Order;
import com.coders.demo.entity.User;
import com.coders.demo.repository.CartItemRepository;
import com.coders.demo.repository.OrderRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional
public class OrderService {
private final OrderRepository orderRepo = null;
private final CartItemRepository cartItemRepo = null;


public Order placeOrder(User user, double total) {
Order order = new Order();
order.setUser(user);
order.setTotalAmount(total);
order.setStatus("CREATED");
return orderRepo.save(order);
}
}
