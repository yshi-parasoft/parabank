/**
 * 
 */
package com.parasoft.bookstore2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;

import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for TempBook
 *
 * @see com.parasoft.bookstore2.TempBook
 * @author devtest
 */
public class TempBookTest {

	/**
	 * Parasoft Jtest UTA: Test for getBook()
	 *
	 * @see com.parasoft.bookstore2.TempBook#getBook()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetBook() throws Throwable {
		// Given
		TempBook underTest = new TempBook();

		// When
		Book result = underTest.getBook();

		// Then - assertions for result of method getBook()
		assertNull(result);

		// Then - assertions for this instance of TempBook
		assertEquals(0L, underTest.getTimestamp());

	}

	/**
	 * Parasoft Jtest UTA: Test for getTimestamp()
	 *
	 * @see com.parasoft.bookstore2.TempBook#getTimestamp()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetTimestamp() throws Throwable {
		// Given
		TempBook underTest = new TempBook();

		// When
		long result = underTest.getTimestamp();

		// Then - assertions for result of method getTimestamp()
		assertEquals(0L, result);

		// Then - assertions for this instance of TempBook
		assertNull(underTest.getBook());

	}

	/**
	 * Parasoft Jtest UTA: Test for refreshTimestamp()
	 *
	 * @see com.parasoft.bookstore2.TempBook#refreshTimestamp()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testRefreshTimestamp() throws Throwable {
		// Given
		TempBook underTest = new TempBook();

		// When
		underTest.refreshTimestamp();

		// Then - assertions for this instance of TempBook
		assertNull(underTest.getBook());

	}

	/**
	 * Parasoft Jtest UTA: Test for setBook(Book)
	 *
	 * @see com.parasoft.bookstore2.TempBook#setBook(Book)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetBook() throws Throwable {
		// Given
		TempBook underTest = new TempBook();

		// When
		Book book = mock(Book.class);
		underTest.setBook(book);

		// Then - assertions for argument 1 of method setBook(Book)
		assertNull(book.getISBN());
		assertNull(book.getGenre());
		assertNull(book.getPublicationDate());
		assertNull(book.getDescription());
		assertNull(book.getAuthors());
		assertNull(book.getPublisher());
		assertEquals(0L, book.getTimestamp());
		assertNull(book.getProductInfo());

		// Then - assertions for this instance of TempBook
		assertNotNull(underTest.getBook());
		assertNull(underTest.getBook().getISBN());
		assertNull(underTest.getBook().getGenre());
		assertNull(underTest.getBook().getPublicationDate());
		assertNull(underTest.getBook().getDescription());
		assertNull(underTest.getBook().getAuthors());
		assertNull(underTest.getBook().getPublisher());
		assertEquals(0L, underTest.getBook().getTimestamp());
		assertNull(underTest.getBook().getProductInfo());
		assertEquals(0L, underTest.getTimestamp());

	}

	/**
	 * Parasoft Jtest UTA: Test for setTimestamp(long)
	 *
	 * @see com.parasoft.bookstore2.TempBook#setTimestamp(long)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetTimestamp() throws Throwable {
		// Given
		TempBook underTest = new TempBook();

		// When
		long timestamp = 0L; // UTA: default value
		underTest.setTimestamp(timestamp);

		// Then - assertions for this instance of TempBook
		assertNull(underTest.getBook());
		assertEquals(0L, underTest.getTimestamp());

	}
}