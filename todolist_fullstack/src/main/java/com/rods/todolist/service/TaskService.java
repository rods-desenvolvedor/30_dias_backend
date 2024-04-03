package com.rods.todolist.service;


import com.rods.todolist.entity.Task;
import com.rods.todolist.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private TaskRepository taskRepository;
    public TaskService(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }

    public List<Task> listTasks()
    {
        return taskRepository.findAll();
    }
    public void createTask(Task task)
    {
        taskRepository.save(task);
    }
    public void updateTask(Task task){
        taskRepository.save(task);
    }
    public void deleteTask(Long id){
        taskRepository.deleteById(id);
    }
}
