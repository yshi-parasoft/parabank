/**
 * 
 */
package com.parasoft.parabank.web.form;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import com.parasoft.parabank.domain.Account.AccountType;
import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for OpenAccountForm
 *
 * @see com.parasoft.parabank.web.form.OpenAccountForm
 * @author devtest
 */
public class OpenAccountFormTest {

	/**
	 * Parasoft Jtest UTA: Test for getFromAccountId()
	 *
	 * @see com.parasoft.parabank.web.form.OpenAccountForm#getFromAccountId()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetFromAccountId() throws Throwable {
		// Given
		OpenAccountForm underTest = new OpenAccountForm();

		// When
		int result = underTest.getFromAccountId();

		// Then - assertions for result of method getFromAccountId()
		assertEquals(0, result);

		// Then - assertions for this instance of OpenAccountForm
		assertNull(underTest.getType());

	}

	/**
	 * Parasoft Jtest UTA: Test for getType()
	 *
	 * @see com.parasoft.parabank.web.form.OpenAccountForm#getType()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetType() throws Throwable {
		// Given
		OpenAccountForm underTest = new OpenAccountForm();

		// When
		AccountType result = underTest.getType();

		// Then - assertions for result of method getType()
		assertNull(result);

		// Then - assertions for this instance of OpenAccountForm
		assertEquals(0, underTest.getFromAccountId());

	}

	/**
	 * Parasoft Jtest UTA: Test for setFromAccountId(int)
	 *
	 * @see com.parasoft.parabank.web.form.OpenAccountForm#setFromAccountId(int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetFromAccountId() throws Throwable {
		// Given
		OpenAccountForm underTest = new OpenAccountForm();

		// When
		int fromAccountId = 0; // UTA: default value
		underTest.setFromAccountId(fromAccountId);

		// Then - assertions for this instance of OpenAccountForm
		assertNull(underTest.getType());
		assertEquals(0, underTest.getFromAccountId());

	}

	/**
	 * Parasoft Jtest UTA: Test for setType(AccountType)
	 *
	 * @see com.parasoft.parabank.web.form.OpenAccountForm#setType(AccountType)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetType() throws Throwable {
		// Given
		OpenAccountForm underTest = new OpenAccountForm();

		// When
		AccountType type = AccountType.CHECKING; // UTA: default value
		underTest.setType(type);

		// Then - assertions for this instance of OpenAccountForm
		assertEquals(com.parasoft.parabank.domain.Account.AccountType.CHECKING, underTest.getType());
		assertEquals(0, underTest.getFromAccountId());

	}
}