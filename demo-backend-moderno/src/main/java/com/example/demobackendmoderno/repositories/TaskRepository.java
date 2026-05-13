package com.example.demobackendmoderno.repositories;

import com.example.demobackendmoderno.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}