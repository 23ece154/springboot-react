package com.example.Assessment_7.controllers;

import com.example.Assessment_7.models.ToDoEmployee;
import com.example.Assessment_7.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/todo")
public class TodoController {
    @Autowired
    private TodoService service;

    @PostMapping("/add")
    public ToDoEmployee createTodo(@RequestBody ToDoEmployee todo) {
        return service.addTodo(todo);
    }

    @GetMapping("/all")
    public List<ToDoEmployee> getAllTodos() {
        return service.getAllTodos();
    }
    @GetMapping("/employee/{empId}")
    public List<ToDoEmployee> getTodos(@PathVariable int empId) {
        return service.getTodosByEmployeeId(empId);
    }
}
