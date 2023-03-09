/**
 * 
 */
package com.parasoft.parabank.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

import com.parasoft.parabank.domain.Transaction;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for Transactions
 *
 * @see com.parasoft.parabank.util.Transactions
 * @author devtest
 */
public class TransactionsTest {

	/**
	 * Parasoft Jtest UTA: Test for getTranss()
	 *
	 * @see com.parasoft.parabank.util.Transactions#getTranss()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetTranss() throws Throwable {
		// Given
		Transactions underTest = new Transactions();

		// When
		List<Transaction> result = underTest.getTranss();

		// Then - assertions for result of method getTranss()
		assertNotNull(result);
		assertEquals(0, result.size());

	}

	/**
	 * Parasoft Jtest UTA: Test for setTrans(List)
	 *
	 * @see com.parasoft.parabank.util.Transactions#setTrans(List)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetTrans() throws Throwable {
		// Given
		Transactions underTest = new Transactions();

		// When
		List<Transaction> transactions = new ArrayList<Transaction>(); // UTA: default value
		Transaction item = mock(Transaction.class);
		transactions.add(item);
		underTest.setTrans(transactions);

		// Then - assertions for this instance of Transactions
		assertNotNull(underTest.getTranss());
		assertEquals(1, underTest.getTranss().size());

	}
}