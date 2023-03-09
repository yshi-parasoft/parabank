/**
 * 
 */
package com.parasoft.parabank.messaging;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.ArgumentMatchers.nullable;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.parasoft.parabank.domain.LoanRequest;
import com.parasoft.parabank.domain.LoanResponse;
import javax.jms.Message;
import javax.jms.TextMessage;
import org.junit.Test;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;

/**
 * Parasoft Jtest UTA: Test class for JmsLoanProvider
 *
 * @see com.parasoft.parabank.messaging.JmsLoanProvider
 * @author devtest
 */
public class JmsLoanProviderTest {

	/**
	 * Parasoft Jtest UTA: Test for getJmsTemplate()
	 *
	 * @see com.parasoft.parabank.messaging.JmsLoanProvider#getJmsTemplate()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetJmsTemplate() throws Throwable {
		// Given
		JmsLoanProvider underTest = new JmsLoanProvider();

		// When
		JmsTemplate result = underTest.getJmsTemplate();

		// Then - assertions for result of method getJmsTemplate()
		assertNull(result);

		// Then - assertions for this instance of JmsLoanProvider
		assertNull(underTest.getMarshaller());
		assertNull(underTest.getUnmarshaller());
		assertNull(underTest.getRequestDesinationName());
		assertNull(underTest.getResponseDestinationName());

	}

	/**
	 * Parasoft Jtest UTA: Test for getMarshaller()
	 *
	 * @see com.parasoft.parabank.messaging.JmsLoanProvider#getMarshaller()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetMarshaller() throws Throwable {
		// Given
		JmsLoanProvider underTest = new JmsLoanProvider();

		// When
		Marshaller result = underTest.getMarshaller();

		// Then - assertions for result of method getMarshaller()
		assertNull(result);

		// Then - assertions for this instance of JmsLoanProvider
		assertNull(underTest.getJmsTemplate());
		assertNull(underTest.getUnmarshaller());
		assertNull(underTest.getRequestDesinationName());
		assertNull(underTest.getResponseDestinationName());

	}

	/**
	 * Parasoft Jtest UTA: Test for getRequestDesinationName()
	 *
	 * @see com.parasoft.parabank.messaging.JmsLoanProvider#getRequestDesinationName()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetRequestDesinationName() throws Throwable {
		// Given
		JmsLoanProvider underTest = new JmsLoanProvider();

		// When
		String result = underTest.getRequestDesinationName();

		// Then - assertions for result of method getRequestDesinationName()
		assertNull(result);

		// Then - assertions for this instance of JmsLoanProvider
		assertNull(underTest.getJmsTemplate());
		assertNull(underTest.getMarshaller());
		assertNull(underTest.getUnmarshaller());
		assertNull(underTest.getResponseDestinationName());

	}

	/**
	 * Parasoft Jtest UTA: Test for getResponseDestinationName()
	 *
	 * @see com.parasoft.parabank.messaging.JmsLoanProvider#getResponseDestinationName()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetResponseDestinationName() throws Throwable {
		// Given
		JmsLoanProvider underTest = new JmsLoanProvider();

		// When
		String result = underTest.getResponseDestinationName();

		// Then - assertions for result of method getResponseDestinationName()
		assertNull(result);

		// Then - assertions for this instance of JmsLoanProvider
		assertNull(underTest.getJmsTemplate());
		assertNull(underTest.getMarshaller());
		assertNull(underTest.getUnmarshaller());
		assertNull(underTest.getRequestDesinationName());

	}

	/**
	 * Parasoft Jtest UTA: Test for getUnmarshaller()
	 *
	 * @see com.parasoft.parabank.messaging.JmsLoanProvider#getUnmarshaller()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetUnmarshaller() throws Throwable {
		// Given
		JmsLoanProvider underTest = new JmsLoanProvider();

		// When
		Unmarshaller result = underTest.getUnmarshaller();

		// Then - assertions for result of method getUnmarshaller()
		assertNull(result);

		// Then - assertions for this instance of JmsLoanProvider
		assertNull(underTest.getJmsTemplate());
		assertNull(underTest.getMarshaller());
		assertNull(underTest.getRequestDesinationName());
		assertNull(underTest.getResponseDestinationName());

	}

	/**
	 * Parasoft Jtest UTA: Test for processResponse(Message)
	 *
	 * @see com.parasoft.parabank.messaging.JmsLoanProvider#processResponse(Message)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testProcessResponse() throws Throwable {
		// Given
		JmsLoanProvider underTest = new JmsLoanProvider();
		JmsTemplate jmsTemplate = mock(JmsTemplate.class);
		underTest.setJmsTemplate(jmsTemplate);

		// When
		Message message = null; // UTA: provided value
		LoanResponse result = underTest.processResponse(message);

		// Then - assertions for result of method processResponse(Message)
		assertNotNull(result);
		assertNotNull(result.getResponseDate());
		assertNull(result.getLoanProviderName());
		assertFalse(result.isApproved());
		assertEquals("error.timeout", result.getMessage());
		assertNull(result.getAccountId());

		// Then - assertions for this instance of JmsLoanProvider
		assertNotNull(underTest.getJmsTemplate());
		assertNull(underTest.getMarshaller());
		assertNull(underTest.getUnmarshaller());
		assertNull(underTest.getRequestDesinationName());
		assertNull(underTest.getResponseDestinationName());

	}

	/**
	 * Parasoft Jtest UTA: Test for processResponse(Message)
	 *
	 * @see com.parasoft.parabank.messaging.JmsLoanProvider#processResponse(Message)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testProcessResponse2() throws Throwable {
		// Given
		JmsLoanProvider underTest = new JmsLoanProvider();

		// When
		TextMessage message = mock(TextMessage.class);
		LoanResponse result = underTest.processResponse(message);

		// Then - assertions for this instance of JmsLoanProvider
		assertNull(underTest.getJmsTemplate());
		assertNull(underTest.getMarshaller());
		assertNull(underTest.getUnmarshaller());
		assertNull(underTest.getRequestDesinationName());
		assertNull(underTest.getResponseDestinationName());

	}

	/**
	 * Parasoft Jtest UTA: Test for requestLoan(LoanRequest)
	 *
	 * @see com.parasoft.parabank.messaging.JmsLoanProvider#requestLoan(LoanRequest)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testRequestLoan() throws Throwable {
		// Given
		JmsLoanProvider underTest = new JmsLoanProvider();
		JmsTemplate jmsTemplate = mockJmsTemplate();
		underTest.setJmsTemplate(jmsTemplate);
		String requestDesinationName = "requestDesinationName"; // UTA: default value
		underTest.setRequestDestinationName(requestDesinationName);

		// When
		LoanRequest loanRequest = mock(LoanRequest.class);
		LoanResponse result = underTest.requestLoan(loanRequest);

		// Then - assertions for argument 1 of method requestLoan(LoanRequest)
		assertNull(loanRequest.getRequestDate());
		assertEquals(0, loanRequest.getCustomerId());
		assertNull(loanRequest.getAvailableFunds());
		assertNull(loanRequest.getDownPayment());
		assertNull(loanRequest.getLoanAmount());

		// Then - assertions for result of method requestLoan(LoanRequest)
		assertNotNull(result);
		assertNotNull(result.getResponseDate());
		assertNull(result.getLoanProviderName());
		assertFalse(result.isApproved());
		assertEquals("error.timeout", result.getMessage());
		assertNull(result.getAccountId());

		// Then - assertions for this instance of JmsLoanProvider
		assertNotNull(underTest.getJmsTemplate());
		assertNull(underTest.getMarshaller());
		assertNull(underTest.getUnmarshaller());
		assertEquals("requestDesinationName", underTest.getRequestDesinationName());
		assertNull(underTest.getResponseDestinationName());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of JmsTemplate
	 */
	private static JmsTemplate mockJmsTemplate() throws Throwable {
		JmsTemplate jmsTemplate = mock(JmsTemplate.class);
		Message receiveResult = null; // UTA: provided value
		when(jmsTemplate.receive(nullable(String.class))).thenReturn(receiveResult);
		return jmsTemplate;
	}

	/**
	 * Parasoft Jtest UTA: Test for requestLoan(LoanRequest)
	 *
	 * @see com.parasoft.parabank.messaging.JmsLoanProvider#requestLoan(LoanRequest)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testRequestLoan2() throws Throwable {
		// Given
		JmsLoanProvider underTest = new JmsLoanProvider();
		JmsTemplate jmsTemplate = mockJmsTemplate2();
		underTest.setJmsTemplate(jmsTemplate);
		String requestDesinationName = "requestDesinationName"; // UTA: default value
		underTest.setRequestDestinationName(requestDesinationName);

		// When
		LoanRequest loanRequest = mock(LoanRequest.class);
		LoanResponse result = underTest.requestLoan(loanRequest);

		// Then - assertions for argument 1 of method requestLoan(LoanRequest)
		assertNull(loanRequest.getRequestDate());
		assertEquals(0, loanRequest.getCustomerId());
		assertNull(loanRequest.getAvailableFunds());
		assertNull(loanRequest.getDownPayment());
		assertNull(loanRequest.getLoanAmount());

		// Then - assertions for this instance of JmsLoanProvider
		assertNotNull(underTest.getJmsTemplate());
		assertNull(underTest.getMarshaller());
		assertNull(underTest.getUnmarshaller());
		assertEquals("requestDesinationName", underTest.getRequestDesinationName());
		assertNull(underTest.getResponseDestinationName());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of JmsTemplate
	 */
	private static JmsTemplate mockJmsTemplate2() throws Throwable {
		JmsTemplate jmsTemplate = mock(JmsTemplate.class);
		TextMessage receiveResult = mock(TextMessage.class);
		when(jmsTemplate.receive(nullable(String.class))).thenReturn(receiveResult);
		return jmsTemplate;
	}

	/**
	 * Parasoft Jtest UTA: Test for setMarshaller(Marshaller)
	 *
	 * @see com.parasoft.parabank.messaging.JmsLoanProvider#setMarshaller(Marshaller)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetMarshaller() throws Throwable {
		// Given
		JmsLoanProvider underTest = new JmsLoanProvider();

		// When
		Marshaller marshaller = mock(Marshaller.class);
		underTest.setMarshaller(marshaller);

		// Then - assertions for this instance of JmsLoanProvider
		assertNull(underTest.getJmsTemplate());
		assertNotNull(underTest.getMarshaller());
		assertNull(underTest.getUnmarshaller());
		assertNull(underTest.getRequestDesinationName());
		assertNull(underTest.getResponseDestinationName());

	}

	/**
	 * Parasoft Jtest UTA: Test for setRequestDesinationName(String)
	 *
	 * @see com.parasoft.parabank.messaging.JmsLoanProvider#setRequestDesinationName(String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetRequestDesinationName() throws Throwable {
		// Given
		JmsLoanProvider underTest = new JmsLoanProvider();

		// When
		String aRequestDesinationName = "aRequestDesinationName"; // UTA: default value
		underTest.setRequestDesinationName(aRequestDesinationName);

		// Then - assertions for this instance of JmsLoanProvider
		assertNull(underTest.getJmsTemplate());
		assertNull(underTest.getMarshaller());
		assertNull(underTest.getUnmarshaller());
		assertEquals("aRequestDesinationName", underTest.getRequestDesinationName());
		assertNull(underTest.getResponseDestinationName());

	}

	/**
	 * Parasoft Jtest UTA: Test for setResponseDestinationName(String)
	 *
	 * @see com.parasoft.parabank.messaging.JmsLoanProvider#setResponseDestinationName(String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetResponseDestinationName() throws Throwable {
		// Given
		JmsLoanProvider underTest = new JmsLoanProvider();

		// When
		String responseDestinationName = "responseDestinationName"; // UTA: default value
		underTest.setResponseDestinationName(responseDestinationName);

		// Then - assertions for this instance of JmsLoanProvider
		assertNull(underTest.getJmsTemplate());
		assertNull(underTest.getMarshaller());
		assertNull(underTest.getUnmarshaller());
		assertNull(underTest.getRequestDesinationName());
		assertEquals("responseDestinationName", underTest.getResponseDestinationName());

	}

	/**
	 * Parasoft Jtest UTA: Test for setUnmarshaller(Unmarshaller)
	 *
	 * @see com.parasoft.parabank.messaging.JmsLoanProvider#setUnmarshaller(Unmarshaller)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetUnmarshaller() throws Throwable {
		// Given
		JmsLoanProvider underTest = new JmsLoanProvider();

		// When
		Unmarshaller unmarshaller = mock(Unmarshaller.class);
		underTest.setUnmarshaller(unmarshaller);

		// Then - assertions for this instance of JmsLoanProvider
		assertNull(underTest.getJmsTemplate());
		assertNull(underTest.getMarshaller());
		assertNotNull(underTest.getUnmarshaller());
		assertNull(underTest.getRequestDesinationName());
		assertNull(underTest.getResponseDestinationName());

	}
}