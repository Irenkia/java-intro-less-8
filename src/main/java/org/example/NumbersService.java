package org.example;

public class NumbersService {
    public static boolean isNumberDivideByTwo(int number) {
        if (number % 3 == 0) {
            return true;
        }
        return false;
    }

    public static int calculateSumOfDigitsOfGivenNumber(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
