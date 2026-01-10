package com.coders.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coders.demo.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
