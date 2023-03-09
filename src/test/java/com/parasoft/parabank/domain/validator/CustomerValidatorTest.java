/**
 * 
 */
package com.parasoft.parabank.domain.validator;

import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.mock;

import com.parasoft.parabank.domain.Customer;
import org.junit.Test;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * Parasoft Jtest UTA: Test class for CustomerValidator
 *
 * @see com.parasoft.parabank.domain.validator.CustomerValidator
 * @author devtest
 */
public class CustomerValidatorTest {

	/**
	 * Parasoft Jtest UTA: Test for setAddressValidator(Validator)
	 *
	 * @see com.parasoft.parabank.domain.validator.CustomerValidator#setAddressValidator(Validator)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetAddressValidator() throws Throwable {
		// Given
		CustomerValidator underTest = new CustomerValidator();

		// When
		Validator addressValidator = mock(Validator.class);
		underTest.setAddressValidator(addressValidator);

	}

	/**
	 * Parasoft Jtest UTA: Test for supports(Class)
	 *
	 * @see com.parasoft.parabank.domain.validator.CustomerValidator#supports(Class)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSupports() throws Throwable {
		// Given
		CustomerValidator underTest = new CustomerValidator();

		// When
		Class clazz = Class.forName("java.lang.Object"); // UTA: default value
		boolean result = underTest.supports(clazz);

		// Then - assertions for result of method supports(Class)
		assertFalse(result);

	}

	/**
	 * Parasoft Jtest UTA: Test for validate(Object, Errors)
	 *
	 * @see com.parasoft.parabank.domain.validator.CustomerValidator#validate(Object, Errors)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testValidate() throws Throwable {
		// Given
		CustomerValidator underTest = new CustomerValidator();
		Validator addressValidator = mock(Validator.class);
		underTest.setAddressValidator(addressValidator);

		// When
		Customer obj = mock(Customer.class);
		Errors errors = mock(Errors.class);
		underTest.validate(obj, errors);

	}
}