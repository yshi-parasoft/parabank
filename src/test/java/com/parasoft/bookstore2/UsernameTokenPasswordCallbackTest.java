/**
 * 
 */
package com.parasoft.bookstore2;

import javax.security.auth.callback.Callback;
import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for UsernameTokenPasswordCallback
 *
 * @see com.parasoft.bookstore2.UsernameTokenPasswordCallback
 * @author devtest
 */
public class UsernameTokenPasswordCallbackTest {

	/**
	 * Parasoft Jtest UTA: Test for handle(Callback[])
	 *
	 * @see com.parasoft.bookstore2.UsernameTokenPasswordCallback#handle(Callback[])
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testHandle() throws Throwable {
		// Given
		UsernameTokenPasswordCallback underTest = new UsernameTokenPasswordCallback();

		// When
		Callback[] callbacks = new javax.security.auth.callback.Callback[0]; // UTA: default value
		underTest.handle(callbacks);

	}
}