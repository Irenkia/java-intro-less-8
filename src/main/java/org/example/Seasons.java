package org.example;

import java.time.Month;

public class Seasons {
    public static String getMonth(int numberMonth) {
        if (numberMonth >= 1 && numberMonth <= 12) {
            Month month = Month.of(numberMonth);
            return month.toString();
        }
        return "";
    }

}
