package pl.coderslab.wprowadzenie;

public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int addBig(int a, int b) {
        long result = (long) a + (long) b;

        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            throw new ArithmeticException("Przepełnienie int");
        }
        return (int) result;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}
