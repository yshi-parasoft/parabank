/**
 * 
 */
package com.parasoft.parabank.web;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.util.Locale;
import org.junit.Test;
import org.springframework.web.servlet.View;

/**
 * Parasoft Jtest UTA: Test class for TemplateViewResolver
 *
 * @see com.parasoft.parabank.web.TemplateViewResolver
 * @author devtest
 */
public class TemplateViewResolverTest {

	/**
	 * Parasoft Jtest UTA: Test for isCache()
	 *
	 * @see com.parasoft.parabank.web.TemplateViewResolver#isCache()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testIsCache() throws Throwable {
		// Given
		TemplateViewResolver underTest = new TemplateViewResolver();

		// When
		boolean result = underTest.isCache();

		// Then - assertions for result of method isCache()
		assertFalse(result);

		// Then - assertions for this instance of TemplateViewResolver
		assertEquals(1024, underTest.getCacheLimit());
		assertNotNull(underTest.getCacheFilter());
		assertNull(underTest.getRedirectHosts());
		assertNotNull(underTest.getAttributesMap());
		assertEquals(0, underTest.getAttributesMap().size());
		assertEquals(2147483647, underTest.getOrder());

	}

	/**
	 * Parasoft Jtest UTA: Test for resolveViewName(String, Locale)
	 *
	 * @see com.parasoft.parabank.web.TemplateViewResolver#resolveViewName(String, Locale)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testResolveViewName() throws Throwable {
		// Given
		TemplateViewResolver underTest = new TemplateViewResolver();

		// When
		String viewName = "viewName"; // UTA: default value
		Locale locale = mock(Locale.class);
		View result = underTest.resolveViewName(viewName, locale);

		// Then - assertions for this instance of TemplateViewResolver
		assertEquals(1024, underTest.getCacheLimit());
		assertTrue(underTest.isCacheUnresolved());
		assertNotNull(underTest.getCacheFilter());
		assertNull(underTest.getRedirectHosts());
		assertNotNull(underTest.getAttributesMap());
		assertEquals(1, underTest.getAttributesMap().size());
		assertEquals(2147483647, underTest.getOrder());

	}
}