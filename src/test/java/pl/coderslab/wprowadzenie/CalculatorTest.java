package pl.coderslab.wprowadzenie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAddCalculator() {
        int a = 7;
        int b = 10;
        int result = Calculator.add(a, b);

        assertEquals(17, result);
    }

    @Test
    void testAddBigCalculator() {
        int a = Integer.MAX_VALUE;
        int b = 2;

        int result = Calculator.addBig(a,b);

        assertEquals(2147483649L, result);
    }


    @Test
    void subtract_shouldHandlePositiveNumbers() {
        assertEquals(3, Calculator.subtract(7, 4));
    }

    @Test
    void subtract_shouldReturnNegativeResult() {
        assertEquals(-1, Calculator.subtract(7, 8));
    }

    @Test
    void subtract_shouldHandleNegativeAndPositive() {
        assertEquals(-11, Calculator.subtract(-7, 4));
    }

    @Test
    void subtract_shouldHandleTwoNegativeNumbers() {
        assertEquals(4, Calculator.subtract(-2, -6));
    }


    @Test
    void multiplyTwoPositiveNumbers() {
        assertEquals(12, Calculator.multiply(3,4));
    }

    @Test
    void multiplyTwoNegativeNumbers() {
        assertEquals(12, Calculator.multiply(-3, -4));
    }

    @Test
    void multiplyOneNegativeOnePositiveNumber() {
        assertEquals(-12, Calculator.multiply(3, -4));
    }

    @Test
    void multiplyBy0 () {
        assertEquals(0, Calculator.multiply(0, 9));
    }
}