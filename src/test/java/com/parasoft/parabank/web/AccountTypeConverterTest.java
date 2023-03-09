/**
 * 
 */
package com.parasoft.parabank.web;

import static org.junit.Assert.assertNull;

import com.parasoft.parabank.domain.Account.AccountType;
import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for AccountTypeConverter
 *
 * @see com.parasoft.parabank.web.AccountTypeConverter
 * @author devtest
 */
public class AccountTypeConverterTest {

	/**
	 * Parasoft Jtest UTA: Test for convert(String)
	 *
	 * @see com.parasoft.parabank.web.AccountTypeConverter#convert(String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testConvert() throws Throwable {
		// Given
		AccountTypeConverter underTest = new AccountTypeConverter();

		// When
		String key = "key"; // UTA: default value
		AccountType result = underTest.convert(key);

	}

	/**
	 * Parasoft Jtest UTA: Test for convert(String)
	 *
	 * @see com.parasoft.parabank.web.AccountTypeConverter#convert(String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testConvert2() throws Throwable {
		// Given
		AccountTypeConverter underTest = new AccountTypeConverter();

		// When
		String key = null; // UTA: provided value
		AccountType result = underTest.convert(key);

		// Then - assertions for result of method convert(String)
		assertNull(result);

	}
}