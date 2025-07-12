package com.example.daily_task_tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.daily_task_tracker.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {}

