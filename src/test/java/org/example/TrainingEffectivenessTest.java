package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class TrainingEffectivenessTest {

    @ParameterizedTest
    @CsvSource(value = {"20:1", "30:2", "40:2", "60:2", "70:3"},
            delimiter = ':')
    void mustGetRatingDurationOfTraining(int input, int expected) {
        int actualValue = TrainingEffectiveness.getRatingDurationOfTraining(input);
        Assertions.assertEquals(expected, actualValue);
    }

    @ParameterizedTest
    @CsvSource(value = {"200:1", "300:1", "350:2", "400:3", "500:3"},
            delimiter = ':')
    void mustGetRatingNumberOfCaloriesBurned(int input, int expected) {
        int actualValue = TrainingEffectiveness.getRatingNumberOfCaloriesBurned(input);
        Assertions.assertEquals(expected, actualValue);
    }

    @ParameterizedTest
    @CsvSource(value = {"150:3", "160:2", "170:2", "175:2", "180:1"},
            delimiter = ':')
    void mustGetRatingHeartRate(int input, int expected) {
        int actualValue = TrainingEffectiveness.getRatingHeartRate(input);
        Assertions.assertEquals(expected, actualValue);
    }

    @ParameterizedTest
    @MethodSource("provideGeneralRating")
    void mustEffectivenessOfEntireWorkout(String input, String expected) {
        String actualValue = input;
        Assertions.assertEquals(expected, actualValue);
    }

    private static Stream<Arguments> provideGeneralRating() {
        String rating1 = TrainingEffectiveness.getGeneralRating(1, 1, 1);
        String rating2 = TrainingEffectiveness.getGeneralRating(1, 2, 2);
        String rating3 = TrainingEffectiveness.getGeneralRating(2, 2, 2);
        String rating4 = TrainingEffectiveness.getGeneralRating(3, 3, 3);
        String rating5 = TrainingEffectiveness.getGeneralRating(3, 2, 1);
        return Stream.of(
                Arguments.of(rating1, "Short"),
                Arguments.of(rating2, "Fine"),
                Arguments.of(rating3, "Very good"),
                Arguments.of(rating4, "Great"),
                Arguments.of(rating5, "Very good")
        );
    }
}
