/**
 * 
 */
package com.parasoft.bookstore;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;

import java.math.BigDecimal;
import java.util.Date;
import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for Book
 *
 * @see com.parasoft.bookstore.Book
 * @author devtest
 */
public class BookTest {

	/**
	 * Parasoft Jtest UTA: Test for getAuthors()
	 *
	 * @see com.parasoft.bookstore.Book#getAuthors()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetAuthors() throws Throwable {
		// Given
		Book underTest = new Book();

		// When
		String[] result = underTest.getAuthors();

		// Then - assertions for result of method getAuthors()
		assertNull(result);

		// Then - assertions for this instance of Book
		assertEquals(0, underTest.getId());
		assertNull(underTest.getName());
		assertEquals(0, underTest.getStockQuantity());
		assertNull(underTest.getPrice());
		assertNull(underTest.getISBN());
		assertNull(underTest.getPublicationDate());
		assertNull(underTest.getDescription());
		assertNull(underTest.getPublisher());
		assertEquals(0L, underTest.getTimestamp());

	}

	/**
	 * Parasoft Jtest UTA: Test for getDescription()
	 *
	 * @see com.parasoft.bookstore.Book#getDescription()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetDescription() throws Throwable {
		// Given
		Book underTest = new Book();

		// When
		String result = underTest.getDescription();

		// Then - assertions for result of method getDescription()
		assertNull(result);

		// Then - assertions for this instance of Book
		assertEquals(0, underTest.getId());
		assertNull(underTest.getName());
		assertEquals(0, underTest.getStockQuantity());
		assertNull(underTest.getPrice());
		assertNull(underTest.getISBN());
		assertNull(underTest.getPublicationDate());
		assertNull(underTest.getAuthors());
		assertNull(underTest.getPublisher());
		assertEquals(0L, underTest.getTimestamp());

	}

	/**
	 * Parasoft Jtest UTA: Test for getISBN()
	 *
	 * @see com.parasoft.bookstore.Book#getISBN()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetISBN() throws Throwable {
		// Given
		Book underTest = new Book();

		// When
		String result = underTest.getISBN();

		// Then - assertions for result of method getISBN()
		assertNull(result);

		// Then - assertions for this instance of Book
		assertEquals(0, underTest.getId());
		assertNull(underTest.getName());
		assertEquals(0, underTest.getStockQuantity());
		assertNull(underTest.getPrice());
		assertNull(underTest.getPublicationDate());
		assertNull(underTest.getDescription());
		assertNull(underTest.getAuthors());
		assertNull(underTest.getPublisher());
		assertEquals(0L, underTest.getTimestamp());

	}

	/**
	 * Parasoft Jtest UTA: Test for getPublicationDate()
	 *
	 * @see com.parasoft.bookstore.Book#getPublicationDate()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetPublicationDate() throws Throwable {
		// Given
		Book underTest = new Book();

		// When
		Date result = underTest.getPublicationDate();

		// Then - assertions for result of method getPublicationDate()
		assertNull(result);

		// Then - assertions for this instance of Book
		assertEquals(0, underTest.getId());
		assertNull(underTest.getName());
		assertEquals(0, underTest.getStockQuantity());
		assertNull(underTest.getPrice());
		assertNull(underTest.getISBN());
		assertNull(underTest.getDescription());
		assertNull(underTest.getAuthors());
		assertNull(underTest.getPublisher());
		assertEquals(0L, underTest.getTimestamp());

	}

	/**
	 * Parasoft Jtest UTA: Test for getPublisher()
	 *
	 * @see com.parasoft.bookstore.Book#getPublisher()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetPublisher() throws Throwable {
		// Given
		Book underTest = new Book();

		// When
		String result = underTest.getPublisher();

		// Then - assertions for result of method getPublisher()
		assertNull(result);

		// Then - assertions for this instance of Book
		assertEquals(0, underTest.getId());
		assertNull(underTest.getName());
		assertEquals(0, underTest.getStockQuantity());
		assertNull(underTest.getPrice());
		assertNull(underTest.getISBN());
		assertNull(underTest.getPublicationDate());
		assertNull(underTest.getDescription());
		assertNull(underTest.getAuthors());
		assertEquals(0L, underTest.getTimestamp());

	}

	/**
	 * Parasoft Jtest UTA: Test for getTimestamp()
	 *
	 * @see com.parasoft.bookstore.Book#getTimestamp()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetTimestamp() throws Throwable {
		// Given
		Book underTest = new Book();

		// When
		long result = underTest.getTimestamp();

		// Then - assertions for result of method getTimestamp()
		assertEquals(0L, result);

		// Then - assertions for this instance of Book
		assertEquals(0, underTest.getId());
		assertNull(underTest.getName());
		assertEquals(0, underTest.getStockQuantity());
		assertNull(underTest.getPrice());
		assertNull(underTest.getISBN());
		assertNull(underTest.getPublicationDate());
		assertNull(underTest.getDescription());
		assertNull(underTest.getAuthors());
		assertNull(underTest.getPublisher());

	}

	/**
	 * Parasoft Jtest UTA: Test for refreshTimestamp()
	 *
	 * @see com.parasoft.bookstore.Book#refreshTimestamp()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testRefreshTimestamp() throws Throwable {
		// Given
		Book underTest = new Book();

		// When
		underTest.refreshTimestamp();

		// Then - assertions for this instance of Book
		assertEquals(0, underTest.getId());
		assertNull(underTest.getName());
		assertEquals(0, underTest.getStockQuantity());
		assertNull(underTest.getPrice());
		assertNull(underTest.getISBN());
		assertNull(underTest.getPublicationDate());
		assertNull(underTest.getDescription());
		assertNull(underTest.getAuthors());
		assertNull(underTest.getPublisher());

	}

	/**
	 * Parasoft Jtest UTA: Test for setAuthors(String[])
	 *
	 * @see com.parasoft.bookstore.Book#setAuthors(String[])
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetAuthors() throws Throwable {
		// Given
		Book underTest = new Book();

		// When
		String[] authors = new java.lang.String[0]; // UTA: default value
		underTest.setAuthors(authors);

		// Then - assertions for this instance of Book
		assertEquals(0, underTest.getId());
		assertNull(underTest.getName());
		assertEquals(0, underTest.getStockQuantity());
		assertNull(underTest.getPrice());
		assertNull(underTest.getISBN());
		assertNull(underTest.getPublicationDate());
		assertNull(underTest.getDescription());
		assertNotNull(underTest.getAuthors());
		assertEquals(0, underTest.getAuthors().length);
		assertNull(underTest.getPublisher());
		assertEquals(0L, underTest.getTimestamp());

	}

	/**
	 * Parasoft Jtest UTA: Test for setDescription(String)
	 *
	 * @see com.parasoft.bookstore.Book#setDescription(String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetDescription() throws Throwable {
		// Given
		Book underTest = new Book();

		// When
		String description = "description"; // UTA: default value
		underTest.setDescription(description);

		// Then - assertions for this instance of Book
		assertEquals(0, underTest.getId());
		assertNull(underTest.getName());
		assertEquals(0, underTest.getStockQuantity());
		assertNull(underTest.getPrice());
		assertNull(underTest.getISBN());
		assertNull(underTest.getPublicationDate());
		assertEquals("description", underTest.getDescription());
		assertNull(underTest.getAuthors());
		assertNull(underTest.getPublisher());
		assertEquals(0L, underTest.getTimestamp());

	}

	/**
	 * Parasoft Jtest UTA: Test for setISBN(String)
	 *
	 * @see com.parasoft.bookstore.Book#setISBN(String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetISBN() throws Throwable {
		// Given
		Book underTest = new Book();

		// When
		String isbn = "isbn"; // UTA: default value
		underTest.setISBN(isbn);

		// Then - assertions for this instance of Book
		assertEquals(0, underTest.getId());
		assertNull(underTest.getName());
		assertEquals(0, underTest.getStockQuantity());
		assertNull(underTest.getPrice());
		assertEquals("isbn", underTest.getISBN());
		assertNull(underTest.getPublicationDate());
		assertNull(underTest.getDescription());
		assertNull(underTest.getAuthors());
		assertNull(underTest.getPublisher());
		assertEquals(0L, underTest.getTimestamp());

	}

	/**
	 * Parasoft Jtest UTA: Test for setPublicationDate(Date)
	 *
	 * @see com.parasoft.bookstore.Book#setPublicationDate(Date)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetPublicationDate() throws Throwable {
		// Given
		Book underTest = new Book();

		// When
		Date publication_date = mock(Date.class);
		underTest.setPublicationDate(publication_date);

		// Then - assertions for this instance of Book
		assertEquals(0, underTest.getId());
		assertNull(underTest.getName());
		assertEquals(0, underTest.getStockQuantity());
		assertNull(underTest.getPrice());
		assertNull(underTest.getISBN());
		assertNotNull(underTest.getPublicationDate());
		assertNull(underTest.getDescription());
		assertNull(underTest.getAuthors());
		assertNull(underTest.getPublisher());
		assertEquals(0L, underTest.getTimestamp());

	}

	/**
	 * Parasoft Jtest UTA: Test for setPublisher(String)
	 *
	 * @see com.parasoft.bookstore.Book#setPublisher(String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetPublisher() throws Throwable {
		// Given
		Book underTest = new Book();

		// When
		String publisher = "publisher"; // UTA: default value
		underTest.setPublisher(publisher);

		// Then - assertions for this instance of Book
		assertEquals(0, underTest.getId());
		assertNull(underTest.getName());
		assertEquals(0, underTest.getStockQuantity());
		assertNull(underTest.getPrice());
		assertNull(underTest.getISBN());
		assertNull(underTest.getPublicationDate());
		assertNull(underTest.getDescription());
		assertNull(underTest.getAuthors());
		assertEquals("publisher", underTest.getPublisher());
		assertEquals(0L, underTest.getTimestamp());

	}

	/**
	 * Parasoft Jtest UTA: Test for getId()
	 *
	 * @see com.parasoft.bookstore.Item#getId()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetId() throws Throwable {
		// Given
		Book underTest = new Book();

		// When
		int result = underTest.getId();

		// Then - assertions for result of method getId()
		assertEquals(0, result);

		// Then - assertions for this instance of Book
		assertNull(underTest.getName());
		assertEquals(0, underTest.getStockQuantity());
		assertNull(underTest.getPrice());
		assertNull(underTest.getISBN());
		assertNull(underTest.getPublicationDate());
		assertNull(underTest.getDescription());
		assertNull(underTest.getAuthors());
		assertNull(underTest.getPublisher());
		assertEquals(0L, underTest.getTimestamp());

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
		Book underTest = new Book();

		// When
		String result = underTest.getName();

		// Then - assertions for result of method getName()
		assertNull(result);

		// Then - assertions for this instance of Book
		assertEquals(0, underTest.getId());
		assertEquals(0, underTest.getStockQuantity());
		assertNull(underTest.getPrice());
		assertNull(underTest.getISBN());
		assertNull(underTest.getPublicationDate());
		assertNull(underTest.getDescription());
		assertNull(underTest.getAuthors());
		assertNull(underTest.getPublisher());
		assertEquals(0L, underTest.getTimestamp());

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
		Book underTest = new Book();

		// When
		BigDecimal result = underTest.getPrice();

		// Then - assertions for result of method getPrice()
		assertNull(result);

		// Then - assertions for this instance of Book
		assertEquals(0, underTest.getId());
		assertNull(underTest.getName());
		assertEquals(0, underTest.getStockQuantity());
		assertNull(underTest.getISBN());
		assertNull(underTest.getPublicationDate());
		assertNull(underTest.getDescription());
		assertNull(underTest.getAuthors());
		assertNull(underTest.getPublisher());
		assertEquals(0L, underTest.getTimestamp());

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
		Book underTest = new Book();

		// When
		int result = underTest.getStockQuantity();

		// Then - assertions for result of method getStockQuantity()
		assertEquals(0, result);

		// Then - assertions for this instance of Book
		assertEquals(0, underTest.getId());
		assertNull(underTest.getName());
		assertNull(underTest.getPrice());
		assertNull(underTest.getISBN());
		assertNull(underTest.getPublicationDate());
		assertNull(underTest.getDescription());
		assertNull(underTest.getAuthors());
		assertNull(underTest.getPublisher());
		assertEquals(0L, underTest.getTimestamp());

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
		Book underTest = new Book();
		BigDecimal price = BigDecimal.ZERO; // UTA: default value
		underTest.setPrice(price);

		// When
		BigDecimal amount = BigDecimal.ZERO; // UTA: default value
		underTest.inflatePrice(amount);

		// Then - assertions for this instance of Book
		assertEquals(0, underTest.getId());
		assertNull(underTest.getName());
		assertEquals(0, underTest.getStockQuantity());
		assertNotNull(underTest.getPrice());
		assertEquals(0d, underTest.getPrice().doubleValue(), 0.0);
		assertNull(underTest.getISBN());
		assertNull(underTest.getPublicationDate());
		assertNull(underTest.getDescription());
		assertNull(underTest.getAuthors());
		assertNull(underTest.getPublisher());
		assertEquals(0L, underTest.getTimestamp());

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
		Book underTest = new Book();

		// When
		int id = 0; // UTA: default value
		underTest.setId(id);

		// Then - assertions for this instance of Book
		assertEquals(0, underTest.getId());
		assertNull(underTest.getName());
		assertEquals(0, underTest.getStockQuantity());
		assertNull(underTest.getPrice());
		assertNull(underTest.getISBN());
		assertNull(underTest.getPublicationDate());
		assertNull(underTest.getDescription());
		assertNull(underTest.getAuthors());
		assertNull(underTest.getPublisher());
		assertEquals(0L, underTest.getTimestamp());

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
		Book underTest = new Book();

		// When
		String title = "title"; // UTA: default value
		underTest.setName(title);

		// Then - assertions for this instance of Book
		assertEquals(0, underTest.getId());
		assertEquals("title", underTest.getName());
		assertEquals(0, underTest.getStockQuantity());
		assertNull(underTest.getPrice());
		assertNull(underTest.getISBN());
		assertNull(underTest.getPublicationDate());
		assertNull(underTest.getDescription());
		assertNull(underTest.getAuthors());
		assertNull(underTest.getPublisher());
		assertEquals(0L, underTest.getTimestamp());

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
		Book underTest = new Book();

		// When
		int quantity_in_stock = 0; // UTA: default value
		underTest.setStockQuantity(quantity_in_stock);

		// Then - assertions for this instance of Book
		assertEquals(0, underTest.getId());
		assertNull(underTest.getName());
		assertEquals(0, underTest.getStockQuantity());
		assertNull(underTest.getPrice());
		assertNull(underTest.getISBN());
		assertNull(underTest.getPublicationDate());
		assertNull(underTest.getDescription());
		assertNull(underTest.getAuthors());
		assertNull(underTest.getPublisher());
		assertEquals(0L, underTest.getTimestamp());

	}
}