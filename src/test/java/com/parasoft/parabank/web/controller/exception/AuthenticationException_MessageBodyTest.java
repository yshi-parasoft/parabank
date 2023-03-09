/**
 * 
 */
package com.parasoft.parabank.web.controller.exception;

import static org.junit.Assert.assertEquals;

import com.parasoft.parabank.web.controller.exception.AuthenticationException.MessageBody;
import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for MessageBody
 *
 * @see com.parasoft.parabank.web.controller.exception.AuthenticationException.MessageBody
 * @author devtest
 */
public class AuthenticationException_MessageBodyTest {

	/**
	 * Parasoft Jtest UTA: Test for getMessage()
	 *
	 * @see com.parasoft.parabank.web.controller.exception.AuthenticationException.MessageBody#getMessage()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetMessage() throws Throwable {
		// Given
		String message = "message"; // UTA: default value
		MessageBody underTest = new MessageBody(message);

		// When
		String result = underTest.getMessage();

		// Then - assertions for result of method getMessage()
		assertEquals("message", result);

	}

}