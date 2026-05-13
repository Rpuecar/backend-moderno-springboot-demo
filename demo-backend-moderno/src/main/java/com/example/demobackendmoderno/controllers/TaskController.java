package com.example.demobackendmoderno.controllers;

import com.example.demobackendmoderno.entities.Task;
import com.example.demobackendmoderno.services.TaskService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    // Listar todas las tareas
    @GetMapping
    public List<Task> getAllTasks() {
        return service.getAllTasks();
    }

    // Obtener una tarea por ID
    @GetMapping("/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable Long id) {
        Task task = service.getTaskById(id);
        return task != null ?
                ResponseEntity.ok(task) :
                ResponseEntity.notFound().build();
    }

    // Crear una nueva tarea
    @PostMapping
    public ResponseEntity<Task> createTask(@RequestBody Task task) {
        Task createdTask = service.createTask(task);
        return ResponseEntity.ok(createdTask);
    }

    // Modificar una tarea existente
    @PutMapping("/{id}")
    public ResponseEntity<Task> updateTask(@PathVariable Long id, @RequestBody Task taskDetails) {
        Task updatedTask = service.updateTask(id, taskDetails);
        return ResponseEntity.ok(updatedTask);
    }

    // Eliminar una tarea
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable Long id) {
        service.deleteTask(id);
        return ResponseEntity.noContent().build();
    }
}