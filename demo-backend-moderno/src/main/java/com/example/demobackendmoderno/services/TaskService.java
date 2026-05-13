package com.example.demobackendmoderno.services;

import com.example.demobackendmoderno.entities.Task;
import com.example.demobackendmoderno.repositories.TaskRepository;

import java.util.List;

public class TaskService {
    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public List<Task> getAllTasks() {
        return repository.findAll();
    }
}
