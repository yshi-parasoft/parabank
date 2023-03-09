/**
 * 
 */
package com.parasoft.parabank.dao.jdbc;

import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;

import com.parasoft.parabank.dao.internal.DynamicDataInserter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for JdbcAdminDao
 *
 * @see com.parasoft.parabank.dao.jdbc.JdbcAdminDao
 * @author devtest
 */
public class JdbcAdminDaoTest {

	/**
	 * Parasoft Jtest UTA: Test for cleanDB()
	 *
	 * @see com.parasoft.parabank.dao.jdbc.JdbcAdminDao#cleanDB()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testCleanDB() throws Throwable {
		// Given
		JdbcAdminDao underTest = new JdbcAdminDao();

		// When
		underTest.cleanDB();

		// Then - assertions for this instance of JdbcAdminDao
		assertNull(underTest.getJdbcTemplate());

	}

	/**
	 * Parasoft Jtest UTA: Test for getParameter(String)
	 *
	 * @see com.parasoft.parabank.dao.jdbc.JdbcAdminDao#getParameter(String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetParameter() throws Throwable {
		// Given
		JdbcAdminDao underTest = new JdbcAdminDao();

		// When
		String name = "name"; // UTA: default value
		String result = underTest.getParameter(name);

		// Then - assertions for this instance of JdbcAdminDao
		assertNull(underTest.getJdbcTemplate());

	}

	/**
	 * Parasoft Jtest UTA: Test for getParameters()
	 *
	 * @see com.parasoft.parabank.dao.jdbc.JdbcAdminDao#getParameters()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetParameters() throws Throwable {
		// Given
		JdbcAdminDao underTest = new JdbcAdminDao();

		// When
		Map<String, String> result = underTest.getParameters();

		// Then - assertions for this instance of JdbcAdminDao
		assertNull(underTest.getJdbcTemplate());

	}

	/**
	 * Parasoft Jtest UTA: Test for initializeDB()
	 *
	 * @see com.parasoft.parabank.dao.jdbc.JdbcAdminDao#initializeDB()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testInitializeDB() throws Throwable {
		// Given
		JdbcAdminDao underTest = new JdbcAdminDao();
		List<DynamicDataInserter> inserters = new ArrayList<DynamicDataInserter>(); // UTA: default value
		underTest.setInserters(inserters);

		// When
		underTest.initializeDB();

		// Then - assertions for this instance of JdbcAdminDao
		assertNull(underTest.getJdbcTemplate());

	}

	/**
	 * Parasoft Jtest UTA: Test for setInserters(List)
	 *
	 * @see com.parasoft.parabank.dao.jdbc.JdbcAdminDao#setInserters(List)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetInserters() throws Throwable {
		// Given
		JdbcAdminDao underTest = new JdbcAdminDao();

		// When
		List<DynamicDataInserter> inserters = new ArrayList<DynamicDataInserter>(); // UTA: default value
		DynamicDataInserter item = mock(DynamicDataInserter.class);
		inserters.add(item);
		underTest.setInserters(inserters);

		// Then - assertions for this instance of JdbcAdminDao
		assertNull(underTest.getJdbcTemplate());

	}

	/**
	 * Parasoft Jtest UTA: Test for setParameter(String, String)
	 *
	 * @see com.parasoft.parabank.dao.jdbc.JdbcAdminDao#setParameter(String, String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetParameter() throws Throwable {
		// Given
		JdbcAdminDao underTest = new JdbcAdminDao();

		// When
		String name = "name"; // UTA: default value
		String value = "value"; // UTA: default value
		underTest.setParameter(name, value);

		// Then - assertions for this instance of JdbcAdminDao
		assertNull(underTest.getJdbcTemplate());

	}
}