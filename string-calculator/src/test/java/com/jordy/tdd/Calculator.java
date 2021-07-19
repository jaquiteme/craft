package com.jordy.tdd;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {

	String checkInputErrors(String number) {
		String tmp = "";
		String separators = "[\n,]";
		String regex = "[\n,]$";
		Pattern p = Pattern.compile(regex);
		Matcher matcher = p.matcher(number);
		if (!matcher.find()) {
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
		} else {
			return "Number expected but EOF found";
		}

		return null;
	}

	String getCustomSeparator(String number) {
		String regex = "^//";
		Pattern p = Pattern.compile(regex);
		Matcher matcher = p.matcher(number);
		if (matcher.find()) {
			String separator = number.split("\n")[0];
			return separator.substring(2, separator.length());
		}
		return null;
	}

	String getNumbers(String number) {
		return number.split("\n")[1];
	}

	String add(String number) {
		double sum = 0;
		String result = "0";
		String separatorsRegex = ",|\n";
		if (!number.isEmpty()) {
			// For custom separators 
			if (getCustomSeparator(number) != null) {
				separatorsRegex = getCustomSeparator(number);
				number = getNumbers(number);
			}
			String errors = checkInputErrors(number);
			if (errors == null) {
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
