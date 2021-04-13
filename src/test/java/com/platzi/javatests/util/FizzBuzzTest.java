package com.platzi.javatests.util;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {

//    Si el número es divisible por 3, retorna “Fizz”
//    Si el número es divisible por 5, retorna “Buzz”
//    Si el número es divisible por 3 y por 5, retorna “FizzBuzz”
//    En otro caso, retorna el mismo número

    @Test
    public void number_divisible_on_3() {
        assertThat(FizzBuzz.fizzBuzz(6), is("Fizz"));
    }

    @Test
    public void number_divisible_on_5() {
        assertThat(FizzBuzz.fizzBuzz(5), is("Buzz"));
    }

    @Test
    public void number_divisible_on_3_and_5() {
        assertThat(FizzBuzz.fizzBuzz(15), is("FizzBuzz"));
    }

    @Test
    public void number_is_not_divisible_on_3_and_5() {
        assertThat(FizzBuzz.fizzBuzz(13), is("13"));
    }
}