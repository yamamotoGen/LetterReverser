package com.example.util;

public class StringUtil {
    public String reverseLetters(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        int start = 0;
        int end = str.length() - 1;
        char[] chars = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (start >= end) {
                break;
            }
            if (!Character.isLetter(chars[start])) {
                start++;
                continue;
            } else if (!Character.isLetter(chars[end])) {
                end--;
                continue;
            }
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        return new String(chars);
    }
}