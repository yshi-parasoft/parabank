/**
 * 
 */
package com.parasoft.parabank.messaging;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.ArgumentMatchers.nullable;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.parasoft.parabank.domain.LoanRequest;
import com.parasoft.parabank.domain.LoanResponse;
import com.parasoft.parabank.domain.logic.AdminManager;
import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for WebServiceLoanProvider
 *
 * @see com.parasoft.parabank.messaging.WebServiceLoanProvider
 * @author devtest
 */
public class WebServiceLoanProviderTest {

	/**
	 * Parasoft Jtest UTA: Test for requestLoan(LoanRequest)
	 *
	 * @see com.parasoft.parabank.messaging.WebServiceLoanProvider#requestLoan(LoanRequest)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testRequestLoan() throws Throwable {
		// Given
		WebServiceLoanProvider underTest = new WebServiceLoanProvider();
		AdminManager adminManager = mock(AdminManager.class);
		underTest.setAdminManager(adminManager);

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
		assertNull(result);

	}

	/**
	 * Parasoft Jtest UTA: Test for requestLoan(LoanRequest)
	 *
	 * @see com.parasoft.parabank.messaging.WebServiceLoanProvider#requestLoan(LoanRequest)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testRequestLoan2() throws Throwable {
		// Given
		WebServiceLoanProvider underTest = new WebServiceLoanProvider();
		AdminManager adminManager = mockAdminManager();
		underTest.setAdminManager(adminManager);

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
		assertNull(result);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AdminManager
	 */
	private static AdminManager mockAdminManager() throws Throwable {
		AdminManager adminManager = mock(AdminManager.class);
		String getParameterResult = "getParameterResult"; // UTA: default value
		when(adminManager.getParameter(nullable(String.class))).thenReturn(getParameterResult);
		return adminManager;
	}

	/**
	 * Parasoft Jtest UTA: Test for setWsdlUrl(String)
	 *
	 * @see com.parasoft.parabank.messaging.WebServiceLoanProvider#setWsdlUrl(String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetWsdlUrl() throws Throwable {
		// Given
		WebServiceLoanProvider underTest = new WebServiceLoanProvider();

		// When
		String wsdlUrl = "wsdlUrl"; // UTA: default value
		underTest.setWsdlUrl(wsdlUrl);

	}
}