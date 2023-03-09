/**
 * 
 */
package com.parasoft.bookstore;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.ArgumentMatchers.nullable;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.junit.Test;
import org.springframework.test.util.ReflectionTestUtils;

/**
 * Parasoft Jtest UTA: Test class for BookStoreDB
 *
 * @see com.parasoft.bookstore.BookStoreDB
 * @author devtest
 */
public class BookStoreDBTest {

	/**
	 * Parasoft Jtest UTA: Test for addNewItem(TempBook)
	 *
	 * @see com.parasoft.bookstore.BookStoreDB#addNewItem(TempBook)
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
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of TempBook
	 */
	private static TempBook mockTempBook() throws Throwable {
		TempBook tempbook = mock(TempBook.class);
		Book getBookResult = mock(Book.class);
		when(tempbook.getBook()).thenReturn(getBookResult);
		return tempbook;
	}

	/**
	 * Parasoft Jtest UTA: Test for addNewItem(TempBook)
	 *
	 * @see com.parasoft.bookstore.BookStoreDB#addNewItem(TempBook)
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
	 * @see com.parasoft.bookstore.BookStoreDB#clearAddedBooks(TempBook)
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
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of TempBook
	 */
	private static TempBook mockTempBook2() throws Throwable {
		TempBook tempbook = mock(TempBook.class);
		Book getBookResult = mock(Book.class);
		when(tempbook.getBook()).thenReturn(getBookResult);
		return tempbook;
	}

	/**
	 * Parasoft Jtest UTA: Test for getById(int)
	 *
	 * @see com.parasoft.bookstore.BookStoreDB#getById(int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetById() throws Throwable {
		// When
		int id = 0; // UTA: provided value
		Book result = BookStoreDB.getById(id);

	}

	/**
	 * Parasoft Jtest UTA: Test for getById(int)
	 *
	 * @see com.parasoft.bookstore.BookStoreDB#getById(int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetById2() throws Throwable {
		// When
		int id = -999; // UTA: provided value
		Book result = BookStoreDB.getById(id);

	}

	/**
	 * Parasoft Jtest UTA: Test for getByTitleLike(String)
	 *
	 * @see com.parasoft.bookstore.BookStoreDB#getByTitleLike(String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetByTitleLike() throws Throwable {
		// When
		String titlePart = "titlePart"; // UTA: default value
		Book[] result = BookStoreDB.getByTitleLike(titlePart);

	}

	/**
	 * Parasoft Jtest UTA: Test for getByTitleLike(ResultSet, String)
	 *
	 * @see com.parasoft.bookstore.BookStoreDB#getByTitleLike(ResultSet, String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetByTitleLike2() throws Throwable {
		// When
		ResultSet rs = mockResultSet();
		String titlePart = "titlePart"; // UTA: default value
		Book[] result = BookStoreDB.getByTitleLike(rs, titlePart);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of ResultSet
	 */
	private static ResultSet mockResultSet() throws Throwable {
		ResultSet rs = mock(ResultSet.class);
		boolean firstResult = false; // UTA: provided value
		when(rs.first()).thenReturn(firstResult);
		return rs;
	}

	/**
	 * Parasoft Jtest UTA: Test for getByTitleLike(ResultSet, String)
	 *
	 * @see com.parasoft.bookstore.BookStoreDB#getByTitleLike(ResultSet, String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetByTitleLike3() throws Throwable {
		// When
		ResultSet rs = mockResultSet2();
		String titlePart = "titlePart"; // UTA: default value
		Book[] result = BookStoreDB.getByTitleLike(rs, titlePart);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of ResultSet
	 */
	private static ResultSet mockResultSet2() throws Throwable {
		ResultSet rs = mock(ResultSet.class);
		boolean firstResult = true; // UTA: provided value
		when(rs.first()).thenReturn(firstResult);

		BigDecimal getBigDecimalResult = BigDecimal.ZERO; // UTA: default value
		when(rs.getBigDecimal(nullable(String.class))).thenReturn(getBigDecimalResult);

		Date getDateResult = mock(Date.class);
		when(rs.getDate(nullable(String.class))).thenReturn(getDateResult);

		String getStringResult = "getStringResult"; // UTA: default value
		String getStringResult2 = "getStringResult2"; // UTA: default value
		String getStringResult3 = "getStringResult3"; // UTA: default value
		String getStringResult4 = "getStringResult4"; // UTA: default value
		when(rs.getString(nullable(String.class))).thenReturn(getStringResult, getStringResult2, getStringResult3,
				getStringResult4);

		boolean nextResult = false; // UTA: provided value
		when(rs.next()).thenReturn(nextResult);
		return rs;
	}

	/**
	 * Parasoft Jtest UTA: Test for getByTitleLike(ResultSet, String)
	 *
	 * @see com.parasoft.bookstore.BookStoreDB#getByTitleLike(ResultSet, String)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = ItemNotFoundException.class)
	public void testGetByTitleLike4() throws Throwable {
		// When
		ResultSet rs = mockResultSet3();
		String titlePart = "titlePart"; // UTA: default value
		BookStoreDB.getByTitleLike(rs, titlePart);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of ResultSet
	 */
	private static ResultSet mockResultSet3() throws Throwable {
		ResultSet rs = mock(ResultSet.class);
		boolean firstResult = false; // UTA: provided value
		when(rs.first()).thenReturn(firstResult);
		return rs;
	}

}