package com.fujitsu.util;

import java.text.DecimalFormat;

public class Calculator {

	private double firstNumber;
	private double secondNumber;
	private String operator;
	double result;

	// To create constructor in calculator class
	public Calculator(double firstNum, double secondNum, String operator) {
		this.firstNumber = firstNum;
		this.secondNumber = secondNum;
		this.operator = operator;
	}

	// To call the logical method in this method.
	public double doCalculation() {
		switch (operator) {
		case "+":
			doAddition();
			break;
		case "-":
			doSubstraction();
			break;
		case "*":
			doMult();
			break;
		case "/":
			doDiv();
			break;
		case "&":
			doBitwiseAnd();
			break;
		case "=":
			doComparison();
			break;

		}
		return 0;

	}

	// convert result into up to two decimal no.
	DecimalFormat df = new DecimalFormat("0.00");

	// display the calculated result
	public void displayResult() {
		System.out.println("\n" + "The output will be as below:");
		switch (operator) {
		case "+":
			System.out.println("Result: " + this.firstNumber + " " + operator + " " + this.secondNumber + " = "
					+ df.format(result));
			break;
		case "-":
			System.out.println("Result: " + this.firstNumber + " " + operator + " " + this.secondNumber + " = "
					+ df.format(result));
			break;
		case "*":
			System.out.println("Result: " + this.firstNumber + " " + operator + " " + this.secondNumber + " = "
					+ df.format(result));
			break;
		case "/":
			System.out.println("Result: " + this.firstNumber + " " + operator + " " + this.secondNumber + " = "
					+ df.format(result));
			break;
		case "&":
			System.out.println(
					"Result: " + (int) firstNumber + " " + operator + " " + (int) secondNumber + " = " + (int) result);
			break;

		}
	}

	private double doAddition() {
		result = firstNumber + secondNumber;
		return result;
	}

	private double doSubstraction() {
		result = firstNumber - secondNumber;
		return result;
	}

	private double doMult() {
		result = firstNumber * secondNumber;
		return result;
	}

	private double doDiv() {
		result = firstNumber / secondNumber;
		return result;
	}

	// First to convert double to integer by using type casting method
	private int doBitwiseAnd() {
		result = (int) firstNumber & (int) secondNumber;
		return (int) result;
	}

	// Comparison of two number
	private String doComparison() {
		System.out.println("\n" + "The output will be as below:");
		if (firstNumber == secondNumber) {
			System.out.println("Result: " + firstNumber + "==" + secondNumber);
			System.exit(0);
		} else if (firstNumber > secondNumber) {
			System.out.println("Result: " + firstNumber + ">" + secondNumber);
			System.exit(0);
		} else {
			System.out.println("Result: " + firstNumber + "<" + secondNumber);
			System.exit(0);
		}
		return null;
	}
}
