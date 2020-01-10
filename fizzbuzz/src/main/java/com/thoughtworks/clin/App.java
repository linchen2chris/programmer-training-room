package com.thoughtworks.clin;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		for( int i = 0; i < 120; i++) {
			String result = fizzBuzz(i+1);
			System.out.println(result);
		}
	}

	public static String fizzBuzz(Integer number) {
		if(number % 3 == 0) {
			if(number % 5 == 0) {
				if(number % 7 == 0) {
					return "FizzBuzzWhizz";
				}
				return "FizzBuzz";
			} else if(number % 7 == 0) {
				return "FizzWhizz";
			}
			return "Fizz";
		}
		if(number % 5 == 0) {
			return "Buzz";
		}
		if(number % 7 == 0) {
			return "Whizz";
		}
		return number.toString();
	}


}
