package org.example;

public class ConvertLettersToUppercase {
    public static String getBigLetters(String text) {
        if (!(text == null || text == "")) {
            return text.toUpperCase();
        }
        return "";
    }

}
