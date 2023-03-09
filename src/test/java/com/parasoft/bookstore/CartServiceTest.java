/**
 * 
 */
package com.parasoft.bookstore;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;

import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for CartService
 *
 * @see com.parasoft.bookstore.CartService
 * @author devtest
 */
public class CartServiceTest {

	/**
	 * Parasoft Jtest UTA: Test for addItemToCart(Integer, int, int)
	 *
	 * @see com.parasoft.bookstore.CartService#addItemToCart(Integer, int, int)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = Exception.class)
	public void testAddItemToCart() throws Throwable {
		// Given
		CartService underTest = new CartService();

		// When
		Integer cartId = 0; // UTA: default value
		int itemId = 0; // UTA: default value
		int quantity = -1; // UTA: provided value
		underTest.addItemToCart(cartId, itemId, quantity);

	}

	/**
	 * Parasoft Jtest UTA: Test for addNewItemToInventory(Book)
	 *
	 * @see com.parasoft.bookstore.CartService#addNewItemToInventory(Book)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testAddNewItemToInventory() throws Throwable {
		// Given
		CartService underTest = new CartService();

		// When
		Book book = mock(Book.class);
		Book result = underTest.addNewItemToInventory(book);

		// Then - assertions for argument 1 of method addNewItemToInventory(Book)
		assertEquals(0, book.getId());
		assertNull(book.getName());
		assertEquals(0, book.getStockQuantity());
		assertNull(book.getPrice());
		assertNull(book.getISBN());
		assertNull(book.getPublicationDate());
		assertNull(book.getDescription());
		assertNull(book.getAuthors());
		assertNull(book.getPublisher());
		assertEquals(0L, book.getTimestamp());

		// Then - assertions for result of method addNewItemToInventory(Book)
		assertNotNull(result);
		assertEquals(0, result.getId());
		assertNull(result.getName());
		assertEquals(0, result.getStockQuantity());
		assertNull(result.getPrice());
		assertNull(result.getISBN());
		assertNull(result.getPublicationDate());
		assertNull(result.getDescription());
		assertNull(result.getAuthors());
		assertNull(result.getPublisher());
		assertEquals(0L, result.getTimestamp());

	}

	/**
	 * Parasoft Jtest UTA: Test for getItemByTitle(String)
	 *
	 * @see com.parasoft.bookstore.CartService#getItemByTitle(String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetItemByTitle() throws Throwable {
		// Given
		CartService underTest = new CartService();

		// When
		String title = "title"; // UTA: default value
		Book[] result = underTest.getItemByTitle(title);

	}

	/**
	 * Parasoft Jtest UTA: Test for getItemsInCart(int)
	 *
	 * @see com.parasoft.bookstore.CartService#getItemsInCart(int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetItemsInCart() throws Throwable {
		// Given
		CartService underTest = new CartService();

		// When
		int cartId = 0; // UTA: default value
		CartManager result = underTest.getItemsInCart(cartId);

	}

	/**
	 * Parasoft Jtest UTA: Test for getStaticCart_Id()
	 *
	 * @see com.parasoft.bookstore.CartService#getStaticCart_Id()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetStaticCart_Id() throws Throwable {
		// Given
		CartService underTest = new CartService();

		// When
		int result = underTest.getStaticCart_Id();

		// Then - assertions for result of method getStaticCart_Id()
		assertEquals(0, result);

	}

	/**
	 * Parasoft Jtest UTA: Test for removeExpiredOrdersAndBooks()
	 *
	 * @see com.parasoft.bookstore.CartService#removeExpiredOrdersAndBooks()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testRemoveExpiredOrdersAndBooks() throws Throwable {
		// Given
		CartService underTest = new CartService();

		// When
		underTest.removeExpiredOrdersAndBooks();

	}

	/**
	 * Parasoft Jtest UTA: Test for submitOrder(int)
	 *
	 * @see com.parasoft.bookstore.CartService#submitOrder(int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSubmitOrder() throws Throwable {
		// Given
		CartService underTest = new CartService();

		// When
		int cartId = 0; // UTA: default value
		SubmittedOrder result = underTest.submitOrder(cartId);

		// Then - assertions for result of method submitOrder(int)
		assertNotNull(result);
		assertFalse(result.getSuccess());
		assertNotNull(result.getOrderTime());

	}

	/**
	 * Parasoft Jtest UTA: Test for updateItemInCart(int, int, int)
	 *
	 * @see com.parasoft.bookstore.CartService#updateItemInCart(int, int, int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testUpdateItemInCart() throws Throwable {
		// Given
		CartService underTest = new CartService();

		// When
		int cartId = 0; // UTA: default value
		int itemId = 0; // UTA: default value
		int quantity = 0; // UTA: provided value
		DisplayOrder result = underTest.updateItemInCart(cartId, itemId, quantity);

	}

	/**
	 * Parasoft Jtest UTA: Test for updateItemInCart(int, int, int)
	 *
	 * @see com.parasoft.bookstore.CartService#updateItemInCart(int, int, int)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = Exception.class)
	public void testUpdateItemInCart2() throws Throwable {
		// Given
		CartService underTest = new CartService();

		// When
		int cartId = 0; // UTA: default value
		int itemId = 0; // UTA: default value
		int quantity = -1; // UTA: provided value
		underTest.updateItemInCart(cartId, itemId, quantity);

	}
}