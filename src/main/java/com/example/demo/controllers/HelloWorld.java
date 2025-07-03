package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
@RestController
public class HelloWorld {
    @GetMapping("/hello")
    public String hello(){
        System.out.println("Hello world");
        return "Hello world this is universe";
    }
}
