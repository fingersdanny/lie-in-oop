package org.example;

public class Calculator {
	public static int calculate(int operand1, String operator, int operand2) {
		int result = 0;
		switch (operator) {
			case "+":
				result = operand1 + operand2;
				break;
			case "-":
				result = operand1 - operand2;
				break;
			case "*":
				result = operand1 * operand2;
				break;
			case "/":
				result = operand1 / operand2;
				break;
		}
		return result;
	}
}
