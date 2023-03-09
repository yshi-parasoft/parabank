/**
 * 
 */
package com.parasoft.parabank.web.form;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.math.BigDecimal;
import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for RequestLoanForm
 *
 * @see com.parasoft.parabank.web.form.RequestLoanForm
 * @author devtest
 */
public class RequestLoanFormTest {

	/**
	 * Parasoft Jtest UTA: Test for getAmount()
	 *
	 * @see com.parasoft.parabank.web.form.RequestLoanForm#getAmount()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetAmount() throws Throwable {
		// Given
		RequestLoanForm underTest = new RequestLoanForm();

		// When
		BigDecimal result = underTest.getAmount();

		// Then - assertions for result of method getAmount()
		assertNull(result);

		// Then - assertions for this instance of RequestLoanForm
		assertNull(underTest.getDownPayment());
		assertEquals(0, underTest.getFromAccountId());

	}

	/**
	 * Parasoft Jtest UTA: Test for getDownPayment()
	 *
	 * @see com.parasoft.parabank.web.form.RequestLoanForm#getDownPayment()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetDownPayment() throws Throwable {
		// Given
		RequestLoanForm underTest = new RequestLoanForm();

		// When
		BigDecimal result = underTest.getDownPayment();

		// Then - assertions for result of method getDownPayment()
		assertNull(result);

		// Then - assertions for this instance of RequestLoanForm
		assertNull(underTest.getAmount());
		assertEquals(0, underTest.getFromAccountId());

	}

	/**
	 * Parasoft Jtest UTA: Test for getFromAccountId()
	 *
	 * @see com.parasoft.parabank.web.form.RequestLoanForm#getFromAccountId()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetFromAccountId() throws Throwable {
		// Given
		RequestLoanForm underTest = new RequestLoanForm();

		// When
		int result = underTest.getFromAccountId();

		// Then - assertions for result of method getFromAccountId()
		assertEquals(0, result);

		// Then - assertions for this instance of RequestLoanForm
		assertNull(underTest.getAmount());
		assertNull(underTest.getDownPayment());

	}

	/**
	 * Parasoft Jtest UTA: Test for setAmount(BigDecimal)
	 *
	 * @see com.parasoft.parabank.web.form.RequestLoanForm#setAmount(BigDecimal)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetAmount() throws Throwable {
		// Given
		RequestLoanForm underTest = new RequestLoanForm();

		// When
		BigDecimal amount = BigDecimal.ZERO; // UTA: default value
		underTest.setAmount(amount);

		// Then - assertions for this instance of RequestLoanForm
		assertNotNull(underTest.getAmount());
		assertEquals(0d, underTest.getAmount().doubleValue(), 0.0);
		assertNull(underTest.getDownPayment());
		assertEquals(0, underTest.getFromAccountId());

	}

	/**
	 * Parasoft Jtest UTA: Test for setDownPayment(BigDecimal)
	 *
	 * @see com.parasoft.parabank.web.form.RequestLoanForm#setDownPayment(BigDecimal)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetDownPayment() throws Throwable {
		// Given
		RequestLoanForm underTest = new RequestLoanForm();

		// When
		BigDecimal downPayment = BigDecimal.ZERO; // UTA: default value
		underTest.setDownPayment(downPayment);

		// Then - assertions for this instance of RequestLoanForm
		assertNull(underTest.getAmount());
		assertNotNull(underTest.getDownPayment());
		assertEquals(0d, underTest.getDownPayment().doubleValue(), 0.0);
		assertEquals(0, underTest.getFromAccountId());

	}

	/**
	 * Parasoft Jtest UTA: Test for setFromAccountId(int)
	 *
	 * @see com.parasoft.parabank.web.form.RequestLoanForm#setFromAccountId(int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetFromAccountId() throws Throwable {
		// Given
		RequestLoanForm underTest = new RequestLoanForm();

		// When
		int fromAccountId = 0; // UTA: default value
		underTest.setFromAccountId(fromAccountId);

		// Then - assertions for this instance of RequestLoanForm
		assertNull(underTest.getAmount());
		assertNull(underTest.getDownPayment());
		assertEquals(0, underTest.getFromAccountId());

	}
}