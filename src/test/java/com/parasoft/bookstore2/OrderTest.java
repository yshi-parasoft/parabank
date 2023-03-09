/**
 * 
 */
package com.parasoft.bookstore2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for Order
 *
 * @see com.parasoft.bookstore2.Order
 * @author devtest
 */
public class OrderTest {

	/**
	 * Parasoft Jtest UTA: Test for getBook()
	 *
	 * @see com.parasoft.bookstore2.Order#getBook()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetBook() throws Throwable {
		// Given
		Order underTest = new Order();

		// When
		Book result = underTest.getBook();

		// Then - assertions for result of method getBook()
		assertNull(result);

		// Then - assertions for this instance of Order
		assertEquals(0, underTest.getQuantity());

	}

	/**
	 * Parasoft Jtest UTA: Test for getDescription()
	 *
	 * @see com.parasoft.bookstore2.Order#getDescription()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetDescription() throws Throwable {
		// Given
		Order underTest = new Order();
		Book book = mockBook();
		underTest.setBook(book);

		// When
		String result = underTest.getDescription();

		// Then - assertions for result of method getDescription()

		// Then - assertions for this instance of Order
		assertNotNull(underTest.getBook());
		assertNull(underTest.getBook().getISBN());
		assertNull(underTest.getBook().getGenre());
		assertNull(underTest.getBook().getPublicationDate());
		assertNull(underTest.getBook().getAuthors());
		assertNull(underTest.getBook().getPublisher());
		assertEquals(0L, underTest.getBook().getTimestamp());
		assertNull(underTest.getBook().getProductInfo());
		assertEquals(0, underTest.getQuantity());

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
	 * Parasoft Jtest UTA: Test for getQuantity()
	 *
	 * @see com.parasoft.bookstore2.Order#getQuantity()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetQuantity() throws Throwable {
		// Given
		Order underTest = new Order();

		// When
		int result = underTest.getQuantity();

		// Then - assertions for result of method getQuantity()
		assertEquals(0, result);

		// Then - assertions for this instance of Order
		assertNull(underTest.getBook());

	}

	/**
	 * Parasoft Jtest UTA: Test for getTimestamp()
	 *
	 * @see com.parasoft.bookstore2.Order#getTimestamp()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetTimestamp() throws Throwable {
		// Given
		Order underTest = new Order();

		// When
		long result = underTest.getTimestamp();

		// Then - assertions for result of method getTimestamp()

		// Then - assertions for this instance of Order
		assertNull(underTest.getBook());
		assertEquals(0, underTest.getQuantity());

	}

	/**
	 * Parasoft Jtest UTA: Test for modifyCount(int)
	 *
	 * @see com.parasoft.bookstore2.Order#modifyCount(int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testModifyCount() throws Throwable {
		// Given
		Order underTest = new Order();

		// When
		int amount = 0; // UTA: default value
		underTest.modifyCount(amount);

		// Then - assertions for this instance of Order
		assertNull(underTest.getBook());
		assertEquals(0, underTest.getQuantity());

	}

	/**
	 * Parasoft Jtest UTA: Test for refreshTimestamp()
	 *
	 * @see com.parasoft.bookstore2.Order#refreshTimestamp()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testRefreshTimestamp() throws Throwable {
		// Given
		Order underTest = new Order();

		// When
		underTest.refreshTimestamp();

		// Then - assertions for this instance of Order
		assertNull(underTest.getBook());
		assertEquals(0, underTest.getQuantity());

	}

	/**
	 * Parasoft Jtest UTA: Test for setQuantity(int)
	 *
	 * @see com.parasoft.bookstore2.Order#setQuantity(int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetQuantity() throws Throwable {
		// Given
		Order underTest = new Order();

		// When
		int quantity = 0; // UTA: default value
		underTest.setQuantity(quantity);

		// Then - assertions for this instance of Order
		assertNull(underTest.getBook());
		assertEquals(0, underTest.getQuantity());

	}
}