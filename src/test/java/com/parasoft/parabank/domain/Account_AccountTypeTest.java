/**
 * 
 */
package com.parasoft.parabank.domain;

import static org.junit.Assert.assertFalse;

import com.parasoft.parabank.domain.Account.AccountType;
import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for AccountType
 *
 * @see com.parasoft.parabank.domain.Account.AccountType
 * @author devtest
 */
public class Account_AccountTypeTest {

	/**
	 * Parasoft Jtest UTA: Test for isInternal()
	 *
	 * @see com.parasoft.parabank.domain.Account.AccountType#isInternal()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testIsInternal() throws Throwable {
		// Given
		AccountType underTest = AccountType.CHECKING;

		// When
		boolean result = underTest.isInternal();

		// Then - assertions for result of method isInternal()
		assertFalse(result);

	}
}