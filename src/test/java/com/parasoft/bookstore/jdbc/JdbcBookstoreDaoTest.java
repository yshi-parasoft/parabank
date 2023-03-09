/**
 * 
 */
package com.parasoft.bookstore.jdbc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.Map;
import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for JdbcBookstoreDao
 *
 * @see com.parasoft.bookstore.jdbc.JdbcBookstoreDao
 * @author devtest
 */
public class JdbcBookstoreDaoTest {

	/**
	 * Parasoft Jtest UTA: Test for cleanDB()
	 *
	 * @see com.parasoft.bookstore.jdbc.JdbcBookstoreDao#cleanDB()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testCleanDB() throws Throwable {
		// Given
		JdbcBookstoreDao underTest = new JdbcBookstoreDao();

		// When
		underTest.cleanDB();

		// Then - assertions for this instance of JdbcBookstoreDao
		assertNull(underTest.getJdbcTemplate());

	}

	/**
	 * Parasoft Jtest UTA: Test for getParameter(String)
	 *
	 * @see com.parasoft.bookstore.jdbc.JdbcBookstoreDao#getParameter(String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetParameter() throws Throwable {
		// Given
		JdbcBookstoreDao underTest = new JdbcBookstoreDao();

		// When
		String name = "name"; // UTA: default value
		String result = underTest.getParameter(name);

		// Then - assertions for result of method getParameter(String)
		assertEquals("", result);

		// Then - assertions for this instance of JdbcBookstoreDao
		assertNull(underTest.getJdbcTemplate());

	}

	/**
	 * Parasoft Jtest UTA: Test for getParameters()
	 *
	 * @see com.parasoft.bookstore.jdbc.JdbcBookstoreDao#getParameters()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetParameters() throws Throwable {
		// Given
		JdbcBookstoreDao underTest = new JdbcBookstoreDao();

		// When
		Map<String, String> result = underTest.getParameters();

		// Then - assertions for result of method getParameters()
		assertNull(result);

		// Then - assertions for this instance of JdbcBookstoreDao
		assertNull(underTest.getJdbcTemplate());

	}

	/**
	 * Parasoft Jtest UTA: Test for initializeDB()
	 *
	 * @see com.parasoft.bookstore.jdbc.JdbcBookstoreDao#initializeDB()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testInitializeDB() throws Throwable {
		// Given
		JdbcBookstoreDao underTest = new JdbcBookstoreDao();

		// When
		underTest.initializeDB();

		// Then - assertions for this instance of JdbcBookstoreDao
		assertNull(underTest.getJdbcTemplate());

	}

	/**
	 * Parasoft Jtest UTA: Test for setParameter(String, String)
	 *
	 * @see com.parasoft.bookstore.jdbc.JdbcBookstoreDao#setParameter(String, String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetParameter() throws Throwable {
		// Given
		JdbcBookstoreDao underTest = new JdbcBookstoreDao();

		// When
		String name = "name"; // UTA: default value
		String value = "value"; // UTA: default value
		underTest.setParameter(name, value);

		// Then - assertions for this instance of JdbcBookstoreDao
		assertNull(underTest.getJdbcTemplate());

	}
}