package org.example;

import static org.assertj.core.api.Assertions.*;

import org.example.PasswordValidator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PasswordValidatorTest {

	@Test
	@DisplayName("비밀번호가 최소 8자 이상, 12자 이하면 예외가 발생하지 않는다.")
	void validatePasswordTest() {
		assertThatCode(() -> PasswordValidator.validate("serverwizard")).doesNotThrowAnyException();
	}

	@DisplayName("비밀번호가 8자 미만 또는 12자 초과하는 경우 IllegalArgumentException 예외가 발생한다.")
	@ParameterizedTest
	@ValueSource(strings = {"aabbbcc", "aaabbbcccddde"})
	void validatePasswordTest2(String password) {
		assertThatCode(() -> PasswordValidator.validate(password))
			.isExactlyInstanceOf(IllegalArgumentException.class)
			.hasMessage(PasswordValidator.WRONG_PASSWORD_LENGTH_EXCEPTION_MESSAGE);
	}
}
