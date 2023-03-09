/**
 * 
 */
package com.parasoft.parabank.web.form;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;

import com.parasoft.parabank.domain.Payee;
import java.math.BigDecimal;
import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for BillPayForm
 *
 * @see com.parasoft.parabank.web.form.BillPayForm
 * @author devtest
 */
public class BillPayFormTest {

	/**
	 * Parasoft Jtest UTA: Test for getAmount()
	 *
	 * @see com.parasoft.parabank.web.form.BillPayForm#getAmount()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetAmount() throws Throwable {
		// Given
		BillPayForm underTest = new BillPayForm();

		// When
		BigDecimal result = underTest.getAmount();

		// Then - assertions for result of method getAmount()
		assertNull(result);

		// Then - assertions for this instance of BillPayForm
		assertNull(underTest.getPayee());
		assertNull(underTest.getVerifyAccount());
		assertEquals(0, underTest.getFromAccountId());

	}

	/**
	 * Parasoft Jtest UTA: Test for getFromAccountId()
	 *
	 * @see com.parasoft.parabank.web.form.BillPayForm#getFromAccountId()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetFromAccountId() throws Throwable {
		// Given
		BillPayForm underTest = new BillPayForm();

		// When
		int result = underTest.getFromAccountId();

		// Then - assertions for result of method getFromAccountId()
		assertEquals(0, result);

		// Then - assertions for this instance of BillPayForm
		assertNull(underTest.getPayee());
		assertNull(underTest.getVerifyAccount());
		assertNull(underTest.getAmount());

	}

	/**
	 * Parasoft Jtest UTA: Test for getPayee()
	 *
	 * @see com.parasoft.parabank.web.form.BillPayForm#getPayee()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetPayee() throws Throwable {
		// Given
		BillPayForm underTest = new BillPayForm();

		// When
		Payee result = underTest.getPayee();

		// Then - assertions for result of method getPayee()
		assertNull(result);

		// Then - assertions for this instance of BillPayForm
		assertNull(underTest.getVerifyAccount());
		assertNull(underTest.getAmount());
		assertEquals(0, underTest.getFromAccountId());

	}

	/**
	 * Parasoft Jtest UTA: Test for getVerifyAccount()
	 *
	 * @see com.parasoft.parabank.web.form.BillPayForm#getVerifyAccount()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetVerifyAccount() throws Throwable {
		// Given
		BillPayForm underTest = new BillPayForm();

		// When
		Integer result = underTest.getVerifyAccount();

		// Then - assertions for result of method getVerifyAccount()
		assertNull(result);

		// Then - assertions for this instance of BillPayForm
		assertNull(underTest.getPayee());
		assertNull(underTest.getAmount());
		assertEquals(0, underTest.getFromAccountId());

	}

	/**
	 * Parasoft Jtest UTA: Test for setAmount(BigDecimal)
	 *
	 * @see com.parasoft.parabank.web.form.BillPayForm#setAmount(BigDecimal)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetAmount() throws Throwable {
		// Given
		BillPayForm underTest = new BillPayForm();

		// When
		BigDecimal amount = BigDecimal.ZERO; // UTA: default value
		underTest.setAmount(amount);

		// Then - assertions for this instance of BillPayForm
		assertNull(underTest.getPayee());
		assertNull(underTest.getVerifyAccount());
		assertNotNull(underTest.getAmount());
		assertEquals(0d, underTest.getAmount().doubleValue(), 0.0);
		assertEquals(0, underTest.getFromAccountId());

	}

	/**
	 * Parasoft Jtest UTA: Test for setFromAccountId(int)
	 *
	 * @see com.parasoft.parabank.web.form.BillPayForm#setFromAccountId(int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetFromAccountId() throws Throwable {
		// Given
		BillPayForm underTest = new BillPayForm();

		// When
		int fromAccountId = 0; // UTA: default value
		underTest.setFromAccountId(fromAccountId);

		// Then - assertions for this instance of BillPayForm
		assertNull(underTest.getPayee());
		assertNull(underTest.getVerifyAccount());
		assertNull(underTest.getAmount());
		assertEquals(0, underTest.getFromAccountId());

	}

	/**
	 * Parasoft Jtest UTA: Test for setPayee(Payee)
	 *
	 * @see com.parasoft.parabank.web.form.BillPayForm#setPayee(Payee)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetPayee() throws Throwable {
		// Given
		BillPayForm underTest = new BillPayForm();

		// When
		Payee payee = mock(Payee.class);
		underTest.setPayee(payee);

		// Then - assertions for argument 1 of method setPayee(Payee)
		assertNull(payee.getName());
		assertNull(payee.getAddress());
		assertNull(payee.getPhoneNumber());
		assertNull(payee.getAccountNumber());

		// Then - assertions for this instance of BillPayForm
		assertNotNull(underTest.getPayee());
		assertNull(underTest.getPayee().getName());
		assertNull(underTest.getPayee().getAddress());
		assertNull(underTest.getPayee().getPhoneNumber());
		assertNull(underTest.getPayee().getAccountNumber());
		assertNull(underTest.getVerifyAccount());
		assertNull(underTest.getAmount());
		assertEquals(0, underTest.getFromAccountId());

	}

	/**
	 * Parasoft Jtest UTA: Test for setVerifyAccount(Integer)
	 *
	 * @see com.parasoft.parabank.web.form.BillPayForm#setVerifyAccount(Integer)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetVerifyAccount() throws Throwable {
		// Given
		BillPayForm underTest = new BillPayForm();

		// When
		Integer verifyAccount = 0; // UTA: default value
		underTest.setVerifyAccount(verifyAccount);

		// Then - assertions for this instance of BillPayForm
		assertNull(underTest.getPayee());
		assertNotNull(underTest.getVerifyAccount());
		assertEquals(0, underTest.getVerifyAccount().intValue());
		assertNull(underTest.getAmount());
		assertEquals(0, underTest.getFromAccountId());

	}
}