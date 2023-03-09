/**
 * 
 */
package com.parasoft.parabank.dao.jdbc.internal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for SampleJdbcDynamicDataInserter
 *
 * @see com.parasoft.parabank.dao.jdbc.internal.SampleJdbcDynamicDataInserter
 * @author devtest
 */
public class SampleJdbcDynamicDataInserterTest {

	/**
	 * Parasoft Jtest UTA: Test for getDataCount()
	 *
	 * @see com.parasoft.parabank.dao.jdbc.internal.SampleJdbcDynamicDataInserter#getDataCount()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetDataCount() throws Throwable {
		// Given
		SampleJdbcDynamicDataInserter underTest = new SampleJdbcDynamicDataInserter();

		// When
		int result = underTest.getDataCount();

		// Then - assertions for result of method getDataCount()
		assertEquals(0, result);

		// Then - assertions for this instance of SampleJdbcDynamicDataInserter
		assertNull(underTest.getJdbcTemplate());

	}

	/**
	 * Parasoft Jtest UTA: Test for insertData()
	 *
	 * @see com.parasoft.parabank.dao.jdbc.internal.SampleJdbcDynamicDataInserter#insertData()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testInsertData() throws Throwable {
		// Given
		SampleJdbcDynamicDataInserter underTest = new SampleJdbcDynamicDataInserter();

		// When
		underTest.insertData();

		// Then - assertions for this instance of SampleJdbcDynamicDataInserter
		assertNull(underTest.getJdbcTemplate());

	}
}