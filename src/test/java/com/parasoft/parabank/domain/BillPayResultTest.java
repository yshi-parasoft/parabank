/**
 * 
 */
package com.parasoft.parabank.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.math.BigDecimal;
import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for BillPayResult
 *
 * @see com.parasoft.parabank.domain.BillPayResult
 * @author devtest
 */
public class BillPayResultTest {

	/**
	 * Parasoft Jtest UTA: Test for getAccountId()
	 *
	 * @see com.parasoft.parabank.domain.BillPayResult#getAccountId()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetAccountId() throws Throwable {
		// Given
		BillPayResult underTest = new BillPayResult();

		// When
		int result = underTest.getAccountId();

		// Then - assertions for result of method getAccountId()
		assertEquals(0, result);

		// Then - assertions for this instance of BillPayResult
		assertNull(underTest.getPayeeName());
		assertNull(underTest.getAmount());

	}

	/**
	 * Parasoft Jtest UTA: Test for getAmount()
	 *
	 * @see com.parasoft.parabank.domain.BillPayResult#getAmount()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetAmount() throws Throwable {
		// Given
		BillPayResult underTest = new BillPayResult();

		// When
		BigDecimal result = underTest.getAmount();

		// Then - assertions for result of method getAmount()
		assertNull(result);

		// Then - assertions for this instance of BillPayResult
		assertNull(underTest.getPayeeName());
		assertEquals(0, underTest.getAccountId());

	}

	/**
	 * Parasoft Jtest UTA: Test for getPayeeName()
	 *
	 * @see com.parasoft.parabank.domain.BillPayResult#getPayeeName()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetPayeeName() throws Throwable {
		// Given
		BillPayResult underTest = new BillPayResult();

		// When
		String result = underTest.getPayeeName();

		// Then - assertions for result of method getPayeeName()
		assertNull(result);

		// Then - assertions for this instance of BillPayResult
		assertNull(underTest.getAmount());
		assertEquals(0, underTest.getAccountId());

	}

	/**
	 * Parasoft Jtest UTA: Test for setAccountId(int)
	 *
	 * @see com.parasoft.parabank.domain.BillPayResult#setAccountId(int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetAccountId() throws Throwable {
		// Given
		BillPayResult underTest = new BillPayResult();

		// When
		int accountId = 0; // UTA: default value
		underTest.setAccountId(accountId);

		// Then - assertions for this instance of BillPayResult
		assertNull(underTest.getPayeeName());
		assertNull(underTest.getAmount());
		assertEquals(0, underTest.getAccountId());

	}

	/**
	 * Parasoft Jtest UTA: Test for setAmount(BigDecimal)
	 *
	 * @see com.parasoft.parabank.domain.BillPayResult#setAmount(BigDecimal)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetAmount() throws Throwable {
		// Given
		BillPayResult underTest = new BillPayResult();

		// When
		BigDecimal amount = BigDecimal.ZERO; // UTA: default value
		underTest.setAmount(amount);

		// Then - assertions for this instance of BillPayResult
		assertNull(underTest.getPayeeName());
		assertNotNull(underTest.getAmount());
		assertEquals(0d, underTest.getAmount().doubleValue(), 0.0);
		assertEquals(0, underTest.getAccountId());

	}

	/**
	 * Parasoft Jtest UTA: Test for setPayeeName(String)
	 *
	 * @see com.parasoft.parabank.domain.BillPayResult#setPayeeName(String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetPayeeName() throws Throwable {
		// Given
		BillPayResult underTest = new BillPayResult();

		// When
		String payeeName = "payeeName"; // UTA: default value
		underTest.setPayeeName(payeeName);

		// Then - assertions for this instance of BillPayResult
		assertEquals("payeeName", underTest.getPayeeName());
		assertNull(underTest.getAmount());
		assertEquals(0, underTest.getAccountId());

	}
}