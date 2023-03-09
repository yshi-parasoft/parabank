/**
 * 
 */
package com.parasoft.bookstore;

import javax.security.auth.callback.Callback;
import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for KeystorePasswordCallback
 *
 * @see com.parasoft.bookstore.KeystorePasswordCallback
 * @author devtest
 */
public class KeystorePasswordCallbackTest {

	/**
	 * Parasoft Jtest UTA: Test for handle(Callback[])
	 *
	 * @see com.parasoft.bookstore.KeystorePasswordCallback#handle(Callback[])
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testHandle() throws Throwable {
		// Given
		KeystorePasswordCallback underTest = new KeystorePasswordCallback();

		// When
		Callback[] callbacks = new javax.security.auth.callback.Callback[0]; // UTA: default value
		underTest.handle(callbacks);

	}
}