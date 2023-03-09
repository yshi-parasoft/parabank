/**
 * 
 */
package com.parasoft.parabank.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.nullable;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.parasoft.parabank.domain.Account;
import com.parasoft.parabank.domain.BillPayResult;
import com.parasoft.parabank.domain.Customer;
import com.parasoft.parabank.domain.HistoryPoint;
import com.parasoft.parabank.domain.LoanResponse;
import com.parasoft.parabank.domain.Payee;
import com.parasoft.parabank.domain.Position;
import com.parasoft.parabank.domain.Transaction;
import com.parasoft.parabank.domain.logic.AdminManager;
import com.parasoft.parabank.domain.logic.BankManager;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for ParaBankServiceImpl
 *
 * @see com.parasoft.parabank.service.ParaBankServiceImpl
 * @author devtest
 */
public class ParaBankServiceImplTest {

	/**
	 * Parasoft Jtest UTA: Test for billPay(int, BigDecimal, Payee)
	 *
	 * @see com.parasoft.parabank.service.ParaBankServiceImpl#billPay(int, BigDecimal, Payee)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testBillPay() throws Throwable {
		// Given
		ParaBankServiceImpl underTest = new ParaBankServiceImpl();
		BankManager bankManager = mock(BankManager.class);
		underTest.setBankManager(bankManager);

		// When
		int accountId = 0; // UTA: default value
		BigDecimal amount = BigDecimal.ZERO; // UTA: default value
		Payee payee = mockPayee();
		BillPayResult result = underTest.billPay(accountId, amount, payee);

		// Then - assertions for argument 3 of method billPay(int, BigDecimal, Payee)
		assertNull(payee.getName());
		assertNull(payee.getAddress());
		assertNull(payee.getPhoneNumber());
		assertNull(payee.getAccountNumber());

		// Then - assertions for result of method billPay(int, BigDecimal, Payee)
		assertNotNull(result);
		assertEquals("getNameResult", result.getPayeeName());
		assertNotNull(result.getAmount());
		assertEquals(0d, result.getAmount().doubleValue(), 0.0);
		assertEquals(0, result.getAccountId());

		// Then - assertions for this instance of ParaBankServiceImpl
		assertNull(underTest.getAdminManager());
		assertNotNull(underTest.getBankManager());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of Payee
	 */
	private static Payee mockPayee() throws Throwable {
		Payee payee = mock(Payee.class);
		String getNameResult = "getNameResult"; // UTA: default value
		when(payee.getName()).thenReturn(getNameResult);
		return payee;
	}

	/**
	 * Parasoft Jtest UTA: Test for buyPosition(int, int, String, String, int, BigDecimal)
	 *
	 * @see com.parasoft.parabank.service.ParaBankServiceImpl#buyPosition(int, int, String, String, int, BigDecimal)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testBuyPosition() throws Throwable {
		// Given
		ParaBankServiceImpl underTest = new ParaBankServiceImpl();
		BankManager bankManager = mock(BankManager.class);
		underTest.setBankManager(bankManager);

		// When
		int customerId = 0; // UTA: default value
		int accountId = 0; // UTA: default value
		String name = "name"; // UTA: default value
		String symbol = "symbol"; // UTA: default value
		int shares = 0; // UTA: default value
		BigDecimal pricePerShare = BigDecimal.ZERO; // UTA: default value
		List<Position> result = underTest.buyPosition(customerId, accountId, name, symbol, shares, pricePerShare);

		// Then - assertions for result of method buyPosition(int, int, String, String, int, BigDecimal)
		assertNotNull(result);
		assertEquals(0, result.size());

		// Then - assertions for this instance of ParaBankServiceImpl
		assertNull(underTest.getAdminManager());
		assertNotNull(underTest.getBankManager());

	}

	/**
	 * Parasoft Jtest UTA: Test for buyPosition(int, int, String, String, int, BigDecimal)
	 *
	 * @see com.parasoft.parabank.service.ParaBankServiceImpl#buyPosition(int, int, String, String, int, BigDecimal)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = ParaBankServiceException.class)
	public void testBuyPosition2() throws Throwable {
		// Given
		ParaBankServiceImpl underTest = new ParaBankServiceImpl();

		// When
		int customerId = 0; // UTA: default value
		int accountId = 0; // UTA: default value
		String name = "name"; // UTA: default value
		String symbol = "symbol"; // UTA: default value
		int shares = 0; // UTA: default value
		BigDecimal pricePerShare = BigDecimal.ZERO; // UTA: default value
		underTest.buyPosition(customerId, accountId, name, symbol, shares, pricePerShare);

	}

	/**
	 * Parasoft Jtest UTA: Test for cleanDB()
	 *
	 * @see com.parasoft.parabank.service.ParaBankServiceImpl#cleanDB()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testCleanDB() throws Throwable {
		// Given
		ParaBankServiceImpl underTest = new ParaBankServiceImpl();
		AdminManager adminManager = mock(AdminManager.class);
		underTest.setAdminManager(adminManager);

		// When
		underTest.cleanDB();

		// Then - assertions for this instance of ParaBankServiceImpl
		assertNotNull(underTest.getAdminManager());
		assertNull(underTest.getBankManager());

	}

	/**
	 * Parasoft Jtest UTA: Test for createAccount(int, int, int)
	 *
	 * @see com.parasoft.parabank.service.ParaBankServiceImpl#createAccount(int, int, int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testCreateAccount() throws Throwable {
		// Given
		ParaBankServiceImpl underTest = new ParaBankServiceImpl();
		BankManager bankManager = mock(BankManager.class);
		underTest.setBankManager(bankManager);

		// When
		int customerId = 0; // UTA: default value
		int newAccountType = 0; // UTA: default value
		int fromAccountId = 0; // UTA: default value
		Account result = underTest.createAccount(customerId, newAccountType, fromAccountId);

		// Then - assertions for result of method createAccount(int, int, int)
		assertNotNull(result);
		assertEquals(0, result.getId());
		assertEquals(0, result.getCustomerId());
		assertEquals(com.parasoft.parabank.domain.Account.AccountType.CHECKING, result.getType());
		assertNotNull(result.getBalance());
		assertEquals(0d, result.getBalance().doubleValue(), 0.0);

		// Then - assertions for this instance of ParaBankServiceImpl
		assertNull(underTest.getAdminManager());
		assertNotNull(underTest.getBankManager());

	}

	/**
	 * Parasoft Jtest UTA: Test for deposit(int, BigDecimal)
	 *
	 * @see com.parasoft.parabank.service.ParaBankServiceImpl#deposit(int, BigDecimal)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testDeposit() throws Throwable {
		// Given
		ParaBankServiceImpl underTest = new ParaBankServiceImpl();
		BankManager bankManager = mock(BankManager.class);
		underTest.setBankManager(bankManager);

		// When
		int accountId = 0; // UTA: default value
		BigDecimal amount = BigDecimal.ZERO; // UTA: default value
		String result = underTest.deposit(accountId, amount);

		// Then - assertions for result of method deposit(int, BigDecimal)
		assertEquals("Successfully deposited $0 to account #0", result);

		// Then - assertions for this instance of ParaBankServiceImpl
		assertNull(underTest.getAdminManager());
		assertNotNull(underTest.getBankManager());

	}

	/**
	 * Parasoft Jtest UTA: Test for getAccount(int)
	 *
	 * @see com.parasoft.parabank.service.ParaBankServiceImpl#getAccount(int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetAccount() throws Throwable {
		// Given
		ParaBankServiceImpl underTest = new ParaBankServiceImpl();
		BankManager bankManager = mock(BankManager.class);
		underTest.setBankManager(bankManager);

		// When
		int accountId = 0; // UTA: default value
		Account result = underTest.getAccount(accountId);

		// Then - assertions for result of method getAccount(int)
		assertNull(result);

		// Then - assertions for this instance of ParaBankServiceImpl
		assertNull(underTest.getAdminManager());
		assertNotNull(underTest.getBankManager());

	}

	/**
	 * Parasoft Jtest UTA: Test for getAccounts(int)
	 *
	 * @see com.parasoft.parabank.service.ParaBankServiceImpl#getAccounts(int)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = ParaBankServiceException.class)
	public void testGetAccounts() throws Throwable {
		// Given
		ParaBankServiceImpl underTest = new ParaBankServiceImpl();
		BankManager bankManager = mockBankManager();
		underTest.setBankManager(bankManager);

		// When
		int customerId = 0; // UTA: default value
		underTest.getAccounts(customerId);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of BankManager
	 */
	private static BankManager mockBankManager() throws Throwable {
		BankManager bankManager = mock(BankManager.class);
		Customer getCustomerResult = mock(Customer.class);
		when(bankManager.getCustomer(anyInt())).thenReturn(getCustomerResult);
		return bankManager;
	}

	/**
	 * Parasoft Jtest UTA: Test for getAdminManager()
	 *
	 * @see com.parasoft.parabank.service.ParaBankServiceImpl#getAdminManager()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetAdminManager() throws Throwable {
		// Given
		ParaBankServiceImpl underTest = new ParaBankServiceImpl();

		// When
		AdminManager result = underTest.getAdminManager();

		// Then - assertions for result of method getAdminManager()
		assertNull(result);

		// Then - assertions for this instance of ParaBankServiceImpl
		assertNull(underTest.getBankManager());

	}

	/**
	 * Parasoft Jtest UTA: Test for getBankManager()
	 *
	 * @see com.parasoft.parabank.service.ParaBankServiceImpl#getBankManager()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetBankManager() throws Throwable {
		// Given
		ParaBankServiceImpl underTest = new ParaBankServiceImpl();

		// When
		BankManager result = underTest.getBankManager();

		// Then - assertions for result of method getBankManager()
		assertNull(result);

		// Then - assertions for this instance of ParaBankServiceImpl
		assertNull(underTest.getAdminManager());

	}

	/**
	 * Parasoft Jtest UTA: Test for getCustomer(int)
	 *
	 * @see com.parasoft.parabank.service.ParaBankServiceImpl#getCustomer(int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetCustomer() throws Throwable {
		// Given
		ParaBankServiceImpl underTest = new ParaBankServiceImpl();
		BankManager bankManager = mock(BankManager.class);
		underTest.setBankManager(bankManager);

		// When
		int customerId = 0; // UTA: default value
		Customer result = underTest.getCustomer(customerId);

		// Then - assertions for result of method getCustomer(int)
		assertNull(result);

		// Then - assertions for this instance of ParaBankServiceImpl
		assertNull(underTest.getAdminManager());
		assertNotNull(underTest.getBankManager());

	}

	/**
	 * Parasoft Jtest UTA: Test for getPosition(int)
	 *
	 * @see com.parasoft.parabank.service.ParaBankServiceImpl#getPosition(int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetPosition() throws Throwable {
		// Given
		ParaBankServiceImpl underTest = new ParaBankServiceImpl();
		BankManager bankManager = mock(BankManager.class);
		underTest.setBankManager(bankManager);

		// When
		int positionId = 0; // UTA: default value
		Position result = underTest.getPosition(positionId);

		// Then - assertions for result of method getPosition(int)
		assertNull(result);

		// Then - assertions for this instance of ParaBankServiceImpl
		assertNull(underTest.getAdminManager());
		assertNotNull(underTest.getBankManager());

	}

	/**
	 * Parasoft Jtest UTA: Test for getPositionHistory(int, String, String)
	 *
	 * @see com.parasoft.parabank.service.ParaBankServiceImpl#getPositionHistory(int, String, String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetPositionHistory() throws Throwable {
		// Given
		ParaBankServiceImpl underTest = new ParaBankServiceImpl();
		BankManager bankManager = mock(BankManager.class);
		underTest.setBankManager(bankManager);

		// When
		int positionId = 0; // UTA: default value
		String startDate = "startDate"; // UTA: default value
		String endDate = "endDate"; // UTA: default value
		List<HistoryPoint> result = underTest.getPositionHistory(positionId, startDate, endDate);

		// Then - assertions for this instance of ParaBankServiceImpl
		assertNull(underTest.getAdminManager());
		assertNotNull(underTest.getBankManager());

	}

	/**
	 * Parasoft Jtest UTA: Test for getPositions(int)
	 *
	 * @see com.parasoft.parabank.service.ParaBankServiceImpl#getPositions(int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetPositions() throws Throwable {
		// Given
		ParaBankServiceImpl underTest = new ParaBankServiceImpl();
		BankManager bankManager = mockBankManager2();
		underTest.setBankManager(bankManager);

		// When
		int customerId = 0; // UTA: default value
		List<Position> result = underTest.getPositions(customerId);

		// Then - assertions for result of method getPositions(int)
		assertNotNull(result);
		assertEquals(0, result.size());

		// Then - assertions for this instance of ParaBankServiceImpl
		assertNull(underTest.getAdminManager());
		assertNotNull(underTest.getBankManager());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of BankManager
	 */
	private static BankManager mockBankManager2() throws Throwable {
		BankManager bankManager = mock(BankManager.class);
		Customer getCustomerResult = mock(Customer.class);
		when(bankManager.getCustomer(anyInt())).thenReturn(getCustomerResult);
		return bankManager;
	}

	/**
	 * Parasoft Jtest UTA: Test for getTransaction(int)
	 *
	 * @see com.parasoft.parabank.service.ParaBankServiceImpl#getTransaction(int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetTransaction() throws Throwable {
		// Given
		ParaBankServiceImpl underTest = new ParaBankServiceImpl();
		BankManager bankManager = mock(BankManager.class);
		underTest.setBankManager(bankManager);

		// When
		int transactionId = 0; // UTA: default value
		Transaction result = underTest.getTransaction(transactionId);

		// Then - assertions for result of method getTransaction(int)
		assertNull(result);

		// Then - assertions for this instance of ParaBankServiceImpl
		assertNull(underTest.getAdminManager());
		assertNotNull(underTest.getBankManager());

	}

	/**
	 * Parasoft Jtest UTA: Test for getTransactions(int)
	 *
	 * @see com.parasoft.parabank.service.ParaBankServiceImpl#getTransactions(int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetTransactions() throws Throwable {
		// Given
		ParaBankServiceImpl underTest = new ParaBankServiceImpl();
		BankManager bankManager = mockBankManager3();
		underTest.setBankManager(bankManager);

		// When
		int accountId = 0; // UTA: default value
		List<Transaction> result = underTest.getTransactions(accountId);

		// Then - assertions for result of method getTransactions(int)
		assertNotNull(result);
		assertEquals(0, result.size());

		// Then - assertions for this instance of ParaBankServiceImpl
		assertNull(underTest.getAdminManager());
		assertNotNull(underTest.getBankManager());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of BankManager
	 */
	private static BankManager mockBankManager3() throws Throwable {
		BankManager bankManager = mock(BankManager.class);
		Account getAccountResult = mock(Account.class);
		when(bankManager.getAccount(anyInt())).thenReturn(getAccountResult);
		return bankManager;
	}

	/**
	 * Parasoft Jtest UTA: Test for getTransactionsByAmount(int, BigDecimal)
	 *
	 * @see com.parasoft.parabank.service.ParaBankServiceImpl#getTransactionsByAmount(int, BigDecimal)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetTransactionsByAmount() throws Throwable {
		// Given
		ParaBankServiceImpl underTest = new ParaBankServiceImpl();
		BankManager bankManager = mock(BankManager.class);
		underTest.setBankManager(bankManager);

		// When
		int accountId = 0; // UTA: default value
		BigDecimal amount = BigDecimal.ZERO; // UTA: default value
		List<Transaction> result = underTest.getTransactionsByAmount(accountId, amount);

		// Then - assertions for result of method getTransactionsByAmount(int, BigDecimal)
		assertNotNull(result);
		assertEquals(0, result.size());

		// Then - assertions for this instance of ParaBankServiceImpl
		assertNull(underTest.getAdminManager());
		assertNotNull(underTest.getBankManager());

	}

	/**
	 * Parasoft Jtest UTA: Test for getTransactionsByMonthAndType(int, String, String)
	 *
	 * @see com.parasoft.parabank.service.ParaBankServiceImpl#getTransactionsByMonthAndType(int, String, String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetTransactionsByMonthAndType() throws Throwable {
		// Given
		ParaBankServiceImpl underTest = new ParaBankServiceImpl();
		BankManager bankManager = mock(BankManager.class);
		underTest.setBankManager(bankManager);

		// When
		int accountId = 0; // UTA: default value
		String month = "month"; // UTA: default value
		String type = "type"; // UTA: default value
		List<Transaction> result = underTest.getTransactionsByMonthAndType(accountId, month, type);

		// Then - assertions for result of method getTransactionsByMonthAndType(int, String, String)
		assertNotNull(result);
		assertEquals(0, result.size());

		// Then - assertions for this instance of ParaBankServiceImpl
		assertNull(underTest.getAdminManager());
		assertNotNull(underTest.getBankManager());

	}

	/**
	 * Parasoft Jtest UTA: Test for getTransactionsByToFromDate(int, String, String)
	 *
	 * @see com.parasoft.parabank.service.ParaBankServiceImpl#getTransactionsByToFromDate(int, String, String)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = ParaBankServiceException.class)
	public void testGetTransactionsByToFromDate() throws Throwable {
		// Given
		ParaBankServiceImpl underTest = new ParaBankServiceImpl();

		// When
		int accountId = 0; // UTA: default value
		String fromDate = "fromDate"; // UTA: default value
		String toDate = "toDate"; // UTA: default value
		underTest.getTransactionsByToFromDate(accountId, fromDate, toDate);

	}

	/**
	 * Parasoft Jtest UTA: Test for getTransactionsOnDate(int, String)
	 *
	 * @see com.parasoft.parabank.service.ParaBankServiceImpl#getTransactionsOnDate(int, String)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = ParaBankServiceException.class)
	public void testGetTransactionsOnDate() throws Throwable {
		// Given
		ParaBankServiceImpl underTest = new ParaBankServiceImpl();

		// When
		int accountId = 0; // UTA: default value
		String onDate = "onDate"; // UTA: default value
		underTest.getTransactionsOnDate(accountId, onDate);

	}

	/**
	 * Parasoft Jtest UTA: Test for initializeDB()
	 *
	 * @see com.parasoft.parabank.service.ParaBankServiceImpl#initializeDB()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testInitializeDB() throws Throwable {
		// Given
		ParaBankServiceImpl underTest = new ParaBankServiceImpl();
		AdminManager adminManager = mock(AdminManager.class);
		underTest.setAdminManager(adminManager);

		// When
		underTest.initializeDB();

		// Then - assertions for this instance of ParaBankServiceImpl
		assertNotNull(underTest.getAdminManager());
		assertNull(underTest.getBankManager());

	}

	/**
	 * Parasoft Jtest UTA: Test for login(String, String)
	 *
	 * @see com.parasoft.parabank.service.ParaBankServiceImpl#login(String, String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testLogin() throws Throwable {
		// Given
		ParaBankServiceImpl underTest = new ParaBankServiceImpl();
		BankManager bankManager = mockBankManager4();
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

		// Then - assertions for this instance of ParaBankServiceImpl
		assertNull(underTest.getAdminManager());
		assertNotNull(underTest.getBankManager());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of BankManager
	 */
	private static BankManager mockBankManager4() throws Throwable {
		BankManager bankManager = mock(BankManager.class);
		Customer getCustomerResult = mock(Customer.class);
		when(bankManager.getCustomer(nullable(String.class), nullable(String.class))).thenReturn(getCustomerResult);
		return bankManager;
	}

	/**
	 * Parasoft Jtest UTA: Test for login(String, String)
	 *
	 * @see com.parasoft.parabank.service.ParaBankServiceImpl#login(String, String)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = ParaBankServiceException.class)
	public void testLogin2() throws Throwable {
		// Given
		ParaBankServiceImpl underTest = new ParaBankServiceImpl();
		BankManager bankManager = mockBankManager5();
		underTest.setBankManager(bankManager);

		// When
		String username = "username"; // UTA: default value
		String password = "password"; // UTA: default value
		underTest.login(username, password);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of BankManager
	 */
	private static BankManager mockBankManager5() throws Throwable {
		BankManager bankManager = mock(BankManager.class);
		Customer getCustomerResult = null; // UTA: provided value
		when(bankManager.getCustomer(nullable(String.class), nullable(String.class))).thenReturn(getCustomerResult);
		return bankManager;
	}

	/**
	 * Parasoft Jtest UTA: Test for requestLoan(int, BigDecimal, BigDecimal, int)
	 *
	 * @see com.parasoft.parabank.service.ParaBankServiceImpl#requestLoan(int, BigDecimal, BigDecimal, int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testRequestLoan() throws Throwable {
		// Given
		ParaBankServiceImpl underTest = new ParaBankServiceImpl();
		BankManager bankManager = mock(BankManager.class);
		underTest.setBankManager(bankManager);

		// When
		int customerId = 0; // UTA: default value
		BigDecimal amount = BigDecimal.ZERO; // UTA: default value
		BigDecimal downPayment = BigDecimal.ZERO; // UTA: default value
		int fromAccountId = 0; // UTA: default value
		LoanResponse result = underTest.requestLoan(customerId, amount, downPayment, fromAccountId);

		// Then - assertions for result of method requestLoan(int, BigDecimal, BigDecimal, int)
		assertNull(result);

		// Then - assertions for this instance of ParaBankServiceImpl
		assertNull(underTest.getAdminManager());
		assertNotNull(underTest.getBankManager());

	}

	/**
	 * Parasoft Jtest UTA: Test for sellPosition(int, int, int, int, BigDecimal)
	 *
	 * @see com.parasoft.parabank.service.ParaBankServiceImpl#sellPosition(int, int, int, int, BigDecimal)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSellPosition() throws Throwable {
		// Given
		ParaBankServiceImpl underTest = new ParaBankServiceImpl();
		BankManager bankManager = mock(BankManager.class);
		underTest.setBankManager(bankManager);

		// When
		int customerId = 0; // UTA: default value
		int accountId = 0; // UTA: default value
		int positionId = 0; // UTA: default value
		int shares = 0; // UTA: default value
		BigDecimal pricePerShare = BigDecimal.ZERO; // UTA: default value
		List<Position> result = underTest.sellPosition(customerId, accountId, positionId, shares, pricePerShare);

		// Then - assertions for result of method sellPosition(int, int, int, int, BigDecimal)
		assertNotNull(result);
		assertEquals(0, result.size());

		// Then - assertions for this instance of ParaBankServiceImpl
		assertNull(underTest.getAdminManager());
		assertNotNull(underTest.getBankManager());

	}

	/**
	 * Parasoft Jtest UTA: Test for sellPosition(int, int, int, int, BigDecimal)
	 *
	 * @see com.parasoft.parabank.service.ParaBankServiceImpl#sellPosition(int, int, int, int, BigDecimal)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = ParaBankServiceException.class)
	public void testSellPosition2() throws Throwable {
		// Given
		ParaBankServiceImpl underTest = new ParaBankServiceImpl();

		// When
		int customerId = 0; // UTA: default value
		int accountId = 0; // UTA: default value
		int positionId = 0; // UTA: default value
		int shares = 0; // UTA: default value
		BigDecimal pricePerShare = BigDecimal.ZERO; // UTA: default value
		underTest.sellPosition(customerId, accountId, positionId, shares, pricePerShare);

	}

	/**
	 * Parasoft Jtest UTA: Test for setParameter(String, String)
	 *
	 * @see com.parasoft.parabank.service.ParaBankServiceImpl#setParameter(String, String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetParameter() throws Throwable {
		// Given
		ParaBankServiceImpl underTest = new ParaBankServiceImpl();
		AdminManager adminManager = mock(AdminManager.class);
		underTest.setAdminManager(adminManager);

		// When
		String name = "name"; // UTA: default value
		String value = "value"; // UTA: default value
		underTest.setParameter(name, value);

		// Then - assertions for this instance of ParaBankServiceImpl
		assertNotNull(underTest.getAdminManager());
		assertNull(underTest.getBankManager());

	}

	/**
	 * Parasoft Jtest UTA: Test for shutdownJmsListener()
	 *
	 * @see com.parasoft.parabank.service.ParaBankServiceImpl#shutdownJmsListener()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testShutdownJmsListener() throws Throwable {
		// Given
		ParaBankServiceImpl underTest = new ParaBankServiceImpl();
		AdminManager adminManager = mock(AdminManager.class);
		underTest.setAdminManager(adminManager);

		// When
		underTest.shutdownJmsListener();

		// Then - assertions for this instance of ParaBankServiceImpl
		assertNotNull(underTest.getAdminManager());
		assertNull(underTest.getBankManager());

	}

	/**
	 * Parasoft Jtest UTA: Test for startupJmsListener()
	 *
	 * @see com.parasoft.parabank.service.ParaBankServiceImpl#startupJmsListener()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testStartupJmsListener() throws Throwable {
		// Given
		ParaBankServiceImpl underTest = new ParaBankServiceImpl();
		AdminManager adminManager = mock(AdminManager.class);
		underTest.setAdminManager(adminManager);

		// When
		underTest.startupJmsListener();

		// Then - assertions for this instance of ParaBankServiceImpl
		assertNotNull(underTest.getAdminManager());
		assertNull(underTest.getBankManager());

	}

	/**
	 * Parasoft Jtest UTA: Test for transfer(int, int, BigDecimal)
	 *
	 * @see com.parasoft.parabank.service.ParaBankServiceImpl#transfer(int, int, BigDecimal)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testTransfer() throws Throwable {
		// Given
		ParaBankServiceImpl underTest = new ParaBankServiceImpl();
		BankManager bankManager = mock(BankManager.class);
		underTest.setBankManager(bankManager);

		// When
		int fromAccountId = 0; // UTA: default value
		int toAccountId = 0; // UTA: default value
		BigDecimal amount = BigDecimal.ZERO; // UTA: default value
		String result = underTest.transfer(fromAccountId, toAccountId, amount);

		// Then - assertions for result of method transfer(int, int, BigDecimal)
		assertEquals("Successfully transferred $0 from account #0 to account #0", result);

		// Then - assertions for this instance of ParaBankServiceImpl
		assertNull(underTest.getAdminManager());
		assertNotNull(underTest.getBankManager());

	}

	/**
	 * Parasoft Jtest UTA: Test for updateCustomer(int, String, String, String, String, String, String, String, String, String, String)
	 *
	 * @see com.parasoft.parabank.service.ParaBankServiceImpl#updateCustomer(int, String, String, String, String, String, String, String, String, String, String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testUpdateCustomer() throws Throwable {
		// Given
		ParaBankServiceImpl underTest = new ParaBankServiceImpl();
		BankManager bankManager = mock(BankManager.class);
		underTest.setBankManager(bankManager);

		// When
		int customerId = 0; // UTA: default value
		String firstName = "firstName"; // UTA: default value
		String lastName = "lastName"; // UTA: default value
		String street = "street"; // UTA: default value
		String city = "city"; // UTA: default value
		String state = "state"; // UTA: default value
		String zipCode = "zipCode"; // UTA: default value
		String phoneNumber = "phoneNumber"; // UTA: default value
		String ssn = "ssn"; // UTA: default value
		String username = "username"; // UTA: default value
		String password = "password"; // UTA: default value
		String result = underTest.updateCustomer(customerId, firstName, lastName, street, city, state, zipCode,
				phoneNumber, ssn, username, password);

		// Then - assertions for result of method updateCustomer(int, String, String, String, String, String, String, String, String, String, String)
		assertEquals("Successfully updated customer profile", result);

		// Then - assertions for this instance of ParaBankServiceImpl
		assertNull(underTest.getAdminManager());
		assertNotNull(underTest.getBankManager());

	}

	/**
	 * Parasoft Jtest UTA: Test for updateCustomer(int, String, String, String, String, String, String, String, String, String, String)
	 *
	 * @see com.parasoft.parabank.service.ParaBankServiceImpl#updateCustomer(int, String, String, String, String, String, String, String, String, String, String)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = ParaBankServiceException.class)
	public void testUpdateCustomer2() throws Throwable {
		// Given
		ParaBankServiceImpl underTest = new ParaBankServiceImpl();

		// When
		int customerId = 0; // UTA: default value
		String firstName = "firstName"; // UTA: default value
		String lastName = "lastName"; // UTA: default value
		String street = "street"; // UTA: default value
		String city = "city"; // UTA: default value
		String state = "state"; // UTA: default value
		String zipCode = "zipCode"; // UTA: default value
		String phoneNumber = "phoneNumber"; // UTA: default value
		String ssn = "ssn"; // UTA: default value
		String username = "username"; // UTA: default value
		String password = "password"; // UTA: default value
		underTest.updateCustomer(customerId, firstName, lastName, street, city, state, zipCode, phoneNumber, ssn,
				username, password);

	}

	/**
	 * Parasoft Jtest UTA: Test for withdraw(int, BigDecimal)
	 *
	 * @see com.parasoft.parabank.service.ParaBankServiceImpl#withdraw(int, BigDecimal)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testWithdraw() throws Throwable {
		// Given
		ParaBankServiceImpl underTest = new ParaBankServiceImpl();
		BankManager bankManager = mock(BankManager.class);
		underTest.setBankManager(bankManager);

		// When
		int accountId = 0; // UTA: default value
		BigDecimal amount = BigDecimal.ZERO; // UTA: default value
		String result = underTest.withdraw(accountId, amount);

		// Then - assertions for result of method withdraw(int, BigDecimal)
		assertEquals("Successfully withdrew $0 from account #0", result);

		// Then - assertions for this instance of ParaBankServiceImpl
		assertNull(underTest.getAdminManager());
		assertNotNull(underTest.getBankManager());

	}
}