package com.example.Assessment_7.repository;

import com.example.Assessment_7.models.ToDoEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TodoRepository extends JpaRepository<ToDoEmployee,Integer> {
    List<ToDoEmployee> findByEmployeeEmpId(int empId);
}
