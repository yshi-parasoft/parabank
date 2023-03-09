/**
 * 
 */
package com.parasoft.parabank.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;

import org.apache.cxf.service.model.MessagePartInfo;
import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for ParaBankServiceConfiguration
 *
 * @see com.parasoft.parabank.service.ParaBankServiceConfiguration
 * @author devtest
 */
public class ParaBankServiceConfigurationTest {

	/**
	 * Parasoft Jtest UTA: Test for getWrapperPartMinOccurs(MessagePartInfo)
	 *
	 * @see com.parasoft.parabank.service.ParaBankServiceConfiguration#getWrapperPartMinOccurs(MessagePartInfo)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetWrapperPartMinOccurs() throws Throwable {
		// Given
		ParaBankServiceConfiguration underTest = new ParaBankServiceConfiguration();

		// When
		MessagePartInfo mpi = mock(MessagePartInfo.class);
		Long result = underTest.getWrapperPartMinOccurs(mpi);

		// Then - assertions for result of method getWrapperPartMinOccurs(MessagePartInfo)
		assertNotNull(result);
		assertEquals(1L, result.longValue());

		// Then - assertions for this instance of ParaBankServiceConfiguration
		assertNull(underTest.getServiceNamespace());
		assertNull(underTest.getServiceFactory());

	}

	/**
	 * Parasoft Jtest UTA: Test for isWrapperPartNillable(MessagePartInfo)
	 *
	 * @see com.parasoft.parabank.service.ParaBankServiceConfiguration#isWrapperPartNillable(MessagePartInfo)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testIsWrapperPartNillable() throws Throwable {
		// Given
		ParaBankServiceConfiguration underTest = new ParaBankServiceConfiguration();

		// When
		MessagePartInfo mpi = mock(MessagePartInfo.class);
		Boolean result = underTest.isWrapperPartNillable(mpi);

		// Then - assertions for result of method isWrapperPartNillable(MessagePartInfo)
		assertNotNull(result);
		assertFalse(result);

		// Then - assertions for this instance of ParaBankServiceConfiguration
		assertNull(underTest.getServiceNamespace());
		assertNull(underTest.getServiceFactory());

	}
}