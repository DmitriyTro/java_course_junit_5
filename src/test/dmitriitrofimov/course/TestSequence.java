package dmitriitrofimov.course;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertThrows;

@TestMethodOrder(MethodOrderer.DisplayName.class)
public class TestSequence {

	@BeforeAll
	static void initAll(TestInfo info) {
		System.out.println("in " + info.getDisplayName());
//		System.out.println("before all tests");
	}

	@Test
	void test1(TestInfo info) {
		System.out.println("in " + info.getDisplayName());
	}

	@Test
	void test3(TestInfo info) {
		System.out.println("in " + info.getDisplayName());
	}

	@Test
	void test2(TestInfo info) {
		System.out.println("in " + info.getDisplayName());
	}

	@Test
	@DisplayName("When string is null, throw an NPE")
	void testException() {
		String str = null;
		assertThrows(
				NullPointerException.class,
				() -> str.length());
	}

	@RepeatedTest(name = "Repeated test", value = 5)
	void testRepeated() {
		System.out.println("in testRepeated()");
	}

	@AfterAll
	static void destroyAll(TestInfo info) {
		System.out.println("in " + info.getDisplayName());
//		System.out.println("after all tests");
	}
}