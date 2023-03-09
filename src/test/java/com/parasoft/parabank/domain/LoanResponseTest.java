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
import java.util.Date;
import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for LoanResponse
 *
 * @see com.parasoft.parabank.domain.LoanResponse
 * @author devtest
 */
public class LoanResponseTest {

	/**
	 * Parasoft Jtest UTA: Test for equals(Object)
	 *
	 * @see com.parasoft.parabank.domain.LoanResponse#equals(Object)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testEquals() throws Throwable {
		// Given
		LoanResponse underTest = new LoanResponse();

		// When
		Object obj = null; // UTA: provided value
		boolean result = underTest.equals(obj);

		// Then - assertions for result of method equals(Object)
		assertFalse(result);

		// Then - assertions for this instance of LoanResponse
		assertNull(underTest.getResponseDate());
		assertNull(underTest.getLoanProviderName());
		assertFalse(underTest.isApproved());
		assertNull(underTest.getMessage());
		assertNull(underTest.getAccountId());

	}

	/**
	 * Parasoft Jtest UTA: Test for equals(Object)
	 *
	 * @see com.parasoft.parabank.domain.LoanResponse#equals(Object)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testEquals2() throws Throwable {
		// Given
		LoanResponse underTest = new LoanResponse();

		// When
		LoanResponse obj = mock(LoanResponse.class);
		boolean result = underTest.equals(obj);

		// Then - assertions for result of method equals(Object)
		assertTrue(result);

		// Then - assertions for this instance of LoanResponse
		assertNull(underTest.getResponseDate());
		assertNull(underTest.getLoanProviderName());
		assertFalse(underTest.isApproved());
		assertNull(underTest.getMessage());
		assertNull(underTest.getAccountId());

	}

	/**
	 * Parasoft Jtest UTA: Test for equals(Object)
	 *
	 * @see com.parasoft.parabank.domain.LoanResponse#equals(Object)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testEquals3() throws Throwable {
		// Given
		LoanResponse underTest = new LoanResponse();
		boolean approved = true; // UTA: provided value
		underTest.setApproved(approved);

		// When
		LoanResponse obj = mock(LoanResponse.class);
		boolean result = underTest.equals(obj);

		// Then - assertions for result of method equals(Object)
		assertFalse(result);

		// Then - assertions for this instance of LoanResponse
		assertNull(underTest.getResponseDate());
		assertNull(underTest.getLoanProviderName());
		assertTrue(underTest.isApproved());
		assertNull(underTest.getMessage());
		assertNull(underTest.getAccountId());

	}

	/**
	 * Parasoft Jtest UTA: Test for getAccountId()
	 *
	 * @see com.parasoft.parabank.domain.LoanResponse#getAccountId()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetAccountId() throws Throwable {
		// Given
		LoanResponse underTest = new LoanResponse();

		// When
		Integer result = underTest.getAccountId();

		// Then - assertions for result of method getAccountId()
		assertNull(result);

		// Then - assertions for this instance of LoanResponse
		assertNull(underTest.getResponseDate());
		assertNull(underTest.getLoanProviderName());
		assertFalse(underTest.isApproved());
		assertNull(underTest.getMessage());

	}

	/**
	 * Parasoft Jtest UTA: Test for getLoanProviderName()
	 *
	 * @see com.parasoft.parabank.domain.LoanResponse#getLoanProviderName()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetLoanProviderName() throws Throwable {
		// Given
		LoanResponse underTest = new LoanResponse();

		// When
		String result = underTest.getLoanProviderName();

		// Then - assertions for result of method getLoanProviderName()
		assertNull(result);

		// Then - assertions for this instance of LoanResponse
		assertNull(underTest.getResponseDate());
		assertFalse(underTest.isApproved());
		assertNull(underTest.getMessage());
		assertNull(underTest.getAccountId());

	}

	/**
	 * Parasoft Jtest UTA: Test for getMessage()
	 *
	 * @see com.parasoft.parabank.domain.LoanResponse#getMessage()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetMessage() throws Throwable {
		// Given
		LoanResponse underTest = new LoanResponse();

		// When
		String result = underTest.getMessage();

		// Then - assertions for result of method getMessage()
		assertNull(result);

		// Then - assertions for this instance of LoanResponse
		assertNull(underTest.getResponseDate());
		assertNull(underTest.getLoanProviderName());
		assertFalse(underTest.isApproved());
		assertNull(underTest.getAccountId());

	}

	/**
	 * Parasoft Jtest UTA: Test for getResponseDate()
	 *
	 * @see com.parasoft.parabank.domain.LoanResponse#getResponseDate()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetResponseDate() throws Throwable {
		// Given
		LoanResponse underTest = new LoanResponse();

		// When
		Date result = underTest.getResponseDate();

		// Then - assertions for result of method getResponseDate()
		assertNull(result);

		// Then - assertions for this instance of LoanResponse
		assertNull(underTest.getLoanProviderName());
		assertFalse(underTest.isApproved());
		assertNull(underTest.getMessage());
		assertNull(underTest.getAccountId());

	}

	/**
	 * Parasoft Jtest UTA: Test for hashCode()
	 *
	 * @see com.parasoft.parabank.domain.LoanResponse#hashCode()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testHashCode() throws Throwable {
		// Given
		LoanResponse underTest = new LoanResponse();
		Date responseDate = mock(Date.class);
		underTest.setResponseDate(responseDate);
		Integer accountId = 0; // UTA: default value
		underTest.setAccountId(accountId);
		String loanProviderName = "loanProviderName"; // UTA: default value
		underTest.setLoanProviderName(loanProviderName);
		String message = "message"; // UTA: default value
		underTest.setMessage(message);
		boolean approved = false; // UTA: provided value
		underTest.setApproved(approved);

		// When
		int result = underTest.hashCode();

		// Then - assertions for result of method hashCode()
		// assertEquals(0, result);// UTA: Expected value may be unstable

		// Then - assertions for this instance of LoanResponse
		assertNotNull(underTest.getResponseDate());
		assertEquals("loanProviderName", underTest.getLoanProviderName());
		assertFalse(underTest.isApproved());
		assertEquals("message", underTest.getMessage());
		assertNotNull(underTest.getAccountId());
		assertEquals(0, underTest.getAccountId().intValue());

	}

	/**
	 * Parasoft Jtest UTA: Test for isApproved()
	 *
	 * @see com.parasoft.parabank.domain.LoanResponse#isApproved()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testIsApproved() throws Throwable {
		// Given
		LoanResponse underTest = new LoanResponse();

		// When
		boolean result = underTest.isApproved();

		// Then - assertions for result of method isApproved()
		assertFalse(result);

		// Then - assertions for this instance of LoanResponse
		assertNull(underTest.getResponseDate());
		assertNull(underTest.getLoanProviderName());
		assertNull(underTest.getMessage());
		assertNull(underTest.getAccountId());

	}

	/**
	 * Parasoft Jtest UTA: Test for readFrom(JsonObject)
	 *
	 * @see com.parasoft.parabank.domain.LoanResponse#readFrom(JsonObject)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testReadFrom() throws Throwable {
		// When
		JsonObject json = mockJsonObject();
		LoanResponse result = LoanResponse.readFrom(json);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of JsonElement
	 */
	private static JsonElement mockJsonElement() throws Throwable {
		JsonElement getResult = mock(JsonElement.class);
		boolean getAsBooleanResult = true; // UTA: provided value
		when(getResult.getAsBoolean()).thenReturn(getAsBooleanResult);
		return getResult;
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
		JsonElement getResult = mockJsonElement();
		JsonElement getResult2 = mock(JsonElement.class);
		JsonElement getResult3 = mockJsonElement2();
		JsonElement getResult4 = mock(JsonElement.class);
		when(json.get(nullable(String.class))).thenReturn(getResult, getResult2, getResult3, getResult4);
		return json;
	}

	/**
	 * Parasoft Jtest UTA: Test for readFrom(JsonObject)
	 *
	 * @see com.parasoft.parabank.domain.LoanResponse#readFrom(JsonObject)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testReadFrom2() throws Throwable {
		// When
		JsonObject json = mockJsonObject2();
		LoanResponse result = LoanResponse.readFrom(json);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of JsonElement
	 */
	private static JsonElement mockJsonElement3() throws Throwable {
		JsonElement getResult = mock(JsonElement.class);
		boolean getAsBooleanResult = false; // UTA: provided value
		when(getResult.getAsBoolean()).thenReturn(getAsBooleanResult);
		return getResult;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of JsonElement
	 */
	private static JsonElement mockJsonElement4() throws Throwable {
		JsonElement getResult2 = mock(JsonElement.class);
		String getAsStringResult = "getAsStringResult"; // UTA: default value
		when(getResult2.getAsString()).thenReturn(getAsStringResult);
		return getResult2;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of JsonElement
	 */
	private static JsonElement mockJsonElement5() throws Throwable {
		JsonElement getResult3 = mock(JsonElement.class);
		String getAsStringResult2 = "getAsStringResult2"; // UTA: default value
		when(getResult3.getAsString()).thenReturn(getAsStringResult2);
		return getResult3;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of JsonObject
	 */
	private static JsonObject mockJsonObject2() throws Throwable {
		JsonObject json = mock(JsonObject.class);
		JsonElement getResult = mockJsonElement3();
		JsonElement getResult2 = mockJsonElement4();
		JsonElement getResult3 = mockJsonElement5();
		JsonElement getResult4 = mock(JsonElement.class);
		when(json.get(nullable(String.class))).thenReturn(getResult, getResult2, getResult3, getResult4);
		return json;
	}

	/**
	 * Parasoft Jtest UTA: Test for toString()
	 *
	 * @see com.parasoft.parabank.domain.LoanResponse#toString()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testToString() throws Throwable {
		// Given
		LoanResponse underTest = new LoanResponse();
		Date responseDate = mock(Date.class);
		underTest.setResponseDate(responseDate);
		Integer accountId = 0; // UTA: default value
		underTest.setAccountId(accountId);
		String loanProviderName = "loanProviderName"; // UTA: default value
		underTest.setLoanProviderName(loanProviderName);
		String message = "message"; // UTA: default value
		underTest.setMessage(message);

		// When
		String result = underTest.toString();

		// Then - assertions for result of method toString()
		assertEquals(
"[deleted by script]",
				result);

		// Then - assertions for this instance of LoanResponse
		assertNotNull(underTest.getResponseDate());
		assertEquals("loanProviderName", underTest.getLoanProviderName());
		assertFalse(underTest.isApproved());
		assertEquals("message", underTest.getMessage());
		assertNotNull(underTest.getAccountId());
		assertEquals(0, underTest.getAccountId().intValue());

	}
}