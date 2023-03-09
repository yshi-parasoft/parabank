/**
 * 
 */
package com.parasoft.parabank.web;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

/**
 * Parasoft Jtest UTA: Test class for ViewUtil
 *
 * @see com.parasoft.parabank.web.ViewUtil
 * @author devtest
 */
public class ViewUtilTest {

	/**
	 * Parasoft Jtest UTA: Test for createErrorView(String)
	 *
	 * @see com.parasoft.parabank.web.ViewUtil#createErrorView(String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testCreateErrorView() throws Throwable {
		// When
		String errorMessage = "errorMessage"; // UTA: default value
		ModelAndView result = ViewUtil.createErrorView(errorMessage);

		// Then - assertions for result of method createErrorView(String)
		assertNotNull(result);

	}

}