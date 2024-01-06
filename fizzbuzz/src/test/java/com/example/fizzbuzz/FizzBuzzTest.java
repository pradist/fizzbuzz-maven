package com.example.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
  @Test
  public void whenInputIs1_shouldReturn1() {
    FizzBuzz fizzbuzz = new FizzBuzz();
    String expected = "1";
    String actual = fizzbuzz.Generate(1);

    assertEquals(expected, actual);
  }

  @Test
  public void whenInputIs2_shouldReturn2() {
    FizzBuzz fizzbuzz = new FizzBuzz();
    String expected = "2";
    String actual = fizzbuzz.Generate(2);

    assertEquals(expected, actual);
  }

  @Test
  public void whenInputIs4_shouldReturn4() {
    FizzBuzz fizzbuzz = new FizzBuzz();
    String expected = "4";
    String actual = fizzbuzz.Generate(4);

    assertEquals(expected, actual);
  }

  @Test
  public void whenInputIs3_shouldReturnFizz() {
    FizzBuzz fizzbuzz = new FizzBuzz();
    String expected = "Fizz";
    String actual = fizzbuzz.Generate(3);

    assertEquals(expected, actual);
  }

  @Test
  public void whenInputIs6_shouldReturnFizz() {
    FizzBuzz fizzbuzz = new FizzBuzz();
    String expected = "Fizz";
    String actual = fizzbuzz.Generate(6);

    assertEquals(expected, actual);
  }

  @Test
  public void whenInputIs9_shouldReturnFizz() {
    FizzBuzz fizzbuzz = new FizzBuzz();
    String expected = "Fizz";
    String actual = fizzbuzz.Generate(9);

    assertEquals(expected, actual);
  }

  @Test
  public void whenInputIs5_shouldReturnBuzz() {
    FizzBuzz fizzbuzz = new FizzBuzz();
    String expected = "Buzz";
    String actual = fizzbuzz.Generate(5);

    assertEquals(expected, actual);
  }

  @Test
  public void whenInputIs10_shouldReturnBuzz() {
    FizzBuzz fizzbuzz = new FizzBuzz();
    String expected = "Buzz";
    String actual = fizzbuzz.Generate(10);

    assertEquals(expected, actual);
  }

  @Test
  public void whenInputIs20_shouldReturnBuzz() {
    FizzBuzz fizzbuzz = new FizzBuzz();
    String expected = "Buzz";
    String actual = fizzbuzz.Generate(20);

    assertEquals(expected, actual);
  }

  @Test
  public void whenInputIs15_shouldReturnFizzBuzz() {
    FizzBuzz fizzbuzz = new FizzBuzz();
    String expected = "FizzBuzz";
    String actual = fizzbuzz.Generate(15);

    assertEquals(expected, actual);
  }

  @Test
  public void whenInputIs30_shouldReturnFizzBuzz() {
    FizzBuzz fizzbuzz = new FizzBuzz();
    String expected = "FizzBuzz";
    String actual = fizzbuzz.Generate(30);

    assertEquals(expected, actual);
  }

  @Test
  public void whenInputIs45_shouldReturnFizzBuzz() {
    FizzBuzz fizzbuzz = new FizzBuzz();
    String expected = "FizzBuzz";
    String actual = fizzbuzz.Generate(45);

    assertEquals(expected, actual);
  }

  @Test
  public void whenInputIs60_shouldReturnFizzBuzz() {
    FizzBuzz fizzbuzz = new FizzBuzz();
    String expected = "FizzBuzz";
    String actual = fizzbuzz.Generate(60);

    assertEquals(expected, actual);
  }
}
