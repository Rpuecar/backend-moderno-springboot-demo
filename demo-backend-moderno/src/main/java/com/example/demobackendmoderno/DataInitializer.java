package com.example.demobackendmoderno;

import com.example.demobackendmoderno.entities.Task;
import com.example.demobackendmoderno.repositories.TaskRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final TaskRepository taskRepository;

    // Constructor que inyecta TaskRepository
    public DataInitializer(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Verifica si la base de datos está vacía
        if (taskRepository.count() == 0) {
            // Crea tareas iniciales
            Task task1 = new Task();
            task1.setTitle("Tarea inicial 1");
            task1.setDescription("Descripción de la tarea 1");
            task1.setCompleted(false);

            Task task2 = new Task();
            task2.setTitle("Tarea inicial 2");
            task2.setDescription("Descripción de la tarea 2");
            task2.setCompleted(true);

            // Guarda las tareas en la base de datos
            taskRepository.save(task1);
            taskRepository.save(task2);

            // Comprobación que los datos se han cargado
            System.out.println("✅ Datos iniciales creados correctamente.");
        }
    }
}