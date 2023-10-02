package com.nagarro.Main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.nagarro.controller.CsvReader;
import com.nagarro.controller.MainController;
import com.nagarro.exception.InvalidException;
import com.nagarro.exception.Validation;
import com.nagarro.model.Product;
import com.nagarro.output.Output;

public class Input {
	public boolean checkInt(String c) {
		try {
			int choice = Validation.getValidated(c);
		} catch (InvalidException invalidInputException) {
			System.err.println(invalidInputException.getMessage());
			return false;
		}
		return true;
	}

	public boolean checkchar(String c) {
		try {
			String choice = Validation.getValidatedString(c);
		} catch (InvalidException invalidInputException) {
			System.err.println(invalidInputException.getMessage());
			return false;
		}
		return true;
	}

	public void inputdata(Scanner key) throws IOException {
		String color, size, gender;
		int cont, out;
		boolean flag = true;
		boolean isValidInput;
		Output o = new Output();
		String str;
		do {
			System.out.print("Enter Color  : ");
			do {
				str = key.nextLine();
				isValidInput = checkchar(str);
			} while (!isValidInput);
			color = (str);
			System.out.print("Enter Size  : ");
			do {
				str = key.nextLine();
				isValidInput = checkchar(str);
			} while (!isValidInput);
			size = (str);
			System.out.print("Enter Gender  : ");
			do {
				str = key.nextLine();
				isValidInput = checkchar(str);
			} while (!isValidInput);
			gender = (str);
			System.out.println("Enter your Output Preference  :");
			System.out.println("1. Sort according to price");
			System.out.println("2. Sort according to rating");
			System.out.println("3. Sort according to both price and rating");
			do {
				str = key.nextLine();
				isValidInput = checkInt(str);
			} while (!isValidInput);
			out = Integer.parseInt(str);

			MainController.search(color, size, gender, out);
			System.out.println("Do you want to continue 1 to yes and 0 to no");
			do {
				str = key.nextLine();
				isValidInput = checkInt(str);
			} while (!isValidInput);
			cont = Integer.parseInt(str);
			if (cont == 0) {
				flag = false;
			}
		} while (flag == true);
	}
}
