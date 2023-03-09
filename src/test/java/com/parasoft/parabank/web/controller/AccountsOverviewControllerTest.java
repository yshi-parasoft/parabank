/**
 * 
 */
package com.parasoft.parabank.web.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.ArgumentMatchers.nullable;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.parasoft.parabank.domain.Account;
import com.parasoft.parabank.domain.Customer;
import com.parasoft.parabank.domain.logic.AdminManager;
import com.parasoft.parabank.domain.logic.BankManager;
import com.parasoft.parabank.util.AccessModeController;
import com.parasoft.parabank.web.UserSession;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

/**
 * Parasoft Jtest UTA: Test class for AccountsOverviewController
 *
 * @see com.parasoft.parabank.web.controller.AccountsOverviewController
 * @author devtest
 */
public class AccountsOverviewControllerTest {

	/**
	 * Parasoft Jtest UTA: Test for handleRequest(UserSession)
	 *
	 * @see com.parasoft.parabank.web.controller.AccountsOverviewController#handleRequest(UserSession)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testHandleRequest() throws Throwable {
		// Given
		AccountsOverviewController underTest = new AccountsOverviewController();
		BankManager bankManagerValue = mockBankManager();
		underTest.bankManager = bankManagerValue;

		// When
		UserSession userSession = mockUserSession();
		ModelAndView result = underTest.handleRequest(userSession);

		// Then - assertions for argument 1 of method handleRequest(UserSession)
		assertNull(userSession.getCustomer());

		// Then - assertions for result of method handleRequest(UserSession)
		assertNotNull(result);

		// Then - assertions for this instance of AccountsOverviewController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNotNull(underTest.getBankManager());

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
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of UserSession
	 */
	private static UserSession mockUserSession() throws Throwable {
		UserSession userSession = mock(UserSession.class);
		Customer getCustomerResult = mock(Customer.class);
		when(userSession.getCustomer()).thenReturn(getCustomerResult);
		return userSession;
	}

	/**
	 * Parasoft Jtest UTA: Test for handleRequest(UserSession)
	 *
	 * @see com.parasoft.parabank.web.controller.AccountsOverviewController#handleRequest(UserSession)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testHandleRequest2() throws Throwable {
		// Given
		AccountsOverviewController underTest = new AccountsOverviewController();
		BankManager bankManagerValue = mockBankManager2();
		underTest.bankManager = bankManagerValue;
		AdminManager adminManager = mockAdminManager();
		underTest.setAdminManager(adminManager);

		// When
		UserSession userSession = mockUserSession2();
		ModelAndView result = underTest.handleRequest(userSession);

		// Then - assertions for argument 1 of method handleRequest(UserSession)
		assertNull(userSession.getCustomer());

		// Then - assertions for result of method handleRequest(UserSession)
		assertNotNull(result);

		// Then - assertions for this instance of AccountsOverviewController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNotNull(underTest.getBankManager());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of BankManager
	 */
	private static BankManager mockBankManager2() throws Throwable {
		BankManager bankManagerValue = mock(BankManager.class);
		List<Account> getAccountsForCustomerResult = new ArrayList<Account>(); // UTA: default value
		doReturn(getAccountsForCustomerResult).when(bankManagerValue).getAccountsForCustomer(nullable(Customer.class));
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
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of UserSession
	 */
	private static UserSession mockUserSession2() throws Throwable {
		UserSession userSession = mock(UserSession.class);
		Customer getCustomerResult = mock(Customer.class);
		when(userSession.getCustomer()).thenReturn(getCustomerResult);
		return userSession;
	}

	/**
	 * Parasoft Jtest UTA: Test for handleRequest(UserSession)
	 *
	 * @see com.parasoft.parabank.web.controller.AccountsOverviewController#handleRequest(UserSession)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testHandleRequest3() throws Throwable {
		// Given
		AccountsOverviewController underTest = new AccountsOverviewController();
		AccessModeController accessModeController = mockAccessModeController();
		underTest.setAccessModeController(accessModeController);
		AdminManager adminManager = mockAdminManager2();
		underTest.setAdminManager(adminManager);

		// When
		UserSession userSession = mockUserSession3();
		ModelAndView result = underTest.handleRequest(userSession);

		// Then - assertions for argument 1 of method handleRequest(UserSession)
		assertNull(userSession.getCustomer());

		// Then - assertions for result of method handleRequest(UserSession)
		assertNotNull(result);

		// Then - assertions for this instance of AccountsOverviewController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNull(underTest.getBankManager());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AccessModeController
	 */
	private static AccessModeController mockAccessModeController() throws Throwable {
		AccessModeController accessModeController = mock(AccessModeController.class);
		List<Account> doGetAccountsResult = new ArrayList<Account>(); // UTA: default value
		doReturn(doGetAccountsResult).when(accessModeController).doGetAccounts(nullable(Customer.class));
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
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of UserSession
	 */
	private static UserSession mockUserSession3() throws Throwable {
		UserSession userSession = mock(UserSession.class);
		Customer getCustomerResult = mock(Customer.class);
		when(userSession.getCustomer()).thenReturn(getCustomerResult);
		return userSession;
	}

	/**
	 * Parasoft Jtest UTA: Test for handleRequest(UserSession)
	 *
	 * @see com.parasoft.parabank.web.controller.AccountsOverviewController#handleRequest(UserSession)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testHandleRequest4() throws Throwable {
		// Given
		AccountsOverviewController underTest = new AccountsOverviewController();
		BankManager bankManagerValue = mockBankManager3();
		underTest.bankManager = bankManagerValue;

		// When
		UserSession userSession = mockUserSession4();
		ModelAndView result = underTest.handleRequest(userSession);

		// Then - assertions for argument 1 of method handleRequest(UserSession)
		assertNull(userSession.getCustomer());

		// Then - assertions for result of method handleRequest(UserSession)
		assertNotNull(result);

		// Then - assertions for this instance of AccountsOverviewController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNotNull(underTest.getBankManager());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of Account
	 */
	private static Account mockAccount() throws Throwable {
		Account item = mock(Account.class);
		BigDecimal getAvailableBalanceResult = BigDecimal.ZERO; // UTA: default value
		when(item.getAvailableBalance()).thenReturn(getAvailableBalanceResult);

		BigDecimal getBalanceResult = BigDecimal.ZERO; // UTA: default value
		when(item.getBalance()).thenReturn(getBalanceResult);
		return item;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of BankManager
	 */
	private static BankManager mockBankManager3() throws Throwable {
		BankManager bankManagerValue = mock(BankManager.class);
		List<Account> getAccountsForCustomerResult = new ArrayList<Account>(); // UTA: default value
		Account item = mockAccount();
		getAccountsForCustomerResult.add(item);
		doReturn(getAccountsForCustomerResult).when(bankManagerValue).getAccountsForCustomer(nullable(Customer.class));
		return bankManagerValue;
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
	 * @see com.parasoft.parabank.web.controller.AccountsOverviewController#setAccessModeController(AccessModeController)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetAccessModeController() throws Throwable {
		// Given
		AccountsOverviewController underTest = new AccountsOverviewController();

		// When
		AccessModeController accessModeController = mock(AccessModeController.class);
		underTest.setAccessModeController(accessModeController);

		// Then - assertions for this instance of AccountsOverviewController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNull(underTest.getBankManager());

	}

	/**
	 * Parasoft Jtest UTA: Test for setAdminManager(AdminManager)
	 *
	 * @see com.parasoft.parabank.web.controller.AccountsOverviewController#setAdminManager(AdminManager)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetAdminManager() throws Throwable {
		// Given
		AccountsOverviewController underTest = new AccountsOverviewController();

		// When
		AdminManager adminManager = mock(AdminManager.class);
		underTest.setAdminManager(adminManager);

		// Then - assertions for this instance of AccountsOverviewController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNull(underTest.getBankManager());

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
		AccountsOverviewController underTest = new AccountsOverviewController();

		// When
		ApplicationContext result = underTest.getApplicationContext();

		// Then - assertions for result of method getApplicationContext()
		assertNull(result);

		// Then - assertions for this instance of AccountsOverviewController
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
		AccountsOverviewController underTest = new AccountsOverviewController();

		// When
		BankManager result = underTest.getBankManager();

		// Then - assertions for result of method getBankManager()
		assertNull(result);

		// Then - assertions for this instance of AccountsOverviewController
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
		AccountsOverviewController underTest = new AccountsOverviewController();

		// When
		Model model = mock(Model.class);
		Object result = underTest.getCommand(model);

		// Then - assertions for result of method getCommand(Model)
		assertNull(result);

		// Then - assertions for this instance of AccountsOverviewController
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
		AccountsOverviewController underTest = new AccountsOverviewController();

		// When
		Class<?> result = underTest.getCommandClass();

		// Then - assertions for result of method getCommandClass()
		assertNull(result);

		// Then - assertions for this instance of AccountsOverviewController
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
		AccountsOverviewController underTest = new AccountsOverviewController();

		// When
		String result = underTest.getFormView();

		// Then - assertions for result of method getFormView()
		assertNull(result);

		// Then - assertions for this instance of AccountsOverviewController
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
		AccountsOverviewController underTest = new AccountsOverviewController();
		String aCommandName = "aCommandName"; // UTA: default value
		underTest.setCommandName(aCommandName);

		// When
		Model model = mock(Model.class);
		Object command = new Object(); // UTA: default value
		Object result = underTest.prepCommand(model, command);

		// Then - assertions for result of method prepCommand(Model, Object)
		assertNotNull(result);

		// Then - assertions for this instance of AccountsOverviewController
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
		AccountsOverviewController underTest = new AccountsOverviewController();
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

		// Then - assertions for this instance of AccountsOverviewController
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
		AccountsOverviewController underTest = new AccountsOverviewController();
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

		// Then - assertions for this instance of AccountsOverviewController
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
		AccountsOverviewController underTest = new AccountsOverviewController();

		// When
		ApplicationContext aApplicationContext = mock(ApplicationContext.class);
		underTest.setApplicationContext(aApplicationContext);

		// Then - assertions for this instance of AccountsOverviewController
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
		AccountsOverviewController underTest = new AccountsOverviewController();

		// When
		BankManager bankManager = mock(BankManager.class);
		underTest.setBankManager(bankManager);

		// Then - assertions for this instance of AccountsOverviewController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNotNull(underTest.getBankManager());

	}

}