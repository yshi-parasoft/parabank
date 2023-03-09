/**
 * 
 */
package com.parasoft.bookstore;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.math.BigDecimal;
import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for Item
 *
 * @see com.parasoft.bookstore.Item
 * @author devtest
 */
public class ItemTest {

	/**
	 * Parasoft Jtest UTA: Test for getId()
	 *
	 * @see com.parasoft.bookstore.Item#getId()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetId() throws Throwable {
		// Given
		Item underTest = new Item();

		// When
		int result = underTest.getId();

		// Then - assertions for result of method getId()
		assertEquals(0, result);

		// Then - assertions for this instance of Item
		assertNull(underTest.getName());
		assertEquals(0, underTest.getStockQuantity());
		assertNull(underTest.getPrice());

	}

	/**
	 * Parasoft Jtest UTA: Test for getName()
	 *
	 * @see com.parasoft.bookstore.Item#getName()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetName() throws Throwable {
		// Given
		Item underTest = new Item();

		// When
		String result = underTest.getName();

		// Then - assertions for result of method getName()
		assertNull(result);

		// Then - assertions for this instance of Item
		assertEquals(0, underTest.getId());
		assertEquals(0, underTest.getStockQuantity());
		assertNull(underTest.getPrice());

	}

	/**
	 * Parasoft Jtest UTA: Test for getPrice()
	 *
	 * @see com.parasoft.bookstore.Item#getPrice()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetPrice() throws Throwable {
		// Given
		Item underTest = new Item();

		// When
		BigDecimal result = underTest.getPrice();

		// Then - assertions for result of method getPrice()
		assertNull(result);

		// Then - assertions for this instance of Item
		assertEquals(0, underTest.getId());
		assertNull(underTest.getName());
		assertEquals(0, underTest.getStockQuantity());

	}

	/**
	 * Parasoft Jtest UTA: Test for getStockQuantity()
	 *
	 * @see com.parasoft.bookstore.Item#getStockQuantity()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetStockQuantity() throws Throwable {
		// Given
		Item underTest = new Item();

		// When
		int result = underTest.getStockQuantity();

		// Then - assertions for result of method getStockQuantity()
		assertEquals(0, result);

		// Then - assertions for this instance of Item
		assertEquals(0, underTest.getId());
		assertNull(underTest.getName());
		assertNull(underTest.getPrice());

	}

	/**
	 * Parasoft Jtest UTA: Test for inflatePrice(BigDecimal)
	 *
	 * @see com.parasoft.bookstore.Item#inflatePrice(BigDecimal)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testInflatePrice() throws Throwable {
		// Given
		int id = 0; // UTA: default value
		String name = "name"; // UTA: default value
		BigDecimal price = BigDecimal.ZERO; // UTA: default value
		int quantity = 0; // UTA: default value
		Item underTest = new Item(id, name, price, quantity);

		// When
		BigDecimal amount = BigDecimal.ZERO; // UTA: default value
		underTest.inflatePrice(amount);

		// Then - assertions for this instance of Item
		assertEquals(0, underTest.getId());
		assertEquals("name", underTest.getName());
		assertEquals(0, underTest.getStockQuantity());
		assertNotNull(underTest.getPrice());
		assertEquals(0d, underTest.getPrice().doubleValue(), 0.0);

	}

	/**
	 * Parasoft Jtest UTA: Test for setId(int)
	 *
	 * @see com.parasoft.bookstore.Item#setId(int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetId() throws Throwable {
		// Given
		Item underTest = new Item();

		// When
		int id = 0; // UTA: default value
		underTest.setId(id);

		// Then - assertions for this instance of Item
		assertEquals(0, underTest.getId());
		assertNull(underTest.getName());
		assertEquals(0, underTest.getStockQuantity());
		assertNull(underTest.getPrice());

	}

	/**
	 * Parasoft Jtest UTA: Test for setName(String)
	 *
	 * @see com.parasoft.bookstore.Item#setName(String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetName() throws Throwable {
		// Given
		Item underTest = new Item();

		// When
		String title = "title"; // UTA: default value
		underTest.setName(title);

		// Then - assertions for this instance of Item
		assertEquals(0, underTest.getId());
		assertEquals("title", underTest.getName());
		assertEquals(0, underTest.getStockQuantity());
		assertNull(underTest.getPrice());

	}

	/**
	 * Parasoft Jtest UTA: Test for setStockQuantity(int)
	 *
	 * @see com.parasoft.bookstore.Item#setStockQuantity(int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetStockQuantity() throws Throwable {
		// Given
		Item underTest = new Item();

		// When
		int quantity_in_stock = 0; // UTA: default value
		underTest.setStockQuantity(quantity_in_stock);

		// Then - assertions for this instance of Item
		assertEquals(0, underTest.getId());
		assertNull(underTest.getName());
		assertEquals(0, underTest.getStockQuantity());
		assertNull(underTest.getPrice());

	}
}