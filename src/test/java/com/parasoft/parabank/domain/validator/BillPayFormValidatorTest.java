/**
 * 
 */
package com.parasoft.parabank.domain.validator;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;

import com.parasoft.parabank.web.form.BillPayForm;
import org.junit.Test;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * Parasoft Jtest UTA: Test class for BillPayFormValidator
 *
 * @see com.parasoft.parabank.domain.validator.BillPayFormValidator
 * @author devtest
 */
public class BillPayFormValidatorTest {

	/**
	 * Parasoft Jtest UTA: Test for getPayeeValidator()
	 *
	 * @see com.parasoft.parabank.domain.validator.BillPayFormValidator#getPayeeValidator()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetPayeeValidator() throws Throwable {
		// Given
		BillPayFormValidator underTest = new BillPayFormValidator();

		// When
		Validator result = underTest.getPayeeValidator();

		// Then - assertions for result of method getPayeeValidator()
		assertNull(result);

	}

	/**
	 * Parasoft Jtest UTA: Test for setPayeeValidator(Validator)
	 *
	 * @see com.parasoft.parabank.domain.validator.BillPayFormValidator#setPayeeValidator(Validator)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetPayeeValidator() throws Throwable {
		// Given
		BillPayFormValidator underTest = new BillPayFormValidator();

		// When
		Validator aPayeeValidator = mock(Validator.class);
		underTest.setPayeeValidator(aPayeeValidator);

		// Then - assertions for this instance of BillPayFormValidator
		assertNotNull(underTest.getPayeeValidator());

	}

	/**
	 * Parasoft Jtest UTA: Test for supports(Class)
	 *
	 * @see com.parasoft.parabank.domain.validator.BillPayFormValidator#supports(Class)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSupports() throws Throwable {
		// Given
		BillPayFormValidator underTest = new BillPayFormValidator();

		// When
		Class clazz = Class.forName("java.lang.Object"); // UTA: default value
		boolean result = underTest.supports(clazz);

		// Then - assertions for result of method supports(Class)
		assertFalse(result);

		// Then - assertions for this instance of BillPayFormValidator
		assertNull(underTest.getPayeeValidator());

	}

	/**
	 * Parasoft Jtest UTA: Test for validate(Object, Errors)
	 *
	 * @see com.parasoft.parabank.domain.validator.BillPayFormValidator#validate(Object, Errors)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testValidate() throws Throwable {
		// Given
		BillPayFormValidator underTest = new BillPayFormValidator();
		Validator aPayeeValidator = mock(Validator.class);
		underTest.setPayeeValidator(aPayeeValidator);

		// When
		BillPayForm obj = mock(BillPayForm.class);
		Errors errors = mock(Errors.class);
		underTest.validate(obj, errors);

		// Then - assertions for this instance of BillPayFormValidator
		assertNotNull(underTest.getPayeeValidator());

	}
}