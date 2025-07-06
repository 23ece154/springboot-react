package com.example.demo.controllers;

import com.example.demo.models.Employee;
import com.example.demo.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp/hello/hi")
public class EmployeeController {
        @Autowired
        private EmployeeService es;

        @GetMapping
        //@GetMapping("/emp/hello")
        public List<Employee> hello(){
//        System.out.println("Hello world");
//        return "Hello world this is universe";
            return es.getEmp();
        }

        @GetMapping("/{empId}")
        public Employee hello(@PathVariable int empId){
//        System.out.println("Hello world");
//        return "Hello world this is universe";
          return es.getEmp(empId);
    }

        //post method
        @PostMapping
        //@PostMapping("/emp/hello")
        public String postmethod(@RequestBody Employee employee){
            //Employee employee = new Employee(1,"karthi","developer");
            return es.postmethod(employee);
        }

        @PutMapping("/{empId}")
        //@PutMapping("/emp/hello")
        public String putmethod(@RequestBody Employee employee){
            return es.putmethod(employee);
        }

        @DeleteMapping("/{empId}")
        //@DeleteMapping("/emp/hello")
        public String deleteEmpByIt(@PathVariable int empId){
            return es.deleteEmpById(empId);
        }
    }

