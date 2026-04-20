package pl.coderslab.warunki_brzegowe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayAverageCalculatorTest {

    @Test
    void givenPositiveNumbers_whenAvgIsCorrect_thenPass() {
        int[] array = {1,4,6,2,7,9,3,1};

        double avg = ArrayAverageCalculator.calculateAverage(array);
        assertEquals(4.13, avg);
    }

    @Test
    void givenNegativeNumbers_whenAvgIsCorrect_thenPass() {
        int[] array = {0,-2,4,-5,2,-1};

        double avg = ArrayAverageCalculator.calculateAverage(array);
        assertEquals(-0.33, avg);
    }

    @Test
    void givenEmpty_whenAvgIsZero_thenPass() {
        int[] array = {};

        double avg = ArrayAverageCalculator.calculateAverage(array);
        assertEquals(0, avg);
    }







}