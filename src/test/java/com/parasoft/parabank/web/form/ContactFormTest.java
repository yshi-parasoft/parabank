/**
 * 
 */
package com.parasoft.parabank.web.form;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for ContactForm
 *
 * @see com.parasoft.parabank.web.form.ContactForm
 * @author devtest
 */
public class ContactFormTest {

	/**
	 * Parasoft Jtest UTA: Test for getEmail()
	 *
	 * @see com.parasoft.parabank.web.form.ContactForm#getEmail()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetEmail() throws Throwable {
		// Given
		ContactForm underTest = new ContactForm();

		// When
		String result = underTest.getEmail();

		// Then - assertions for result of method getEmail()
		assertNull(result);

		// Then - assertions for this instance of ContactForm
		assertNull(underTest.getName());
		assertNull(underTest.getPhone());
		assertNull(underTest.getMessage());

	}

	/**
	 * Parasoft Jtest UTA: Test for getMessage()
	 *
	 * @see com.parasoft.parabank.web.form.ContactForm#getMessage()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetMessage() throws Throwable {
		// Given
		ContactForm underTest = new ContactForm();

		// When
		String result = underTest.getMessage();

		// Then - assertions for result of method getMessage()
		assertNull(result);

		// Then - assertions for this instance of ContactForm
		assertNull(underTest.getName());
		assertNull(underTest.getEmail());
		assertNull(underTest.getPhone());

	}

	/**
	 * Parasoft Jtest UTA: Test for getName()
	 *
	 * @see com.parasoft.parabank.web.form.ContactForm#getName()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetName() throws Throwable {
		// Given
		ContactForm underTest = new ContactForm();

		// When
		String result = underTest.getName();

		// Then - assertions for result of method getName()
		assertNull(result);

		// Then - assertions for this instance of ContactForm
		assertNull(underTest.getEmail());
		assertNull(underTest.getPhone());
		assertNull(underTest.getMessage());

	}

	/**
	 * Parasoft Jtest UTA: Test for getPhone()
	 *
	 * @see com.parasoft.parabank.web.form.ContactForm#getPhone()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetPhone() throws Throwable {
		// Given
		ContactForm underTest = new ContactForm();

		// When
		String result = underTest.getPhone();

		// Then - assertions for result of method getPhone()
		assertNull(result);

		// Then - assertions for this instance of ContactForm
		assertNull(underTest.getName());
		assertNull(underTest.getEmail());
		assertNull(underTest.getMessage());

	}

	/**
	 * Parasoft Jtest UTA: Test for setEmail(String)
	 *
	 * @see com.parasoft.parabank.web.form.ContactForm#setEmail(String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetEmail() throws Throwable {
		// Given
		ContactForm underTest = new ContactForm();

		// When
		String email = "email"; // UTA: default value
		underTest.setEmail(email);

		// Then - assertions for this instance of ContactForm
		assertNull(underTest.getName());
		assertEquals("email", underTest.getEmail());
		assertNull(underTest.getPhone());
		assertNull(underTest.getMessage());

	}

	/**
	 * Parasoft Jtest UTA: Test for setMessage(String)
	 *
	 * @see com.parasoft.parabank.web.form.ContactForm#setMessage(String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetMessage() throws Throwable {
		// Given
		ContactForm underTest = new ContactForm();

		// When
		String message = "message"; // UTA: default value
		underTest.setMessage(message);

		// Then - assertions for this instance of ContactForm
		assertNull(underTest.getName());
		assertNull(underTest.getEmail());
		assertNull(underTest.getPhone());
		assertEquals("message", underTest.getMessage());

	}

	/**
	 * Parasoft Jtest UTA: Test for setName(String)
	 *
	 * @see com.parasoft.parabank.web.form.ContactForm#setName(String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetName() throws Throwable {
		// Given
		ContactForm underTest = new ContactForm();

		// When
		String name = "name"; // UTA: default value
		underTest.setName(name);

		// Then - assertions for this instance of ContactForm
		assertEquals("name", underTest.getName());
		assertNull(underTest.getEmail());
		assertNull(underTest.getPhone());
		assertNull(underTest.getMessage());

	}

	/**
	 * Parasoft Jtest UTA: Test for setPhone(String)
	 *
	 * @see com.parasoft.parabank.web.form.ContactForm#setPhone(String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetPhone() throws Throwable {
		// Given
		ContactForm underTest = new ContactForm();

		// When
		String phone = "phone"; // UTA: default value
		underTest.setPhone(phone);

		// Then - assertions for this instance of ContactForm
		assertNull(underTest.getName());
		assertNull(underTest.getEmail());
		assertEquals("phone", underTest.getPhone());
		assertNull(underTest.getMessage());

	}
}