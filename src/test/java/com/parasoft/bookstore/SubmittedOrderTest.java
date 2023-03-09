/**
 * 
 */
package com.parasoft.bookstore;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;

import java.util.Date;
import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for SubmittedOrder
 *
 * @see com.parasoft.bookstore.SubmittedOrder
 * @author devtest
 */
public class SubmittedOrderTest {

	/**
	 * Parasoft Jtest UTA: Test for getOrderTime()
	 *
	 * @see com.parasoft.bookstore.SubmittedOrder#getOrderTime()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetOrderTime() throws Throwable {
		// Given
		SubmittedOrder underTest = new SubmittedOrder();

		// When
		Date result = underTest.getOrderTime();

		// Then - assertions for result of method getOrderTime()
		assertNull(result);

		// Then - assertions for this instance of SubmittedOrder
		assertFalse(underTest.getSuccess());

	}

	/**
	 * Parasoft Jtest UTA: Test for getSuccess()
	 *
	 * @see com.parasoft.bookstore.SubmittedOrder#getSuccess()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetSuccess() throws Throwable {
		// Given
		SubmittedOrder underTest = new SubmittedOrder();

		// When
		boolean result = underTest.getSuccess();

		// Then - assertions for result of method getSuccess()
		assertFalse(result);

		// Then - assertions for this instance of SubmittedOrder
		assertNull(underTest.getOrderTime());

	}

	/**
	 * Parasoft Jtest UTA: Test for setOrderTime(Date)
	 *
	 * @see com.parasoft.bookstore.SubmittedOrder#setOrderTime(Date)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetOrderTime() throws Throwable {
		// Given
		SubmittedOrder underTest = new SubmittedOrder();

		// When
		Date date = mock(Date.class);
		underTest.setOrderTime(date);

		// Then - assertions for this instance of SubmittedOrder
		assertFalse(underTest.getSuccess());
		assertNotNull(underTest.getOrderTime());

	}

	/**
	 * Parasoft Jtest UTA: Test for setSuccess(boolean)
	 *
	 * @see com.parasoft.bookstore.SubmittedOrder#setSuccess(boolean)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetSuccess() throws Throwable {
		// Given
		SubmittedOrder underTest = new SubmittedOrder();

		// When
		boolean successIndicator = false; // UTA: default value
		underTest.setSuccess(successIndicator);

		// Then - assertions for this instance of SubmittedOrder
		assertFalse(underTest.getSuccess());
		assertNull(underTest.getOrderTime());

	}
}