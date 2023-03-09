/**
 * 
 */
package com.parasoft.parabank.web.form;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;

import com.parasoft.parabank.domain.Address;
import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for LookupForm
 *
 * @see com.parasoft.parabank.web.form.LookupForm
 * @author devtest
 */
public class LookupFormTest {

	/**
	 * Parasoft Jtest UTA: Test for getAddress()
	 *
	 * @see com.parasoft.parabank.web.form.LookupForm#getAddress()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetAddress() throws Throwable {
		// Given
		LookupForm underTest = new LookupForm();

		// When
		Address result = underTest.getAddress();

		// Then - assertions for result of method getAddress()
		assertNull(result);

		// Then - assertions for this instance of LookupForm
		assertNull(underTest.getFirstName());
		assertNull(underTest.getLastName());
		assertNull(underTest.getSsn());

	}

	/**
	 * Parasoft Jtest UTA: Test for getFirstName()
	 *
	 * @see com.parasoft.parabank.web.form.LookupForm#getFirstName()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetFirstName() throws Throwable {
		// Given
		LookupForm underTest = new LookupForm();

		// When
		String result = underTest.getFirstName();

		// Then - assertions for result of method getFirstName()
		assertNull(result);

		// Then - assertions for this instance of LookupForm
		assertNull(underTest.getLastName());
		assertNull(underTest.getAddress());
		assertNull(underTest.getSsn());

	}

	/**
	 * Parasoft Jtest UTA: Test for getLastName()
	 *
	 * @see com.parasoft.parabank.web.form.LookupForm#getLastName()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetLastName() throws Throwable {
		// Given
		LookupForm underTest = new LookupForm();

		// When
		String result = underTest.getLastName();

		// Then - assertions for result of method getLastName()
		assertNull(result);

		// Then - assertions for this instance of LookupForm
		assertNull(underTest.getFirstName());
		assertNull(underTest.getAddress());
		assertNull(underTest.getSsn());

	}

	/**
	 * Parasoft Jtest UTA: Test for getSsn()
	 *
	 * @see com.parasoft.parabank.web.form.LookupForm#getSsn()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetSsn() throws Throwable {
		// Given
		LookupForm underTest = new LookupForm();

		// When
		String result = underTest.getSsn();

		// Then - assertions for result of method getSsn()
		assertNull(result);

		// Then - assertions for this instance of LookupForm
		assertNull(underTest.getFirstName());
		assertNull(underTest.getLastName());
		assertNull(underTest.getAddress());

	}

	/**
	 * Parasoft Jtest UTA: Test for setAddress(Address)
	 *
	 * @see com.parasoft.parabank.web.form.LookupForm#setAddress(Address)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetAddress() throws Throwable {
		// Given
		LookupForm underTest = new LookupForm();

		// When
		Address address = mock(Address.class);
		underTest.setAddress(address);

		// Then - assertions for argument 1 of method setAddress(Address)
		assertNull(address.getStreet());
		assertNull(address.getCity());
		assertNull(address.getState());
		assertNull(address.getZipCode());

		// Then - assertions for this instance of LookupForm
		assertNull(underTest.getFirstName());
		assertNull(underTest.getLastName());
		assertNotNull(underTest.getAddress());
		assertNull(underTest.getAddress().getStreet());
		assertNull(underTest.getAddress().getCity());
		assertNull(underTest.getAddress().getState());
		assertNull(underTest.getAddress().getZipCode());
		assertNull(underTest.getSsn());

	}

	/**
	 * Parasoft Jtest UTA: Test for setFirstName(String)
	 *
	 * @see com.parasoft.parabank.web.form.LookupForm#setFirstName(String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetFirstName() throws Throwable {
		// Given
		LookupForm underTest = new LookupForm();

		// When
		String firstName = "firstName"; // UTA: default value
		underTest.setFirstName(firstName);

		// Then - assertions for this instance of LookupForm
		assertEquals("firstName", underTest.getFirstName());
		assertNull(underTest.getLastName());
		assertNull(underTest.getAddress());
		assertNull(underTest.getSsn());

	}

	/**
	 * Parasoft Jtest UTA: Test for setLastName(String)
	 *
	 * @see com.parasoft.parabank.web.form.LookupForm#setLastName(String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetLastName() throws Throwable {
		// Given
		LookupForm underTest = new LookupForm();

		// When
		String lastName = "lastName"; // UTA: default value
		underTest.setLastName(lastName);

		// Then - assertions for this instance of LookupForm
		assertNull(underTest.getFirstName());
		assertEquals("lastName", underTest.getLastName());
		assertNull(underTest.getAddress());
		assertNull(underTest.getSsn());

	}

	/**
	 * Parasoft Jtest UTA: Test for setSsn(String)
	 *
	 * @see com.parasoft.parabank.web.form.LookupForm#setSsn(String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetSsn() throws Throwable {
		// Given
		LookupForm underTest = new LookupForm();

		// When
		String ssn = "ssn"; // UTA: default value
		underTest.setSsn(ssn);

		// Then - assertions for this instance of LookupForm
		assertNull(underTest.getFirstName());
		assertNull(underTest.getLastName());
		assertNull(underTest.getAddress());
		assertEquals("ssn", underTest.getSsn());

	}
}