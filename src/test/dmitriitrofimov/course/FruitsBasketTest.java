package dmitriitrofimov.course;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class FruitsBasketTest {

	private FruitsBasket basket = new FruitsBasket();
	private Fruit apple = new Fruit("Apple", 120);
	private Fruit orange = new Fruit("Orange", 120);
	private Fruit pear = new Fruit("Pear", 120);

	@BeforeEach
	void init() {
		basket.add(apple);
		basket.add(orange);
		basket.add(pear);
	}

	@Test
	void testSize() {
		assertEquals(3, basket.getSize(), "Checking basket's size");
	}

	@Test
	void testAdd() {
		basket.add(new Fruit("Banana", 200));
		assertEquals(4, basket.getSize(), "Adding one more fruit to the basket");
	}

	@Test
	void testRemove() {
		basket.remove(orange);
		assertEquals(2, basket.getSize(), "Removing a fruit from the basket");
	}

	@Test()
	void testRemoveException() {
		assertThrows(NoSuchElementException.class,
				() -> basket.remove(new Fruit("kiwi", 80)),
				"Removing a fruit from the basket");
	}

	@AfterEach
	void destroy() {
		basket.removeAll();
	}
}