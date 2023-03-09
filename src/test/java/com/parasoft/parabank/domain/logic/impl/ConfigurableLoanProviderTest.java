/**
 * 
 */
package com.parasoft.parabank.domain.logic.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.ArgumentMatchers.nullable;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.parasoft.parabank.domain.LoanRequest;
import com.parasoft.parabank.domain.LoanResponse;
import com.parasoft.parabank.domain.logic.AdminManager;
import com.parasoft.parabank.domain.logic.LoanProvider;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for ConfigurableLoanProvider
 *
 * @see com.parasoft.parabank.domain.logic.impl.ConfigurableLoanProvider
 * @author devtest
 */
public class ConfigurableLoanProviderTest {

	/**
	 * Parasoft Jtest UTA: Test for getAdminManager()
	 *
	 * @see com.parasoft.parabank.domain.logic.impl.ConfigurableLoanProvider#getAdminManager()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetAdminManager() throws Throwable {
		// Given
		ConfigurableLoanProvider underTest = new ConfigurableLoanProvider();

		// When
		AdminManager result = underTest.getAdminManager();

		// Then - assertions for result of method getAdminManager()
		assertNull(result);

		// Then - assertions for this instance of ConfigurableLoanProvider
		assertNull(underTest.getLoanProviders());
		assertNull(underTest.getParameter());

	}

	/**
	 * Parasoft Jtest UTA: Test for getLoanProviders()
	 *
	 * @see com.parasoft.parabank.domain.logic.impl.ConfigurableLoanProvider#getLoanProviders()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetLoanProviders() throws Throwable {
		// Given
		ConfigurableLoanProvider underTest = new ConfigurableLoanProvider();

		// When
		Map<String, LoanProvider> result = underTest.getLoanProviders();

		// Then - assertions for result of method getLoanProviders()
		assertNull(result);

		// Then - assertions for this instance of ConfigurableLoanProvider
		assertNull(underTest.getAdminManager());
		assertNull(underTest.getParameter());

	}

	/**
	 * Parasoft Jtest UTA: Test for getParameter()
	 *
	 * @see com.parasoft.parabank.domain.logic.impl.ConfigurableLoanProvider#getParameter()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetParameter() throws Throwable {
		// Given
		ConfigurableLoanProvider underTest = new ConfigurableLoanProvider();

		// When
		String result = underTest.getParameter();

		// Then - assertions for result of method getParameter()
		assertNull(result);

		// Then - assertions for this instance of ConfigurableLoanProvider
		assertNull(underTest.getAdminManager());
		assertNull(underTest.getLoanProviders());

	}

	/**
	 * Parasoft Jtest UTA: Test for getProviderNames()
	 *
	 * @see com.parasoft.parabank.domain.logic.impl.ConfigurableLoanProvider#getProviderNames()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetProviderNames() throws Throwable {
		// Given
		ConfigurableLoanProvider underTest = new ConfigurableLoanProvider();
		Map<String, LoanProvider> loanProviders = new HashMap<String, LoanProvider>(); // UTA: default value
		String key = "key"; // UTA: default value
		LoanProvider value = mock(LoanProvider.class);
		loanProviders.put(key, value);
		underTest.setLoanProviders(loanProviders);

		// When
		Set<String> result = underTest.getProviderNames();

		// Then - assertions for result of method getProviderNames()
		assertNotNull(result);
		assertEquals(1, result.size());

		// Then - assertions for this instance of ConfigurableLoanProvider
		assertNull(underTest.getAdminManager());
		assertNotNull(underTest.getLoanProviders());
		assertEquals(1, underTest.getLoanProviders().size());
		assertNull(underTest.getParameter());

	}

	/**
	 * Parasoft Jtest UTA: Test for requestLoan(LoanRequest)
	 *
	 * @see com.parasoft.parabank.domain.logic.impl.ConfigurableLoanProvider#requestLoan(LoanRequest)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testRequestLoan() throws Throwable {
		// Given
		ConfigurableLoanProvider underTest = new ConfigurableLoanProvider();
		AdminManager adminManager = mock(AdminManager.class);
		underTest.setAdminManager(adminManager);
		Map<String, LoanProvider> loanProviders = mockMap();
		underTest.setLoanProviders(loanProviders);

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

		// Then - assertions for this instance of ConfigurableLoanProvider
		assertNotNull(underTest.getAdminManager());
		assertNotNull(underTest.getLoanProviders());
		assertEquals(0, underTest.getLoanProviders().size());
		assertNull(underTest.getParameter());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of Map
	 */
	private static Map<String, LoanProvider> mockMap() throws Throwable {
		Map<String, LoanProvider> loanProviders = mock(Map.class);
		LoanProvider getResult = mock(LoanProvider.class);
		when(loanProviders.get(nullable(Object.class))).thenReturn(getResult);
		return loanProviders;
	}

	/**
	 * Parasoft Jtest UTA: Test for setParameter(String)
	 *
	 * @see com.parasoft.parabank.domain.logic.impl.ConfigurableLoanProvider#setParameter(String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetParameter() throws Throwable {
		// Given
		ConfigurableLoanProvider underTest = new ConfigurableLoanProvider();

		// When
		String parameter = "parameter"; // UTA: default value
		underTest.setParameter(parameter);

		// Then - assertions for this instance of ConfigurableLoanProvider
		assertNull(underTest.getAdminManager());
		assertNull(underTest.getLoanProviders());
		assertEquals("parameter", underTest.getParameter());

	}
}