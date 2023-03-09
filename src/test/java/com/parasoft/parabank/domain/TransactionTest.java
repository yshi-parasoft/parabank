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
import com.parasoft.parabank.domain.Transaction.TransactionType;
import java.math.BigDecimal;
import java.util.Date;
import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for Transaction
 *
 * @see com.parasoft.parabank.domain.Transaction
 * @author devtest
 */
public class TransactionTest {

	/**
	 * Parasoft Jtest UTA: Test for equals(Object)
	 *
	 * @see com.parasoft.parabank.domain.Transaction#equals(Object)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testEquals() throws Throwable {
		// Given
		Transaction underTest = new Transaction();

		// When
		Object obj = null; // UTA: provided value
		boolean result = underTest.equals(obj);

		// Then - assertions for result of method equals(Object)
		assertFalse(result);

		// Then - assertions for this instance of Transaction
		assertEquals(0, underTest.getId());
		assertEquals(0, underTest.getAccountId());
		assertNull(underTest.getType());
		assertNull(underTest.getDate());
		assertNull(underTest.getAmount());
		assertNull(underTest.getDescription());

	}

	/**
	 * Parasoft Jtest UTA: Test for equals(Object)
	 *
	 * @see com.parasoft.parabank.domain.Transaction#equals(Object)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testEquals2() throws Throwable {
		// Given
		Transaction underTest = new Transaction();
		int id = 0; // UTA: provided value
		underTest.setId(id);

		// When
		Transaction obj = mock(Transaction.class);
		boolean result = underTest.equals(obj);

		// Then - assertions for result of method equals(Object)
		assertTrue(result);

		// Then - assertions for this instance of Transaction
		assertEquals(0, underTest.getId());
		assertEquals(0, underTest.getAccountId());
		assertNull(underTest.getType());
		assertNull(underTest.getDate());
		assertNull(underTest.getAmount());
		assertNull(underTest.getDescription());

	}

	/**
	 * Parasoft Jtest UTA: Test for equals(Object)
	 *
	 * @see com.parasoft.parabank.domain.Transaction#equals(Object)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testEquals3() throws Throwable {
		// Given
		Transaction underTest = new Transaction();
		int accountId = -1000; // UTA: provided value
		underTest.setAccountId(accountId);
		int id = -1000; // UTA: provided value
		underTest.setId(id);

		// When
		Transaction obj = mock(Transaction.class);
		boolean result = underTest.equals(obj);

		// Then - assertions for result of method equals(Object)
		assertFalse(result);

		// Then - assertions for this instance of Transaction
		assertEquals(-1000, underTest.getId());
		assertEquals(-1000, underTest.getAccountId());
		assertNull(underTest.getType());
		assertNull(underTest.getDate());
		assertNull(underTest.getAmount());
		assertNull(underTest.getDescription());

	}

	/**
	 * Parasoft Jtest UTA: Test for equals(Object)
	 *
	 * @see com.parasoft.parabank.domain.Transaction#equals(Object)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testEquals4() throws Throwable {
		// Given
		Transaction underTest = new Transaction();
		Date date = mock(Date.class);
		underTest.setDate(date);
		int accountId = -1000; // UTA: provided value
		underTest.setAccountId(accountId);
		int id = -1000; // UTA: provided value
		underTest.setId(id);

		// When
		Transaction obj = mock(Transaction.class);
		boolean result = underTest.equals(obj);

		// Then - assertions for result of method equals(Object)
		assertFalse(result);

		// Then - assertions for this instance of Transaction
		assertEquals(-1000, underTest.getId());
		assertEquals(-1000, underTest.getAccountId());
		assertNull(underTest.getType());
		assertNotNull(underTest.getDate());
		assertNull(underTest.getAmount());
		assertNull(underTest.getDescription());

	}

	/**
	 * Parasoft Jtest UTA: Test for getAccountId()
	 *
	 * @see com.parasoft.parabank.domain.Transaction#getAccountId()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetAccountId() throws Throwable {
		// Given
		Transaction underTest = new Transaction();

		// When
		int result = underTest.getAccountId();

		// Then - assertions for result of method getAccountId()
		assertEquals(0, result);

		// Then - assertions for this instance of Transaction
		assertEquals(0, underTest.getId());
		assertNull(underTest.getType());
		assertNull(underTest.getDate());
		assertNull(underTest.getAmount());
		assertNull(underTest.getDescription());

	}

	/**
	 * Parasoft Jtest UTA: Test for getAmount()
	 *
	 * @see com.parasoft.parabank.domain.Transaction#getAmount()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetAmount() throws Throwable {
		// Given
		Transaction underTest = new Transaction();

		// When
		BigDecimal result = underTest.getAmount();

		// Then - assertions for result of method getAmount()
		assertNull(result);

		// Then - assertions for this instance of Transaction
		assertEquals(0, underTest.getId());
		assertEquals(0, underTest.getAccountId());
		assertNull(underTest.getType());
		assertNull(underTest.getDate());
		assertNull(underTest.getDescription());

	}

	/**
	 * Parasoft Jtest UTA: Test for getDate()
	 *
	 * @see com.parasoft.parabank.domain.Transaction#getDate()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetDate() throws Throwable {
		// Given
		Transaction underTest = new Transaction();

		// When
		Date result = underTest.getDate();

		// Then - assertions for result of method getDate()
		assertNull(result);

		// Then - assertions for this instance of Transaction
		assertEquals(0, underTest.getId());
		assertEquals(0, underTest.getAccountId());
		assertNull(underTest.getType());
		assertNull(underTest.getAmount());
		assertNull(underTest.getDescription());

	}

	/**
	 * Parasoft Jtest UTA: Test for getDescription()
	 *
	 * @see com.parasoft.parabank.domain.Transaction#getDescription()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetDescription() throws Throwable {
		// Given
		Transaction underTest = new Transaction();

		// When
		String result = underTest.getDescription();

		// Then - assertions for result of method getDescription()
		assertNull(result);

		// Then - assertions for this instance of Transaction
		assertEquals(0, underTest.getId());
		assertEquals(0, underTest.getAccountId());
		assertNull(underTest.getType());
		assertNull(underTest.getDate());
		assertNull(underTest.getAmount());

	}

	/**
	 * Parasoft Jtest UTA: Test for getId()
	 *
	 * @see com.parasoft.parabank.domain.Transaction#getId()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetId() throws Throwable {
		// Given
		Transaction underTest = new Transaction();

		// When
		int result = underTest.getId();

		// Then - assertions for result of method getId()
		assertEquals(0, result);

		// Then - assertions for this instance of Transaction
		assertEquals(0, underTest.getAccountId());
		assertNull(underTest.getType());
		assertNull(underTest.getDate());
		assertNull(underTest.getAmount());
		assertNull(underTest.getDescription());

	}

	/**
	 * Parasoft Jtest UTA: Test for getIntType()
	 *
	 * @see com.parasoft.parabank.domain.Transaction#getIntType()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetIntType() throws Throwable {
		// Given
		Transaction underTest = new Transaction();
		TransactionType type = TransactionType.Credit; // UTA: default value
		underTest.setType(type);

		// When
		int result = underTest.getIntType();

		// Then - assertions for result of method getIntType()
		assertEquals(0, result);

		// Then - assertions for this instance of Transaction
		assertEquals(0, underTest.getId());
		assertEquals(0, underTest.getAccountId());
		assertEquals(com.parasoft.parabank.domain.Transaction.TransactionType.Credit, underTest.getType());
		assertNull(underTest.getDate());
		assertNull(underTest.getAmount());
		assertNull(underTest.getDescription());

	}

	/**
	 * Parasoft Jtest UTA: Test for getType()
	 *
	 * @see com.parasoft.parabank.domain.Transaction#getType()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetType() throws Throwable {
		// Given
		Transaction underTest = new Transaction();

		// When
		TransactionType result = underTest.getType();

		// Then - assertions for result of method getType()
		assertNull(result);

		// Then - assertions for this instance of Transaction
		assertEquals(0, underTest.getId());
		assertEquals(0, underTest.getAccountId());
		assertNull(underTest.getDate());
		assertNull(underTest.getAmount());
		assertNull(underTest.getDescription());

	}

	/**
	 * Parasoft Jtest UTA: Test for hashCode()
	 *
	 * @see com.parasoft.parabank.domain.Transaction#hashCode()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testHashCode() throws Throwable {
		// Given
		Transaction underTest = new Transaction();
		BigDecimal amount = BigDecimal.ZERO; // UTA: default value
		underTest.setAmount(amount);
		String description = "description"; // UTA: default value
		underTest.setDescription(description);
		TransactionType type = TransactionType.Credit; // UTA: default value
		underTest.setType(type);

		// When
		int result = underTest.hashCode();

		// Then - assertions for result of method hashCode()
		// assertEquals(0, result);// UTA: Expected value may be unstable

		// Then - assertions for this instance of Transaction
		assertEquals(0, underTest.getId());
		assertEquals(0, underTest.getAccountId());
		assertEquals(com.parasoft.parabank.domain.Transaction.TransactionType.Credit, underTest.getType());
		assertNull(underTest.getDate());
		assertNotNull(underTest.getAmount());
		assertEquals(0d, underTest.getAmount().doubleValue(), 0.0);
		assertEquals("description", underTest.getDescription());

	}

	/**
	 * Parasoft Jtest UTA: Test for readFrom(JsonObject)
	 *
	 * @see com.parasoft.parabank.domain.Transaction#readFrom(JsonObject)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testReadFrom() throws Throwable {
		// When
		JsonObject json = mockJsonObject();
		Transaction result = Transaction.readFrom(json);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of JsonElement
	 */
	private static JsonElement mockJsonElement() throws Throwable {
		JsonElement getResult2 = mock(JsonElement.class);
		BigDecimal getAsBigDecimalResult = BigDecimal.ZERO; // UTA: default value
		when(getResult2.getAsBigDecimal()).thenReturn(getAsBigDecimalResult);
		return getResult2;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of JsonElement
	 */
	private static JsonElement mockJsonElement2() throws Throwable {
		JsonElement getResult3 = mock(JsonElement.class);
		String getAsStringResult = "getAsStringResult"; // UTA: default value
		when(getResult3.getAsString()).thenReturn(getAsStringResult);
		return getResult3;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of JsonObject
	 */
	private static JsonObject mockJsonObject() throws Throwable {
		JsonObject json = mock(JsonObject.class);
		JsonElement getResult = mock(JsonElement.class);
		JsonElement getResult2 = mockJsonElement();
		JsonElement getResult3 = mockJsonElement2();
		JsonElement getResult4 = mock(JsonElement.class);
		JsonElement getResult5 = mock(JsonElement.class);
		JsonElement getResult6 = mock(JsonElement.class);
		when(json.get(nullable(String.class))).thenReturn(getResult, getResult2, getResult3, getResult4, getResult5,
				getResult6);
		return json;
	}

	/**
	 * Parasoft Jtest UTA: Test for setType(int)
	 *
	 * @see com.parasoft.parabank.domain.Transaction#setType(int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetType() throws Throwable {
		// Given
		Transaction underTest = new Transaction();

		// When
		int type = 0; // UTA: default value
		underTest.setType(type);

		// Then - assertions for this instance of Transaction
		assertEquals(0, underTest.getId());
		assertEquals(0, underTest.getAccountId());
		assertEquals(com.parasoft.parabank.domain.Transaction.TransactionType.Credit, underTest.getType());
		assertNull(underTest.getDate());
		assertNull(underTest.getAmount());
		assertNull(underTest.getDescription());

	}

	/**
	 * Parasoft Jtest UTA: Test for toString()
	 *
	 * @see com.parasoft.parabank.domain.Transaction#toString()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testToString() throws Throwable {
		// Given
		Transaction underTest = new Transaction();
		BigDecimal amount = BigDecimal.ZERO; // UTA: default value
		underTest.setAmount(amount);
		Date date = mock(Date.class);
		underTest.setDate(date);
		String description = "description"; // UTA: default value
		underTest.setDescription(description);
		TransactionType type = TransactionType.Credit; // UTA: default value
		underTest.setType(type);

		// When
		String result = underTest.toString();

		// Then - assertions for result of method toString()
		assertEquals(
"[deleted by script]",
				result);

		// Then - assertions for this instance of Transaction
		assertEquals(0, underTest.getId());
		assertEquals(0, underTest.getAccountId());
		assertEquals(com.parasoft.parabank.domain.Transaction.TransactionType.Credit, underTest.getType());
		assertNotNull(underTest.getDate());
		assertNotNull(underTest.getAmount());
		assertEquals(0d, underTest.getAmount().doubleValue(), 0.0);
		assertEquals("description", underTest.getDescription());

	}
}