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

import com.parasoft.parabank.domain.Customer;
import com.parasoft.parabank.domain.logic.BankManager;
import com.parasoft.parabank.util.AccessModeController;
import com.parasoft.parabank.web.form.LookupForm;
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
 * Parasoft Jtest UTA: Test class for CustomerLookupController
 *
 * @see com.parasoft.parabank.web.controller.CustomerLookupController
 * @author devtest
 */
public class CustomerLookupControllerTest {

	/**
	 * Parasoft Jtest UTA: Test for getLookupForm(Model)
	 *
	 * @see com.parasoft.parabank.web.controller.CustomerLookupController#getLookupForm(Model)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetLookupForm() throws Throwable {
		// Given
		CustomerLookupController underTest = new CustomerLookupController();
		Class aCommandClass = Class.forName("java.lang.Object"); // UTA: default value
		underTest.setCommandClass(aCommandClass);
		String aCommandName = "aCommandName"; // UTA: default value
		underTest.setCommandName(aCommandName);
		String aFormView = "aFormView"; // UTA: default value
		underTest.setFormView(aFormView);

		// When
		Model model = null; // UTA: provided value
		ModelAndView result = underTest.getLookupForm(model);

		// Then - assertions for result of method getLookupForm(Model)
		assertNotNull(result);

		// Then - assertions for this instance of CustomerLookupController
		assertNull(underTest.getApplicationContext());
		assertEquals("aFormView", underTest.getFormView());
		assertEquals("aCommandName", underTest.getCommandName());
		assertEquals(java.lang.Object.class, underTest.getCommandClass());
		assertNull(underTest.getBankManager());
		assertNull(underTest.getValidator());

	}

	/**
	 * Parasoft Jtest UTA: Test for getLookupForm(Model)
	 *
	 * @see com.parasoft.parabank.web.controller.CustomerLookupController#getLookupForm(Model)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetLookupForm2() throws Throwable {
		// Given
		CustomerLookupController underTest = new CustomerLookupController();
		Class aCommandClass = Class.forName("java.lang.Object"); // UTA: default value
		underTest.setCommandClass(aCommandClass);
		String aCommandName = "aCommandName"; // UTA: default value
		underTest.setCommandName(aCommandName);
		String aFormView = "aFormView"; // UTA: default value
		underTest.setFormView(aFormView);

		// When
		Model model = mockModel();
		ModelAndView result = underTest.getLookupForm(model);

		// Then - assertions for result of method getLookupForm(Model)
		assertNotNull(result);

		// Then - assertions for this instance of CustomerLookupController
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
	 * Parasoft Jtest UTA: Test for onSubmit(LookupForm, BindingResult, HttpSession)
	 *
	 * @see com.parasoft.parabank.web.controller.CustomerLookupController#onSubmit(LookupForm, BindingResult, HttpSession)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testOnSubmit() throws Throwable {
		// Given
		CustomerLookupController underTest = new CustomerLookupController();
		String aFormView = "aFormView"; // UTA: default value
		underTest.setFormView(aFormView);

		// When
		LookupForm lookupForm = mock(LookupForm.class);
		BindingResult errors = mockBindingResult();
		HttpSession session = mock(HttpSession.class);
		ModelAndView result = underTest.onSubmit(lookupForm, errors, session);

		// Then - assertions for argument 1 of method onSubmit(LookupForm, BindingResult, HttpSession)
		assertNull(lookupForm.getFirstName());
		assertNull(lookupForm.getLastName());
		assertNull(lookupForm.getAddress());
		assertNull(lookupForm.getSsn());

		// Then - assertions for result of method onSubmit(LookupForm, BindingResult, HttpSession)
		assertNotNull(result);

		// Then - assertions for this instance of CustomerLookupController
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
	 * Parasoft Jtest UTA: Test for onSubmit(LookupForm, BindingResult, HttpSession)
	 *
	 * @see com.parasoft.parabank.web.controller.CustomerLookupController#onSubmit(LookupForm, BindingResult, HttpSession)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testOnSubmit2() throws Throwable {
		// Given
		CustomerLookupController underTest = new CustomerLookupController();
		BankManager bankManagerValue = mockBankManager();
		underTest.bankManager = bankManagerValue;

		// When
		LookupForm lookupForm = mockLookupForm();
		BindingResult errors = mockBindingResult2();
		HttpSession session = mock(HttpSession.class);
		ModelAndView result = underTest.onSubmit(lookupForm, errors, session);

		// Then - assertions for argument 1 of method onSubmit(LookupForm, BindingResult, HttpSession)
		assertNull(lookupForm.getFirstName());
		assertNull(lookupForm.getLastName());
		assertNull(lookupForm.getAddress());
		assertNull(lookupForm.getSsn());

		// Then - assertions for result of method onSubmit(LookupForm, BindingResult, HttpSession)
		assertNotNull(result);

		// Then - assertions for this instance of CustomerLookupController
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
		Customer getCustomerResult = null; // UTA: provided value
		when(bankManagerValue.getCustomer(nullable(String.class))).thenReturn(getCustomerResult);
		return bankManagerValue;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of LookupForm
	 */
	private static LookupForm mockLookupForm() throws Throwable {
		LookupForm lookupForm = mock(LookupForm.class);
		String getSsnResult = "getSsnResult"; // UTA: default value
		when(lookupForm.getSsn()).thenReturn(getSsnResult);
		return lookupForm;
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
	 * Parasoft Jtest UTA: Test for onSubmit(LookupForm, BindingResult, HttpSession)
	 *
	 * @see com.parasoft.parabank.web.controller.CustomerLookupController#onSubmit(LookupForm, BindingResult, HttpSession)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testOnSubmit3() throws Throwable {
		// Given
		CustomerLookupController underTest = new CustomerLookupController();
		BankManager bankManagerValue = mockBankManager2();
		underTest.bankManager = bankManagerValue;

		// When
		LookupForm lookupForm = mock(LookupForm.class);
		BindingResult errors = mockBindingResult3();
		HttpSession session = mock(HttpSession.class);
		ModelAndView result = underTest.onSubmit(lookupForm, errors, session);

		// Then - assertions for argument 1 of method onSubmit(LookupForm, BindingResult, HttpSession)
		assertNull(lookupForm.getFirstName());
		assertNull(lookupForm.getLastName());
		assertNull(lookupForm.getAddress());
		assertNull(lookupForm.getSsn());

		// Then - assertions for result of method onSubmit(LookupForm, BindingResult, HttpSession)
		assertNotNull(result);

		// Then - assertions for this instance of CustomerLookupController
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
		Customer getCustomerResult = mock(Customer.class);
		when(bankManagerValue.getCustomer(nullable(String.class))).thenReturn(getCustomerResult);
		return bankManagerValue;
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
	 * @see com.parasoft.parabank.web.controller.CustomerLookupController#setAccessModeController(AccessModeController)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetAccessModeController() throws Throwable {
		// Given
		CustomerLookupController underTest = new CustomerLookupController();

		// When
		AccessModeController aAccessModeController = mock(AccessModeController.class);
		underTest.setAccessModeController(aAccessModeController);

		// Then - assertions for this instance of CustomerLookupController
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
	 * @see com.parasoft.parabank.web.controller.CustomerLookupController#setValidator(Validator)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetValidator() throws Throwable {
		// Given
		CustomerLookupController underTest = new CustomerLookupController();

		// When
		Validator aValidator = mock(Validator.class);
		underTest.setValidator(aValidator);

		// Then - assertions for this instance of CustomerLookupController
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
		CustomerLookupController underTest = new CustomerLookupController();

		// When
		Validator result = underTest.getValidator();

		// Then - assertions for result of method getValidator()
		assertNull(result);

		// Then - assertions for this instance of CustomerLookupController
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
		CustomerLookupController underTest = new CustomerLookupController();

		// When
		WebDataBinder binder = mock(WebDataBinder.class);
		underTest.initBinder(binder);

		// Then - assertions for this instance of CustomerLookupController
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
		CustomerLookupController underTest = new CustomerLookupController();

		// When
		ApplicationContext result = underTest.getApplicationContext();

		// Then - assertions for result of method getApplicationContext()
		assertNull(result);

		// Then - assertions for this instance of CustomerLookupController
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
		CustomerLookupController underTest = new CustomerLookupController();

		// When
		BankManager result = underTest.getBankManager();

		// Then - assertions for result of method getBankManager()
		assertNull(result);

		// Then - assertions for this instance of CustomerLookupController
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
		CustomerLookupController underTest = new CustomerLookupController();

		// When
		Model model = mock(Model.class);
		Object result = underTest.getCommand(model);

		// Then - assertions for result of method getCommand(Model)
		assertNull(result);

		// Then - assertions for this instance of CustomerLookupController
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
		CustomerLookupController underTest = new CustomerLookupController();
		String aCommandName = "aCommandName"; // UTA: default value
		underTest.setCommandName(aCommandName);

		// When
		Model model = mock(Model.class);
		Object command = new Object(); // UTA: default value
		Object result = underTest.prepCommand(model, command);

		// Then - assertions for result of method prepCommand(Model, Object)
		assertNotNull(result);

		// Then - assertions for this instance of CustomerLookupController
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
		CustomerLookupController underTest = new CustomerLookupController();

		// When
		ApplicationContext aApplicationContext = mock(ApplicationContext.class);
		underTest.setApplicationContext(aApplicationContext);

		// Then - assertions for this instance of CustomerLookupController
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
		CustomerLookupController underTest = new CustomerLookupController();

		// When
		BankManager bankManager = mock(BankManager.class);
		underTest.setBankManager(bankManager);

		// Then - assertions for this instance of CustomerLookupController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNotNull(underTest.getBankManager());
		assertNull(underTest.getValidator());

	}
}