/**
 * 
 */
package com.parasoft.parabank.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.math.BigDecimal;
import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for Position
 *
 * @see com.parasoft.parabank.domain.Position
 * @author devtest
 */
public class PositionTest {

	/**
	 * Parasoft Jtest UTA: Test for equals(Object)
	 *
	 * @see com.parasoft.parabank.domain.Position#equals(Object)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testEquals() throws Throwable {
		// Given
		Position underTest = new Position();

		// When
		Object obj = null; // UTA: provided value
		boolean result = underTest.equals(obj);

		// Then - assertions for result of method equals(Object)
		assertFalse(result);

		// Then - assertions for this instance of Position
		assertEquals(0, underTest.getPositionId());
		assertEquals(0, underTest.getCustomerId());
		assertNull(underTest.getName());
		assertNull(underTest.getSymbol());
		assertEquals(0, underTest.getShares());
		assertNull(underTest.getPurchasePrice());

	}

	/**
	 * Parasoft Jtest UTA: Test for equals(Object)
	 *
	 * @see com.parasoft.parabank.domain.Position#equals(Object)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testEquals2() throws Throwable {
		// Given
		Position underTest = new Position();
		int id = 0; // UTA: provided value
		underTest.setPositionId(id);

		// When
		Position obj = mock(Position.class);
		boolean result = underTest.equals(obj);

		// Then - assertions for result of method equals(Object)
		assertTrue(result);

		// Then - assertions for this instance of Position
		assertEquals(0, underTest.getPositionId());
		assertEquals(0, underTest.getCustomerId());
		assertNull(underTest.getName());
		assertNull(underTest.getSymbol());
		assertEquals(0, underTest.getShares());
		assertNull(underTest.getPurchasePrice());

	}

	/**
	 * Parasoft Jtest UTA: Test for equals(Object)
	 *
	 * @see com.parasoft.parabank.domain.Position#equals(Object)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testEquals3() throws Throwable {
		// Given
		Position underTest = new Position();
		int id = -1000; // UTA: provided value
		underTest.setCustomerId(id);
		int id2 = -1000; // UTA: provided value
		underTest.setPositionId(id2);

		// When
		Position obj = mock(Position.class);
		boolean result = underTest.equals(obj);

		// Then - assertions for result of method equals(Object)
		assertFalse(result);

		// Then - assertions for this instance of Position
		assertEquals(-1000, underTest.getPositionId());
		assertEquals(-1000, underTest.getCustomerId());
		assertNull(underTest.getName());
		assertNull(underTest.getSymbol());
		assertEquals(0, underTest.getShares());
		assertNull(underTest.getPurchasePrice());

	}

	/**
	 * Parasoft Jtest UTA: Test for equals(Object)
	 *
	 * @see com.parasoft.parabank.domain.Position#equals(Object)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testEquals4() throws Throwable {
		// Given
		Position underTest = new Position();
		int id = -1000; // UTA: provided value
		underTest.setCustomerId(id);
		int id2 = -1000; // UTA: provided value
		underTest.setPositionId(id2);
		int shares = -999; // UTA: provided value
		underTest.setShares(shares);

		// When
		Position obj = mock(Position.class);
		boolean result = underTest.equals(obj);

		// Then - assertions for result of method equals(Object)
		assertFalse(result);

		// Then - assertions for this instance of Position
		assertEquals(-1000, underTest.getPositionId());
		assertEquals(-1000, underTest.getCustomerId());
		assertNull(underTest.getName());
		assertNull(underTest.getSymbol());
		assertEquals(-999, underTest.getShares());
		assertNull(underTest.getPurchasePrice());

	}

	/**
	 * Parasoft Jtest UTA: Test for getCostBasis()
	 *
	 * @see com.parasoft.parabank.domain.Position#getCostBasis()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetCostBasis() throws Throwable {
		// Given
		Position underTest = new Position();
		BigDecimal price = BigDecimal.ZERO; // UTA: default value
		underTest.setPurchasePrice(price);

		// When
		BigDecimal result = underTest.getCostBasis();

		// Then - assertions for result of method getCostBasis()
		assertNotNull(result);
		assertEquals(0d, result.doubleValue(), 0.0);

		// Then - assertions for this instance of Position
		assertEquals(0, underTest.getPositionId());
		assertEquals(0, underTest.getCustomerId());
		assertNull(underTest.getName());
		assertNull(underTest.getSymbol());
		assertEquals(0, underTest.getShares());
		assertNotNull(underTest.getPurchasePrice());
		assertEquals(0d, underTest.getPurchasePrice().doubleValue(), 0.0);

	}

	/**
	 * Parasoft Jtest UTA: Test for getCustomerId()
	 *
	 * @see com.parasoft.parabank.domain.Position#getCustomerId()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetCustomerId() throws Throwable {
		// Given
		Position underTest = new Position();

		// When
		int result = underTest.getCustomerId();

		// Then - assertions for result of method getCustomerId()
		assertEquals(0, result);

		// Then - assertions for this instance of Position
		assertEquals(0, underTest.getPositionId());
		assertNull(underTest.getName());
		assertNull(underTest.getSymbol());
		assertEquals(0, underTest.getShares());
		assertNull(underTest.getPurchasePrice());

	}

	/**
	 * Parasoft Jtest UTA: Test for getName()
	 *
	 * @see com.parasoft.parabank.domain.Position#getName()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetName() throws Throwable {
		// Given
		Position underTest = new Position();

		// When
		String result = underTest.getName();

		// Then - assertions for result of method getName()
		assertNull(result);

		// Then - assertions for this instance of Position
		assertEquals(0, underTest.getPositionId());
		assertEquals(0, underTest.getCustomerId());
		assertNull(underTest.getSymbol());
		assertEquals(0, underTest.getShares());
		assertNull(underTest.getPurchasePrice());

	}

	/**
	 * Parasoft Jtest UTA: Test for getPositionId()
	 *
	 * @see com.parasoft.parabank.domain.Position#getPositionId()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetPositionId() throws Throwable {
		// Given
		Position underTest = new Position();

		// When
		int result = underTest.getPositionId();

		// Then - assertions for result of method getPositionId()
		assertEquals(0, result);

		// Then - assertions for this instance of Position
		assertEquals(0, underTest.getCustomerId());
		assertNull(underTest.getName());
		assertNull(underTest.getSymbol());
		assertEquals(0, underTest.getShares());
		assertNull(underTest.getPurchasePrice());

	}

	/**
	 * Parasoft Jtest UTA: Test for getPurchasePrice()
	 *
	 * @see com.parasoft.parabank.domain.Position#getPurchasePrice()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetPurchasePrice() throws Throwable {
		// Given
		Position underTest = new Position();

		// When
		BigDecimal result = underTest.getPurchasePrice();

		// Then - assertions for result of method getPurchasePrice()
		assertNull(result);

		// Then - assertions for this instance of Position
		assertEquals(0, underTest.getPositionId());
		assertEquals(0, underTest.getCustomerId());
		assertNull(underTest.getName());
		assertNull(underTest.getSymbol());
		assertEquals(0, underTest.getShares());

	}

	/**
	 * Parasoft Jtest UTA: Test for getShares()
	 *
	 * @see com.parasoft.parabank.domain.Position#getShares()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetShares() throws Throwable {
		// Given
		Position underTest = new Position();

		// When
		int result = underTest.getShares();

		// Then - assertions for result of method getShares()
		assertEquals(0, result);

		// Then - assertions for this instance of Position
		assertEquals(0, underTest.getPositionId());
		assertEquals(0, underTest.getCustomerId());
		assertNull(underTest.getName());
		assertNull(underTest.getSymbol());
		assertNull(underTest.getPurchasePrice());

	}

	/**
	 * Parasoft Jtest UTA: Test for getSymbol()
	 *
	 * @see com.parasoft.parabank.domain.Position#getSymbol()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetSymbol() throws Throwable {
		// Given
		Position underTest = new Position();

		// When
		String result = underTest.getSymbol();

		// Then - assertions for result of method getSymbol()
		assertNull(result);

		// Then - assertions for this instance of Position
		assertEquals(0, underTest.getPositionId());
		assertEquals(0, underTest.getCustomerId());
		assertNull(underTest.getName());
		assertEquals(0, underTest.getShares());
		assertNull(underTest.getPurchasePrice());

	}

	/**
	 * Parasoft Jtest UTA: Test for hashCode()
	 *
	 * @see com.parasoft.parabank.domain.Position#hashCode()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testHashCode() throws Throwable {
		// Given
		Position underTest = new Position();
		BigDecimal price = BigDecimal.ZERO; // UTA: default value
		underTest.setPurchasePrice(price);
		String name = "name"; // UTA: default value
		underTest.setName(name);
		String symbol = "symbol"; // UTA: default value
		underTest.setSymbol(symbol);

		// When
		int result = underTest.hashCode();

		// Then - assertions for result of method hashCode()
		// assertEquals(0, result);// UTA: Expected value may be unstable

		// Then - assertions for this instance of Position
		assertEquals(0, underTest.getPositionId());
		assertEquals(0, underTest.getCustomerId());
		assertEquals("name", underTest.getName());
		assertEquals("symbol", underTest.getSymbol());
		assertEquals(0, underTest.getShares());
		assertNotNull(underTest.getPurchasePrice());
		assertEquals(0d, underTest.getPurchasePrice().doubleValue(), 0.0);

	}

	/**
	 * Parasoft Jtest UTA: Test for toString()
	 *
	 * @see com.parasoft.parabank.domain.Position#toString()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testToString() throws Throwable {
		// Given
		Position underTest = new Position();
		BigDecimal price = BigDecimal.ZERO; // UTA: default value
		underTest.setPurchasePrice(price);
		String name = "name"; // UTA: default value
		underTest.setName(name);
		String symbol = "symbol"; // UTA: default value
		underTest.setSymbol(symbol);

		// When
		String result = underTest.toString();

		// Then - assertions for result of method toString()
		assertEquals("Position [positionId=0, customerId=0, name=name, symbol=symbol, shares=0, purchasePrice=0]",
				result);

		// Then - assertions for this instance of Position
		assertEquals(0, underTest.getPositionId());
		assertEquals(0, underTest.getCustomerId());
		assertEquals("name", underTest.getName());
		assertEquals("symbol", underTest.getSymbol());
		assertEquals(0, underTest.getShares());
		assertNotNull(underTest.getPurchasePrice());
		assertEquals(0d, underTest.getPurchasePrice().doubleValue(), 0.0);

	}
}