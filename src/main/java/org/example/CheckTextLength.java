package org.example;

public class CheckTextLength {
    public static int getTextLength(String text) {
        if (text == null) {
            text = "";
        }
        return text.length();
    }
}
