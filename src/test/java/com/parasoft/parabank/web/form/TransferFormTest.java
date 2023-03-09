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
 * Parasoft Jtest UTA: Test class for TransferForm
 *
 * @see com.parasoft.parabank.web.form.TransferForm
 * @author devtest
 */
public class TransferFormTest {

	/**
	 * Parasoft Jtest UTA: Test for getAmount()
	 *
	 * @see com.parasoft.parabank.web.form.TransferForm#getAmount()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetAmount() throws Throwable {
		// Given
		TransferForm underTest = new TransferForm();

		// When
		BigDecimal result = underTest.getAmount();

		// Then - assertions for result of method getAmount()
		assertNull(result);

		// Then - assertions for this instance of TransferForm
		assertEquals(0, underTest.getFromAccountId());
		assertEquals(0, underTest.getToAccountId());

	}

	/**
	 * Parasoft Jtest UTA: Test for getFromAccountId()
	 *
	 * @see com.parasoft.parabank.web.form.TransferForm#getFromAccountId()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetFromAccountId() throws Throwable {
		// Given
		TransferForm underTest = new TransferForm();

		// When
		int result = underTest.getFromAccountId();

		// Then - assertions for result of method getFromAccountId()
		assertEquals(0, result);

		// Then - assertions for this instance of TransferForm
		assertNull(underTest.getAmount());
		assertEquals(0, underTest.getToAccountId());

	}

	/**
	 * Parasoft Jtest UTA: Test for getToAccountId()
	 *
	 * @see com.parasoft.parabank.web.form.TransferForm#getToAccountId()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetToAccountId() throws Throwable {
		// Given
		TransferForm underTest = new TransferForm();

		// When
		int result = underTest.getToAccountId();

		// Then - assertions for result of method getToAccountId()
		assertEquals(0, result);

		// Then - assertions for this instance of TransferForm
		assertNull(underTest.getAmount());
		assertEquals(0, underTest.getFromAccountId());

	}

	/**
	 * Parasoft Jtest UTA: Test for setAmount(BigDecimal)
	 *
	 * @see com.parasoft.parabank.web.form.TransferForm#setAmount(BigDecimal)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetAmount() throws Throwable {
		// Given
		TransferForm underTest = new TransferForm();

		// When
		BigDecimal amount = BigDecimal.ZERO; // UTA: default value
		underTest.setAmount(amount);

		// Then - assertions for this instance of TransferForm
		assertNotNull(underTest.getAmount());
		assertEquals(0d, underTest.getAmount().doubleValue(), 0.0);
		assertEquals(0, underTest.getFromAccountId());
		assertEquals(0, underTest.getToAccountId());

	}

	/**
	 * Parasoft Jtest UTA: Test for setFromAccountId(int)
	 *
	 * @see com.parasoft.parabank.web.form.TransferForm#setFromAccountId(int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetFromAccountId() throws Throwable {
		// Given
		TransferForm underTest = new TransferForm();

		// When
		int fromAccountId = 0; // UTA: default value
		underTest.setFromAccountId(fromAccountId);

		// Then - assertions for this instance of TransferForm
		assertNull(underTest.getAmount());
		assertEquals(0, underTest.getFromAccountId());
		assertEquals(0, underTest.getToAccountId());

	}

	/**
	 * Parasoft Jtest UTA: Test for setToAccountId(int)
	 *
	 * @see com.parasoft.parabank.web.form.TransferForm#setToAccountId(int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetToAccountId() throws Throwable {
		// Given
		TransferForm underTest = new TransferForm();

		// When
		int toAccountId = 0; // UTA: default value
		underTest.setToAccountId(toAccountId);

		// Then - assertions for this instance of TransferForm
		assertNull(underTest.getAmount());
		assertEquals(0, underTest.getFromAccountId());
		assertEquals(0, underTest.getToAccountId());

	}
}