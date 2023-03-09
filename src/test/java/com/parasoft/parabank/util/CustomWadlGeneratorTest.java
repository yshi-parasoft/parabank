/**
 * 
 */
package com.parasoft.parabank.util;

import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;

import java.util.List;
import javax.ws.rs.core.UriInfo;
import org.apache.cxf.jaxrs.model.ClassResourceInfo;
import org.apache.cxf.message.Message;
import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for CustomWadlGenerator
 *
 * @see com.parasoft.parabank.util.CustomWadlGenerator
 * @author devtest
 */
public class CustomWadlGeneratorTest {

	/**
	 * Parasoft Jtest UTA: Test for getResourcesList(Message, UriInfo)
	 *
	 * @see com.parasoft.parabank.util.CustomWadlGenerator#getResourcesList(Message, UriInfo)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetResourcesList() throws Throwable {
		// Given
		CustomWadlGenerator underTest = new CustomWadlGenerator();

		// When
		Message m = mock(Message.class);
		UriInfo ui = mock(UriInfo.class);
		List<ClassResourceInfo> result = underTest.getResourcesList(m, ui);

		// Then - assertions for this instance of CustomWadlGenerator
		assertNull(underTest.getPrivateAddresses());
		assertNull(underTest.getAllowList());

	}
}