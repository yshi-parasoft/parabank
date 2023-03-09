/**
 * 
 */
package com.parasoft.parabank.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.math.BigDecimal;
import java.util.Date;
import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for LoanRequest
 *
 * @see com.parasoft.parabank.domain.LoanRequest
 * @author devtest
 */
public class LoanRequestTest {

	/**
	 * Parasoft Jtest UTA: Test for equals(Object)
	 *
	 * @see com.parasoft.parabank.domain.LoanRequest#equals(Object)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testEquals() throws Throwable {
		// Given
		LoanRequest underTest = new LoanRequest();

		// When
		Object obj = null; // UTA: provided value
		boolean result = underTest.equals(obj);

		// Then - assertions for result of method equals(Object)
		assertFalse(result);

		// Then - assertions for this instance of LoanRequest
		assertNull(underTest.getRequestDate());
		assertEquals(0, underTest.getCustomerId());
		assertNull(underTest.getAvailableFunds());
		assertNull(underTest.getDownPayment());
		assertNull(underTest.getLoanAmount());

	}

	/**
	 * Parasoft Jtest UTA: Test for equals(Object)
	 *
	 * @see com.parasoft.parabank.domain.LoanRequest#equals(Object)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testEquals2() throws Throwable {
		// Given
		LoanRequest underTest = new LoanRequest();

		// When
		LoanRequest obj = mock(LoanRequest.class);
		boolean result = underTest.equals(obj);

		// Then - assertions for result of method equals(Object)
		assertTrue(result);

		// Then - assertions for this instance of LoanRequest
		assertNull(underTest.getRequestDate());
		assertEquals(0, underTest.getCustomerId());
		assertNull(underTest.getAvailableFunds());
		assertNull(underTest.getDownPayment());
		assertNull(underTest.getLoanAmount());

	}

	/**
	 * Parasoft Jtest UTA: Test for equals(Object)
	 *
	 * @see com.parasoft.parabank.domain.LoanRequest#equals(Object)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testEquals3() throws Throwable {
		// Given
		LoanRequest underTest = new LoanRequest();
		int customerId = 0; // UTA: provided value
		underTest.setCustomerId(customerId);

		// When
		LoanRequest obj = mock(LoanRequest.class);
		boolean result = underTest.equals(obj);

		// Then - assertions for result of method equals(Object)
		assertTrue(result);

		// Then - assertions for this instance of LoanRequest
		assertNull(underTest.getRequestDate());
		assertEquals(0, underTest.getCustomerId());
		assertNull(underTest.getAvailableFunds());
		assertNull(underTest.getDownPayment());
		assertNull(underTest.getLoanAmount());

	}

	/**
	 * Parasoft Jtest UTA: Test for getAvailableFunds()
	 *
	 * @see com.parasoft.parabank.domain.LoanRequest#getAvailableFunds()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetAvailableFunds() throws Throwable {
		// Given
		LoanRequest underTest = new LoanRequest();

		// When
		BigDecimal result = underTest.getAvailableFunds();

		// Then - assertions for result of method getAvailableFunds()
		assertNull(result);

		// Then - assertions for this instance of LoanRequest
		assertNull(underTest.getRequestDate());
		assertEquals(0, underTest.getCustomerId());
		assertNull(underTest.getDownPayment());
		assertNull(underTest.getLoanAmount());

	}

	/**
	 * Parasoft Jtest UTA: Test for getCustomerId()
	 *
	 * @see com.parasoft.parabank.domain.LoanRequest#getCustomerId()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetCustomerId() throws Throwable {
		// Given
		LoanRequest underTest = new LoanRequest();

		// When
		int result = underTest.getCustomerId();

		// Then - assertions for result of method getCustomerId()
		assertEquals(0, result);

		// Then - assertions for this instance of LoanRequest
		assertNull(underTest.getRequestDate());
		assertNull(underTest.getAvailableFunds());
		assertNull(underTest.getDownPayment());
		assertNull(underTest.getLoanAmount());

	}

	/**
	 * Parasoft Jtest UTA: Test for getDownPayment()
	 *
	 * @see com.parasoft.parabank.domain.LoanRequest#getDownPayment()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetDownPayment() throws Throwable {
		// Given
		LoanRequest underTest = new LoanRequest();

		// When
		BigDecimal result = underTest.getDownPayment();

		// Then - assertions for result of method getDownPayment()
		assertNull(result);

		// Then - assertions for this instance of LoanRequest
		assertNull(underTest.getRequestDate());
		assertEquals(0, underTest.getCustomerId());
		assertNull(underTest.getAvailableFunds());
		assertNull(underTest.getLoanAmount());

	}

	/**
	 * Parasoft Jtest UTA: Test for getFundsBalance()
	 *
	 * @see com.parasoft.parabank.domain.LoanRequest#getFundsBalance()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetFundsBalance() throws Throwable {
		// Given
		LoanRequest underTest = new LoanRequest();
		BigDecimal availableFunds = BigDecimal.ZERO; // UTA: default value
		underTest.setAvailableFunds(availableFunds);
		BigDecimal downPayment = BigDecimal.ZERO; // UTA: default value
		underTest.setDownPayment(downPayment);

		// When
		BigDecimal result = underTest.getFundsBalance();

		// Then - assertions for result of method getFundsBalance()
		assertNotNull(result);
		assertEquals(0d, result.doubleValue(), 0.0);

		// Then - assertions for this instance of LoanRequest
		assertNull(underTest.getRequestDate());
		assertEquals(0, underTest.getCustomerId());
		assertNotNull(underTest.getAvailableFunds());
		assertEquals(0d, underTest.getAvailableFunds().doubleValue(), 0.0);
		assertNotNull(underTest.getDownPayment());
		assertEquals(0d, underTest.getDownPayment().doubleValue(), 0.0);
		assertNull(underTest.getLoanAmount());

	}

	/**
	 * Parasoft Jtest UTA: Test for getLoanAmount()
	 *
	 * @see com.parasoft.parabank.domain.LoanRequest#getLoanAmount()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetLoanAmount() throws Throwable {
		// Given
		LoanRequest underTest = new LoanRequest();

		// When
		BigDecimal result = underTest.getLoanAmount();

		// Then - assertions for result of method getLoanAmount()
		assertNull(result);

		// Then - assertions for this instance of LoanRequest
		assertNull(underTest.getRequestDate());
		assertEquals(0, underTest.getCustomerId());
		assertNull(underTest.getAvailableFunds());
		assertNull(underTest.getDownPayment());

	}

	/**
	 * Parasoft Jtest UTA: Test for getLoanBalance()
	 *
	 * @see com.parasoft.parabank.domain.LoanRequest#getLoanBalance()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetLoanBalance() throws Throwable {
		// Given
		LoanRequest underTest = new LoanRequest();
		BigDecimal downPayment = BigDecimal.ZERO; // UTA: default value
		underTest.setDownPayment(downPayment);
		BigDecimal loanAmount = BigDecimal.ZERO; // UTA: default value
		underTest.setLoanAmount(loanAmount);

		// When
		BigDecimal result = underTest.getLoanBalance();

		// Then - assertions for result of method getLoanBalance()
		assertNotNull(result);
		assertEquals(0d, result.doubleValue(), 0.0);

		// Then - assertions for this instance of LoanRequest
		assertNull(underTest.getRequestDate());
		assertEquals(0, underTest.getCustomerId());
		assertNull(underTest.getAvailableFunds());
		assertNotNull(underTest.getDownPayment());
		assertEquals(0d, underTest.getDownPayment().doubleValue(), 0.0);
		assertNotNull(underTest.getLoanAmount());
		assertEquals(0d, underTest.getLoanAmount().doubleValue(), 0.0);

	}

	/**
	 * Parasoft Jtest UTA: Test for getRequestDate()
	 *
	 * @see com.parasoft.parabank.domain.LoanRequest#getRequestDate()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetRequestDate() throws Throwable {
		// Given
		LoanRequest underTest = new LoanRequest();

		// When
		Date result = underTest.getRequestDate();

		// Then - assertions for result of method getRequestDate()
		assertNull(result);

		// Then - assertions for this instance of LoanRequest
		assertEquals(0, underTest.getCustomerId());
		assertNull(underTest.getAvailableFunds());
		assertNull(underTest.getDownPayment());
		assertNull(underTest.getLoanAmount());

	}

	/**
	 * Parasoft Jtest UTA: Test for hashCode()
	 *
	 * @see com.parasoft.parabank.domain.LoanRequest#hashCode()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testHashCode() throws Throwable {
		// Given
		LoanRequest underTest = new LoanRequest();
		BigDecimal availableFunds = BigDecimal.ZERO; // UTA: default value
		underTest.setAvailableFunds(availableFunds);
		BigDecimal downPayment = BigDecimal.ZERO; // UTA: default value
		underTest.setDownPayment(downPayment);
		BigDecimal loanAmount = BigDecimal.ZERO; // UTA: default value
		underTest.setLoanAmount(loanAmount);
		Date requestDate = mock(Date.class);
		underTest.setRequestDate(requestDate);

		// When
		int result = underTest.hashCode();

		// Then - assertions for result of method hashCode()
		// assertEquals(0, result);// UTA: Expected value may be unstable

		// Then - assertions for this instance of LoanRequest
		assertNotNull(underTest.getRequestDate());
		assertEquals(0, underTest.getCustomerId());
		assertNotNull(underTest.getAvailableFunds());
		assertEquals(0d, underTest.getAvailableFunds().doubleValue(), 0.0);
		assertNotNull(underTest.getDownPayment());
		assertEquals(0d, underTest.getDownPayment().doubleValue(), 0.0);
		assertNotNull(underTest.getLoanAmount());
		assertEquals(0d, underTest.getLoanAmount().doubleValue(), 0.0);

	}

	/**
	 * Parasoft Jtest UTA: Test for toString()
	 *
	 * @see com.parasoft.parabank.domain.LoanRequest#toString()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testToString() throws Throwable {
		// Given
		LoanRequest underTest = new LoanRequest();
		BigDecimal availableFunds = BigDecimal.ZERO; // UTA: default value
		underTest.setAvailableFunds(availableFunds);
		BigDecimal downPayment = BigDecimal.ZERO; // UTA: default value
		underTest.setDownPayment(downPayment);
		BigDecimal loanAmount = BigDecimal.ZERO; // UTA: default value
		underTest.setLoanAmount(loanAmount);
		Date requestDate = mock(Date.class);
		underTest.setRequestDate(requestDate);

		// When
		String result = underTest.toString();

		// Then - assertions for result of method toString()
		assertEquals(
"[deleted by script]",
				result);

		// Then - assertions for this instance of LoanRequest
		assertNotNull(underTest.getRequestDate());
		assertEquals(0, underTest.getCustomerId());
		assertNotNull(underTest.getAvailableFunds());
		assertEquals(0d, underTest.getAvailableFunds().doubleValue(), 0.0);
		assertNotNull(underTest.getDownPayment());
		assertEquals(0d, underTest.getDownPayment().doubleValue(), 0.0);
		assertNotNull(underTest.getLoanAmount());
		assertEquals(0d, underTest.getLoanAmount().doubleValue(), 0.0);

	}
}