package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

class ConvertLettersToUppercaseTest {
    @ParameterizedTest
    @EmptySource
    @ValueSource(strings = {"radar", "Anna", "", "WoW"})
    public void shouldMakeBigLetters(String input) {
        String expected = ConvertLettersToUppercase.getBigLetters(input);
        Assertions.assertEquals(expected, input.toUpperCase());
    }

    @ParameterizedTest
    @NullSource
    public void shouldVerifyNullStringMakeBigLetters(String input) {
        String expected = ConvertLettersToUppercase.getBigLetters(input);
        Assertions.assertEquals(expected, "");
    }

}
