package com.platzi.javatests.util;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class RomanNumeralsTest {

    @Test
    public void roman_number_one() {
        assertThat(RomanNumerals.arabicToRoman(1), is("I"));
    }
    @Test
    public void roman_number_two() {
        assertThat(RomanNumerals.arabicToRoman(2), is("II"));
    }
    @Test
    public void roman_number_three() {
        assertThat(RomanNumerals.arabicToRoman(3), is("III"));
    }
    @Test
    public void roman_number_five() {
        assertThat(RomanNumerals.arabicToRoman(5), is("V"));
    }
    @Test
    public void roman_number_six() {
        assertThat(RomanNumerals.arabicToRoman(6), is("VI"));
    }
    @Test
    public void roman_number_seven() {
        assertThat(RomanNumerals.arabicToRoman(7), is("VII"));
    }
    @Test
    public void roman_number_ten() {
        assertThat(RomanNumerals.arabicToRoman(10), is("X"));
    }
    @Test
    public void roman_number_eleven() {
        assertThat(RomanNumerals.arabicToRoman(11), is("XI"));
    }
    @Test
    public void roman_number_fifteen() {
        assertThat(RomanNumerals.arabicToRoman(15), is("XV"));
    }
    @Test
    public void roman_number_sixten() {
        assertThat(RomanNumerals.arabicToRoman(16), is("XVI"));
    }
    @Test
    public void roman_number_fifty() {
        assertThat(RomanNumerals.arabicToRoman(50), is("L"));
    }@Test
    public void roman_number_fiftyone() {
        assertThat(RomanNumerals.arabicToRoman(51), is("LI"));
    }
    @Test
    public void roman_number_fiftyfive() {
        assertThat(RomanNumerals.arabicToRoman(55), is("LV"));
    }
    @Test
    public void roman_number_fiftysix() {
        assertThat(RomanNumerals.arabicToRoman(56), is("LVI"));
    }
    @Test
    public void roman_number_sixty() {
        assertThat(RomanNumerals.arabicToRoman(60), is("LX"));
    }
    @Test
    public void roman_number_seventy() {
        assertThat(RomanNumerals.arabicToRoman(70), is("LXX"));
    }
    @Test
    public void roman_number_eighty() {
        assertThat(RomanNumerals.arabicToRoman(80), is("LXXX"));
    }
    @Test
    public void roman_number_eightyone() {
        assertThat(RomanNumerals.arabicToRoman(81), is("LXXXI"));
    }
    @Test
    public void roman_number_eightyfive() {
        assertThat(RomanNumerals.arabicToRoman(85), is("LXXXV"));
    }
    @Test
    public void roman_number_eightysix() {
        assertThat(RomanNumerals.arabicToRoman(86), is("LXXXVI"));
    }
    @Test
    public void roman_number_onehundred_and_twentysix() {
        assertThat(RomanNumerals.arabicToRoman(126), is("CXXVI"));
    }
    @Test
    public void roman_number_twentyfive_zero_seven() {
        assertThat(RomanNumerals.arabicToRoman(2507), is("MMDVII"));
    }
}