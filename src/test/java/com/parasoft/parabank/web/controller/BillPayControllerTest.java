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
import com.parasoft.parabank.domain.Payee;
import com.parasoft.parabank.domain.logic.BankManager;
import com.parasoft.parabank.web.UserSession;
import com.parasoft.parabank.web.form.BillPayForm;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.junit.Test;
import org.springframework.context.MessageSource;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.servlet.ModelAndView;

/**
 * Parasoft Jtest UTA: Test class for BillPayController
 *
 * @see com.parasoft.parabank.web.controller.BillPayController
 * @author devtest
 */
public class BillPayControllerTest {

	/**
	 * Parasoft Jtest UTA: Test for getAccountIds(UserSession)
	 *
	 * @see com.parasoft.parabank.web.controller.BillPayController#getAccountIds(UserSession)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetAccountIds() throws Throwable {
		// Given
		BillPayController underTest = new BillPayController();
		BankManager bankManagerValue = mockBankManager();
		ReflectionTestUtils.setField(underTest, "bankManager", bankManagerValue);

		// When
		UserSession userSession = mock(UserSession.class);
		List<Integer> result = underTest.getAccountIds(userSession);

		// Then - assertions for argument 1 of method getAccountIds(UserSession)
		assertNull(userSession.getCustomer());

		// Then - assertions for result of method getAccountIds(UserSession)
		assertNotNull(result);
		assertEquals(0, result.size());

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
	 * @see com.parasoft.parabank.web.controller.BillPayController#getAccountIds(UserSession)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetAccountIds2() throws Throwable {
		// Given
		BillPayController underTest = new BillPayController();
		BankManager bankManagerValue = mockBankManager2();
		ReflectionTestUtils.setField(underTest, "bankManager", bankManagerValue);

		// When
		UserSession userSession = mock(UserSession.class);
		List<Integer> result = underTest.getAccountIds(userSession);

		// Then - assertions for argument 1 of method getAccountIds(UserSession)
		assertNull(userSession.getCustomer());

		// Then - assertions for result of method getAccountIds(UserSession)
		assertNotNull(result);
		assertEquals(1, result.size());

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
	 * Parasoft Jtest UTA: Test for getForm(Model)
	 *
	 * @see com.parasoft.parabank.web.controller.BillPayController#getForm(Model)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetForm() throws Throwable {
		// Given
		BillPayController underTest = new BillPayController();

		// When
		Model model = mockModel();
		ModelAndView result = underTest.getForm(model);

		// Then - assertions for result of method getForm(Model)
		assertNotNull(result);

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
	 * @see com.parasoft.parabank.web.controller.BillPayController#initBinder(WebDataBinder)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testInitBinder() throws Throwable {
		// Given
		BillPayController underTest = new BillPayController();

		// When
		WebDataBinder binder = mock(WebDataBinder.class);
		underTest.initBinder(binder);

	}

	/**
	 * Parasoft Jtest UTA: Test for onSubmit(BillPayForm, BindingResult, Model, java.util.Locale)
	 *
	 * @see com.parasoft.parabank.web.controller.BillPayController#onSubmit(BillPayForm, BindingResult, Model, java.util.Locale)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testOnSubmit() throws Throwable {
		// Given
		BillPayController underTest = new BillPayController();

		// When
		BillPayForm billPayForm = mock(BillPayForm.class);
		BindingResult errors = mockBindingResult();
		Model model = mock(Model.class);
		Locale locale = mock(Locale.class);
		ModelAndView result = underTest.onSubmit(billPayForm, errors, model, locale);

		// Then - assertions for argument 1 of method onSubmit(BillPayForm, BindingResult, Model, Locale)
		assertNull(billPayForm.getPayee());
		assertNull(billPayForm.getVerifyAccount());
		assertNull(billPayForm.getAmount());
		assertEquals(0, billPayForm.getFromAccountId());

		// Then - assertions for result of method onSubmit(BillPayForm, BindingResult, Model, Locale)
		assertNotNull(result);

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
	 * Parasoft Jtest UTA: Test for onSubmit(BillPayForm, BindingResult, Model, java.util.Locale)
	 *
	 * @see com.parasoft.parabank.web.controller.BillPayController#onSubmit(BillPayForm, BindingResult, Model, java.util.Locale)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testOnSubmit2() throws Throwable {
		// Given
		BillPayController underTest = new BillPayController();
		BankManager bankManagerValue = mock(BankManager.class);
		ReflectionTestUtils.setField(underTest, "bankManager", bankManagerValue);
		MessageSource messageSource = mockMessageSource();
		underTest.setMessageSource(messageSource);

		// When
		BillPayForm billPayForm = mockBillPayForm();
		BindingResult errors = mockBindingResult2();
		Model model = mock(Model.class);
		Locale locale = mock(Locale.class);
		ModelAndView result = underTest.onSubmit(billPayForm, errors, model, locale);

		// Then - assertions for argument 1 of method onSubmit(BillPayForm, BindingResult, Model, Locale)
		assertNull(billPayForm.getPayee());
		assertNull(billPayForm.getVerifyAccount());
		assertNull(billPayForm.getAmount());
		assertEquals(0, billPayForm.getFromAccountId());

		// Then - assertions for result of method onSubmit(BillPayForm, BindingResult, Model, Locale)
		assertNotNull(result);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of MessageSource
	 */
	private static MessageSource mockMessageSource() throws Throwable {
		MessageSource messageSource = mock(MessageSource.class);
		String getMessageResult = "getMessageResult"; // UTA: default value
		when(messageSource.getMessage(nullable(String.class), nullable(Object[].class), nullable(Locale.class)))
				.thenReturn(getMessageResult);
		return messageSource;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of Payee
	 */
	private static Payee mockPayee() throws Throwable {
		Payee getPayeeResult = mock(Payee.class);
		String getNameResult = "getNameResult"; // UTA: default value
		when(getPayeeResult.getName()).thenReturn(getNameResult);
		return getPayeeResult;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of BillPayForm
	 */
	private static BillPayForm mockBillPayForm() throws Throwable {
		BillPayForm billPayForm = mock(BillPayForm.class);
		BigDecimal getAmountResult = BigDecimal.ZERO; // UTA: default value
		when(billPayForm.getAmount()).thenReturn(getAmountResult);

		Payee getPayeeResult = mockPayee();
		when(billPayForm.getPayee()).thenReturn(getPayeeResult);
		return billPayForm;
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

}