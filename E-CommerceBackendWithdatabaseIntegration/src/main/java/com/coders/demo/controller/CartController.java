package com.coders.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coders.demo.service.CartService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/cart")
@RequiredArgsConstructor
public class CartController {
private final CartService cartService = new CartService();


@PostMapping("/add")
public String add(@RequestParam Long cartId,
@RequestParam Long productId,
@RequestParam int qty) {
cartService.addToCart(cartId, productId, qty);
return "Item added to cart";
}
}
