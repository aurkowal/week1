package pl.coderslab.parametryzowanie;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class TextFormatterTest {
    @ParameterizedTest
    @CsvSource({
            "'    hello',          'hello'",
            "'hello    ',          'hello'",
            "'hello  world',       'hello world'",
            "'hello\\tworld',      'hello world'",
            "'hello\\t\\tworld',   'hello world'",
            "'hello\\nworld',      'hello world'",
            "'hello\\n\\nworld',   'hello world'"

    }
    )
    void helloWorldTest(String text, String expectedValue) {
        assertEquals(expectedValue, TextFormatter.format(text));
    }

}