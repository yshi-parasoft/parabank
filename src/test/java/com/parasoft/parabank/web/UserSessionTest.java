/**
 * 
 */
package com.parasoft.parabank.web;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;

import com.parasoft.parabank.domain.Customer;
import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for UserSession
 *
 * @see com.parasoft.parabank.web.UserSession
 * @author devtest
 */
public class UserSessionTest {

	/**
	 * Parasoft Jtest UTA: Test for getCustomer()
	 *
	 * @see com.parasoft.parabank.web.UserSession#getCustomer()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetCustomer() throws Throwable {
		// Given
		Customer customer = mock(Customer.class);
		UserSession underTest = new UserSession(customer);

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

	}
}