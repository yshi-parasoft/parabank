/**
 * 
 */
package com.parasoft.bookstore2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for CartManager
 *
 * @see com.parasoft.bookstore2.CartManager
 * @author devtest
 */
public class CartManagerTest {

	/**
	 * Parasoft Jtest UTA: Test for addExistingItemToCart(int, Order)
	 *
	 * @see com.parasoft.bookstore2.CartManager#addExistingItemToCart(int, Order)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testAddExistingItemToCart() throws Throwable {
		// Given
		CartManager underTest = new CartManager();

		// When
		int cartId = 0; // UTA: default value
		Order order = mock(Order.class);
		Order result = underTest.addExistingItemToCart(cartId, order);

		// Then - assertions for argument 2 of method addExistingItemToCart(int, Order)
		assertNull(order.getBook());
		assertEquals(0, order.getQuantity());
		assertEquals(0L, order.getTimestamp());

		// Then - assertions for this instance of CartManager
		assertEquals(0, underTest.getCartId());
		assertNull(underTest.getItem());

	}

	/**
	 * Parasoft Jtest UTA: Test for addNewItemToCart(Order)
	 *
	 * @see com.parasoft.bookstore2.CartManager#addNewItemToCart(Order)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testAddNewItemToCart() throws Throwable {
		// Given
		CartManager underTest = new CartManager();

		// When
		Order order = mock(Order.class);
		underTest.addNewItemToCart(order);

		// Then - assertions for argument 1 of method addNewItemToCart(Order)
		assertNull(order.getBook());
		assertEquals(0, order.getQuantity());
		assertEquals(0L, order.getTimestamp());

		// Then - assertions for this instance of CartManager
		assertEquals(0, underTest.getCartId());
		assertNull(underTest.getItem());

	}

	/**
	 * Parasoft Jtest UTA: Test for getCart()
	 *
	 * @see com.parasoft.bookstore2.CartManager#getCart()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetCart() throws Throwable {
		// Given
		CartManager underTest = new CartManager();

		// When
		Map<Integer, List<Order>> result = underTest.getCart();

		// Then - assertions for result of method getCart()
		assertNotNull(result);
		assertEquals(0, result.size());

		// Then - assertions for this instance of CartManager
		assertNull(underTest.getItem());

	}

	/**
	 * Parasoft Jtest UTA: Test for getCartId()
	 *
	 * @see com.parasoft.bookstore2.CartManager#getCartId()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetCartId() throws Throwable {
		// Given
		CartManager underTest = new CartManager();

		// When
		int result = underTest.getCartId();

		// Then - assertions for result of method getCartId()
		assertEquals(0, result);

		// Then - assertions for this instance of CartManager
		assertNull(underTest.getItem());

	}

	/**
	 * Parasoft Jtest UTA: Test for getCartSize()
	 *
	 * @see com.parasoft.bookstore2.CartManager#getCartSize()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetCartSize() throws Throwable {
		// Given
		CartManager underTest = new CartManager();

		// When
		int result = underTest.getCartSize();

		// Then - assertions for result of method getCartSize()
		assertEquals(0, result);

		// Then - assertions for this instance of CartManager
		assertEquals(0, underTest.getCartId());
		assertNull(underTest.getItem());

	}

	/**
	 * Parasoft Jtest UTA: Test for getCartSize(int)
	 *
	 * @see com.parasoft.bookstore2.CartManager#getCartSize(int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetCartSize2() throws Throwable {
		// Given
		CartManager underTest = new CartManager();

		// When
		int cartId = 0; // UTA: default value
		int result = underTest.getCartSize(cartId);

		// Then - assertions for this instance of CartManager
		assertEquals(0, underTest.getCartId());
		assertNull(underTest.getItem());

	}

	/**
	 * Parasoft Jtest UTA: Test for getItem()
	 *
	 * @see com.parasoft.bookstore2.CartManager#getItem()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetItem() throws Throwable {
		// Given
		CartManager underTest = new CartManager();

		// When
		List<Order> result = underTest.getItem();

		// Then - assertions for result of method getItem()
		assertNull(result);

		// Then - assertions for this instance of CartManager
		assertEquals(0, underTest.getCartId());

	}

	/**
	 * Parasoft Jtest UTA: Test for getStaticCart_Id()
	 *
	 * @see com.parasoft.bookstore2.CartManager#getStaticCart_Id()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetStaticCart_Id() throws Throwable {
		// Given
		CartManager underTest = new CartManager();

		// When
		int result = underTest.getStaticCart_Id();

		// Then - assertions for result of method getStaticCart_Id()
		assertEquals(0, result);

		// Then - assertions for this instance of CartManager
		assertEquals(0, underTest.getCartId());
		assertNull(underTest.getItem());

	}

	/**
	 * Parasoft Jtest UTA: Test for removeEmptyMappings()
	 *
	 * @see com.parasoft.bookstore2.CartManager#removeEmptyMappings()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testRemoveEmptyMappings() throws Throwable {
		// Given
		CartManager underTest = new CartManager();

		// When
		underTest.removeEmptyMappings();

		// Then - assertions for this instance of CartManager
		assertEquals(0, underTest.getCartId());
		assertNull(underTest.getItem());

	}

	/**
	 * Parasoft Jtest UTA: Test for removeOrder(int)
	 *
	 * @see com.parasoft.bookstore2.CartManager#removeOrder(int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testRemoveOrder() throws Throwable {
		// Given
		CartManager underTest = new CartManager();

		// When
		int cartId = 0; // UTA: default value
		boolean result = underTest.removeOrder(cartId);

		// Then - assertions for result of method removeOrder(int)
		assertFalse(result);

		// Then - assertions for this instance of CartManager
		assertEquals(0, underTest.getCartId());
		assertNull(underTest.getItem());

	}

	/**
	 * Parasoft Jtest UTA: Test for setCartId(int)
	 *
	 * @see com.parasoft.bookstore2.CartManager#setCartId(int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetCartId() throws Throwable {
		// Given
		CartManager underTest = new CartManager();

		// When
		int cartId = 0; // UTA: default value
		underTest.setCartId(cartId);

		// Then - assertions for this instance of CartManager
		assertEquals(0, underTest.getCartId());
		assertNull(underTest.getItem());

	}

	/**
	 * Parasoft Jtest UTA: Test for setItem(List)
	 *
	 * @see com.parasoft.bookstore2.CartManager#setItem(List)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetItem() throws Throwable {
		// Given
		CartManager underTest = new CartManager();

		// When
		List<Order> list = new ArrayList<Order>(); // UTA: default value
		Order item = mock(Order.class);
		list.add(item);
		underTest.setItem(list);

		// Then - assertions for this instance of CartManager
		assertEquals(0, underTest.getCartId());
		assertNotNull(underTest.getItem());
		assertEquals(1, underTest.getItem().size());

	}

	/**
	 * Parasoft Jtest UTA: Test for updateExistingItem(int, int, int)
	 *
	 * @see com.parasoft.bookstore2.CartManager#updateExistingItem(int, int, int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testUpdateExistingItem() throws Throwable {
		// Given
		CartManager underTest = new CartManager();

		// When
		int cartId = 0; // UTA: default value
		int itemId = -1000; // UTA: provided value
		int quantity = -1000; // UTA: provided value
		Order result = underTest.updateExistingItem(cartId, itemId, quantity);

		// Then - assertions for this instance of CartManager
		assertEquals(0, underTest.getCartId());
		assertNull(underTest.getItem());

	}

	/**
	 * Parasoft Jtest UTA: Test for updateExistingItem(int, int, int)
	 *
	 * @see com.parasoft.bookstore2.CartManager#updateExistingItem(int, int, int)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = Exception.class)
	public void testUpdateExistingItem2() throws Throwable {
		// Given
		CartManager underTest = new CartManager();

		// When
		int cartId = 0; // UTA: default value
		int itemId = 0; // UTA: default value
		int quantity = 0; // UTA: default value
		underTest.updateExistingItem(cartId, itemId, quantity);

	}

	/**
	 * Parasoft Jtest UTA: Test for updateExistingItem(int, int, int)
	 *
	 * @see com.parasoft.bookstore2.CartManager#updateExistingItem(int, int, int)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = Exception.class)
	public void testUpdateExistingItem3() throws Throwable {
		// Given
		CartManager underTest = new CartManager();

		// When
		int cartId = 0; // UTA: default value
		int itemId = -1000; // UTA: provided value
		int quantity = -999; // UTA: provided value
		underTest.updateExistingItem(cartId, itemId, quantity);

	}
}