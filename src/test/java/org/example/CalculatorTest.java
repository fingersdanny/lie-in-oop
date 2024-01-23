package org.example;

import static org.assertj.core.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class CalculatorTest {
	@DisplayName("덧셈 연산을 수행한다.")
	@ParameterizedTest
	@MethodSource("whatIsThis")
	void additionTest(int operand1, String operator, int operand2, int expected) {
		int result = Calculator.calculate(operand1, operator, operand2);

		assertThat(result).isEqualTo(expected);
	}

	private static Stream<Arguments> whatIsThis() {
		return Stream.of(
			Arguments.arguments(1, ArithmeticOperator.ADDITION.getOperator(), 2, 3),
			Arguments.arguments(1, ArithmeticOperator.SUBTRACTION.getOperator(), 2, -1),
			Arguments.arguments(1, ArithmeticOperator.MULTIPLICATION.getOperator(), 2, 2),
			Arguments.arguments(2, ArithmeticOperator.DIVISION.getOperator(), 2, 1)
		);
	}
}
