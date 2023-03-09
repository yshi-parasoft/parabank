/**
 * 
 */
package com.parasoft.parabank.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;

import com.parasoft.parabank.domain.TransactionCriteria.SearchType;
import java.math.BigDecimal;
import java.util.Date;
import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for TransactionCriteria
 *
 * @see com.parasoft.parabank.domain.TransactionCriteria
 * @author devtest
 */
public class TransactionCriteriaTest {

	/**
	 * Parasoft Jtest UTA: Test for getAmount()
	 *
	 * @see com.parasoft.parabank.domain.TransactionCriteria#getAmount()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetAmount() throws Throwable {
		// Given
		TransactionCriteria underTest = new TransactionCriteria();

		// When
		BigDecimal result = underTest.getAmount();

		// Then - assertions for result of method getAmount()
		assertNull(result);

		// Then - assertions for this instance of TransactionCriteria
		assertNull(underTest.getMonth());
		assertNull(underTest.getTransactionType());
		assertNull(underTest.getTransactionId());
		assertNull(underTest.getOnDate());
		assertNull(underTest.getFromDate());
		assertNull(underTest.getToDate());
		assertNull(underTest.getSearchType());

	}

	/**
	 * Parasoft Jtest UTA: Test for getFromDate()
	 *
	 * @see com.parasoft.parabank.domain.TransactionCriteria#getFromDate()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetFromDate() throws Throwable {
		// Given
		TransactionCriteria underTest = new TransactionCriteria();

		// When
		Date result = underTest.getFromDate();

		// Then - assertions for result of method getFromDate()
		assertNull(result);

		// Then - assertions for this instance of TransactionCriteria
		assertNull(underTest.getMonth());
		assertNull(underTest.getTransactionType());
		assertNull(underTest.getTransactionId());
		assertNull(underTest.getOnDate());
		assertNull(underTest.getToDate());
		assertNull(underTest.getAmount());
		assertNull(underTest.getSearchType());

	}

	/**
	 * Parasoft Jtest UTA: Test for getMonth()
	 *
	 * @see com.parasoft.parabank.domain.TransactionCriteria#getMonth()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetMonth() throws Throwable {
		// Given
		TransactionCriteria underTest = new TransactionCriteria();

		// When
		String result = underTest.getMonth();

		// Then - assertions for result of method getMonth()
		assertNull(result);

		// Then - assertions for this instance of TransactionCriteria
		assertNull(underTest.getTransactionType());
		assertNull(underTest.getTransactionId());
		assertNull(underTest.getOnDate());
		assertNull(underTest.getFromDate());
		assertNull(underTest.getToDate());
		assertNull(underTest.getAmount());
		assertNull(underTest.getSearchType());

	}

	/**
	 * Parasoft Jtest UTA: Test for getOnDate()
	 *
	 * @see com.parasoft.parabank.domain.TransactionCriteria#getOnDate()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetOnDate() throws Throwable {
		// Given
		TransactionCriteria underTest = new TransactionCriteria();

		// When
		Date result = underTest.getOnDate();

		// Then - assertions for result of method getOnDate()
		assertNull(result);

		// Then - assertions for this instance of TransactionCriteria
		assertNull(underTest.getMonth());
		assertNull(underTest.getTransactionType());
		assertNull(underTest.getTransactionId());
		assertNull(underTest.getFromDate());
		assertNull(underTest.getToDate());
		assertNull(underTest.getAmount());
		assertNull(underTest.getSearchType());

	}

	/**
	 * Parasoft Jtest UTA: Test for getSearchType()
	 *
	 * @see com.parasoft.parabank.domain.TransactionCriteria#getSearchType()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetSearchType() throws Throwable {
		// Given
		TransactionCriteria underTest = new TransactionCriteria();

		// When
		SearchType result = underTest.getSearchType();

		// Then - assertions for result of method getSearchType()
		assertNull(result);

		// Then - assertions for this instance of TransactionCriteria
		assertNull(underTest.getMonth());
		assertNull(underTest.getTransactionType());
		assertNull(underTest.getTransactionId());
		assertNull(underTest.getOnDate());
		assertNull(underTest.getFromDate());
		assertNull(underTest.getToDate());
		assertNull(underTest.getAmount());

	}

	/**
	 * Parasoft Jtest UTA: Test for getToDate()
	 *
	 * @see com.parasoft.parabank.domain.TransactionCriteria#getToDate()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetToDate() throws Throwable {
		// Given
		TransactionCriteria underTest = new TransactionCriteria();

		// When
		Date result = underTest.getToDate();

		// Then - assertions for result of method getToDate()
		assertNull(result);

		// Then - assertions for this instance of TransactionCriteria
		assertNull(underTest.getMonth());
		assertNull(underTest.getTransactionType());
		assertNull(underTest.getTransactionId());
		assertNull(underTest.getOnDate());
		assertNull(underTest.getFromDate());
		assertNull(underTest.getAmount());
		assertNull(underTest.getSearchType());

	}

	/**
	 * Parasoft Jtest UTA: Test for getTransactionId()
	 *
	 * @see com.parasoft.parabank.domain.TransactionCriteria#getTransactionId()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetTransactionId() throws Throwable {
		// Given
		TransactionCriteria underTest = new TransactionCriteria();

		// When
		Integer result = underTest.getTransactionId();

		// Then - assertions for result of method getTransactionId()
		assertNull(result);

		// Then - assertions for this instance of TransactionCriteria
		assertNull(underTest.getMonth());
		assertNull(underTest.getTransactionType());
		assertNull(underTest.getOnDate());
		assertNull(underTest.getFromDate());
		assertNull(underTest.getToDate());
		assertNull(underTest.getAmount());
		assertNull(underTest.getSearchType());

	}

	/**
	 * Parasoft Jtest UTA: Test for getTransactionType()
	 *
	 * @see com.parasoft.parabank.domain.TransactionCriteria#getTransactionType()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetTransactionType() throws Throwable {
		// Given
		TransactionCriteria underTest = new TransactionCriteria();

		// When
		String result = underTest.getTransactionType();

		// Then - assertions for result of method getTransactionType()
		assertNull(result);

		// Then - assertions for this instance of TransactionCriteria
		assertNull(underTest.getMonth());
		assertNull(underTest.getTransactionId());
		assertNull(underTest.getOnDate());
		assertNull(underTest.getFromDate());
		assertNull(underTest.getToDate());
		assertNull(underTest.getAmount());
		assertNull(underTest.getSearchType());

	}

	/**
	 * Parasoft Jtest UTA: Test for setAmount(BigDecimal)
	 *
	 * @see com.parasoft.parabank.domain.TransactionCriteria#setAmount(BigDecimal)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetAmount() throws Throwable {
		// Given
		TransactionCriteria underTest = new TransactionCriteria();

		// When
		BigDecimal amount = BigDecimal.ZERO; // UTA: default value
		underTest.setAmount(amount);

		// Then - assertions for this instance of TransactionCriteria
		assertNull(underTest.getMonth());
		assertNull(underTest.getTransactionType());
		assertNull(underTest.getTransactionId());
		assertNull(underTest.getOnDate());
		assertNull(underTest.getFromDate());
		assertNull(underTest.getToDate());
		assertNotNull(underTest.getAmount());
		assertEquals(0d, underTest.getAmount().doubleValue(), 0.0);
		assertNull(underTest.getSearchType());

	}

	/**
	 * Parasoft Jtest UTA: Test for setFromDate(Date)
	 *
	 * @see com.parasoft.parabank.domain.TransactionCriteria#setFromDate(Date)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetFromDate() throws Throwable {
		// Given
		TransactionCriteria underTest = new TransactionCriteria();

		// When
		Date fromDate = mock(Date.class);
		underTest.setFromDate(fromDate);

		// Then - assertions for this instance of TransactionCriteria
		assertNull(underTest.getMonth());
		assertNull(underTest.getTransactionType());
		assertNull(underTest.getTransactionId());
		assertNull(underTest.getOnDate());
		assertNotNull(underTest.getFromDate());
		assertNull(underTest.getToDate());
		assertNull(underTest.getAmount());
		assertNull(underTest.getSearchType());

	}

	/**
	 * Parasoft Jtest UTA: Test for setMonth(String)
	 *
	 * @see com.parasoft.parabank.domain.TransactionCriteria#setMonth(String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetMonth() throws Throwable {
		// Given
		TransactionCriteria underTest = new TransactionCriteria();

		// When
		String month = "month"; // UTA: default value
		underTest.setMonth(month);

		// Then - assertions for this instance of TransactionCriteria
		assertEquals("month", underTest.getMonth());
		assertNull(underTest.getTransactionType());
		assertNull(underTest.getTransactionId());
		assertNull(underTest.getOnDate());
		assertNull(underTest.getFromDate());
		assertNull(underTest.getToDate());
		assertNull(underTest.getAmount());
		assertNull(underTest.getSearchType());

	}

	/**
	 * Parasoft Jtest UTA: Test for setOnDate(Date)
	 *
	 * @see com.parasoft.parabank.domain.TransactionCriteria#setOnDate(Date)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetOnDate() throws Throwable {
		// Given
		TransactionCriteria underTest = new TransactionCriteria();

		// When
		Date onDate = mock(Date.class);
		underTest.setOnDate(onDate);

		// Then - assertions for this instance of TransactionCriteria
		assertNull(underTest.getMonth());
		assertNull(underTest.getTransactionType());
		assertNull(underTest.getTransactionId());
		assertNotNull(underTest.getOnDate());
		assertNull(underTest.getFromDate());
		assertNull(underTest.getToDate());
		assertNull(underTest.getAmount());
		assertNull(underTest.getSearchType());

	}

	/**
	 * Parasoft Jtest UTA: Test for setSearchType(SearchType)
	 *
	 * @see com.parasoft.parabank.domain.TransactionCriteria#setSearchType(SearchType)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetSearchType() throws Throwable {
		// Given
		TransactionCriteria underTest = new TransactionCriteria();

		// When
		SearchType searchType = SearchType.ACTIVITY; // UTA: default value
		underTest.setSearchType(searchType);

		// Then - assertions for this instance of TransactionCriteria
		assertNull(underTest.getMonth());
		assertNull(underTest.getTransactionType());
		assertNull(underTest.getTransactionId());
		assertNull(underTest.getOnDate());
		assertNull(underTest.getFromDate());
		assertNull(underTest.getToDate());
		assertNull(underTest.getAmount());
		assertEquals(com.parasoft.parabank.domain.TransactionCriteria.SearchType.ACTIVITY, underTest.getSearchType());

	}

	/**
	 * Parasoft Jtest UTA: Test for setToDate(Date)
	 *
	 * @see com.parasoft.parabank.domain.TransactionCriteria#setToDate(Date)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetToDate() throws Throwable {
		// Given
		TransactionCriteria underTest = new TransactionCriteria();

		// When
		Date toDate = mock(Date.class);
		underTest.setToDate(toDate);

		// Then - assertions for this instance of TransactionCriteria
		assertNull(underTest.getMonth());
		assertNull(underTest.getTransactionType());
		assertNull(underTest.getTransactionId());
		assertNull(underTest.getOnDate());
		assertNull(underTest.getFromDate());
		assertNotNull(underTest.getToDate());
		assertNull(underTest.getAmount());
		assertNull(underTest.getSearchType());

	}

	/**
	 * Parasoft Jtest UTA: Test for setTransactionId(Integer)
	 *
	 * @see com.parasoft.parabank.domain.TransactionCriteria#setTransactionId(Integer)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetTransactionId() throws Throwable {
		// Given
		TransactionCriteria underTest = new TransactionCriteria();

		// When
		Integer transactionId = 0; // UTA: default value
		underTest.setTransactionId(transactionId);

		// Then - assertions for this instance of TransactionCriteria
		assertNull(underTest.getMonth());
		assertNull(underTest.getTransactionType());
		assertNotNull(underTest.getTransactionId());
		assertEquals(0, underTest.getTransactionId().intValue());
		assertNull(underTest.getOnDate());
		assertNull(underTest.getFromDate());
		assertNull(underTest.getToDate());
		assertNull(underTest.getAmount());
		assertNull(underTest.getSearchType());

	}

	/**
	 * Parasoft Jtest UTA: Test for setTransactionType(String)
	 *
	 * @see com.parasoft.parabank.domain.TransactionCriteria#setTransactionType(String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetTransactionType() throws Throwable {
		// Given
		TransactionCriteria underTest = new TransactionCriteria();

		// When
		String transactionType = "transactionType"; // UTA: default value
		underTest.setTransactionType(transactionType);

		// Then - assertions for this instance of TransactionCriteria
		assertNull(underTest.getMonth());
		assertEquals("transactionType", underTest.getTransactionType());
		assertNull(underTest.getTransactionId());
		assertNull(underTest.getOnDate());
		assertNull(underTest.getFromDate());
		assertNull(underTest.getToDate());
		assertNull(underTest.getAmount());
		assertNull(underTest.getSearchType());

	}
}