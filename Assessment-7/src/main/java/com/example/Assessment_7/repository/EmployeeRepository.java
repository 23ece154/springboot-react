package com.example.Assessment_7.repository;

import com.example.Assessment_7.models.EmployeeModels;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<EmployeeModels,Integer> {
    List<EmployeeModels> findByRole(String role);
}
