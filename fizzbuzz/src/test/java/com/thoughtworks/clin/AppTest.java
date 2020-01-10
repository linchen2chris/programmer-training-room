package com.thoughtworks.clin;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest{

	@Test
	public void shouldSayHisNumberNormally() {
		assertEquals(App.fizzBuzz(1), "1");
		assertEquals(App.fizzBuzz(2), "2");
	}

	@Test
	public void shouldSayFizzIfNumberTimes3() {
		assertEquals(App.fizzBuzz(3), "Fizz");
		assertEquals(App.fizzBuzz(6), "Fizz");
		assertEquals(App.fizzBuzz(9), "Fizz");
	}

	@Test
	public void shouldSayBuzzIfNumberTimes5() {
		assertEquals(App.fizzBuzz(5), "Buzz");
		assertEquals(App.fizzBuzz(10), "Buzz");
	}

	@Test
	public void shouldSayWhizzIfNumberTimes7() {
		assertEquals(App.fizzBuzz(7), "Whizz");
		assertEquals(App.fizzBuzz(14), "Whizz");
	}

	@Test
	public void shouldSayFizzBuzzIfNumberTimes3and5() {
		assertEquals(App.fizzBuzz(15), "FizzBuzz");
		assertEquals(App.fizzBuzz(30), "FizzBuzz");
	}

	@Test
	public void shouldSayFizzWhizzIfNumberTimes3and7() {
		assertEquals(App.fizzBuzz(21), "FizzWhizz");
		assertEquals(App.fizzBuzz(42), "FizzWhizz");
	}

	@Test
	public void shouldSayFizzBuzzWhizzIfNumberTimes3and5and7() {
		assertEquals(App.fizzBuzz(105), "FizzBuzzWhizz");
	}

}
