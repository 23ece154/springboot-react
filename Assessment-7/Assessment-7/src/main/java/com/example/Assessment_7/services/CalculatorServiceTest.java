package com.example.Assessment_7.services;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculatorServiceTest {

    CalculatorServices service = new CalculatorServices();

    @Test
    public void testAdd() {
        assertEquals(15, service.add(10, 5));
    }

    @Test
    public void testSub() {
        assertEquals(5, service.sub(10, 5));
    }

    @Test
    public void testMul() {
        assertEquals(50, service.mul(10, 5));
    }

    @Test
    public void testDiv() {
        assertEquals(2, service.div(10, 5));
    }


}
