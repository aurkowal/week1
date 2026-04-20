package pl.coderslab.parametryzowanie;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.DayOfWeek;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class DateUtilsTest {

    private static Stream<Arguments> daysProvider() {
        return Stream.of(
                Arguments.of("MONDAY" , false),
                Arguments.of("TUESDAY" , false),
                Arguments.of("WEDNESDAY" , false),
                Arguments.of("THURSDAY" , false),
                Arguments.of("FRIDAY" , false),
                Arguments.of("SATURDAY" , true),
                Arguments.of("SUNDAY" , true)
        );
    }

    @ParameterizedTest
    @MethodSource("daysProvider")
    public void givenDays_whenIsWeekend_thenReturnTrue(DayOfWeek dayOfWeek, boolean expectedValue) {
        assertEquals(expectedValue, DateUtils.isWeekend(dayOfWeek));
    }



}