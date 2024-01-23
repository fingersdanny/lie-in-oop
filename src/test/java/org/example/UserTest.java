package org.example;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class UserTest {
	@Test
	@DisplayName("패스워드를 초기화한다")
	void passwordTest() throws Exception {
		//given
		User user = new User();

		//when
		user.initPassword(new CorrectFixedPasswordGenerator());

		//then
		assertThat(user.getPassword()).isNotNull();
	}

	@Test
	@DisplayName("패스워드가 요구사항에 부합하지 않아 초기화 되지 않는다.")
	void passwordTest2() throws Exception {
		//given
		User user = new User();

		//when
		user.initPassword(new WrongFixedPasswordGenerator());

		//then
		assertThat(user.getPassword()).isNull();
	}
}