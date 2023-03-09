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

import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for Payee
 *
 * @see com.parasoft.parabank.domain.Payee
 * @author devtest
 */
public class PayeeTest {

	/**
	 * Parasoft Jtest UTA: Test for equals(Object)
	 *
	 * @see com.parasoft.parabank.domain.Payee#equals(Object)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testEquals() throws Throwable {
		// Given
		Payee underTest = new Payee();

		// When
		Object obj = null; // UTA: provided value
		boolean result = underTest.equals(obj);

		// Then - assertions for result of method equals(Object)
		assertFalse(result);

		// Then - assertions for this instance of Payee
		assertNull(underTest.getName());
		assertNull(underTest.getAddress());
		assertNull(underTest.getPhoneNumber());
		assertNull(underTest.getAccountNumber());

	}

	/**
	 * Parasoft Jtest UTA: Test for equals(Object)
	 *
	 * @see com.parasoft.parabank.domain.Payee#equals(Object)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testEquals2() throws Throwable {
		// Given
		Payee underTest = new Payee();

		// When
		Payee obj = mock(Payee.class);
		boolean result = underTest.equals(obj);

		// Then - assertions for result of method equals(Object)
		assertTrue(result);

		// Then - assertions for this instance of Payee
		assertNull(underTest.getName());
		assertNull(underTest.getAddress());
		assertNull(underTest.getPhoneNumber());
		assertNull(underTest.getAccountNumber());

	}

	/**
	 * Parasoft Jtest UTA: Test for getAccountNumber()
	 *
	 * @see com.parasoft.parabank.domain.Payee#getAccountNumber()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetAccountNumber() throws Throwable {
		// Given
		Payee underTest = new Payee();

		// When
		Integer result = underTest.getAccountNumber();

		// Then - assertions for result of method getAccountNumber()
		assertNull(result);

		// Then - assertions for this instance of Payee
		assertNull(underTest.getName());
		assertNull(underTest.getAddress());
		assertNull(underTest.getPhoneNumber());

	}

	/**
	 * Parasoft Jtest UTA: Test for getAddress()
	 *
	 * @see com.parasoft.parabank.domain.Payee#getAddress()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetAddress() throws Throwable {
		// Given
		Payee underTest = new Payee();

		// When
		Address result = underTest.getAddress();

		// Then - assertions for result of method getAddress()
		assertNull(result);

		// Then - assertions for this instance of Payee
		assertNull(underTest.getName());
		assertNull(underTest.getPhoneNumber());
		assertNull(underTest.getAccountNumber());

	}

	/**
	 * Parasoft Jtest UTA: Test for getName()
	 *
	 * @see com.parasoft.parabank.domain.Payee#getName()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetName() throws Throwable {
		// Given
		Payee underTest = new Payee();

		// When
		String result = underTest.getName();

		// Then - assertions for result of method getName()
		assertNull(result);

		// Then - assertions for this instance of Payee
		assertNull(underTest.getAddress());
		assertNull(underTest.getPhoneNumber());
		assertNull(underTest.getAccountNumber());

	}

	/**
	 * Parasoft Jtest UTA: Test for getPhoneNumber()
	 *
	 * @see com.parasoft.parabank.domain.Payee#getPhoneNumber()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetPhoneNumber() throws Throwable {
		// Given
		Payee underTest = new Payee();

		// When
		String result = underTest.getPhoneNumber();

		// Then - assertions for result of method getPhoneNumber()
		assertNull(result);

		// Then - assertions for this instance of Payee
		assertNull(underTest.getName());
		assertNull(underTest.getAddress());
		assertNull(underTest.getAccountNumber());

	}

	/**
	 * Parasoft Jtest UTA: Test for hashCode()
	 *
	 * @see com.parasoft.parabank.domain.Payee#hashCode()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testHashCode() throws Throwable {
		// Given
		Payee underTest = new Payee();
		Address address = mock(Address.class);
		underTest.setAddress(address);
		Integer accountNumber = 0; // UTA: default value
		underTest.setAccountNumber(accountNumber);
		String name = "name"; // UTA: default value
		underTest.setName(name);
		String phoneNumber = "phoneNumber"; // UTA: default value
		underTest.setPhoneNumber(phoneNumber);

		// When
		int result = underTest.hashCode();

		// Then - assertions for result of method hashCode()
		// assertEquals(0, result);// UTA: Expected value may be unstable

		// Then - assertions for this instance of Payee
		assertEquals("name", underTest.getName());
		assertNotNull(underTest.getAddress());
		assertNull(underTest.getAddress().getStreet());
		assertNull(underTest.getAddress().getCity());
		assertNull(underTest.getAddress().getState());
		assertNull(underTest.getAddress().getZipCode());
		assertEquals("phoneNumber", underTest.getPhoneNumber());
		assertNotNull(underTest.getAccountNumber());
		assertEquals(0, underTest.getAccountNumber().intValue());

	}

	/**
	 * Parasoft Jtest UTA: Test for toString()
	 *
	 * @see com.parasoft.parabank.domain.Payee#toString()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testToString() throws Throwable {
		// Given
		Payee underTest = new Payee();
		Address address = mock(Address.class);
		underTest.setAddress(address);
		Integer accountNumber = 0; // UTA: default value
		underTest.setAccountNumber(accountNumber);
		String name = "name"; // UTA: default value
		underTest.setName(name);
		String phoneNumber = "phoneNumber"; // UTA: default value
		underTest.setPhoneNumber(phoneNumber);

		// When
		String result = underTest.toString();

		// Then - assertions for result of method toString()
		assertEquals(
"[deleted by script]",
				result);

		// Then - assertions for this instance of Payee
		assertEquals("name", underTest.getName());
		assertNotNull(underTest.getAddress());
		assertNull(underTest.getAddress().getStreet());
		assertNull(underTest.getAddress().getCity());
		assertNull(underTest.getAddress().getState());
		assertNull(underTest.getAddress().getZipCode());
		assertEquals("phoneNumber", underTest.getPhoneNumber());
		assertNotNull(underTest.getAccountNumber());
		assertEquals(0, underTest.getAccountNumber().intValue());

	}
}