package com.example.daily_task_tracker.model;


import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Task {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private LocalDate dueDate;
    private String priority;
    private boolean completed;
    // getters, setters, constructors
}

