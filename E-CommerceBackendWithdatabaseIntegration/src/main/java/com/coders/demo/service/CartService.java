package com.coders.demo.service;

import org.springframework.stereotype.Service;

import com.coders.demo.entity.Cart;
import com.coders.demo.entity.CartItem;
import com.coders.demo.entity.Product;
import com.coders.demo.repository.CartItemRepository;
import com.coders.demo.repository.CartRepository;
import com.coders.demo.repository.ProductRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional
public class CartService {
private final CartRepository cartRepo = null;
private final CartItemRepository itemRepo = null;
private final ProductRepository productRepo = null;


public void addToCart(Long cartId, Long productId, int qty) {
Cart cart = cartRepo.findById(cartId).orElseThrow();
Product   product = productRepo.findById(productId).orElseThrow();


CartItem item = new CartItem();
item.setCart(cart);
item.setProduct(product);
item.setQuantity(qty);


itemRepo.save(item);
}
}