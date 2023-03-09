/**
 * 
 */
package com.parasoft.parabank.messaging;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.ArgumentMatchers.nullable;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.parasoft.parabank.domain.LoanRequest;
import com.parasoft.parabank.domain.LoanResponse;
import com.parasoft.parabank.domain.logic.LoanProvider;
import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for LocalLoanProvider
 *
 * @see com.parasoft.parabank.messaging.LocalLoanProvider
 * @author devtest
 */
public class LocalLoanProviderTest {

	/**
	 * Parasoft Jtest UTA: Test for requestLoan(LoanRequest)
	 *
	 * @see com.parasoft.parabank.messaging.LocalLoanProvider#requestLoan(LoanRequest)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testRequestLoan() throws Throwable {
		// Given
		LocalLoanProvider underTest = new LocalLoanProvider();
		LoanProvider loanProcessor = mockLoanProvider();
		underTest.setLoanProcessor(loanProcessor);
		String loanProviderName = "loanProviderName"; // UTA: default value
		underTest.setLoanProviderName(loanProviderName);

		// When
		LoanRequest loanRequest = mock(LoanRequest.class);
		LoanResponse result = underTest.requestLoan(loanRequest);

		// Then - assertions for argument 1 of method requestLoan(LoanRequest)
		assertNull(loanRequest.getRequestDate());
		assertEquals(0, loanRequest.getCustomerId());
		assertNull(loanRequest.getAvailableFunds());
		assertNull(loanRequest.getDownPayment());
		assertNull(loanRequest.getLoanAmount());

		// Then - assertions for result of method requestLoan(LoanRequest)
		assertNotNull(result);
		assertNull(result.getResponseDate());
		assertNull(result.getLoanProviderName());
		assertFalse(result.isApproved());
		assertNull(result.getMessage());
		assertNull(result.getAccountId());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of LoanProvider
	 */
	private static LoanProvider mockLoanProvider() throws Throwable {
		LoanProvider loanProcessor = mock(LoanProvider.class);
		LoanResponse requestLoanResult = mock(LoanResponse.class);
		when(loanProcessor.requestLoan(nullable(LoanRequest.class))).thenReturn(requestLoanResult);
		return loanProcessor;
	}

}