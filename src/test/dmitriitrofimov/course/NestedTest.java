package dmitriitrofimov.course;

import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class NestedTest {

	@BeforeAll
	static void setUpAllOuter() {
		System.out.println("--- before all in Outer ---");
	}

	@BeforeEach
	void setUpEachOuter() {
		System.out.println("\t before each in Outer ---");
	}

	@AfterAll
	static void tearDownAllOuter() {
		System.out.println("--- after all in Outer ---");
	}

	@AfterEach
	void tearDownEachOuter() {
		System.out.println("\t after each in Outer ---");
	}

	@Test
	void testOuter1() {
		System.out.println("\t --- in testOuter1 ---");
	}

	@Test
	void testOuter2() {
		System.out.println("\t --- in testOuter2 ---");
	}

	@Nested
	class ArrayListRelatedTests {

		List<String> list;

		@BeforeEach
		void setUp() {
			System.out.println("\t\t before each in NestedAL");
			list = Arrays.asList("one", "two", "three");
		}

		@AfterEach
		void tearDown() {
			System.out.println("\t\t after each in NestedAL");
		}

		@Test
		void testALNotNull() {
			System.out.println("\t\t --- in testALNotNull");
			assertNotNull(list);
		}

		@Test
		void testALSize() {
			System.out.println("\t\t --- in testALSize");
			assertEquals(3, list.size());
		}
	}
}