package com.fujitsu.app;

import java.util.Scanner;
import com.fujitsu.util.Calculator;
import com.fujitsu.util.Validator;

public class CalculatorTask {

	private static Scanner scanner;

	public static void main(String[] args) {
		System.out.println("============[Simple Arithmetic Calculator] =============" + "\n");
		// Initialize the user input, firstNumber, secondNumber, operator
		scanner = new Scanner(System.in);
		System.out.print("Enter First Number:");
		String firstNumberStr = scanner.next();

		System.out.print("Enter Second Number:");
		String secondNumberStr = scanner.next();

		System.out.print("Enter an Operator" + AppConst.allowedOperators + ":");
		String operator = scanner.next();

		// close scanner
		scanner.close();

		// Initialize Validator class to validate user input

		Validator validator = new Validator(firstNumberStr, secondNumberStr, operator);
		validator.isValidInput(firstNumberStr, secondNumberStr, operator);

		// IF validation passed
		// initialize Calculator class like below

		try {
			Calculator calculator = new Calculator(validator.getFirstNumber(), validator.getSecondNumber(), operator);
			calculator.doCalculation();
			calculator.displayResult();

		} catch (Exception e) {
			System.out.println("Enter new Number");
		}

	}
}
