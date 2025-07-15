package com.example.Assessment_7.controllers;

import com.example.Assessment_7.models.Calculator;
import com.example.Assessment_7.services.CalculatorServices;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorControllersTest {
    CalculatorServices service = new CalculatorServices();
    CalculatorControllers controller = new CalculatorControllers();

    public CalculatorControllersTest() {
        controller.calculatorService = service;
    }

    @Test
    public void testAdd() {
        Calculator calc = new Calculator(10, 5);
        int result = controller.add(calc);
        assertEquals(15, result);
    }

    @Test
    public void testSub() {
        Calculator calc = new Calculator(10, 5);
        int result = controller.sub(calc);
        assertEquals(5, result);
    }

    @Test
    public void testMul() {
        Calculator calc = new Calculator(10, 5);
        int result = controller.mul(calc);
        assertEquals(50, result);
    }

    @Test
    public void testDiv() {
        Calculator calc = new Calculator(10, 5);
        int result = controller.div(calc);
        assertEquals(2, result);
    }

}

