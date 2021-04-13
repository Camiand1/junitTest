package com.platzi.javatests.util;

public class RomanNumerals {
    public static String arabicToRoman(int number) {
        String romanNumber = "";
        for (int i = 0; i < number; i++) {
            romanNumber += "I";
            romanNumber = romanNumber.replaceAll("IIII", "IV");
            romanNumber = romanNumber.replaceAll("IVI", "V");

            romanNumber = romanNumber.replaceAll("VIV", "IX");
            romanNumber = romanNumber.replaceAll("IXI", "X");

            romanNumber = romanNumber.replaceAll("XXXX", "XL");
            romanNumber = romanNumber.replaceAll("XLX", "L");

            romanNumber = romanNumber.replaceAll("LXL", "XC");
            romanNumber = romanNumber.replaceAll("XCX", "C");

            romanNumber = romanNumber.replaceAll("CCCC", "CD");
            romanNumber = romanNumber.replaceAll("CDC", "D");

            romanNumber = romanNumber.replaceAll("DCD", "CM");
            romanNumber = romanNumber.replaceAll("CMC", "M");
        }
        return romanNumber;
    }
}
