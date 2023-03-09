/**
 * 
 */
package com.parasoft.parabank.web.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.nullable;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.parasoft.parabank.domain.Account;
import com.parasoft.parabank.domain.BillPayResult;
import com.parasoft.parabank.domain.Customer;
import com.parasoft.parabank.domain.LoanResponse;
import com.parasoft.parabank.domain.Payee;
import com.parasoft.parabank.domain.Transaction;
import com.parasoft.parabank.domain.logic.AdminManager;
import com.parasoft.parabank.domain.logic.BankManager;
import com.parasoft.parabank.util.AccessModeController;
import com.parasoft.parabank.web.controller.exception.AuthenticationException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.NoSuchMessageException;
import org.springframework.http.ResponseEntity;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

/**
 * Parasoft Jtest UTA: Test class for RestServiceProxyController
 *
 * @see com.parasoft.parabank.web.controller.RestServiceProxyController
 * @author devtest
 */
public class RestServiceProxyControllerTest {

	/**
	 * Parasoft Jtest UTA: Test for billPay(Integer, BigDecimal, Payee)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#billPay(Integer, BigDecimal, Payee)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = AuthenticationException.class)
	public void testBillPay() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();
		MessageSource messageSourceValue = mockMessageSource();
		ReflectionTestUtils.setField(underTest, "messageSource", messageSourceValue);

		// When
		Integer accountId = 0; // UTA: default value
		BigDecimal amount = BigDecimal.ZERO; // UTA: default value
		Payee payee = mock(Payee.class);
		underTest.billPay(accountId, amount, payee);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of MessageSource
	 */
	private static MessageSource mockMessageSource() throws Throwable {
		MessageSource messageSourceValue = mock(MessageSource.class);
		String getMessageResult = "getMessageResult"; // UTA: default value
		when(messageSourceValue.getMessage(nullable(String.class), nullable(Object[].class), nullable(Locale.class)))
				.thenReturn(getMessageResult);
		return messageSourceValue;
	}

	/**
	 * Parasoft Jtest UTA: Test for billPay(Integer, BigDecimal, Payee)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#billPay(Integer, BigDecimal, Payee)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = AuthenticationException.class)
	public void testBillPay2() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();
		MessageSource messageSourceValue = mockMessageSource2();
		ReflectionTestUtils.setField(underTest, "messageSource", messageSourceValue);
		AccessModeController accessModeController = mockAccessModeController();
		underTest.setAccessModeController(accessModeController);

		// When
		Integer accountId = 0; // UTA: default value
		BigDecimal amount = BigDecimal.ZERO; // UTA: default value
		Payee payee = mock(Payee.class);
		underTest.billPay(accountId, amount, payee);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of MessageSource
	 */
	private static MessageSource mockMessageSource2() throws Throwable {
		MessageSource messageSourceValue = mock(MessageSource.class);
		String getMessageResult = "getMessageResult"; // UTA: default value
		when(messageSourceValue.getMessage(nullable(String.class), nullable(Object[].class), nullable(Locale.class)))
				.thenReturn(getMessageResult);
		return messageSourceValue;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AccessModeController
	 */
	private static AccessModeController mockAccessModeController() throws Throwable {
		AccessModeController accessModeController = mock(AccessModeController.class);
		Customer loginResult = null; // UTA: provided value
		when(accessModeController.login(nullable(String.class), nullable(String.class))).thenReturn(loginResult);
		return accessModeController;
	}

	/**
	 * Parasoft Jtest UTA: Test for billPay(Integer, BigDecimal, Payee)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#billPay(Integer, BigDecimal, Payee)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = NoSuchMessageException.class)
	public void testBillPay3() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();

		// When
		Integer accountId = 0; // UTA: default value
		BigDecimal amount = BigDecimal.ZERO; // UTA: default value
		Payee payee = mock(Payee.class);
		underTest.billPay(accountId, amount, payee);

	}

	/**
	 * Parasoft Jtest UTA: Test for billPay(Integer, BigDecimal, Payee)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#billPay(Integer, BigDecimal, Payee)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = NoSuchMessageException.class)
	public void testBillPay4() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();
		AccessModeController accessModeController = mockAccessModeController2();
		underTest.setAccessModeController(accessModeController);

		// When
		Integer accountId = 0; // UTA: default value
		BigDecimal amount = BigDecimal.ZERO; // UTA: default value
		Payee payee = mock(Payee.class);
		underTest.billPay(accountId, amount, payee);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AccessModeController
	 */
	private static AccessModeController mockAccessModeController2() throws Throwable {
		AccessModeController accessModeController = mock(AccessModeController.class);
		Customer loginResult = null; // UTA: provided value
		when(accessModeController.login(nullable(String.class), nullable(String.class))).thenReturn(loginResult);
		return accessModeController;
	}

	/**
	 * Parasoft Jtest UTA: Test for createAccount(Integer, Integer, Integer)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#createAccount(Integer, Integer, Integer)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = AuthenticationException.class)
	public void testCreateAccount() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();
		MessageSource messageSourceValue = mockMessageSource3();
		ReflectionTestUtils.setField(underTest, "messageSource", messageSourceValue);

		// When
		Integer customerId = 0; // UTA: default value
		Integer newAccountType = 0; // UTA: default value
		Integer fromAccountId = 0; // UTA: default value
		underTest.createAccount(customerId, newAccountType, fromAccountId);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of MessageSource
	 */
	private static MessageSource mockMessageSource3() throws Throwable {
		MessageSource messageSourceValue = mock(MessageSource.class);
		String getMessageResult = "getMessageResult"; // UTA: default value
		when(messageSourceValue.getMessage(nullable(String.class), nullable(Object[].class), nullable(Locale.class)))
				.thenReturn(getMessageResult);
		return messageSourceValue;
	}

	/**
	 * Parasoft Jtest UTA: Test for createAccount(Integer, Integer, Integer)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#createAccount(Integer, Integer, Integer)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = AuthenticationException.class)
	public void testCreateAccount2() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();
		MessageSource messageSourceValue = mockMessageSource4();
		ReflectionTestUtils.setField(underTest, "messageSource", messageSourceValue);
		AccessModeController accessModeController = mockAccessModeController3();
		underTest.setAccessModeController(accessModeController);

		// When
		Integer customerId = 0; // UTA: default value
		Integer newAccountType = 0; // UTA: default value
		Integer fromAccountId = 0; // UTA: default value
		underTest.createAccount(customerId, newAccountType, fromAccountId);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of MessageSource
	 */
	private static MessageSource mockMessageSource4() throws Throwable {
		MessageSource messageSourceValue = mock(MessageSource.class);
		String getMessageResult = "getMessageResult"; // UTA: default value
		when(messageSourceValue.getMessage(nullable(String.class), nullable(Object[].class), nullable(Locale.class)))
				.thenReturn(getMessageResult);
		return messageSourceValue;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AccessModeController
	 */
	private static AccessModeController mockAccessModeController3() throws Throwable {
		AccessModeController accessModeController = mock(AccessModeController.class);
		Customer loginResult = null; // UTA: provided value
		when(accessModeController.login(nullable(String.class), nullable(String.class))).thenReturn(loginResult);
		return accessModeController;
	}

	/**
	 * Parasoft Jtest UTA: Test for createAccount(Integer, Integer, Integer)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#createAccount(Integer, Integer, Integer)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = NoSuchMessageException.class)
	public void testCreateAccount3() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();

		// When
		Integer customerId = 0; // UTA: default value
		Integer newAccountType = 0; // UTA: default value
		Integer fromAccountId = 0; // UTA: default value
		underTest.createAccount(customerId, newAccountType, fromAccountId);

	}

	/**
	 * Parasoft Jtest UTA: Test for createAccount(Integer, Integer, Integer)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#createAccount(Integer, Integer, Integer)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = NoSuchMessageException.class)
	public void testCreateAccount4() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();
		AccessModeController accessModeController = mockAccessModeController4();
		underTest.setAccessModeController(accessModeController);

		// When
		Integer customerId = 0; // UTA: default value
		Integer newAccountType = 0; // UTA: default value
		Integer fromAccountId = 0; // UTA: default value
		underTest.createAccount(customerId, newAccountType, fromAccountId);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AccessModeController
	 */
	private static AccessModeController mockAccessModeController4() throws Throwable {
		AccessModeController accessModeController = mock(AccessModeController.class);
		Customer loginResult = null; // UTA: provided value
		when(accessModeController.login(nullable(String.class), nullable(String.class))).thenReturn(loginResult);
		return accessModeController;
	}

	/**
	 * Parasoft Jtest UTA: Test for getAccount(Integer)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#getAccount(Integer)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = AuthenticationException.class)
	public void testGetAccount() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();
		MessageSource messageSourceValue = mockMessageSource5();
		ReflectionTestUtils.setField(underTest, "messageSource", messageSourceValue);

		// When
		Integer id = 0; // UTA: default value
		underTest.getAccount(id);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of MessageSource
	 */
	private static MessageSource mockMessageSource5() throws Throwable {
		MessageSource messageSourceValue = mock(MessageSource.class);
		String getMessageResult = "getMessageResult"; // UTA: default value
		when(messageSourceValue.getMessage(nullable(String.class), nullable(Object[].class), nullable(Locale.class)))
				.thenReturn(getMessageResult);
		return messageSourceValue;
	}

	/**
	 * Parasoft Jtest UTA: Test for getAccount(Integer)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#getAccount(Integer)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = AuthenticationException.class)
	public void testGetAccount2() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();
		MessageSource messageSourceValue = mockMessageSource6();
		ReflectionTestUtils.setField(underTest, "messageSource", messageSourceValue);
		AccessModeController accessModeController = mockAccessModeController5();
		underTest.setAccessModeController(accessModeController);

		// When
		Integer id = 0; // UTA: default value
		underTest.getAccount(id);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of MessageSource
	 */
	private static MessageSource mockMessageSource6() throws Throwable {
		MessageSource messageSourceValue = mock(MessageSource.class);
		String getMessageResult = "getMessageResult"; // UTA: default value
		when(messageSourceValue.getMessage(nullable(String.class), nullable(Object[].class), nullable(Locale.class)))
				.thenReturn(getMessageResult);
		return messageSourceValue;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AccessModeController
	 */
	private static AccessModeController mockAccessModeController5() throws Throwable {
		AccessModeController accessModeController = mock(AccessModeController.class);
		Customer loginResult = null; // UTA: provided value
		when(accessModeController.login(nullable(String.class), nullable(String.class))).thenReturn(loginResult);
		return accessModeController;
	}

	/**
	 * Parasoft Jtest UTA: Test for getAccount(Integer)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#getAccount(Integer)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = NoSuchMessageException.class)
	public void testGetAccount3() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();

		// When
		Integer id = 0; // UTA: default value
		underTest.getAccount(id);

	}

	/**
	 * Parasoft Jtest UTA: Test for getAccount(Integer)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#getAccount(Integer)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = NoSuchMessageException.class)
	public void testGetAccount4() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();
		AccessModeController accessModeController = mockAccessModeController6();
		underTest.setAccessModeController(accessModeController);

		// When
		Integer id = 0; // UTA: default value
		underTest.getAccount(id);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AccessModeController
	 */
	private static AccessModeController mockAccessModeController6() throws Throwable {
		AccessModeController accessModeController = mock(AccessModeController.class);
		Customer loginResult = null; // UTA: provided value
		when(accessModeController.login(nullable(String.class), nullable(String.class))).thenReturn(loginResult);
		return accessModeController;
	}

	/**
	 * Parasoft Jtest UTA: Test for getAccounts(Integer)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#getAccounts(Integer)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = AuthenticationException.class)
	public void testGetAccounts() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();
		MessageSource messageSourceValue = mockMessageSource7();
		ReflectionTestUtils.setField(underTest, "messageSource", messageSourceValue);

		// When
		Integer id = 0; // UTA: default value
		underTest.getAccounts(id);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of MessageSource
	 */
	private static MessageSource mockMessageSource7() throws Throwable {
		MessageSource messageSourceValue = mock(MessageSource.class);
		String getMessageResult = "getMessageResult"; // UTA: default value
		when(messageSourceValue.getMessage(nullable(String.class), nullable(Object[].class), nullable(Locale.class)))
				.thenReturn(getMessageResult);
		return messageSourceValue;
	}

	/**
	 * Parasoft Jtest UTA: Test for getAccounts(Integer)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#getAccounts(Integer)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = AuthenticationException.class)
	public void testGetAccounts2() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();
		MessageSource messageSourceValue = mockMessageSource8();
		ReflectionTestUtils.setField(underTest, "messageSource", messageSourceValue);
		AccessModeController accessModeController = mockAccessModeController7();
		underTest.setAccessModeController(accessModeController);

		// When
		Integer id = 0; // UTA: default value
		underTest.getAccounts(id);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of MessageSource
	 */
	private static MessageSource mockMessageSource8() throws Throwable {
		MessageSource messageSourceValue = mock(MessageSource.class);
		String getMessageResult = "getMessageResult"; // UTA: default value
		when(messageSourceValue.getMessage(nullable(String.class), nullable(Object[].class), nullable(Locale.class)))
				.thenReturn(getMessageResult);
		return messageSourceValue;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AccessModeController
	 */
	private static AccessModeController mockAccessModeController7() throws Throwable {
		AccessModeController accessModeController = mock(AccessModeController.class);
		Customer loginResult = null; // UTA: provided value
		when(accessModeController.login(nullable(String.class), nullable(String.class))).thenReturn(loginResult);
		return accessModeController;
	}

	/**
	 * Parasoft Jtest UTA: Test for getAccounts(Integer)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#getAccounts(Integer)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = NoSuchMessageException.class)
	public void testGetAccounts3() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();

		// When
		Integer id = 0; // UTA: default value
		underTest.getAccounts(id);

	}

	/**
	 * Parasoft Jtest UTA: Test for getAccounts(Integer)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#getAccounts(Integer)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = NoSuchMessageException.class)
	public void testGetAccounts4() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();
		AccessModeController accessModeController = mockAccessModeController8();
		underTest.setAccessModeController(accessModeController);

		// When
		Integer id = 0; // UTA: default value
		underTest.getAccounts(id);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AccessModeController
	 */
	private static AccessModeController mockAccessModeController8() throws Throwable {
		AccessModeController accessModeController = mock(AccessModeController.class);
		Customer loginResult = null; // UTA: provided value
		when(accessModeController.login(nullable(String.class), nullable(String.class))).thenReturn(loginResult);
		return accessModeController;
	}

	/**
	 * Parasoft Jtest UTA: Test for getCustomer(Integer)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#getCustomer(Integer)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = AuthenticationException.class)
	public void testGetCustomer() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();
		MessageSource messageSourceValue = mockMessageSource9();
		ReflectionTestUtils.setField(underTest, "messageSource", messageSourceValue);

		// When
		Integer customerId = 0; // UTA: default value
		underTest.getCustomer(customerId);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of MessageSource
	 */
	private static MessageSource mockMessageSource9() throws Throwable {
		MessageSource messageSourceValue = mock(MessageSource.class);
		String getMessageResult = "getMessageResult"; // UTA: default value
		when(messageSourceValue.getMessage(nullable(String.class), nullable(Object[].class), nullable(Locale.class)))
				.thenReturn(getMessageResult);
		return messageSourceValue;
	}

	/**
	 * Parasoft Jtest UTA: Test for getCustomer(Integer)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#getCustomer(Integer)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = AuthenticationException.class)
	public void testGetCustomer2() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();
		MessageSource messageSourceValue = mockMessageSource10();
		ReflectionTestUtils.setField(underTest, "messageSource", messageSourceValue);
		AccessModeController accessModeController = mockAccessModeController9();
		underTest.setAccessModeController(accessModeController);

		// When
		Integer customerId = 0; // UTA: default value
		underTest.getCustomer(customerId);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of MessageSource
	 */
	private static MessageSource mockMessageSource10() throws Throwable {
		MessageSource messageSourceValue = mock(MessageSource.class);
		String getMessageResult = "getMessageResult"; // UTA: default value
		when(messageSourceValue.getMessage(nullable(String.class), nullable(Object[].class), nullable(Locale.class)))
				.thenReturn(getMessageResult);
		return messageSourceValue;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AccessModeController
	 */
	private static AccessModeController mockAccessModeController9() throws Throwable {
		AccessModeController accessModeController = mock(AccessModeController.class);
		Customer loginResult = null; // UTA: provided value
		when(accessModeController.login(nullable(String.class), nullable(String.class))).thenReturn(loginResult);
		return accessModeController;
	}

	/**
	 * Parasoft Jtest UTA: Test for getCustomer(Integer)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#getCustomer(Integer)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = NoSuchMessageException.class)
	public void testGetCustomer3() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();

		// When
		Integer customerId = 0; // UTA: default value
		underTest.getCustomer(customerId);

	}

	/**
	 * Parasoft Jtest UTA: Test for getCustomer(Integer)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#getCustomer(Integer)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = NoSuchMessageException.class)
	public void testGetCustomer4() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();
		AccessModeController accessModeController = mockAccessModeController10();
		underTest.setAccessModeController(accessModeController);

		// When
		Integer customerId = 0; // UTA: default value
		underTest.getCustomer(customerId);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AccessModeController
	 */
	private static AccessModeController mockAccessModeController10() throws Throwable {
		AccessModeController accessModeController = mock(AccessModeController.class);
		Customer loginResult = null; // UTA: provided value
		when(accessModeController.login(nullable(String.class), nullable(String.class))).thenReturn(loginResult);
		return accessModeController;
	}

	/**
	 * Parasoft Jtest UTA: Test for getSwagger(HttpServletRequest)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#getSwagger(HttpServletRequest)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetSwagger() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();
		ServletContext servletContext = mockServletContext();
		underTest.setServletContext(servletContext);

		// When
		HttpServletRequest request = mockHttpServletRequest();
		ResponseEntity<String> result = underTest.getSwagger(request);

		// Then - assertions for this instance of RestServiceProxyController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNull(underTest.getBankManager());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of ServletContext
	 */
	private static ServletContext mockServletContext() throws Throwable {
		ServletContext servletContext = mock(ServletContext.class);
		InputStream getResourceAsStreamResult = mock(InputStream.class);
		when(servletContext.getResourceAsStream(nullable(String.class))).thenReturn(getResourceAsStreamResult);
		return servletContext;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of HttpServletRequest
	 */
	private static HttpServletRequest mockHttpServletRequest() throws Throwable {
		HttpServletRequest request = mock(HttpServletRequest.class);
		String getServerNameResult = "getServerNameResult"; // UTA: default value
		when(request.getServerName()).thenReturn(getServerNameResult);
		return request;
	}

	/**
	 * Parasoft Jtest UTA: Test for getTransaction(Integer)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#getTransaction(Integer)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = AuthenticationException.class)
	public void testGetTransaction() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();
		MessageSource messageSourceValue = mockMessageSource11();
		ReflectionTestUtils.setField(underTest, "messageSource", messageSourceValue);

		// When
		Integer transactionId = 0; // UTA: default value
		underTest.getTransaction(transactionId);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of MessageSource
	 */
	private static MessageSource mockMessageSource11() throws Throwable {
		MessageSource messageSourceValue = mock(MessageSource.class);
		String getMessageResult = "getMessageResult"; // UTA: default value
		when(messageSourceValue.getMessage(nullable(String.class), nullable(Object[].class), nullable(Locale.class)))
				.thenReturn(getMessageResult);
		return messageSourceValue;
	}

	/**
	 * Parasoft Jtest UTA: Test for getTransaction(Integer)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#getTransaction(Integer)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = AuthenticationException.class)
	public void testGetTransaction2() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();
		MessageSource messageSourceValue = mockMessageSource12();
		ReflectionTestUtils.setField(underTest, "messageSource", messageSourceValue);
		AccessModeController accessModeController = mockAccessModeController11();
		underTest.setAccessModeController(accessModeController);

		// When
		Integer transactionId = 0; // UTA: default value
		underTest.getTransaction(transactionId);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of MessageSource
	 */
	private static MessageSource mockMessageSource12() throws Throwable {
		MessageSource messageSourceValue = mock(MessageSource.class);
		String getMessageResult = "getMessageResult"; // UTA: default value
		when(messageSourceValue.getMessage(nullable(String.class), nullable(Object[].class), nullable(Locale.class)))
				.thenReturn(getMessageResult);
		return messageSourceValue;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AccessModeController
	 */
	private static AccessModeController mockAccessModeController11() throws Throwable {
		AccessModeController accessModeController = mock(AccessModeController.class);
		Customer loginResult = null; // UTA: provided value
		when(accessModeController.login(nullable(String.class), nullable(String.class))).thenReturn(loginResult);
		return accessModeController;
	}

	/**
	 * Parasoft Jtest UTA: Test for getTransaction(Integer)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#getTransaction(Integer)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = NoSuchMessageException.class)
	public void testGetTransaction3() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();

		// When
		Integer transactionId = 0; // UTA: default value
		underTest.getTransaction(transactionId);

	}

	/**
	 * Parasoft Jtest UTA: Test for getTransaction(Integer)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#getTransaction(Integer)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = NoSuchMessageException.class)
	public void testGetTransaction4() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();
		AccessModeController accessModeController = mockAccessModeController12();
		underTest.setAccessModeController(accessModeController);

		// When
		Integer transactionId = 0; // UTA: default value
		underTest.getTransaction(transactionId);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AccessModeController
	 */
	private static AccessModeController mockAccessModeController12() throws Throwable {
		AccessModeController accessModeController = mock(AccessModeController.class);
		Customer loginResult = null; // UTA: provided value
		when(accessModeController.login(nullable(String.class), nullable(String.class))).thenReturn(loginResult);
		return accessModeController;
	}

	/**
	 * Parasoft Jtest UTA: Test for getTransactions(Integer)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#getTransactions(Integer)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = AuthenticationException.class)
	public void testGetTransactions() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();
		MessageSource messageSourceValue = mockMessageSource13();
		ReflectionTestUtils.setField(underTest, "messageSource", messageSourceValue);

		// When
		Integer id = 0; // UTA: default value
		underTest.getTransactions(id);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of MessageSource
	 */
	private static MessageSource mockMessageSource13() throws Throwable {
		MessageSource messageSourceValue = mock(MessageSource.class);
		String getMessageResult = "getMessageResult"; // UTA: default value
		when(messageSourceValue.getMessage(nullable(String.class), nullable(Object[].class), nullable(Locale.class)))
				.thenReturn(getMessageResult);
		return messageSourceValue;
	}

	/**
	 * Parasoft Jtest UTA: Test for getTransactions(Integer)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#getTransactions(Integer)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = AuthenticationException.class)
	public void testGetTransactions2() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();
		MessageSource messageSourceValue = mockMessageSource14();
		ReflectionTestUtils.setField(underTest, "messageSource", messageSourceValue);
		AccessModeController accessModeController = mockAccessModeController13();
		underTest.setAccessModeController(accessModeController);

		// When
		Integer id = 0; // UTA: default value
		underTest.getTransactions(id);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of MessageSource
	 */
	private static MessageSource mockMessageSource14() throws Throwable {
		MessageSource messageSourceValue = mock(MessageSource.class);
		String getMessageResult = "getMessageResult"; // UTA: default value
		when(messageSourceValue.getMessage(nullable(String.class), nullable(Object[].class), nullable(Locale.class)))
				.thenReturn(getMessageResult);
		return messageSourceValue;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AccessModeController
	 */
	private static AccessModeController mockAccessModeController13() throws Throwable {
		AccessModeController accessModeController = mock(AccessModeController.class);
		Customer loginResult = null; // UTA: provided value
		when(accessModeController.login(nullable(String.class), nullable(String.class))).thenReturn(loginResult);
		return accessModeController;
	}

	/**
	 * Parasoft Jtest UTA: Test for getTransactions(Integer)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#getTransactions(Integer)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = NoSuchMessageException.class)
	public void testGetTransactions3() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();

		// When
		Integer id = 0; // UTA: default value
		underTest.getTransactions(id);

	}

	/**
	 * Parasoft Jtest UTA: Test for getTransactions(Integer)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#getTransactions(Integer)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = NoSuchMessageException.class)
	public void testGetTransactions4() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();
		AccessModeController accessModeController = mockAccessModeController14();
		underTest.setAccessModeController(accessModeController);

		// When
		Integer id = 0; // UTA: default value
		underTest.getTransactions(id);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AccessModeController
	 */
	private static AccessModeController mockAccessModeController14() throws Throwable {
		AccessModeController accessModeController = mock(AccessModeController.class);
		Customer loginResult = null; // UTA: provided value
		when(accessModeController.login(nullable(String.class), nullable(String.class))).thenReturn(loginResult);
		return accessModeController;
	}

	/**
	 * Parasoft Jtest UTA: Test for getTransactionsByAmount(Integer, BigDecimal)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#getTransactionsByAmount(Integer, BigDecimal)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = AuthenticationException.class)
	public void testGetTransactionsByAmount() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();
		MessageSource messageSourceValue = mockMessageSource15();
		ReflectionTestUtils.setField(underTest, "messageSource", messageSourceValue);

		// When
		Integer accountId = 0; // UTA: default value
		BigDecimal amount = BigDecimal.ZERO; // UTA: default value
		underTest.getTransactionsByAmount(accountId, amount);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of MessageSource
	 */
	private static MessageSource mockMessageSource15() throws Throwable {
		MessageSource messageSourceValue = mock(MessageSource.class);
		String getMessageResult = "getMessageResult"; // UTA: default value
		when(messageSourceValue.getMessage(nullable(String.class), nullable(Object[].class), nullable(Locale.class)))
				.thenReturn(getMessageResult);
		return messageSourceValue;
	}

	/**
	 * Parasoft Jtest UTA: Test for getTransactionsByAmount(Integer, BigDecimal)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#getTransactionsByAmount(Integer, BigDecimal)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = AuthenticationException.class)
	public void testGetTransactionsByAmount2() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();
		MessageSource messageSourceValue = mockMessageSource16();
		ReflectionTestUtils.setField(underTest, "messageSource", messageSourceValue);
		AccessModeController accessModeController = mockAccessModeController15();
		underTest.setAccessModeController(accessModeController);

		// When
		Integer accountId = 0; // UTA: default value
		BigDecimal amount = BigDecimal.ZERO; // UTA: default value
		underTest.getTransactionsByAmount(accountId, amount);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of MessageSource
	 */
	private static MessageSource mockMessageSource16() throws Throwable {
		MessageSource messageSourceValue = mock(MessageSource.class);
		String getMessageResult = "getMessageResult"; // UTA: default value
		when(messageSourceValue.getMessage(nullable(String.class), nullable(Object[].class), nullable(Locale.class)))
				.thenReturn(getMessageResult);
		return messageSourceValue;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AccessModeController
	 */
	private static AccessModeController mockAccessModeController15() throws Throwable {
		AccessModeController accessModeController = mock(AccessModeController.class);
		Customer loginResult = null; // UTA: provided value
		when(accessModeController.login(nullable(String.class), nullable(String.class))).thenReturn(loginResult);
		return accessModeController;
	}

	/**
	 * Parasoft Jtest UTA: Test for getTransactionsByAmount(Integer, BigDecimal)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#getTransactionsByAmount(Integer, BigDecimal)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = NoSuchMessageException.class)
	public void testGetTransactionsByAmount3() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();

		// When
		Integer accountId = 0; // UTA: default value
		BigDecimal amount = BigDecimal.ZERO; // UTA: default value
		underTest.getTransactionsByAmount(accountId, amount);

	}

	/**
	 * Parasoft Jtest UTA: Test for getTransactionsByAmount(Integer, BigDecimal)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#getTransactionsByAmount(Integer, BigDecimal)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = NoSuchMessageException.class)
	public void testGetTransactionsByAmount4() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();
		AccessModeController accessModeController = mockAccessModeController16();
		underTest.setAccessModeController(accessModeController);

		// When
		Integer accountId = 0; // UTA: default value
		BigDecimal amount = BigDecimal.ZERO; // UTA: default value
		underTest.getTransactionsByAmount(accountId, amount);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AccessModeController
	 */
	private static AccessModeController mockAccessModeController16() throws Throwable {
		AccessModeController accessModeController = mock(AccessModeController.class);
		Customer loginResult = null; // UTA: provided value
		when(accessModeController.login(nullable(String.class), nullable(String.class))).thenReturn(loginResult);
		return accessModeController;
	}

	/**
	 * Parasoft Jtest UTA: Test for getTransactionsByMonthAndType(Integer, String, String)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#getTransactionsByMonthAndType(Integer, String, String)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = AuthenticationException.class)
	public void testGetTransactionsByMonthAndType() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();
		MessageSource messageSourceValue = mockMessageSource17();
		ReflectionTestUtils.setField(underTest, "messageSource", messageSourceValue);

		// When
		Integer id = 0; // UTA: default value
		String month = "month"; // UTA: default value
		String type = "type"; // UTA: default value
		underTest.getTransactionsByMonthAndType(id, month, type);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of MessageSource
	 */
	private static MessageSource mockMessageSource17() throws Throwable {
		MessageSource messageSourceValue = mock(MessageSource.class);
		String getMessageResult = "getMessageResult"; // UTA: default value
		when(messageSourceValue.getMessage(nullable(String.class), nullable(Object[].class), nullable(Locale.class)))
				.thenReturn(getMessageResult);
		return messageSourceValue;
	}

	/**
	 * Parasoft Jtest UTA: Test for getTransactionsByMonthAndType(Integer, String, String)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#getTransactionsByMonthAndType(Integer, String, String)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = AuthenticationException.class)
	public void testGetTransactionsByMonthAndType2() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();
		MessageSource messageSourceValue = mockMessageSource18();
		ReflectionTestUtils.setField(underTest, "messageSource", messageSourceValue);
		AccessModeController accessModeController = mockAccessModeController17();
		underTest.setAccessModeController(accessModeController);

		// When
		Integer id = 0; // UTA: default value
		String month = "month"; // UTA: default value
		String type = "type"; // UTA: default value
		underTest.getTransactionsByMonthAndType(id, month, type);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of MessageSource
	 */
	private static MessageSource mockMessageSource18() throws Throwable {
		MessageSource messageSourceValue = mock(MessageSource.class);
		String getMessageResult = "getMessageResult"; // UTA: default value
		when(messageSourceValue.getMessage(nullable(String.class), nullable(Object[].class), nullable(Locale.class)))
				.thenReturn(getMessageResult);
		return messageSourceValue;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AccessModeController
	 */
	private static AccessModeController mockAccessModeController17() throws Throwable {
		AccessModeController accessModeController = mock(AccessModeController.class);
		Customer loginResult = null; // UTA: provided value
		when(accessModeController.login(nullable(String.class), nullable(String.class))).thenReturn(loginResult);
		return accessModeController;
	}

	/**
	 * Parasoft Jtest UTA: Test for getTransactionsByMonthAndType(Integer, String, String)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#getTransactionsByMonthAndType(Integer, String, String)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = NoSuchMessageException.class)
	public void testGetTransactionsByMonthAndType3() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();

		// When
		Integer id = 0; // UTA: default value
		String month = "month"; // UTA: default value
		String type = "type"; // UTA: default value
		underTest.getTransactionsByMonthAndType(id, month, type);

	}

	/**
	 * Parasoft Jtest UTA: Test for getTransactionsByMonthAndType(Integer, String, String)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#getTransactionsByMonthAndType(Integer, String, String)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = NoSuchMessageException.class)
	public void testGetTransactionsByMonthAndType4() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();
		AccessModeController accessModeController = mockAccessModeController18();
		underTest.setAccessModeController(accessModeController);

		// When
		Integer id = 0; // UTA: default value
		String month = "month"; // UTA: default value
		String type = "type"; // UTA: default value
		underTest.getTransactionsByMonthAndType(id, month, type);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AccessModeController
	 */
	private static AccessModeController mockAccessModeController18() throws Throwable {
		AccessModeController accessModeController = mock(AccessModeController.class);
		Customer loginResult = null; // UTA: provided value
		when(accessModeController.login(nullable(String.class), nullable(String.class))).thenReturn(loginResult);
		return accessModeController;
	}

	/**
	 * Parasoft Jtest UTA: Test for getTransactionsByToFromDate(Integer, String, String)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#getTransactionsByToFromDate(Integer, String, String)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = AuthenticationException.class)
	public void testGetTransactionsByToFromDate() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();
		MessageSource messageSourceValue = mockMessageSource19();
		ReflectionTestUtils.setField(underTest, "messageSource", messageSourceValue);

		// When
		Integer accountId = 0; // UTA: default value
		String fromDate = "fromDate"; // UTA: default value
		String toDate = "toDate"; // UTA: default value
		underTest.getTransactionsByToFromDate(accountId, fromDate, toDate);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of MessageSource
	 */
	private static MessageSource mockMessageSource19() throws Throwable {
		MessageSource messageSourceValue = mock(MessageSource.class);
		String getMessageResult = "getMessageResult"; // UTA: default value
		when(messageSourceValue.getMessage(nullable(String.class), nullable(Object[].class), nullable(Locale.class)))
				.thenReturn(getMessageResult);
		return messageSourceValue;
	}

	/**
	 * Parasoft Jtest UTA: Test for getTransactionsByToFromDate(Integer, String, String)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#getTransactionsByToFromDate(Integer, String, String)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = AuthenticationException.class)
	public void testGetTransactionsByToFromDate2() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();
		MessageSource messageSourceValue = mockMessageSource20();
		ReflectionTestUtils.setField(underTest, "messageSource", messageSourceValue);
		AccessModeController accessModeController = mockAccessModeController19();
		underTest.setAccessModeController(accessModeController);

		// When
		Integer accountId = 0; // UTA: default value
		String fromDate = "fromDate"; // UTA: default value
		String toDate = "toDate"; // UTA: default value
		underTest.getTransactionsByToFromDate(accountId, fromDate, toDate);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of MessageSource
	 */
	private static MessageSource mockMessageSource20() throws Throwable {
		MessageSource messageSourceValue = mock(MessageSource.class);
		String getMessageResult = "getMessageResult"; // UTA: default value
		when(messageSourceValue.getMessage(nullable(String.class), nullable(Object[].class), nullable(Locale.class)))
				.thenReturn(getMessageResult);
		return messageSourceValue;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AccessModeController
	 */
	private static AccessModeController mockAccessModeController19() throws Throwable {
		AccessModeController accessModeController = mock(AccessModeController.class);
		Customer loginResult = null; // UTA: provided value
		when(accessModeController.login(nullable(String.class), nullable(String.class))).thenReturn(loginResult);
		return accessModeController;
	}

	/**
	 * Parasoft Jtest UTA: Test for getTransactionsByToFromDate(Integer, String, String)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#getTransactionsByToFromDate(Integer, String, String)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = NoSuchMessageException.class)
	public void testGetTransactionsByToFromDate3() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();

		// When
		Integer accountId = 0; // UTA: default value
		String fromDate = "fromDate"; // UTA: default value
		String toDate = "toDate"; // UTA: default value
		underTest.getTransactionsByToFromDate(accountId, fromDate, toDate);

	}

	/**
	 * Parasoft Jtest UTA: Test for getTransactionsByToFromDate(Integer, String, String)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#getTransactionsByToFromDate(Integer, String, String)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = NoSuchMessageException.class)
	public void testGetTransactionsByToFromDate4() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();
		AccessModeController accessModeController = mockAccessModeController20();
		underTest.setAccessModeController(accessModeController);

		// When
		Integer accountId = 0; // UTA: default value
		String fromDate = "fromDate"; // UTA: default value
		String toDate = "toDate"; // UTA: default value
		underTest.getTransactionsByToFromDate(accountId, fromDate, toDate);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AccessModeController
	 */
	private static AccessModeController mockAccessModeController20() throws Throwable {
		AccessModeController accessModeController = mock(AccessModeController.class);
		Customer loginResult = null; // UTA: provided value
		when(accessModeController.login(nullable(String.class), nullable(String.class))).thenReturn(loginResult);
		return accessModeController;
	}

	/**
	 * Parasoft Jtest UTA: Test for getTransactionsOnDate(Integer, String)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#getTransactionsOnDate(Integer, String)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = AuthenticationException.class)
	public void testGetTransactionsOnDate() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();
		MessageSource messageSourceValue = mockMessageSource21();
		ReflectionTestUtils.setField(underTest, "messageSource", messageSourceValue);

		// When
		Integer accountId = 0; // UTA: default value
		String onDate = "onDate"; // UTA: default value
		underTest.getTransactionsOnDate(accountId, onDate);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of MessageSource
	 */
	private static MessageSource mockMessageSource21() throws Throwable {
		MessageSource messageSourceValue = mock(MessageSource.class);
		String getMessageResult = "getMessageResult"; // UTA: default value
		when(messageSourceValue.getMessage(nullable(String.class), nullable(Object[].class), nullable(Locale.class)))
				.thenReturn(getMessageResult);
		return messageSourceValue;
	}

	/**
	 * Parasoft Jtest UTA: Test for getTransactionsOnDate(Integer, String)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#getTransactionsOnDate(Integer, String)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = AuthenticationException.class)
	public void testGetTransactionsOnDate2() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();
		MessageSource messageSourceValue = mockMessageSource22();
		ReflectionTestUtils.setField(underTest, "messageSource", messageSourceValue);
		AccessModeController accessModeController = mockAccessModeController21();
		underTest.setAccessModeController(accessModeController);

		// When
		Integer accountId = 0; // UTA: default value
		String onDate = "onDate"; // UTA: default value
		underTest.getTransactionsOnDate(accountId, onDate);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of MessageSource
	 */
	private static MessageSource mockMessageSource22() throws Throwable {
		MessageSource messageSourceValue = mock(MessageSource.class);
		String getMessageResult = "getMessageResult"; // UTA: default value
		when(messageSourceValue.getMessage(nullable(String.class), nullable(Object[].class), nullable(Locale.class)))
				.thenReturn(getMessageResult);
		return messageSourceValue;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AccessModeController
	 */
	private static AccessModeController mockAccessModeController21() throws Throwable {
		AccessModeController accessModeController = mock(AccessModeController.class);
		Customer loginResult = null; // UTA: provided value
		when(accessModeController.login(nullable(String.class), nullable(String.class))).thenReturn(loginResult);
		return accessModeController;
	}

	/**
	 * Parasoft Jtest UTA: Test for getTransactionsOnDate(Integer, String)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#getTransactionsOnDate(Integer, String)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = NoSuchMessageException.class)
	public void testGetTransactionsOnDate3() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();

		// When
		Integer accountId = 0; // UTA: default value
		String onDate = "onDate"; // UTA: default value
		underTest.getTransactionsOnDate(accountId, onDate);

	}

	/**
	 * Parasoft Jtest UTA: Test for getTransactionsOnDate(Integer, String)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#getTransactionsOnDate(Integer, String)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = NoSuchMessageException.class)
	public void testGetTransactionsOnDate4() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();
		AccessModeController accessModeController = mockAccessModeController22();
		underTest.setAccessModeController(accessModeController);

		// When
		Integer accountId = 0; // UTA: default value
		String onDate = "onDate"; // UTA: default value
		underTest.getTransactionsOnDate(accountId, onDate);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AccessModeController
	 */
	private static AccessModeController mockAccessModeController22() throws Throwable {
		AccessModeController accessModeController = mock(AccessModeController.class);
		Customer loginResult = null; // UTA: provided value
		when(accessModeController.login(nullable(String.class), nullable(String.class))).thenReturn(loginResult);
		return accessModeController;
	}

	/**
	 * Parasoft Jtest UTA: Test for requestLoan(Integer, BigDecimal, BigDecimal, Integer)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#requestLoan(Integer, BigDecimal, BigDecimal, Integer)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = AuthenticationException.class)
	public void testRequestLoan() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();
		MessageSource messageSourceValue = mockMessageSource23();
		ReflectionTestUtils.setField(underTest, "messageSource", messageSourceValue);

		// When
		Integer customerId = 0; // UTA: default value
		BigDecimal amount = BigDecimal.ZERO; // UTA: default value
		BigDecimal downPayment = BigDecimal.ZERO; // UTA: default value
		Integer fromAccountId = 0; // UTA: default value
		underTest.requestLoan(customerId, amount, downPayment, fromAccountId);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of MessageSource
	 */
	private static MessageSource mockMessageSource23() throws Throwable {
		MessageSource messageSourceValue = mock(MessageSource.class);
		String getMessageResult = "getMessageResult"; // UTA: default value
		when(messageSourceValue.getMessage(nullable(String.class), nullable(Object[].class), nullable(Locale.class)))
				.thenReturn(getMessageResult);
		return messageSourceValue;
	}

	/**
	 * Parasoft Jtest UTA: Test for requestLoan(Integer, BigDecimal, BigDecimal, Integer)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#requestLoan(Integer, BigDecimal, BigDecimal, Integer)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = AuthenticationException.class)
	public void testRequestLoan2() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();
		MessageSource messageSourceValue = mockMessageSource24();
		ReflectionTestUtils.setField(underTest, "messageSource", messageSourceValue);
		AccessModeController accessModeController = mockAccessModeController23();
		underTest.setAccessModeController(accessModeController);

		// When
		Integer customerId = 0; // UTA: default value
		BigDecimal amount = BigDecimal.ZERO; // UTA: default value
		BigDecimal downPayment = BigDecimal.ZERO; // UTA: default value
		Integer fromAccountId = 0; // UTA: default value
		underTest.requestLoan(customerId, amount, downPayment, fromAccountId);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of MessageSource
	 */
	private static MessageSource mockMessageSource24() throws Throwable {
		MessageSource messageSourceValue = mock(MessageSource.class);
		String getMessageResult = "getMessageResult"; // UTA: default value
		when(messageSourceValue.getMessage(nullable(String.class), nullable(Object[].class), nullable(Locale.class)))
				.thenReturn(getMessageResult);
		return messageSourceValue;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AccessModeController
	 */
	private static AccessModeController mockAccessModeController23() throws Throwable {
		AccessModeController accessModeController = mock(AccessModeController.class);
		Customer loginResult = null; // UTA: provided value
		when(accessModeController.login(nullable(String.class), nullable(String.class))).thenReturn(loginResult);
		return accessModeController;
	}

	/**
	 * Parasoft Jtest UTA: Test for requestLoan(Integer, BigDecimal, BigDecimal, Integer)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#requestLoan(Integer, BigDecimal, BigDecimal, Integer)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = NoSuchMessageException.class)
	public void testRequestLoan3() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();

		// When
		Integer customerId = 0; // UTA: default value
		BigDecimal amount = BigDecimal.ZERO; // UTA: default value
		BigDecimal downPayment = BigDecimal.ZERO; // UTA: default value
		Integer fromAccountId = 0; // UTA: default value
		underTest.requestLoan(customerId, amount, downPayment, fromAccountId);

	}

	/**
	 * Parasoft Jtest UTA: Test for requestLoan(Integer, BigDecimal, BigDecimal, Integer)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#requestLoan(Integer, BigDecimal, BigDecimal, Integer)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = NoSuchMessageException.class)
	public void testRequestLoan4() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();
		AccessModeController accessModeController = mockAccessModeController24();
		underTest.setAccessModeController(accessModeController);

		// When
		Integer customerId = 0; // UTA: default value
		BigDecimal amount = BigDecimal.ZERO; // UTA: default value
		BigDecimal downPayment = BigDecimal.ZERO; // UTA: default value
		Integer fromAccountId = 0; // UTA: default value
		underTest.requestLoan(customerId, amount, downPayment, fromAccountId);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AccessModeController
	 */
	private static AccessModeController mockAccessModeController24() throws Throwable {
		AccessModeController accessModeController = mock(AccessModeController.class);
		Customer loginResult = null; // UTA: provided value
		when(accessModeController.login(nullable(String.class), nullable(String.class))).thenReturn(loginResult);
		return accessModeController;
	}

	/**
	 * Parasoft Jtest UTA: Test for setAdminManager(AdminManager)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#setAdminManager(AdminManager)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetAdminManager() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();

		// When
		AdminManager adminManager = mock(AdminManager.class);
		underTest.setAdminManager(adminManager);

		// Then - assertions for this instance of RestServiceProxyController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNull(underTest.getBankManager());

	}

	/**
	 * Parasoft Jtest UTA: Test for setServletContext(ServletContext)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#setServletContext(ServletContext)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetServletContext() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();

		// When
		ServletContext servletContext = mock(ServletContext.class);
		underTest.setServletContext(servletContext);

		// Then - assertions for this instance of RestServiceProxyController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNull(underTest.getBankManager());

	}

	/**
	 * Parasoft Jtest UTA: Test for transfer(Integer, Integer, BigDecimal)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#transfer(Integer, Integer, BigDecimal)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = AuthenticationException.class)
	public void testTransfer() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();
		MessageSource messageSourceValue = mockMessageSource25();
		ReflectionTestUtils.setField(underTest, "messageSource", messageSourceValue);

		// When
		Integer fromAccountId = 0; // UTA: default value
		Integer toAccountId = 0; // UTA: default value
		BigDecimal amount = BigDecimal.ZERO; // UTA: default value
		underTest.transfer(fromAccountId, toAccountId, amount);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of MessageSource
	 */
	private static MessageSource mockMessageSource25() throws Throwable {
		MessageSource messageSourceValue = mock(MessageSource.class);
		String getMessageResult = "getMessageResult"; // UTA: default value
		when(messageSourceValue.getMessage(nullable(String.class), nullable(Object[].class), nullable(Locale.class)))
				.thenReturn(getMessageResult);
		return messageSourceValue;
	}

	/**
	 * Parasoft Jtest UTA: Test for transfer(Integer, Integer, BigDecimal)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#transfer(Integer, Integer, BigDecimal)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = AuthenticationException.class)
	public void testTransfer2() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();
		MessageSource messageSourceValue = mockMessageSource26();
		ReflectionTestUtils.setField(underTest, "messageSource", messageSourceValue);
		AccessModeController accessModeController = mockAccessModeController25();
		underTest.setAccessModeController(accessModeController);

		// When
		Integer fromAccountId = 0; // UTA: default value
		Integer toAccountId = 0; // UTA: default value
		BigDecimal amount = BigDecimal.ZERO; // UTA: default value
		underTest.transfer(fromAccountId, toAccountId, amount);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of MessageSource
	 */
	private static MessageSource mockMessageSource26() throws Throwable {
		MessageSource messageSourceValue = mock(MessageSource.class);
		String getMessageResult = "getMessageResult"; // UTA: default value
		when(messageSourceValue.getMessage(nullable(String.class), nullable(Object[].class), nullable(Locale.class)))
				.thenReturn(getMessageResult);
		return messageSourceValue;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AccessModeController
	 */
	private static AccessModeController mockAccessModeController25() throws Throwable {
		AccessModeController accessModeController = mock(AccessModeController.class);
		Customer loginResult = null; // UTA: provided value
		when(accessModeController.login(nullable(String.class), nullable(String.class))).thenReturn(loginResult);
		return accessModeController;
	}

	/**
	 * Parasoft Jtest UTA: Test for transfer(Integer, Integer, BigDecimal)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#transfer(Integer, Integer, BigDecimal)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = NoSuchMessageException.class)
	public void testTransfer3() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();

		// When
		Integer fromAccountId = 0; // UTA: default value
		Integer toAccountId = 0; // UTA: default value
		BigDecimal amount = BigDecimal.ZERO; // UTA: default value
		underTest.transfer(fromAccountId, toAccountId, amount);

	}

	/**
	 * Parasoft Jtest UTA: Test for transfer(Integer, Integer, BigDecimal)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#transfer(Integer, Integer, BigDecimal)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = NoSuchMessageException.class)
	public void testTransfer4() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();
		AccessModeController accessModeController = mockAccessModeController26();
		underTest.setAccessModeController(accessModeController);

		// When
		Integer fromAccountId = 0; // UTA: default value
		Integer toAccountId = 0; // UTA: default value
		BigDecimal amount = BigDecimal.ZERO; // UTA: default value
		underTest.transfer(fromAccountId, toAccountId, amount);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AccessModeController
	 */
	private static AccessModeController mockAccessModeController26() throws Throwable {
		AccessModeController accessModeController = mock(AccessModeController.class);
		Customer loginResult = null; // UTA: provided value
		when(accessModeController.login(nullable(String.class), nullable(String.class))).thenReturn(loginResult);
		return accessModeController;
	}

	/**
	 * Parasoft Jtest UTA: Test for updateCustomer(Integer, String, String, String, String, String, String, String, String, String, String)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#updateCustomer(Integer, String, String, String, String, String, String, String, String, String, String)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = AuthenticationException.class)
	public void testUpdateCustomer() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();
		MessageSource messageSourceValue = mockMessageSource27();
		ReflectionTestUtils.setField(underTest, "messageSource", messageSourceValue);

		// When
		Integer customerId = 0; // UTA: default value
		String firstName = "firstName"; // UTA: default value
		String lastName = "lastName"; // UTA: default value
		String street = "street"; // UTA: default value
		String city = "city"; // UTA: default value
		String state = "state"; // UTA: default value
		String zipCode = "zipCode"; // UTA: default value
		String phoneNumber = "phoneNumber"; // UTA: default value
		String ssn = "ssn"; // UTA: default value
		String username = "username"; // UTA: default value
		String password = "password"; // UTA: default value
		underTest.updateCustomer(customerId, firstName, lastName, street, city, state, zipCode, phoneNumber, ssn,
				username, password);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of MessageSource
	 */
	private static MessageSource mockMessageSource27() throws Throwable {
		MessageSource messageSourceValue = mock(MessageSource.class);
		String getMessageResult = "getMessageResult"; // UTA: default value
		when(messageSourceValue.getMessage(nullable(String.class), nullable(Object[].class), nullable(Locale.class)))
				.thenReturn(getMessageResult);
		return messageSourceValue;
	}

	/**
	 * Parasoft Jtest UTA: Test for updateCustomer(Integer, String, String, String, String, String, String, String, String, String, String)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#updateCustomer(Integer, String, String, String, String, String, String, String, String, String, String)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = AuthenticationException.class)
	public void testUpdateCustomer2() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();
		MessageSource messageSourceValue = mockMessageSource28();
		ReflectionTestUtils.setField(underTest, "messageSource", messageSourceValue);
		AccessModeController accessModeController = mockAccessModeController27();
		underTest.setAccessModeController(accessModeController);

		// When
		Integer customerId = 0; // UTA: default value
		String firstName = "firstName"; // UTA: default value
		String lastName = "lastName"; // UTA: default value
		String street = "street"; // UTA: default value
		String city = "city"; // UTA: default value
		String state = "state"; // UTA: default value
		String zipCode = "zipCode"; // UTA: default value
		String phoneNumber = "phoneNumber"; // UTA: default value
		String ssn = "ssn"; // UTA: default value
		String username = "username"; // UTA: default value
		String password = "password"; // UTA: default value
		underTest.updateCustomer(customerId, firstName, lastName, street, city, state, zipCode, phoneNumber, ssn,
				username, password);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of MessageSource
	 */
	private static MessageSource mockMessageSource28() throws Throwable {
		MessageSource messageSourceValue = mock(MessageSource.class);
		String getMessageResult = "getMessageResult"; // UTA: default value
		when(messageSourceValue.getMessage(nullable(String.class), nullable(Object[].class), nullable(Locale.class)))
				.thenReturn(getMessageResult);
		return messageSourceValue;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AccessModeController
	 */
	private static AccessModeController mockAccessModeController27() throws Throwable {
		AccessModeController accessModeController = mock(AccessModeController.class);
		Customer loginResult = null; // UTA: provided value
		when(accessModeController.login(nullable(String.class), nullable(String.class))).thenReturn(loginResult);
		return accessModeController;
	}

	/**
	 * Parasoft Jtest UTA: Test for updateCustomer(Integer, String, String, String, String, String, String, String, String, String, String)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#updateCustomer(Integer, String, String, String, String, String, String, String, String, String, String)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = NoSuchMessageException.class)
	public void testUpdateCustomer3() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();

		// When
		Integer customerId = 0; // UTA: default value
		String firstName = "firstName"; // UTA: default value
		String lastName = "lastName"; // UTA: default value
		String street = "street"; // UTA: default value
		String city = "city"; // UTA: default value
		String state = "state"; // UTA: default value
		String zipCode = "zipCode"; // UTA: default value
		String phoneNumber = "phoneNumber"; // UTA: default value
		String ssn = "ssn"; // UTA: default value
		String username = "username"; // UTA: default value
		String password = "password"; // UTA: default value
		underTest.updateCustomer(customerId, firstName, lastName, street, city, state, zipCode, phoneNumber, ssn,
				username, password);

	}

	/**
	 * Parasoft Jtest UTA: Test for updateCustomer(Integer, String, String, String, String, String, String, String, String, String, String)
	 *
	 * @see com.parasoft.parabank.web.controller.RestServiceProxyController#updateCustomer(Integer, String, String, String, String, String, String, String, String, String, String)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = NoSuchMessageException.class)
	public void testUpdateCustomer4() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();
		AccessModeController accessModeController = mockAccessModeController28();
		underTest.setAccessModeController(accessModeController);

		// When
		Integer customerId = 0; // UTA: default value
		String firstName = "firstName"; // UTA: default value
		String lastName = "lastName"; // UTA: default value
		String street = "street"; // UTA: default value
		String city = "city"; // UTA: default value
		String state = "state"; // UTA: default value
		String zipCode = "zipCode"; // UTA: default value
		String phoneNumber = "phoneNumber"; // UTA: default value
		String ssn = "ssn"; // UTA: default value
		String username = "username"; // UTA: default value
		String password = "password"; // UTA: default value
		underTest.updateCustomer(customerId, firstName, lastName, street, city, state, zipCode, phoneNumber, ssn,
				username, password);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AccessModeController
	 */
	private static AccessModeController mockAccessModeController28() throws Throwable {
		AccessModeController accessModeController = mock(AccessModeController.class);
		Customer loginResult = null; // UTA: provided value
		when(accessModeController.login(nullable(String.class), nullable(String.class))).thenReturn(loginResult);
		return accessModeController;
	}

	/**
	 * Parasoft Jtest UTA: Test for getApplicationContext()
	 *
	 * @see com.parasoft.parabank.web.controller.AbstractBankController#getApplicationContext()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetApplicationContext() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();

		// When
		ApplicationContext result = underTest.getApplicationContext();

		// Then - assertions for result of method getApplicationContext()
		assertNull(result);

		// Then - assertions for this instance of RestServiceProxyController
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNull(underTest.getBankManager());

	}

	/**
	 * Parasoft Jtest UTA: Test for getBankManager()
	 *
	 * @see com.parasoft.parabank.web.controller.AbstractBankController#getBankManager()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetBankManager() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();

		// When
		BankManager result = underTest.getBankManager();

		// Then - assertions for result of method getBankManager()
		assertNull(result);

		// Then - assertions for this instance of RestServiceProxyController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());

	}

	/**
	 * Parasoft Jtest UTA: Test for getCommand(Model)
	 *
	 * @see com.parasoft.parabank.web.controller.AbstractBankController#getCommand(Model)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetCommand() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();

		// When
		Model model = mock(Model.class);
		Object result = underTest.getCommand(model);

		// Then - assertions for result of method getCommand(Model)
		assertNull(result);

		// Then - assertions for this instance of RestServiceProxyController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getBankManager());

	}

	/**
	 * Parasoft Jtest UTA: Test for getCommandClass()
	 *
	 * @see com.parasoft.parabank.web.controller.AbstractBankController#getCommandClass()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetCommandClass() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();

		// When
		Class<?> result = underTest.getCommandClass();

		// Then - assertions for result of method getCommandClass()
		assertNull(result);

		// Then - assertions for this instance of RestServiceProxyController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getBankManager());

	}

	/**
	 * Parasoft Jtest UTA: Test for getFormView()
	 *
	 * @see com.parasoft.parabank.web.controller.AbstractBankController#getFormView()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetFormView() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();

		// When
		String result = underTest.getFormView();

		// Then - assertions for result of method getFormView()
		assertNull(result);

		// Then - assertions for this instance of RestServiceProxyController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNull(underTest.getBankManager());

	}

	/**
	 * Parasoft Jtest UTA: Test for prepCommand(Model, T)
	 *
	 * @see com.parasoft.parabank.web.controller.AbstractBankController#prepCommand(Model, T)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testPrepCommand() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();
		String aCommandName = "aCommandName"; // UTA: default value
		underTest.setCommandName(aCommandName);

		// When
		Model model = mock(Model.class);
		Object command = new Object(); // UTA: default value
		Object result = underTest.prepCommand(model, command);

		// Then - assertions for result of method prepCommand(Model, Object)
		assertNotNull(result);

		// Then - assertions for this instance of RestServiceProxyController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertEquals("aCommandName", underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNull(underTest.getBankManager());

	}

	/**
	 * Parasoft Jtest UTA: Test for prepForm(Model)
	 *
	 * @see com.parasoft.parabank.web.controller.AbstractBankController#prepForm(Model)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testPrepForm() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();
		Class aCommandClass = Class.forName("java.lang.Object"); // UTA: default value
		underTest.setCommandClass(aCommandClass);
		String aCommandName = "aCommandName"; // UTA: default value
		underTest.setCommandName(aCommandName);
		String aFormView = "aFormView"; // UTA: default value
		underTest.setFormView(aFormView);

		// When
		Model model = null; // UTA: provided value
		ModelAndView result = underTest.prepForm(model);

		// Then - assertions for result of method prepForm(Model)
		assertNotNull(result);

		// Then - assertions for this instance of RestServiceProxyController
		assertNull(underTest.getApplicationContext());
		assertEquals("aFormView", underTest.getFormView());
		assertEquals("aCommandName", underTest.getCommandName());
		assertEquals(java.lang.Object.class, underTest.getCommandClass());
		assertNull(underTest.getBankManager());

	}

	/**
	 * Parasoft Jtest UTA: Test for prepForm(Model)
	 *
	 * @see com.parasoft.parabank.web.controller.AbstractBankController#prepForm(Model)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testPrepForm2() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();
		Class aCommandClass = Class.forName("java.lang.Object"); // UTA: default value
		underTest.setCommandClass(aCommandClass);
		String aCommandName = "aCommandName"; // UTA: default value
		underTest.setCommandName(aCommandName);
		String aFormView = "aFormView"; // UTA: default value
		underTest.setFormView(aFormView);

		// When
		Model model = mockModel();
		ModelAndView result = underTest.prepForm(model);

		// Then - assertions for result of method prepForm(Model)
		assertNotNull(result);

		// Then - assertions for this instance of RestServiceProxyController
		assertNull(underTest.getApplicationContext());
		assertEquals("aFormView", underTest.getFormView());
		assertEquals("aCommandName", underTest.getCommandName());
		assertEquals(java.lang.Object.class, underTest.getCommandClass());
		assertNull(underTest.getBankManager());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of Model
	 */
	private static Model mockModel() throws Throwable {
		Model model = mock(Model.class);
		Map<String, Object> asMapResult = new HashMap<String, Object>(); // UTA: default value
		String key = "key"; // UTA: default value
		Object value = new Object(); // UTA: default value
		asMapResult.put(key, value);
		doReturn(asMapResult).when(model).asMap();
		return model;
	}

	/**
	 * Parasoft Jtest UTA: Test for setApplicationContext(ApplicationContext)
	 *
	 * @see com.parasoft.parabank.web.controller.AbstractBankController#setApplicationContext(ApplicationContext)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetApplicationContext() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();

		// When
		ApplicationContext aApplicationContext = mock(ApplicationContext.class);
		underTest.setApplicationContext(aApplicationContext);

		// Then - assertions for this instance of RestServiceProxyController
		assertNotNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNull(underTest.getBankManager());

	}

	/**
	 * Parasoft Jtest UTA: Test for setBankManager(BankManager)
	 *
	 * @see com.parasoft.parabank.web.controller.AbstractBankController#setBankManager(BankManager)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetBankManager() throws Throwable {
		// Given
		RestServiceProxyController underTest = new RestServiceProxyController();

		// When
		BankManager bankManager = mock(BankManager.class);
		underTest.setBankManager(bankManager);

		// Then - assertions for this instance of RestServiceProxyController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNotNull(underTest.getBankManager());

	}

}