package com.example.demo.services;

import com.example.demo.models.Employee;
import com.example.demo.models.Student;
import com.example.demo.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {
//    List<Employee> emp1 = new ArrayList<>(
//            Arrays.asList(new Employee(1,"Karthika","manager")));

    @Autowired
    EmployeeRepo empRepo;
    public List<Employee> getEmp() {
        return empRepo.findAll();
    }

    public Employee getMethodById(int empId){
        return empRepo.findById(empId).orElse(new Employee());
    }

    public List<Employee> getMethodByrole(String jobrole) {
        return empRepo.findByjobrole(jobrole);
    }

    public String addEmployee(Employee employee){
        empRepo.save(employee);
        return "Employee added successfully!!!!";
    }
    public String updateEmployee(Employee employee){

        empRepo.save(employee);
        return "Employee updated successfully";

    }

    public String deleteMethodById(int id){
        empRepo.deleteById(id);
        return "deleted ";
    }

    public String deletealldatas() {
        empRepo.deleteAll();
        return "deleted all datas";
    }
}
