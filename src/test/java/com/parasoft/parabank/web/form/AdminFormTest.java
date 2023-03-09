/**
 * 
 */
package com.parasoft.parabank.web.form;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.ArgumentMatchers.nullable;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for AdminForm
 *
 * @see com.parasoft.parabank.web.form.AdminForm
 * @author devtest
 */
public class AdminFormTest {

	/**
	 * Parasoft Jtest UTA: Test for getAccessMode()
	 *
	 * @see com.parasoft.parabank.web.form.AdminForm#getAccessMode()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetAccessMode() throws Throwable {
		// Given
		AdminForm underTest = new AdminForm();

		// When
		String result = underTest.getAccessMode();

		// Then - assertions for result of method getAccessMode()
		assertNull(result);

		// Then - assertions for this instance of AdminForm
		assertNull(underTest.getEndpoint());
		assertNull(underTest.getSoapEndpoint());
		assertNull(underTest.getRestEndpoint());
		assertNull(underTest.getInitialBalance());
		assertNull(underTest.getMinimumBalance());
		assertNull(underTest.getLoanProvider());
		assertNull(underTest.getLoanProcessor());
		assertNull(underTest.getLoanProcessorThreshold());

	}

	/**
	 * Parasoft Jtest UTA: Test for getEndpoint()
	 *
	 * @see com.parasoft.parabank.web.form.AdminForm#getEndpoint()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetEndpoint() throws Throwable {
		// Given
		AdminForm underTest = new AdminForm();

		// When
		String result = underTest.getEndpoint();

		// Then - assertions for result of method getEndpoint()
		assertNull(result);

		// Then - assertions for this instance of AdminForm
		assertNull(underTest.getSoapEndpoint());
		assertNull(underTest.getRestEndpoint());
		assertNull(underTest.getInitialBalance());
		assertNull(underTest.getMinimumBalance());
		assertNull(underTest.getLoanProvider());
		assertNull(underTest.getLoanProcessor());
		assertNull(underTest.getLoanProcessorThreshold());
		assertNull(underTest.getAccessMode());

	}

	/**
	 * Parasoft Jtest UTA: Test for getInitialBalance()
	 *
	 * @see com.parasoft.parabank.web.form.AdminForm#getInitialBalance()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetInitialBalance() throws Throwable {
		// Given
		AdminForm underTest = new AdminForm();

		// When
		BigDecimal result = underTest.getInitialBalance();

		// Then - assertions for result of method getInitialBalance()
		assertNull(result);

		// Then - assertions for this instance of AdminForm
		assertNull(underTest.getEndpoint());
		assertNull(underTest.getSoapEndpoint());
		assertNull(underTest.getRestEndpoint());
		assertNull(underTest.getMinimumBalance());
		assertNull(underTest.getLoanProvider());
		assertNull(underTest.getLoanProcessor());
		assertNull(underTest.getLoanProcessorThreshold());
		assertNull(underTest.getAccessMode());

	}

	/**
	 * Parasoft Jtest UTA: Test for getLoanProcessor()
	 *
	 * @see com.parasoft.parabank.web.form.AdminForm#getLoanProcessor()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetLoanProcessor() throws Throwable {
		// Given
		AdminForm underTest = new AdminForm();

		// When
		String result = underTest.getLoanProcessor();

		// Then - assertions for result of method getLoanProcessor()
		assertNull(result);

		// Then - assertions for this instance of AdminForm
		assertNull(underTest.getEndpoint());
		assertNull(underTest.getSoapEndpoint());
		assertNull(underTest.getRestEndpoint());
		assertNull(underTest.getInitialBalance());
		assertNull(underTest.getMinimumBalance());
		assertNull(underTest.getLoanProvider());
		assertNull(underTest.getAccessMode());

	}

	/**
	 * Parasoft Jtest UTA: Test for getLoanProcessorThreshold()
	 *
	 * @see com.parasoft.parabank.web.form.AdminForm#getLoanProcessorThreshold()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetLoanProcessorThreshold() throws Throwable {
		// Given
		AdminForm underTest = new AdminForm();

		// When
		Integer result = underTest.getLoanProcessorThreshold();

		// Then - assertions for result of method getLoanProcessorThreshold()
		assertNull(result);

		// Then - assertions for this instance of AdminForm
		assertNull(underTest.getEndpoint());
		assertNull(underTest.getSoapEndpoint());
		assertNull(underTest.getRestEndpoint());
		assertNull(underTest.getInitialBalance());
		assertNull(underTest.getMinimumBalance());
		assertNull(underTest.getLoanProvider());
		assertNull(underTest.getLoanProcessor());
		assertNull(underTest.getAccessMode());

	}

	/**
	 * Parasoft Jtest UTA: Test for getLoanProvider()
	 *
	 * @see com.parasoft.parabank.web.form.AdminForm#getLoanProvider()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetLoanProvider() throws Throwable {
		// Given
		AdminForm underTest = new AdminForm();

		// When
		String result = underTest.getLoanProvider();

		// Then - assertions for result of method getLoanProvider()
		assertNull(result);

		// Then - assertions for this instance of AdminForm
		assertNull(underTest.getEndpoint());
		assertNull(underTest.getSoapEndpoint());
		assertNull(underTest.getRestEndpoint());
		assertNull(underTest.getInitialBalance());
		assertNull(underTest.getMinimumBalance());
		assertNull(underTest.getLoanProcessor());
		assertNull(underTest.getLoanProcessorThreshold());
		assertNull(underTest.getAccessMode());

	}

	/**
	 * Parasoft Jtest UTA: Test for getMinimumBalance()
	 *
	 * @see com.parasoft.parabank.web.form.AdminForm#getMinimumBalance()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetMinimumBalance() throws Throwable {
		// Given
		AdminForm underTest = new AdminForm();

		// When
		BigDecimal result = underTest.getMinimumBalance();

		// Then - assertions for result of method getMinimumBalance()
		assertNull(result);

		// Then - assertions for this instance of AdminForm
		assertNull(underTest.getEndpoint());
		assertNull(underTest.getSoapEndpoint());
		assertNull(underTest.getRestEndpoint());
		assertNull(underTest.getInitialBalance());
		assertNull(underTest.getLoanProvider());
		assertNull(underTest.getLoanProcessor());
		assertNull(underTest.getLoanProcessorThreshold());
		assertNull(underTest.getAccessMode());

	}

	/**
	 * Parasoft Jtest UTA: Test for getParameters()
	 *
	 * @see com.parasoft.parabank.web.form.AdminForm#getParameters()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetParameters() throws Throwable {
		// Given
		AdminForm underTest = new AdminForm();
		BigDecimal initialBalance = BigDecimal.ZERO; // UTA: default value
		underTest.setInitialBalance(initialBalance);
		BigDecimal minimumBalance = BigDecimal.ZERO; // UTA: default value
		underTest.setMinimumBalance(minimumBalance);
		Integer loanProcessorThreshold = 0; // UTA: default value
		underTest.setLoanProcessorThreshold(loanProcessorThreshold);
		String accessmode = "accessmode"; // UTA: default value
		underTest.setAccessMode(accessmode);
		String endpoint = "endpoint"; // UTA: default value
		underTest.setEndpoint(endpoint);
		String loanProcessor = "loanProcessor"; // UTA: default value
		underTest.setLoanProcessor(loanProcessor);
		String loanProvider = "loanProvider"; // UTA: default value
		underTest.setLoanProvider(loanProvider);
		String rest_endpoint = "rest_endpoint"; // UTA: default value
		underTest.setRestEndpoint(rest_endpoint);
		String soap_endpoint = "soap_endpoint"; // UTA: default value
		underTest.setSoapEndpoint(soap_endpoint);

		// When
		Map<String, String> result = underTest.getParameters();

		// Then - assertions for result of method getParameters()
		assertNotNull(result);
		assertEquals(9, result.size());

		// Then - assertions for this instance of AdminForm
		assertEquals("endpoint", underTest.getEndpoint());
		assertEquals("soap_endpoint", underTest.getSoapEndpoint());
		assertEquals("rest_endpoint", underTest.getRestEndpoint());
		assertNotNull(underTest.getInitialBalance());
		assertEquals(0d, underTest.getInitialBalance().doubleValue(), 0.0);
		assertNotNull(underTest.getMinimumBalance());
		assertEquals(0d, underTest.getMinimumBalance().doubleValue(), 0.0);
		assertEquals("loanProvider", underTest.getLoanProvider());
		assertEquals("loanProcessor", underTest.getLoanProcessor());
		assertNotNull(underTest.getLoanProcessorThreshold());
		assertEquals(0, underTest.getLoanProcessorThreshold().intValue());
		assertEquals("accessmode", underTest.getAccessMode());

	}

	/**
	 * Parasoft Jtest UTA: Test for getRestEndpoint()
	 *
	 * @see com.parasoft.parabank.web.form.AdminForm#getRestEndpoint()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetRestEndpoint() throws Throwable {
		// Given
		AdminForm underTest = new AdminForm();

		// When
		String result = underTest.getRestEndpoint();

		// Then - assertions for result of method getRestEndpoint()
		assertNull(result);

		// Then - assertions for this instance of AdminForm
		assertNull(underTest.getEndpoint());
		assertNull(underTest.getSoapEndpoint());
		assertNull(underTest.getInitialBalance());
		assertNull(underTest.getMinimumBalance());
		assertNull(underTest.getLoanProvider());
		assertNull(underTest.getLoanProcessor());
		assertNull(underTest.getLoanProcessorThreshold());
		assertNull(underTest.getAccessMode());

	}

	/**
	 * Parasoft Jtest UTA: Test for getSoapEndpoint()
	 *
	 * @see com.parasoft.parabank.web.form.AdminForm#getSoapEndpoint()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetSoapEndpoint() throws Throwable {
		// Given
		AdminForm underTest = new AdminForm();

		// When
		String result = underTest.getSoapEndpoint();

		// Then - assertions for result of method getSoapEndpoint()
		assertNull(result);

		// Then - assertions for this instance of AdminForm
		assertNull(underTest.getEndpoint());
		assertNull(underTest.getRestEndpoint());
		assertNull(underTest.getInitialBalance());
		assertNull(underTest.getMinimumBalance());
		assertNull(underTest.getLoanProvider());
		assertNull(underTest.getLoanProcessor());
		assertNull(underTest.getLoanProcessorThreshold());
		assertNull(underTest.getAccessMode());

	}

	/**
	 * Parasoft Jtest UTA: Test for setParameters(Map)
	 *
	 * @see com.parasoft.parabank.web.form.AdminForm#setParameters(Map)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetParameters() throws Throwable {
		// Given
		AdminForm underTest = new AdminForm();

		// When
		Map<String, String> parameters = mockMap();
		underTest.setParameters(parameters);

		// Then - assertions for this instance of AdminForm
		assertNull(underTest.getEndpoint());
		assertNull(underTest.getSoapEndpoint());
		assertNull(underTest.getRestEndpoint());
		assertNotNull(underTest.getInitialBalance());
		assertEquals(515.55d, underTest.getInitialBalance().doubleValue(), 0.0);
		assertNotNull(underTest.getMinimumBalance());
		assertEquals(100.00d, underTest.getMinimumBalance().doubleValue(), 0.0);
		assertNull(underTest.getLoanProvider());
		assertNull(underTest.getLoanProcessor());
		assertNotNull(underTest.getLoanProcessorThreshold());
		assertEquals(20, underTest.getLoanProcessorThreshold().intValue());
		assertNull(underTest.getAccessMode());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of Map
	 */
	private static Map<String, String> mockMap() throws Throwable {
		Map<String, String> parameters = mock(Map.class);
		String getResult = null; // UTA: provided value
		String getResult2 = null; // UTA: provided value
		String getResult3 = null; // UTA: provided value
		when(parameters.get(nullable(Object.class))).thenReturn(getResult, getResult2, getResult3);
		return parameters;
	}

}