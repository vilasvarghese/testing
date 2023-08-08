package com.junit4;

import org.junit.Test;
import static org.junit.Assert.*;


public class CalculatorTest {

    @Test
    public void testAdd() {
        assertEquals(15, Calculator.add(10, 5));
        assertEquals(-3, Calculator.add(-5, 2));
    }

    @Test
    public void testSubtract() {
        assertEquals(5, Calculator.subtract(10, 5));
        assertEquals(7, Calculator.subtract(5, -2));
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, Calculator.divide(10, 5), 0.001);
        try {
            Calculator.divide(10, 0);
            fail("Expected ArithmeticException was not thrown.");
        } catch (ArithmeticException e) {
            // Expected exception
        }
    }

    @Test
    public void testMultiply() {
        assertEquals(50, Calculator.multiply(10, 5));
        assertEquals(-10, Calculator.multiply(5, -2));
    }

}
