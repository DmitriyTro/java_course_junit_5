package dmitriitrofimov.course;

import org.junit.jupiter.api.*;

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

	@AfterAll
	static void destroyAll(TestInfo info) {
		System.out.println("in " + info.getDisplayName());
//		System.out.println("after all tests");
	}
}