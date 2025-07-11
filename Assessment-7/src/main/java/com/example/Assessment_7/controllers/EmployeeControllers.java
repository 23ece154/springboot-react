package com.example.Assessment_7.controllers;
import com.example.Assessment_7.models.EmployeeModels;
import com.example.Assessment_7.services.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeControllers {
    @Autowired
    private EmployeeServices es;

    @GetMapping
    public ResponseEntity<List<EmployeeModels>> getAllEmployees() {
        List<EmployeeModels> employees = es.getAllEmployees();
        return ResponseEntity.ok(employees);
    }

    @GetMapping("/role/{role}")
    public List<EmployeeModels> getByRole(@PathVariable String role) {
        return es.getEmployeesByRole(role);
    }

    @PostMapping
    public ResponseEntity<EmployeeModels> createEmployee(@RequestBody EmployeeModels employee) {
        EmployeeModels saved = es.saveEmployee(employee);
        return ResponseEntity.ok(saved);
    }

    @PutMapping("/{empId}")
    public ResponseEntity<EmployeeModels> updateEmployee(@PathVariable int empId, @RequestBody EmployeeModels newEmp) {
        EmployeeModels updated = es.updateEmployee(empId, newEmp);
        return ResponseEntity.ok(updated);
    }
}
