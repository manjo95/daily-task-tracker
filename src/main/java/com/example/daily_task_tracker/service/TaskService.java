package com.example.daily_task_tracker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.daily_task_tracker.model.Task;
import com.example.daily_task_tracker.repository.TaskRepository;

import java.util.List;

@Service
public class TaskService {
    @Autowired private TaskRepository repo;
    public List<Task> getAll() { return repo.findAll(); }
    public Task getOne(Long id) { return repo.findById(id).orElse(null); }
    public Task save(Task t) { return repo.save(t); }
    public void delete(Long id) { repo.deleteById(id); }
}
