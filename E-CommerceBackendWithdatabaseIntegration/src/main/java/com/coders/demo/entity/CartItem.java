package com.coders.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
//@Table(name="ecommerce_db")
@Data
public class CartItem {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;


@ManyToOne
private Cart cart;


@ManyToOne
private Product product;


private Integer quantity;


public void setCart(Cart cart2) {
	// TODO Auto-generated method stub
	
}


public void setProduct(Product product2) {
	// TODO Auto-generated method stub
	
}


public void setQuantity(int qty) {
	// TODO Auto-generated method stub
	
}
}
