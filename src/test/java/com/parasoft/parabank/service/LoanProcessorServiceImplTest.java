/**
 * 
 */
package com.parasoft.parabank.service;

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
 * Parasoft Jtest UTA: Test class for LoanProcessorServiceImpl
 *
 * @see com.parasoft.parabank.service.LoanProcessorServiceImpl
 * @author devtest
 */
public class LoanProcessorServiceImplTest {

	/**
	 * Parasoft Jtest UTA: Test for getLoanProcessor()
	 *
	 * @see com.parasoft.parabank.service.LoanProcessorServiceImpl#getLoanProcessor()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetLoanProcessor() throws Throwable {
		// Given
		LoanProcessorServiceImpl underTest = new LoanProcessorServiceImpl();

		// When
		LoanProvider result = underTest.getLoanProcessor();

		// Then - assertions for result of method getLoanProcessor()
		assertNull(result);

		// Then - assertions for this instance of LoanProcessorServiceImpl
		assertNull(underTest.getLoanProviderName());

	}

	/**
	 * Parasoft Jtest UTA: Test for getLoanProviderName()
	 *
	 * @see com.parasoft.parabank.service.LoanProcessorServiceImpl#getLoanProviderName()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetLoanProviderName() throws Throwable {
		// Given
		LoanProcessorServiceImpl underTest = new LoanProcessorServiceImpl();

		// When
		String result = underTest.getLoanProviderName();

		// Then - assertions for result of method getLoanProviderName()
		assertNull(result);

		// Then - assertions for this instance of LoanProcessorServiceImpl
		assertNull(underTest.getLoanProcessor());

	}

	/**
	 * Parasoft Jtest UTA: Test for requestLoan(LoanRequest)
	 *
	 * @see com.parasoft.parabank.service.LoanProcessorServiceImpl#requestLoan(LoanRequest)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testRequestLoan() throws Throwable {
		// Given
		LoanProcessorServiceImpl underTest = new LoanProcessorServiceImpl();
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

		// Then - assertions for this instance of LoanProcessorServiceImpl
		assertNotNull(underTest.getLoanProcessor());
		assertEquals("loanProviderName", underTest.getLoanProviderName());

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