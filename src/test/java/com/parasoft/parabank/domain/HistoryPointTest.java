/**
 * 
 */
package com.parasoft.parabank.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.math.BigDecimal;
import java.util.Date;
import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for HistoryPoint
 *
 * @see com.parasoft.parabank.domain.HistoryPoint
 * @author devtest
 */
public class HistoryPointTest {

	/**
	 * Parasoft Jtest UTA: Test for equals(Object)
	 *
	 * @see com.parasoft.parabank.domain.HistoryPoint#equals(Object)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testEquals() throws Throwable {
		// Given
		HistoryPoint underTest = new HistoryPoint();

		// When
		Object obj = null; // UTA: provided value
		boolean result = underTest.equals(obj);

		// Then - assertions for result of method equals(Object)
		assertFalse(result);

		// Then - assertions for this instance of HistoryPoint
		assertNull(underTest.getSymbol());
		assertNull(underTest.getDate());
		assertNull(underTest.getClosingPrice());

	}

	/**
	 * Parasoft Jtest UTA: Test for equals(Object)
	 *
	 * @see com.parasoft.parabank.domain.HistoryPoint#equals(Object)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testEquals2() throws Throwable {
		// Given
		HistoryPoint underTest = new HistoryPoint();

		// When
		HistoryPoint obj = mock(HistoryPoint.class);
		boolean result = underTest.equals(obj);

		// Then - assertions for result of method equals(Object)
		assertTrue(result);

		// Then - assertions for this instance of HistoryPoint
		assertNull(underTest.getSymbol());
		assertNull(underTest.getDate());
		assertNull(underTest.getClosingPrice());

	}

	/**
	 * Parasoft Jtest UTA: Test for getClosingPrice()
	 *
	 * @see com.parasoft.parabank.domain.HistoryPoint#getClosingPrice()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetClosingPrice() throws Throwable {
		// Given
		HistoryPoint underTest = new HistoryPoint();

		// When
		BigDecimal result = underTest.getClosingPrice();

		// Then - assertions for result of method getClosingPrice()
		assertNull(result);

		// Then - assertions for this instance of HistoryPoint
		assertNull(underTest.getSymbol());
		assertNull(underTest.getDate());

	}

	/**
	 * Parasoft Jtest UTA: Test for getDate()
	 *
	 * @see com.parasoft.parabank.domain.HistoryPoint#getDate()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetDate() throws Throwable {
		// Given
		HistoryPoint underTest = new HistoryPoint();

		// When
		Date result = underTest.getDate();

		// Then - assertions for result of method getDate()
		assertNull(result);

		// Then - assertions for this instance of HistoryPoint
		assertNull(underTest.getSymbol());
		assertNull(underTest.getClosingPrice());

	}

	/**
	 * Parasoft Jtest UTA: Test for getSymbol()
	 *
	 * @see com.parasoft.parabank.domain.HistoryPoint#getSymbol()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetSymbol() throws Throwable {
		// Given
		HistoryPoint underTest = new HistoryPoint();

		// When
		String result = underTest.getSymbol();

		// Then - assertions for result of method getSymbol()
		assertNull(result);

		// Then - assertions for this instance of HistoryPoint
		assertNull(underTest.getDate());
		assertNull(underTest.getClosingPrice());

	}

	/**
	 * Parasoft Jtest UTA: Test for hashCode()
	 *
	 * @see com.parasoft.parabank.domain.HistoryPoint#hashCode()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testHashCode() throws Throwable {
		// Given
		HistoryPoint underTest = new HistoryPoint();
		BigDecimal closingPrice = BigDecimal.ZERO; // UTA: default value
		underTest.setClosingPrice(closingPrice);
		Date date = mock(Date.class);
		underTest.setDate(date);
		String symbol = "symbol"; // UTA: default value
		underTest.setSymbol(symbol);

		// When
		int result = underTest.hashCode();

		// Then - assertions for result of method hashCode()
		// assertEquals(0, result);// UTA: Expected value may be unstable

		// Then - assertions for this instance of HistoryPoint
		assertEquals("symbol", underTest.getSymbol());
		assertNotNull(underTest.getDate());
		assertNotNull(underTest.getClosingPrice());
		assertEquals(0d, underTest.getClosingPrice().doubleValue(), 0.0);

	}

	/**
	 * Parasoft Jtest UTA: Test for toString()
	 *
	 * @see com.parasoft.parabank.domain.HistoryPoint#toString()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testToString() throws Throwable {
		// Given
		HistoryPoint underTest = new HistoryPoint();
		BigDecimal closingPrice = BigDecimal.ZERO; // UTA: default value
		underTest.setClosingPrice(closingPrice);
		Date date = mock(Date.class);
		underTest.setDate(date);
		String symbol = "symbol"; // UTA: default value
		underTest.setSymbol(symbol);

		// When
		String result = underTest.toString();

		// Then - assertions for result of method toString()

		// Then - assertions for this instance of HistoryPoint
		assertEquals("symbol", underTest.getSymbol());
		assertNotNull(underTest.getDate());
		assertNotNull(underTest.getClosingPrice());
		assertEquals(0d, underTest.getClosingPrice().doubleValue(), 0.0);

	}
}