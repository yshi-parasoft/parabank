/**
 * 
 */
package com.parasoft.parabank.dao.jdbc;

import static org.junit.Assert.assertNull;

import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for JdbcSequenceDao
 *
 * @see com.parasoft.parabank.dao.jdbc.JdbcSequenceDao
 * @author devtest
 */
public class JdbcSequenceDaoTest {

	/**
	 * Parasoft Jtest UTA: Test for getCurrentId(String)
	 *
	 * @see com.parasoft.parabank.dao.jdbc.JdbcSequenceDao#getCurrentId(String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetCurrentId() throws Throwable {
		// Given
		JdbcSequenceDao underTest = new JdbcSequenceDao();

		// When
		String name = "name"; // UTA: default value
		int result = underTest.getCurrentId(name);

		// Then - assertions for this instance of JdbcSequenceDao
		assertNull(underTest.getJdbcTemplate());

	}

	/**
	 * Parasoft Jtest UTA: Test for getNextId(String)
	 *
	 * @see com.parasoft.parabank.dao.jdbc.JdbcSequenceDao#getNextId(String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetNextId() throws Throwable {
		// Given
		JdbcSequenceDao underTest = new JdbcSequenceDao();

		// When
		String name = "name"; // UTA: default value
		int result = underTest.getNextId(name);

		// Then - assertions for this instance of JdbcSequenceDao
		assertNull(underTest.getJdbcTemplate());

	}

}