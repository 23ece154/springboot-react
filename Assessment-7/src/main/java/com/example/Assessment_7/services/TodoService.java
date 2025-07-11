package com.example.Assessment_7.services;

import com.example.Assessment_7.models.EmployeeModels;
import com.example.Assessment_7.models.ToDoEmployee;
import com.example.Assessment_7.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TodoService {
    @Autowired
    private TodoRepository repo;

    public ToDoEmployee addTodo(ToDoEmployee todo) {
        return repo.save(todo);
    }

    public List<ToDoEmployee> getAllTodos() {
        return repo.findAll();
    }

    public List<ToDoEmployee> getTodosByEmployeeId(int empId) {
        return repo.findByEmployeeEmpId(empId);
    }
}
