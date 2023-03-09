/**
 * 
 */
package com.parasoft.parabank.dao.jdbc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;

import com.parasoft.parabank.domain.Account;
import java.util.List;
import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for JdbcAccountDao
 *
 * @see com.parasoft.parabank.dao.jdbc.JdbcAccountDao
 * @author devtest
 */
public class JdbcAccountDaoTest {

	/**
	 * Parasoft Jtest UTA: Test for createAccount(Account)
	 *
	 * @see com.parasoft.parabank.dao.jdbc.JdbcAccountDao#createAccount(Account)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testCreateAccount() throws Throwable {
		// Given
		JdbcAccountDao underTest = new JdbcAccountDao();
		JdbcSequenceDao sequenceDao = mock(JdbcSequenceDao.class);
		underTest.setSequenceDao(sequenceDao);

		// When
		Account account = new Account(); // UTA: default value
		int result = underTest.createAccount(account);

		// Then - assertions for argument 1 of method createAccount(Account)
		assertEquals(0, account.getId());
		assertEquals(0, account.getCustomerId());
		assertNull(account.getType());
		assertNull(account.getBalance());

		// Then - assertions for this instance of JdbcAccountDao
		assertNull(underTest.getJdbcTemplate());
		assertNull(underTest.getNamedParameterJdbcTemplate());

	}

	/**
	 * Parasoft Jtest UTA: Test for getAccount(int)
	 *
	 * @see com.parasoft.parabank.dao.jdbc.JdbcAccountDao#getAccount(int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetAccount() throws Throwable {
		// Given
		JdbcAccountDao underTest = new JdbcAccountDao();

		// When
		int id = 0; // UTA: default value
		Account result = underTest.getAccount(id);

		// Then - assertions for this instance of JdbcAccountDao
		assertNull(underTest.getJdbcTemplate());
		assertNull(underTest.getNamedParameterJdbcTemplate());

	}

	/**
	 * Parasoft Jtest UTA: Test for getAccountsForCustomerId(int)
	 *
	 * @see com.parasoft.parabank.dao.jdbc.JdbcAccountDao#getAccountsForCustomerId(int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetAccountsForCustomerId() throws Throwable {
		// Given
		JdbcAccountDao underTest = new JdbcAccountDao();

		// When
		int customerId = 0; // UTA: default value
		List<Account> result = underTest.getAccountsForCustomerId(customerId);

		// Then - assertions for this instance of JdbcAccountDao
		assertNull(underTest.getJdbcTemplate());
		assertNull(underTest.getNamedParameterJdbcTemplate());

	}

	/**
	 * Parasoft Jtest UTA: Test for setSequenceDao(JdbcSequenceDao)
	 *
	 * @see com.parasoft.parabank.dao.jdbc.JdbcAccountDao#setSequenceDao(JdbcSequenceDao)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetSequenceDao() throws Throwable {
		// Given
		JdbcAccountDao underTest = new JdbcAccountDao();

		// When
		JdbcSequenceDao sequenceDao = mock(JdbcSequenceDao.class);
		underTest.setSequenceDao(sequenceDao);

		// Then - assertions for argument 1 of method setSequenceDao(JdbcSequenceDao)
		assertNull(sequenceDao.getJdbcTemplate());

		// Then - assertions for this instance of JdbcAccountDao
		assertNull(underTest.getJdbcTemplate());
		assertNull(underTest.getNamedParameterJdbcTemplate());

	}

	/**
	 * Parasoft Jtest UTA: Test for updateAccount(Account)
	 *
	 * @see com.parasoft.parabank.dao.jdbc.JdbcAccountDao#updateAccount(Account)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testUpdateAccount() throws Throwable {
		// Given
		JdbcAccountDao underTest = new JdbcAccountDao();

		// When
		Account account = new Account(); // UTA: default value
		underTest.updateAccount(account);

		// Then - assertions for argument 1 of method updateAccount(Account)
		assertEquals(0, account.getId());
		assertEquals(0, account.getCustomerId());
		assertNull(account.getType());
		assertNull(account.getBalance());

		// Then - assertions for this instance of JdbcAccountDao
		assertNull(underTest.getJdbcTemplate());
		assertNull(underTest.getNamedParameterJdbcTemplate());

	}
}