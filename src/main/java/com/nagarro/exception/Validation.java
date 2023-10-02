package com.nagarro.exception;

public class Validation {

	public static String getValidatedString(final String name) throws InvalidException {
		if (name.length() < 1 || !name.matches("[a-zA-Z]+")) {
			throw new InvalidException("Please enter a valid type:");
		}
		return name;
	}

	public static int getValidated(final String x) throws InvalidException {
		int validated = 0;

		try {
			validated = Integer.parseInt(x);
			if (validated < 0) {
				throw new InvalidException("Number should be greater than or equal to 1: ");
			}

		} catch (NumberFormatException numberFormatException) {
			throw new InvalidException("Please enter choice in Integer format: ");

		}
		return validated;
	}

}
