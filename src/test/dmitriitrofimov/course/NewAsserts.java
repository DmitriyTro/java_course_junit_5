package dmitriitrofimov.course;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NewAsserts {

	@Test
	void test() {
		List<String> actual = Arrays.asList("one", "two", "three");
		List<String> expected = new ArrayList<>(actual);
		assertIterableEquals(expected, actual);
	}

	@Test
	void testAssertingAll() {
		assertAll(
				() -> assertThat("12345", is(String.class)),
				() -> assertThat("They differ!", "10", is("10"))
		);
	}

	@Test
	void testLinesMatch() {
		List<String> actualLines = Arrays.asList("Happy New Year 2020".split(" "));
		assertLinesMatch(Arrays.asList("Happy", "New", "Year", "2020"), actualLines);
	}
}
