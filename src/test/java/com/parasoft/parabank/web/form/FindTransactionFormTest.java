/**
 * 
 */
package com.parasoft.parabank.web.form;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;

import com.parasoft.parabank.domain.TransactionCriteria;
import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for FindTransactionForm
 *
 * @see com.parasoft.parabank.web.form.FindTransactionForm
 * @author devtest
 */
public class FindTransactionFormTest {

	/**
	 * Parasoft Jtest UTA: Test for getAccountId()
	 *
	 * @see com.parasoft.parabank.web.form.FindTransactionForm#getAccountId()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetAccountId() throws Throwable {
		// Given
		FindTransactionForm underTest = new FindTransactionForm();

		// When
		int result = underTest.getAccountId();

		// Then - assertions for result of method getAccountId()
		assertEquals(0, result);

		// Then - assertions for this instance of FindTransactionForm
		assertNull(underTest.getCriteria());

	}

	/**
	 * Parasoft Jtest UTA: Test for getCriteria()
	 *
	 * @see com.parasoft.parabank.web.form.FindTransactionForm#getCriteria()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetCriteria() throws Throwable {
		// Given
		FindTransactionForm underTest = new FindTransactionForm();

		// When
		TransactionCriteria result = underTest.getCriteria();

		// Then - assertions for result of method getCriteria()
		assertNull(result);

		// Then - assertions for this instance of FindTransactionForm
		assertEquals(0, underTest.getAccountId());

	}

	/**
	 * Parasoft Jtest UTA: Test for setAccountId(int)
	 *
	 * @see com.parasoft.parabank.web.form.FindTransactionForm#setAccountId(int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetAccountId() throws Throwable {
		// Given
		FindTransactionForm underTest = new FindTransactionForm();

		// When
		int accountId = 0; // UTA: default value
		underTest.setAccountId(accountId);

		// Then - assertions for this instance of FindTransactionForm
		assertEquals(0, underTest.getAccountId());
		assertNull(underTest.getCriteria());

	}

	/**
	 * Parasoft Jtest UTA: Test for setCriteria(TransactionCriteria)
	 *
	 * @see com.parasoft.parabank.web.form.FindTransactionForm#setCriteria(TransactionCriteria)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetCriteria() throws Throwable {
		// Given
		FindTransactionForm underTest = new FindTransactionForm();

		// When
		TransactionCriteria criteria = mock(TransactionCriteria.class);
		underTest.setCriteria(criteria);

		// Then - assertions for argument 1 of method setCriteria(TransactionCriteria)
		assertNull(criteria.getMonth());
		assertNull(criteria.getTransactionType());
		assertNull(criteria.getTransactionId());
		assertNull(criteria.getOnDate());
		assertNull(criteria.getFromDate());
		assertNull(criteria.getToDate());
		assertNull(criteria.getAmount());
		assertNull(criteria.getSearchType());

		// Then - assertions for this instance of FindTransactionForm
		assertEquals(0, underTest.getAccountId());
		assertNotNull(underTest.getCriteria());
		assertNull(underTest.getCriteria().getMonth());
		assertNull(underTest.getCriteria().getTransactionType());
		assertNull(underTest.getCriteria().getTransactionId());
		assertNull(underTest.getCriteria().getOnDate());
		assertNull(underTest.getCriteria().getFromDate());
		assertNull(underTest.getCriteria().getToDate());
		assertNull(underTest.getCriteria().getAmount());
		assertNull(underTest.getCriteria().getSearchType());

	}
}