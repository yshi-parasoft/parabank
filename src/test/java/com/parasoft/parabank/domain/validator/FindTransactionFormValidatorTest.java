/**
 * 
 */
package com.parasoft.parabank.domain.validator;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;

import com.parasoft.parabank.web.form.FindTransactionForm;
import org.junit.Test;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * Parasoft Jtest UTA: Test class for FindTransactionFormValidator
 *
 * @see com.parasoft.parabank.domain.validator.FindTransactionFormValidator
 * @author devtest
 */
public class FindTransactionFormValidatorTest {

	/**
	 * Parasoft Jtest UTA: Test for getTransactionCriteriaValidator()
	 *
	 * @see com.parasoft.parabank.domain.validator.FindTransactionFormValidator#getTransactionCriteriaValidator()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetTransactionCriteriaValidator() throws Throwable {
		// Given
		FindTransactionFormValidator underTest = new FindTransactionFormValidator();

		// When
		Validator result = underTest.getTransactionCriteriaValidator();

		// Then - assertions for result of method getTransactionCriteriaValidator()
		assertNull(result);

	}

	/**
	 * Parasoft Jtest UTA: Test for setTransactionCriteriaValidator(Validator)
	 *
	 * @see com.parasoft.parabank.domain.validator.FindTransactionFormValidator#setTransactionCriteriaValidator(Validator)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetTransactionCriteriaValidator() throws Throwable {
		// Given
		FindTransactionFormValidator underTest = new FindTransactionFormValidator();

		// When
		Validator aTransactionCriteriaValidator = mock(Validator.class);
		underTest.setTransactionCriteriaValidator(aTransactionCriteriaValidator);

		// Then - assertions for this instance of FindTransactionFormValidator
		assertNotNull(underTest.getTransactionCriteriaValidator());

	}

	/**
	 * Parasoft Jtest UTA: Test for supports(Class)
	 *
	 * @see com.parasoft.parabank.domain.validator.FindTransactionFormValidator#supports(Class)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSupports() throws Throwable {
		// Given
		FindTransactionFormValidator underTest = new FindTransactionFormValidator();

		// When
		Class clazz = Class.forName("java.lang.Object"); // UTA: default value
		boolean result = underTest.supports(clazz);

		// Then - assertions for result of method supports(Class)
		assertFalse(result);

		// Then - assertions for this instance of FindTransactionFormValidator
		assertNull(underTest.getTransactionCriteriaValidator());

	}

	/**
	 * Parasoft Jtest UTA: Test for validate(Object, Errors)
	 *
	 * @see com.parasoft.parabank.domain.validator.FindTransactionFormValidator#validate(Object, Errors)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testValidate() throws Throwable {
		// Given
		FindTransactionFormValidator underTest = new FindTransactionFormValidator();
		Validator aTransactionCriteriaValidator = mock(Validator.class);
		underTest.setTransactionCriteriaValidator(aTransactionCriteriaValidator);

		// When
		FindTransactionForm obj = mock(FindTransactionForm.class);
		Errors errors = mock(Errors.class);
		underTest.validate(obj, errors);

		// Then - assertions for this instance of FindTransactionFormValidator
		assertNotNull(underTest.getTransactionCriteriaValidator());

	}
}