package com.rods.todolist.controller;


import com.rods.todolist.entity.Task;
import com.rods.todolist.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task-manager")
public class TaskController {

    private TaskService taskService;
    public TaskController(TaskService taskService){
        this.taskService = taskService;
    }

    @GetMapping("/list-tasks")
    private List<Task> listTasks()
    {
        return taskService.listTasks();
    }

    @PostMapping("/create-task")
    private void createTask(@RequestBody Task task){
        taskService.createTask(task);
    }
}
