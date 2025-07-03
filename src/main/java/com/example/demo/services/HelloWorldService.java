package com.example.demo.services;


import com.example.demo.models.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class HelloWorldService {

    List<Student> emp = new ArrayList<>(
    Arrays.asList(new Student(1,"Karthika","AI",234)));

    public List<Student> getEmp() {
//        return "hello world";
        return emp;
    }
    public String postmethod(){
        return "this is post method";
    }
    public String putmethod(){
        return "this is put method";
    }
    public String deletemethod(){
        return "this is delete method";
    }
}
