package com.coders.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coders.demo.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
