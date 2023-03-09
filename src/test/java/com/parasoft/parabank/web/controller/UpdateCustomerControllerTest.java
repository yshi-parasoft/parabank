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

import com.parasoft.parabank.domain.Customer;
import com.parasoft.parabank.domain.logic.AdminManager;
import com.parasoft.parabank.domain.logic.BankManager;
import com.parasoft.parabank.service.ParaBankServiceException;
import com.parasoft.parabank.util.AccessModeController;
import com.parasoft.parabank.web.UserSession;
import com.parasoft.parabank.web.form.CustomerForm;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.servlet.ModelAndView;

/**
 * Parasoft Jtest UTA: Test class for UpdateCustomerController
 *
 * @see com.parasoft.parabank.web.controller.UpdateCustomerController
 * @author devtest
 */
public class UpdateCustomerControllerTest {

	/**
	 * Parasoft Jtest UTA: Test for getCustomer(int)
	 *
	 * @see com.parasoft.parabank.web.controller.UpdateCustomerController#getCustomer(int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetCustomer() throws Throwable {
		// Given
		UpdateCustomerController underTest = new UpdateCustomerController();
		AccessModeController accessModeController = mock(AccessModeController.class);
		underTest.setAccessModeController(accessModeController);

		// When
		int custId = 0; // UTA: default value
		Customer result = underTest.getCustomer(custId);

		// Then - assertions for result of method getCustomer(int)
		assertNull(result);

		// Then - assertions for this instance of UpdateCustomerController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNull(underTest.getBankManager());
		assertNull(underTest.getValidator());

	}

	/**
	 * Parasoft Jtest UTA: Test for getLookupForm(UserSession, Model)
	 *
	 * @see com.parasoft.parabank.web.controller.UpdateCustomerController#getLookupForm(UserSession, Model)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetLookupForm() throws Throwable {
		// Given
		UpdateCustomerController underTest = new UpdateCustomerController();
		BankManager bankManagerValue = mock(BankManager.class);
		underTest.bankManager = bankManagerValue;
		String aCommandName = "aCommandName"; // UTA: default value
		underTest.setCommandName(aCommandName);
		String aFormView = "aFormView"; // UTA: default value
		underTest.setFormView(aFormView);

		// When
		UserSession userSession = mockUserSession();
		Model model = mockModel();
		ModelAndView result = underTest.getLookupForm(userSession, model);

		// Then - assertions for argument 1 of method getLookupForm(UserSession, Model)
		assertNull(userSession.getCustomer());

		// Then - assertions for this instance of UpdateCustomerController
		assertNull(underTest.getApplicationContext());
		assertEquals("aFormView", underTest.getFormView());
		assertEquals("aCommandName", underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNotNull(underTest.getBankManager());
		assertNull(underTest.getValidator());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of Customer
	 */
	private static Customer mockCustomer() throws Throwable {
		Customer getCustomerResult = mock(Customer.class);
		String getPasswordResult = "getPasswordResult"; // UTA: default value
		when(getCustomerResult.getPassword()).thenReturn(getPasswordResult);

		String getUsernameResult = "getUsernameResult"; // UTA: default value
		when(getCustomerResult.getUsername()).thenReturn(getUsernameResult);
		return getCustomerResult;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of UserSession
	 */
	private static UserSession mockUserSession() throws Throwable {
		UserSession userSession = mock(UserSession.class);
		Customer getCustomerResult = mockCustomer();
		when(userSession.getCustomer()).thenReturn(getCustomerResult);
		return userSession;
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
	 * Parasoft Jtest UTA: Test for onSubmit(CustomerForm, BindingResult, HttpSession)
	 *
	 * @see com.parasoft.parabank.web.controller.UpdateCustomerController#onSubmit(CustomerForm, BindingResult, HttpSession)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testOnSubmit() throws Throwable {
		// Given
		UpdateCustomerController underTest = new UpdateCustomerController();
		String aFormView = "aFormView"; // UTA: default value
		underTest.setFormView(aFormView);

		// When
		CustomerForm customerForm = mock(CustomerForm.class);
		BindingResult errors = mockBindingResult();
		HttpSession session = mock(HttpSession.class);
		ModelAndView result = underTest.onSubmit(customerForm, errors, session);

		// Then - assertions for argument 1 of method onSubmit(CustomerForm, BindingResult, HttpSession)
		assertNull(customerForm.getCustomer());
		assertNull(customerForm.getRepeatedPassword());

		// Then - assertions for result of method onSubmit(CustomerForm, BindingResult, HttpSession)
		assertNotNull(result);

		// Then - assertions for this instance of UpdateCustomerController
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
	 * Parasoft Jtest UTA: Test for onSubmit(CustomerForm, BindingResult, HttpSession)
	 *
	 * @see com.parasoft.parabank.web.controller.UpdateCustomerController#onSubmit(CustomerForm, BindingResult, HttpSession)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testOnSubmit2() throws Throwable {
		// Given
		UpdateCustomerController underTest = new UpdateCustomerController();
		BankManager bankManagerValue = mockBankManager();
		underTest.bankManager = bankManagerValue;

		// When
		CustomerForm customerForm = mockCustomerForm();
		BindingResult errors = mockBindingResult2();
		HttpSession session = mock(HttpSession.class);
		ModelAndView result = underTest.onSubmit(customerForm, errors, session);

		// Then - assertions for argument 1 of method onSubmit(CustomerForm, BindingResult, HttpSession)
		assertNull(customerForm.getCustomer());
		assertNull(customerForm.getRepeatedPassword());

		// Then - assertions for result of method onSubmit(CustomerForm, BindingResult, HttpSession)
		assertNotNull(result);

		// Then - assertions for this instance of UpdateCustomerController
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
		Customer getCustomerResult = mock(Customer.class);
		when(bankManagerValue.getCustomer(anyInt())).thenReturn(getCustomerResult);
		return bankManagerValue;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of CustomerForm
	 */
	private static CustomerForm mockCustomerForm() throws Throwable {
		CustomerForm customerForm = mock(CustomerForm.class);
		Customer getCustomerResult2 = mock(Customer.class);
		when(customerForm.getCustomer()).thenReturn(getCustomerResult2);
		return customerForm;
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
	 * Parasoft Jtest UTA: Test for onSubmit(CustomerForm, BindingResult, HttpSession)
	 *
	 * @see com.parasoft.parabank.web.controller.UpdateCustomerController#onSubmit(CustomerForm, BindingResult, HttpSession)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testOnSubmit3() throws Throwable {
		// Given
		UpdateCustomerController underTest = new UpdateCustomerController();
		AccessModeController accessModeController = mockAccessModeController();
		underTest.setAccessModeController(accessModeController);
		AdminManager adminManager = mockAdminManager();
		underTest.setAdminManager(adminManager);

		// When
		CustomerForm customerForm = mockCustomerForm2();
		BindingResult errors = mockBindingResult3();
		HttpSession session = mock(HttpSession.class);
		ModelAndView result = underTest.onSubmit(customerForm, errors, session);

		// Then - assertions for argument 1 of method onSubmit(CustomerForm, BindingResult, HttpSession)
		assertNull(customerForm.getCustomer());
		assertNull(customerForm.getRepeatedPassword());

		// Then - assertions for result of method onSubmit(CustomerForm, BindingResult, HttpSession)
		assertNotNull(result);

		// Then - assertions for this instance of UpdateCustomerController
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
		Customer doGetCustomerResult = mock(Customer.class);
		when(accessModeController.doGetCustomer(anyInt())).thenReturn(doGetCustomerResult);
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
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of CustomerForm
	 */
	private static CustomerForm mockCustomerForm2() throws Throwable {
		CustomerForm customerForm = mock(CustomerForm.class);
		Customer getCustomerResult = mock(Customer.class);
		when(customerForm.getCustomer()).thenReturn(getCustomerResult);
		return customerForm;
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
	 * Parasoft Jtest UTA: Test for onSubmit(CustomerForm, BindingResult, HttpSession)
	 *
	 * @see com.parasoft.parabank.web.controller.UpdateCustomerController#onSubmit(CustomerForm, BindingResult, HttpSession)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = ParaBankServiceException.class)
	public void testOnSubmit4() throws Throwable {
		// Given
		UpdateCustomerController underTest = new UpdateCustomerController();
		AdminManager adminManager = mockAdminManager2();
		underTest.setAdminManager(adminManager);

		// When
		CustomerForm customerForm = mockCustomerForm3();
		BindingResult errors = mockBindingResult4();
		HttpSession session = mock(HttpSession.class);
		underTest.onSubmit(customerForm, errors, session);

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
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of CustomerForm
	 */
	private static CustomerForm mockCustomerForm3() throws Throwable {
		CustomerForm customerForm = mock(CustomerForm.class);
		Customer getCustomerResult = mock(Customer.class);
		Customer getCustomerResult2 = mock(Customer.class);
		when(customerForm.getCustomer()).thenReturn(getCustomerResult, getCustomerResult2);
		return customerForm;
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
	 * Parasoft Jtest UTA: Test for setAccessModeController(AccessModeController)
	 *
	 * @see com.parasoft.parabank.web.controller.UpdateCustomerController#setAccessModeController(AccessModeController)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetAccessModeController() throws Throwable {
		// Given
		UpdateCustomerController underTest = new UpdateCustomerController();

		// When
		AccessModeController accessModeController = mock(AccessModeController.class);
		underTest.setAccessModeController(accessModeController);

		// Then - assertions for this instance of UpdateCustomerController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNull(underTest.getBankManager());
		assertNull(underTest.getValidator());

	}

	/**
	 * Parasoft Jtest UTA: Test for setCommandClass(Class)
	 *
	 * @see com.parasoft.parabank.web.controller.UpdateCustomerController#setCommandClass(Class)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetCommandClass() throws Throwable {
		// Given
		UpdateCustomerController underTest = new UpdateCustomerController();

		// When
		Class aCommandClass = Class.forName("java.lang.Object"); // UTA: default value
		underTest.setCommandClass(aCommandClass);

		// Then - assertions for this instance of UpdateCustomerController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertEquals(java.lang.Object.class, underTest.getCommandClass());
		assertNull(underTest.getBankManager());
		assertNull(underTest.getValidator());

	}

	/**
	 * Parasoft Jtest UTA: Test for setCommandName(String)
	 *
	 * @see com.parasoft.parabank.web.controller.UpdateCustomerController#setCommandName(String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetCommandName() throws Throwable {
		// Given
		UpdateCustomerController underTest = new UpdateCustomerController();

		// When
		String aCommandName = "aCommandName"; // UTA: default value
		underTest.setCommandName(aCommandName);

		// Then - assertions for this instance of UpdateCustomerController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertEquals("aCommandName", underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNull(underTest.getBankManager());
		assertNull(underTest.getValidator());

	}

	/**
	 * Parasoft Jtest UTA: Test for setValidator(Validator)
	 *
	 * @see com.parasoft.parabank.web.controller.UpdateCustomerController#setValidator(Validator)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetValidator() throws Throwable {
		// Given
		UpdateCustomerController underTest = new UpdateCustomerController();

		// When
		Validator aValidator = mock(Validator.class);
		underTest.setValidator(aValidator);

		// Then - assertions for this instance of UpdateCustomerController
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
		UpdateCustomerController underTest = new UpdateCustomerController();

		// When
		Validator result = underTest.getValidator();

		// Then - assertions for result of method getValidator()
		assertNull(result);

		// Then - assertions for this instance of UpdateCustomerController
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
		UpdateCustomerController underTest = new UpdateCustomerController();

		// When
		WebDataBinder binder = mock(WebDataBinder.class);
		underTest.initBinder(binder);

		// Then - assertions for this instance of UpdateCustomerController
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
		UpdateCustomerController underTest = new UpdateCustomerController();

		// When
		ApplicationContext result = underTest.getApplicationContext();

		// Then - assertions for result of method getApplicationContext()
		assertNull(result);

		// Then - assertions for this instance of UpdateCustomerController
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
		UpdateCustomerController underTest = new UpdateCustomerController();

		// When
		BankManager result = underTest.getBankManager();

		// Then - assertions for result of method getBankManager()
		assertNull(result);

		// Then - assertions for this instance of UpdateCustomerController
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
		UpdateCustomerController underTest = new UpdateCustomerController();

		// When
		Model model = mock(Model.class);
		Object result = underTest.getCommand(model);

		// Then - assertions for result of method getCommand(Model)
		assertNull(result);

		// Then - assertions for this instance of UpdateCustomerController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getBankManager());
		assertNull(underTest.getValidator());

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
		UpdateCustomerController underTest = new UpdateCustomerController();

		// When
		Class<?> result = underTest.getCommandClass();

		// Then - assertions for result of method getCommandClass()
		assertNull(result);

		// Then - assertions for this instance of UpdateCustomerController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
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
		UpdateCustomerController underTest = new UpdateCustomerController();
		String aCommandName = "aCommandName"; // UTA: default value
		underTest.setCommandName(aCommandName);

		// When
		Model model = mock(Model.class);
		Object command = new Object(); // UTA: default value
		Object result = underTest.prepCommand(model, command);

		// Then - assertions for result of method prepCommand(Model, Object)
		assertNotNull(result);

		// Then - assertions for this instance of UpdateCustomerController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertEquals("aCommandName", underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNull(underTest.getBankManager());
		assertNull(underTest.getValidator());

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
		UpdateCustomerController underTest = new UpdateCustomerController();
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

		// Then - assertions for this instance of UpdateCustomerController
		assertNull(underTest.getApplicationContext());
		assertEquals("aFormView", underTest.getFormView());
		assertEquals("aCommandName", underTest.getCommandName());
		assertEquals(java.lang.Object.class, underTest.getCommandClass());
		assertNull(underTest.getBankManager());
		assertNull(underTest.getValidator());

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
		UpdateCustomerController underTest = new UpdateCustomerController();
		Class aCommandClass = Class.forName("java.lang.Object"); // UTA: default value
		underTest.setCommandClass(aCommandClass);
		String aCommandName = "aCommandName"; // UTA: default value
		underTest.setCommandName(aCommandName);
		String aFormView = "aFormView"; // UTA: default value
		underTest.setFormView(aFormView);

		// When
		Model model = mockModel2();
		ModelAndView result = underTest.prepForm(model);

		// Then - assertions for result of method prepForm(Model)
		assertNotNull(result);

		// Then - assertions for this instance of UpdateCustomerController
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
	 * Parasoft Jtest UTA: Test for setApplicationContext(ApplicationContext)
	 *
	 * @see com.parasoft.parabank.web.controller.AbstractBankController#setApplicationContext(ApplicationContext)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetApplicationContext() throws Throwable {
		// Given
		UpdateCustomerController underTest = new UpdateCustomerController();

		// When
		ApplicationContext aApplicationContext = mock(ApplicationContext.class);
		underTest.setApplicationContext(aApplicationContext);

		// Then - assertions for this instance of UpdateCustomerController
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
		UpdateCustomerController underTest = new UpdateCustomerController();

		// When
		BankManager bankManager = mock(BankManager.class);
		underTest.setBankManager(bankManager);

		// Then - assertions for this instance of UpdateCustomerController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNotNull(underTest.getBankManager());
		assertNull(underTest.getValidator());

	}
}