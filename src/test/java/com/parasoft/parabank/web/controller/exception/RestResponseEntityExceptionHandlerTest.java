/**
 * 
 */
package com.parasoft.parabank.web.controller.exception;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.WebRequest;

/**
 * Parasoft Jtest UTA: Test class for RestResponseEntityExceptionHandler
 *
 * @see com.parasoft.parabank.web.controller.exception.RestResponseEntityExceptionHandler
 * @author devtest
 */
public class RestResponseEntityExceptionHandlerTest {

	/**
	 * Parasoft Jtest UTA: Test for handleAuthenticationError(AuthenticationException, WebRequest)
	 *
	 * @see com.parasoft.parabank.web.controller.exception.RestResponseEntityExceptionHandler#handleAuthenticationError(AuthenticationException, WebRequest)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testHandleAuthenticationError() throws Throwable {
		// Given
		RestResponseEntityExceptionHandler underTest = new RestResponseEntityExceptionHandler();

		// When
		AuthenticationException ex = mockAuthenticationException();
		WebRequest request = mock(WebRequest.class);
		ResponseEntity<Object> result = underTest.handleAuthenticationError(ex, request);

		// Then - assertions for argument 1 of method handleAuthenticationError(AuthenticationException, WebRequest)
		assertNull(ex.getMessage());

		// Then - assertions for result of method handleAuthenticationError(AuthenticationException, WebRequest)
		assertNotNull(result);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AuthenticationException
	 */
	private static AuthenticationException mockAuthenticationException() throws Throwable {
		AuthenticationException ex = mock(AuthenticationException.class);
		Object getMessageBodyResult = new Object(); // UTA: default value
		when(ex.getMessageBody()).thenReturn(getMessageBodyResult);
		return ex;
	}
}