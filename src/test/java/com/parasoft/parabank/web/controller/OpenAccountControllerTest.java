/**
 * 
 */
package com.parasoft.parabank.web.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.parasoft.parabank.domain.Customer;
import com.parasoft.parabank.domain.Account.AccountType;
import com.parasoft.parabank.domain.logic.AdminManager;
import com.parasoft.parabank.domain.logic.BankManager;
import com.parasoft.parabank.util.AccessModeController;
import com.parasoft.parabank.web.UserSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

/**
 * Parasoft Jtest UTA: Test class for OpenAccountController
 *
 * @see com.parasoft.parabank.web.controller.OpenAccountController
 * @author devtest
 */
public class OpenAccountControllerTest {

	/**
	 * Parasoft Jtest UTA: Test for getAccountForm(Model)
	 *
	 * @see com.parasoft.parabank.web.controller.OpenAccountController#getAccountForm(Model)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetAccountForm() throws Throwable {
		// Given
		OpenAccountController underTest = new OpenAccountController();
		Class aCommandClass = Class.forName("java.lang.Object"); // UTA: default value
		underTest.setCommandClass(aCommandClass);
		String aCommandName = "aCommandName"; // UTA: default value
		underTest.setCommandName(aCommandName);
		String aFormView = "aFormView"; // UTA: default value
		underTest.setFormView(aFormView);

		// When
		Model model = null; // UTA: provided value
		ModelAndView result = underTest.getAccountForm(model);

		// Then - assertions for result of method getAccountForm(Model)
		assertNotNull(result);

		// Then - assertions for this instance of OpenAccountController
		assertNull(underTest.getApplicationContext());
		assertEquals("aFormView", underTest.getFormView());
		assertEquals("aCommandName", underTest.getCommandName());
		assertEquals(java.lang.Object.class, underTest.getCommandClass());
		assertNull(underTest.getBankManager());

	}

	/**
	 * Parasoft Jtest UTA: Test for getAccountForm(Model)
	 *
	 * @see com.parasoft.parabank.web.controller.OpenAccountController#getAccountForm(Model)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetAccountForm2() throws Throwable {
		// Given
		OpenAccountController underTest = new OpenAccountController();
		Class aCommandClass = Class.forName("java.lang.Object"); // UTA: default value
		underTest.setCommandClass(aCommandClass);
		String aCommandName = "aCommandName"; // UTA: default value
		underTest.setCommandName(aCommandName);
		String aFormView = "aFormView"; // UTA: default value
		underTest.setFormView(aFormView);

		// When
		Model model = mockModel();
		ModelAndView result = underTest.getAccountForm(model);

		// Then - assertions for result of method getAccountForm(Model)
		assertNotNull(result);

		// Then - assertions for this instance of OpenAccountController
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
	 * Parasoft Jtest UTA: Test for getAccountTypes()
	 *
	 * @see com.parasoft.parabank.web.controller.OpenAccountController#getAccountTypes()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetAccountTypes() throws Throwable {
		// Given
		OpenAccountController underTest = new OpenAccountController();

		// When
		List<AccountType> result = underTest.getAccountTypes();

		// Then - assertions for result of method getAccountTypes()
		assertNotNull(result);
		assertEquals(2, result.size());

		// Then - assertions for this instance of OpenAccountController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNull(underTest.getBankManager());

	}

	/**
	 * Parasoft Jtest UTA: Test for getCustomerId(UserSession)
	 *
	 * @see com.parasoft.parabank.web.controller.OpenAccountController#getCustomerId(UserSession)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetCustomerId() throws Throwable {
		// Given
		OpenAccountController underTest = new OpenAccountController();

		// When
		UserSession userSession = mockUserSession();
		int result = underTest.getCustomerId(userSession);

		// Then - assertions for argument 1 of method getCustomerId(UserSession)
		assertNull(userSession.getCustomer());

		// Then - assertions for result of method getCustomerId(UserSession)
		assertEquals(0, result);

		// Then - assertions for this instance of OpenAccountController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNull(underTest.getBankManager());

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
	 * Parasoft Jtest UTA: Test for getMinimumBalance()
	 *
	 * @see com.parasoft.parabank.web.controller.OpenAccountController#getMinimumBalance()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetMinimumBalance() throws Throwable {
		// Given
		OpenAccountController underTest = new OpenAccountController();
		AdminManager adminManager = mock(AdminManager.class);
		underTest.setAdminManager(adminManager);

		// When
		String result = underTest.getMinimumBalance();

		// Then - assertions for result of method getMinimumBalance()
		assertNull(result);

		// Then - assertions for this instance of OpenAccountController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNull(underTest.getBankManager());

	}

	/**
	 * Parasoft Jtest UTA: Test for setAccessModeController(AccessModeController)
	 *
	 * @see com.parasoft.parabank.web.controller.OpenAccountController#setAccessModeController(AccessModeController)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetAccessModeController() throws Throwable {
		// Given
		OpenAccountController underTest = new OpenAccountController();

		// When
		AccessModeController accessModeController = mock(AccessModeController.class);
		underTest.setAccessModeController(accessModeController);

		// Then - assertions for this instance of OpenAccountController
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
		OpenAccountController underTest = new OpenAccountController();

		// When
		ApplicationContext result = underTest.getApplicationContext();

		// Then - assertions for result of method getApplicationContext()
		assertNull(result);

		// Then - assertions for this instance of OpenAccountController
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
		OpenAccountController underTest = new OpenAccountController();

		// When
		BankManager result = underTest.getBankManager();

		// Then - assertions for result of method getBankManager()
		assertNull(result);

		// Then - assertions for this instance of OpenAccountController
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
		OpenAccountController underTest = new OpenAccountController();

		// When
		Model model = mock(Model.class);
		Object result = underTest.getCommand(model);

		// Then - assertions for result of method getCommand(Model)
		assertNull(result);

		// Then - assertions for this instance of OpenAccountController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
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
		OpenAccountController underTest = new OpenAccountController();
		String aCommandName = "aCommandName"; // UTA: default value
		underTest.setCommandName(aCommandName);

		// When
		Model model = mock(Model.class);
		Object command = new Object(); // UTA: default value
		Object result = underTest.prepCommand(model, command);

		// Then - assertions for result of method prepCommand(Model, Object)
		assertNotNull(result);

		// Then - assertions for this instance of OpenAccountController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertEquals("aCommandName", underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNull(underTest.getBankManager());

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
		OpenAccountController underTest = new OpenAccountController();

		// When
		ApplicationContext aApplicationContext = mock(ApplicationContext.class);
		underTest.setApplicationContext(aApplicationContext);

		// Then - assertions for this instance of OpenAccountController
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
		OpenAccountController underTest = new OpenAccountController();

		// When
		BankManager bankManager = mock(BankManager.class);
		underTest.setBankManager(bankManager);

		// Then - assertions for this instance of OpenAccountController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNotNull(underTest.getBankManager());

	}
}