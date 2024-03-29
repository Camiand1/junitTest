package com.platzi.javatests.util;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringUtilTest {

    @Test
    public void repeat_string_multiple_times() {
        String result = StringUtil.repeat("hola", 3);
        System.out.println(result);
        Assertions.assertEquals("holaholahola", result);
        Assertions.assertEquals("hola", StringUtil.repeat("hola", 1));
    }

    @Test
    public void repeat_string_once() {
        Assertions.assertEquals("hola", StringUtil.repeat("hola", 1));
    }

    @Test
    public void repeat_string_zero_times() {
        Assertions.assertEquals("", StringUtil.repeat("hola", 0));
    }

    @Test()
    public void repeat_string_negative_times() {
        Assertions.assertEquals("hola", StringUtil.repeat("hola", -1));
    }


}