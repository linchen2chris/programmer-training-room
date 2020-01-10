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
		assertEquals(App.fizzBuzz(60), "FizzBuzz");
		// assertEquals(App.fizzBuzz(30), "FizzBuzz");
	}

	@Test
	public void shouldSayFizzWhizzIfNumberTimes3and7() {
		assertEquals(App.fizzBuzz(21), "FizzWhizz");
		assertEquals(App.fizzBuzz(42), "FizzWhizz");
	}

	@Test
	public void shouldSayFizzBuzzWhizzIfNumberTimes3and5and7() {
		assertEquals(App.fizzBuzz(210), "FizzBuzzWhizz");
	}

	@Test
	public void shouldSayBuzzWhizzIfNumberTimes5and7() {
		// assertEquals(App.fizzBuzz(35), "BuzzWhizz");
		assertEquals(App.fizzBuzz(140), "BuzzWhizz");
	}

	@Test
	public void shouldSayFizzIfNumberContains3() {
		assertEquals(App.fizzBuzz(13), "Fizz");
		assertEquals(App.fizzBuzz(23), "Fizz");
		assertEquals(App.fizzBuzz(33), "Fizz");
		assertEquals(App.fizzBuzz(30), "Fizz");
		assertEquals(App.fizzBuzz(31), "Fizz");
		assertEquals(App.fizzBuzz(32), "Fizz");
		assertEquals(App.fizzBuzz(33), "Fizz");
		assertEquals(App.fizzBuzz(34), "Fizz");
		assertEquals(App.fizzBuzz(36), "Fizz");
		assertEquals(App.fizzBuzz(38), "Fizz");
		assertEquals(App.fizzBuzz(39), "Fizz");
		assertEquals(App.fizzBuzz(43), "Fizz");
	}

	@Test
	public void shouldSayBuzzIfNumberContains5andTimes5() {
		assertEquals(App.fizzBuzz(50), "Buzz");
	}

	@Test
	public void shouldSayWhizzIfNumberContains5andTimes7() {
		assertEquals(App.fizzBuzz(56), "Whizz");
	}

	@Test
	public void shouldSayBuzzWhizzIfNumberContains5andtimes5and7() {
		assertEquals(App.fizzBuzz(35), "BuzzWhizz");
		assertEquals(App.fizzBuzz(105), "BuzzWhizz");
	}

	@Test
	public void shouldSayNumberIfNumberContains5andnotTimes5or7EvenTime3() {
		assertEquals(App.fizzBuzz(51), "51");
		assertEquals(App.fizzBuzz(52), "52");
		assertEquals(App.fizzBuzz(53), "53");
		assertEquals(App.fizzBuzz(54), "54");
	}

	@Test
	public void shouldSayWhizzIfNumberContains7andTimes7() {
		assertEquals(App.fizzBuzz(7), "Whizz");
		assertEquals(App.fizzBuzz(70), "Whizz");
		assertEquals(App.fizzBuzz(77), "Whizz");
	}

	@Test
	public void shouldSayNumberIfNumberContains7andnotTime7() {
		assertEquals(App.fizzBuzz(17), "17");
		assertEquals(App.fizzBuzz(27), "27");
		assertEquals(App.fizzBuzz(37), "37");
		assertEquals(App.fizzBuzz(47), "47");
		assertEquals(App.fizzBuzz(57), "57");
		assertEquals(App.fizzBuzz(67), "67");
		assertEquals(App.fizzBuzz(71), "71");
	}
}
