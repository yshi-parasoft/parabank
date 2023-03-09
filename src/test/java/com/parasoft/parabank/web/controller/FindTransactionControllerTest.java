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
import com.parasoft.parabank.domain.Transaction;
import com.parasoft.parabank.domain.TransactionCriteria;
import com.parasoft.parabank.domain.logic.AdminManager;
import com.parasoft.parabank.domain.logic.BankManager;
import com.parasoft.parabank.util.AccessModeController;
import com.parasoft.parabank.web.UserSession;
import com.parasoft.parabank.web.form.FindTransactionForm;
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
 * Parasoft Jtest UTA: Test class for FindTransactionController
 *
 * @see com.parasoft.parabank.web.controller.FindTransactionController
 * @author devtest
 */
public class FindTransactionControllerTest {

	/**
	 * Parasoft Jtest UTA: Test for getAccountIds(UserSession)
	 *
	 * @see com.parasoft.parabank.web.controller.FindTransactionController#getAccountIds(UserSession)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetAccountIds() throws Throwable {
		// Given
		FindTransactionController underTest = new FindTransactionController();
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

		// Then - assertions for this instance of FindTransactionController
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
	 * @see com.parasoft.parabank.web.controller.FindTransactionController#getAccountIds(UserSession)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetAccountIds2() throws Throwable {
		// Given
		FindTransactionController underTest = new FindTransactionController();
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

		// Then - assertions for this instance of FindTransactionController
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
	 * Parasoft Jtest UTA: Test for getFindTransactionForm(Model)
	 *
	 * @see com.parasoft.parabank.web.controller.FindTransactionController#getFindTransactionForm(Model)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetFindTransactionForm() throws Throwable {
		// Given
		FindTransactionController underTest = new FindTransactionController();
		Class aCommandClass = Class.forName("java.lang.Object"); // UTA: default value
		underTest.setCommandClass(aCommandClass);
		String aCommandName = "aCommandName"; // UTA: default value
		underTest.setCommandName(aCommandName);
		String aFormView = "aFormView"; // UTA: default value
		underTest.setFormView(aFormView);

		// When
		Model model = null; // UTA: provided value
		ModelAndView result = underTest.getFindTransactionForm(model);

		// Then - assertions for result of method getFindTransactionForm(Model)
		assertNotNull(result);

		// Then - assertions for this instance of FindTransactionController
		assertNull(underTest.getApplicationContext());
		assertEquals("aFormView", underTest.getFormView());
		assertEquals("aCommandName", underTest.getCommandName());
		assertEquals(java.lang.Object.class, underTest.getCommandClass());
		assertNull(underTest.getBankManager());
		assertNull(underTest.getValidator());

	}

	/**
	 * Parasoft Jtest UTA: Test for getFindTransactionForm(Model)
	 *
	 * @see com.parasoft.parabank.web.controller.FindTransactionController#getFindTransactionForm(Model)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetFindTransactionForm2() throws Throwable {
		// Given
		FindTransactionController underTest = new FindTransactionController();
		Class aCommandClass = Class.forName("java.lang.Object"); // UTA: default value
		underTest.setCommandClass(aCommandClass);
		String aCommandName = "aCommandName"; // UTA: default value
		underTest.setCommandName(aCommandName);
		String aFormView = "aFormView"; // UTA: default value
		underTest.setFormView(aFormView);

		// When
		Model model = mockModel();
		ModelAndView result = underTest.getFindTransactionForm(model);

		// Then - assertions for result of method getFindTransactionForm(Model)
		assertNotNull(result);

		// Then - assertions for this instance of FindTransactionController
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
	 * Parasoft Jtest UTA: Test for initBinder(WebDataBinder)
	 *
	 * @see com.parasoft.parabank.web.controller.FindTransactionController#initBinder(WebDataBinder)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testInitBinder() throws Throwable {
		// Given
		FindTransactionController underTest = new FindTransactionController();

		// When
		WebDataBinder binder = mock(WebDataBinder.class);
		underTest.initBinder(binder);

		// Then - assertions for this instance of FindTransactionController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNull(underTest.getBankManager());
		assertNull(underTest.getValidator());

	}

	/**
	 * Parasoft Jtest UTA: Test for onSubmit(FindTransactionForm, BindingResult)
	 *
	 * @see com.parasoft.parabank.web.controller.FindTransactionController#onSubmit(FindTransactionForm, BindingResult)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testOnSubmit() throws Throwable {
		// Given
		FindTransactionController underTest = new FindTransactionController();
		String aFormView = "aFormView"; // UTA: default value
		underTest.setFormView(aFormView);

		// When
		FindTransactionForm findTransactionForm = mock(FindTransactionForm.class);
		BindingResult errors = mockBindingResult();
		ModelAndView result = underTest.onSubmit(findTransactionForm, errors);

		// Then - assertions for argument 1 of method onSubmit(FindTransactionForm, BindingResult)
		assertEquals(0, findTransactionForm.getAccountId());
		assertNull(findTransactionForm.getCriteria());

		// Then - assertions for result of method onSubmit(FindTransactionForm, BindingResult)
		assertNotNull(result);

		// Then - assertions for this instance of FindTransactionController
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
	 * Parasoft Jtest UTA: Test for onSubmit(FindTransactionForm, BindingResult)
	 *
	 * @see com.parasoft.parabank.web.controller.FindTransactionController#onSubmit(FindTransactionForm, BindingResult)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testOnSubmit2() throws Throwable {
		// Given
		FindTransactionController underTest = new FindTransactionController();
		BankManager bankManagerValue = mockBankManager3();
		underTest.bankManager = bankManagerValue;

		// When
		FindTransactionForm findTransactionForm = mock(FindTransactionForm.class);
		BindingResult errors = mockBindingResult2();
		ModelAndView result = underTest.onSubmit(findTransactionForm, errors);

		// Then - assertions for argument 1 of method onSubmit(FindTransactionForm, BindingResult)
		assertEquals(0, findTransactionForm.getAccountId());
		assertNull(findTransactionForm.getCriteria());

		// Then - assertions for result of method onSubmit(FindTransactionForm, BindingResult)
		assertNotNull(result);

		// Then - assertions for this instance of FindTransactionController
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
		Account getAccountResult = mock(Account.class);
		when(bankManagerValue.getAccount(anyInt())).thenReturn(getAccountResult);

		List<Transaction> getTransactionsForAccountResult = new ArrayList<Transaction>(); // UTA: default value
		Transaction item = mock(Transaction.class);
		getTransactionsForAccountResult.add(item);
		doReturn(getTransactionsForAccountResult).when(bankManagerValue).getTransactionsForAccount(anyInt(),
				nullable(TransactionCriteria.class));
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
	 * Parasoft Jtest UTA: Test for onSubmit(FindTransactionForm, BindingResult)
	 *
	 * @see com.parasoft.parabank.web.controller.FindTransactionController#onSubmit(FindTransactionForm, BindingResult)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testOnSubmit3() throws Throwable {
		// Given
		FindTransactionController underTest = new FindTransactionController();
		BankManager bankManagerValue = mock(BankManager.class);
		underTest.bankManager = bankManagerValue;
		AccessModeController accessModeController = mockAccessModeController();
		underTest.setAccessModeController(accessModeController);
		AdminManager adminManager = mockAdminManager();
		underTest.setAdminManager(adminManager);

		// When
		FindTransactionForm findTransactionForm = mockFindTransactionForm();
		BindingResult errors = mockBindingResult3();
		ModelAndView result = underTest.onSubmit(findTransactionForm, errors);

		// Then - assertions for argument 1 of method onSubmit(FindTransactionForm, BindingResult)
		assertEquals(0, findTransactionForm.getAccountId());
		assertNull(findTransactionForm.getCriteria());

		// Then - assertions for result of method onSubmit(FindTransactionForm, BindingResult)
		assertNotNull(result);

		// Then - assertions for this instance of FindTransactionController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNotNull(underTest.getBankManager());
		assertNull(underTest.getValidator());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AccessModeController
	 */
	private static AccessModeController mockAccessModeController() throws Throwable {
		AccessModeController accessModeController = mock(AccessModeController.class);
		List<Transaction> getTransactionsForAccountResult = new ArrayList<Transaction>(); // UTA: default value
		Transaction item = mock(Transaction.class);
		getTransactionsForAccountResult.add(item);
		doReturn(getTransactionsForAccountResult).when(accessModeController)
				.getTransactionsForAccount(nullable(Account.class), nullable(TransactionCriteria.class));
		return accessModeController;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AdminManager
	 */
	private static AdminManager mockAdminManager() throws Throwable {
		AdminManager adminManager = mock(AdminManager.class);
		String getParameterResult = ""; // UTA: provided value
		when(adminManager.getParameter(nullable(String.class))).thenReturn(getParameterResult);
		return adminManager;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of FindTransactionForm
	 */
	private static FindTransactionForm mockFindTransactionForm() throws Throwable {
		FindTransactionForm findTransactionForm = mock(FindTransactionForm.class);
		TransactionCriteria getCriteriaResult = mock(TransactionCriteria.class);
		when(findTransactionForm.getCriteria()).thenReturn(getCriteriaResult);
		return findTransactionForm;
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
	 * Parasoft Jtest UTA: Test for setAccessModeController(AccessModeController)
	 *
	 * @see com.parasoft.parabank.web.controller.FindTransactionController#setAccessModeController(AccessModeController)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetAccessModeController() throws Throwable {
		// Given
		FindTransactionController underTest = new FindTransactionController();

		// When
		AccessModeController accessModeController = mock(AccessModeController.class);
		underTest.setAccessModeController(accessModeController);

		// Then - assertions for this instance of FindTransactionController
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
	 * @see com.parasoft.parabank.web.controller.FindTransactionController#setValidator(Validator)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetValidator() throws Throwable {
		// Given
		FindTransactionController underTest = new FindTransactionController();

		// When
		Validator aValidator = mock(Validator.class);
		underTest.setValidator(aValidator);

		// Then - assertions for this instance of FindTransactionController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNull(underTest.getBankManager());
		assertNotNull(underTest.getValidator());

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
		FindTransactionController underTest = new FindTransactionController();

		// When
		ApplicationContext result = underTest.getApplicationContext();

		// Then - assertions for result of method getApplicationContext()
		assertNull(result);

		// Then - assertions for this instance of FindTransactionController
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
		FindTransactionController underTest = new FindTransactionController();

		// When
		BankManager result = underTest.getBankManager();

		// Then - assertions for result of method getBankManager()
		assertNull(result);

		// Then - assertions for this instance of FindTransactionController
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
		FindTransactionController underTest = new FindTransactionController();

		// When
		Model model = mock(Model.class);
		Object result = underTest.getCommand(model);

		// Then - assertions for result of method getCommand(Model)
		assertNull(result);

		// Then - assertions for this instance of FindTransactionController
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
		FindTransactionController underTest = new FindTransactionController();
		String aCommandName = "aCommandName"; // UTA: default value
		underTest.setCommandName(aCommandName);

		// When
		Model model = mock(Model.class);
		Object command = new Object(); // UTA: default value
		Object result = underTest.prepCommand(model, command);

		// Then - assertions for result of method prepCommand(Model, Object)
		assertNotNull(result);

		// Then - assertions for this instance of FindTransactionController
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
		FindTransactionController underTest = new FindTransactionController();

		// When
		ApplicationContext aApplicationContext = mock(ApplicationContext.class);
		underTest.setApplicationContext(aApplicationContext);

		// Then - assertions for this instance of FindTransactionController
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
		FindTransactionController underTest = new FindTransactionController();

		// When
		BankManager bankManager = mock(BankManager.class);
		underTest.setBankManager(bankManager);

		// Then - assertions for this instance of FindTransactionController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNotNull(underTest.getBankManager());
		assertNull(underTest.getValidator());

	}
}