package com.jordy.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	/**
	 * Rigorous Test :-)
	 */

	private Calculator calculator = new Calculator();

	@Test
	public void shouldReturnZeroString() {
		String number = "";
		assertEquals("0", calculator.add(number));
	}

	@Test
	public void shouldReturnSumOfNumbersString() {
		String number = "1,2";
		assertEquals("3.0", calculator.add(number));
	}

	@Test
	public void shouldReturnSumOfDEcimalNumbersString() {
		String number = "1.2,2.2";
		assertEquals("3.4", calculator.add(number));
	}

	@Test
	public void shouldReturnSumOfManyNumbersString() {
		String number = "1.2,2.2,1,3";
		assertEquals("7.4", calculator.add(number));
	}

	@Test
	public void shouldReturnSumOfNumbersStringWithManySeparators() {
		String number = "1\n2,3";
		assertEquals("6.0", calculator.add(number));
	}

	@Test
	public void shouldReturnNumberExpectedError() {
		String number = "175.2,\n35";
		String error = "Number expected but '\n' found at position 6";
		assertEquals(error, calculator.add(number));
	}
	
	@Test
	public void shouldReturnNumberExpectedErrorEOF() {
		String number = "1,3,";
		String error = "Number expected but EOF found";
		assertEquals(error, calculator.add(number));
	}
	
	@Test
	public void shouldReturnRightResultWithCustomSeperator() {
		String number = "//;\n1;2";
		assertEquals("3.0", calculator.add(number));
	}
}
