/**
 * 
 */
package com.parasoft.parabank.domain.validator;

import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.mock;

import com.parasoft.parabank.domain.TransactionCriteria;
import org.junit.Test;
import org.springframework.validation.Errors;

/**
 * Parasoft Jtest UTA: Test class for TransactionCriteriaValidator
 *
 * @see com.parasoft.parabank.domain.validator.TransactionCriteriaValidator
 * @author devtest
 */
public class TransactionCriteriaValidatorTest {

	/**
	 * Parasoft Jtest UTA: Test for supports(Class)
	 *
	 * @see com.parasoft.parabank.domain.validator.TransactionCriteriaValidator#supports(Class)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSupports() throws Throwable {
		// Given
		TransactionCriteriaValidator underTest = new TransactionCriteriaValidator();

		// When
		Class clazz = Class.forName("java.lang.Object"); // UTA: default value
		boolean result = underTest.supports(clazz);

		// Then - assertions for result of method supports(Class)
		assertFalse(result);

	}

	/**
	 * Parasoft Jtest UTA: Test for validate(Object, Errors)
	 *
	 * @see com.parasoft.parabank.domain.validator.TransactionCriteriaValidator#validate(Object, Errors)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testValidate() throws Throwable {
		// Given
		TransactionCriteriaValidator underTest = new TransactionCriteriaValidator();

		// When
		TransactionCriteria obj = mock(TransactionCriteria.class);
		Errors errors = mock(Errors.class);
		underTest.validate(obj, errors);

	}
}