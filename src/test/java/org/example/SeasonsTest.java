package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SeasonsTest {
    @ParameterizedTest
    @MethodSource("provideMonthForEnum")
    void shouldMonthEnum(int input, String expected) {
        String actualValue = Seasons.getMonth(input);
        Assertions.assertEquals(expected, actualValue);
    }

    private static Stream<Arguments> provideMonthForEnum() {
        return Stream.of(
                Arguments.of("1", "JANUARY"),
                Arguments.of("2", "FEBRUARY"),
                Arguments.of("3", "MARCH"),
                Arguments.of("4", "APRIL"),
                Arguments.of("5", "MAY"),
                Arguments.of("6", "JUNE"),
                Arguments.of("7", "JULY"),
                Arguments.of("8", "AUGUST"),
                Arguments.of("9", "SEPTEMBER"),
                Arguments.of("10", "OCTOBER"),
                Arguments.of("11", "NOVEMBER"),
                Arguments.of("12", "DECEMBER")
        );
    }

}
