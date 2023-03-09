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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.ui.Model;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.servlet.ModelAndView;

/**
 * Parasoft Jtest UTA: Test class for TransferController
 *
 * @see com.parasoft.parabank.web.controller.TransferController
 * @author devtest
 */
public class TransferControllerTest {

	/**
	 * Parasoft Jtest UTA: Test for getAccountIds(UserSession)
	 *
	 * @see com.parasoft.parabank.web.controller.TransferController#getAccountIds(UserSession)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetAccountIds() throws Throwable {
		// Given
		TransferController underTest = new TransferController();
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

		// Then - assertions for this instance of TransferController
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
	 * @see com.parasoft.parabank.web.controller.TransferController#getAccountIds(UserSession)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetAccountIds2() throws Throwable {
		// Given
		TransferController underTest = new TransferController();
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

		// Then - assertions for this instance of TransferController
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
	 * @see com.parasoft.parabank.web.controller.TransferController#getCustomerId(UserSession)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetCustomerId() throws Throwable {
		// Given
		TransferController underTest = new TransferController();

		// When
		UserSession userSession = mockUserSession();
		int result = underTest.getCustomerId(userSession);

		// Then - assertions for argument 1 of method getCustomerId(UserSession)
		assertNull(userSession.getCustomer());

		// Then - assertions for result of method getCustomerId(UserSession)
		assertEquals(0, result);

		// Then - assertions for this instance of TransferController
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
	 * Parasoft Jtest UTA: Test for getTransferForm(Model)
	 *
	 * @see com.parasoft.parabank.web.controller.TransferController#getTransferForm(Model)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetTransferForm() throws Throwable {
		// Given
		TransferController underTest = new TransferController();
		Class aCommandClass = Class.forName("java.lang.Object"); // UTA: default value
		underTest.setCommandClass(aCommandClass);
		String aCommandName = "aCommandName"; // UTA: default value
		underTest.setCommandName(aCommandName);
		String aFormView = "aFormView"; // UTA: default value
		underTest.setFormView(aFormView);

		// When
		Model model = null; // UTA: provided value
		ModelAndView result = underTest.getTransferForm(model);

		// Then - assertions for result of method getTransferForm(Model)
		assertNotNull(result);

		// Then - assertions for this instance of TransferController
		assertNull(underTest.getApplicationContext());
		assertEquals("aFormView", underTest.getFormView());
		assertEquals("aCommandName", underTest.getCommandName());
		assertEquals(java.lang.Object.class, underTest.getCommandClass());
		assertNull(underTest.getBankManager());
		assertNull(underTest.getValidator());

	}

	/**
	 * Parasoft Jtest UTA: Test for getTransferForm(Model)
	 *
	 * @see com.parasoft.parabank.web.controller.TransferController#getTransferForm(Model)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetTransferForm2() throws Throwable {
		// Given
		TransferController underTest = new TransferController();
		Class aCommandClass = Class.forName("java.lang.Object"); // UTA: default value
		underTest.setCommandClass(aCommandClass);
		String aCommandName = "aCommandName"; // UTA: default value
		underTest.setCommandName(aCommandName);
		String aFormView = "aFormView"; // UTA: default value
		underTest.setFormView(aFormView);

		// When
		Model model = mockModel();
		ModelAndView result = underTest.getTransferForm(model);

		// Then - assertions for result of method getTransferForm(Model)
		assertNotNull(result);

		// Then - assertions for this instance of TransferController
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
	 * Parasoft Jtest UTA: Test for setAccessModeController(AccessModeController)
	 *
	 * @see com.parasoft.parabank.web.controller.TransferController#setAccessModeController(AccessModeController)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetAccessModeController() throws Throwable {
		// Given
		TransferController underTest = new TransferController();

		// When
		AccessModeController accessModeController = mock(AccessModeController.class);
		underTest.setAccessModeController(accessModeController);

		// Then - assertions for this instance of TransferController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNull(underTest.getBankManager());
		assertNull(underTest.getValidator());

	}

	/**
	 * Parasoft Jtest UTA: Test for setAdminManager(AdminManager)
	 *
	 * @see com.parasoft.parabank.web.controller.TransferController#setAdminManager(AdminManager)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetAdminManager() throws Throwable {
		// Given
		TransferController underTest = new TransferController();

		// When
		AdminManager adminManager = mock(AdminManager.class);
		underTest.setAdminManager(adminManager);

		// Then - assertions for this instance of TransferController
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
	 * @see com.parasoft.parabank.web.controller.TransferController#setValidator(Validator)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetValidator() throws Throwable {
		// Given
		TransferController underTest = new TransferController();

		// When
		Validator aValidator = mock(Validator.class);
		underTest.setValidator(aValidator);

		// Then - assertions for this instance of TransferController
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
		TransferController underTest = new TransferController();

		// When
		Validator result = underTest.getValidator();

		// Then - assertions for result of method getValidator()
		assertNull(result);

		// Then - assertions for this instance of TransferController
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
		TransferController underTest = new TransferController();

		// When
		WebDataBinder binder = mock(WebDataBinder.class);
		underTest.initBinder(binder);

		// Then - assertions for this instance of TransferController
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
		TransferController underTest = new TransferController();

		// When
		ApplicationContext result = underTest.getApplicationContext();

		// Then - assertions for result of method getApplicationContext()
		assertNull(result);

		// Then - assertions for this instance of TransferController
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
		TransferController underTest = new TransferController();

		// When
		BankManager result = underTest.getBankManager();

		// Then - assertions for result of method getBankManager()
		assertNull(result);

		// Then - assertions for this instance of TransferController
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
		TransferController underTest = new TransferController();

		// When
		Model model = mock(Model.class);
		Object result = underTest.getCommand(model);

		// Then - assertions for result of method getCommand(Model)
		assertNull(result);

		// Then - assertions for this instance of TransferController
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
		TransferController underTest = new TransferController();
		String aCommandName = "aCommandName"; // UTA: default value
		underTest.setCommandName(aCommandName);

		// When
		Model model = mock(Model.class);
		Object command = new Object(); // UTA: default value
		Object result = underTest.prepCommand(model, command);

		// Then - assertions for result of method prepCommand(Model, Object)
		assertNotNull(result);

		// Then - assertions for this instance of TransferController
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
		TransferController underTest = new TransferController();

		// When
		ApplicationContext aApplicationContext = mock(ApplicationContext.class);
		underTest.setApplicationContext(aApplicationContext);

		// Then - assertions for this instance of TransferController
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
		TransferController underTest = new TransferController();

		// When
		BankManager bankManager = mock(BankManager.class);
		underTest.setBankManager(bankManager);

		// Then - assertions for this instance of TransferController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNotNull(underTest.getBankManager());
		assertNull(underTest.getValidator());

	}
}