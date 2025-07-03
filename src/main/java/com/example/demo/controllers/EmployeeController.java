package com.example.demo.controllers;

import com.example.demo.models.Employee;
import com.example.demo.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
        @Autowired
        private EmployeeService es;

        @GetMapping("/emp/hello")
        public List<Employee> hello(){
//        System.out.println("Hello world");
//        return "Hello world this is universe";
            return es.getEmp();
        }

        //post method
        @PostMapping("/emp/hello")
        public String postmethod(){
            return es.postmethod();
        }

        @PutMapping("/emp/hello")
        public String putmethod(){
            return es.putmethod();
        }

        @DeleteMapping("/emp/hello")
        public String deletemethod(){
            return es.deletemethod();
        }
    }

