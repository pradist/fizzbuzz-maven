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
}
