package com.example.fizzbuzz;

public class FizzBuzz {
  public String Generate(int number) {
    if (number % 15 == 0) {
      return "FizzBuzz";
    }
    if (number == 30) {
      return "FizzBuzz";
    }
    if (number == 45) {
      return "FizzBuzz";
    }
    if (number % 3 == 0) {
      return "Fizz";
    }
    if (number % 5 == 0) {
      return "Buzz";
    }
    return String.valueOf(number);
  }
}
