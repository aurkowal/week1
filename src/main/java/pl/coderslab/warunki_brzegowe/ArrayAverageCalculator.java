package pl.coderslab.warunki_brzegowe;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ArrayAverageCalculator {

    public static double calculateAverage(int[] array) {
        double sum = 0;
        if (array.length == 0) {
            return 0;
        }
        for (int element : array) {
            sum += element;
        }
        return BigDecimal.valueOf(sum/array.length).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

}
