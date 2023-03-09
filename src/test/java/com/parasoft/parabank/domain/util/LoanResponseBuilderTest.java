/**
 * 
 */
package com.parasoft.parabank.domain.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;

import com.parasoft.parabank.domain.LoanResponse;
import java.lang.reflect.Field;
import java.util.Date;
import org.junit.Test;
import org.springframework.test.util.ReflectionTestUtils;

/**
 * Parasoft Jtest UTA: Test class for LoanResponseBuilder
 *
 * @see com.parasoft.parabank.domain.util.LoanResponseBuilder
 * @author devtest
 */
public class LoanResponseBuilderTest {

	/**
	 * Parasoft Jtest UTA: Test for accountId(Integer)
	 *
	 * @see com.parasoft.parabank.domain.util.LoanResponseBuilder#accountId(Integer)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testAccountId() throws Throwable {
		// Given
		LoanResponseBuilder underTest = new LoanResponseBuilder();

		// When
		Integer accountId = 0; // UTA: default value
		LoanResponseBuilder result = underTest.accountId(accountId);

		// Then - assertions for result of method accountId(Integer)
		assertNotNull(result);

	}

	/**
	 * Parasoft Jtest UTA: Test for approved(boolean)
	 *
	 * @see com.parasoft.parabank.domain.util.LoanResponseBuilder#approved(boolean)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testApproved() throws Throwable {
		// Given
		LoanResponseBuilder underTest = new LoanResponseBuilder();

		// When
		boolean approved = false; // UTA: default value
		LoanResponseBuilder result = underTest.approved(approved);

		// Then - assertions for result of method approved(boolean)
		assertNotNull(result);

	}

	/**
	 * Parasoft Jtest UTA: Test for build()
	 *
	 * @see com.parasoft.parabank.domain.util.LoanResponseBuilder#build()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testBuild() throws Throwable {
		// Given
		LoanResponseBuilder underTest = new LoanResponseBuilder();
		ReflectionTestUtils.setField(underTest, "accountId", -1); // UTA: provided value
		String loanProviderNameValue = "loanProviderNameValue"; // UTA: default value
		ReflectionTestUtils.setField(underTest, "loanProviderName", loanProviderNameValue);
		String messageValue = "messageValue"; // UTA: default value
		ReflectionTestUtils.setField(underTest, "message", messageValue);

		// When
		LoanResponse result = underTest.build();

		// Then - assertions for result of method build()
		assertNotNull(result);
		assertNotNull(result.getResponseDate());
		assertEquals("loanProviderNameValue", result.getLoanProviderName());
		assertFalse(result.isApproved());
		assertEquals("messageValue", result.getMessage());
		assertNull(result.getAccountId());

	}

	/**
	 * Parasoft Jtest UTA: Test for build()
	 *
	 * @see com.parasoft.parabank.domain.util.LoanResponseBuilder#build()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testBuild2() throws Throwable {
		// Given
		LoanResponseBuilder underTest = new LoanResponseBuilder();
		ReflectionTestUtils.setField(underTest, "accountId", 1); // UTA: provided value
		String loanProviderNameValue = "loanProviderNameValue"; // UTA: default value
		ReflectionTestUtils.setField(underTest, "loanProviderName", loanProviderNameValue);
		String messageValue = "messageValue"; // UTA: default value
		ReflectionTestUtils.setField(underTest, "message", messageValue);

		// When
		LoanResponse result = underTest.build();

		// Then - assertions for result of method build()
		assertNotNull(result);
		assertNotNull(result.getResponseDate());
		assertEquals("loanProviderNameValue", result.getLoanProviderName());
		assertFalse(result.isApproved());
		assertEquals("messageValue", result.getMessage());
		assertNotNull(result.getAccountId());
		assertEquals(1, result.getAccountId().intValue());

	}

	/**
	 * Parasoft Jtest UTA: Test for date(Date)
	 *
	 * @see com.parasoft.parabank.domain.util.LoanResponseBuilder#date(Date)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testDate() throws Throwable {
		// Given
		LoanResponseBuilder underTest = new LoanResponseBuilder();

		// When
		Date date = mock(Date.class);
		LoanResponseBuilder result = underTest.date(date);

		// Then - assertions for result of method date(Date)
		assertNotNull(result);

	}

	/**
	 * Parasoft Jtest UTA: Test for message(String)
	 *
	 * @see com.parasoft.parabank.domain.util.LoanResponseBuilder#message(String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testMessage() throws Throwable {
		// Given
		LoanResponseBuilder underTest = new LoanResponseBuilder();

		// When
		String message = "message"; // UTA: default value
		LoanResponseBuilder result = underTest.message(message);

		// Then - assertions for result of method message(String)
		assertNotNull(result);

	}

	/**
	 * Parasoft Jtest UTA: Test for providerName(String)
	 *
	 * @see com.parasoft.parabank.domain.util.LoanResponseBuilder#providerName(String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testProviderName() throws Throwable {
		// Given
		LoanResponseBuilder underTest = new LoanResponseBuilder();

		// When
		String name = "name"; // UTA: default value
		LoanResponseBuilder result = underTest.providerName(name);

		// Then - assertions for result of method providerName(String)
		assertNotNull(result);

	}
}