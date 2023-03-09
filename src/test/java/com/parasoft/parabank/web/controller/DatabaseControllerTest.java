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
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.servlet.ModelAndView;

/**
 * Parasoft Jtest UTA: Test class for DatabaseController
 *
 * @see com.parasoft.parabank.web.controller.DatabaseController
 * @author devtest
 */
public class DatabaseControllerTest {

	/**
	 * Parasoft Jtest UTA: Test for getForm()
	 *
	 * @see com.parasoft.parabank.web.controller.DatabaseController#getForm()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetForm() throws Throwable {
		// Given
		DatabaseController underTest = new DatabaseController();
		AdminManager adminManager = mock(AdminManager.class);
		underTest.setAdminManager(adminManager);

		// When
		AdminForm result = underTest.getForm();

		// Then - assertions for result of method getForm()
		assertNull(result);

		// Then - assertions for this instance of DatabaseController
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
	 * Parasoft Jtest UTA: Test for handleRequest(String, Model)
	 *
	 * @see com.parasoft.parabank.web.controller.DatabaseController#handleRequest(String, Model)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testHandleRequest() throws Throwable {
		// Given
		DatabaseController underTest = new DatabaseController();
		String aFormView = "aFormView"; // UTA: default value
		underTest.setFormView(aFormView);

		// When
		String action = "action"; // UTA: default value
		Model model = mockModel();
		ModelAndView result = underTest.handleRequest(action, model);

		// Then - assertions for result of method handleRequest(String, Model)
		assertNotNull(result);

		// Then - assertions for this instance of DatabaseController
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
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of Map
	 */
	private static Map<String, Object> mockMap() throws Throwable {
		Map<String, Object> asMapResult = mock(Map.class);
		AdminForm getResult = mock(AdminForm.class);
		when(asMapResult.get(nullable(Object.class))).thenReturn(getResult);
		return asMapResult;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of Model
	 */
	private static Model mockModel() throws Throwable {
		Model model = mock(Model.class);
		Map<String, Object> asMapResult = mockMap();
		doReturn(asMapResult).when(model).asMap();
		return model;
	}

	/**
	 * Parasoft Jtest UTA: Test for handleRequest(String, Model)
	 *
	 * @see com.parasoft.parabank.web.controller.DatabaseController#handleRequest(String, Model)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testHandleRequest2() throws Throwable {
		// Given
		DatabaseController underTest = new DatabaseController();
		String aFormView = "aFormView"; // UTA: default value
		underTest.setFormView(aFormView);

		// When
		String action = ""; // UTA: provided value
		Model model = mockModel2();
		ModelAndView result = underTest.handleRequest(action, model);

		// Then - assertions for result of method handleRequest(String, Model)
		assertNotNull(result);

		// Then - assertions for this instance of DatabaseController
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
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of Map
	 */
	private static Map<String, Object> mockMap2() throws Throwable {
		Map<String, Object> asMapResult = mock(Map.class);
		AdminForm getResult = mock(AdminForm.class);
		when(asMapResult.get(nullable(Object.class))).thenReturn(getResult);
		return asMapResult;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of Model
	 */
	private static Model mockModel2() throws Throwable {
		Model model = mock(Model.class);
		Map<String, Object> asMapResult = mockMap2();
		doReturn(asMapResult).when(model).asMap();
		return model;
	}

	/**
	 * Parasoft Jtest UTA: Test for handleRequest(String, Model)
	 *
	 * @see com.parasoft.parabank.web.controller.DatabaseController#handleRequest(String, Model)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testHandleRequest3() throws Throwable {
		// Given
		DatabaseController underTest = new DatabaseController();
		AdminManager adminManager = mock(AdminManager.class);
		underTest.setAdminManager(adminManager);
		String aFormView = "aFormView"; // UTA: default value
		underTest.setFormView(aFormView);

		// When
		String action = "init"; // UTA: provided value
		Model model = mockModel3();
		ModelAndView result = underTest.handleRequest(action, model);

		// Then - assertions for result of method handleRequest(String, Model)
		assertNotNull(result);

		// Then - assertions for this instance of DatabaseController
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
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of Map
	 */
	private static Map<String, Object> mockMap3() throws Throwable {
		Map<String, Object> asMapResult = mock(Map.class);
		AdminForm getResult = mock(AdminForm.class);
		when(asMapResult.get(nullable(Object.class))).thenReturn(getResult);
		return asMapResult;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of Model
	 */
	private static Model mockModel3() throws Throwable {
		Model model = mock(Model.class);
		Map<String, Object> asMapResult = mockMap3();
		doReturn(asMapResult).when(model).asMap();
		return model;
	}

	/**
	 * Parasoft Jtest UTA: Test for handleRequest(String, Model)
	 *
	 * @see com.parasoft.parabank.web.controller.DatabaseController#handleRequest(String, Model)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testHandleRequest4() throws Throwable {
		// Given
		DatabaseController underTest = new DatabaseController();
		AdminManager adminManager = mock(AdminManager.class);
		underTest.setAdminManager(adminManager);
		String aFormView = "aFormView"; // UTA: default value
		underTest.setFormView(aFormView);

		// When
		String action = "clean"; // UTA: provided value
		Model model = mockModel4();
		ModelAndView result = underTest.handleRequest(action, model);

		// Then - assertions for result of method handleRequest(String, Model)
		assertNotNull(result);

		// Then - assertions for this instance of DatabaseController
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
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of Map
	 */
	private static Map<String, Object> mockMap4() throws Throwable {
		Map<String, Object> asMapResult = mock(Map.class);
		AdminForm getResult = mock(AdminForm.class);
		when(asMapResult.get(nullable(Object.class))).thenReturn(getResult);
		return asMapResult;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of Model
	 */
	private static Model mockModel4() throws Throwable {
		Model model = mock(Model.class);
		Map<String, Object> asMapResult = mockMap4();
		doReturn(asMapResult).when(model).asMap();
		return model;
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
		DatabaseController underTest = new DatabaseController();

		// When
		LoanProviderMapAware result = underTest.getLoanProcessor();

		// Then - assertions for result of method getLoanProcessor()
		assertNull(result);

		// Then - assertions for this instance of DatabaseController
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
		DatabaseController underTest = new DatabaseController();
		LoanProviderMapAware loanProcessor = mock(LoanProviderMapAware.class);
		underTest.setLoanProcessor(loanProcessor);

		// When
		Set<String> result = underTest.getLoanProcessors();

		// Then - assertions for result of method getLoanProcessors()
		assertNotNull(result);
		assertEquals(0, result.size());

		// Then - assertions for this instance of DatabaseController
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
		DatabaseController underTest = new DatabaseController();

		// When
		LoanProviderMapAware result = underTest.getLoanProvider();

		// Then - assertions for result of method getLoanProvider()
		assertNull(result);

		// Then - assertions for this instance of DatabaseController
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
		DatabaseController underTest = new DatabaseController();
		LoanProviderMapAware loanProvider = mock(LoanProviderMapAware.class);
		underTest.setLoanProvider(loanProvider);

		// When
		Set<String> result = underTest.getProviderNames();

		// Then - assertions for result of method getProviderNames()
		assertNotNull(result);
		assertEquals(0, result.size());

		// Then - assertions for this instance of DatabaseController
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
		DatabaseController underTest = new DatabaseController();
		AdminManager adminManager = mock(AdminManager.class);
		underTest.setAdminManager(adminManager);

		// When
		boolean result = underTest.isJmsListenerRunning();

		// Then - assertions for result of method isJmsListenerRunning()
		assertFalse(result);

		// Then - assertions for this instance of DatabaseController
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
	 * Parasoft Jtest UTA: Test for saveAdminSettings(AdminForm)
	 *
	 * @see com.parasoft.parabank.web.controller.AbstractBaseAdminController#saveAdminSettings(AdminForm)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSaveAdminSettings() throws Throwable {
		// Given
		DatabaseController underTest = new DatabaseController();
		AdminManager adminManager = mock(AdminManager.class);
		underTest.setAdminManager(adminManager);

		// When
		AdminForm form = mockAdminForm();
		underTest.saveAdminSettings(form);

		// Then - assertions for argument 1 of method saveAdminSettings(AdminForm)
		assertNull(form.getEndpoint());
		assertNull(form.getSoapEndpoint());
		assertNull(form.getRestEndpoint());
		assertNull(form.getInitialBalance());
		assertNull(form.getMinimumBalance());
		assertNull(form.getLoanProvider());
		assertNull(form.getLoanProcessor());
		assertNull(form.getLoanProcessorThreshold());
		assertNull(form.getAccessMode());

		// Then - assertions for this instance of DatabaseController
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
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AdminForm
	 */
	private static AdminForm mockAdminForm() throws Throwable {
		AdminForm form = mock(AdminForm.class);
		Map<String, String> getParametersResult = new HashMap<String, String>(); // UTA: default value
		String key = "key"; // UTA: default value
		String value = "value"; // UTA: default value
		getParametersResult.put(key, value);
		doReturn(getParametersResult).when(form).getParameters();
		return form;
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
		DatabaseController underTest = new DatabaseController();

		// When
		AccessModeController aAccessModeController = mock(AccessModeController.class);
		underTest.setAccessModeController(aAccessModeController);

		// Then - assertions for this instance of DatabaseController
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
		DatabaseController underTest = new DatabaseController();

		// When
		Class aCommandClass = Class.forName("java.lang.Object"); // UTA: default value
		underTest.setCommandClass(aCommandClass);

		// Then - assertions for this instance of DatabaseController
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
	 * Parasoft Jtest UTA: Test for setCommandName(String)
	 *
	 * @see com.parasoft.parabank.web.controller.AbstractBaseAdminController#setCommandName(String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetCommandName() throws Throwable {
		// Given
		DatabaseController underTest = new DatabaseController();

		// When
		String aCommandName = "aCommandName"; // UTA: default value
		underTest.setCommandName(aCommandName);

		// Then - assertions for this instance of DatabaseController
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
	 * Parasoft Jtest UTA: Test for setValidator(Validator)
	 *
	 * @see com.parasoft.parabank.web.controller.AbstractBaseAdminController#setValidator(Validator)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetValidator() throws Throwable {
		// Given
		DatabaseController underTest = new DatabaseController();

		// When
		Validator aValidator = mock(Validator.class);
		underTest.setValidator(aValidator);

		// Then - assertions for this instance of DatabaseController
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
		DatabaseController underTest = new DatabaseController();

		// When
		Validator result = underTest.getValidator();

		// Then - assertions for result of method getValidator()
		assertNull(result);

		// Then - assertions for this instance of DatabaseController
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
		DatabaseController underTest = new DatabaseController();

		// When
		WebDataBinder binder = mock(WebDataBinder.class);
		underTest.initBinder(binder);

		// Then - assertions for this instance of DatabaseController
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
		DatabaseController underTest = new DatabaseController();

		// When
		ApplicationContext result = underTest.getApplicationContext();

		// Then - assertions for result of method getApplicationContext()
		assertNull(result);

		// Then - assertions for this instance of DatabaseController
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
		DatabaseController underTest = new DatabaseController();

		// When
		BankManager result = underTest.getBankManager();

		// Then - assertions for result of method getBankManager()
		assertNull(result);

		// Then - assertions for this instance of DatabaseController
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
		DatabaseController underTest = new DatabaseController();

		// When
		Model model = mock(Model.class);
		Object result = underTest.getCommand(model);

		// Then - assertions for result of method getCommand(Model)
		assertNull(result);

		// Then - assertions for this instance of DatabaseController
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
		DatabaseController underTest = new DatabaseController();

		// When
		Class<?> result = underTest.getCommandClass();

		// Then - assertions for result of method getCommandClass()
		assertNull(result);

		// Then - assertions for this instance of DatabaseController
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
		DatabaseController underTest = new DatabaseController();
		String aCommandName = "aCommandName"; // UTA: default value
		underTest.setCommandName(aCommandName);

		// When
		Model model = mock(Model.class);
		Object command = new Object(); // UTA: default value
		Object result = underTest.prepCommand(model, command);

		// Then - assertions for result of method prepCommand(Model, Object)
		assertNotNull(result);

		// Then - assertions for this instance of DatabaseController
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
		DatabaseController underTest = new DatabaseController();
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

		// Then - assertions for this instance of DatabaseController
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
	 * Parasoft Jtest UTA: Test for prepForm(Model)
	 *
	 * @see com.parasoft.parabank.web.controller.AbstractBankController#prepForm(Model)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testPrepForm2() throws Throwable {
		// Given
		DatabaseController underTest = new DatabaseController();
		Class aCommandClass = Class.forName("java.lang.Object"); // UTA: default value
		underTest.setCommandClass(aCommandClass);
		String aCommandName = "aCommandName"; // UTA: default value
		underTest.setCommandName(aCommandName);
		String aFormView = "aFormView"; // UTA: default value
		underTest.setFormView(aFormView);

		// When
		Model model = mockModel5();
		ModelAndView result = underTest.prepForm(model);

		// Then - assertions for result of method prepForm(Model)
		assertNotNull(result);

		// Then - assertions for this instance of DatabaseController
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
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of Model
	 */
	private static Model mockModel5() throws Throwable {
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
		DatabaseController underTest = new DatabaseController();

		// When
		ApplicationContext aApplicationContext = mock(ApplicationContext.class);
		underTest.setApplicationContext(aApplicationContext);

		// Then - assertions for this instance of DatabaseController
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
		DatabaseController underTest = new DatabaseController();

		// When
		BankManager bankManager = mock(BankManager.class);
		underTest.setBankManager(bankManager);

		// Then - assertions for this instance of DatabaseController
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