package pl.coderslab.parametryzowanie;

public class TextFormatter {
    public static String format(String text) {
        if (text == null) {
            return null;
        }

        // Usuwanie nadmiaru spacji
        String trimmedText = text.trim();
        // Zamiana znaków nowej linii i tabulacji na spacje
        return trimmedText.replaceAll("[\\r\\n\\t]+", " ");
    }
}