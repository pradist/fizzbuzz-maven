package com.example.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void fizzbuzz_whenInputIs1_shouldReturn1() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        String expected = "1";
        String actual = fizzbuzz.Generate(1);

        assertEquals(expected, actual);
    }

    @Test
    public void fizzbuzz_whenInputIs2_shouldReturn2() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        String expected = "2";
        String actual = fizzbuzz.Generate(2);

        assertEquals(expected, actual);
    }

    @Test
    public void fizzbuzz_whenInputIs4_shouldReturn4() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        String expected = "4";
        String actual = fizzbuzz.Generate(4);

        assertEquals(expected, actual);
    }

    @Test
    public void fizzbuzz_whenInputIs3_shouldReturnFizz() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        String expected = "Fizz";
        String actual = fizzbuzz.Generate(3);

        assertEquals(expected, actual);
    }

    @Test
    public void fizzbuzz_whenInputIs6_shouldReturnFizz() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        String expected = "Fizz";
        String actual = fizzbuzz.Generate(6);

        assertEquals(expected, actual);
    }

    @Test
    public void fizzbuzz_whenInputIs9_shouldReturnFizz() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        String expected = "Fizz";
        String actual = fizzbuzz.Generate(9);

        assertEquals(expected, actual);
    }

    @Test
    public void fizzbuzz_whenInputIs5_shouldReturnBuzz() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        String expected = "Buzz";
        String actual = fizzbuzz.Generate(5);

        assertEquals(expected, actual);
    }

    @Test
    public void fizzbuzz_whenInputIs10_shouldReturnBuzz() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        String expected = "Buzz";
        String actual = fizzbuzz.Generate(10);

        assertEquals(expected, actual);
    }
}
