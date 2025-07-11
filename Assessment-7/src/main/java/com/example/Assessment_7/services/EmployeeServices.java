package com.example.Assessment_7.services;
import com.example.Assessment_7.models.EmployeeModels;
import com.example.Assessment_7.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServices {
    @Autowired
    private EmployeeRepository repository;

    public EmployeeModels updateEmployee(int empId, EmployeeModels newEmp) {
        return repository.findById(empId).map(emp -> {
            emp.setName(newEmp.getName());
            emp.setRole(newEmp.getRole());
            return repository.save(emp);
        }).orElseThrow(() -> new RuntimeException("Employee not found"));
    }

    public EmployeeModels saveEmployee(EmployeeModels employee) {
        return repository.save(employee);
    }

    public List<EmployeeModels> getEmployeesByRole(String role) {
        return repository.findByRole(role);
    }

    public List<EmployeeModels> getAllEmployees() {
        return repository.findAll();
    }
}
