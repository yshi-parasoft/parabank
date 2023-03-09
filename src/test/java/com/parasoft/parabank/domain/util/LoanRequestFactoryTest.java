/**
 * 
 */
package com.parasoft.parabank.domain.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import com.parasoft.parabank.domain.LoanRequest;
import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for LoanRequestFactory
 *
 * @see com.parasoft.parabank.domain.util.LoanRequestFactory
 * @author devtest
 */
public class LoanRequestFactoryTest {

	/**
	 * Parasoft Jtest UTA: Test for create(double, double, double)
	 *
	 * @see com.parasoft.parabank.domain.util.LoanRequestFactory#create(double, double, double)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testCreate() throws Throwable {
		// When
		double availableFunds = 0.0d; // UTA: default value
		double downPayment = 0.0d; // UTA: default value
		double loanAmount = 0.0d; // UTA: default value
		LoanRequest result = LoanRequestFactory.create(availableFunds, downPayment, loanAmount);

		// Then - assertions for result of method create(double, double, double)
		assertNotNull(result);
		assertNull(result.getRequestDate());
		assertEquals(0, result.getCustomerId());
		assertNotNull(result.getAvailableFunds());
		assertEquals(0d, result.getAvailableFunds().doubleValue(), 0.0);
		assertNotNull(result.getDownPayment());
		assertEquals(0d, result.getDownPayment().doubleValue(), 0.0);
		assertNotNull(result.getLoanAmount());
		assertEquals(0d, result.getLoanAmount().doubleValue(), 0.0);

	}
}