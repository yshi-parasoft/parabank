/**
 * 
 */
package com.parasoft.parabank.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.nullable;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.parasoft.parabank.domain.Account.AccountType;
import java.math.BigDecimal;
import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for Account
 *
 * @see com.parasoft.parabank.domain.Account
 * @author devtest
 */
public class AccountTest {

	/**
	 * Parasoft Jtest UTA: Test for credit(BigDecimal)
	 *
	 * @see com.parasoft.parabank.domain.Account#credit(BigDecimal)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testCredit() throws Throwable {
		// Given
		Account underTest = new Account();
		BigDecimal balance = BigDecimal.ZERO; // UTA: default value
		underTest.setBalance(balance);

		// When
		BigDecimal amount = BigDecimal.ZERO; // UTA: default value
		underTest.credit(amount);

		// Then - assertions for this instance of Account
		assertEquals(0, underTest.getId());
		assertEquals(0, underTest.getCustomerId());
		assertNull(underTest.getType());
		assertNotNull(underTest.getBalance());
		assertEquals(0d, underTest.getBalance().doubleValue(), 0.0);

	}

	/**
	 * Parasoft Jtest UTA: Test for debit(BigDecimal)
	 *
	 * @see com.parasoft.parabank.domain.Account#debit(BigDecimal)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testDebit() throws Throwable {
		// Given
		Account underTest = new Account();
		BigDecimal balance = BigDecimal.ZERO; // UTA: default value
		underTest.setBalance(balance);

		// When
		BigDecimal amount = BigDecimal.ZERO; // UTA: default value
		underTest.debit(amount);

		// Then - assertions for this instance of Account
		assertEquals(0, underTest.getId());
		assertEquals(0, underTest.getCustomerId());
		assertNull(underTest.getType());
		assertNotNull(underTest.getBalance());
		assertEquals(0d, underTest.getBalance().doubleValue(), 0.0);

	}

	/**
	 * Parasoft Jtest UTA: Test for equals(Object)
	 *
	 * @see com.parasoft.parabank.domain.Account#equals(Object)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testEquals() throws Throwable {
		// Given
		Account underTest = new Account();

		// When
		Object obj = null; // UTA: provided value
		boolean result = underTest.equals(obj);

		// Then - assertions for result of method equals(Object)
		assertFalse(result);

		// Then - assertions for this instance of Account
		assertEquals(0, underTest.getId());
		assertEquals(0, underTest.getCustomerId());
		assertNull(underTest.getType());
		assertNull(underTest.getBalance());

	}

	/**
	 * Parasoft Jtest UTA: Test for equals(Object)
	 *
	 * @see com.parasoft.parabank.domain.Account#equals(Object)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testEquals2() throws Throwable {
		// Given
		Account underTest = new Account();
		int id = 0; // UTA: provided value
		underTest.setId(id);

		// When
		Account obj = mock(Account.class);
		boolean result = underTest.equals(obj);

		// Then - assertions for result of method equals(Object)
		assertTrue(result);

		// Then - assertions for this instance of Account
		assertEquals(0, underTest.getId());
		assertEquals(0, underTest.getCustomerId());
		assertNull(underTest.getType());
		assertNull(underTest.getBalance());

	}

	/**
	 * Parasoft Jtest UTA: Test for equals(Object)
	 *
	 * @see com.parasoft.parabank.domain.Account#equals(Object)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testEquals3() throws Throwable {
		// Given
		Account underTest = new Account();
		int customerId = -1000; // UTA: provided value
		underTest.setCustomerId(customerId);
		int id = -1000; // UTA: provided value
		underTest.setId(id);

		// When
		Account obj = mock(Account.class);
		boolean result = underTest.equals(obj);

		// Then - assertions for result of method equals(Object)
		assertFalse(result);

		// Then - assertions for this instance of Account
		assertEquals(-1000, underTest.getId());
		assertEquals(-1000, underTest.getCustomerId());
		assertNull(underTest.getType());
		assertNull(underTest.getBalance());

	}

	/**
	 * Parasoft Jtest UTA: Test for getAvailableBalance()
	 *
	 * @see com.parasoft.parabank.domain.Account#getAvailableBalance()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetAvailableBalance() throws Throwable {
		// Given
		Account underTest = new Account();
		BigDecimal balance = BigDecimal.ZERO; // UTA: default value
		underTest.setBalance(balance);

		// When
		BigDecimal result = underTest.getAvailableBalance();

		// Then - assertions for result of method getAvailableBalance()
		assertNotNull(result);
		assertEquals(0d, result.doubleValue(), 0.0);

		// Then - assertions for this instance of Account
		assertEquals(0, underTest.getId());
		assertEquals(0, underTest.getCustomerId());
		assertNull(underTest.getType());
		assertNotNull(underTest.getBalance());
		assertEquals(0d, underTest.getBalance().doubleValue(), 0.0);

	}

	/**
	 * Parasoft Jtest UTA: Test for getBalance()
	 *
	 * @see com.parasoft.parabank.domain.Account#getBalance()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetBalance() throws Throwable {
		// Given
		Account underTest = new Account();

		// When
		BigDecimal result = underTest.getBalance();

		// Then - assertions for result of method getBalance()
		assertNull(result);

		// Then - assertions for this instance of Account
		assertEquals(0, underTest.getId());
		assertEquals(0, underTest.getCustomerId());
		assertNull(underTest.getType());

	}

	/**
	 * Parasoft Jtest UTA: Test for getCustomerId()
	 *
	 * @see com.parasoft.parabank.domain.Account#getCustomerId()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetCustomerId() throws Throwable {
		// Given
		Account underTest = new Account();

		// When
		int result = underTest.getCustomerId();

		// Then - assertions for result of method getCustomerId()
		assertEquals(0, result);

		// Then - assertions for this instance of Account
		assertEquals(0, underTest.getId());
		assertNull(underTest.getType());
		assertNull(underTest.getBalance());

	}

	/**
	 * Parasoft Jtest UTA: Test for getId()
	 *
	 * @see com.parasoft.parabank.domain.Account#getId()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetId() throws Throwable {
		// Given
		Account underTest = new Account();

		// When
		int result = underTest.getId();

		// Then - assertions for result of method getId()
		assertEquals(0, result);

		// Then - assertions for this instance of Account
		assertEquals(0, underTest.getCustomerId());
		assertNull(underTest.getType());
		assertNull(underTest.getBalance());

	}

	/**
	 * Parasoft Jtest UTA: Test for getIntType()
	 *
	 * @see com.parasoft.parabank.domain.Account#getIntType()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetIntType() throws Throwable {
		// Given
		Account underTest = new Account();

		// When
		int result = underTest.getIntType();

		// Then - assertions for result of method getIntType()
		assertEquals(2, result);

		// Then - assertions for this instance of Account
		assertEquals(0, underTest.getId());
		assertEquals(0, underTest.getCustomerId());
		assertNull(underTest.getType());
		assertNull(underTest.getBalance());

	}

	/**
	 * Parasoft Jtest UTA: Test for getIntType()
	 *
	 * @see com.parasoft.parabank.domain.Account#getIntType()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetIntType2() throws Throwable {
		// Given
		Account underTest = new Account();
		AccountType type = AccountType.CHECKING; // UTA: default value
		underTest.setType(type);

		// When
		int result = underTest.getIntType();

		// Then - assertions for result of method getIntType()
		assertEquals(0, result);

		// Then - assertions for this instance of Account
		assertEquals(0, underTest.getId());
		assertEquals(0, underTest.getCustomerId());
		assertEquals(com.parasoft.parabank.domain.Account.AccountType.CHECKING, underTest.getType());
		assertNull(underTest.getBalance());

	}

	/**
	 * Parasoft Jtest UTA: Test for getType()
	 *
	 * @see com.parasoft.parabank.domain.Account#getType()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetType() throws Throwable {
		// Given
		Account underTest = new Account();

		// When
		AccountType result = underTest.getType();

		// Then - assertions for result of method getType()
		assertNull(result);

		// Then - assertions for this instance of Account
		assertEquals(0, underTest.getId());
		assertEquals(0, underTest.getCustomerId());
		assertNull(underTest.getBalance());

	}

	/**
	 * Parasoft Jtest UTA: Test for hashCode()
	 *
	 * @see com.parasoft.parabank.domain.Account#hashCode()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testHashCode() throws Throwable {
		// Given
		Account underTest = new Account();
		AccountType type = AccountType.CHECKING; // UTA: default value
		underTest.setType(type);
		BigDecimal balance = BigDecimal.ZERO; // UTA: default value
		underTest.setBalance(balance);

		// When
		int result = underTest.hashCode();

		// Then - assertions for result of method hashCode()
		// assertEquals(0, result);// UTA: Expected value may be unstable

		// Then - assertions for this instance of Account
		assertEquals(0, underTest.getId());
		assertEquals(0, underTest.getCustomerId());
		assertEquals(com.parasoft.parabank.domain.Account.AccountType.CHECKING, underTest.getType());
		assertNotNull(underTest.getBalance());
		assertEquals(0d, underTest.getBalance().doubleValue(), 0.0);

	}

	/**
	 * Parasoft Jtest UTA: Test for readFrom(JsonObject)
	 *
	 * @see com.parasoft.parabank.domain.Account#readFrom(JsonObject)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testReadFrom() throws Throwable {
		// When
		JsonObject json = mockJsonObject();
		Account result = Account.readFrom(json);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of JsonElement
	 */
	private static JsonElement mockJsonElement() throws Throwable {
		JsonElement getResult = mock(JsonElement.class);
		BigDecimal getAsBigDecimalResult = BigDecimal.ZERO; // UTA: default value
		when(getResult.getAsBigDecimal()).thenReturn(getAsBigDecimalResult);
		return getResult;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of JsonObject
	 */
	private static JsonObject mockJsonObject() throws Throwable {
		JsonObject json = mock(JsonObject.class);
		JsonElement getResult = mockJsonElement();
		JsonElement getResult2 = mock(JsonElement.class);
		JsonElement getResult3 = mock(JsonElement.class);
		JsonElement getResult4 = mock(JsonElement.class);
		when(json.get(nullable(String.class))).thenReturn(getResult, getResult2, getResult3, getResult4);
		return json;
	}

	/**
	 * Parasoft Jtest UTA: Test for setType(int)
	 *
	 * @see com.parasoft.parabank.domain.Account#setType(int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetType() throws Throwable {
		// Given
		Account underTest = new Account();

		// When
		int type = 0; // UTA: default value
		underTest.setType(type);

		// Then - assertions for this instance of Account
		assertEquals(0, underTest.getId());
		assertEquals(0, underTest.getCustomerId());
		assertEquals(com.parasoft.parabank.domain.Account.AccountType.CHECKING, underTest.getType());
		assertNull(underTest.getBalance());

	}

	/**
	 * Parasoft Jtest UTA: Test for toString()
	 *
	 * @see com.parasoft.parabank.domain.Account#toString()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testToString() throws Throwable {
		// Given
		Account underTest = new Account();
		AccountType type = AccountType.CHECKING; // UTA: default value
		underTest.setType(type);
		BigDecimal balance = BigDecimal.ZERO; // UTA: default value
		underTest.setBalance(balance);

		// When
		String result = underTest.toString();

		// Then - assertions for result of method toString()
		assertEquals("Account [id=0, customerId=0, type=CHECKING, balance=0]", result);

		// Then - assertions for this instance of Account
		assertEquals(0, underTest.getId());
		assertEquals(0, underTest.getCustomerId());
		assertEquals(com.parasoft.parabank.domain.Account.AccountType.CHECKING, underTest.getType());
		assertNotNull(underTest.getBalance());
		assertEquals(0d, underTest.getBalance().doubleValue(), 0.0);

	}
}