/**
 * 
 */
package com.parasoft.parabank.domain.logic.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.nullable;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.parasoft.parabank.dao.AccountDao;
import com.parasoft.parabank.dao.AdminDao;
import com.parasoft.parabank.dao.CustomerDao;
import com.parasoft.parabank.dao.PositionDao;
import com.parasoft.parabank.dao.TransactionDao;
import com.parasoft.parabank.domain.Account;
import com.parasoft.parabank.domain.Customer;
import com.parasoft.parabank.domain.HistoryPoint;
import com.parasoft.parabank.domain.LoanRequest;
import com.parasoft.parabank.domain.LoanResponse;
import com.parasoft.parabank.domain.Position;
import com.parasoft.parabank.domain.Transaction;
import com.parasoft.parabank.domain.TransactionCriteria;
import com.parasoft.parabank.domain.logic.LoanProvider;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for BankManagerImpl
 *
 * @see com.parasoft.parabank.domain.logic.impl.BankManagerImpl
 * @author devtest
 */
public class BankManagerImplTest {

	/**
	 * Parasoft Jtest UTA: Test for buyPosition(int, int, String, String, int, BigDecimal)
	 *
	 * @see com.parasoft.parabank.domain.logic.impl.BankManagerImpl#buyPosition(int, int, String, String, int, BigDecimal)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testBuyPosition() throws Throwable {
		// Given
		BankManagerImpl underTest = new BankManagerImpl();
		AccountDao accountDao = mockAccountDao();
		underTest.setAccountDao(accountDao);
		PositionDao positionDao = mock(PositionDao.class);
		underTest.setPositionDao(positionDao);
		TransactionDao transactionDao = mock(TransactionDao.class);
		underTest.setTransactionDao(transactionDao);

		// When
		int customerId = 0; // UTA: default value
		int accountId = 0; // UTA: default value
		String name = "name"; // UTA: default value
		String symbol = "symbol"; // UTA: default value
		int shares = 0; // UTA: default value
		BigDecimal pricePerShare = BigDecimal.ZERO; // UTA: default value
		List<Position> result = underTest.buyPosition(customerId, accountId, name, symbol, shares, pricePerShare);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AccountDao
	 */
	private static AccountDao mockAccountDao() throws Throwable {
		AccountDao accountDao = mock(AccountDao.class);
		Account getAccountResult = mock(Account.class);
		when(accountDao.getAccount(anyInt())).thenReturn(getAccountResult);
		return accountDao;
	}

	/**
	 * Parasoft Jtest UTA: Test for createAccount(Account, int)
	 *
	 * @see com.parasoft.parabank.domain.logic.impl.BankManagerImpl#createAccount(Account, int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testCreateAccount() throws Throwable {
		// Given
		BankManagerImpl underTest = new BankManagerImpl();
		AccountDao accountDao = mockAccountDao2();
		underTest.setAccountDao(accountDao);
		AdminDao adminDao = mockAdminDao();
		underTest.setAdminDao(adminDao);
		TransactionDao transactionDao = mock(TransactionDao.class);
		underTest.setTransactionDao(transactionDao);

		// When
		Account account = mock(Account.class);
		int fromAccountId = 0; // UTA: default value
		int result = underTest.createAccount(account, fromAccountId);

		// Then - assertions for argument 1 of method createAccount(Account, int)
		assertEquals(0, account.getId());
		assertEquals(0, account.getCustomerId());
		assertNull(account.getType());
		assertNull(account.getBalance());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AccountDao
	 */
	private static AccountDao mockAccountDao2() throws Throwable {
		AccountDao accountDao = mock(AccountDao.class);
		Account getAccountResult = mock(Account.class);
		Account getAccountResult2 = mock(Account.class);
		when(accountDao.getAccount(anyInt())).thenReturn(getAccountResult, getAccountResult2);
		return accountDao;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AdminDao
	 */
	private static AdminDao mockAdminDao() throws Throwable {
		AdminDao adminDao = mock(AdminDao.class);
		String getParameterResult = "getParameterResult"; // UTA: default value
		when(adminDao.getParameter(nullable(String.class))).thenReturn(getParameterResult);
		return adminDao;
	}

	/**
	 * Parasoft Jtest UTA: Test for createCustomer(Customer)
	 *
	 * @see com.parasoft.parabank.domain.logic.impl.BankManagerImpl#createCustomer(Customer)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testCreateCustomer() throws Throwable {
		// Given
		BankManagerImpl underTest = new BankManagerImpl();
		AccountDao accountDao = mock(AccountDao.class);
		underTest.setAccountDao(accountDao);
		AdminDao adminDao = mockAdminDao2();
		underTest.setAdminDao(adminDao);
		CustomerDao customerDao = mock(CustomerDao.class);
		underTest.setCustomerDao(customerDao);

		// When
		Customer customer = mock(Customer.class);
		int result = underTest.createCustomer(customer);

		// Then - assertions for argument 1 of method createCustomer(Customer)
		assertEquals(0, customer.getId());
		assertNull(customer.getFirstName());
		assertNull(customer.getLastName());
		assertNull(customer.getAddress());
		assertNull(customer.getPhoneNumber());
		assertNull(customer.getSsn());
		assertNull(customer.getUsername());
		assertNull(customer.getPassword());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AdminDao
	 */
	private static AdminDao mockAdminDao2() throws Throwable {
		AdminDao adminDao = mock(AdminDao.class);
		String getParameterResult = "getParameterResult"; // UTA: default value
		when(adminDao.getParameter(nullable(String.class))).thenReturn(getParameterResult);
		return adminDao;
	}

	/**
	 * Parasoft Jtest UTA: Test for createPosition(int, String, String, int, BigDecimal)
	 *
	 * @see com.parasoft.parabank.domain.logic.impl.BankManagerImpl#createPosition(int, String, String, int, BigDecimal)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testCreatePosition() throws Throwable {
		// Given
		BankManagerImpl underTest = new BankManagerImpl();

		// When
		int customerId = 0; // UTA: default value
		String name = "name"; // UTA: default value
		String symbol = "symbol"; // UTA: default value
		int shares = 0; // UTA: default value
		BigDecimal pricePerShare = BigDecimal.ZERO; // UTA: default value
		Position result = underTest.createPosition(customerId, name, symbol, shares, pricePerShare);

		// Then - assertions for result of method createPosition(int, String, String, int, BigDecimal)
		assertNotNull(result);
		assertEquals(0, result.getPositionId());
		assertEquals(0, result.getCustomerId());
		assertEquals("name", result.getName());
		assertEquals("symbol", result.getSymbol());
		assertEquals(0, result.getShares());
		assertNotNull(result.getPurchasePrice());
		assertEquals(0d, result.getPurchasePrice().doubleValue(), 0.0);

	}

	/**
	 * Parasoft Jtest UTA: Test for deletePosition(Position)
	 *
	 * @see com.parasoft.parabank.domain.logic.impl.BankManagerImpl#deletePosition(Position)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testDeletePosition() throws Throwable {
		// Given
		BankManagerImpl underTest = new BankManagerImpl();
		PositionDao positionDao = mock(PositionDao.class);
		underTest.setPositionDao(positionDao);

		// When
		Position position = mock(Position.class);
		boolean result = underTest.deletePosition(position);

		// Then - assertions for argument 1 of method deletePosition(Position)
		assertEquals(0, position.getPositionId());
		assertEquals(0, position.getCustomerId());
		assertNull(position.getName());
		assertNull(position.getSymbol());
		assertEquals(0, position.getShares());
		assertNull(position.getPurchasePrice());

		// Then - assertions for result of method deletePosition(Position)
		assertFalse(result);

	}

	/**
	 * Parasoft Jtest UTA: Test for deposit(int, BigDecimal, String)
	 *
	 * @see com.parasoft.parabank.domain.logic.impl.BankManagerImpl#deposit(int, BigDecimal, String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testDeposit() throws Throwable {
		// Given
		BankManagerImpl underTest = new BankManagerImpl();
		AccountDao accountDao = mockAccountDao3();
		underTest.setAccountDao(accountDao);
		TransactionDao transactionDao = mock(TransactionDao.class);
		underTest.setTransactionDao(transactionDao);

		// When
		int accountId = 0; // UTA: default value
		BigDecimal amount = BigDecimal.ZERO; // UTA: default value
		String description = "description"; // UTA: default value
		Transaction result = underTest.deposit(accountId, amount, description);

		// Then - assertions for result of method deposit(int, BigDecimal, String)
		assertNotNull(result);
		assertEquals(0, result.getId());
		assertEquals(0, result.getAccountId());
		assertEquals(com.parasoft.parabank.domain.Transaction.TransactionType.Credit, result.getType());
		assertNotNull(result.getDate());
		assertNotNull(result.getAmount());
		assertEquals(0d, result.getAmount().doubleValue(), 0.0);
		assertEquals("description", result.getDescription());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AccountDao
	 */
	private static AccountDao mockAccountDao3() throws Throwable {
		AccountDao accountDao = mock(AccountDao.class);
		Account getAccountResult = mock(Account.class);
		when(accountDao.getAccount(anyInt())).thenReturn(getAccountResult);
		return accountDao;
	}

	/**
	 * Parasoft Jtest UTA: Test for getAccount(int)
	 *
	 * @see com.parasoft.parabank.domain.logic.impl.BankManagerImpl#getAccount(int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetAccount() throws Throwable {
		// Given
		BankManagerImpl underTest = new BankManagerImpl();
		AccountDao accountDao = mock(AccountDao.class);
		underTest.setAccountDao(accountDao);

		// When
		int id = 0; // UTA: default value
		Account result = underTest.getAccount(id);

		// Then - assertions for result of method getAccount(int)
		assertNull(result);

	}

	/**
	 * Parasoft Jtest UTA: Test for getAccountsForCustomer(Customer)
	 *
	 * @see com.parasoft.parabank.domain.logic.impl.BankManagerImpl#getAccountsForCustomer(Customer)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetAccountsForCustomer() throws Throwable {
		// Given
		BankManagerImpl underTest = new BankManagerImpl();
		AccountDao accountDao = mock(AccountDao.class);
		underTest.setAccountDao(accountDao);

		// When
		Customer customer = mock(Customer.class);
		List<Account> result = underTest.getAccountsForCustomer(customer);

		// Then - assertions for argument 1 of method getAccountsForCustomer(Customer)
		assertEquals(0, customer.getId());
		assertNull(customer.getFirstName());
		assertNull(customer.getLastName());
		assertNull(customer.getAddress());
		assertNull(customer.getPhoneNumber());
		assertNull(customer.getSsn());
		assertNull(customer.getUsername());
		assertNull(customer.getPassword());

		// Then - assertions for result of method getAccountsForCustomer(Customer)
		assertNotNull(result);
		assertEquals(0, result.size());

	}

	/**
	 * Parasoft Jtest UTA: Test for getCustomer(int)
	 *
	 * @see com.parasoft.parabank.domain.logic.impl.BankManagerImpl#getCustomer(int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetCustomer() throws Throwable {
		// Given
		BankManagerImpl underTest = new BankManagerImpl();
		CustomerDao customerDao = mock(CustomerDao.class);
		underTest.setCustomerDao(customerDao);

		// When
		int id = 0; // UTA: default value
		Customer result = underTest.getCustomer(id);

		// Then - assertions for result of method getCustomer(int)
		assertNull(result);

	}

	/**
	 * Parasoft Jtest UTA: Test for getCustomer(String)
	 *
	 * @see com.parasoft.parabank.domain.logic.impl.BankManagerImpl#getCustomer(String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetCustomer2() throws Throwable {
		// Given
		BankManagerImpl underTest = new BankManagerImpl();
		CustomerDao customerDao = mock(CustomerDao.class);
		underTest.setCustomerDao(customerDao);

		// When
		String ssn = "ssn"; // UTA: default value
		Customer result = underTest.getCustomer(ssn);

		// Then - assertions for result of method getCustomer(String)
		assertNull(result);

	}

	/**
	 * Parasoft Jtest UTA: Test for getCustomer(String, String)
	 *
	 * @see com.parasoft.parabank.domain.logic.impl.BankManagerImpl#getCustomer(String, String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetCustomer3() throws Throwable {
		// Given
		BankManagerImpl underTest = new BankManagerImpl();
		CustomerDao customerDao = mock(CustomerDao.class);
		underTest.setCustomerDao(customerDao);

		// When
		String username = "username"; // UTA: default value
		String password = "password"; // UTA: default value
		Customer result = underTest.getCustomer(username, password);

		// Then - assertions for result of method getCustomer(String, String)
		assertNull(result);

	}

	/**
	 * Parasoft Jtest UTA: Test for getPosition(int)
	 *
	 * @see com.parasoft.parabank.domain.logic.impl.BankManagerImpl#getPosition(int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetPosition() throws Throwable {
		// Given
		BankManagerImpl underTest = new BankManagerImpl();
		PositionDao positionDao = mock(PositionDao.class);
		underTest.setPositionDao(positionDao);

		// When
		int positionId = 0; // UTA: default value
		Position result = underTest.getPosition(positionId);

		// Then - assertions for result of method getPosition(int)
		assertNull(result);

	}

	/**
	 * Parasoft Jtest UTA: Test for getPositionHistory(int, Date, Date)
	 *
	 * @see com.parasoft.parabank.domain.logic.impl.BankManagerImpl#getPositionHistory(int, Date, Date)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetPositionHistory() throws Throwable {
		// Given
		BankManagerImpl underTest = new BankManagerImpl();
		PositionDao positionDao = mock(PositionDao.class);
		underTest.setPositionDao(positionDao);

		// When
		int positionId = 0; // UTA: default value
		Date startDate = mock(Date.class);
		Date endDate = mock(Date.class);
		List<HistoryPoint> result = underTest.getPositionHistory(positionId, startDate, endDate);

		// Then - assertions for result of method getPositionHistory(int, Date, Date)
		assertNotNull(result);
		assertEquals(0, result.size());

	}

	/**
	 * Parasoft Jtest UTA: Test for getPositionsForCustomer(Customer)
	 *
	 * @see com.parasoft.parabank.domain.logic.impl.BankManagerImpl#getPositionsForCustomer(Customer)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetPositionsForCustomer() throws Throwable {
		// Given
		BankManagerImpl underTest = new BankManagerImpl();
		PositionDao positionDao = mock(PositionDao.class);
		underTest.setPositionDao(positionDao);

		// When
		Customer customer = mock(Customer.class);
		List<Position> result = underTest.getPositionsForCustomer(customer);

		// Then - assertions for argument 1 of method getPositionsForCustomer(Customer)
		assertEquals(0, customer.getId());
		assertNull(customer.getFirstName());
		assertNull(customer.getLastName());
		assertNull(customer.getAddress());
		assertNull(customer.getPhoneNumber());
		assertNull(customer.getSsn());
		assertNull(customer.getUsername());
		assertNull(customer.getPassword());

		// Then - assertions for result of method getPositionsForCustomer(Customer)
		assertNotNull(result);
		assertEquals(0, result.size());

	}

	/**
	 * Parasoft Jtest UTA: Test for getTransaction(int)
	 *
	 * @see com.parasoft.parabank.domain.logic.impl.BankManagerImpl#getTransaction(int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetTransaction() throws Throwable {
		// Given
		BankManagerImpl underTest = new BankManagerImpl();
		TransactionDao transactionDao = mock(TransactionDao.class);
		underTest.setTransactionDao(transactionDao);

		// When
		int id = 0; // UTA: default value
		Transaction result = underTest.getTransaction(id);

		// Then - assertions for result of method getTransaction(int)
		assertNull(result);

	}

	/**
	 * Parasoft Jtest UTA: Test for getTransactionsForAccount(Account)
	 *
	 * @see com.parasoft.parabank.domain.logic.impl.BankManagerImpl#getTransactionsForAccount(Account)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetTransactionsForAccount() throws Throwable {
		// Given
		BankManagerImpl underTest = new BankManagerImpl();
		TransactionDao transactionDao = mock(TransactionDao.class);
		underTest.setTransactionDao(transactionDao);

		// When
		Account account = mock(Account.class);
		List<Transaction> result = underTest.getTransactionsForAccount(account);

		// Then - assertions for argument 1 of method getTransactionsForAccount(Account)
		assertEquals(0, account.getId());
		assertEquals(0, account.getCustomerId());
		assertNull(account.getType());
		assertNull(account.getBalance());

		// Then - assertions for result of method getTransactionsForAccount(Account)
		assertNotNull(result);
		assertEquals(0, result.size());

	}

	/**
	 * Parasoft Jtest UTA: Test for getTransactionsForAccount(int, TransactionCriteria)
	 *
	 * @see com.parasoft.parabank.domain.logic.impl.BankManagerImpl#getTransactionsForAccount(int, TransactionCriteria)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetTransactionsForAccount2() throws Throwable {
		// Given
		BankManagerImpl underTest = new BankManagerImpl();
		TransactionDao transactionDao = mock(TransactionDao.class);
		underTest.setTransactionDao(transactionDao);

		// When
		int accountId = 0; // UTA: default value
		TransactionCriteria criteria = mock(TransactionCriteria.class);
		List<Transaction> result = underTest.getTransactionsForAccount(accountId, criteria);

		// Then - assertions for argument 2 of method getTransactionsForAccount(int, TransactionCriteria)
		assertNull(criteria.getMonth());
		assertNull(criteria.getTransactionType());
		assertNull(criteria.getTransactionId());
		assertNull(criteria.getOnDate());
		assertNull(criteria.getFromDate());
		assertNull(criteria.getToDate());
		assertNull(criteria.getAmount());
		assertNull(criteria.getSearchType());

		// Then - assertions for result of method getTransactionsForAccount(int, TransactionCriteria)
		assertNotNull(result);
		assertEquals(0, result.size());

	}

	/**
	 * Parasoft Jtest UTA: Test for requestLoan(int, BigDecimal, BigDecimal, int)
	 *
	 * @see com.parasoft.parabank.domain.logic.impl.BankManagerImpl#requestLoan(int, BigDecimal, BigDecimal, int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testRequestLoan() throws Throwable {
		// Given
		BankManagerImpl underTest = new BankManagerImpl();
		AccountDao accountDao = mockAccountDao4();
		underTest.setAccountDao(accountDao);
		LoanProvider loanProvider = mockLoanProvider();
		underTest.setLoanProvider(loanProvider);

		// When
		int customerId = 0; // UTA: default value
		BigDecimal amount = BigDecimal.ZERO; // UTA: default value
		BigDecimal downPayment = BigDecimal.ZERO; // UTA: default value
		int fromAccountId = 0; // UTA: default value
		LoanResponse result = underTest.requestLoan(customerId, amount, downPayment, fromAccountId);

		// Then - assertions for result of method requestLoan(int, BigDecimal, BigDecimal, int)
		assertNotNull(result);
		assertNull(result.getResponseDate());
		assertNull(result.getLoanProviderName());
		assertFalse(result.isApproved());
		assertNull(result.getMessage());
		assertNull(result.getAccountId());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AccountDao
	 */
	private static AccountDao mockAccountDao4() throws Throwable {
		AccountDao accountDao = mock(AccountDao.class);
		List<Account> getAccountsForCustomerIdResult = new ArrayList<Account>(); // UTA: default value
		doReturn(getAccountsForCustomerIdResult).when(accountDao).getAccountsForCustomerId(anyInt());
		return accountDao;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of LoanResponse
	 */
	private static LoanResponse mockLoanResponse() throws Throwable {
		LoanResponse requestLoanResult = mock(LoanResponse.class);
		boolean isApprovedResult = false; // UTA: provided value
		when(requestLoanResult.isApproved()).thenReturn(isApprovedResult);
		return requestLoanResult;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of LoanProvider
	 */
	private static LoanProvider mockLoanProvider() throws Throwable {
		LoanProvider loanProvider = mock(LoanProvider.class);
		LoanResponse requestLoanResult = mockLoanResponse();
		when(loanProvider.requestLoan(nullable(LoanRequest.class))).thenReturn(requestLoanResult);
		return loanProvider;
	}

	/**
	 * Parasoft Jtest UTA: Test for requestLoan(int, BigDecimal, BigDecimal, int)
	 *
	 * @see com.parasoft.parabank.domain.logic.impl.BankManagerImpl#requestLoan(int, BigDecimal, BigDecimal, int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testRequestLoan2() throws Throwable {
		// Given
		BankManagerImpl underTest = new BankManagerImpl();
		AccountDao accountDao = mockAccountDao5();
		underTest.setAccountDao(accountDao);
		LoanProvider loanProvider = mockLoanProvider2();
		underTest.setLoanProvider(loanProvider);

		// When
		int customerId = 0; // UTA: default value
		BigDecimal amount = BigDecimal.ZERO; // UTA: default value
		BigDecimal downPayment = BigDecimal.ZERO; // UTA: default value
		int fromAccountId = 0; // UTA: default value
		LoanResponse result = underTest.requestLoan(customerId, amount, downPayment, fromAccountId);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AccountDao
	 */
	private static AccountDao mockAccountDao5() throws Throwable {
		AccountDao accountDao = mock(AccountDao.class);
		List<Account> getAccountsForCustomerIdResult = new ArrayList<Account>(); // UTA: default value
		Account item = mock(Account.class);
		getAccountsForCustomerIdResult.add(item);
		doReturn(getAccountsForCustomerIdResult).when(accountDao).getAccountsForCustomerId(anyInt());
		return accountDao;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of LoanResponse
	 */
	private static LoanResponse mockLoanResponse2() throws Throwable {
		LoanResponse requestLoanResult = mock(LoanResponse.class);
		boolean isApprovedResult = false; // UTA: provided value
		when(requestLoanResult.isApproved()).thenReturn(isApprovedResult);
		return requestLoanResult;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of LoanProvider
	 */
	private static LoanProvider mockLoanProvider2() throws Throwable {
		LoanProvider loanProvider = mock(LoanProvider.class);
		LoanResponse requestLoanResult = mockLoanResponse2();
		when(loanProvider.requestLoan(nullable(LoanRequest.class))).thenReturn(requestLoanResult);
		return loanProvider;
	}

	/**
	 * Parasoft Jtest UTA: Test for requestLoan(int, BigDecimal, BigDecimal, int)
	 *
	 * @see com.parasoft.parabank.domain.logic.impl.BankManagerImpl#requestLoan(int, BigDecimal, BigDecimal, int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testRequestLoan3() throws Throwable {
		// Given
		BankManagerImpl underTest = new BankManagerImpl();
		AccountDao accountDao = mockAccountDao6();
		underTest.setAccountDao(accountDao);
		LoanProvider loanProvider = mockLoanProvider3();
		underTest.setLoanProvider(loanProvider);

		// When
		int customerId = 0; // UTA: default value
		BigDecimal amount = BigDecimal.ZERO; // UTA: default value
		BigDecimal downPayment = BigDecimal.ZERO; // UTA: default value
		int fromAccountId = 0; // UTA: default value
		LoanResponse result = underTest.requestLoan(customerId, amount, downPayment, fromAccountId);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AccountDao
	 */
	private static AccountDao mockAccountDao6() throws Throwable {
		AccountDao accountDao = mock(AccountDao.class);
		Account getAccountResult = mock(Account.class);
		when(accountDao.getAccount(anyInt())).thenReturn(getAccountResult);

		List<Account> getAccountsForCustomerIdResult = new ArrayList<Account>(); // UTA: default value
		doReturn(getAccountsForCustomerIdResult).when(accountDao).getAccountsForCustomerId(anyInt());
		return accountDao;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of LoanResponse
	 */
	private static LoanResponse mockLoanResponse3() throws Throwable {
		LoanResponse requestLoanResult = mock(LoanResponse.class);
		boolean isApprovedResult = true; // UTA: provided value
		when(requestLoanResult.isApproved()).thenReturn(isApprovedResult);
		return requestLoanResult;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of LoanProvider
	 */
	private static LoanProvider mockLoanProvider3() throws Throwable {
		LoanProvider loanProvider = mock(LoanProvider.class);
		LoanResponse requestLoanResult = mockLoanResponse3();
		when(loanProvider.requestLoan(nullable(LoanRequest.class))).thenReturn(requestLoanResult);
		return loanProvider;
	}

	/**
	 * Parasoft Jtest UTA: Test for sellPosition(int, int, int, int, BigDecimal)
	 *
	 * @see com.parasoft.parabank.domain.logic.impl.BankManagerImpl#sellPosition(int, int, int, int, BigDecimal)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSellPosition() throws Throwable {
		// Given
		BankManagerImpl underTest = new BankManagerImpl();
		AccountDao accountDao = mockAccountDao7();
		underTest.setAccountDao(accountDao);
		PositionDao positionDao = mockPositionDao();
		underTest.setPositionDao(positionDao);
		TransactionDao transactionDao = mock(TransactionDao.class);
		underTest.setTransactionDao(transactionDao);

		// When
		int customerId = 0; // UTA: default value
		int accountId = 0; // UTA: default value
		int positionId = 0; // UTA: default value
		int shares = 0; // UTA: provided value
		BigDecimal pricePerShare = BigDecimal.ZERO; // UTA: default value
		List<Position> result = underTest.sellPosition(customerId, accountId, positionId, shares, pricePerShare);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AccountDao
	 */
	private static AccountDao mockAccountDao7() throws Throwable {
		AccountDao accountDao = mock(AccountDao.class);
		Account getAccountResult = mock(Account.class);
		when(accountDao.getAccount(anyInt())).thenReturn(getAccountResult);
		return accountDao;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of Position
	 */
	private static Position mockPosition() throws Throwable {
		Position getPositionResult = mock(Position.class);
		int getSharesResult = 0; // UTA: provided value
		when(getPositionResult.getShares()).thenReturn(getSharesResult);
		return getPositionResult;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of PositionDao
	 */
	private static PositionDao mockPositionDao() throws Throwable {
		PositionDao positionDao = mock(PositionDao.class);
		Position getPositionResult = mockPosition();
		when(positionDao.getPosition(anyInt())).thenReturn(getPositionResult);
		return positionDao;
	}

	/**
	 * Parasoft Jtest UTA: Test for sellPosition(int, int, int, int, BigDecimal)
	 *
	 * @see com.parasoft.parabank.domain.logic.impl.BankManagerImpl#sellPosition(int, int, int, int, BigDecimal)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSellPosition2() throws Throwable {
		// Given
		BankManagerImpl underTest = new BankManagerImpl();
		AccountDao accountDao = mockAccountDao8();
		underTest.setAccountDao(accountDao);
		PositionDao positionDao = mockPositionDao2();
		underTest.setPositionDao(positionDao);
		TransactionDao transactionDao = mock(TransactionDao.class);
		underTest.setTransactionDao(transactionDao);

		// When
		int customerId = 0; // UTA: default value
		int accountId = 0; // UTA: default value
		int positionId = 0; // UTA: default value
		int shares = 0; // UTA: provided value
		BigDecimal pricePerShare = BigDecimal.ZERO; // UTA: default value
		List<Position> result = underTest.sellPosition(customerId, accountId, positionId, shares, pricePerShare);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AccountDao
	 */
	private static AccountDao mockAccountDao8() throws Throwable {
		AccountDao accountDao = mock(AccountDao.class);
		Account getAccountResult = mock(Account.class);
		when(accountDao.getAccount(anyInt())).thenReturn(getAccountResult);
		return accountDao;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of Position
	 */
	private static Position mockPosition2() throws Throwable {
		Position getPositionResult = mock(Position.class);
		int getSharesResult = -1000; // UTA: provided value
		when(getPositionResult.getShares()).thenReturn(getSharesResult);
		return getPositionResult;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of PositionDao
	 */
	private static PositionDao mockPositionDao2() throws Throwable {
		PositionDao positionDao = mock(PositionDao.class);
		Position getPositionResult = mockPosition2();
		when(positionDao.getPosition(anyInt())).thenReturn(getPositionResult);
		return positionDao;
	}

	/**
	 * Parasoft Jtest UTA: Test for transfer(int, int, BigDecimal)
	 *
	 * @see com.parasoft.parabank.domain.logic.impl.BankManagerImpl#transfer(int, int, BigDecimal)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testTransfer() throws Throwable {
		// Given
		BankManagerImpl underTest = new BankManagerImpl();
		AccountDao accountDao = mockAccountDao9();
		underTest.setAccountDao(accountDao);
		TransactionDao transactionDao = mock(TransactionDao.class);
		underTest.setTransactionDao(transactionDao);

		// When
		int fromAccountId = 0; // UTA: default value
		int toAccountId = 0; // UTA: default value
		BigDecimal amount = BigDecimal.ZERO; // UTA: default value
		underTest.transfer(fromAccountId, toAccountId, amount);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AccountDao
	 */
	private static AccountDao mockAccountDao9() throws Throwable {
		AccountDao accountDao = mock(AccountDao.class);
		Account getAccountResult = mock(Account.class);
		Account getAccountResult2 = mock(Account.class);
		when(accountDao.getAccount(anyInt())).thenReturn(getAccountResult, getAccountResult2);
		return accountDao;
	}

	/**
	 * Parasoft Jtest UTA: Test for updateCustomer(Customer)
	 *
	 * @see com.parasoft.parabank.domain.logic.impl.BankManagerImpl#updateCustomer(Customer)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testUpdateCustomer() throws Throwable {
		// Given
		BankManagerImpl underTest = new BankManagerImpl();
		CustomerDao customerDao = mock(CustomerDao.class);
		underTest.setCustomerDao(customerDao);

		// When
		Customer customer = mock(Customer.class);
		underTest.updateCustomer(customer);

		// Then - assertions for argument 1 of method updateCustomer(Customer)
		assertEquals(0, customer.getId());
		assertNull(customer.getFirstName());
		assertNull(customer.getLastName());
		assertNull(customer.getAddress());
		assertNull(customer.getPhoneNumber());
		assertNull(customer.getSsn());
		assertNull(customer.getUsername());
		assertNull(customer.getPassword());

	}

	/**
	 * Parasoft Jtest UTA: Test for updatePosition(Position)
	 *
	 * @see com.parasoft.parabank.domain.logic.impl.BankManagerImpl#updatePosition(Position)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testUpdatePosition() throws Throwable {
		// Given
		BankManagerImpl underTest = new BankManagerImpl();
		PositionDao positionDao = mock(PositionDao.class);
		underTest.setPositionDao(positionDao);

		// When
		Position position = mock(Position.class);
		boolean result = underTest.updatePosition(position);

		// Then - assertions for argument 1 of method updatePosition(Position)
		assertEquals(0, position.getPositionId());
		assertEquals(0, position.getCustomerId());
		assertNull(position.getName());
		assertNull(position.getSymbol());
		assertEquals(0, position.getShares());
		assertNull(position.getPurchasePrice());

		// Then - assertions for result of method updatePosition(Position)
		assertFalse(result);

	}

}