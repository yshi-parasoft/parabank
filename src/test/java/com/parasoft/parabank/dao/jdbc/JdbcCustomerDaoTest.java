/**
 * 
 */
package com.parasoft.parabank.dao.jdbc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;

import com.parasoft.parabank.domain.Customer;
import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for JdbcCustomerDao
 *
 * @see com.parasoft.parabank.dao.jdbc.JdbcCustomerDao
 * @author devtest
 */
public class JdbcCustomerDaoTest {

	/**
	 * Parasoft Jtest UTA: Test for createCustomer(Customer)
	 *
	 * @see com.parasoft.parabank.dao.jdbc.JdbcCustomerDao#createCustomer(Customer)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testCreateCustomer() throws Throwable {
		// Given
		JdbcCustomerDao underTest = new JdbcCustomerDao();
		JdbcSequenceDao sequenceDao = mock(JdbcSequenceDao.class);
		underTest.setSequenceDao(sequenceDao);

		// When
		Customer customer = new Customer(); // UTA: default value
		int result = underTest.createCustomer(customer);

		// Then - assertions for argument 1 of method createCustomer(Customer)
		assertEquals(0, customer.getId());
		assertNull(customer.getFirstName());
		assertNull(customer.getLastName());
		assertNull(customer.getAddress());
		assertNull(customer.getPhoneNumber());
		assertNull(customer.getSsn());
		assertNull(customer.getUsername());
		assertNull(customer.getPassword());

		// Then - assertions for this instance of JdbcCustomerDao
		assertNull(underTest.getJdbcTemplate());
		assertNull(underTest.getNamedParameterJdbcTemplate());

	}

	/**
	 * Parasoft Jtest UTA: Test for getCustomer(int)
	 *
	 * @see com.parasoft.parabank.dao.jdbc.JdbcCustomerDao#getCustomer(int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetCustomer() throws Throwable {
		// Given
		JdbcCustomerDao underTest = new JdbcCustomerDao();

		// When
		int id = 0; // UTA: default value
		Customer result = underTest.getCustomer(id);

		// Then - assertions for this instance of JdbcCustomerDao
		assertNull(underTest.getJdbcTemplate());
		assertNull(underTest.getNamedParameterJdbcTemplate());

	}

	/**
	 * Parasoft Jtest UTA: Test for getCustomer(String)
	 *
	 * @see com.parasoft.parabank.dao.jdbc.JdbcCustomerDao#getCustomer(String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetCustomer2() throws Throwable {
		// Given
		JdbcCustomerDao underTest = new JdbcCustomerDao();

		// When
		String ssn = "ssn"; // UTA: default value
		Customer result = underTest.getCustomer(ssn);

		// Then - assertions for this instance of JdbcCustomerDao
		assertNull(underTest.getJdbcTemplate());
		assertNull(underTest.getNamedParameterJdbcTemplate());

	}

	/**
	 * Parasoft Jtest UTA: Test for getCustomer(String, String)
	 *
	 * @see com.parasoft.parabank.dao.jdbc.JdbcCustomerDao#getCustomer(String, String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetCustomer3() throws Throwable {
		// Given
		JdbcCustomerDao underTest = new JdbcCustomerDao();

		// When
		String username = "username"; // UTA: default value
		String password = "password"; // UTA: default value
		Customer result = underTest.getCustomer(username, password);

		// Then - assertions for this instance of JdbcCustomerDao
		assertNull(underTest.getJdbcTemplate());
		assertNull(underTest.getNamedParameterJdbcTemplate());

	}

	/**
	 * Parasoft Jtest UTA: Test for setSequenceDao(JdbcSequenceDao)
	 *
	 * @see com.parasoft.parabank.dao.jdbc.JdbcCustomerDao#setSequenceDao(JdbcSequenceDao)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetSequenceDao() throws Throwable {
		// Given
		JdbcCustomerDao underTest = new JdbcCustomerDao();

		// When
		JdbcSequenceDao sequenceDao = mock(JdbcSequenceDao.class);
		underTest.setSequenceDao(sequenceDao);

		// Then - assertions for argument 1 of method setSequenceDao(JdbcSequenceDao)
		assertNull(sequenceDao.getJdbcTemplate());

		// Then - assertions for this instance of JdbcCustomerDao
		assertNull(underTest.getJdbcTemplate());
		assertNull(underTest.getNamedParameterJdbcTemplate());

	}

	/**
	 * Parasoft Jtest UTA: Test for updateCustomer(Customer)
	 *
	 * @see com.parasoft.parabank.dao.jdbc.JdbcCustomerDao#updateCustomer(Customer)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testUpdateCustomer() throws Throwable {
		// Given
		JdbcCustomerDao underTest = new JdbcCustomerDao();

		// When
		Customer customer = new Customer(); // UTA: default value
		underTest.updateCustomer(customer);

		// Then - assertions for argument 1 of method updateCustomer(Customer)
		assertEquals(0, customer.getId());
		assertNull(customer.getFirstName());
		assertNull(customer.getLastName());
		assertNull(customer.getAddress());
		assertNull(customer.getPhoneNumber());
		assertNull(customer.getSsn());
		assertNull(customer.getUsername());
		assertNull(customer.getPassword());

		// Then - assertions for this instance of JdbcCustomerDao
		assertNull(underTest.getJdbcTemplate());
		assertNull(underTest.getNamedParameterJdbcTemplate());

	}
}