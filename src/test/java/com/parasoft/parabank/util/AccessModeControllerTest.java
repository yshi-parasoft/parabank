/**
 * 
 */
package com.parasoft.parabank.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.ArgumentMatchers.nullable;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.parasoft.parabank.domain.Account;
import com.parasoft.parabank.domain.Address;
import com.parasoft.parabank.domain.Customer;
import com.parasoft.parabank.domain.LoanResponse;
import com.parasoft.parabank.domain.Payee;
import com.parasoft.parabank.domain.Transaction;
import com.parasoft.parabank.domain.TransactionCriteria;
import com.parasoft.parabank.domain.logic.AdminManager;
import com.parasoft.parabank.domain.logic.BankManager;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for AccessModeController
 *
 * @see com.parasoft.parabank.util.AccessModeController
 * @author devtest
 */
public class AccessModeControllerTest {

	/**
	 * Parasoft Jtest UTA: Test for appendQueryParam(StringBuilder, String, String)
	 *
	 * @see com.parasoft.parabank.util.AccessModeController#appendQueryParam(StringBuilder, String, String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testAppendQueryParam() throws Throwable {
		// Given
		AccessModeController underTest = new AccessModeController();

		// When
		StringBuilder sb = new StringBuilder(); // UTA: default value
		String name = "name"; // UTA: default value
		String value = "value"; // UTA: default value
		StringBuilder result = underTest.appendQueryParam(sb, name, value);

		// Then - assertions for result of method appendQueryParam(StringBuilder, String, String)
		assertNotNull(result);

	}

	/**
	 * Parasoft Jtest UTA: Test for createAccount(int, int, int)
	 *
	 * @see com.parasoft.parabank.util.AccessModeController#createAccount(int, int, int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testCreateAccount() throws Throwable {
		// Given
		AccessModeController underTest = new AccessModeController();
		AdminManager adminManager = mockAdminManager();
		underTest.setAdminManager(adminManager);

		// When
		int customerId = 0; // UTA: default value
		int newAccountType = 0; // UTA: default value
		int fromAccountId = 0; // UTA: default value
		Account result = underTest.createAccount(customerId, newAccountType, fromAccountId);

		// Then - assertions for result of method createAccount(int, int, int)
		assertNotNull(result);
		assertEquals(0, result.getId());
		assertEquals(0, result.getCustomerId());
		assertNull(result.getType());
		assertNull(result.getBalance());

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
	 * Parasoft Jtest UTA: Test for createAccount(int, int, int)
	 *
	 * @see com.parasoft.parabank.util.AccessModeController#createAccount(int, int, int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testCreateAccount2() throws Throwable {
		// Given
		AccessModeController underTest = new AccessModeController();
		AdminManager adminManager = mockAdminManager2();
		underTest.setAdminManager(adminManager);

		// When
		int customerId = 0; // UTA: default value
		int newAccountType = 0; // UTA: default value
		int fromAccountId = 0; // UTA: default value
		Account result = underTest.createAccount(customerId, newAccountType, fromAccountId);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AdminManager
	 */
	private static AdminManager mockAdminManager2() throws Throwable {
		AdminManager adminManager = mock(AdminManager.class);
		String getParameterResult = "restxml"; // UTA: provided value
		when(adminManager.getParameter(nullable(String.class))).thenReturn(getParameterResult);
		return adminManager;
	}

	/**
	 * Parasoft Jtest UTA: Test for doBillPay(int, BigDecimal, Payee)
	 *
	 * @see com.parasoft.parabank.util.AccessModeController#doBillPay(int, BigDecimal, Payee)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testDoBillPay() throws Throwable {
		// Given
		AccessModeController underTest = new AccessModeController();
		AdminManager adminManager = mockAdminManager3();
		underTest.setAdminManager(adminManager);

		// When
		int accountId = 0; // UTA: default value
		BigDecimal amount = BigDecimal.ZERO; // UTA: default value
		Payee payee = mock(Payee.class);
		underTest.doBillPay(accountId, amount, payee);

		// Then - assertions for argument 3 of method doBillPay(int, BigDecimal, Payee)
		assertNull(payee.getName());
		assertNull(payee.getAddress());
		assertNull(payee.getPhoneNumber());
		assertNull(payee.getAccountNumber());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AdminManager
	 */
	private static AdminManager mockAdminManager3() throws Throwable {
		AdminManager adminManager = mock(AdminManager.class);
		String getParameterResult = ""; // UTA: provided value
		when(adminManager.getParameter(nullable(String.class))).thenReturn(getParameterResult);
		return adminManager;
	}

	/**
	 * Parasoft Jtest UTA: Test for doBillPay(int, BigDecimal, Payee)
	 *
	 * @see com.parasoft.parabank.util.AccessModeController#doBillPay(int, BigDecimal, Payee)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testDoBillPay2() throws Throwable {
		// Given
		AccessModeController underTest = new AccessModeController();
		AdminManager adminManager = mockAdminManager4();
		underTest.setAdminManager(adminManager);

		// When
		int accountId = 0; // UTA: default value
		BigDecimal amount = BigDecimal.ZERO; // UTA: default value
		Payee payee = mock(Payee.class);
		underTest.doBillPay(accountId, amount, payee);

		// Then - assertions for argument 3 of method doBillPay(int, BigDecimal, Payee)
		assertNull(payee.getName());
		assertNull(payee.getAddress());
		assertNull(payee.getPhoneNumber());
		assertNull(payee.getAccountNumber());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AdminManager
	 */
	private static AdminManager mockAdminManager4() throws Throwable {
		AdminManager adminManager = mock(AdminManager.class);
		String getParameterResult = "restjson"; // UTA: provided value
		when(adminManager.getParameter(nullable(String.class))).thenReturn(getParameterResult);
		return adminManager;
	}

	/**
	 * Parasoft Jtest UTA: Test for doDBClean()
	 *
	 * @see com.parasoft.parabank.util.AccessModeController#doDBClean()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testDoDBClean() throws Throwable {
		// Given
		AccessModeController underTest = new AccessModeController();
		AdminManager adminManager = mockAdminManager5();
		underTest.setAdminManager(adminManager);

		// When
		underTest.doDBClean();

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AdminManager
	 */
	private static AdminManager mockAdminManager5() throws Throwable {
		AdminManager adminManager = mock(AdminManager.class);
		String getParameterResult = ""; // UTA: provided value
		when(adminManager.getParameter(nullable(String.class))).thenReturn(getParameterResult);
		return adminManager;
	}

	/**
	 * Parasoft Jtest UTA: Test for doDBClean()
	 *
	 * @see com.parasoft.parabank.util.AccessModeController#doDBClean()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testDoDBClean2() throws Throwable {
		// Given
		AccessModeController underTest = new AccessModeController();
		AdminManager adminManager = mockAdminManager6();
		underTest.setAdminManager(adminManager);

		// When
		underTest.doDBClean();

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AdminManager
	 */
	private static AdminManager mockAdminManager6() throws Throwable {
		AdminManager adminManager = mock(AdminManager.class);
		String getParameterResult = "restxml"; // UTA: provided value
		when(adminManager.getParameter(nullable(String.class))).thenReturn(getParameterResult);
		return adminManager;
	}

	/**
	 * Parasoft Jtest UTA: Test for doDBinit()
	 *
	 * @see com.parasoft.parabank.util.AccessModeController#doDBinit()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testDoDBinit() throws Throwable {
		// Given
		AccessModeController underTest = new AccessModeController();
		AdminManager adminManager = mockAdminManager7();
		underTest.setAdminManager(adminManager);

		// When
		underTest.doDBinit();

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AdminManager
	 */
	private static AdminManager mockAdminManager7() throws Throwable {
		AdminManager adminManager = mock(AdminManager.class);
		String getParameterResult = ""; // UTA: provided value
		when(adminManager.getParameter(nullable(String.class))).thenReturn(getParameterResult);
		return adminManager;
	}

	/**
	 * Parasoft Jtest UTA: Test for doDBinit()
	 *
	 * @see com.parasoft.parabank.util.AccessModeController#doDBinit()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testDoDBinit2() throws Throwable {
		// Given
		AccessModeController underTest = new AccessModeController();
		AdminManager adminManager = mockAdminManager8();
		underTest.setAdminManager(adminManager);

		// When
		underTest.doDBinit();

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AdminManager
	 */
	private static AdminManager mockAdminManager8() throws Throwable {
		AdminManager adminManager = mock(AdminManager.class);
		String getParameterResult = "restxml"; // UTA: provided value
		when(adminManager.getParameter(nullable(String.class))).thenReturn(getParameterResult);
		return adminManager;
	}

	/**
	 * Parasoft Jtest UTA: Test for doGetAccount(int)
	 *
	 * @see com.parasoft.parabank.util.AccessModeController#doGetAccount(int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testDoGetAccount() throws Throwable {
		// Given
		AccessModeController underTest = new AccessModeController();
		AdminManager adminManager = mockAdminManager9();
		underTest.setAdminManager(adminManager);

		// When
		int id = 0; // UTA: default value
		Account result = underTest.doGetAccount(id);

		// Then - assertions for result of method doGetAccount(int)
		assertNotNull(result);
		assertEquals(0, result.getId());
		assertEquals(0, result.getCustomerId());
		assertNull(result.getType());
		assertNull(result.getBalance());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AdminManager
	 */
	private static AdminManager mockAdminManager9() throws Throwable {
		AdminManager adminManager = mock(AdminManager.class);
		String getParameterResult = ""; // UTA: provided value
		when(adminManager.getParameter(nullable(String.class))).thenReturn(getParameterResult);
		return adminManager;
	}

	/**
	 * Parasoft Jtest UTA: Test for doGetAccounts(Customer)
	 *
	 * @see com.parasoft.parabank.util.AccessModeController#doGetAccounts(Customer)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testDoGetAccounts() throws Throwable {
		// Given
		AccessModeController underTest = new AccessModeController();
		AdminManager adminManager = mockAdminManager10();
		underTest.setAdminManager(adminManager);

		// When
		Customer customer = mock(Customer.class);
		List<Account> result = underTest.doGetAccounts(customer);

		// Then - assertions for argument 1 of method doGetAccounts(Customer)
		assertEquals(0, customer.getId());
		assertNull(customer.getFirstName());
		assertNull(customer.getLastName());
		assertNull(customer.getAddress());
		assertNull(customer.getPhoneNumber());
		assertNull(customer.getSsn());
		assertNull(customer.getUsername());
		assertNull(customer.getPassword());

		// Then - assertions for result of method doGetAccounts(Customer)
		assertNotNull(result);
		assertEquals(0, result.size());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AdminManager
	 */
	private static AdminManager mockAdminManager10() throws Throwable {
		AdminManager adminManager = mock(AdminManager.class);
		String getParameterResult = ""; // UTA: provided value
		when(adminManager.getParameter(nullable(String.class))).thenReturn(getParameterResult);
		return adminManager;
	}

	/**
	 * Parasoft Jtest UTA: Test for doGetCustomer(int)
	 *
	 * @see com.parasoft.parabank.util.AccessModeController#doGetCustomer(int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testDoGetCustomer() throws Throwable {
		// Given
		AccessModeController underTest = new AccessModeController();
		AdminManager adminManager = mockAdminManager11();
		underTest.setAdminManager(adminManager);

		// When
		int custId = 0; // UTA: default value
		Customer result = underTest.doGetCustomer(custId);

		// Then - assertions for result of method doGetCustomer(int)
		assertNull(result);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AdminManager
	 */
	private static AdminManager mockAdminManager11() throws Throwable {
		AdminManager adminManager = mock(AdminManager.class);
		String getParameterResult = ""; // UTA: provided value
		when(adminManager.getParameter(nullable(String.class))).thenReturn(getParameterResult);
		return adminManager;
	}

	/**
	 * Parasoft Jtest UTA: Test for doGetTransaction(int)
	 *
	 * @see com.parasoft.parabank.util.AccessModeController#doGetTransaction(int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testDoGetTransaction() throws Throwable {
		// Given
		AccessModeController underTest = new AccessModeController();
		AdminManager adminManager = mockAdminManager12();
		underTest.setAdminManager(adminManager);

		// When
		int id = 0; // UTA: default value
		Transaction result = underTest.doGetTransaction(id);

		// Then - assertions for result of method doGetTransaction(int)
		assertNull(result);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AdminManager
	 */
	private static AdminManager mockAdminManager12() throws Throwable {
		AdminManager adminManager = mock(AdminManager.class);
		String getParameterResult = ""; // UTA: provided value
		when(adminManager.getParameter(nullable(String.class))).thenReturn(getParameterResult);
		return adminManager;
	}

	/**
	 * Parasoft Jtest UTA: Test for doGetTransactions(int)
	 *
	 * @see com.parasoft.parabank.util.AccessModeController#doGetTransactions(int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testDoGetTransactions() throws Throwable {
		// Given
		AccessModeController underTest = new AccessModeController();
		AdminManager adminManager = mockAdminManager13();
		underTest.setAdminManager(adminManager);

		// When
		int accountId = 0; // UTA: default value
		List<Transaction> result = underTest.doGetTransactions(accountId);

		// Then - assertions for result of method doGetTransactions(int)
		assertNotNull(result);
		assertEquals(0, result.size());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AdminManager
	 */
	private static AdminManager mockAdminManager13() throws Throwable {
		AdminManager adminManager = mock(AdminManager.class);
		String getParameterResult = ""; // UTA: provided value
		when(adminManager.getParameter(nullable(String.class))).thenReturn(getParameterResult);
		return adminManager;
	}

	/**
	 * Parasoft Jtest UTA: Test for doRequestLoan(int, BigDecimal, BigDecimal, int)
	 *
	 * @see com.parasoft.parabank.util.AccessModeController#doRequestLoan(int, BigDecimal, BigDecimal, int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testDoRequestLoan() throws Throwable {
		// Given
		AccessModeController underTest = new AccessModeController();
		AdminManager adminManager = mockAdminManager14();
		underTest.setAdminManager(adminManager);

		// When
		int custid = 0; // UTA: default value
		BigDecimal amt = BigDecimal.ZERO; // UTA: default value
		BigDecimal dwnpay = BigDecimal.ZERO; // UTA: default value
		int frmaccid = 0; // UTA: default value
		LoanResponse result = underTest.doRequestLoan(custid, amt, dwnpay, frmaccid);

		// Then - assertions for result of method doRequestLoan(int, BigDecimal, BigDecimal, int)
		assertNull(result);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AdminManager
	 */
	private static AdminManager mockAdminManager14() throws Throwable {
		AdminManager adminManager = mock(AdminManager.class);
		String getParameterResult = ""; // UTA: provided value
		when(adminManager.getParameter(nullable(String.class))).thenReturn(getParameterResult);
		return adminManager;
	}

	/**
	 * Parasoft Jtest UTA: Test for doRequestLoan(int, BigDecimal, BigDecimal, int)
	 *
	 * @see com.parasoft.parabank.util.AccessModeController#doRequestLoan(int, BigDecimal, BigDecimal, int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testDoRequestLoan2() throws Throwable {
		// Given
		AccessModeController underTest = new AccessModeController();
		AdminManager adminManager = mockAdminManager15();
		underTest.setAdminManager(adminManager);

		// When
		int custid = 0; // UTA: default value
		BigDecimal amt = BigDecimal.ZERO; // UTA: default value
		BigDecimal dwnpay = BigDecimal.ZERO; // UTA: default value
		int frmaccid = 0; // UTA: default value
		LoanResponse result = underTest.doRequestLoan(custid, amt, dwnpay, frmaccid);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AdminManager
	 */
	private static AdminManager mockAdminManager15() throws Throwable {
		AdminManager adminManager = mock(AdminManager.class);
		String getParameterResult = "restxml"; // UTA: provided value
		when(adminManager.getParameter(nullable(String.class))).thenReturn(getParameterResult);
		return adminManager;
	}

	/**
	 * Parasoft Jtest UTA: Test for doTransfer(int, int, BigDecimal)
	 *
	 * @see com.parasoft.parabank.util.AccessModeController#doTransfer(int, int, BigDecimal)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testDoTransfer() throws Throwable {
		// Given
		AccessModeController underTest = new AccessModeController();
		AdminManager adminManager = mockAdminManager16();
		underTest.setAdminManager(adminManager);

		// When
		int fromAccountId = 0; // UTA: default value
		int toAccountId = 0; // UTA: default value
		BigDecimal amount = BigDecimal.ZERO; // UTA: default value
		underTest.doTransfer(fromAccountId, toAccountId, amount);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AdminManager
	 */
	private static AdminManager mockAdminManager16() throws Throwable {
		AdminManager adminManager = mock(AdminManager.class);
		String getParameterResult = ""; // UTA: provided value
		String getParameterResult2 = "getParameterResult2"; // UTA: default value
		when(adminManager.getParameter(nullable(String.class))).thenReturn(getParameterResult, getParameterResult2);
		return adminManager;
	}

	/**
	 * Parasoft Jtest UTA: Test for doTransfer(int, int, BigDecimal)
	 *
	 * @see com.parasoft.parabank.util.AccessModeController#doTransfer(int, int, BigDecimal)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testDoTransfer2() throws Throwable {
		// Given
		AccessModeController underTest = new AccessModeController();
		AdminManager adminManager = mockAdminManager17();
		underTest.setAdminManager(adminManager);

		// When
		int fromAccountId = 0; // UTA: default value
		int toAccountId = 0; // UTA: default value
		BigDecimal amount = BigDecimal.ZERO; // UTA: default value
		underTest.doTransfer(fromAccountId, toAccountId, amount);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AdminManager
	 */
	private static AdminManager mockAdminManager17() throws Throwable {
		AdminManager adminManager = mock(AdminManager.class);
		String getParameterResult = "restjson"; // UTA: provided value
		String getParameterResult2 = "getParameterResult2"; // UTA: default value
		when(adminManager.getParameter(nullable(String.class))).thenReturn(getParameterResult, getParameterResult2);
		return adminManager;
	}

	/**
	 * Parasoft Jtest UTA: Test for doTransfer(int, int, BigDecimal)
	 *
	 * @see com.parasoft.parabank.util.AccessModeController#doTransfer(int, int, BigDecimal)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testDoTransfer3() throws Throwable {
		// Given
		AccessModeController underTest = new AccessModeController();
		AdminManager adminManager = mockAdminManager18();
		underTest.setAdminManager(adminManager);

		// When
		int fromAccountId = 0; // UTA: default value
		int toAccountId = 0; // UTA: default value
		BigDecimal amount = BigDecimal.ZERO; // UTA: default value
		underTest.doTransfer(fromAccountId, toAccountId, amount);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AdminManager
	 */
	private static AdminManager mockAdminManager18() throws Throwable {
		AdminManager adminManager = mock(AdminManager.class);
		String getParameterResult = "soap"; // UTA: provided value
		when(adminManager.getParameter(nullable(String.class))).thenReturn(getParameterResult);
		return adminManager;
	}

	/**
	 * Parasoft Jtest UTA: Test for getTransactionsForAccount(Account, TransactionCriteria)
	 *
	 * @see com.parasoft.parabank.util.AccessModeController#getTransactionsForAccount(Account, TransactionCriteria)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetTransactionsForAccount() throws Throwable {
		// Given
		AccessModeController underTest = new AccessModeController();
		AdminManager adminManager = mockAdminManager19();
		underTest.setAdminManager(adminManager);

		// When
		Account account = mock(Account.class);
		TransactionCriteria criteria = null; // UTA: provided value
		List<Transaction> result = underTest.getTransactionsForAccount(account, criteria);

		// Then - assertions for argument 1 of method getTransactionsForAccount(Account, TransactionCriteria)
		assertEquals(0, account.getId());
		assertEquals(0, account.getCustomerId());
		assertNull(account.getType());
		assertNull(account.getBalance());

		// Then - assertions for result of method getTransactionsForAccount(Account, TransactionCriteria)
		assertNotNull(result);
		assertEquals(0, result.size());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AdminManager
	 */
	private static AdminManager mockAdminManager19() throws Throwable {
		AdminManager adminManager = mock(AdminManager.class);
		String getParameterResult = ""; // UTA: provided value
		when(adminManager.getParameter(nullable(String.class))).thenReturn(getParameterResult);
		return adminManager;
	}

	/**
	 * Parasoft Jtest UTA: Test for getTransactionsForAccount(Account, TransactionCriteria)
	 *
	 * @see com.parasoft.parabank.util.AccessModeController#getTransactionsForAccount(Account, TransactionCriteria)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetTransactionsForAccount2() throws Throwable {
		// Given
		AccessModeController underTest = new AccessModeController();
		AdminManager adminManager = mockAdminManager20();
		underTest.setAdminManager(adminManager);

		// When
		Account account = mock(Account.class);
		TransactionCriteria criteria = mockTransactionCriteria();
		List<Transaction> result = underTest.getTransactionsForAccount(account, criteria);

		// Then - assertions for argument 2 of method getTransactionsForAccount(Account, TransactionCriteria)
		assertNull(criteria.getMonth());
		assertNull(criteria.getTransactionType());
		assertNull(criteria.getTransactionId());
		assertNull(criteria.getOnDate());
		assertNull(criteria.getFromDate());
		assertNull(criteria.getToDate());
		assertNull(criteria.getAmount());
		assertNull(criteria.getSearchType());

		// Then - assertions for argument 1 of method getTransactionsForAccount(Account, TransactionCriteria)
		assertEquals(0, account.getId());
		assertEquals(0, account.getCustomerId());
		assertNull(account.getType());
		assertNull(account.getBalance());

		// Then - assertions for result of method getTransactionsForAccount(Account, TransactionCriteria)
		assertNotNull(result);
		assertEquals(1, result.size());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AdminManager
	 */
	private static AdminManager mockAdminManager20() throws Throwable {
		AdminManager adminManager = mock(AdminManager.class);
		String getParameterResult = ""; // UTA: provided value
		when(adminManager.getParameter(nullable(String.class))).thenReturn(getParameterResult);
		return adminManager;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of TransactionCriteria
	 */
	private static TransactionCriteria mockTransactionCriteria() throws Throwable {
		TransactionCriteria criteria = mock(TransactionCriteria.class);
		Integer getTransactionIdResult = 0; // UTA: default value
		when(criteria.getTransactionId()).thenReturn(getTransactionIdResult);
		return criteria;
	}

	/**
	 * Parasoft Jtest UTA: Test for getTransactionsForAccount(Account, TransactionCriteria)
	 *
	 * @see com.parasoft.parabank.util.AccessModeController#getTransactionsForAccount(Account, TransactionCriteria)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetTransactionsForAccount3() throws Throwable {
		// Given
		AccessModeController underTest = new AccessModeController();
		AdminManager adminManager = mockAdminManager21();
		underTest.setAdminManager(adminManager);

		// When
		Account account = mock(Account.class);
		TransactionCriteria criteria = null; // UTA: provided value
		List<Transaction> result = underTest.getTransactionsForAccount(account, criteria);

		// Then - assertions for argument 1 of method getTransactionsForAccount(Account, TransactionCriteria)
		assertEquals(0, account.getId());
		assertEquals(0, account.getCustomerId());
		assertNull(account.getType());
		assertNull(account.getBalance());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AdminManager
	 */
	private static AdminManager mockAdminManager21() throws Throwable {
		AdminManager adminManager = mock(AdminManager.class);
		String getParameterResult = "restxml"; // UTA: provided value
		String getParameterResult2 = "getParameterResult2"; // UTA: default value
		when(adminManager.getParameter(nullable(String.class))).thenReturn(getParameterResult, getParameterResult2);
		return adminManager;
	}

	/**
	 * Parasoft Jtest UTA: Test for getTransactionsForAccount(Account, TransactionCriteria)
	 *
	 * @see com.parasoft.parabank.util.AccessModeController#getTransactionsForAccount(Account, TransactionCriteria)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetTransactionsForAccount4() throws Throwable {
		// Given
		AccessModeController underTest = new AccessModeController();
		AdminManager adminManager = mockAdminManager22();
		underTest.setAdminManager(adminManager);

		// When
		Account account = mock(Account.class);
		TransactionCriteria criteria = mockTransactionCriteria2();
		List<Transaction> result = underTest.getTransactionsForAccount(account, criteria);

		// Then - assertions for argument 2 of method getTransactionsForAccount(Account, TransactionCriteria)
		assertNull(criteria.getMonth());
		assertNull(criteria.getTransactionType());
		assertNull(criteria.getTransactionId());
		assertNull(criteria.getOnDate());
		assertNull(criteria.getFromDate());
		assertNull(criteria.getToDate());
		assertNull(criteria.getAmount());
		assertNull(criteria.getSearchType());

		// Then - assertions for argument 1 of method getTransactionsForAccount(Account, TransactionCriteria)
		assertEquals(0, account.getId());
		assertEquals(0, account.getCustomerId());
		assertNull(account.getType());
		assertNull(account.getBalance());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AdminManager
	 */
	private static AdminManager mockAdminManager22() throws Throwable {
		AdminManager adminManager = mock(AdminManager.class);
		String getParameterResult = "soap"; // UTA: provided value
		when(adminManager.getParameter(nullable(String.class))).thenReturn(getParameterResult);
		return adminManager;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of TransactionCriteria
	 */
	private static TransactionCriteria mockTransactionCriteria2() throws Throwable {
		TransactionCriteria criteria = mock(TransactionCriteria.class);
		Integer getTransactionIdResult = 0; // UTA: default value
		when(criteria.getTransactionId()).thenReturn(getTransactionIdResult);
		return criteria;
	}

	/**
	 * Parasoft Jtest UTA: Test for getTransactionsForAccount(Account, TransactionCriteria)
	 *
	 * @see com.parasoft.parabank.util.AccessModeController#getTransactionsForAccount(Account, TransactionCriteria)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetTransactionsForAccount5() throws Throwable {
		// Given
		AccessModeController underTest = new AccessModeController();
		AdminManager adminManager = mockAdminManager23();
		underTest.setAdminManager(adminManager);

		// When
		Account account = mock(Account.class);
		TransactionCriteria criteria = mockTransactionCriteria3();
		List<Transaction> result = underTest.getTransactionsForAccount(account, criteria);

		// Then - assertions for argument 2 of method getTransactionsForAccount(Account, TransactionCriteria)
		assertNull(criteria.getMonth());
		assertNull(criteria.getTransactionType());
		assertNull(criteria.getTransactionId());
		assertNull(criteria.getOnDate());
		assertNull(criteria.getFromDate());
		assertNull(criteria.getToDate());
		assertNull(criteria.getAmount());
		assertNull(criteria.getSearchType());

		// Then - assertions for argument 1 of method getTransactionsForAccount(Account, TransactionCriteria)
		assertEquals(0, account.getId());
		assertEquals(0, account.getCustomerId());
		assertNull(account.getType());
		assertNull(account.getBalance());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AdminManager
	 */
	private static AdminManager mockAdminManager23() throws Throwable {
		AdminManager adminManager = mock(AdminManager.class);
		String getParameterResult = "soap"; // UTA: provided value
		when(adminManager.getParameter(nullable(String.class))).thenReturn(getParameterResult);
		return adminManager;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of TransactionCriteria
	 */
	private static TransactionCriteria mockTransactionCriteria3() throws Throwable {
		TransactionCriteria criteria = mock(TransactionCriteria.class);
		BigDecimal getAmountResult = BigDecimal.ZERO; // UTA: default value
		when(criteria.getAmount()).thenReturn(getAmountResult);

		Integer getTransactionIdResult = null; // UTA: provided value
		when(criteria.getTransactionId()).thenReturn(getTransactionIdResult);
		return criteria;
	}

	/**
	 * Parasoft Jtest UTA: Test for getTransactionsForAccount(Account, TransactionCriteria)
	 *
	 * @see com.parasoft.parabank.util.AccessModeController#getTransactionsForAccount(Account, TransactionCriteria)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetTransactionsForAccount6() throws Throwable {
		// Given
		AccessModeController underTest = new AccessModeController();
		AdminManager adminManager = mockAdminManager24();
		underTest.setAdminManager(adminManager);

		// When
		Account account = mock(Account.class);
		TransactionCriteria criteria = mockTransactionCriteria4();
		List<Transaction> result = underTest.getTransactionsForAccount(account, criteria);

		// Then - assertions for argument 2 of method getTransactionsForAccount(Account, TransactionCriteria)
		assertNull(criteria.getMonth());
		assertNull(criteria.getTransactionType());
		assertNull(criteria.getTransactionId());
		assertNull(criteria.getOnDate());
		assertNull(criteria.getFromDate());
		assertNull(criteria.getToDate());
		assertNull(criteria.getAmount());
		assertNull(criteria.getSearchType());

		// Then - assertions for argument 1 of method getTransactionsForAccount(Account, TransactionCriteria)
		assertEquals(0, account.getId());
		assertEquals(0, account.getCustomerId());
		assertNull(account.getType());
		assertNull(account.getBalance());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AdminManager
	 */
	private static AdminManager mockAdminManager24() throws Throwable {
		AdminManager adminManager = mock(AdminManager.class);
		String getParameterResult = "restjson"; // UTA: provided value
		when(adminManager.getParameter(nullable(String.class))).thenReturn(getParameterResult);
		return adminManager;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of TransactionCriteria
	 */
	private static TransactionCriteria mockTransactionCriteria4() throws Throwable {
		TransactionCriteria criteria = mock(TransactionCriteria.class);
		BigDecimal getAmountResult = null; // UTA: provided value
		when(criteria.getAmount()).thenReturn(getAmountResult);

		Date getFromDateResult = mock(Date.class);
		when(criteria.getFromDate()).thenReturn(getFromDateResult);

		Date getOnDateResult = null; // UTA: provided value
		when(criteria.getOnDate()).thenReturn(getOnDateResult);

		Date getToDateResult = mock(Date.class);
		when(criteria.getToDate()).thenReturn(getToDateResult);

		Integer getTransactionIdResult = null; // UTA: provided value
		when(criteria.getTransactionId()).thenReturn(getTransactionIdResult);
		return criteria;
	}

	/**
	 * Parasoft Jtest UTA: Test for getTransactionsForAccount(Account, TransactionCriteria)
	 *
	 * @see com.parasoft.parabank.util.AccessModeController#getTransactionsForAccount(Account, TransactionCriteria)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetTransactionsForAccount7() throws Throwable {
		// Given
		AccessModeController underTest = new AccessModeController();
		AdminManager adminManager = mockAdminManager25();
		underTest.setAdminManager(adminManager);

		// When
		Account account = mock(Account.class);
		TransactionCriteria criteria = mockTransactionCriteria5();
		List<Transaction> result = underTest.getTransactionsForAccount(account, criteria);

		// Then - assertions for argument 2 of method getTransactionsForAccount(Account, TransactionCriteria)
		assertNull(criteria.getMonth());
		assertNull(criteria.getTransactionType());
		assertNull(criteria.getTransactionId());
		assertNull(criteria.getOnDate());
		assertNull(criteria.getFromDate());
		assertNull(criteria.getToDate());
		assertNull(criteria.getAmount());
		assertNull(criteria.getSearchType());

		// Then - assertions for argument 1 of method getTransactionsForAccount(Account, TransactionCriteria)
		assertEquals(0, account.getId());
		assertEquals(0, account.getCustomerId());
		assertNull(account.getType());
		assertNull(account.getBalance());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AdminManager
	 */
	private static AdminManager mockAdminManager25() throws Throwable {
		AdminManager adminManager = mock(AdminManager.class);
		String getParameterResult = "restjson"; // UTA: provided value
		when(adminManager.getParameter(nullable(String.class))).thenReturn(getParameterResult);
		return adminManager;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of TransactionCriteria
	 */
	private static TransactionCriteria mockTransactionCriteria5() throws Throwable {
		TransactionCriteria criteria = mock(TransactionCriteria.class);
		BigDecimal getAmountResult = null; // UTA: provided value
		when(criteria.getAmount()).thenReturn(getAmountResult);

		Date getFromDateResult = null; // UTA: provided value
		when(criteria.getFromDate()).thenReturn(getFromDateResult);

		String getMonthResult = null; // UTA: provided value
		when(criteria.getMonth()).thenReturn(getMonthResult);

		Date getOnDateResult = null; // UTA: provided value
		when(criteria.getOnDate()).thenReturn(getOnDateResult);

		Integer getTransactionIdResult = null; // UTA: provided value
		when(criteria.getTransactionId()).thenReturn(getTransactionIdResult);
		return criteria;
	}

	/**
	 * Parasoft Jtest UTA: Test for getTransactionsForAccount(Account, TransactionCriteria)
	 *
	 * @see com.parasoft.parabank.util.AccessModeController#getTransactionsForAccount(Account, TransactionCriteria)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetTransactionsForAccount8() throws Throwable {
		// Given
		AccessModeController underTest = new AccessModeController();
		AdminManager adminManager = mockAdminManager26();
		underTest.setAdminManager(adminManager);

		// When
		Account account = mock(Account.class);
		TransactionCriteria criteria = mockTransactionCriteria6();
		List<Transaction> result = underTest.getTransactionsForAccount(account, criteria);

		// Then - assertions for argument 2 of method getTransactionsForAccount(Account, TransactionCriteria)
		assertNull(criteria.getMonth());
		assertNull(criteria.getTransactionType());
		assertNull(criteria.getTransactionId());
		assertNull(criteria.getOnDate());
		assertNull(criteria.getFromDate());
		assertNull(criteria.getToDate());
		assertNull(criteria.getAmount());
		assertNull(criteria.getSearchType());

		// Then - assertions for argument 1 of method getTransactionsForAccount(Account, TransactionCriteria)
		assertEquals(0, account.getId());
		assertEquals(0, account.getCustomerId());
		assertNull(account.getType());
		assertNull(account.getBalance());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AdminManager
	 */
	private static AdminManager mockAdminManager26() throws Throwable {
		AdminManager adminManager = mock(AdminManager.class);
		String getParameterResult = "restxml"; // UTA: provided value
		when(adminManager.getParameter(nullable(String.class))).thenReturn(getParameterResult);
		return adminManager;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of TransactionCriteria
	 */
	private static TransactionCriteria mockTransactionCriteria6() throws Throwable {
		TransactionCriteria criteria = mock(TransactionCriteria.class);
		BigDecimal getAmountResult = null; // UTA: provided value
		when(criteria.getAmount()).thenReturn(getAmountResult);

		Date getOnDateResult = mock(Date.class);
		when(criteria.getOnDate()).thenReturn(getOnDateResult);

		Integer getTransactionIdResult = null; // UTA: provided value
		when(criteria.getTransactionId()).thenReturn(getTransactionIdResult);
		return criteria;
	}

	/**
	 * Parasoft Jtest UTA: Test for login(String, String)
	 *
	 * @see com.parasoft.parabank.util.AccessModeController#login(String, String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testLogin() throws Throwable {
		// Given
		AccessModeController underTest = new AccessModeController();
		BankManager bankManager = mockBankManager();
		underTest.setBankManager(bankManager);

		// When
		String username = "username"; // UTA: default value
		String password = "password"; // UTA: default value
		Customer result = underTest.login(username, password);

		// Then - assertions for result of method login(String, String)
		assertNotNull(result);
		assertEquals(0, result.getId());
		assertNull(result.getFirstName());
		assertNull(result.getLastName());
		assertNull(result.getAddress());
		assertNull(result.getPhoneNumber());
		assertNull(result.getSsn());
		assertNull(result.getUsername());
		assertNull(result.getPassword());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of BankManager
	 */
	private static BankManager mockBankManager() throws Throwable {
		BankManager bankManager = mock(BankManager.class);
		Customer getCustomerResult = mock(Customer.class);
		when(bankManager.getCustomer(nullable(String.class), nullable(String.class))).thenReturn(getCustomerResult);
		return bankManager;
	}

	/**
	 * Parasoft Jtest UTA: Test for login(String, String)
	 *
	 * @see com.parasoft.parabank.util.AccessModeController#login(String, String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testLogin2() throws Throwable {
		// Given
		AccessModeController underTest = new AccessModeController();
		AdminManager adminManager = mockAdminManager27();
		underTest.setAdminManager(adminManager);
		BankManager bankManager = mockBankManager2();
		underTest.setBankManager(bankManager);

		// When
		String username = "username"; // UTA: default value
		String password = "password"; // UTA: default value
		Customer result = underTest.login(username, password);

		// Then - assertions for result of method login(String, String)
		assertNotNull(result);
		assertEquals(0, result.getId());
		assertNull(result.getFirstName());
		assertNull(result.getLastName());
		assertNull(result.getAddress());
		assertNull(result.getPhoneNumber());
		assertNull(result.getSsn());
		assertNull(result.getUsername());
		assertNull(result.getPassword());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AdminManager
	 */
	private static AdminManager mockAdminManager27() throws Throwable {
		AdminManager adminManager = mock(AdminManager.class);
		String getParameterResult = null; // UTA: provided value
		when(adminManager.getParameter(nullable(String.class))).thenReturn(getParameterResult);
		return adminManager;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of BankManager
	 */
	private static BankManager mockBankManager2() throws Throwable {
		BankManager bankManager = mock(BankManager.class);
		Customer getCustomerResult = mock(Customer.class);
		when(bankManager.getCustomer(nullable(String.class), nullable(String.class))).thenReturn(getCustomerResult);
		return bankManager;
	}

	/**
	 * Parasoft Jtest UTA: Test for login(String, String)
	 *
	 * @see com.parasoft.parabank.util.AccessModeController#login(String, String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testLogin3() throws Throwable {
		// Given
		AccessModeController underTest = new AccessModeController();
		AdminManager adminManager = mockAdminManager28();
		underTest.setAdminManager(adminManager);

		// When
		String username = "username"; // UTA: default value
		String password = "password"; // UTA: default value
		Customer result = underTest.login(username, password);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AdminManager
	 */
	private static AdminManager mockAdminManager28() throws Throwable {
		AdminManager adminManager = mock(AdminManager.class);
		String getParameterResult = "soap"; // UTA: provided value
		when(adminManager.getParameter(nullable(String.class))).thenReturn(getParameterResult);
		return adminManager;
	}

	/**
	 * Parasoft Jtest UTA: Test for updateCustomer(Customer)
	 *
	 * @see com.parasoft.parabank.util.AccessModeController#updateCustomer(Customer)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testUpdateCustomer() throws Throwable {
		// Given
		AccessModeController underTest = new AccessModeController();
		AdminManager adminManager = mockAdminManager29();
		underTest.setAdminManager(adminManager);

		// When
		Customer updatedCustomer = mock(Customer.class);
		underTest.updateCustomer(updatedCustomer);

		// Then - assertions for argument 1 of method updateCustomer(Customer)
		assertEquals(0, updatedCustomer.getId());
		assertNull(updatedCustomer.getFirstName());
		assertNull(updatedCustomer.getLastName());
		assertNull(updatedCustomer.getAddress());
		assertNull(updatedCustomer.getPhoneNumber());
		assertNull(updatedCustomer.getSsn());
		assertNull(updatedCustomer.getUsername());
		assertNull(updatedCustomer.getPassword());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AdminManager
	 */
	private static AdminManager mockAdminManager29() throws Throwable {
		AdminManager adminManager = mock(AdminManager.class);
		String getParameterResult = ""; // UTA: provided value
		when(adminManager.getParameter(nullable(String.class))).thenReturn(getParameterResult);
		return adminManager;
	}

	/**
	 * Parasoft Jtest UTA: Test for updateCustomer(Customer)
	 *
	 * @see com.parasoft.parabank.util.AccessModeController#updateCustomer(Customer)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testUpdateCustomer2() throws Throwable {
		// Given
		AccessModeController underTest = new AccessModeController();
		AdminManager adminManager = mockAdminManager30();
		underTest.setAdminManager(adminManager);

		// When
		Customer updatedCustomer = mockCustomer();
		underTest.updateCustomer(updatedCustomer);

		// Then - assertions for argument 1 of method updateCustomer(Customer)
		assertEquals(0, updatedCustomer.getId());
		assertNull(updatedCustomer.getFirstName());
		assertNull(updatedCustomer.getLastName());
		assertNull(updatedCustomer.getAddress());
		assertNull(updatedCustomer.getPhoneNumber());
		assertNull(updatedCustomer.getSsn());
		assertNull(updatedCustomer.getUsername());
		assertNull(updatedCustomer.getPassword());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AdminManager
	 */
	private static AdminManager mockAdminManager30() throws Throwable {
		AdminManager adminManager = mock(AdminManager.class);
		String getParameterResult = "soap"; // UTA: provided value
		when(adminManager.getParameter(nullable(String.class))).thenReturn(getParameterResult);
		return adminManager;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of Address
	 */
	private static Address mockAddress() throws Throwable {
		Address getAddressResult = mock(Address.class);
		String getCityResult = "getCityResult"; // UTA: default value
		when(getAddressResult.getCity()).thenReturn(getCityResult);

		String getStateResult = "getStateResult"; // UTA: default value
		when(getAddressResult.getState()).thenReturn(getStateResult);

		String getStreetResult = "getStreetResult"; // UTA: default value
		when(getAddressResult.getStreet()).thenReturn(getStreetResult);

		String getZipCodeResult = "getZipCodeResult"; // UTA: default value
		when(getAddressResult.getZipCode()).thenReturn(getZipCodeResult);
		return getAddressResult;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of Customer
	 */
	private static Customer mockCustomer() throws Throwable {
		Customer updatedCustomer = mock(Customer.class);
		Address getAddressResult = mockAddress();
		when(updatedCustomer.getAddress()).thenReturn(getAddressResult);

		String getFirstNameResult = "getFirstNameResult"; // UTA: default value
		when(updatedCustomer.getFirstName()).thenReturn(getFirstNameResult);

		String getLastNameResult = "getLastNameResult"; // UTA: default value
		when(updatedCustomer.getLastName()).thenReturn(getLastNameResult);

		String getPasswordResult = "getPasswordResult"; // UTA: default value
		when(updatedCustomer.getPassword()).thenReturn(getPasswordResult);

		String getPhoneNumberResult = "getPhoneNumberResult"; // UTA: default value
		when(updatedCustomer.getPhoneNumber()).thenReturn(getPhoneNumberResult);

		String getSsnResult = "getSsnResult"; // UTA: default value
		when(updatedCustomer.getSsn()).thenReturn(getSsnResult);

		String getUsernameResult = "getUsernameResult"; // UTA: default value
		when(updatedCustomer.getUsername()).thenReturn(getUsernameResult);
		return updatedCustomer;
	}

	/**
	 * Parasoft Jtest UTA: Test for updateCustomer(Customer)
	 *
	 * @see com.parasoft.parabank.util.AccessModeController#updateCustomer(Customer)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testUpdateCustomer3() throws Throwable {
		// Given
		AccessModeController underTest = new AccessModeController();
		AdminManager adminManager = mockAdminManager31();
		underTest.setAdminManager(adminManager);

		// When
		Customer updatedCustomer = mockCustomer2();
		underTest.updateCustomer(updatedCustomer);

		// Then - assertions for argument 1 of method updateCustomer(Customer)
		assertEquals(0, updatedCustomer.getId());
		assertNull(updatedCustomer.getFirstName());
		assertNull(updatedCustomer.getLastName());
		assertNull(updatedCustomer.getAddress());
		assertNull(updatedCustomer.getPhoneNumber());
		assertNull(updatedCustomer.getSsn());
		assertNull(updatedCustomer.getUsername());
		assertNull(updatedCustomer.getPassword());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AdminManager
	 */
	private static AdminManager mockAdminManager31() throws Throwable {
		AdminManager adminManager = mock(AdminManager.class);
		String getParameterResult = "restjson"; // UTA: provided value
		when(adminManager.getParameter(nullable(String.class))).thenReturn(getParameterResult);
		return adminManager;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of Customer
	 */
	private static Customer mockCustomer2() throws Throwable {
		Customer updatedCustomer = mock(Customer.class);
		String getFirstNameResult = "getFirstNameResult"; // UTA: default value
		when(updatedCustomer.getFirstName()).thenReturn(getFirstNameResult);

		String getLastNameResult = "getLastNameResult"; // UTA: default value
		when(updatedCustomer.getLastName()).thenReturn(getLastNameResult);
		return updatedCustomer;
	}

	/**
	 * Parasoft Jtest UTA: Test for updateCustomer(Customer)
	 *
	 * @see com.parasoft.parabank.util.AccessModeController#updateCustomer(Customer)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testUpdateCustomer4() throws Throwable {
		// Given
		AccessModeController underTest = new AccessModeController();
		AdminManager adminManager = mockAdminManager32();
		underTest.setAdminManager(adminManager);

		// When
		Customer updatedCustomer = mockCustomer3();
		underTest.updateCustomer(updatedCustomer);

		// Then - assertions for argument 1 of method updateCustomer(Customer)
		assertEquals(0, updatedCustomer.getId());
		assertNull(updatedCustomer.getFirstName());
		assertNull(updatedCustomer.getLastName());
		assertNull(updatedCustomer.getAddress());
		assertNull(updatedCustomer.getPhoneNumber());
		assertNull(updatedCustomer.getSsn());
		assertNull(updatedCustomer.getUsername());
		assertNull(updatedCustomer.getPassword());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AdminManager
	 */
	private static AdminManager mockAdminManager32() throws Throwable {
		AdminManager adminManager = mock(AdminManager.class);
		String getParameterResult = "restxml"; // UTA: provided value
		String getParameterResult2 = "getParameterResult2"; // UTA: default value
		when(adminManager.getParameter(nullable(String.class))).thenReturn(getParameterResult, getParameterResult2);
		return adminManager;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of Address
	 */
	private static Address mockAddress2() throws Throwable {
		Address getAddressResult = mock(Address.class);
		String getStreetResult = "getStreetResult"; // UTA: default value
		when(getAddressResult.getStreet()).thenReturn(getStreetResult);
		return getAddressResult;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of Customer
	 */
	private static Customer mockCustomer3() throws Throwable {
		Customer updatedCustomer = mock(Customer.class);
		Address getAddressResult = mockAddress2();
		when(updatedCustomer.getAddress()).thenReturn(getAddressResult);

		String getFirstNameResult = "getFirstNameResult"; // UTA: default value
		when(updatedCustomer.getFirstName()).thenReturn(getFirstNameResult);

		String getLastNameResult = "getLastNameResult"; // UTA: default value
		when(updatedCustomer.getLastName()).thenReturn(getLastNameResult);
		return updatedCustomer;
	}

	/**
	 * Parasoft Jtest UTA: Test for updateCustomer(Customer)
	 *
	 * @see com.parasoft.parabank.util.AccessModeController#updateCustomer(Customer)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = UnsupportedEncodingException.class)
	public void testUpdateCustomer5() throws Throwable {
		// Given
		AccessModeController underTest = new AccessModeController();
		AdminManager adminManager = mockAdminManager33();
		underTest.setAdminManager(adminManager);

		// When
		Customer updatedCustomer = mock(Customer.class);
		underTest.updateCustomer(updatedCustomer);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AdminManager
	 */
	private static AdminManager mockAdminManager33() throws Throwable {
		AdminManager adminManager = mock(AdminManager.class);
		String getParameterResult = "restxml"; // UTA: provided value
		when(adminManager.getParameter(nullable(String.class))).thenReturn(getParameterResult);
		return adminManager;
	}

	/**
	 * Parasoft Jtest UTA: Test for updateCustomer(Customer)
	 *
	 * @see com.parasoft.parabank.util.AccessModeController#updateCustomer(Customer)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = UnsupportedEncodingException.class)
	public void testUpdateCustomer6() throws Throwable {
		// Given
		AccessModeController underTest = new AccessModeController();
		AdminManager adminManager = mockAdminManager34();
		underTest.setAdminManager(adminManager);

		// When
		Customer updatedCustomer = mock(Customer.class);
		underTest.updateCustomer(updatedCustomer);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AdminManager
	 */
	private static AdminManager mockAdminManager34() throws Throwable {
		AdminManager adminManager = mock(AdminManager.class);
		String getParameterResult = "restxml"; // UTA: provided value
		String getParameterResult2 = "getParameterResult2"; // UTA: default value
		when(adminManager.getParameter(nullable(String.class))).thenReturn(getParameterResult, getParameterResult2);
		return adminManager;
	}
}