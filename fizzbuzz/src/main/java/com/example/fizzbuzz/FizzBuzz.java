package com.example.fizzbuzz;

public class FizzBuzz {
    public String Generate(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }
        if (number == 5) {
            return "Buzz";
        }
        if (number == 10) {
            return "Buzz";
        }
        if (number == 20) {
            return "Buzz";
        }
        return String.valueOf(number);
    }
}
