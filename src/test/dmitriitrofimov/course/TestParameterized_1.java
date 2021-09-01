package dmitriitrofimov.course;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestParameterized_1 {

	@ParameterizedTest
	@ValueSource(strings = {"qwerty", "1234", "1212"})
	void testLengthGreaterThanZero(String arg) {
		assertTrue(arg.length() > 0);
	}
}