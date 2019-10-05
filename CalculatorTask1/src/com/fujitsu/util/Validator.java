package com.fujitsu.util;

import java.util.*;
import com.fujitsu.app.AppConst;

public class Validator {

	private double firstNumber;
	private double secondNumber;
	private String operator;
	private List<String> validatonErrors = new ArrayList<String>();;

	public Validator(String firstnumStr, String secondnumStr, String operatorStr) {
		try {
			this.firstNumber = new Double(firstnumStr);
		} catch (Exception e) {
			System.out.println("\n" + "[Your input has error, please correct]");
			validatonErrors.add("Invalid First number input:Please enter numeric only");
		}
		try {
			this.secondNumber = new Double(secondnumStr);
		} catch (Exception e) {
			System.out.println("\n" +"[Your input has error, please correct]");
			validatonErrors.add("\n" + "Invalid Second number input:Please enter numeric only");
		}
		this.operator = operatorStr;

	}

	public boolean isValidInput(String firstNumStr, String secondNumStr, String operatorStr) {
		// If Validation failed, store all validation error messages in the
		// validatonErrors list
		try {
			if (!(AppConst.allowedOperators.contains(operatorStr))) {
				validatonErrors.add("\n" + "InalidOperator:Please select a valid operator");
			}
			if ((new Double(secondNumStr) == 0.00) && (operatorStr.equals("/"))) {
				System.out.println("[Your input has error, please correct]");
				validatonErrors.add("DivisonByZero: You can't divide by zero");
			}
			if (!(validatonErrors.isEmpty())) {
				displayValidatonErrors();
			}
		} catch (Exception e) {
			displayValidatonErrors();
		}
		return true;
	}

	public void displayValidatonErrors() {
		System.out.println(Arrays.toString(validatonErrors.toArray()));
		System.exit(0);
		// Loop through validatonErrors arrayList and display the messages
	}

	// Return first number
	public double getFirstNumber() {
		return this.firstNumber;
	}

	// Return second number
	public double getSecondNumber() {
		return this.secondNumber;
	}

	public String getoperator() {
		return this.operator;
	}

}