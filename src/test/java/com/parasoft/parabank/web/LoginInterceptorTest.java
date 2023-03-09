/**
 * 
 */
package com.parasoft.parabank.web;

import static org.mockito.Mockito.mock;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for LoginInterceptor
 *
 * @see com.parasoft.parabank.web.LoginInterceptor
 * @author devtest
 */
public class LoginInterceptorTest {

	/**
	 * Parasoft Jtest UTA: Test for preHandle(HttpServletRequest, HttpServletResponse, Object)
	 *
	 * @see com.parasoft.parabank.web.LoginInterceptor#preHandle(HttpServletRequest, HttpServletResponse, Object)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testPreHandle() throws Throwable {
		// Given
		LoginInterceptor underTest = new LoginInterceptor();

		// When
		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpServletResponse response = mock(HttpServletResponse.class);
		Object handler = new Object(); // UTA: default value
		boolean result = underTest.preHandle(request, response, handler);

	}
}