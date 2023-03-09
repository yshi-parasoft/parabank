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

import com.parasoft.parabank.domain.logic.BankManager;
import com.parasoft.parabank.util.AccessModeController;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

/**
 * Parasoft Jtest UTA: Test class for ChangeConnectionController
 *
 * @see com.parasoft.parabank.web.controller.ChangeConnectionController
 * @author devtest
 */
public class ChangeConnectionControllerTest {

	/**
	 * Parasoft Jtest UTA: Test for handleRequest(String, HttpSession)
	 *
	 * @see com.parasoft.parabank.web.controller.ChangeConnectionController#handleRequest(String, HttpSession)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testHandleRequest() throws Throwable {
		// Given
		ChangeConnectionController underTest = new ChangeConnectionController();

		// When
		String selected = null; // UTA: provided value
		HttpSession session = mockHttpSession();
		ModelAndView result = underTest.handleRequest(selected, session);

		// Then - assertions for result of method handleRequest(String, HttpSession)
		assertNotNull(result);

		// Then - assertions for this instance of ChangeConnectionController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNull(underTest.getBankManager());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of HttpSession
	 */
	private static HttpSession mockHttpSession() throws Throwable {
		HttpSession session = mock(HttpSession.class);
		Object getAttributeResult = new Object(); // UTA: default value
		when(session.getAttribute(nullable(String.class))).thenReturn(getAttributeResult);
		return session;
	}

	/**
	 * Parasoft Jtest UTA: Test for handleRequest(String, HttpSession)
	 *
	 * @see com.parasoft.parabank.web.controller.ChangeConnectionController#handleRequest(String, HttpSession)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testHandleRequest2() throws Throwable {
		// Given
		ChangeConnectionController underTest = new ChangeConnectionController();

		// When
		String selected = null; // UTA: provided value
		HttpSession session = mockHttpSession2();
		ModelAndView result = underTest.handleRequest(selected, session);

		// Then - assertions for result of method handleRequest(String, HttpSession)
		assertNotNull(result);

		// Then - assertions for this instance of ChangeConnectionController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNull(underTest.getBankManager());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of HttpSession
	 */
	private static HttpSession mockHttpSession2() throws Throwable {
		HttpSession session = mock(HttpSession.class);
		Object getAttributeResult = null; // UTA: provided value
		when(session.getAttribute(nullable(String.class))).thenReturn(getAttributeResult);
		return session;
	}

	/**
	 * Parasoft Jtest UTA: Test for handleRequest(String, HttpSession)
	 *
	 * @see com.parasoft.parabank.web.controller.ChangeConnectionController#handleRequest(String, HttpSession)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testHandleRequest3() throws Throwable {
		// Given
		ChangeConnectionController underTest = new ChangeConnectionController();

		// When
		String selected = "selected"; // UTA: default value
		HttpSession session = mockHttpSession3();
		ModelAndView result = underTest.handleRequest(selected, session);

		// Then - assertions for result of method handleRequest(String, HttpSession)
		assertNotNull(result);

		// Then - assertions for this instance of ChangeConnectionController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNull(underTest.getBankManager());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of HttpSession
	 */
	private static HttpSession mockHttpSession3() throws Throwable {
		HttpSession session = mock(HttpSession.class);
		Object getAttributeResult = new Object(); // UTA: default value
		when(session.getAttribute(nullable(String.class))).thenReturn(getAttributeResult);
		return session;
	}

	/**
	 * Parasoft Jtest UTA: Test for setAccessModeController(AccessModeController)
	 *
	 * @see com.parasoft.parabank.web.controller.ChangeConnectionController#setAccessModeController(AccessModeController)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetAccessModeController() throws Throwable {
		// Given
		ChangeConnectionController underTest = new ChangeConnectionController();

		// When
		AccessModeController aAccessModeController = mock(AccessModeController.class);
		underTest.setAccessModeController(aAccessModeController);

		// Then - assertions for this instance of ChangeConnectionController
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
		ChangeConnectionController underTest = new ChangeConnectionController();

		// When
		ApplicationContext result = underTest.getApplicationContext();

		// Then - assertions for result of method getApplicationContext()
		assertNull(result);

		// Then - assertions for this instance of ChangeConnectionController
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
		ChangeConnectionController underTest = new ChangeConnectionController();

		// When
		BankManager result = underTest.getBankManager();

		// Then - assertions for result of method getBankManager()
		assertNull(result);

		// Then - assertions for this instance of ChangeConnectionController
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
		ChangeConnectionController underTest = new ChangeConnectionController();

		// When
		Model model = mock(Model.class);
		Object result = underTest.getCommand(model);

		// Then - assertions for result of method getCommand(Model)
		assertNull(result);

		// Then - assertions for this instance of ChangeConnectionController
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
		ChangeConnectionController underTest = new ChangeConnectionController();

		// When
		Class<?> result = underTest.getCommandClass();

		// Then - assertions for result of method getCommandClass()
		assertNull(result);

		// Then - assertions for this instance of ChangeConnectionController
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
		ChangeConnectionController underTest = new ChangeConnectionController();

		// When
		String result = underTest.getFormView();

		// Then - assertions for result of method getFormView()
		assertNull(result);

		// Then - assertions for this instance of ChangeConnectionController
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
		ChangeConnectionController underTest = new ChangeConnectionController();
		String aCommandName = "aCommandName"; // UTA: default value
		underTest.setCommandName(aCommandName);

		// When
		Model model = mock(Model.class);
		Object command = new Object(); // UTA: default value
		Object result = underTest.prepCommand(model, command);

		// Then - assertions for result of method prepCommand(Model, Object)
		assertNotNull(result);

		// Then - assertions for this instance of ChangeConnectionController
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
		ChangeConnectionController underTest = new ChangeConnectionController();
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

		// Then - assertions for this instance of ChangeConnectionController
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
		ChangeConnectionController underTest = new ChangeConnectionController();
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

		// Then - assertions for this instance of ChangeConnectionController
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
		ChangeConnectionController underTest = new ChangeConnectionController();

		// When
		ApplicationContext aApplicationContext = mock(ApplicationContext.class);
		underTest.setApplicationContext(aApplicationContext);

		// Then - assertions for this instance of ChangeConnectionController
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
		ChangeConnectionController underTest = new ChangeConnectionController();

		// When
		BankManager bankManager = mock(BankManager.class);
		underTest.setBankManager(bankManager);

		// Then - assertions for this instance of ChangeConnectionController
		assertNull(underTest.getApplicationContext());
		assertNull(underTest.getFormView());
		assertNull(underTest.getCommandName());
		assertNull(underTest.getCommandClass());
		assertNotNull(underTest.getBankManager());

	}

}