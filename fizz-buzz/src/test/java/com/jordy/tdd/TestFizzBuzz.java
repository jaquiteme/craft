package com.jordy.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestFizzBuzz {
	FizzBuzz fizzBuzz = new FizzBuzz();

	/*
	 * CASES TESTS
	 */

	@Test
	public void testNotMultipleOfThree() {
		Assertions.assertEquals(false, fizzBuzz.isMultipleOfThree(10));
	}

	@Test
	public void testMultipleOfThree() {
		Assertions.assertEquals(true, fizzBuzz.isMultipleOfThree(3));
	}

	@Test
	public void testNotMultipleOfFive() {
		Assertions.assertEquals(false, fizzBuzz.isMultipleOfFive(3));
	}

	@Test
	public void testMultipleOfFive() {
		Assertions.assertEquals(true, fizzBuzz.isMultipleOfFive(5));
	}

	/*
	 * INDIVIDUAL TESTS
	 */
	@Test
	public void testNotFizzOrBuzz() {
		Assertions.assertEquals("11", fizzBuzz.checkForFizzBuzz(11));
	}

	@Test
	public void testFizz() {
		Assertions.assertEquals("Fizz", fizzBuzz.checkForFizzBuzz(3));
	}

	@Test
	public void testBuzz() {
		Assertions.assertEquals("Buzz", fizzBuzz.checkForFizzBuzz(5));
	}

	@Test
	public void testFizzBuzz() {
		Assertions.assertEquals("FizzBuzz", fizzBuzz.checkForFizzBuzz(15));
	}

	/*
	 * STAGE 2
	 */

	@Test
	public void testHasNotThreeInNumber() {
		Assertions.assertEquals(false, fizzBuzz.hasThreeInNumber(15));
	}

	@Test
	public void testHasThreeInNumber() {
		Assertions.assertEquals(true, fizzBuzz.hasThreeInNumber(3));
	}

	@Test
	public void testHasNotFiveInNumber() {
		Assertions.assertEquals(false, fizzBuzz.hasFiveInNumber(11));
	}

	@Test
	public void testHasFiveInNumber() {
		Assertions.assertEquals(true, fizzBuzz.hasFiveInNumber(5));
	}

	@Test
	public void testAll() {
		for (int i = 1; i < 100; i++) {
			System.out.println(fizzBuzz.checkForFizzBuzz(i));
		}
	}

}
