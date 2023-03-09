/**
 * 
 */
package com.parasoft.parabank.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.nullable;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.parasoft.parabank.web.UserSession;
import java.io.File;
import javax.servlet.http.HttpSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.Resource;

/**
 * Parasoft Jtest UTA: Test class for Util
 *
 * @see com.parasoft.parabank.util.Util
 * @author devtest
 */
public class UtilTest {

	/**
	 * Parasoft Jtest UTA: Test for equals(Object, Object)
	 *
	 * @see com.parasoft.parabank.util.Util#equals(Object, Object)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testEquals() throws Throwable {
		// When
		Object o1 = null; // UTA: provided value
		Object o2 = new Object(); // UTA: default value
		boolean result = Util.equals(o1, o2);

		// Then - assertions for result of method equals(Object, Object)
		assertFalse(result);

	}

	/**
	 * Parasoft Jtest UTA: Test for equals(Object, Object)
	 *
	 * @see com.parasoft.parabank.util.Util#equals(Object, Object)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testEquals2() throws Throwable {
		// When
		Object o1 = new Object(); // UTA: default value
		Object o2 = new Object(); // UTA: default value
		boolean result = Util.equals(o1, o2);

		// Then - assertions for result of method equals(Object, Object)
		assertFalse(result);

	}

	/**
	 * Parasoft Jtest UTA: Test for getCurrentPath(ApplicationContext)
	 *
	 * @see com.parasoft.parabank.util.Util#getCurrentPath(ApplicationContext)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetCurrentPath() throws Throwable {
		// When
		ApplicationContext context = mockApplicationContext();
		String result = Util.getCurrentPath(context);

		// Then - assertions for result of method getCurrentPath(ApplicationContext)

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of Resource
	 */
	private static Resource mockResource() throws Throwable {
		Resource getResourceResult = mock(Resource.class);
		File getFileResult = File.createTempFile("getFileResult", null); // UTA: default value
		getFileResult.deleteOnExit();
		when(getResourceResult.getFile()).thenReturn(getFileResult);
		return getResourceResult;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of ApplicationContext
	 */
	private static ApplicationContext mockApplicationContext() throws Throwable {
		ApplicationContext context = mock(ApplicationContext.class);
		Resource getResourceResult = mockResource();
		when(context.getResource(nullable(String.class))).thenReturn(getResourceResult);
		return context;
	}

	/**
	 * Parasoft Jtest UTA: Test for getHostPort()
	 *
	 * @see com.parasoft.parabank.util.Util#getHostPort()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetHostPort() throws Throwable {
		// When
		HostPort result = Util.getHostPort();

		// Then - assertions for result of method getHostPort()
		assertNotNull(result);
		assertEquals(-1, result.getPort());

	}

	/**
	 * Parasoft Jtest UTA: Test for getHostPortString()
	 *
	 * @see com.parasoft.parabank.util.Util#getHostPortString()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetHostPortString() throws Throwable {
		// When
		String result = Util.getHostPortString();

		// Then - assertions for result of method getHostPortString()
		assertEquals("IRON:8080", result);

	}

	/**
	 * Parasoft Jtest UTA: Test for isEmpty(Object)
	 *
	 * @see com.parasoft.parabank.util.Util#isEmpty(Object)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testIsEmpty() throws Throwable {
		// When
		Object aAttribute = null; // UTA: provided value
		boolean result = Util.isEmpty(aAttribute);

		// Then - assertions for result of method isEmpty(Object)
		assertTrue(result);

	}

	/**
	 * Parasoft Jtest UTA: Test for isEmpty(Object)
	 *
	 * @see com.parasoft.parabank.util.Util#isEmpty(Object)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testIsEmpty2() throws Throwable {
		// When
		Object aAttribute = new Object(); // UTA: default value
		boolean result = Util.isEmpty(aAttribute);

		// Then - assertions for result of method isEmpty(Object)
		assertFalse(result);

	}

	/**
	 * Parasoft Jtest UTA: Test for isEmpty(Object)
	 *
	 * @see com.parasoft.parabank.util.Util#isEmpty(Object)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testIsEmpty3() throws Throwable {
		// When
		String aAttribute = "aAttribute"; // UTA: default value
		boolean result = Util.isEmpty(aAttribute);

		// Then - assertions for result of method isEmpty(String)
		assertFalse(result);

	}

	/**
	 * Parasoft Jtest UTA: Test for isLoggedIn(HttpSession, String, String)
	 *
	 * @see com.parasoft.parabank.util.Util#isLoggedIn(HttpSession, String, String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testIsLoggedIn() throws Throwable {
		// When
		HttpSession session = mockHttpSession();
		String username = "username"; // UTA: default value
		String password = "password"; // UTA: default value
		boolean result = Util.isLoggedIn(session, username, password);

		// Then - assertions for result of method isLoggedIn(HttpSession, String, String)
		assertFalse(result);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of HttpSession
	 */
	private static HttpSession mockHttpSession() throws Throwable {
		HttpSession session = mock(HttpSession.class);
		UserSession getAttributeResult = mock(UserSession.class);
		when(session.getAttribute(nullable(String.class))).thenReturn(getAttributeResult);
		return session;
	}

	/**
	 * Parasoft Jtest UTA: Test for prepareFolder(String)
	 *
	 * @see com.parasoft.parabank.util.Util#prepareFolder(String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testPrepareFolder() throws Throwable {
		// When
		String outputFileFolder = "outputFileFolder"; // UTA: default value
		Util.prepareFolder(outputFileFolder);

	}
}