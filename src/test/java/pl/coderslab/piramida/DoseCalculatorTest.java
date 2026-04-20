package pl.coderslab.piramida;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoseCalculatorTest {
    @Test
    void getDoseTest() {
        // Sample patient data
        double adultDose = 60.0; // Maximum dose for adults in milligrams
        double childAge = 3.0; // Child's age in years

// Calculating the corrected dose for the child
        double correctedDose = DoseCalculator.findDose(childAge, adultDose);

        assertEquals(4.166, correctedDose);
    }
    private final double DELTA = 0.001; // Delta dla porównywania liczb zmiennoprzecinkowych

    @Test
    public void testCalculateYoungDoseForInfant() {
        DoseCalculator doseCalculator = new DoseCalculator();
        double adultDose = 50.0;
        double childAge = 1.0;

        double result = doseCalculator.calculateYoungDose(adultDose, childAge);

        // Oczekiwany wynik: 50 * (1 / (1 + 12)) ≈ 4.166
        assertEquals(4.166, result, DELTA);
    }

    @Test
    public void testCalculateYoungDoseForToddler() {
        DoseCalculator doseCalculator = new DoseCalculator();
        double adultDose = 60.0;
        double childAge = 3.0;

        double result = doseCalculator.calculateYoungDose(adultDose, childAge);

        // Oczekiwany wynik: 60 * (3 / (3 + 12)) ≈ 13.846
        assertEquals(13.846, result, DELTA);
    }

    @Test
    public void testCalculateYoungDoseForPreTeen() {
        DoseCalculator doseCalculator = new DoseCalculator();
        double adultDose = 70.0;
        double childAge = 9.0;

        double result = doseCalculator.calculateYoungDose(adultDose, childAge);

        // Oczekiwany wynik: 70 * (9 / (9 + 12)) ≈ 26.25
        assertEquals(26.25, result, DELTA);
    }

    @Test
    public void testCalculateYoungDoseForTeenager() {
        DoseCalculator doseCalculator = new DoseCalculator();
        double adultDose = 80.0;
        double childAge = 16.0;

        double result = doseCalculator.calculateYoungDose(adultDose, childAge);

        // Oczekiwany wynik: 80 * (16 / (16 + 12)) ≈ 36.363
        assertEquals(36.363, result, DELTA);
    }

    @Test
    public void testCalculateClark() {
        double adultDose = 200.0;
        double childWeight = 18.0;

        double result = DoseCalculator.calculateClark(adultDose, childWeight);

        assertEquals(52.941, result, DELTA);
    }

}