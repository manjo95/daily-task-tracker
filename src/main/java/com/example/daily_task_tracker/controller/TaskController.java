package com.example.daily_task_tracker.controller;

import com.example.daily_task_tracker.model.Task;
import com.example.daily_task_tracker.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class TaskController {
    @Autowired private TaskService service;

    @GetMapping
    public String viewHome(Model model) {
        model.addAttribute("tasks", service.getAll());
        return "index";
    }

    @GetMapping("/new")
    public String showNewForm(Model model) {
        model.addAttribute("task", new Task());
        return "create-task";
    }

    @PostMapping("/save")
    public String saveTask(@ModelAttribute Task task) {
        service.save(task);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        model.addAttribute("task", service.getOne(id));
        return "edit-task";
    }

    @GetMapping("/delete/{id}")
    public String deleteTask(@PathVariable Long id) {
        service.delete(id);
        return "redirect:/";
    }
}
