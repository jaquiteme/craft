package com.jordy.tdd;

public class FizzBuzz {

	public boolean isMultipleOfThree(int number) {
		return (number % 3 == 0);
	}

	public boolean isMultipleOfFive(int number) {
		return (number % 5 == 0);
	}

	public boolean hasThreeInNumber(int number) {
		return String.valueOf(number).contains("3");
	}

	public boolean hasFiveInNumber(int number) {
		return String.valueOf(number).contains("5");
	}

	public String checkForFizzBuzz(int number) {
		String result = "";

		if (this.isMultipleOfThree(number) || this.hasThreeInNumber(number)) {
			result += "Fizz";
		}

		if (this.isMultipleOfFive(number) || this.hasFiveInNumber(number)) {
			result += "Buzz";
		}

		return (result.length() > 0) ? result : String.valueOf(number);
	}
	
}
