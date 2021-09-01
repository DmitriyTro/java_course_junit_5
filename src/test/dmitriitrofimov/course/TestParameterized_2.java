package dmitriitrofimov.course;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestParameterized_2 {

	@ParameterizedTest
	@CsvSource(value = {"QWERTY,qwerty", "12345,12345", " ' ' , ' ' "})
	void testToLowerCase(String arg, String lowered) {
		assertEquals(lowered, arg.toLowerCase());
	}

	@ParameterizedTest(name = "The string {0} is {1} chars in length")
	@CsvFileSource(resources = "")
	void testStringsInFileToLowerCase(String arg, String lowered) {
		assertEquals(lowered, arg.toLowerCase());
	}
}