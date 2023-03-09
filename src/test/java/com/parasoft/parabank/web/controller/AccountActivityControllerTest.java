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
import com.parasoft.parabank.domain.Transaction;
import com.parasoft.parabank.domain.TransactionCriteria;
import com.parasoft.parabank.domain.logic.AdminManager;
import com.parasoft.parabank.domain.logic.BankManager;
import com.parasoft.parabank.util.AccessModeController;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.ModelAndView;

/**
 * Parasoft Jtest UTA: Test class for AccountActivityController
 *
 * @see com.parasoft.parabank.web.controller.AccountActivityController
 * @author devtest
 */
public class AccountActivityControllerTest {

	/**
	 * Parasoft Jtest UTA: Test for getTypes()
	 *
	 * @see com.parasoft.parabank.web.controller.AccountActivityController#getTypes()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetTypes() throws Throwable {
		// Given
		AccountActivityController underTest = new AccountActivityController();

		// When
		List<String> result = underTest.getTypes();

		// Then - assertions for result of method getTypes()
		assertNotNull(result);
		assertEquals(3, result.size());

		// Then - assertions for this instance of AccountActivityController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNull(underTest.getBankManager());

	}

	/**
	 * Parasoft Jtest UTA: Test for onSubmit(TransactionCriteria, BindingResult, String, Model)
	 *
	 * @see com.parasoft.parabank.web.controller.AccountActivityController#onSubmit(TransactionCriteria, BindingResult, String, Model)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testOnSubmit() throws Throwable {
		// Given
		AccountActivityController underTest = new AccountActivityController();
		String aFormView = "aFormView"; // UTA: default value
		underTest.setFormView(aFormView);

		// When
		TransactionCriteria criteria = mock(TransactionCriteria.class);
		BindingResult errors = mockBindingResult();
		String id = "id"; // UTA: default value
		Model model = mock(Model.class);
		ModelAndView result = underTest.onSubmit(criteria, errors, id, model);

		// Then - assertions for argument 1 of method onSubmit(TransactionCriteria, BindingResult, String, Model)
		assertNull(criteria.getMonth());
		assertNull(criteria.getTransactionType());
		assertNull(criteria.getTransactionId());
		assertNull(criteria.getOnDate());
		assertNull(criteria.getFromDate());
		assertNull(criteria.getToDate());
		assertNull(criteria.getAmount());
		assertNull(criteria.getSearchType());

		// Then - assertions for result of method onSubmit(TransactionCriteria, BindingResult, String, Model)
		assertNotNull(result);

		// Then - assertions for this instance of AccountActivityController
		assertNull(underTest.getApplicationContext());
		assertEquals("aFormView", underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNull(underTest.getBankManager());

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
	 * Parasoft Jtest UTA: Test for onSubmit(TransactionCriteria, BindingResult, String, Model)
	 *
	 * @see com.parasoft.parabank.web.controller.AccountActivityController#onSubmit(TransactionCriteria, BindingResult, String, Model)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testOnSubmit2() throws Throwable {
		// Given
		AccountActivityController underTest = new AccountActivityController();
		BankManager bankManagerValue = mockBankManager();
		underTest.bankManager = bankManagerValue;
		AdminManager adminManager = mockAdminManager();
		underTest.setAdminManager(adminManager);
		String aFormView = "aFormView"; // UTA: default value
		underTest.setFormView(aFormView);

		// When
		TransactionCriteria criteria = mock(TransactionCriteria.class);
		BindingResult errors = mockBindingResult2();
		String id = "id"; // UTA: default value
		Model model = mockModel();
		ModelAndView result = underTest.onSubmit(criteria, errors, id, model);

		// Then - assertions for argument 1 of method onSubmit(TransactionCriteria, BindingResult, String, Model)
		assertNull(criteria.getMonth());
		assertNull(criteria.getTransactionType());
		assertNull(criteria.getTransactionId());
		assertNull(criteria.getOnDate());
		assertNull(criteria.getFromDate());
		assertNull(criteria.getToDate());
		assertNull(criteria.getAmount());
		assertNull(criteria.getSearchType());

		// Then - assertions for result of method onSubmit(TransactionCriteria, BindingResult, String, Model)
		assertNotNull(result);

		// Then - assertions for this instance of AccountActivityController
		assertNull(underTest.getApplicationContext());
		assertEquals("aFormView", underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNotNull(underTest.getBankManager());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of BankManager
	 */
	private static BankManager mockBankManager() throws Throwable {
		BankManager bankManagerValue = mock(BankManager.class);
		Account getAccountResult = mock(Account.class);
		when(bankManagerValue.getAccount(anyInt())).thenReturn(getAccountResult);

		List<Transaction> getTransactionsForAccountResult = null; // UTA: provided value
		doReturn(getTransactionsForAccountResult).when(bankManagerValue).getTransactionsForAccount(anyInt(),
				nullable(TransactionCriteria.class));
		return bankManagerValue;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AdminManager
	 */
	private static AdminManager mockAdminManager() throws Throwable {
		AdminManager adminManager = mock(AdminManager.class);
		String getParameterResult = "jdbc"; // UTA: provided value
		when(adminManager.getParameter(nullable(String.class))).thenReturn(getParameterResult);
		return adminManager;
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
	 * @see com.parasoft.parabank.web.controller.AccountActivityController#setAccessModeController(AccessModeController)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetAccessModeController() throws Throwable {
		// Given
		AccountActivityController underTest = new AccountActivityController();

		// When
		AccessModeController aAccessModeController = mock(AccessModeController.class);
		underTest.setAccessModeController(aAccessModeController);

		// Then - assertions for this instance of AccountActivityController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNull(underTest.getBankManager());

	}

	/**
	 * Parasoft Jtest UTA: Test for showForm(String, Model)
	 *
	 * @see com.parasoft.parabank.web.controller.AccountActivityController#showForm(String, Model)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testShowForm() throws Throwable {
		// Given
		AccountActivityController underTest = new AccountActivityController();
		Class aCommandClass = Class.forName("java.lang.Object"); // UTA: default value
		underTest.setCommandClass(aCommandClass);
		String aCommandName = "aCommandName"; // UTA: default value
		underTest.setCommandName(aCommandName);
		String aFormView = "aFormView"; // UTA: default value
		underTest.setFormView(aFormView);

		// When
		String id = "id"; // UTA: default value
		Model model = mockModel2();
		ModelAndView result = underTest.showForm(id, model);

		// Then - assertions for result of method showForm(String, Model)
		assertNotNull(result);

		// Then - assertions for this instance of AccountActivityController
		assertNull(underTest.getApplicationContext());
		assertEquals("aFormView", underTest.getFormView());
		assertEquals("aCommandName", underTest.getCommandName());
		assertEquals(java.lang.Object.class, underTest.getCommandClass());
		assertNull(underTest.getBankManager());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of Model
	 */
	private static Model mockModel2() throws Throwable {
		Model model = mock(Model.class);
		Map<String, Object> asMapResult = new HashMap<String, Object>(); // UTA: default value
		String key = "key"; // UTA: default value
		Object value = new Object(); // UTA: default value
		asMapResult.put(key, value);
		doReturn(asMapResult).when(model).asMap();
		return model;
	}

	/**
	 * Parasoft Jtest UTA: Test for showForm(String, Model)
	 *
	 * @see com.parasoft.parabank.web.controller.AccountActivityController#showForm(String, Model)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testShowForm2() throws Throwable {
		// Given
		AccountActivityController underTest = new AccountActivityController();
		Class aCommandClass = Class.forName("java.lang.Object"); // UTA: default value
		underTest.setCommandClass(aCommandClass);
		String aCommandName = "aCommandName"; // UTA: default value
		underTest.setCommandName(aCommandName);
		String aFormView = "aFormView"; // UTA: default value
		underTest.setFormView(aFormView);

		// When
		String id = "id"; // UTA: default value
		Model model = null; // UTA: provided value
		ModelAndView result = underTest.showForm(id, model);

		// Then - assertions for result of method showForm(String, Model)
		assertNotNull(result);

		// Then - assertions for this instance of AccountActivityController
		assertNull(underTest.getApplicationContext());
		assertEquals("aFormView", underTest.getFormView());
		assertEquals("aCommandName", underTest.getCommandName());
		assertEquals(java.lang.Object.class, underTest.getCommandClass());
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
		AccountActivityController underTest = new AccountActivityController();

		// When
		ApplicationContext result = underTest.getApplicationContext();

		// Then - assertions for result of method getApplicationContext()
		assertNull(result);

		// Then - assertions for this instance of AccountActivityController
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
		AccountActivityController underTest = new AccountActivityController();

		// When
		BankManager result = underTest.getBankManager();

		// Then - assertions for result of method getBankManager()
		assertNull(result);

		// Then - assertions for this instance of AccountActivityController
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
		AccountActivityController underTest = new AccountActivityController();

		// When
		Model model = mock(Model.class);
		Object result = underTest.getCommand(model);

		// Then - assertions for result of method getCommand(Model)
		assertNull(result);

		// Then - assertions for this instance of AccountActivityController
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
		AccountActivityController underTest = new AccountActivityController();
		String aCommandName = "aCommandName"; // UTA: default value
		underTest.setCommandName(aCommandName);

		// When
		Model model = mock(Model.class);
		Object command = new Object(); // UTA: default value
		Object result = underTest.prepCommand(model, command);

		// Then - assertions for result of method prepCommand(Model, Object)
		assertNotNull(result);

		// Then - assertions for this instance of AccountActivityController
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
		AccountActivityController underTest = new AccountActivityController();

		// When
		ApplicationContext aApplicationContext = mock(ApplicationContext.class);
		underTest.setApplicationContext(aApplicationContext);

		// Then - assertions for this instance of AccountActivityController
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
		AccountActivityController underTest = new AccountActivityController();

		// When
		BankManager bankManager = mock(BankManager.class);
		underTest.setBankManager(bankManager);

		// Then - assertions for this instance of AccountActivityController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNotNull(underTest.getBankManager());

	}
}