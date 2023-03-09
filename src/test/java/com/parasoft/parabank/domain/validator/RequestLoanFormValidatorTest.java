/**
 * 
 */
package com.parasoft.parabank.domain.validator;

import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.springframework.validation.Errors;

/**
 * Parasoft Jtest UTA: Test class for RequestLoanFormValidator
 *
 * @see com.parasoft.parabank.domain.validator.RequestLoanFormValidator
 * @author devtest
 */
public class RequestLoanFormValidatorTest {

	/**
	 * Parasoft Jtest UTA: Test for supports(Class)
	 *
	 * @see com.parasoft.parabank.domain.validator.RequestLoanFormValidator#supports(Class)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSupports() throws Throwable {
		// Given
		RequestLoanFormValidator underTest = new RequestLoanFormValidator();

		// When
		Class clazz = Class.forName("java.lang.Object"); // UTA: default value
		boolean result = underTest.supports(clazz);

		// Then - assertions for result of method supports(Class)
		assertFalse(result);

	}

	/**
	 * Parasoft Jtest UTA: Test for validate(Object, Errors)
	 *
	 * @see com.parasoft.parabank.domain.validator.RequestLoanFormValidator#validate(Object, Errors)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testValidate() throws Throwable {
		// Given
		RequestLoanFormValidator underTest = new RequestLoanFormValidator();

		// When
		Object obj = new Object(); // UTA: default value
		Errors errors = mock(Errors.class);
		underTest.validate(obj, errors);

	}
}