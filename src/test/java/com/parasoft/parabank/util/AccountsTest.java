/**
 * 
 */
package com.parasoft.parabank.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

import com.parasoft.parabank.domain.Account;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for Accounts
 *
 * @see com.parasoft.parabank.util.Accounts
 * @author devtest
 */
public class AccountsTest {

	/**
	 * Parasoft Jtest UTA: Test for getAccs()
	 *
	 * @see com.parasoft.parabank.util.Accounts#getAccs()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetAccs() throws Throwable {
		// Given
		Accounts underTest = new Accounts();

		// When
		List<Account> result = underTest.getAccs();

		// Then - assertions for result of method getAccs()
		assertNotNull(result);
		assertEquals(0, result.size());

	}

	/**
	 * Parasoft Jtest UTA: Test for setAccs(List)
	 *
	 * @see com.parasoft.parabank.util.Accounts#setAccs(List)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetAccs() throws Throwable {
		// Given
		Accounts underTest = new Accounts();

		// When
		List<Account> accounts = new ArrayList<Account>(); // UTA: default value
		Account item = mock(Account.class);
		accounts.add(item);
		underTest.setAccs(accounts);

		// Then - assertions for this instance of Accounts
		assertNotNull(underTest.getAccs());
		assertEquals(1, underTest.getAccs().size());

	}

	/**
	 * Parasoft Jtest UTA: Test for toString()
	 *
	 * @see com.parasoft.parabank.util.Accounts#toString()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testToString() throws Throwable {
		// Given
		Accounts underTest = new Accounts();
		List<Account> accountsValue = new ArrayList<Account>(); // UTA: default value
		Account item = mock(Account.class);
		accountsValue.add(item);
		underTest.accounts = accountsValue;

		// When
		String result = underTest.toString();

		// Then - assertions for result of method toString()

		// Then - assertions for this instance of Accounts
		assertNotNull(underTest.getAccs());
		assertEquals(1, underTest.getAccs().size());

	}
}