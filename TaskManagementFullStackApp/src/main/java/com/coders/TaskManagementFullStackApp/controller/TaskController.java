package com.coders.TaskManagementFullStackApp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coders.TaskManagementFullStackApp.entity.Task;
import com.coders.TaskManagementFullStackApp.repository.TaskRepository;

@RestController
@RequestMapping("/tasks")
public class TaskController {
private final TaskRepository repo;
public TaskController(TaskRepository repo){this.repo=repo;}


@GetMapping
public List<Task> all(){return repo.findAll();}


@PostMapping
public Task save(@RequestBody Task task){return repo.save(task);}
}

