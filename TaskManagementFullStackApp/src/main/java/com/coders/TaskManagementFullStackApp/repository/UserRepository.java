package com.coders.TaskManagementFullStackApp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;

import com.coders.TaskManagementFullStackApp.entity.Task;

public interface UserRepository  extends JpaRepository<User,Long> {
	Optional<User> findByUsername(String username);
	}


	
	


