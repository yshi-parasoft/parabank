/**
 * 
 */
package com.parasoft.bookstore2;

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
 * @see com.parasoft.bookstore2.Book
 * @author devtest
 */
public class BookTest {

	/**
	 * Parasoft Jtest UTA: Test for getAuthors()
	 *
	 * @see com.parasoft.bookstore2.Book#getAuthors()
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
		assertNull(underTest.getISBN());
		assertNull(underTest.getGenre());
		assertNull(underTest.getPublicationDate());
		assertNull(underTest.getDescription());
		assertNull(underTest.getPublisher());
		assertEquals(0L, underTest.getTimestamp());
		assertNull(underTest.getProductInfo());

	}

	/**
	 * Parasoft Jtest UTA: Test for getDescription()
	 *
	 * @see com.parasoft.bookstore2.Book#getDescription()
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
		assertNull(underTest.getISBN());
		assertNull(underTest.getGenre());
		assertNull(underTest.getPublicationDate());
		assertNull(underTest.getAuthors());
		assertNull(underTest.getPublisher());
		assertEquals(0L, underTest.getTimestamp());
		assertNull(underTest.getProductInfo());

	}

	/**
	 * Parasoft Jtest UTA: Test for getGenre()
	 *
	 * @see com.parasoft.bookstore2.Book#getGenre()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetGenre() throws Throwable {
		// Given
		Book underTest = new Book();

		// When
		String result = underTest.getGenre();

		// Then - assertions for result of method getGenre()
		assertNull(result);

		// Then - assertions for this instance of Book
		assertNull(underTest.getISBN());
		assertNull(underTest.getPublicationDate());
		assertNull(underTest.getDescription());
		assertNull(underTest.getAuthors());
		assertNull(underTest.getPublisher());
		assertEquals(0L, underTest.getTimestamp());
		assertNull(underTest.getProductInfo());

	}

	/**
	 * Parasoft Jtest UTA: Test for getISBN()
	 *
	 * @see com.parasoft.bookstore2.Book#getISBN()
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
		assertNull(underTest.getGenre());
		assertNull(underTest.getPublicationDate());
		assertNull(underTest.getDescription());
		assertNull(underTest.getAuthors());
		assertNull(underTest.getPublisher());
		assertEquals(0L, underTest.getTimestamp());
		assertNull(underTest.getProductInfo());

	}

	/**
	 * Parasoft Jtest UTA: Test for getProductInfo()
	 *
	 * @see com.parasoft.bookstore2.Book#getProductInfo()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetProductInfo() throws Throwable {
		// Given
		Book underTest = new Book();

		// When
		ProductInfo result = underTest.getProductInfo();

		// Then - assertions for result of method getProductInfo()
		assertNull(result);

		// Then - assertions for this instance of Book
		assertNull(underTest.getISBN());
		assertNull(underTest.getGenre());
		assertNull(underTest.getPublicationDate());
		assertNull(underTest.getDescription());
		assertNull(underTest.getAuthors());
		assertNull(underTest.getPublisher());
		assertEquals(0L, underTest.getTimestamp());

	}

	/**
	 * Parasoft Jtest UTA: Test for getPublicationDate()
	 *
	 * @see com.parasoft.bookstore2.Book#getPublicationDate()
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
		assertNull(underTest.getISBN());
		assertNull(underTest.getGenre());
		assertNull(underTest.getDescription());
		assertNull(underTest.getAuthors());
		assertNull(underTest.getPublisher());
		assertEquals(0L, underTest.getTimestamp());
		assertNull(underTest.getProductInfo());

	}

	/**
	 * Parasoft Jtest UTA: Test for getPublisher()
	 *
	 * @see com.parasoft.bookstore2.Book#getPublisher()
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
		assertNull(underTest.getISBN());
		assertNull(underTest.getGenre());
		assertNull(underTest.getPublicationDate());
		assertNull(underTest.getDescription());
		assertNull(underTest.getAuthors());
		assertEquals(0L, underTest.getTimestamp());
		assertNull(underTest.getProductInfo());

	}

	/**
	 * Parasoft Jtest UTA: Test for getTimestamp()
	 *
	 * @see com.parasoft.bookstore2.Book#getTimestamp()
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
		assertNull(underTest.getISBN());
		assertNull(underTest.getGenre());
		assertNull(underTest.getPublicationDate());
		assertNull(underTest.getDescription());
		assertNull(underTest.getAuthors());
		assertNull(underTest.getPublisher());
		assertNull(underTest.getProductInfo());

	}

	/**
	 * Parasoft Jtest UTA: Test for inflatePrice(BigDecimal)
	 *
	 * @see com.parasoft.bookstore2.Book#inflatePrice(BigDecimal)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testInflatePrice() throws Throwable {
		// Given
		String isbn = "isbn"; // UTA: default value
		String genre = "genre"; // UTA: default value
		Date year = mock(Date.class);
		String[] authors = new java.lang.String[0]; // UTA: default value
		String publisher = "publisher"; // UTA: default value
		String description = "description"; // UTA: default value
		ProductInfo product = mock(ProductInfo.class);
		Book underTest = new Book(isbn, genre, year, authors, publisher, description, product);

		// When
		BigDecimal bigDecimal = BigDecimal.ZERO; // UTA: default value
		underTest.inflatePrice(bigDecimal);

		// Then - assertions for this instance of Book
		assertEquals("isbn", underTest.getISBN());
		assertEquals("genre", underTest.getGenre());
		assertNotNull(underTest.getPublicationDate());
		assertEquals("description", underTest.getDescription());
		assertNotNull(underTest.getAuthors());
		assertEquals(0, underTest.getAuthors().length);
		assertEquals("publisher", underTest.getPublisher());
		assertEquals(0L, underTest.getTimestamp());
		assertNotNull(underTest.getProductInfo());
		assertEquals(0, underTest.getProductInfo().getId());
		assertNull(underTest.getProductInfo().toString());
		assertEquals(0, underTest.getProductInfo().getStockQuantity());
		assertNull(underTest.getProductInfo().getAmount());

	}

	/**
	 * Parasoft Jtest UTA: Test for refreshTimestamp()
	 *
	 * @see com.parasoft.bookstore2.Book#refreshTimestamp()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testRefreshTimestamp() throws Throwable {
		// Given
		Book underTest = new Book();

		// When
		underTest.refreshTimestamp();

		// Then - assertions for this instance of Book
		assertNull(underTest.getISBN());
		assertNull(underTest.getGenre());
		assertNull(underTest.getPublicationDate());
		assertNull(underTest.getDescription());
		assertNull(underTest.getAuthors());
		assertNull(underTest.getPublisher());
		assertNull(underTest.getProductInfo());

	}

	/**
	 * Parasoft Jtest UTA: Test for setAuthors(String[])
	 *
	 * @see com.parasoft.bookstore2.Book#setAuthors(String[])
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
		assertNull(underTest.getISBN());
		assertNull(underTest.getGenre());
		assertNull(underTest.getPublicationDate());
		assertNull(underTest.getDescription());
		assertNotNull(underTest.getAuthors());
		assertEquals(0, underTest.getAuthors().length);
		assertNull(underTest.getPublisher());
		assertEquals(0L, underTest.getTimestamp());
		assertNull(underTest.getProductInfo());

	}

	/**
	 * Parasoft Jtest UTA: Test for setDescription(String)
	 *
	 * @see com.parasoft.bookstore2.Book#setDescription(String)
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
		assertNull(underTest.getISBN());
		assertNull(underTest.getGenre());
		assertNull(underTest.getPublicationDate());
		assertEquals("description", underTest.getDescription());
		assertNull(underTest.getAuthors());
		assertNull(underTest.getPublisher());
		assertEquals(0L, underTest.getTimestamp());
		assertNull(underTest.getProductInfo());

	}

	/**
	 * Parasoft Jtest UTA: Test for setGenre(String)
	 *
	 * @see com.parasoft.bookstore2.Book#setGenre(String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetGenre() throws Throwable {
		// Given
		Book underTest = new Book();

		// When
		String genre = "genre"; // UTA: default value
		underTest.setGenre(genre);

		// Then - assertions for this instance of Book
		assertNull(underTest.getISBN());
		assertEquals("genre", underTest.getGenre());
		assertNull(underTest.getPublicationDate());
		assertNull(underTest.getDescription());
		assertNull(underTest.getAuthors());
		assertNull(underTest.getPublisher());
		assertEquals(0L, underTest.getTimestamp());
		assertNull(underTest.getProductInfo());

	}

	/**
	 * Parasoft Jtest UTA: Test for setISBN(String)
	 *
	 * @see com.parasoft.bookstore2.Book#setISBN(String)
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
		assertEquals("isbn", underTest.getISBN());
		assertNull(underTest.getGenre());
		assertNull(underTest.getPublicationDate());
		assertNull(underTest.getDescription());
		assertNull(underTest.getAuthors());
		assertNull(underTest.getPublisher());
		assertEquals(0L, underTest.getTimestamp());
		assertNull(underTest.getProductInfo());

	}

	/**
	 * Parasoft Jtest UTA: Test for setProductInfo(ProductInfo)
	 *
	 * @see com.parasoft.bookstore2.Book#setProductInfo(ProductInfo)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetProductInfo() throws Throwable {
		// Given
		Book underTest = new Book();

		// When
		ProductInfo product = mock(ProductInfo.class);
		underTest.setProductInfo(product);

		// Then - assertions for argument 1 of method setProductInfo(ProductInfo)
		assertEquals(0, product.getId());
		assertNull(product.toString());
		assertEquals(0, product.getStockQuantity());
		assertNull(product.getAmount());

		// Then - assertions for this instance of Book
		assertNull(underTest.getISBN());
		assertNull(underTest.getGenre());
		assertNull(underTest.getPublicationDate());
		assertNull(underTest.getDescription());
		assertNull(underTest.getAuthors());
		assertNull(underTest.getPublisher());
		assertEquals(0L, underTest.getTimestamp());
		assertNotNull(underTest.getProductInfo());
		assertEquals(0, underTest.getProductInfo().getId());
		assertNull(underTest.getProductInfo().toString());
		assertEquals(0, underTest.getProductInfo().getStockQuantity());
		assertNull(underTest.getProductInfo().getAmount());

	}

	/**
	 * Parasoft Jtest UTA: Test for setPublicationDate(Date)
	 *
	 * @see com.parasoft.bookstore2.Book#setPublicationDate(Date)
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
		assertNull(underTest.getISBN());
		assertNull(underTest.getGenre());
		assertNotNull(underTest.getPublicationDate());
		assertNull(underTest.getDescription());
		assertNull(underTest.getAuthors());
		assertNull(underTest.getPublisher());
		assertEquals(0L, underTest.getTimestamp());
		assertNull(underTest.getProductInfo());

	}

	/**
	 * Parasoft Jtest UTA: Test for setPublisher(String)
	 *
	 * @see com.parasoft.bookstore2.Book#setPublisher(String)
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
		assertNull(underTest.getISBN());
		assertNull(underTest.getGenre());
		assertNull(underTest.getPublicationDate());
		assertNull(underTest.getDescription());
		assertNull(underTest.getAuthors());
		assertEquals("publisher", underTest.getPublisher());
		assertEquals(0L, underTest.getTimestamp());
		assertNull(underTest.getProductInfo());

	}
}