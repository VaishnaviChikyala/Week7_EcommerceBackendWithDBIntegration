package com.coders.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "orders")
public class Order {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;


@ManyToOne
private User user;


private Double totalAmount;
private String status; // CREATED, PAID, SHIPPED
public void setUser(User user2) {
	// TODO Auto-generated method stub
	
}
public void setTotalAmount(double total) {
	// TODO Auto-generated method stub
	
}
public void setStatus(String string) {
	// TODO Auto-generated method stub
	
}
}
