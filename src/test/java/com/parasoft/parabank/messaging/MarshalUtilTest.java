/**
 * 
 */
package com.parasoft.parabank.messaging;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;

/**
 * Parasoft Jtest UTA: Test class for MarshalUtil
 *
 * @see com.parasoft.parabank.messaging.MarshalUtil
 * @author devtest
 */
public class MarshalUtilTest {

	/**
	 * Parasoft Jtest UTA: Test for marshal(Marshaller, Object)
	 *
	 * @see com.parasoft.parabank.messaging.MarshalUtil#marshal(Marshaller, Object)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testMarshal() throws Throwable {
		// When
		Marshaller marshaller = mock(Marshaller.class);
		Object obj = new Object(); // UTA: default value
		String result = MarshalUtil.marshal(marshaller, obj);

		// Then - assertions for result of method marshal(Marshaller, Object)
		assertEquals("", result);

	}

	/**
	 * Parasoft Jtest UTA: Test for unmarshal(Unmarshaller, String)
	 *
	 * @see com.parasoft.parabank.messaging.MarshalUtil#unmarshal(Unmarshaller, String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testUnmarshal() throws Throwable {
		// When
		Unmarshaller unmarshaller = mock(Unmarshaller.class);
		String xml = "xml"; // UTA: default value
		Object result = MarshalUtil.unmarshal(unmarshaller, xml);

		// Then - assertions for result of method unmarshal(Unmarshaller, String)
		assertNull(result);

	}
}