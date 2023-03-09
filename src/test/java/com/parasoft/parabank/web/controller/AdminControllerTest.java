/**
 * 
 */
package com.parasoft.parabank.web.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.ArgumentMatchers.nullable;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.parasoft.parabank.domain.logic.AdminManager;
import com.parasoft.parabank.domain.logic.BankManager;
import com.parasoft.parabank.domain.logic.impl.LoanProviderMapAware;
import com.parasoft.parabank.util.AccessModeController;
import com.parasoft.parabank.web.form.AdminForm;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.servlet.ModelAndView;

/**
 * Parasoft Jtest UTA: Test class for AdminController
 *
 * @see com.parasoft.parabank.web.controller.AdminController
 * @author devtest
 */
public class AdminControllerTest {

	/**
	 * Parasoft Jtest UTA: Test for getFormModelAndView(Model)
	 *
	 * @see com.parasoft.parabank.web.controller.AdminController#getFormModelAndView(Model)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetFormModelAndView() throws Throwable {
		// Given
		AdminController underTest = new AdminController();
		AdminManager adminManager = mockAdminManager();
		underTest.setAdminManager(adminManager);
		String aCommandName = "aCommandName"; // UTA: default value
		underTest.setCommandName(aCommandName);
		String aFormView = "aFormView"; // UTA: default value
		underTest.setFormView(aFormView);

		// When
		Model model = null; // UTA: provided value
		ModelAndView result = underTest.getFormModelAndView(model);

		// Then - assertions for result of method getFormModelAndView(Model)
		assertNotNull(result);

		// Then - assertions for this instance of AdminController
		assertNull(underTest.getApplicationContext());
		assertEquals("aFormView", underTest.getFormView());
		assertEquals("aCommandName", underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNull(underTest.getBankManager());
		assertNull(underTest.getValidator());
		assertNotNull(underTest.getAdminManager());
		assertNull(underTest.getLoanProvider());
		assertNull(underTest.getLoanProcessor());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AdminManager
	 */
	private static AdminManager mockAdminManager() throws Throwable {
		AdminManager adminManager = mock(AdminManager.class);
		AdminForm populateAdminFormResult = mock(AdminForm.class);
		when(adminManager.populateAdminForm(nullable(AdminForm.class))).thenReturn(populateAdminFormResult);
		return adminManager;
	}

	/**
	 * Parasoft Jtest UTA: Test for getFormModelAndView(Model)
	 *
	 * @see com.parasoft.parabank.web.controller.AdminController#getFormModelAndView(Model)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetFormModelAndView2() throws Throwable {
		// Given
		AdminController underTest = new AdminController();
		AdminManager adminManager = mockAdminManager2();
		underTest.setAdminManager(adminManager);
		String aCommandName = "aCommandName"; // UTA: default value
		underTest.setCommandName(aCommandName);
		String aFormView = "aFormView"; // UTA: default value
		underTest.setFormView(aFormView);

		// When
		Model model = mockModel();
		ModelAndView result = underTest.getFormModelAndView(model);

		// Then - assertions for result of method getFormModelAndView(Model)
		assertNotNull(result);

		// Then - assertions for this instance of AdminController
		assertNull(underTest.getApplicationContext());
		assertEquals("aFormView", underTest.getFormView());
		assertEquals("aCommandName", underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNull(underTest.getBankManager());
		assertNull(underTest.getValidator());
		assertNotNull(underTest.getAdminManager());
		assertNull(underTest.getLoanProvider());
		assertNull(underTest.getLoanProcessor());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AdminManager
	 */
	private static AdminManager mockAdminManager2() throws Throwable {
		AdminManager adminManager = mock(AdminManager.class);
		AdminForm populateAdminFormResult = mock(AdminForm.class);
		when(adminManager.populateAdminForm(nullable(AdminForm.class))).thenReturn(populateAdminFormResult);
		return adminManager;
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
	 * Parasoft Jtest UTA: Test for onSubmit(AdminForm, BindingResult, Model)
	 *
	 * @see com.parasoft.parabank.web.controller.AdminController#onSubmit(AdminForm, BindingResult, Model)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testOnSubmit() throws Throwable {
		// Given
		AdminController underTest = new AdminController();
		String aFormView = "aFormView"; // UTA: default value
		underTest.setFormView(aFormView);

		// When
		AdminForm form = mock(AdminForm.class);
		BindingResult errors = mockBindingResult();
		Model model = mock(Model.class);
		ModelAndView result = underTest.onSubmit(form, errors, model);

		// Then - assertions for argument 1 of method onSubmit(AdminForm, BindingResult, Model)
		assertNull(form.getEndpoint());
		assertNull(form.getSoapEndpoint());
		assertNull(form.getRestEndpoint());
		assertNull(form.getInitialBalance());
		assertNull(form.getMinimumBalance());
		assertNull(form.getLoanProvider());
		assertNull(form.getLoanProcessor());
		assertNull(form.getLoanProcessorThreshold());
		assertNull(form.getAccessMode());

		// Then - assertions for result of method onSubmit(AdminForm, BindingResult, Model)
		assertNotNull(result);

		// Then - assertions for this instance of AdminController
		assertNull(underTest.getApplicationContext());
		assertEquals("aFormView", underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNull(underTest.getBankManager());
		assertNull(underTest.getValidator());
		assertNull(underTest.getAdminManager());
		assertNull(underTest.getLoanProvider());
		assertNull(underTest.getLoanProcessor());

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
	 * Parasoft Jtest UTA: Test for onSubmit(AdminForm, BindingResult, Model)
	 *
	 * @see com.parasoft.parabank.web.controller.AdminController#onSubmit(AdminForm, BindingResult, Model)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testOnSubmit2() throws Throwable {
		// Given
		AdminController underTest = new AdminController();
		String aFormView = "aFormView"; // UTA: default value
		underTest.setFormView(aFormView);

		// When
		AdminForm form = mockAdminForm();
		BindingResult errors = mockBindingResult2();
		Model model = mockModel2();
		ModelAndView result = underTest.onSubmit(form, errors, model);

		// Then - assertions for argument 1 of method onSubmit(AdminForm, BindingResult, Model)
		assertNull(form.getEndpoint());
		assertNull(form.getSoapEndpoint());
		assertNull(form.getRestEndpoint());
		assertNull(form.getInitialBalance());
		assertNull(form.getMinimumBalance());
		assertNull(form.getLoanProvider());
		assertNull(form.getLoanProcessor());
		assertNull(form.getLoanProcessorThreshold());
		assertNull(form.getAccessMode());

		// Then - assertions for result of method onSubmit(AdminForm, BindingResult, Model)
		assertNotNull(result);

		// Then - assertions for this instance of AdminController
		assertNull(underTest.getApplicationContext());
		assertEquals("aFormView", underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNull(underTest.getBankManager());
		assertNull(underTest.getValidator());
		assertNull(underTest.getAdminManager());
		assertNull(underTest.getLoanProvider());
		assertNull(underTest.getLoanProcessor());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AdminForm
	 */
	private static AdminForm mockAdminForm() throws Throwable {
		AdminForm form = mock(AdminForm.class);
		Map<String, String> getParametersResult = new HashMap<String, String>(); // UTA: default value
		doReturn(getParametersResult).when(form).getParameters();
		return form;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of BindingResult
	 */
	private static BindingResult mockBindingResult2() throws Throwable {
		BindingResult errors = mock(BindingResult.class);
		Map<String, Object> getModelResult = new HashMap<String, Object>(); // UTA: default value
		String key = "key"; // UTA: default value
		Object value = new Object(); // UTA: default value
		getModelResult.put(key, value);
		doReturn(getModelResult).when(errors).getModel();

		boolean hasErrorsResult = false; // UTA: provided value
		when(errors.hasErrors()).thenReturn(hasErrorsResult);
		return errors;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of Model
	 */
	private static Model mockModel2() throws Throwable {
		Model model = mock(Model.class);
		Map<String, Object> asMapResult = new HashMap<String, Object>(); // UTA: default value
		String key2 = "key2"; // UTA: default value
		Object value2 = new Object(); // UTA: default value
		asMapResult.put(key2, value2);
		doReturn(asMapResult).when(model).asMap();
		return model;
	}

	/**
	 * Parasoft Jtest UTA: Test for onSubmit(AdminForm, BindingResult, Model)
	 *
	 * @see com.parasoft.parabank.web.controller.AdminController#onSubmit(AdminForm, BindingResult, Model)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testOnSubmit3() throws Throwable {
		// Given
		AdminController underTest = new AdminController();
		AdminManager adminManager = mock(AdminManager.class);
		underTest.setAdminManager(adminManager);
		String aFormView = "aFormView"; // UTA: default value
		underTest.setFormView(aFormView);

		// When
		AdminForm form = mockAdminForm2();
		BindingResult errors = mockBindingResult3();
		Model model = mockModel3();
		ModelAndView result = underTest.onSubmit(form, errors, model);

		// Then - assertions for argument 1 of method onSubmit(AdminForm, BindingResult, Model)
		assertNull(form.getEndpoint());
		assertNull(form.getSoapEndpoint());
		assertNull(form.getRestEndpoint());
		assertNull(form.getInitialBalance());
		assertNull(form.getMinimumBalance());
		assertNull(form.getLoanProvider());
		assertNull(form.getLoanProcessor());
		assertNull(form.getLoanProcessorThreshold());
		assertNull(form.getAccessMode());

		// Then - assertions for result of method onSubmit(AdminForm, BindingResult, Model)
		assertNotNull(result);

		// Then - assertions for this instance of AdminController
		assertNull(underTest.getApplicationContext());
		assertEquals("aFormView", underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNull(underTest.getBankManager());
		assertNull(underTest.getValidator());
		assertNotNull(underTest.getAdminManager());
		assertNull(underTest.getLoanProvider());
		assertNull(underTest.getLoanProcessor());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AdminForm
	 */
	private static AdminForm mockAdminForm2() throws Throwable {
		AdminForm form = mock(AdminForm.class);
		Map<String, String> getParametersResult = new HashMap<String, String>(); // UTA: default value
		String key = "key"; // UTA: default value
		String value = "value"; // UTA: default value
		getParametersResult.put(key, value);
		doReturn(getParametersResult).when(form).getParameters();
		return form;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of BindingResult
	 */
	private static BindingResult mockBindingResult3() throws Throwable {
		BindingResult errors = mock(BindingResult.class);
		Map<String, Object> getModelResult = new HashMap<String, Object>(); // UTA: default value
		String key2 = "key2"; // UTA: default value
		Object value2 = new Object(); // UTA: default value
		getModelResult.put(key2, value2);
		doReturn(getModelResult).when(errors).getModel();

		boolean hasErrorsResult = false; // UTA: provided value
		when(errors.hasErrors()).thenReturn(hasErrorsResult);
		return errors;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of Model
	 */
	private static Model mockModel3() throws Throwable {
		Model model = mock(Model.class);
		Map<String, Object> asMapResult = new HashMap<String, Object>(); // UTA: default value
		String key3 = "key3"; // UTA: default value
		Object value3 = new Object(); // UTA: default value
		asMapResult.put(key3, value3);
		doReturn(asMapResult).when(model).asMap();
		return model;
	}

	/**
	 * Parasoft Jtest UTA: Test for getForm()
	 *
	 * @see com.parasoft.parabank.web.controller.AbstractBaseAdminController#getForm()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetForm() throws Throwable {
		// Given
		AdminController underTest = new AdminController();
		AdminManager adminManager = mock(AdminManager.class);
		underTest.setAdminManager(adminManager);

		// When
		AdminForm result = underTest.getForm();

		// Then - assertions for result of method getForm()
		assertNull(result);

		// Then - assertions for this instance of AdminController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNull(underTest.getBankManager());
		assertNull(underTest.getValidator());
		assertNotNull(underTest.getAdminManager());
		assertNull(underTest.getLoanProvider());
		assertNull(underTest.getLoanProcessor());

	}

	/**
	 * Parasoft Jtest UTA: Test for getLoanProcessor()
	 *
	 * @see com.parasoft.parabank.web.controller.AbstractBaseAdminController#getLoanProcessor()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetLoanProcessor() throws Throwable {
		// Given
		AdminController underTest = new AdminController();

		// When
		LoanProviderMapAware result = underTest.getLoanProcessor();

		// Then - assertions for result of method getLoanProcessor()
		assertNull(result);

		// Then - assertions for this instance of AdminController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNull(underTest.getBankManager());
		assertNull(underTest.getValidator());
		assertNull(underTest.getAdminManager());
		assertNull(underTest.getLoanProvider());

	}

	/**
	 * Parasoft Jtest UTA: Test for getLoanProcessors()
	 *
	 * @see com.parasoft.parabank.web.controller.AbstractBaseAdminController#getLoanProcessors()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetLoanProcessors() throws Throwable {
		// Given
		AdminController underTest = new AdminController();
		LoanProviderMapAware loanProcessor = mock(LoanProviderMapAware.class);
		underTest.setLoanProcessor(loanProcessor);

		// When
		Set<String> result = underTest.getLoanProcessors();

		// Then - assertions for result of method getLoanProcessors()
		assertNotNull(result);
		assertEquals(0, result.size());

		// Then - assertions for this instance of AdminController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNull(underTest.getBankManager());
		assertNull(underTest.getValidator());
		assertNull(underTest.getAdminManager());
		assertNull(underTest.getLoanProvider());
		assertNotNull(underTest.getLoanProcessor());

	}

	/**
	 * Parasoft Jtest UTA: Test for getLoanProvider()
	 *
	 * @see com.parasoft.parabank.web.controller.AbstractBaseAdminController#getLoanProvider()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetLoanProvider() throws Throwable {
		// Given
		AdminController underTest = new AdminController();

		// When
		LoanProviderMapAware result = underTest.getLoanProvider();

		// Then - assertions for result of method getLoanProvider()
		assertNull(result);

		// Then - assertions for this instance of AdminController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNull(underTest.getBankManager());
		assertNull(underTest.getValidator());
		assertNull(underTest.getAdminManager());
		assertNull(underTest.getLoanProcessor());

	}

	/**
	 * Parasoft Jtest UTA: Test for getProviderNames()
	 *
	 * @see com.parasoft.parabank.web.controller.AbstractBaseAdminController#getProviderNames()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetProviderNames() throws Throwable {
		// Given
		AdminController underTest = new AdminController();
		LoanProviderMapAware loanProvider = mock(LoanProviderMapAware.class);
		underTest.setLoanProvider(loanProvider);

		// When
		Set<String> result = underTest.getProviderNames();

		// Then - assertions for result of method getProviderNames()
		assertNotNull(result);
		assertEquals(0, result.size());

		// Then - assertions for this instance of AdminController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNull(underTest.getBankManager());
		assertNull(underTest.getValidator());
		assertNull(underTest.getAdminManager());
		assertNotNull(underTest.getLoanProvider());
		assertNull(underTest.getLoanProcessor());

	}

	/**
	 * Parasoft Jtest UTA: Test for isJmsListenerRunning()
	 *
	 * @see com.parasoft.parabank.web.controller.AbstractBaseAdminController#isJmsListenerRunning()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testIsJmsListenerRunning() throws Throwable {
		// Given
		AdminController underTest = new AdminController();
		AdminManager adminManager = mock(AdminManager.class);
		underTest.setAdminManager(adminManager);

		// When
		boolean result = underTest.isJmsListenerRunning();

		// Then - assertions for result of method isJmsListenerRunning()
		assertFalse(result);

		// Then - assertions for this instance of AdminController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNull(underTest.getBankManager());
		assertNull(underTest.getValidator());
		assertNotNull(underTest.getAdminManager());
		assertNull(underTest.getLoanProvider());
		assertNull(underTest.getLoanProcessor());

	}

	/**
	 * Parasoft Jtest UTA: Test for setAccessModeController(AccessModeController)
	 *
	 * @see com.parasoft.parabank.web.controller.AbstractBaseAdminController#setAccessModeController(AccessModeController)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetAccessModeController() throws Throwable {
		// Given
		AdminController underTest = new AdminController();

		// When
		AccessModeController aAccessModeController = mock(AccessModeController.class);
		underTest.setAccessModeController(aAccessModeController);

		// Then - assertions for this instance of AdminController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNull(underTest.getBankManager());
		assertNull(underTest.getValidator());
		assertNull(underTest.getAdminManager());
		assertNull(underTest.getLoanProvider());
		assertNull(underTest.getLoanProcessor());

	}

	/**
	 * Parasoft Jtest UTA: Test for setCommandClass(Class)
	 *
	 * @see com.parasoft.parabank.web.controller.AbstractBaseAdminController#setCommandClass(Class)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetCommandClass() throws Throwable {
		// Given
		AdminController underTest = new AdminController();

		// When
		Class aCommandClass = Class.forName("java.lang.Object"); // UTA: default value
		underTest.setCommandClass(aCommandClass);

		// Then - assertions for this instance of AdminController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertEquals(java.lang.Object.class, underTest.getCommandClass());
		assertNull(underTest.getBankManager());
		assertNull(underTest.getValidator());
		assertNull(underTest.getAdminManager());
		assertNull(underTest.getLoanProvider());
		assertNull(underTest.getLoanProcessor());

	}

	/**
	 * Parasoft Jtest UTA: Test for setValidator(Validator)
	 *
	 * @see com.parasoft.parabank.web.controller.AbstractBaseAdminController#setValidator(Validator)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetValidator() throws Throwable {
		// Given
		AdminController underTest = new AdminController();

		// When
		Validator aValidator = mock(Validator.class);
		underTest.setValidator(aValidator);

		// Then - assertions for this instance of AdminController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNull(underTest.getBankManager());
		assertNotNull(underTest.getValidator());
		assertNull(underTest.getAdminManager());
		assertNull(underTest.getLoanProvider());
		assertNull(underTest.getLoanProcessor());

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
		AdminController underTest = new AdminController();

		// When
		Validator result = underTest.getValidator();

		// Then - assertions for result of method getValidator()
		assertNull(result);

		// Then - assertions for this instance of AdminController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNull(underTest.getBankManager());
		assertNull(underTest.getAdminManager());
		assertNull(underTest.getLoanProvider());
		assertNull(underTest.getLoanProcessor());

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
		AdminController underTest = new AdminController();

		// When
		WebDataBinder binder = mock(WebDataBinder.class);
		underTest.initBinder(binder);

		// Then - assertions for this instance of AdminController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNull(underTest.getBankManager());
		assertNull(underTest.getValidator());
		assertNull(underTest.getAdminManager());
		assertNull(underTest.getLoanProvider());
		assertNull(underTest.getLoanProcessor());

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
		AdminController underTest = new AdminController();

		// When
		ApplicationContext result = underTest.getApplicationContext();

		// Then - assertions for result of method getApplicationContext()
		assertNull(result);

		// Then - assertions for this instance of AdminController
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNull(underTest.getBankManager());
		assertNull(underTest.getValidator());
		assertNull(underTest.getAdminManager());
		assertNull(underTest.getLoanProvider());
		assertNull(underTest.getLoanProcessor());

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
		AdminController underTest = new AdminController();

		// When
		BankManager result = underTest.getBankManager();

		// Then - assertions for result of method getBankManager()
		assertNull(result);

		// Then - assertions for this instance of AdminController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNull(underTest.getValidator());
		assertNull(underTest.getAdminManager());
		assertNull(underTest.getLoanProvider());
		assertNull(underTest.getLoanProcessor());

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
		AdminController underTest = new AdminController();

		// When
		Model model = mock(Model.class);
		Object result = underTest.getCommand(model);

		// Then - assertions for result of method getCommand(Model)
		assertNull(result);

		// Then - assertions for this instance of AdminController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getBankManager());
		assertNull(underTest.getValidator());
		assertNull(underTest.getAdminManager());
		assertNull(underTest.getLoanProvider());
		assertNull(underTest.getLoanProcessor());

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
		AdminController underTest = new AdminController();

		// When
		Class<?> result = underTest.getCommandClass();

		// Then - assertions for result of method getCommandClass()
		assertNull(result);

		// Then - assertions for this instance of AdminController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getBankManager());
		assertNull(underTest.getValidator());
		assertNull(underTest.getAdminManager());
		assertNull(underTest.getLoanProvider());
		assertNull(underTest.getLoanProcessor());

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
		AdminController underTest = new AdminController();
		String aCommandName = "aCommandName"; // UTA: default value
		underTest.setCommandName(aCommandName);

		// When
		Model model = mock(Model.class);
		Object command = new Object(); // UTA: default value
		Object result = underTest.prepCommand(model, command);

		// Then - assertions for result of method prepCommand(Model, Object)
		assertNotNull(result);

		// Then - assertions for this instance of AdminController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertEquals("aCommandName", underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNull(underTest.getBankManager());
		assertNull(underTest.getValidator());
		assertNull(underTest.getAdminManager());
		assertNull(underTest.getLoanProvider());
		assertNull(underTest.getLoanProcessor());

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
		AdminController underTest = new AdminController();
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

		// Then - assertions for this instance of AdminController
		assertNull(underTest.getApplicationContext());
		assertEquals("aFormView", underTest.getFormView());
		assertEquals("aCommandName", underTest.getCommandName());
		assertEquals(java.lang.Object.class, underTest.getCommandClass());
		assertNull(underTest.getBankManager());
		assertNull(underTest.getValidator());
		assertNull(underTest.getAdminManager());
		assertNull(underTest.getLoanProvider());
		assertNull(underTest.getLoanProcessor());

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
		AdminController underTest = new AdminController();

		// When
		ApplicationContext aApplicationContext = mock(ApplicationContext.class);
		underTest.setApplicationContext(aApplicationContext);

		// Then - assertions for this instance of AdminController
		assertNotNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNull(underTest.getBankManager());
		assertNull(underTest.getValidator());
		assertNull(underTest.getAdminManager());
		assertNull(underTest.getLoanProvider());
		assertNull(underTest.getLoanProcessor());

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
		AdminController underTest = new AdminController();

		// When
		BankManager bankManager = mock(BankManager.class);
		underTest.setBankManager(bankManager);

		// Then - assertions for this instance of AdminController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNotNull(underTest.getBankManager());
		assertNull(underTest.getValidator());
		assertNull(underTest.getAdminManager());
		assertNull(underTest.getLoanProvider());
		assertNull(underTest.getLoanProcessor());

	}
}