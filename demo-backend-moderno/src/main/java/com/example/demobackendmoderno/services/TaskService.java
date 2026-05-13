package com.example.demobackendmoderno.services;

import com.example.demobackendmoderno.entities.TaskEntity;
import com.example.demobackendmoderno.repositories.TaskRepository;

import java.util.List;

public class TaskService {
    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public List<TaskEntity> getAllTasks() {
        return repository.findAll();
    }
}
