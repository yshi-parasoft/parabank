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

import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for CartService
 *
 * @see com.parasoft.bookstore2.CartService
 * @author devtest
 */
public class CartServiceTest {

	/**
	 * Parasoft Jtest UTA: Test for addItemToCart(Integer, int, int)
	 *
	 * @see com.parasoft.bookstore2.CartService#addItemToCart(Integer, int, int)
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
	 * @see com.parasoft.bookstore2.CartService#addNewItemToInventory(Book)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testAddNewItemToInventory() throws Throwable {
		// Given
		CartService underTest = new CartService();

		// When
		Book book = mockBook();
		Book result = underTest.addNewItemToInventory(book);

		// Then - assertions for argument 1 of method addNewItemToInventory(Book)
		assertNull(book.getISBN());
		assertNull(book.getGenre());
		assertNull(book.getPublicationDate());
		assertNull(book.getDescription());
		assertNull(book.getAuthors());
		assertNull(book.getPublisher());
		assertEquals(0L, book.getTimestamp());
		assertNull(book.getProductInfo());

		// Then - assertions for result of method addNewItemToInventory(Book)
		assertNotNull(result);
		assertNull(result.getISBN());
		assertNull(result.getGenre());
		assertNull(result.getPublicationDate());
		assertNull(result.getDescription());
		assertNull(result.getAuthors());
		assertNull(result.getPublisher());
		assertEquals(0L, result.getTimestamp());
		assertNull(result.getProductInfo());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of Book
	 */
	private static Book mockBook() throws Throwable {
		Book book = mock(Book.class);
		ProductInfo getProductInfoResult = mock(ProductInfo.class);
		when(book.getProductInfo()).thenReturn(getProductInfoResult);
		return book;
	}

	/**
	 * Parasoft Jtest UTA: Test for addNewItemToInventory(Book)
	 *
	 * @see com.parasoft.bookstore2.CartService#addNewItemToInventory(Book)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testAddNewItemToInventory2() throws Throwable {
		// Given
		CartService underTest = new CartService();

		// When
		Book book = mockBook2();
		Book result = underTest.addNewItemToInventory(book);

		// Then - assertions for argument 1 of method addNewItemToInventory(Book)
		assertNull(book.getISBN());
		assertNull(book.getGenre());
		assertNull(book.getPublicationDate());
		assertNull(book.getDescription());
		assertNull(book.getAuthors());
		assertNull(book.getPublisher());
		assertEquals(0L, book.getTimestamp());
		assertNull(book.getProductInfo());

		// Then - assertions for result of method addNewItemToInventory(Book)
		assertNotNull(result);
		assertNull(result.getISBN());
		assertNull(result.getGenre());
		assertNull(result.getPublicationDate());
		assertNull(result.getDescription());
		assertNull(result.getAuthors());
		assertNull(result.getPublisher());
		assertEquals(0L, result.getTimestamp());
		assertNull(result.getProductInfo());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of Book
	 */
	private static Book mockBook2() throws Throwable {
		Book book = mock(Book.class);
		ProductInfo getProductInfoResult = mock(ProductInfo.class);
		ProductInfo getProductInfoResult2 = mock(ProductInfo.class);
		when(book.getProductInfo()).thenReturn(getProductInfoResult, getProductInfoResult2);
		return book;
	}

	/**
	 * Parasoft Jtest UTA: Test for getItemByTitle(String)
	 *
	 * @see com.parasoft.bookstore2.CartService#getItemByTitle(String)
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
	 * @see com.parasoft.bookstore2.CartService#getItemsInCart(int)
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
	 * @see com.parasoft.bookstore2.CartService#getStaticCart_Id()
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
	 * @see com.parasoft.bookstore2.CartService#removeExpiredOrdersAndBooks()
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
	 * @see com.parasoft.bookstore2.CartService#submitOrder(int)
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
	 * @see com.parasoft.bookstore2.CartService#updateItemInCart(int, int, int)
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
	 * @see com.parasoft.bookstore2.CartService#updateItemInCart(int, int, int)
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