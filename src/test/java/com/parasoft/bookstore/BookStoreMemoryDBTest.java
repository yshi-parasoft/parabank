/**
 * 
 */
package com.parasoft.bookstore;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import org.junit.Test;
import org.springframework.test.util.ReflectionTestUtils;

/**
 * Parasoft Jtest UTA: Test class for BookStoreMemoryDB
 *
 * @see com.parasoft.bookstore.BookStoreMemoryDB
 * @author devtest
 */
public class BookStoreMemoryDBTest {

	/**
	 * Parasoft Jtest UTA: Test for getDBInstance()
	 *
	 * @see com.parasoft.bookstore.BookStoreMemoryDB#getDBInstance()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetDBInstance() throws Throwable {
		// When
		BookStoreMemoryDB result = BookStoreMemoryDB.getDBInstance();

	}

	/**
	 * Parasoft Jtest UTA: Test for close()
	 *
	 * @see com.parasoft.bookstore.DB#close()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testClose() throws Throwable {
		// Given
		BookStoreMemoryDB underTest = new BookStoreMemoryDB();
		Connection connectionValue = mock(Connection.class);
		ReflectionTestUtils.setField(underTest, "connection", connectionValue);

		// When
		underTest.close();

	}

}