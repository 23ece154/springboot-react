package com.example.demo.controllers;

import com.example.demo.models.Employee;
import com.example.demo.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
        @Autowired
        private EmployeeService es;

        @PreAuthorize("hasAnyRole('ADMIN','USER')")
        @GetMapping("/")
        //@GetMapping("/emp/hello")
        public List<Employee> hello(){
            return es.getEmp();
        }

        @PreAuthorize("hasAnyRole('ADMIN','USER')")
        @GetMapping("/{empId}")
        public Employee getMethodById(@PathVariable int empId){
            return es.getMethodById(empId);
        }

        @PreAuthorize("hasAnyRole('ADMIN','USER')")
        @GetMapping("/jobrole/{jobrole}")
        public List<Employee> getMethodByrole(@PathVariable String jobrole){
            return es.getMethodByrole(jobrole);
        }

        @PreAuthorize("hasRole('ADMIN')")
        @PutMapping("/{empId}")
        public String putMethod(@PathVariable int empId,@RequestBody Employee employee){
            employee.setEmpId(empId);
            return  es.updateEmployee(employee);
        }

        @PreAuthorize("hasRole('ADMIN')")
        @PostMapping("/")
        public String addEmployee(@RequestBody Employee employee){
            es.addEmployee(employee);
            return "Employee added successfully!!!";
        }


        @PreAuthorize("hasRole('ADMIN')")
        @DeleteMapping("/{empId}")
        public String deleteMapping(@PathVariable int empId) {
            es.deleteMethodById(empId);
            return "Employee deleted successfully";
        }

        @PreAuthorize("hasRole('ADMIN')")
        @DeleteMapping("/")
        public String deletealldatas() {
            es.deletealldatas();
            return "all employees deleted successfully";
        }
    }

