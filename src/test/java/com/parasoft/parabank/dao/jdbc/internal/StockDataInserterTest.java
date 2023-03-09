/**
 * 
 */
package com.parasoft.parabank.dao.jdbc.internal;

import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;

import com.parasoft.parabank.dao.jdbc.JdbcSequenceDao;
import java.util.List;
import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for StockDataInserter
 *
 * @see com.parasoft.parabank.dao.jdbc.internal.StockDataInserter
 * @author devtest
 */
public class StockDataInserterTest {

	/**
	 * Parasoft Jtest UTA: Test for getSymbols()
	 *
	 * @see com.parasoft.parabank.dao.jdbc.internal.StockDataInserter#getSymbols()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetSymbols() throws Throwable {
		// Given
		StockDataInserter underTest = new StockDataInserter();

		// When
		List<String> result = underTest.getSymbols();

		// Then - assertions for this instance of StockDataInserter
		assertNull(underTest.getJdbcTemplate());

	}

	/**
	 * Parasoft Jtest UTA: Test for insertData()
	 *
	 * @see com.parasoft.parabank.dao.jdbc.internal.StockDataInserter#insertData()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testInsertData() throws Throwable {
		// Given
		StockDataInserter underTest = new StockDataInserter();
		JdbcSequenceDao sequenceDao = mock(JdbcSequenceDao.class);
		underTest.setSequenceDao(sequenceDao);

		// When
		underTest.insertData();

		// Then - assertions for this instance of StockDataInserter
		assertNull(underTest.getJdbcTemplate());

	}

	/**
	 * Parasoft Jtest UTA: Test for setSequenceDao(JdbcSequenceDao)
	 *
	 * @see com.parasoft.parabank.dao.jdbc.internal.StockDataInserter#setSequenceDao(JdbcSequenceDao)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetSequenceDao() throws Throwable {
		// Given
		StockDataInserter underTest = new StockDataInserter();

		// When
		JdbcSequenceDao sequenceDao = mock(JdbcSequenceDao.class);
		underTest.setSequenceDao(sequenceDao);

		// Then - assertions for argument 1 of method setSequenceDao(JdbcSequenceDao)
		assertNull(sequenceDao.getJdbcTemplate());

		// Then - assertions for this instance of StockDataInserter
		assertNull(underTest.getJdbcTemplate());

	}
}