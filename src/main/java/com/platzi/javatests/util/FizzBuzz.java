package com.platzi.javatests.util;

public class FizzBuzz {

    public static String fizzBuzz(int number) {
        String response = "";
        if((number % 3) == 0 && (number % 5) == 0){
            response = "FizzBuzz";
        } else if ((number % 3) == 0){
            response = "Fizz";
        }
        else if ((number % 5) == 0){
            response = "Buzz";
        } else{
            response = String.valueOf(number);
        }
        return response;
    }
}
