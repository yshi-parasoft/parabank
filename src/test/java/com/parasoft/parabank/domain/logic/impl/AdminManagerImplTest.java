/**
 * 
 */
package com.parasoft.parabank.domain.logic.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

import com.parasoft.parabank.dao.AdminDao;
import com.parasoft.parabank.web.form.AdminForm;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import org.springframework.jms.listener.AbstractJmsListeningContainer;

/**
 * Parasoft Jtest UTA: Test class for AdminManagerImpl
 *
 * @see com.parasoft.parabank.domain.logic.impl.AdminManagerImpl
 * @author devtest
 */
public class AdminManagerImplTest {

	/**
	 * Parasoft Jtest UTA: Test for cleanDB()
	 *
	 * @see com.parasoft.parabank.domain.logic.impl.AdminManagerImpl#cleanDB()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testCleanDB() throws Throwable {
		// Given
		AdminManagerImpl underTest = new AdminManagerImpl();
		AdminDao adminDao = mock(AdminDao.class);
		underTest.setAdminDao(adminDao);

		// When
		underTest.cleanDB();

		// Then - assertions for this instance of AdminManagerImpl
		assertNull(underTest.getJmsListener());

	}

	/**
	 * Parasoft Jtest UTA: Test for getJmsListener()
	 *
	 * @see com.parasoft.parabank.domain.logic.impl.AdminManagerImpl#getJmsListener()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetJmsListener() throws Throwable {
		// Given
		AdminManagerImpl underTest = new AdminManagerImpl();

		// When
		AbstractJmsListeningContainer result = underTest.getJmsListener();

		// Then - assertions for result of method getJmsListener()
		assertNull(result);

	}

	/**
	 * Parasoft Jtest UTA: Test for getParameter(String)
	 *
	 * @see com.parasoft.parabank.domain.logic.impl.AdminManagerImpl#getParameter(String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetParameter() throws Throwable {
		// Given
		AdminManagerImpl underTest = new AdminManagerImpl();
		AdminDao adminDao = mock(AdminDao.class);
		underTest.setAdminDao(adminDao);

		// When
		String name = "name"; // UTA: default value
		String result = underTest.getParameter(name);

		// Then - assertions for result of method getParameter(String)
		assertNull(result);

		// Then - assertions for this instance of AdminManagerImpl
		assertNull(underTest.getJmsListener());

	}

	/**
	 * Parasoft Jtest UTA: Test for getParameters()
	 *
	 * @see com.parasoft.parabank.domain.logic.impl.AdminManagerImpl#getParameters()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetParameters() throws Throwable {
		// Given
		AdminManagerImpl underTest = new AdminManagerImpl();
		AdminDao adminDao = mock(AdminDao.class);
		underTest.setAdminDao(adminDao);

		// When
		Map<String, String> result = underTest.getParameters();

		// Then - assertions for result of method getParameters()
		assertNotNull(result);
		assertEquals(0, result.size());

		// Then - assertions for this instance of AdminManagerImpl
		assertNull(underTest.getJmsListener());

	}

	/**
	 * Parasoft Jtest UTA: Test for initializeDB()
	 *
	 * @see com.parasoft.parabank.domain.logic.impl.AdminManagerImpl#initializeDB()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testInitializeDB() throws Throwable {
		// Given
		AdminManagerImpl underTest = new AdminManagerImpl();
		AdminDao adminDao = mock(AdminDao.class);
		underTest.setAdminDao(adminDao);

		// When
		underTest.initializeDB();

		// Then - assertions for this instance of AdminManagerImpl
		assertNull(underTest.getJmsListener());

	}

	/**
	 * Parasoft Jtest UTA: Test for isJmsListenerRunning()
	 *
	 * @see com.parasoft.parabank.domain.logic.impl.AdminManagerImpl#isJmsListenerRunning()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testIsJmsListenerRunning() throws Throwable {
		// Given
		AdminManagerImpl underTest = new AdminManagerImpl();
		AbstractJmsListeningContainer jmsListener = mock(AbstractJmsListeningContainer.class);
		underTest.setJmsListener(jmsListener);

		// When
		boolean result = underTest.isJmsListenerRunning();

		// Then - assertions for result of method isJmsListenerRunning()
		assertFalse(result);

		// Then - assertions for this instance of AdminManagerImpl
		assertNotNull(underTest.getJmsListener());

	}

	/**
	 * Parasoft Jtest UTA: Test for populateAdminForm(AdminForm)
	 *
	 * @see com.parasoft.parabank.domain.logic.impl.AdminManagerImpl#populateAdminForm(AdminForm)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testPopulateAdminForm() throws Throwable {
		// Given
		AdminManagerImpl underTest = new AdminManagerImpl();
		AdminDao adminDao = mockAdminDao();
		underTest.setAdminDao(adminDao);

		// When
		AdminForm aForm = mockAdminForm();
		AdminForm result = underTest.populateAdminForm(aForm);

		// Then - assertions for argument 1 of method populateAdminForm(AdminForm)
		assertNull(aForm.getEndpoint());
		assertNull(aForm.getSoapEndpoint());
		assertNull(aForm.getRestEndpoint());
		assertNull(aForm.getInitialBalance());
		assertNull(aForm.getMinimumBalance());
		assertNull(aForm.getLoanProvider());
		assertNull(aForm.getLoanProcessor());
		assertNull(aForm.getLoanProcessorThreshold());
		assertNull(aForm.getAccessMode());

		// Then - assertions for result of method populateAdminForm(AdminForm)
		assertNotNull(result);
		assertNull(result.getEndpoint());
		assertNull(result.getSoapEndpoint());
		assertNull(result.getRestEndpoint());
		assertNull(result.getInitialBalance());
		assertNull(result.getMinimumBalance());
		assertNull(result.getLoanProvider());
		assertNull(result.getLoanProcessor());
		assertNull(result.getLoanProcessorThreshold());
		assertNull(result.getAccessMode());

		// Then - assertions for this instance of AdminManagerImpl
		assertNull(underTest.getJmsListener());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AdminDao
	 */
	private static AdminDao mockAdminDao() throws Throwable {
		AdminDao adminDao = mock(AdminDao.class);
		Map<String, String> getParametersResult = new HashMap<String, String>(); // UTA: default value
		String key = "key"; // UTA: default value
		String value = "value"; // UTA: default value
		getParametersResult.put(key, value);
		doReturn(getParametersResult).when(adminDao).getParameters();
		return adminDao;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of AdminForm
	 */
	private static AdminForm mockAdminForm() throws Throwable {
		AdminForm aForm = mock(AdminForm.class);
		Map<String, String> getParametersResult2 = new HashMap<String, String>(); // UTA: default value
		String key2 = "key2"; // UTA: default value
		String value2 = "value2"; // UTA: default value
		getParametersResult2.put(key2, value2);
		doReturn(getParametersResult2).when(aForm).getParameters();
		return aForm;
	}

	/**
	 * Parasoft Jtest UTA: Test for setParameter(String, String)
	 *
	 * @see com.parasoft.parabank.domain.logic.impl.AdminManagerImpl#setParameter(String, String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetParameter() throws Throwable {
		// Given
		AdminManagerImpl underTest = new AdminManagerImpl();
		AdminDao adminDao = mock(AdminDao.class);
		underTest.setAdminDao(adminDao);

		// When
		String name = "name"; // UTA: default value
		String value = "value"; // UTA: default value
		underTest.setParameter(name, value);

		// Then - assertions for this instance of AdminManagerImpl
		assertNull(underTest.getJmsListener());

	}

	/**
	 * Parasoft Jtest UTA: Test for shutdownJmsListener()
	 *
	 * @see com.parasoft.parabank.domain.logic.impl.AdminManagerImpl#shutdownJmsListener()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testShutdownJmsListener() throws Throwable {
		// Given
		AdminManagerImpl underTest = new AdminManagerImpl();
		AbstractJmsListeningContainer jmsListener = mock(AbstractJmsListeningContainer.class);
		underTest.setJmsListener(jmsListener);

		// When
		underTest.shutdownJmsListener();

		// Then - assertions for this instance of AdminManagerImpl
		assertNotNull(underTest.getJmsListener());

	}

	/**
	 * Parasoft Jtest UTA: Test for startupJmsListener()
	 *
	 * @see com.parasoft.parabank.domain.logic.impl.AdminManagerImpl#startupJmsListener()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testStartupJmsListener() throws Throwable {
		// Given
		AdminManagerImpl underTest = new AdminManagerImpl();
		AbstractJmsListeningContainer jmsListener = mock(AbstractJmsListeningContainer.class);
		underTest.setJmsListener(jmsListener);

		// When
		underTest.startupJmsListener();

		// Then - assertions for this instance of AdminManagerImpl
		assertNotNull(underTest.getJmsListener());

	}
}