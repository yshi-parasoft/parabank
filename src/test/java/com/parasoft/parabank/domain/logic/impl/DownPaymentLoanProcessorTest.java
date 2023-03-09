/**
 * 
 */
package com.parasoft.parabank.domain.logic.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.parasoft.parabank.domain.LoanRequest;
import com.parasoft.parabank.domain.LoanResponse;
import com.parasoft.parabank.domain.logic.AdminManager;
import java.math.BigDecimal;
import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for DownPaymentLoanProcessor
 *
 * @see com.parasoft.parabank.domain.logic.impl.DownPaymentLoanProcessor
 * @author devtest
 */
public class DownPaymentLoanProcessorTest {

	/**
	 * Parasoft Jtest UTA: Test for getErrorMessage()
	 *
	 * @see com.parasoft.parabank.domain.logic.impl.DownPaymentLoanProcessor#getErrorMessage()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetErrorMessage() throws Throwable {
		// Given
		DownPaymentLoanProcessor underTest = new DownPaymentLoanProcessor();

		// When
		String result = underTest.getErrorMessage();

		// Then - assertions for result of method getErrorMessage()
		assertEquals("error.insufficient.down.payment", result);

	}

	/**
	 * Parasoft Jtest UTA: Test for getQualifier(LoanRequest)
	 *
	 * @see com.parasoft.parabank.domain.logic.impl.DownPaymentLoanProcessor#getQualifier(LoanRequest)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetQualifier() throws Throwable {
		// Given
		DownPaymentLoanProcessor underTest = new DownPaymentLoanProcessor();

		// When
		LoanRequest loanRequest = mockLoanRequest();
		double result = underTest.getQualifier(loanRequest);

		// Then - assertions for argument 1 of method getQualifier(LoanRequest)
		assertNull(loanRequest.getRequestDate());
		assertEquals(0, loanRequest.getCustomerId());
		assertNull(loanRequest.getAvailableFunds());
		assertNull(loanRequest.getDownPayment());
		assertNull(loanRequest.getLoanAmount());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of LoanRequest
	 */
	private static LoanRequest mockLoanRequest() throws Throwable {
		LoanRequest loanRequest = mock(LoanRequest.class);
		BigDecimal getDownPaymentResult = BigDecimal.ZERO; // UTA: default value
		when(loanRequest.getDownPayment()).thenReturn(getDownPaymentResult);
		return loanRequest;
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
		DownPaymentLoanProcessor underTest = new DownPaymentLoanProcessor();
		AdminManager adminManager = mock(AdminManager.class);
		underTest.setAdminManager(adminManager);

		// When
		LoanRequest loanRequest = mockLoanRequest2();
		underTest.requestLoan(loanRequest);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of LoanRequest
	 */
	private static LoanRequest mockLoanRequest2() throws Throwable {
		LoanRequest loanRequest = mock(LoanRequest.class);
		BigDecimal getDownPaymentResult = BigDecimal.ZERO; // UTA: default value
		when(loanRequest.getDownPayment()).thenReturn(getDownPaymentResult);
		return loanRequest;
	}

}