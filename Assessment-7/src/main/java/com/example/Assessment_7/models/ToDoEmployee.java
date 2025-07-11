package com.example.Assessment_7.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ToDoEmployee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empId;
    private String task;
    private boolean completed;
    @ManyToOne
    @JoinColumn(name = "employee_emp_id")
    private EmployeeModels employee;

}
