package pl.coderslab.parametryzowanie;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @ParameterizedTest
    @CsvSource({
            "-1, odd",
            "0, zero",
            "1, odd",
            "qwe, even",
            "100, even"
    })
    void checkParity(int number, String expected) {
        assertEquals(expected, Numbers.checkParity(number));
    }

    static Stream<Arguments> getParityArguments() {
        return Stream.of(
                Arguments.of(-1, "odd"),
                Arguments.of(0, "zero"),
                Arguments.of(2, "even")
        );
    }

    @ParameterizedTest
    @MethodSource("getParityArguments")
    void checkParityMethodSource(int number, String expected) {
        assertEquals(expected, Numbers.checkParity(number));
    }


}