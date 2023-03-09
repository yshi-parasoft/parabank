/**
 * 
 */
package com.parasoft.parabank.dao.jdbc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.parasoft.parabank.domain.TransactionCriteria;
import com.parasoft.parabank.domain.TransactionCriteria.SearchType;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for JdbcTransactionQueryRestrictor
 *
 * @see com.parasoft.parabank.dao.jdbc.JdbcTransactionQueryRestrictor
 * @author devtest
 */
public class JdbcTransactionQueryRestrictorTest {

	/**
	 * Parasoft Jtest UTA: Test for getCommonActivityRestrictions(TransactionCriteria, List)
	 *
	 * @see com.parasoft.parabank.dao.jdbc.JdbcTransactionQueryRestrictor#getCommonActivityRestrictions(TransactionCriteria, List)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetCommonActivityRestrictions() throws Throwable {
		// Given
		JdbcTransactionQueryRestrictor underTest = new JdbcTransactionQueryRestrictor();

		// When
		TransactionCriteria criteria = mockTransactionCriteria();
		List<Object> params = new ArrayList<Object>(); // UTA: default value
		Object item = new Object(); // UTA: default value
		params.add(item);
		String result = underTest.getCommonActivityRestrictions(criteria, params);

		// Then - assertions for argument 1 of method getCommonActivityRestrictions(TransactionCriteria, List)
		assertNull(criteria.getMonth());
		assertNull(criteria.getTransactionType());
		assertNull(criteria.getTransactionId());
		assertNull(criteria.getOnDate());
		assertNull(criteria.getFromDate());
		assertNull(criteria.getToDate());
		assertNull(criteria.getAmount());
		assertNull(criteria.getSearchType());

		// Then - assertions for result of method getCommonActivityRestrictions(TransactionCriteria, List)
		assertEquals("", result);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of TransactionCriteria
	 */
	private static TransactionCriteria mockTransactionCriteria() throws Throwable {
		TransactionCriteria criteria = mock(TransactionCriteria.class);
		String getMonthResult = null; // UTA: provided value
		when(criteria.getMonth()).thenReturn(getMonthResult);
		return criteria;
	}

	/**
	 * Parasoft Jtest UTA: Test for getCommonActivityRestrictions(TransactionCriteria, List)
	 *
	 * @see com.parasoft.parabank.dao.jdbc.JdbcTransactionQueryRestrictor#getCommonActivityRestrictions(TransactionCriteria, List)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetCommonActivityRestrictions2() throws Throwable {
		// Given
		JdbcTransactionQueryRestrictor underTest = new JdbcTransactionQueryRestrictor();

		// When
		TransactionCriteria criteria = mockTransactionCriteria2();
		List<Object> params = new ArrayList<Object>(); // UTA: default value
		Object item = new Object(); // UTA: default value
		params.add(item);
		String result = underTest.getCommonActivityRestrictions(criteria, params);

		// Then - assertions for argument 1 of method getCommonActivityRestrictions(TransactionCriteria, List)
		assertNull(criteria.getMonth());
		assertNull(criteria.getTransactionType());
		assertNull(criteria.getTransactionId());
		assertNull(criteria.getOnDate());
		assertNull(criteria.getFromDate());
		assertNull(criteria.getToDate());
		assertNull(criteria.getAmount());
		assertNull(criteria.getSearchType());

		// Then - assertions for result of method getCommonActivityRestrictions(TransactionCriteria, List)
		assertEquals("", result);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of TransactionCriteria
	 */
	private static TransactionCriteria mockTransactionCriteria2() throws Throwable {
		TransactionCriteria criteria = mock(TransactionCriteria.class);
		String getMonthResult = "getMonthResult"; // UTA: default value
		String getMonthResult2 = ""; // UTA: provided value
		when(criteria.getMonth()).thenReturn(getMonthResult, getMonthResult2);
		return criteria;
	}

	/**
	 * Parasoft Jtest UTA: Test for getRestrictions(TransactionCriteria, List)
	 *
	 * @see com.parasoft.parabank.dao.jdbc.JdbcTransactionQueryRestrictor#getRestrictions(TransactionCriteria, List)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetRestrictions() throws Throwable {
		// Given
		JdbcTransactionQueryRestrictor underTest = new JdbcTransactionQueryRestrictor();

		// When
		TransactionCriteria criteria = mockTransactionCriteria3();
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

		// Then - assertions for result of method getRestrictions(TransactionCriteria, List)
		assertEquals("", result);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of TransactionCriteria
	 */
	private static TransactionCriteria mockTransactionCriteria3() throws Throwable {
		TransactionCriteria criteria = mock(TransactionCriteria.class);
		SearchType getSearchTypeResult = SearchType.ACTIVITY; // UTA: default value
		when(criteria.getSearchType()).thenReturn(getSearchTypeResult);
		return criteria;
	}

	/**
	 * Parasoft Jtest UTA: Test for getRestrictions(TransactionCriteria, List)
	 *
	 * @see com.parasoft.parabank.dao.jdbc.JdbcTransactionQueryRestrictor#getRestrictions(TransactionCriteria, List)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetRestrictions2() throws Throwable {
		// Given
		JdbcTransactionQueryRestrictor underTest = new JdbcTransactionQueryRestrictor();

		// When
		TransactionCriteria criteria = mockTransactionCriteria4();
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

		// Then - assertions for result of method getRestrictions(TransactionCriteria, List)
		assertEquals(" AND TYPE = ''", result);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of TransactionCriteria
	 */
	private static TransactionCriteria mockTransactionCriteria4() throws Throwable {
		TransactionCriteria criteria = mock(TransactionCriteria.class);
		String getMonthResult = null; // UTA: provided value
		when(criteria.getMonth()).thenReturn(getMonthResult);

		SearchType getSearchTypeResult = SearchType.ACTIVITY; // UTA: default value
		when(criteria.getSearchType()).thenReturn(getSearchTypeResult);

		String getTransactionTypeResult = "getTransactionTypeResult"; // UTA: default value
		String getTransactionTypeResult2 = ""; // UTA: provided value
		when(criteria.getTransactionType()).thenReturn(getTransactionTypeResult, getTransactionTypeResult2);
		return criteria;
	}

}