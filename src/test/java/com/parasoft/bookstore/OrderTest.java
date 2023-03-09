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
 * Parasoft Jtest UTA: Test class for Order
 *
 * @see com.parasoft.bookstore.Order
 * @author devtest
 */
public class OrderTest {

	/**
	 * Parasoft Jtest UTA: Test for getBook()
	 *
	 * @see com.parasoft.bookstore.Order#getBook()
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
	 * Parasoft Jtest UTA: Test for getQuantity()
	 *
	 * @see com.parasoft.bookstore.Order#getQuantity()
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
	 * @see com.parasoft.bookstore.Order#getTimestamp()
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
	 * @see com.parasoft.bookstore.Order#modifyCount(int)
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
	 * @see com.parasoft.bookstore.Order#refreshTimestamp()
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
	 * Parasoft Jtest UTA: Test for setBook(Book)
	 *
	 * @see com.parasoft.bookstore.Order#setBook(Book)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetBook() throws Throwable {
		// Given
		Order underTest = new Order();

		// When
		Book book = mock(Book.class);
		underTest.setBook(book);

		// Then - assertions for argument 1 of method setBook(Book)
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

		// Then - assertions for this instance of Order
		assertNotNull(underTest.getBook());
		assertEquals(0, underTest.getBook().getId());
		assertNull(underTest.getBook().getName());
		assertEquals(0, underTest.getBook().getStockQuantity());
		assertNull(underTest.getBook().getPrice());
		assertNull(underTest.getBook().getISBN());
		assertNull(underTest.getBook().getPublicationDate());
		assertNull(underTest.getBook().getDescription());
		assertNull(underTest.getBook().getAuthors());
		assertNull(underTest.getBook().getPublisher());
		assertEquals(0L, underTest.getBook().getTimestamp());
		assertEquals(0, underTest.getQuantity());

	}

	/**
	 * Parasoft Jtest UTA: Test for setQuantity(int)
	 *
	 * @see com.parasoft.bookstore.Order#setQuantity(int)
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