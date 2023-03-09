/**
 * 
 */
package com.parasoft.parabank.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for Address
 *
 * @see com.parasoft.parabank.domain.Address
 * @author devtest
 */
public class AddressTest {

	/**
	 * Parasoft Jtest UTA: Test for equals(Object)
	 *
	 * @see com.parasoft.parabank.domain.Address#equals(Object)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testEquals() throws Throwable {
		// Given
		Address underTest = new Address();

		// When
		Object obj = null; // UTA: provided value
		boolean result = underTest.equals(obj);

		// Then - assertions for result of method equals(Object)
		assertFalse(result);

		// Then - assertions for this instance of Address
		assertNull(underTest.getStreet());
		assertNull(underTest.getCity());
		assertNull(underTest.getState());
		assertNull(underTest.getZipCode());

	}

	/**
	 * Parasoft Jtest UTA: Test for equals(Object)
	 *
	 * @see com.parasoft.parabank.domain.Address#equals(Object)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testEquals2() throws Throwable {
		// Given
		Address underTest = new Address();

		// When
		Address obj = mock(Address.class);
		boolean result = underTest.equals(obj);

		// Then - assertions for result of method equals(Object)
		assertTrue(result);

		// Then - assertions for this instance of Address
		assertNull(underTest.getStreet());
		assertNull(underTest.getCity());
		assertNull(underTest.getState());
		assertNull(underTest.getZipCode());

	}

	/**
	 * Parasoft Jtest UTA: Test for getCity()
	 *
	 * @see com.parasoft.parabank.domain.Address#getCity()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetCity() throws Throwable {
		// Given
		Address underTest = new Address();

		// When
		String result = underTest.getCity();

		// Then - assertions for result of method getCity()
		assertNull(result);

		// Then - assertions for this instance of Address
		assertNull(underTest.getStreet());
		assertNull(underTest.getState());
		assertNull(underTest.getZipCode());

	}

	/**
	 * Parasoft Jtest UTA: Test for getState()
	 *
	 * @see com.parasoft.parabank.domain.Address#getState()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetState() throws Throwable {
		// Given
		Address underTest = new Address();

		// When
		String result = underTest.getState();

		// Then - assertions for result of method getState()
		assertNull(result);

		// Then - assertions for this instance of Address
		assertNull(underTest.getStreet());
		assertNull(underTest.getCity());
		assertNull(underTest.getZipCode());

	}

	/**
	 * Parasoft Jtest UTA: Test for getStreet()
	 *
	 * @see com.parasoft.parabank.domain.Address#getStreet()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetStreet() throws Throwable {
		// Given
		Address underTest = new Address();

		// When
		String result = underTest.getStreet();

		// Then - assertions for result of method getStreet()
		assertNull(result);

		// Then - assertions for this instance of Address
		assertNull(underTest.getCity());
		assertNull(underTest.getState());
		assertNull(underTest.getZipCode());

	}

	/**
	 * Parasoft Jtest UTA: Test for getZipCode()
	 *
	 * @see com.parasoft.parabank.domain.Address#getZipCode()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetZipCode() throws Throwable {
		// Given
		Address underTest = new Address();

		// When
		String result = underTest.getZipCode();

		// Then - assertions for result of method getZipCode()
		assertNull(result);

		// Then - assertions for this instance of Address
		assertNull(underTest.getStreet());
		assertNull(underTest.getCity());
		assertNull(underTest.getState());

	}

	/**
	 * Parasoft Jtest UTA: Test for hashCode()
	 *
	 * @see com.parasoft.parabank.domain.Address#hashCode()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testHashCode() throws Throwable {
		// Given
		Address underTest = new Address();
		String city = "city"; // UTA: default value
		underTest.setCity(city);
		String state = "state"; // UTA: default value
		underTest.setState(state);
		String street = "street"; // UTA: default value
		underTest.setStreet(street);
		String zipCode = "zipCode"; // UTA: default value
		underTest.setZipCode(zipCode);

		// When
		int result = underTest.hashCode();

		// Then - assertions for result of method hashCode()
		// assertEquals(0, result);// UTA: Expected value may be unstable

		// Then - assertions for this instance of Address
		assertEquals("street", underTest.getStreet());
		assertEquals("city", underTest.getCity());
		assertEquals("state", underTest.getState());
		assertEquals("zipCode", underTest.getZipCode());

	}

	/**
	 * Parasoft Jtest UTA: Test for toString()
	 *
	 * @see com.parasoft.parabank.domain.Address#toString()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testToString() throws Throwable {
		// Given
		Address underTest = new Address();
		String city = "city"; // UTA: default value
		underTest.setCity(city);
		String state = "state"; // UTA: default value
		underTest.setState(state);
		String street = "street"; // UTA: default value
		underTest.setStreet(street);
		String zipCode = "zipCode"; // UTA: default value
		underTest.setZipCode(zipCode);

		// When
		String result = underTest.toString();

		// Then - assertions for result of method toString()
		assertEquals("Address [street=street, city=city, state=state, zipCode=zipCode]", result);

		// Then - assertions for this instance of Address
		assertEquals("street", underTest.getStreet());
		assertEquals("city", underTest.getCity());
		assertEquals("state", underTest.getState());
		assertEquals("zipCode", underTest.getZipCode());

	}
}