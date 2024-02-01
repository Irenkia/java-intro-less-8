package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class NumbersServiceTest {
    @ParameterizedTest
    @ValueSource(ints = {2, 0, 10})
    public void shouldNumberDivideByTwo(int input) {
        Assertions.assertTrue(NumbersService.isNumberDivideByTwo(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"432:9", "125:8", "12555:18"},
            delimiter = ':')
    public void shouldCalculateSumOfDigitsOfGivenNumber(int input, int expected) {
        int actualValue = NumbersService.calculateSumOfDigitsOfGivenNumber(input);
        Assertions.assertEquals(expected, actualValue);
    }

}
