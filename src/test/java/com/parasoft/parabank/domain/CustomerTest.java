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
 * Parasoft Jtest UTA: Test class for Customer
 *
 * @see com.parasoft.parabank.domain.Customer
 * @author devtest
 */
public class CustomerTest {

	/**
	 * Parasoft Jtest UTA: Test for equals(Object)
	 *
	 * @see com.parasoft.parabank.domain.Customer#equals(Object)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testEquals() throws Throwable {
		// Given
		Customer underTest = new Customer();

		// When
		Object obj = null; // UTA: provided value
		boolean result = underTest.equals(obj);

		// Then - assertions for result of method equals(Object)
		assertFalse(result);

		// Then - assertions for this instance of Customer
		assertEquals(0, underTest.getId());
		assertNull(underTest.getFirstName());
		assertNull(underTest.getLastName());
		assertNull(underTest.getAddress());
		assertNull(underTest.getPhoneNumber());
		assertNull(underTest.getSsn());
		assertNull(underTest.getUsername());
		assertNull(underTest.getPassword());

	}

	/**
	 * Parasoft Jtest UTA: Test for equals(Object)
	 *
	 * @see com.parasoft.parabank.domain.Customer#equals(Object)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testEquals2() throws Throwable {
		// Given
		Customer underTest = new Customer();
		int id = 0; // UTA: provided value
		underTest.setId(id);

		// When
		Customer obj = mock(Customer.class);
		boolean result = underTest.equals(obj);

		// Then - assertions for result of method equals(Object)
		assertTrue(result);

		// Then - assertions for this instance of Customer
		assertEquals(0, underTest.getId());
		assertNull(underTest.getFirstName());
		assertNull(underTest.getLastName());
		assertNull(underTest.getAddress());
		assertNull(underTest.getPhoneNumber());
		assertNull(underTest.getSsn());
		assertNull(underTest.getUsername());
		assertNull(underTest.getPassword());

	}

	/**
	 * Parasoft Jtest UTA: Test for getAddress()
	 *
	 * @see com.parasoft.parabank.domain.Customer#getAddress()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetAddress() throws Throwable {
		// Given
		Customer underTest = new Customer();

		// When
		Address result = underTest.getAddress();

		// Then - assertions for result of method getAddress()
		assertNull(result);

		// Then - assertions for this instance of Customer
		assertEquals(0, underTest.getId());
		assertNull(underTest.getFirstName());
		assertNull(underTest.getLastName());
		assertNull(underTest.getPhoneNumber());
		assertNull(underTest.getSsn());
		assertNull(underTest.getUsername());
		assertNull(underTest.getPassword());

	}

	/**
	 * Parasoft Jtest UTA: Test for getFirstName()
	 *
	 * @see com.parasoft.parabank.domain.Customer#getFirstName()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetFirstName() throws Throwable {
		// Given
		Customer underTest = new Customer();

		// When
		String result = underTest.getFirstName();

		// Then - assertions for result of method getFirstName()
		assertNull(result);

		// Then - assertions for this instance of Customer
		assertEquals(0, underTest.getId());
		assertNull(underTest.getLastName());
		assertNull(underTest.getAddress());
		assertNull(underTest.getPhoneNumber());
		assertNull(underTest.getSsn());
		assertNull(underTest.getUsername());
		assertNull(underTest.getPassword());

	}

	/**
	 * Parasoft Jtest UTA: Test for getFullName()
	 *
	 * @see com.parasoft.parabank.domain.Customer#getFullName()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetFullName() throws Throwable {
		// Given
		Customer underTest = new Customer();
		String firstName = "firstName"; // UTA: default value
		underTest.setFirstName(firstName);
		String lastName = "lastName"; // UTA: default value
		underTest.setLastName(lastName);

		// When
		String result = underTest.getFullName();

		// Then - assertions for result of method getFullName()
		assertEquals("firstName lastName", result);

		// Then - assertions for this instance of Customer
		assertEquals(0, underTest.getId());
		assertEquals("firstName", underTest.getFirstName());
		assertEquals("lastName", underTest.getLastName());
		assertNull(underTest.getAddress());
		assertNull(underTest.getPhoneNumber());
		assertNull(underTest.getSsn());
		assertNull(underTest.getUsername());
		assertNull(underTest.getPassword());

	}

	/**
	 * Parasoft Jtest UTA: Test for getId()
	 *
	 * @see com.parasoft.parabank.domain.Customer#getId()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetId() throws Throwable {
		// Given
		Customer underTest = new Customer();

		// When
		int result = underTest.getId();

		// Then - assertions for result of method getId()
		assertEquals(0, result);

		// Then - assertions for this instance of Customer
		assertNull(underTest.getFirstName());
		assertNull(underTest.getLastName());
		assertNull(underTest.getAddress());
		assertNull(underTest.getPhoneNumber());
		assertNull(underTest.getSsn());
		assertNull(underTest.getUsername());
		assertNull(underTest.getPassword());

	}

	/**
	 * Parasoft Jtest UTA: Test for getLastName()
	 *
	 * @see com.parasoft.parabank.domain.Customer#getLastName()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetLastName() throws Throwable {
		// Given
		Customer underTest = new Customer();

		// When
		String result = underTest.getLastName();

		// Then - assertions for result of method getLastName()
		assertNull(result);

		// Then - assertions for this instance of Customer
		assertEquals(0, underTest.getId());
		assertNull(underTest.getFirstName());
		assertNull(underTest.getAddress());
		assertNull(underTest.getPhoneNumber());
		assertNull(underTest.getSsn());
		assertNull(underTest.getUsername());
		assertNull(underTest.getPassword());

	}

	/**
	 * Parasoft Jtest UTA: Test for getPassword()
	 *
	 * @see com.parasoft.parabank.domain.Customer#getPassword()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetPassword() throws Throwable {
		// Given
		Customer underTest = new Customer();

		// When
		String result = underTest.getPassword();

		// Then - assertions for result of method getPassword()
		assertNull(result);

		// Then - assertions for this instance of Customer
		assertEquals(0, underTest.getId());
		assertNull(underTest.getFirstName());
		assertNull(underTest.getLastName());
		assertNull(underTest.getAddress());
		assertNull(underTest.getPhoneNumber());
		assertNull(underTest.getSsn());
		assertNull(underTest.getUsername());

	}

	/**
	 * Parasoft Jtest UTA: Test for getPhoneNumber()
	 *
	 * @see com.parasoft.parabank.domain.Customer#getPhoneNumber()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetPhoneNumber() throws Throwable {
		// Given
		Customer underTest = new Customer();

		// When
		String result = underTest.getPhoneNumber();

		// Then - assertions for result of method getPhoneNumber()
		assertNull(result);

		// Then - assertions for this instance of Customer
		assertEquals(0, underTest.getId());
		assertNull(underTest.getFirstName());
		assertNull(underTest.getLastName());
		assertNull(underTest.getAddress());
		assertNull(underTest.getSsn());
		assertNull(underTest.getUsername());
		assertNull(underTest.getPassword());

	}

	/**
	 * Parasoft Jtest UTA: Test for getSsn()
	 *
	 * @see com.parasoft.parabank.domain.Customer#getSsn()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetSsn() throws Throwable {
		// Given
		Customer underTest = new Customer();

		// When
		String result = underTest.getSsn();

		// Then - assertions for result of method getSsn()
		assertNull(result);

		// Then - assertions for this instance of Customer
		assertEquals(0, underTest.getId());
		assertNull(underTest.getFirstName());
		assertNull(underTest.getLastName());
		assertNull(underTest.getAddress());
		assertNull(underTest.getPhoneNumber());
		assertNull(underTest.getUsername());
		assertNull(underTest.getPassword());

	}

	/**
	 * Parasoft Jtest UTA: Test for getUsername()
	 *
	 * @see com.parasoft.parabank.domain.Customer#getUsername()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetUsername() throws Throwable {
		// Given
		Customer underTest = new Customer();

		// When
		String result = underTest.getUsername();

		// Then - assertions for result of method getUsername()
		assertNull(result);

		// Then - assertions for this instance of Customer
		assertEquals(0, underTest.getId());
		assertNull(underTest.getFirstName());
		assertNull(underTest.getLastName());
		assertNull(underTest.getAddress());
		assertNull(underTest.getPhoneNumber());
		assertNull(underTest.getSsn());
		assertNull(underTest.getPassword());

	}

	/**
	 * Parasoft Jtest UTA: Test for hashCode()
	 *
	 * @see com.parasoft.parabank.domain.Customer#hashCode()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testHashCode() throws Throwable {
		// Given
		Customer underTest = new Customer();
		Address address = mock(Address.class);
		underTest.setAddress(address);
		String firstName = "firstName"; // UTA: default value
		underTest.setFirstName(firstName);
		String lastName = "lastName"; // UTA: default value
		underTest.setLastName(lastName);
		String password = "password"; // UTA: default value
		underTest.setPassword(password);
		String phoneNumber = "phoneNumber"; // UTA: default value
		underTest.setPhoneNumber(phoneNumber);
		String ssn = "ssn"; // UTA: default value
		underTest.setSsn(ssn);
		String username = "username"; // UTA: default value
		underTest.setUsername(username);

		// When
		int result = underTest.hashCode();

		// Then - assertions for result of method hashCode()
		// assertEquals(0, result);// UTA: Expected value may be unstable

		// Then - assertions for this instance of Customer
		assertEquals(0, underTest.getId());
		assertEquals("firstName", underTest.getFirstName());
		assertEquals("lastName", underTest.getLastName());
		assertNotNull(underTest.getAddress());
		assertNull(underTest.getAddress().getStreet());
		assertNull(underTest.getAddress().getCity());
		assertNull(underTest.getAddress().getState());
		assertNull(underTest.getAddress().getZipCode());
		assertEquals("phoneNumber", underTest.getPhoneNumber());
		assertEquals("ssn", underTest.getSsn());
		assertEquals("username", underTest.getUsername());
		assertEquals("password", underTest.getPassword());

	}

	/**
	 * Parasoft Jtest UTA: Test for toString()
	 *
	 * @see com.parasoft.parabank.domain.Customer#toString()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testToString() throws Throwable {
		// Given
		Customer underTest = new Customer();
		Address address = mock(Address.class);
		underTest.setAddress(address);
		String firstName = "firstName"; // UTA: default value
		underTest.setFirstName(firstName);
		String lastName = "lastName"; // UTA: default value
		underTest.setLastName(lastName);
		String password = "password"; // UTA: default value
		underTest.setPassword(password);
		String phoneNumber = "phoneNumber"; // UTA: default value
		underTest.setPhoneNumber(phoneNumber);
		String ssn = "ssn"; // UTA: default value
		underTest.setSsn(ssn);
		String username = "username"; // UTA: default value
		underTest.setUsername(username);

		// When
		String result = underTest.toString();

		// Then - assertions for result of method toString()
		assertEquals(
"[deleted by script]",
				result);

		// Then - assertions for this instance of Customer
		assertEquals(0, underTest.getId());
		assertEquals("firstName", underTest.getFirstName());
		assertEquals("lastName", underTest.getLastName());
		assertNotNull(underTest.getAddress());
		assertNull(underTest.getAddress().getStreet());
		assertNull(underTest.getAddress().getCity());
		assertNull(underTest.getAddress().getState());
		assertNull(underTest.getAddress().getZipCode());
		assertEquals("phoneNumber", underTest.getPhoneNumber());
		assertEquals("ssn", underTest.getSsn());
		assertEquals("username", underTest.getUsername());
		assertEquals("password", underTest.getPassword());

	}
}