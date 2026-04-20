package pl.coderslab.piramida;

public class DoseCalculator {

    public static double findDose(double age, double adultDose) {
        return adultDose*(age/(age+12));
    }

    public double calculateYoungDose(double adultDose, double childAgeInYears) {
        // Calculating the corrected dose for the child
        double correctedDose = adultDose * (childAgeInYears / (childAgeInYears +  12));

        return correctedDose;
    }

    public static double calculateClark(double adultDose, double childWeight) {
        return (adultDose*childWeight)/68;
    }

}
