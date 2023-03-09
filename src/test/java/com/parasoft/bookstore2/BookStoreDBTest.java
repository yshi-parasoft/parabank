/**
 * 
 */
package com.parasoft.bookstore2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.junit.Test;
import org.springframework.test.util.ReflectionTestUtils;

/**
 * Parasoft Jtest UTA: Test class for BookStoreDB
 *
 * @see com.parasoft.bookstore2.BookStoreDB
 * @author devtest
 */
public class BookStoreDBTest {

	/**
	 * Parasoft Jtest UTA: Test for addNewItem(TempBook)
	 *
	 * @see com.parasoft.bookstore2.BookStoreDB#addNewItem(TempBook)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testAddNewItem() throws Throwable {
		// When
		TempBook tempbook = mockTempBook();
		BookStoreDB.addNewItem(tempbook);

		// Then - assertions for argument 1 of method addNewItem(TempBook)
		assertNull(tempbook.getBook());
		assertEquals(0L, tempbook.getTimestamp());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of Book
	 */
	private static Book mockBook() throws Throwable {
		Book getBookResult = mock(Book.class);
		ProductInfo getProductInfoResult = mock(ProductInfo.class);
		when(getBookResult.getProductInfo()).thenReturn(getProductInfoResult);
		return getBookResult;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of TempBook
	 */
	private static TempBook mockTempBook() throws Throwable {
		TempBook tempbook = mock(TempBook.class);
		Book getBookResult = mockBook();
		when(tempbook.getBook()).thenReturn(getBookResult);
		return tempbook;
	}

	/**
	 * Parasoft Jtest UTA: Test for addNewItem(TempBook)
	 *
	 * @see com.parasoft.bookstore2.BookStoreDB#addNewItem(TempBook)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = Exception.class)
	public void testAddNewItem2() throws Throwable {
		// When
		TempBook tempbook = mock(TempBook.class);
		BookStoreDB.addNewItem(tempbook);

	}

	/**
	 * Parasoft Jtest UTA: Test for clearAddedBooks(TempBook)
	 *
	 * @see com.parasoft.bookstore2.BookStoreDB#clearAddedBooks(TempBook)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testClearAddedBooks() throws Throwable {
		// When
		TempBook tempbook = mockTempBook2();
		BookStoreDB.clearAddedBooks(tempbook);

		// Then - assertions for argument 1 of method clearAddedBooks(TempBook)
		assertNull(tempbook.getBook());
		assertEquals(0L, tempbook.getTimestamp());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of Book
	 */
	private static Book mockBook2() throws Throwable {
		Book getBookResult = mock(Book.class);
		ProductInfo getProductInfoResult = mock(ProductInfo.class);
		when(getBookResult.getProductInfo()).thenReturn(getProductInfoResult);
		return getBookResult;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of TempBook
	 */
	private static TempBook mockTempBook2() throws Throwable {
		TempBook tempbook = mock(TempBook.class);
		Book getBookResult = mockBook2();
		when(tempbook.getBook()).thenReturn(getBookResult);
		return tempbook;
	}

	/**
	 * Parasoft Jtest UTA: Test for getById(int)
	 *
	 * @see com.parasoft.bookstore2.BookStoreDB#getById(int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetById() throws Throwable {
		// When
		int id = -999; // UTA: provided value
		Book result = BookStoreDB.getById(id);

	}

	/**
	 * Parasoft Jtest UTA: Test for getById(int)
	 *
	 * @see com.parasoft.bookstore2.BookStoreDB#getById(int)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = ItemNotFoundException.class)
	public void testGetById2() throws Throwable {
		// When
		int id = -1000; // UTA: provided value
		BookStoreDB.getById(id);

	}

	/**
	 * Parasoft Jtest UTA: Test for getByTitleLike(String)
	 *
	 * @see com.parasoft.bookstore2.BookStoreDB#getByTitleLike(String)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = SQLException.class)
	public void testGetByTitleLike() throws Throwable {
		// When
		String titlePart = "titlePart"; // UTA: default value
		BookStoreDB.getByTitleLike(titlePart);

	}

}