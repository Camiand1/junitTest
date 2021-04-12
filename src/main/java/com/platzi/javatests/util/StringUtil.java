package com.platzi.javatests.util;

public class StringUtil {

    public static String repeat(String str, int times) {
        String result = "";

        if (times < 0) {
            throw new IllegalArgumentException("Negatives times is not allowed");
        }

        for (int i = 0; i < times; i++) {
            result += str;
        }
        return result;
    }

    public static Boolean isEmpty(String str) {

        if (str.equals("") || str == null || str.equals(" ")) {
            return true;
        }else{
            return false;
        }
    }
}
