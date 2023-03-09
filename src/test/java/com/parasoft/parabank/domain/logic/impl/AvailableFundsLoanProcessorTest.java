/**
 * 
 */
package com.parasoft.parabank.domain.logic.impl;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.parasoft.parabank.domain.LoanRequest;
import com.parasoft.parabank.domain.LoanResponse;
import com.parasoft.parabank.domain.logic.AdminManager;
import java.math.BigDecimal;
import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for AvailableFundsLoanProcessor
 *
 * @see com.parasoft.parabank.domain.logic.impl.AvailableFundsLoanProcessor
 * @author devtest
 */
public class AvailableFundsLoanProcessorTest {

	/**
	 * Parasoft Jtest UTA: Test for getErrorMessage()
	 *
	 * @see com.parasoft.parabank.domain.logic.impl.AvailableFundsLoanProcessor#getErrorMessage()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetErrorMessage() throws Throwable {
		// Given
		AvailableFundsLoanProcessor underTest = new AvailableFundsLoanProcessor();

		// When
		String result = underTest.getErrorMessage();

		// Then - assertions for result of method getErrorMessage()
		assertEquals("error.insufficient.funds", result);

	}

	/**
	 * Parasoft Jtest UTA: Test for requestLoan(LoanRequest)
	 *
	 * @see com.parasoft.parabank.domain.logic.impl.AbstractLoanProcessor#requestLoan(LoanRequest)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = NumberFormatException.class)
	public void testRequestLoan() throws Throwable {
		// Given
		AvailableFundsLoanProcessor underTest = new AvailableFundsLoanProcessor();
		AdminManager adminManager = mock(AdminManager.class);
		underTest.setAdminManager(adminManager);

		// When
		LoanRequest loanRequest = mockLoanRequest();
		underTest.requestLoan(loanRequest);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of LoanRequest
	 */
	private static LoanRequest mockLoanRequest() throws Throwable {
		LoanRequest loanRequest = mock(LoanRequest.class);
		BigDecimal getAvailableFundsResult = BigDecimal.ZERO; // UTA: default value
		when(loanRequest.getAvailableFunds()).thenReturn(getAvailableFundsResult);

		BigDecimal getDownPaymentResult = BigDecimal.ZERO; // UTA: default value
		when(loanRequest.getDownPayment()).thenReturn(getDownPaymentResult);
		return loanRequest;
	}

}