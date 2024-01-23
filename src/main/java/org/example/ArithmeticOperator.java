package org.example;

public enum ArithmeticOperator {
	ADDITION("+"),
	SUBTRACTION("-"),
	MULTIPLICATION("*"),
	DIVISION("/");

	private final String operator;

	ArithmeticOperator(String operator) {
		this.operator = operator;
	}

	public String getOperator() {
		return operator;
	}
}
