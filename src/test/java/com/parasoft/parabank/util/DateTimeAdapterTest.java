/**
 * 
 */
package com.parasoft.parabank.util;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import java.util.Date;
import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for DateTimeAdapter
 *
 * @see com.parasoft.parabank.util.DateTimeAdapter
 * @author devtest
 */
public class DateTimeAdapterTest {

	/**
	 * Parasoft Jtest UTA: Test for dateFromString(String)
	 *
	 * @see com.parasoft.parabank.util.DateTimeAdapter#dateFromString(String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testDateFromString() throws Throwable {
		// When
		String inputDateStr = "inputDateStr"; // UTA: default value
		Date result = DateTimeAdapter.dateFromString(inputDateStr);

	}

	/**
	 * Parasoft Jtest UTA: Test for marshal(Date)
	 *
	 * @see com.parasoft.parabank.util.DateTimeAdapter#marshal(Date)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testMarshal() throws Throwable {
		// Given
		DateTimeAdapter underTest = new DateTimeAdapter();

		// When
		Date inputDate = mock(Date.class);
		String result = underTest.marshal(inputDate);

		// Then - assertions for result of method marshal(Date)
		assertEquals("1970-01-01T00:00:00.000Z", result);

	}

}