package com.example.fizzbuzz;

public class FizzBuzz {
    public String Generate(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(number);
    }
}
