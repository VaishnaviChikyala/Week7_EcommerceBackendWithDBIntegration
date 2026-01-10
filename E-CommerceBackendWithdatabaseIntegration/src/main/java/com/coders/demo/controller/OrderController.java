package com.coders.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coders.demo.entity.Order;
import com.coders.demo.entity.User;
import com.coders.demo.service.OrderService;

import lombok.RequiredArgsConstructor;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
public class OrderController {
private final OrderService orderService = new OrderService();


@PostMapping
public Order placeOrder(@RequestBody User user,
@RequestParam double total) {
return orderService.placeOrder(user, total);
}
}
