/**
 * 
 */
package com.parasoft.parabank.domain.validator;

import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.mock;

import com.parasoft.parabank.domain.Payee;
import org.junit.Test;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * Parasoft Jtest UTA: Test class for PayeeValidator
 *
 * @see com.parasoft.parabank.domain.validator.PayeeValidator
 * @author devtest
 */
public class PayeeValidatorTest {

	/**
	 * Parasoft Jtest UTA: Test for setAddressValidator(Validator)
	 *
	 * @see com.parasoft.parabank.domain.validator.PayeeValidator#setAddressValidator(Validator)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetAddressValidator() throws Throwable {
		// Given
		PayeeValidator underTest = new PayeeValidator();

		// When
		Validator addressValidator = mock(Validator.class);
		underTest.setAddressValidator(addressValidator);

	}

	/**
	 * Parasoft Jtest UTA: Test for supports(Class)
	 *
	 * @see com.parasoft.parabank.domain.validator.PayeeValidator#supports(Class)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSupports() throws Throwable {
		// Given
		PayeeValidator underTest = new PayeeValidator();

		// When
		Class clazz = Class.forName("java.lang.Object"); // UTA: default value
		boolean result = underTest.supports(clazz);

		// Then - assertions for result of method supports(Class)
		assertFalse(result);

	}

	/**
	 * Parasoft Jtest UTA: Test for validate(Object, Errors)
	 *
	 * @see com.parasoft.parabank.domain.validator.PayeeValidator#validate(Object, Errors)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testValidate() throws Throwable {
		// Given
		PayeeValidator underTest = new PayeeValidator();
		Validator addressValidator = mock(Validator.class);
		underTest.setAddressValidator(addressValidator);

		// When
		Payee obj = mock(Payee.class);
		Errors errors = mock(Errors.class);
		underTest.validate(obj, errors);

	}
}