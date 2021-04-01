package com.jordy.tdd;

import java.util.Locale;

public class Calculator {

	String checkInputErrors(String number) {
		String error = null;
		String tmp = "";
		String separators = "[\n,]";
		if (!number.endsWith(separators)) {
			for (int i = 0; i < number.length(); i++) {
				String substr = number.substring(i, i + 1);
				if (!substr.matches(separators)) {
					tmp += substr;
				} else {
					try {
						double n = Double.parseDouble(tmp);
						tmp = "";
					} catch (Exception e) {
						return "Number expected but '" + substr + "' found at position " + i;
					}

				}
			}
		}else {
			return "Number expected but EOF found";
		}

		return error;
	}

	String add(String number) {
		double sum = 0;
		String result = "0";
		String separatorsRegex = ",|\n";
		if (!number.isEmpty()) {
			String errors = checkInputErrors(number);
			if (errors.equals(null)) {
				String digits[] = number.split(separatorsRegex);
				for (int i = 0; i < digits.length; i++) {
					sum += Double.parseDouble(digits[i]);
				}
				result = String.format(Locale.ENGLISH, "%.1f", sum);
			} else {
				result = errors;
			}

		}
		return result;
	}
}
