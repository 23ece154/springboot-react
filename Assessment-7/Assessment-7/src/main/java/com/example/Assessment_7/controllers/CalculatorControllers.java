package com.example.Assessment_7.controllers;


import com.example.Assessment_7.models.Calculator;
import com.example.Assessment_7.services.CalculatorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calc")
public class CalculatorControllers {

    @Autowired
    CalculatorServices calculatorService;

    @PostMapping("/add")
    public int add(@RequestBody Calculator calculator) {
        return calculatorService.add(calculator.getNum1(), calculator.getNum2());
    }

    @PostMapping("/sub")
    public int sub(@RequestBody Calculator calculator) {
        return calculatorService.sub(calculator.getNum1(), calculator.getNum2());
    }

    @PostMapping("/mul")
    public int mul(@RequestBody Calculator calculator) {
        return calculatorService.mul(calculator.getNum1(), calculator.getNum2());
    }

    @PostMapping("/div")
    public int div(@RequestBody Calculator calculator) {
        return calculatorService.div(calculator.getNum1(), calculator.getNum2());
    }
}