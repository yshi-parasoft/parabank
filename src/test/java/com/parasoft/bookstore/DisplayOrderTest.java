/**
 * 
 */
package com.parasoft.bookstore;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;

import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for DisplayOrder
 *
 * @see com.parasoft.bookstore.DisplayOrder
 * @author devtest
 */
public class DisplayOrderTest {

	/**
	 * Parasoft Jtest UTA: Test for getCartId()
	 *
	 * @see com.parasoft.bookstore.DisplayOrder#getCartId()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetCartId() throws Throwable {
		// Given
		DisplayOrder underTest = new DisplayOrder();

		// When
		int result = underTest.getCartId();

		// Then - assertions for result of method getCartId()
		assertEquals(0, result);

		// Then - assertions for this instance of DisplayOrder
		assertNull(underTest.getItem());

	}

	/**
	 * Parasoft Jtest UTA: Test for getItem()
	 *
	 * @see com.parasoft.bookstore.DisplayOrder#getItem()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetItem() throws Throwable {
		// Given
		DisplayOrder underTest = new DisplayOrder();

		// When
		Order result = underTest.getItem();

		// Then - assertions for result of method getItem()
		assertNull(result);

		// Then - assertions for this instance of DisplayOrder
		assertEquals(0, underTest.getCartId());

	}

	/**
	 * Parasoft Jtest UTA: Test for setCartId(int)
	 *
	 * @see com.parasoft.bookstore.DisplayOrder#setCartId(int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetCartId() throws Throwable {
		// Given
		DisplayOrder underTest = new DisplayOrder();

		// When
		int cartId = 0; // UTA: default value
		underTest.setCartId(cartId);

		// Then - assertions for this instance of DisplayOrder
		assertEquals(0, underTest.getCartId());
		assertNull(underTest.getItem());

	}

	/**
	 * Parasoft Jtest UTA: Test for setItem(Order)
	 *
	 * @see com.parasoft.bookstore.DisplayOrder#setItem(Order)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetItem() throws Throwable {
		// Given
		DisplayOrder underTest = new DisplayOrder();

		// When
		Order item = mock(Order.class);
		underTest.setItem(item);

		// Then - assertions for argument 1 of method setItem(Order)
		assertNull(item.getBook());
		assertEquals(0, item.getQuantity());
		assertEquals(0L, item.getTimestamp());

		// Then - assertions for this instance of DisplayOrder
		assertEquals(0, underTest.getCartId());
		assertNotNull(underTest.getItem());
		assertNull(underTest.getItem().getBook());
		assertEquals(0, underTest.getItem().getQuantity());
		assertEquals(0L, underTest.getItem().getTimestamp());

	}
}