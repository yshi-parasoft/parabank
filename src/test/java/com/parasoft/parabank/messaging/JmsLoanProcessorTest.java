/**
 * 
 */
package com.parasoft.parabank.messaging;

import static org.mockito.Mockito.mock;

import com.parasoft.parabank.domain.logic.LoanProvider;
import javax.jms.TextMessage;
import org.junit.Test;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;

/**
 * Parasoft Jtest UTA: Test class for JmsLoanProcessor
 *
 * @see com.parasoft.parabank.messaging.JmsLoanProcessor
 * @author devtest
 */
public class JmsLoanProcessorTest {

	/**
	 * Parasoft Jtest UTA: Test for onMessage(Message)
	 *
	 * @see com.parasoft.parabank.messaging.JmsLoanProcessor#onMessage(Message)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testOnMessage() throws Throwable {
		// Given
		JmsLoanProcessor underTest = new JmsLoanProcessor();
		JmsTemplate jmsTemplate = mock(JmsTemplate.class);
		underTest.setJmsTemplate(jmsTemplate);
		String destinationName = "destinationName"; // UTA: default value
		underTest.setDestinationName(destinationName);

		// When
		TextMessage message = mock(TextMessage.class);
		underTest.onMessage(message);

	}

	/**
	 * Parasoft Jtest UTA: Test for setDestinationName(String)
	 *
	 * @see com.parasoft.parabank.messaging.JmsLoanProcessor#setDestinationName(String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetDestinationName() throws Throwable {
		// Given
		JmsLoanProcessor underTest = new JmsLoanProcessor();

		// When
		String destinationName = "destinationName"; // UTA: default value
		underTest.setDestinationName(destinationName);

	}

	/**
	 * Parasoft Jtest UTA: Test for setJmsTemplate(JmsTemplate)
	 *
	 * @see com.parasoft.parabank.messaging.JmsLoanProcessor#setJmsTemplate(JmsTemplate)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetJmsTemplate() throws Throwable {
		// Given
		JmsLoanProcessor underTest = new JmsLoanProcessor();

		// When
		JmsTemplate jmsTemplate = mock(JmsTemplate.class);
		underTest.setJmsTemplate(jmsTemplate);

	}

	/**
	 * Parasoft Jtest UTA: Test for setLoanProcessor(LoanProvider)
	 *
	 * @see com.parasoft.parabank.messaging.JmsLoanProcessor#setLoanProcessor(LoanProvider)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetLoanProcessor() throws Throwable {
		// Given
		JmsLoanProcessor underTest = new JmsLoanProcessor();

		// When
		LoanProvider loanProcessor = mock(LoanProvider.class);
		underTest.setLoanProcessor(loanProcessor);

	}

	/**
	 * Parasoft Jtest UTA: Test for setLoanProviderName(String)
	 *
	 * @see com.parasoft.parabank.messaging.JmsLoanProcessor#setLoanProviderName(String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetLoanProviderName() throws Throwable {
		// Given
		JmsLoanProcessor underTest = new JmsLoanProcessor();

		// When
		String loanProviderName = "loanProviderName"; // UTA: default value
		underTest.setLoanProviderName(loanProviderName);

	}

	/**
	 * Parasoft Jtest UTA: Test for setMarshaller(Marshaller)
	 *
	 * @see com.parasoft.parabank.messaging.JmsLoanProcessor#setMarshaller(Marshaller)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetMarshaller() throws Throwable {
		// Given
		JmsLoanProcessor underTest = new JmsLoanProcessor();

		// When
		Marshaller marshaller = mock(Marshaller.class);
		underTest.setMarshaller(marshaller);

	}

	/**
	 * Parasoft Jtest UTA: Test for setUnmarshaller(Unmarshaller)
	 *
	 * @see com.parasoft.parabank.messaging.JmsLoanProcessor#setUnmarshaller(Unmarshaller)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetUnmarshaller() throws Throwable {
		// Given
		JmsLoanProcessor underTest = new JmsLoanProcessor();

		// When
		Unmarshaller unmarshaller = mock(Unmarshaller.class);
		underTest.setUnmarshaller(unmarshaller);

	}
}