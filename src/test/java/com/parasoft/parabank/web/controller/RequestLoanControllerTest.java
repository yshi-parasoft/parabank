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
import com.parasoft.parabank.domain.Customer;
import com.parasoft.parabank.domain.LoanResponse;
import com.parasoft.parabank.domain.logic.AdminManager;
import com.parasoft.parabank.domain.logic.BankManager;
import com.parasoft.parabank.util.AccessModeController;
import com.parasoft.parabank.web.UserSession;
import com.parasoft.parabank.web.form.RequestLoanForm;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.servlet.ModelAndView;

/**
 * Parasoft Jtest UTA: Test class for RequestLoanController
 *
 * @see com.parasoft.parabank.web.controller.RequestLoanController
 * @author devtest
 */
public class RequestLoanControllerTest {

	/**
	 * Parasoft Jtest UTA: Test for getAccountIds(UserSession)
	 *
	 * @see com.parasoft.parabank.web.controller.RequestLoanController#getAccountIds(UserSession)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetAccountIds() throws Throwable {
		// Given
		RequestLoanController underTest = new RequestLoanController();
		BankManager bankManagerValue = mockBankManager();
		underTest.bankManager = bankManagerValue;

		// When
		UserSession userSession = mock(UserSession.class);
		List<Integer> result = underTest.getAccountIds(userSession);

		// Then - assertions for argument 1 of method getAccountIds(UserSession)
		assertNull(userSession.getCustomer());

		// Then - assertions for result of method getAccountIds(UserSession)
		assertNotNull(result);
		assertEquals(0, result.size());

		// Then - assertions for this instance of RequestLoanController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNotNull(underTest.getBankManager());
		assertNull(underTest.getValidator());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of BankManager
	 */
	private static BankManager mockBankManager() throws Throwable {
		BankManager bankManagerValue = mock(BankManager.class);
		List<Account> getAccountsForCustomerResult = new ArrayList<Account>(); // UTA: default value
		doReturn(getAccountsForCustomerResult).when(bankManagerValue).getAccountsForCustomer(nullable(Customer.class));
		return bankManagerValue;
	}

	/**
	 * Parasoft Jtest UTA: Test for getAccountIds(UserSession)
	 *
	 * @see com.parasoft.parabank.web.controller.RequestLoanController#getAccountIds(UserSession)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetAccountIds2() throws Throwable {
		// Given
		RequestLoanController underTest = new RequestLoanController();
		BankManager bankManagerValue = mockBankManager2();
		underTest.bankManager = bankManagerValue;

		// When
		UserSession userSession = mock(UserSession.class);
		List<Integer> result = underTest.getAccountIds(userSession);

		// Then - assertions for argument 1 of method getAccountIds(UserSession)
		assertNull(userSession.getCustomer());

		// Then - assertions for result of method getAccountIds(UserSession)
		assertNotNull(result);
		assertEquals(1, result.size());

		// Then - assertions for this instance of RequestLoanController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNotNull(underTest.getBankManager());
		assertNull(underTest.getValidator());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of BankManager
	 */
	private static BankManager mockBankManager2() throws Throwable {
		BankManager bankManagerValue = mock(BankManager.class);
		List<Account> getAccountsForCustomerResult = new ArrayList<Account>(); // UTA: default value
		Account item = mock(Account.class);
		getAccountsForCustomerResult.add(item);
		doReturn(getAccountsForCustomerResult).when(bankManagerValue).getAccountsForCustomer(nullable(Customer.class));
		return bankManagerValue;
	}

	/**
	 * Parasoft Jtest UTA: Test for getCustomerId(UserSession)
	 *
	 * @see com.parasoft.parabank.web.controller.RequestLoanController#getCustomerId(UserSession)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetCustomerId() throws Throwable {
		// Given
		RequestLoanController underTest = new RequestLoanController();

		// When
		UserSession userSession = mockUserSession();
		int result = underTest.getCustomerId(userSession);

		// Then - assertions for argument 1 of method getCustomerId(UserSession)
		assertNull(userSession.getCustomer());

		// Then - assertions for result of method getCustomerId(UserSession)
		assertEquals(0, result);

		// Then - assertions for this instance of RequestLoanController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNull(underTest.getBankManager());
		assertNull(underTest.getValidator());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of UserSession
	 */
	private static UserSession mockUserSession() throws Throwable {
		UserSession userSession = mock(UserSession.class);
		Customer getCustomerResult = mock(Customer.class);
		when(userSession.getCustomer()).thenReturn(getCustomerResult);
		return userSession;
	}

	/**
	 * Parasoft Jtest UTA: Test for getRequestLoanForm(Model)
	 *
	 * @see com.parasoft.parabank.web.controller.RequestLoanController#getRequestLoanForm(Model)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetRequestLoanForm() throws Throwable {
		// Given
		RequestLoanController underTest = new RequestLoanController();
		Class aCommandClass = Class.forName("java.lang.Object"); // UTA: default value
		underTest.setCommandClass(aCommandClass);
		String aCommandName = "aCommandName"; // UTA: default value
		underTest.setCommandName(aCommandName);
		String aFormView = "aFormView"; // UTA: default value
		underTest.setFormView(aFormView);

		// When
		Model model = null; // UTA: provided value
		ModelAndView result = underTest.getRequestLoanForm(model);

		// Then - assertions for result of method getRequestLoanForm(Model)
		assertNotNull(result);

		// Then - assertions for this instance of RequestLoanController
		assertNull(underTest.getApplicationContext());
		assertEquals("aFormView", underTest.getFormView());
		assertEquals("aCommandName", underTest.getCommandName());
		assertEquals(java.lang.Object.class, underTest.getCommandClass());
		assertNull(underTest.getBankManager());
		assertNull(underTest.getValidator());

	}

	/**
	 * Parasoft Jtest UTA: Test for getRequestLoanForm(Model)
	 *
	 * @see com.parasoft.parabank.web.controller.RequestLoanController#getRequestLoanForm(Model)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetRequestLoanForm2() throws Throwable {
		// Given
		RequestLoanController underTest = new RequestLoanController();
		Class aCommandClass = Class.forName("java.lang.Object"); // UTA: default value
		underTest.setCommandClass(aCommandClass);
		String aCommandName = "aCommandName"; // UTA: default value
		underTest.setCommandName(aCommandName);
		String aFormView = "aFormView"; // UTA: default value
		underTest.setFormView(aFormView);

		// When
		Model model = mockModel();
		ModelAndView result = underTest.getRequestLoanForm(model);

		// Then - assertions for result of method getRequestLoanForm(Model)
		assertNotNull(result);

		// Then - assertions for this instance of RequestLoanController
		assertNull(underTest.getApplicationContext());
		assertEquals("aFormView", underTest.getFormView());
		assertEquals("aCommandName", underTest.getCommandName());
		assertEquals(java.lang.Object.class, underTest.getCommandClass());
		assertNull(underTest.getBankManager());
		assertNull(underTest.getValidator());

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
	 * Parasoft Jtest UTA: Test for onSubmit(RequestLoanForm, BindingResult, UserSession)
	 *
	 * @see com.parasoft.parabank.web.controller.RequestLoanController#onSubmit(RequestLoanForm, BindingResult, UserSession)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testOnSubmit() throws Throwable {
		// Given
		RequestLoanController underTest = new RequestLoanController();
		String aFormView = "aFormView"; // UTA: default value
		underTest.setFormView(aFormView);

		// When
		RequestLoanForm requestLoanForm = mock(RequestLoanForm.class);
		BindingResult errors = mockBindingResult();
		UserSession userSession = mock(UserSession.class);
		ModelAndView result = underTest.onSubmit(requestLoanForm, errors, userSession);

		// Then - assertions for argument 3 of method onSubmit(RequestLoanForm, BindingResult, UserSession)
		assertNull(userSession.getCustomer());

		// Then - assertions for argument 1 of method onSubmit(RequestLoanForm, BindingResult, UserSession)
		assertNull(requestLoanForm.getAmount());
		assertNull(requestLoanForm.getDownPayment());
		assertEquals(0, requestLoanForm.getFromAccountId());

		// Then - assertions for result of method onSubmit(RequestLoanForm, BindingResult, UserSession)
		assertNotNull(result);

		// Then - assertions for this instance of RequestLoanController
		assertNull(underTest.getApplicationContext());
		assertEquals("aFormView", underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNull(underTest.getBankManager());
		assertNull(underTest.getValidator());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of BindingResult
	 */
	private static BindingResult mockBindingResult() throws Throwable {
		BindingResult errors = mock(BindingResult.class);
		Map<String, Object> getModelResult = new HashMap<String, Object>(); // UTA: default value
		String key = "key"; // UTA: default value
		Object value = new Object(); // UTA: default value
		getModelResult.put(key, value);
		doReturn(getModelResult).when(errors).getModel();

		boolean hasErrorsResult = true; // UTA: provided value
		when(errors.hasErrors()).thenReturn(hasErrorsResult);
		return errors;
	}

	/**
	 * Parasoft Jtest UTA: Test for onSubmit(RequestLoanForm, BindingResult, UserSession)
	 *
	 * @see com.parasoft.parabank.web.controller.RequestLoanController#onSubmit(RequestLoanForm, BindingResult, UserSession)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testOnSubmit2() throws Throwable {
		// Given
		RequestLoanController underTest = new RequestLoanController();
		BankManager bankManagerValue = mockBankManager3();
		underTest.bankManager = bankManagerValue;

		// When
		RequestLoanForm requestLoanForm = mock(RequestLoanForm.class);
		BindingResult errors = mockBindingResult2();
		UserSession userSession = mockUserSession2();
		ModelAndView result = underTest.onSubmit(requestLoanForm, errors, userSession);

		// Then - assertions for argument 3 of method onSubmit(RequestLoanForm, BindingResult, UserSession)
		assertNull(userSession.getCustomer());

		// Then - assertions for argument 1 of method onSubmit(RequestLoanForm, BindingResult, UserSession)
		assertNull(requestLoanForm.getAmount());
		assertNull(requestLoanForm.getDownPayment());
		assertEquals(0, requestLoanForm.getFromAccountId());

		// Then - assertions for result of method onSubmit(RequestLoanForm, BindingResult, UserSession)
		assertNotNull(result);

		// Then - assertions for this instance of RequestLoanController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNotNull(underTest.getBankManager());
		assertNull(underTest.getValidator());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of BankManager
	 */
	private static BankManager mockBankManager3() throws Throwable {
		BankManager bankManagerValue = mock(BankManager.class);
		LoanResponse requestLoanResult = mock(LoanResponse.class);
		when(bankManagerValue.requestLoan(anyInt(), nullable(BigDecimal.class), nullable(BigDecimal.class), anyInt()))
				.thenReturn(requestLoanResult);
		return bankManagerValue;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of BindingResult
	 */
	private static BindingResult mockBindingResult2() throws Throwable {
		BindingResult errors = mock(BindingResult.class);
		boolean hasErrorsResult = false; // UTA: provided value
		when(errors.hasErrors()).thenReturn(hasErrorsResult);
		return errors;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of UserSession
	 */
	private static UserSession mockUserSession2() throws Throwable {
		UserSession userSession = mock(UserSession.class);
		Customer getCustomerResult = mock(Customer.class);
		when(userSession.getCustomer()).thenReturn(getCustomerResult);
		return userSession;
	}

	/**
	 * Parasoft Jtest UTA: Test for onSubmit(RequestLoanForm, BindingResult, UserSession)
	 *
	 * @see com.parasoft.parabank.web.controller.RequestLoanController#onSubmit(RequestLoanForm, BindingResult, UserSession)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testOnSubmit3() throws Throwable {
		// Given
		RequestLoanController underTest = new RequestLoanController();
		BankManager bankManagerValue = mockBankManager4();
		underTest.bankManager = bankManagerValue;
		AdminManager adminManager = mockAdminManager();
		underTest.setAdminManager(adminManager);

		// When
		RequestLoanForm requestLoanForm = mock(RequestLoanForm.class);
		BindingResult errors = mockBindingResult3();
		UserSession userSession = mockUserSession3();
		ModelAndView result = underTest.onSubmit(requestLoanForm, errors, userSession);

		// Then - assertions for argument 3 of method onSubmit(RequestLoanForm, BindingResult, UserSession)
		assertNull(userSession.getCustomer());

		// Then - assertions for argument 1 of method onSubmit(RequestLoanForm, BindingResult, UserSession)
		assertNull(requestLoanForm.getAmount());
		assertNull(requestLoanForm.getDownPayment());
		assertEquals(0, requestLoanForm.getFromAccountId());

		// Then - assertions for result of method onSubmit(RequestLoanForm, BindingResult, UserSession)
		assertNotNull(result);

		// Then - assertions for this instance of RequestLoanController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNotNull(underTest.getBankManager());
		assertNull(underTest.getValidator());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of BankManager
	 */
	private static BankManager mockBankManager4() throws Throwable {
		BankManager bankManagerValue = mock(BankManager.class);
		LoanResponse requestLoanResult = mock(LoanResponse.class);
		when(bankManagerValue.requestLoan(anyInt(), nullable(BigDecimal.class), nullable(BigDecimal.class), anyInt()))
				.thenReturn(requestLoanResult);
		return bankManagerValue;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AdminManager
	 */
	private static AdminManager mockAdminManager() throws Throwable {
		AdminManager adminManager = mock(AdminManager.class);
		String getParameterResult = null; // UTA: provided value
		when(adminManager.getParameter(nullable(String.class))).thenReturn(getParameterResult);
		return adminManager;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of BindingResult
	 */
	private static BindingResult mockBindingResult3() throws Throwable {
		BindingResult errors = mock(BindingResult.class);
		boolean hasErrorsResult = false; // UTA: provided value
		when(errors.hasErrors()).thenReturn(hasErrorsResult);
		return errors;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of UserSession
	 */
	private static UserSession mockUserSession3() throws Throwable {
		UserSession userSession = mock(UserSession.class);
		Customer getCustomerResult = mock(Customer.class);
		when(userSession.getCustomer()).thenReturn(getCustomerResult);
		return userSession;
	}

	/**
	 * Parasoft Jtest UTA: Test for onSubmit(RequestLoanForm, BindingResult, UserSession)
	 *
	 * @see com.parasoft.parabank.web.controller.RequestLoanController#onSubmit(RequestLoanForm, BindingResult, UserSession)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testOnSubmit4() throws Throwable {
		// Given
		RequestLoanController underTest = new RequestLoanController();
		AccessModeController accessModeController = mockAccessModeController();
		underTest.setAccessModeController(accessModeController);
		AdminManager adminManager = mockAdminManager2();
		underTest.setAdminManager(adminManager);

		// When
		RequestLoanForm requestLoanForm = mock(RequestLoanForm.class);
		BindingResult errors = mockBindingResult4();
		UserSession userSession = mockUserSession4();
		ModelAndView result = underTest.onSubmit(requestLoanForm, errors, userSession);

		// Then - assertions for argument 3 of method onSubmit(RequestLoanForm, BindingResult, UserSession)
		assertNull(userSession.getCustomer());

		// Then - assertions for argument 1 of method onSubmit(RequestLoanForm, BindingResult, UserSession)
		assertNull(requestLoanForm.getAmount());
		assertNull(requestLoanForm.getDownPayment());
		assertEquals(0, requestLoanForm.getFromAccountId());

		// Then - assertions for result of method onSubmit(RequestLoanForm, BindingResult, UserSession)
		assertNotNull(result);

		// Then - assertions for this instance of RequestLoanController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNull(underTest.getBankManager());
		assertNull(underTest.getValidator());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AccessModeController
	 */
	private static AccessModeController mockAccessModeController() throws Throwable {
		AccessModeController accessModeController = mock(AccessModeController.class);
		LoanResponse doRequestLoanResult = mock(LoanResponse.class);
		when(accessModeController.doRequestLoan(anyInt(), nullable(BigDecimal.class), nullable(BigDecimal.class),
				anyInt())).thenReturn(doRequestLoanResult);
		return accessModeController;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AdminManager
	 */
	private static AdminManager mockAdminManager2() throws Throwable {
		AdminManager adminManager = mock(AdminManager.class);
		String getParameterResult = ""; // UTA: provided value
		when(adminManager.getParameter(nullable(String.class))).thenReturn(getParameterResult);
		return adminManager;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of BindingResult
	 */
	private static BindingResult mockBindingResult4() throws Throwable {
		BindingResult errors = mock(BindingResult.class);
		boolean hasErrorsResult = false; // UTA: provided value
		when(errors.hasErrors()).thenReturn(hasErrorsResult);
		return errors;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of UserSession
	 */
	private static UserSession mockUserSession4() throws Throwable {
		UserSession userSession = mock(UserSession.class);
		Customer getCustomerResult = mock(Customer.class);
		when(userSession.getCustomer()).thenReturn(getCustomerResult);
		return userSession;
	}

	/**
	 * Parasoft Jtest UTA: Test for setAccessModeController(AccessModeController)
	 *
	 * @see com.parasoft.parabank.web.controller.RequestLoanController#setAccessModeController(AccessModeController)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetAccessModeController() throws Throwable {
		// Given
		RequestLoanController underTest = new RequestLoanController();

		// When
		AccessModeController accessModeController = mock(AccessModeController.class);
		underTest.setAccessModeController(accessModeController);

		// Then - assertions for this instance of RequestLoanController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNull(underTest.getBankManager());
		assertNull(underTest.getValidator());

	}

	/**
	 * Parasoft Jtest UTA: Test for setValidator(Validator)
	 *
	 * @see com.parasoft.parabank.web.controller.RequestLoanController#setValidator(Validator)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetValidator() throws Throwable {
		// Given
		RequestLoanController underTest = new RequestLoanController();

		// When
		Validator aValidator = mock(Validator.class);
		underTest.setValidator(aValidator);

		// Then - assertions for this instance of RequestLoanController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNull(underTest.getBankManager());
		assertNotNull(underTest.getValidator());

	}

	/**
	 * Parasoft Jtest UTA: Test for getValidator()
	 *
	 * @see com.parasoft.parabank.web.controller.AbstractValidatingBankController#getValidator()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetValidator() throws Throwable {
		// Given
		RequestLoanController underTest = new RequestLoanController();

		// When
		Validator result = underTest.getValidator();

		// Then - assertions for result of method getValidator()
		assertNull(result);

		// Then - assertions for this instance of RequestLoanController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNull(underTest.getBankManager());

	}

	/**
	 * Parasoft Jtest UTA: Test for initBinder(WebDataBinder)
	 *
	 * @see com.parasoft.parabank.web.controller.AbstractValidatingBankController#initBinder(WebDataBinder)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testInitBinder() throws Throwable {
		// Given
		RequestLoanController underTest = new RequestLoanController();

		// When
		WebDataBinder binder = mock(WebDataBinder.class);
		underTest.initBinder(binder);

		// Then - assertions for this instance of RequestLoanController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNull(underTest.getBankManager());
		assertNull(underTest.getValidator());

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
		RequestLoanController underTest = new RequestLoanController();

		// When
		ApplicationContext result = underTest.getApplicationContext();

		// Then - assertions for result of method getApplicationContext()
		assertNull(result);

		// Then - assertions for this instance of RequestLoanController
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNull(underTest.getBankManager());
		assertNull(underTest.getValidator());

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
		RequestLoanController underTest = new RequestLoanController();

		// When
		BankManager result = underTest.getBankManager();

		// Then - assertions for result of method getBankManager()
		assertNull(result);

		// Then - assertions for this instance of RequestLoanController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNull(underTest.getValidator());

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
		RequestLoanController underTest = new RequestLoanController();

		// When
		Model model = mock(Model.class);
		Object result = underTest.getCommand(model);

		// Then - assertions for result of method getCommand(Model)
		assertNull(result);

		// Then - assertions for this instance of RequestLoanController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getBankManager());
		assertNull(underTest.getValidator());

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
		RequestLoanController underTest = new RequestLoanController();
		String aCommandName = "aCommandName"; // UTA: default value
		underTest.setCommandName(aCommandName);

		// When
		Model model = mock(Model.class);
		Object command = new Object(); // UTA: default value
		Object result = underTest.prepCommand(model, command);

		// Then - assertions for result of method prepCommand(Model, Object)
		assertNotNull(result);

		// Then - assertions for this instance of RequestLoanController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertEquals("aCommandName", underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNull(underTest.getBankManager());
		assertNull(underTest.getValidator());

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
		RequestLoanController underTest = new RequestLoanController();

		// When
		ApplicationContext aApplicationContext = mock(ApplicationContext.class);
		underTest.setApplicationContext(aApplicationContext);

		// Then - assertions for this instance of RequestLoanController
		assertNotNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNull(underTest.getBankManager());
		assertNull(underTest.getValidator());

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
		RequestLoanController underTest = new RequestLoanController();

		// When
		BankManager bankManager = mock(BankManager.class);
		underTest.setBankManager(bankManager);

		// Then - assertions for this instance of RequestLoanController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNotNull(underTest.getBankManager());
		assertNull(underTest.getValidator());

	}
}