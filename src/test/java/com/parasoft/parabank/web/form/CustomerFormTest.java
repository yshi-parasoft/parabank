/**
 * 
 */
package com.parasoft.parabank.web.form;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import com.parasoft.parabank.domain.Customer;
import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for CustomerForm
 *
 * @see com.parasoft.parabank.web.form.CustomerForm
 * @author devtest
 */
public class CustomerFormTest {

	/**
	 * Parasoft Jtest UTA: Test for getCustomer()
	 *
	 * @see com.parasoft.parabank.web.form.CustomerForm#getCustomer()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetCustomer() throws Throwable {
		// Given
		CustomerForm underTest = new CustomerForm();

		// When
		Customer result = underTest.getCustomer();

		// Then - assertions for result of method getCustomer()
		assertNotNull(result);
		assertEquals(0, result.getId());
		assertNull(result.getFirstName());
		assertNull(result.getLastName());
		assertNull(result.getAddress());
		assertNull(result.getPhoneNumber());
		assertNull(result.getSsn());
		assertNull(result.getUsername());
		assertNull(result.getPassword());

		// Then - assertions for this instance of CustomerForm
		assertNull(underTest.getRepeatedPassword());

	}

	/**
	 * Parasoft Jtest UTA: Test for getRepeatedPassword()
	 *
	 * @see com.parasoft.parabank.web.form.CustomerForm#getRepeatedPassword()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetRepeatedPassword() throws Throwable {
		// Given
		CustomerForm underTest = new CustomerForm();

		// When
		String result = underTest.getRepeatedPassword();

		// Then - assertions for result of method getRepeatedPassword()
		assertNull(result);

		// Then - assertions for this instance of CustomerForm
		assertNotNull(underTest.getCustomer());
		assertEquals(0, underTest.getCustomer().getId());
		assertNull(underTest.getCustomer().getFirstName());
		assertNull(underTest.getCustomer().getLastName());
		assertNull(underTest.getCustomer().getAddress());
		assertNull(underTest.getCustomer().getPhoneNumber());
		assertNull(underTest.getCustomer().getSsn());
		assertNull(underTest.getCustomer().getUsername());
		assertNull(underTest.getCustomer().getPassword());

	}

	/**
	 * Parasoft Jtest UTA: Test for setRepeatedPassword(String)
	 *
	 * @see com.parasoft.parabank.web.form.CustomerForm#setRepeatedPassword(String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetRepeatedPassword() throws Throwable {
		// Given
		CustomerForm underTest = new CustomerForm();

		// When
		String repeatedPassword = "repeatedPassword"; // UTA: default value
		underTest.setRepeatedPassword(repeatedPassword);

		// Then - assertions for this instance of CustomerForm
		assertNotNull(underTest.getCustomer());
		assertEquals(0, underTest.getCustomer().getId());
		assertNull(underTest.getCustomer().getFirstName());
		assertNull(underTest.getCustomer().getLastName());
		assertNull(underTest.getCustomer().getAddress());
		assertNull(underTest.getCustomer().getPhoneNumber());
		assertNull(underTest.getCustomer().getSsn());
		assertNull(underTest.getCustomer().getUsername());
		assertNull(underTest.getCustomer().getPassword());
		assertEquals("repeatedPassword", underTest.getRepeatedPassword());

	}
}