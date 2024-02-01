package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullSource;

import java.util.stream.Stream;

class CheckTextLengthTest {
    @ParameterizedTest
    @MethodSource("provideStringsForGetLength")
    public void shouldVerifyStringLength(String input, int expected) {
        int actualValue = input.length();
        Assertions.assertEquals(expected, actualValue);
    }

    private static Stream<Arguments> provideStringsForGetLength() {
        return Stream.of(
                Arguments.of("Convert", "7"),
                Arguments.of("Test", "4"),
                Arguments.of("", "0")
        );
    }

    @ParameterizedTest
    @NullSource
    public void shouldVerifyNullStringLength(String input) {
        int expected = CheckTextLength.getTextLength(input);
        Assertions.assertEquals(expected, 0);
    }
}
