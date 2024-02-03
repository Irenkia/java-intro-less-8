package org.example;

public class TrainingEffectiveness {
    public static int getRatingDurationOfTraining(int durationTraining) {
        if (!(durationTraining <= 0)) {
            if (durationTraining < 30) {
                return 1;
            } else if (durationTraining >= 30 && durationTraining <= 60) {
                return 2;
            } else if (durationTraining > 60) {
                return 3;
            }
        }
        return 0;
    }

    public static int getRatingNumberOfCaloriesBurned(int numberCalories) {
        if (!(numberCalories <= 0)) {
            if (numberCalories <= 300) {
                return 1;
            } else if (numberCalories > 300 && numberCalories < 400) {
                return 2;
            } else if (numberCalories >= 400) {
                return 3;
            }
        }
        return 0;
    }

    public static int getRatingHeartRate(int heartRate) {
        if (!(heartRate <= 0)) {
            if (heartRate < 160) {
                return 3;
            } else if (heartRate >= 160 && heartRate <= 175) {
                return 2;
            } else if (heartRate > 175) {
                return 1;
            }
        }
        return 0;
    }

    public static String getGeneralRating(int durationTraining, int numberCalories, int heartRate) {
        double duration = durationTraining;
        double number = numberCalories;
        double heart = heartRate;
        if (!(durationTraining <= 0 || numberCalories <= 0 || heartRate <= 0)) {
            double generalRating = (duration + number + heart) / 3;
            if (generalRating < 1.2) {
                return "Short";
            } else if (generalRating >= 1.2 && generalRating < 2.0) {
                return "Fine";
            } else if (generalRating >= 2.0 && generalRating < 3.0) {
                return "Very good";
            } else if (generalRating >= 3.0) {
                return "Great";
            }
        }
        return "";
    }
}
