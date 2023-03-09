/**
 * 
 */
package com.parasoft.parabank.util;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;

import java.io.File;
import org.junit.Test;
import org.springframework.context.ApplicationContext;

/**
 * Parasoft Jtest UTA: Test class for CustomRamlGenerator
 *
 * @see com.parasoft.parabank.util.CustomRamlGenerator
 * @author devtest
 */
public class CustomRamlGeneratorTest {

	/**
	 * Parasoft Jtest UTA: Test for generateRaml()
	 *
	 * @see com.parasoft.parabank.util.CustomRamlGenerator#generateRaml()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGenerateRaml() throws Throwable {
		// Given
		CustomRamlGenerator underTest = new CustomRamlGenerator();
		ApplicationContext applicationContextValue = mock(ApplicationContext.class);
		underTest.applicationContext = applicationContextValue;

		// When
		underTest.generateRaml();

		// Then - assertions for this instance of CustomRamlGenerator
		assertNotNull(underTest.getApplicationContext());

	}

	/**
	 * Parasoft Jtest UTA: Test for getApplicationContext()
	 *
	 * @see com.parasoft.parabank.util.CustomRamlGenerator#getApplicationContext()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetApplicationContext() throws Throwable {
		// Given
		CustomRamlGenerator underTest = new CustomRamlGenerator();

		// When
		ApplicationContext result = underTest.getApplicationContext();

		// Then - assertions for result of method getApplicationContext()
		assertNull(result);

	}

	/**
	 * Parasoft Jtest UTA: Test for prepareOutputFile(String)
	 *
	 * @see com.parasoft.parabank.util.CustomRamlGenerator#prepareOutputFile(String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testPrepareOutputFile() throws Throwable {
		// Given
		CustomRamlGenerator underTest = new CustomRamlGenerator();

		// When
		String outputFileName = "outputFileName"; // UTA: default value
		File result = underTest.prepareOutputFile(outputFileName);

		// Then - assertions for result of method prepareOutputFile(String)
		assertNotNull(result);

		// Then - assertions for this instance of CustomRamlGenerator
		assertNull(underTest.getApplicationContext());

	}

	/**
	 * Parasoft Jtest UTA: Test for setApplicationContext(ApplicationContext)
	 *
	 * @see com.parasoft.parabank.util.CustomRamlGenerator#setApplicationContext(ApplicationContext)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetApplicationContext() throws Throwable {
		// Given
		CustomRamlGenerator underTest = new CustomRamlGenerator();

		// When
		ApplicationContext aApplicationContext = mock(ApplicationContext.class);
		underTest.setApplicationContext(aApplicationContext);

		// Then - assertions for this instance of CustomRamlGenerator
		assertNotNull(underTest.getApplicationContext());

	}
}