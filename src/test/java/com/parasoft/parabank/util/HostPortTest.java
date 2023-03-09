/**
 * 
 */
package com.parasoft.parabank.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for HostPort
 *
 * @see com.parasoft.parabank.util.HostPort
 * @author devtest
 */
public class HostPortTest {

	/**
	 * Parasoft Jtest UTA: Test for getHost()
	 *
	 * @see com.parasoft.parabank.util.HostPort#getHost()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetHost() throws Throwable {
		// Given
		HostPort underTest = new HostPort();

		// When
		String result = underTest.getHost();

		// Then - assertions for result of method getHost()
		assertNull(result);

		// Then - assertions for this instance of HostPort
		assertEquals(0, underTest.getPort());

	}

	/**
	 * Parasoft Jtest UTA: Test for getPort()
	 *
	 * @see com.parasoft.parabank.util.HostPort#getPort()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetPort() throws Throwable {
		// Given
		HostPort underTest = new HostPort();

		// When
		int result = underTest.getPort();

		// Then - assertions for result of method getPort()
		assertEquals(0, result);

		// Then - assertions for this instance of HostPort
		assertNull(underTest.getHost());

	}

	/**
	 * Parasoft Jtest UTA: Test for isHostSet()
	 *
	 * @see com.parasoft.parabank.util.HostPort#isHostSet()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testIsHostSet() throws Throwable {
		// Given
		String aHost = null; // UTA: provided value
		int aPort = 0; // UTA: default value
		HostPort underTest = new HostPort(aHost, aPort);

		// When
		boolean result = underTest.isHostSet();

		// Then - assertions for result of method isHostSet()
		assertFalse(result);

		// Then - assertions for this instance of HostPort
		assertNull(underTest.getHost());
		assertEquals(0, underTest.getPort());

	}

	/**
	 * Parasoft Jtest UTA: Test for isPortSet()
	 *
	 * @see com.parasoft.parabank.util.HostPort#isPortSet()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testIsPortSet() throws Throwable {
		// Given
		HostPort underTest = new HostPort();

		// When
		boolean result = underTest.isPortSet();

		// Then - assertions for result of method isPortSet()
		assertFalse(result);

		// Then - assertions for this instance of HostPort
		assertNull(underTest.getHost());
		assertEquals(0, underTest.getPort());

	}

	/**
	 * Parasoft Jtest UTA: Test for setHost(String)
	 *
	 * @see com.parasoft.parabank.util.HostPort#setHost(String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetHost() throws Throwable {
		// Given
		HostPort underTest = new HostPort();

		// When
		String aHost = "aHost"; // UTA: default value
		underTest.setHost(aHost);

		// Then - assertions for this instance of HostPort
		assertEquals("aHost", underTest.getHost());
		assertEquals(0, underTest.getPort());

	}

	/**
	 * Parasoft Jtest UTA: Test for setPort(int)
	 *
	 * @see com.parasoft.parabank.util.HostPort#setPort(int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetPort() throws Throwable {
		// Given
		HostPort underTest = new HostPort();

		// When
		int aPort = 0; // UTA: default value
		underTest.setPort(aPort);

		// Then - assertions for this instance of HostPort
		assertNull(underTest.getHost());
		assertEquals(0, underTest.getPort());

	}

	/**
	 * Parasoft Jtest UTA: Test for toString()
	 *
	 * @see com.parasoft.parabank.util.HostPort#toString()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testToString() throws Throwable {
		// Given
		String aHost = null; // UTA: provided value
		int aPort = 0; // UTA: provided value
		HostPort underTest = new HostPort(aHost, aPort);

		// When
		String result = underTest.toString();

		// Then - assertions for result of method toString()
		assertEquals("localhost:8080", result);

		// Then - assertions for this instance of HostPort
		assertNull(underTest.getHost());
		assertEquals(0, underTest.getPort());

	}

}