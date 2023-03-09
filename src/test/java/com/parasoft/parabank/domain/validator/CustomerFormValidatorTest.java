/**
 * 
 */
package com.parasoft.parabank.domain.validator;

import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.mock;

import com.parasoft.parabank.domain.Customer;
import com.parasoft.parabank.web.form.CustomerForm;
import org.junit.Test;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * Parasoft Jtest UTA: Test class for CustomerFormValidator
 *
 * @see com.parasoft.parabank.domain.validator.CustomerFormValidator
 * @author devtest
 */
public class CustomerFormValidatorTest {

	/**
	 * Parasoft Jtest UTA: Test for setCustomerValidator(Validator)
	 *
	 * @see com.parasoft.parabank.domain.validator.CustomerFormValidator#setCustomerValidator(Validator)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetCustomerValidator() throws Throwable {
		// Given
		CustomerFormValidator underTest = new CustomerFormValidator();

		// When
		Validator addressValidator = mock(Validator.class);
		underTest.setCustomerValidator(addressValidator);

	}

	/**
	 * Parasoft Jtest UTA: Test for supports(Class)
	 *
	 * @see com.parasoft.parabank.domain.validator.CustomerFormValidator#supports(Class)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSupports() throws Throwable {
		// Given
		CustomerFormValidator underTest = new CustomerFormValidator();

		// When
		Class clazz = Class.forName("java.lang.Object"); // UTA: default value
		boolean result = underTest.supports(clazz);

		// Then - assertions for result of method supports(Class)
		assertFalse(result);

	}

	/**
	 * Parasoft Jtest UTA: Test for validate(Object, Errors)
	 *
	 * @see com.parasoft.parabank.domain.validator.CustomerFormValidator#validate(Object, Errors)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testValidate() throws Throwable {
		// Given
		CustomerFormValidator underTest = new CustomerFormValidator();
		Validator addressValidator = mock(Validator.class);
		underTest.setCustomerValidator(addressValidator);

		// When
		Customer obj = mock(Customer.class);
		Errors errors = mock(Errors.class);
		underTest.validate(obj, errors);

	}

	/**
	 * Parasoft Jtest UTA: Test for validate(Object, Errors)
	 *
	 * @see com.parasoft.parabank.domain.validator.CustomerFormValidator#validate(Object, Errors)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testValidate2() throws Throwable {
		// Given
		CustomerFormValidator underTest = new CustomerFormValidator();
		Validator addressValidator = mock(Validator.class);
		underTest.setCustomerValidator(addressValidator);

		// When
		CustomerForm obj = mock(CustomerForm.class);
		Errors errors = mock(Errors.class);
		underTest.validate(obj, errors);

	}
}