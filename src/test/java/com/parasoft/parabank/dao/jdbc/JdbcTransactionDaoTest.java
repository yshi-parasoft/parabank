/**
 * 
 */
package com.parasoft.parabank.dao.jdbc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.parasoft.parabank.domain.Transaction;
import com.parasoft.parabank.domain.TransactionCriteria;
import com.parasoft.parabank.domain.TransactionCriteria.SearchType;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for JdbcTransactionDao
 *
 * @see com.parasoft.parabank.dao.jdbc.JdbcTransactionDao
 * @author devtest
 */
public class JdbcTransactionDaoTest {

	/**
	 * Parasoft Jtest UTA: Test for createTransaction(Transaction)
	 *
	 * @see com.parasoft.parabank.dao.jdbc.JdbcTransactionDao#createTransaction(Transaction)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testCreateTransaction() throws Throwable {
		// Given
		JdbcTransactionDao underTest = new JdbcTransactionDao();
		JdbcSequenceDao sequenceDao = mock(JdbcSequenceDao.class);
		underTest.setSequenceDao(sequenceDao);

		// When
		Transaction transaction = new Transaction(); // UTA: default value
		int result = underTest.createTransaction(transaction);

		// Then - assertions for argument 1 of method createTransaction(Transaction)
		assertEquals(0, transaction.getId());
		assertEquals(0, transaction.getAccountId());
		assertNull(transaction.getType());
		assertNull(transaction.getDate());
		assertNull(transaction.getAmount());
		assertNull(transaction.getDescription());

		// Then - assertions for this instance of JdbcTransactionDao
		assertNull(underTest.getJdbcTemplate());
		assertNull(underTest.getNamedParameterJdbcTemplate());

	}

	/**
	 * Parasoft Jtest UTA: Test for getRestrictions(TransactionCriteria, List)
	 *
	 * @see com.parasoft.parabank.dao.jdbc.JdbcTransactionDao#getRestrictions(TransactionCriteria, List)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetRestrictions() throws Throwable {
		// Given
		JdbcTransactionDao underTest = new JdbcTransactionDao();

		// When
		TransactionCriteria criteria = mock(TransactionCriteria.class);
		List<Object> params = new ArrayList<Object>(); // UTA: default value
		Object item = new Object(); // UTA: default value
		params.add(item);
		String result = underTest.getRestrictions(criteria, params);

		// Then - assertions for argument 1 of method getRestrictions(TransactionCriteria, List)
		assertNull(criteria.getMonth());
		assertNull(criteria.getTransactionType());
		assertNull(criteria.getTransactionId());
		assertNull(criteria.getOnDate());
		assertNull(criteria.getFromDate());
		assertNull(criteria.getToDate());
		assertNull(criteria.getAmount());
		assertNull(criteria.getSearchType());

		// Then - assertions for this instance of JdbcTransactionDao
		assertNull(underTest.getJdbcTemplate());
		assertNull(underTest.getNamedParameterJdbcTemplate());

	}

	/**
	 * Parasoft Jtest UTA: Test for getTransaction(int)
	 *
	 * @see com.parasoft.parabank.dao.jdbc.JdbcTransactionDao#getTransaction(int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetTransaction() throws Throwable {
		// Given
		JdbcTransactionDao underTest = new JdbcTransactionDao();

		// When
		int id = 0; // UTA: default value
		Transaction result = underTest.getTransaction(id);

		// Then - assertions for this instance of JdbcTransactionDao
		assertNull(underTest.getJdbcTemplate());
		assertNull(underTest.getNamedParameterJdbcTemplate());

	}

	/**
	 * Parasoft Jtest UTA: Test for getTransactionsForAccount(int)
	 *
	 * @see com.parasoft.parabank.dao.jdbc.JdbcTransactionDao#getTransactionsForAccount(int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetTransactionsForAccount() throws Throwable {
		// Given
		JdbcTransactionDao underTest = new JdbcTransactionDao();

		// When
		int accountId = 0; // UTA: default value
		List<Transaction> result = underTest.getTransactionsForAccount(accountId);

		// Then - assertions for this instance of JdbcTransactionDao
		assertNull(underTest.getJdbcTemplate());
		assertNull(underTest.getNamedParameterJdbcTemplate());

	}

	/**
	 * Parasoft Jtest UTA: Test for getTransactionsForAccount(int, TransactionCriteria)
	 *
	 * @see com.parasoft.parabank.dao.jdbc.JdbcTransactionDao#getTransactionsForAccount(int, TransactionCriteria)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetTransactionsForAccount2() throws Throwable {
		// Given
		JdbcTransactionDao underTest = new JdbcTransactionDao();

		// When
		int accountId = 0; // UTA: default value
		TransactionCriteria criteria = mockTransactionCriteria();
		List<Transaction> result = underTest.getTransactionsForAccount(accountId, criteria);

		// Then - assertions for argument 2 of method getTransactionsForAccount(int, TransactionCriteria)
		assertNull(criteria.getMonth());
		assertNull(criteria.getTransactionType());
		assertNull(criteria.getTransactionId());
		assertNull(criteria.getOnDate());
		assertNull(criteria.getFromDate());
		assertNull(criteria.getToDate());
		assertNull(criteria.getAmount());
		assertNull(criteria.getSearchType());

		// Then - assertions for this instance of JdbcTransactionDao
		assertNull(underTest.getJdbcTemplate());
		assertNull(underTest.getNamedParameterJdbcTemplate());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of TransactionCriteria
	 */
	private static TransactionCriteria mockTransactionCriteria() throws Throwable {
		TransactionCriteria criteria = mock(TransactionCriteria.class);
		SearchType getSearchTypeResult = SearchType.ACTIVITY; // UTA: default value
		when(criteria.getSearchType()).thenReturn(getSearchTypeResult);
		return criteria;
	}

	/**
	 * Parasoft Jtest UTA: Test for setSequenceDao(JdbcSequenceDao)
	 *
	 * @see com.parasoft.parabank.dao.jdbc.JdbcTransactionDao#setSequenceDao(JdbcSequenceDao)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetSequenceDao() throws Throwable {
		// Given
		JdbcTransactionDao underTest = new JdbcTransactionDao();

		// When
		JdbcSequenceDao sequenceDao = mock(JdbcSequenceDao.class);
		underTest.setSequenceDao(sequenceDao);

		// Then - assertions for argument 1 of method setSequenceDao(JdbcSequenceDao)
		assertNull(sequenceDao.getJdbcTemplate());

		// Then - assertions for this instance of JdbcTransactionDao
		assertNull(underTest.getJdbcTemplate());
		assertNull(underTest.getNamedParameterJdbcTemplate());

	}
}