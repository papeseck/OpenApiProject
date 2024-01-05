package com.groupeisi.taskmanagerbackend.controller;

import com.groupeisi.taskmanagerbackend.model.Task;
import com.groupeisi.taskmanagerbackend.service.TaskService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
@Api(tags = "Task Controller", description = "Operations pertaining to tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @ApiOperation("Get all tasks")
    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @ApiOperation("Get a task by ID")
    @GetMapping("/{taskId}")
    public Task getTaskById(@PathVariable Long taskId) {
        return taskService.getTaskById(taskId);
    }

    @ApiOperation("Create a new task")
    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }

    @ApiOperation("Update a task by ID")
    @PutMapping("/{taskId}")
    public Task updateTask(@PathVariable Long taskId, @RequestBody Task task) {
        return taskService.updateTask(taskId, task);
    }

    @ApiOperation("Delete a task by ID")
    @DeleteMapping("/{taskId}")
    public void deleteTask(@PathVariable Long taskId) {
        taskService.deleteTask(taskId);
    }
}
