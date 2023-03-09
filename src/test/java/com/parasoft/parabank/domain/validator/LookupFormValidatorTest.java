/**
 * 
 */
package com.parasoft.parabank.domain.validator;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;

import com.parasoft.parabank.domain.Customer;
import com.parasoft.parabank.web.form.LookupForm;
import org.junit.Test;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * Parasoft Jtest UTA: Test class for LookupFormValidator
 *
 * @see com.parasoft.parabank.domain.validator.LookupFormValidator
 * @author devtest
 */
public class LookupFormValidatorTest {

	/**
	 * Parasoft Jtest UTA: Test for getCustomerValidator()
	 *
	 * @see com.parasoft.parabank.domain.validator.LookupFormValidator#getCustomerValidator()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetCustomerValidator() throws Throwable {
		// Given
		LookupFormValidator underTest = new LookupFormValidator();

		// When
		Validator result = underTest.getCustomerValidator();

		// Then - assertions for result of method getCustomerValidator()
		assertNull(result);

	}

	/**
	 * Parasoft Jtest UTA: Test for setAddressValidator(Validator)
	 *
	 * @see com.parasoft.parabank.domain.validator.LookupFormValidator#setAddressValidator(Validator)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetAddressValidator() throws Throwable {
		// Given
		LookupFormValidator underTest = new LookupFormValidator();

		// When
		Validator addressValidator = mock(Validator.class);
		underTest.setAddressValidator(addressValidator);

		// Then - assertions for this instance of LookupFormValidator
		assertNull(underTest.getCustomerValidator());

	}

	/**
	 * Parasoft Jtest UTA: Test for setCustomerValidator(Validator)
	 *
	 * @see com.parasoft.parabank.domain.validator.LookupFormValidator#setCustomerValidator(Validator)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetCustomerValidator() throws Throwable {
		// Given
		LookupFormValidator underTest = new LookupFormValidator();

		// When
		Validator aCustomerValidator = mock(Validator.class);
		underTest.setCustomerValidator(aCustomerValidator);

		// Then - assertions for this instance of LookupFormValidator
		assertNotNull(underTest.getCustomerValidator());

	}

	/**
	 * Parasoft Jtest UTA: Test for supports(Class)
	 *
	 * @see com.parasoft.parabank.domain.validator.LookupFormValidator#supports(Class)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSupports() throws Throwable {
		// Given
		LookupFormValidator underTest = new LookupFormValidator();

		// When
		Class clazz = Class.forName("java.lang.Object"); // UTA: default value
		boolean result = underTest.supports(clazz);

		// Then - assertions for result of method supports(Class)
		assertFalse(result);

		// Then - assertions for this instance of LookupFormValidator
		assertNull(underTest.getCustomerValidator());

	}

	/**
	 * Parasoft Jtest UTA: Test for validate(Object, Errors)
	 *
	 * @see com.parasoft.parabank.domain.validator.LookupFormValidator#validate(Object, Errors)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testValidate() throws Throwable {
		// Given
		LookupFormValidator underTest = new LookupFormValidator();
		Validator aCustomerValidator = mock(Validator.class);
		underTest.setCustomerValidator(aCustomerValidator);

		// When
		Customer obj = mock(Customer.class);
		Errors errors = mock(Errors.class);
		underTest.validate(obj, errors);

		// Then - assertions for this instance of LookupFormValidator
		assertNotNull(underTest.getCustomerValidator());

	}

	/**
	 * Parasoft Jtest UTA: Test for validate(Object, Errors)
	 *
	 * @see com.parasoft.parabank.domain.validator.LookupFormValidator#validate(Object, Errors)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testValidate2() throws Throwable {
		// Given
		LookupFormValidator underTest = new LookupFormValidator();
		Validator addressValidator = mock(Validator.class);
		underTest.setAddressValidator(addressValidator);

		// When
		LookupForm obj = mock(LookupForm.class);
		Errors errors = mock(Errors.class);
		underTest.validate(obj, errors);

		// Then - assertions for this instance of LookupFormValidator
		assertNull(underTest.getCustomerValidator());

	}
}