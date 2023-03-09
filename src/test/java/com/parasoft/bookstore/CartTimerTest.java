/**
 * 
 */
package com.parasoft.bookstore;

import org.junit.Test;


/**
 * Parasoft Jtest UTA: Test class for CartTimer
 *
 * @see com.parasoft.bookstore.CartTimer
 * @author devtest
 */
public class CartTimerTest
{

	/**
	 * Parasoft Jtest UTA: Test for run()
	 *
	 * @see com.parasoft.bookstore.CartTimer#run()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testRun() throws Throwable {
		// Given
		CartTimer underTest = new CartTimer();

		// When
		underTest.run();

	}
}