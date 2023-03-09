/**
 * 
 */
package com.parasoft.parabank.domain.validator;

import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.springframework.validation.Errors;

/**
 * Parasoft Jtest UTA: Test class for AdminFormValidator
 *
 * @see com.parasoft.parabank.domain.validator.AdminFormValidator
 * @author devtest
 */
public class AdminFormValidatorTest {

	/**
	 * Parasoft Jtest UTA: Test for supports(Class)
	 *
	 * @see com.parasoft.parabank.domain.validator.AdminFormValidator#supports(Class)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSupports() throws Throwable {
		// Given
		AdminFormValidator underTest = new AdminFormValidator();

		// When
		Class aParamClass = Class.forName("java.lang.Object"); // UTA: default value
		boolean result = underTest.supports(aParamClass);

		// Then - assertions for result of method supports(Class)
		assertFalse(result);

	}

	/**
	 * Parasoft Jtest UTA: Test for validate(Object, Errors)
	 *
	 * @see com.parasoft.parabank.domain.validator.AdminFormValidator#validate(Object, Errors)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testValidate() throws Throwable {
		// Given
		AdminFormValidator underTest = new AdminFormValidator();

		// When
		Object adminFormObj = new Object(); // UTA: default value
		Errors errors = mock(Errors.class);
		underTest.validate(adminFormObj, errors);

	}
}