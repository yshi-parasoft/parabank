/**
 * 
 */
package com.parasoft.parabank.web.controller.exception;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for AuthenticationException
 *
 * @see com.parasoft.parabank.web.controller.exception.AuthenticationException
 * @author devtest
 */
public class AuthenticationExceptionTest {

	/**
	 * Parasoft Jtest UTA: Test for getMessageBody()
	 *
	 * @see com.parasoft.parabank.web.controller.exception.AuthenticationException#getMessageBody()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetMessageBody() throws Throwable {
		// Given
		String errorMessage = "errorMessage"; // UTA: default value
		AuthenticationException underTest = new AuthenticationException(errorMessage);

		// When
		Object result = underTest.getMessageBody();

		// Then - assertions for result of method getMessageBody()
		assertNotNull(result);

		// Then - assertions for this instance of AuthenticationException
		assertNull(underTest.getMessage());

	}
}