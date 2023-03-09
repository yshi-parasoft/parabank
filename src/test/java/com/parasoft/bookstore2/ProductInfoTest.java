/**
 * 
 */
package com.parasoft.bookstore2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.math.BigDecimal;
import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for ProductInfo
 *
 * @see com.parasoft.bookstore2.ProductInfo
 * @author devtest
 */
public class ProductInfoTest {

	/**
	 * Parasoft Jtest UTA: Test for getAmount()
	 *
	 * @see com.parasoft.bookstore2.ProductInfo#getAmount()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetAmount() throws Throwable {
		// Given
		ProductInfo underTest = new ProductInfo();

		// When
		BigDecimal result = underTest.getAmount();

		// Then - assertions for result of method getAmount()
		assertNull(result);

		// Then - assertions for this instance of ProductInfo
		assertEquals(0, underTest.getId());
		assertNull(underTest.toString());
		assertEquals(0, underTest.getStockQuantity());

	}

	/**
	 * Parasoft Jtest UTA: Test for getId()
	 *
	 * @see com.parasoft.bookstore2.ProductInfo#getId()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetId() throws Throwable {
		// Given
		ProductInfo underTest = new ProductInfo();

		// When
		int result = underTest.getId();

		// Then - assertions for result of method getId()
		assertEquals(0, result);

		// Then - assertions for this instance of ProductInfo
		assertNull(underTest.toString());
		assertEquals(0, underTest.getStockQuantity());
		assertNull(underTest.getAmount());

	}

	/**
	 * Parasoft Jtest UTA: Test for getName()
	 *
	 * @see com.parasoft.bookstore2.ProductInfo#getName()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetName() throws Throwable {
		// Given
		ProductInfo underTest = new ProductInfo();

		// When
		String result = underTest.getName();

		// Then - assertions for result of method getName()
		assertNull(result);

		// Then - assertions for this instance of ProductInfo
		assertEquals(0, underTest.getId());
		assertNull(underTest.toString());
		assertEquals(0, underTest.getStockQuantity());
		assertNull(underTest.getAmount());

	}

	/**
	 * Parasoft Jtest UTA: Test for getStockQuantity()
	 *
	 * @see com.parasoft.bookstore2.ProductInfo#getStockQuantity()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetStockQuantity() throws Throwable {
		// Given
		ProductInfo underTest = new ProductInfo();

		// When
		int result = underTest.getStockQuantity();

		// Then - assertions for result of method getStockQuantity()
		assertEquals(0, result);

		// Then - assertions for this instance of ProductInfo
		assertEquals(0, underTest.getId());
		assertNull(underTest.toString());
		assertNull(underTest.getAmount());

	}

	/**
	 * Parasoft Jtest UTA: Test for inflateAmount(BigDecimal)
	 *
	 * @see com.parasoft.bookstore2.ProductInfo#inflateAmount(BigDecimal)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testInflateAmount() throws Throwable {
		// Given
		int id = 0; // UTA: default value
		String name = "name"; // UTA: default value
		BigDecimal amount = BigDecimal.ZERO; // UTA: default value
		int quantity = 0; // UTA: default value
		ProductInfo underTest = new ProductInfo(id, name, amount, quantity);

		// When
		BigDecimal inflate = BigDecimal.ZERO; // UTA: default value
		underTest.inflateAmount(inflate);

		// Then - assertions for this instance of ProductInfo
		assertEquals(0, underTest.getId());
		assertEquals("name", underTest.toString());
		assertEquals(0, underTest.getStockQuantity());
		assertNotNull(underTest.getAmount());
		assertEquals(0d, underTest.getAmount().doubleValue(), 0.0);

	}

	/**
	 * Parasoft Jtest UTA: Test for setId(int)
	 *
	 * @see com.parasoft.bookstore2.ProductInfo#setId(int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetId() throws Throwable {
		// Given
		ProductInfo underTest = new ProductInfo();

		// When
		int id = 0; // UTA: default value
		underTest.setId(id);

		// Then - assertions for this instance of ProductInfo
		assertEquals(0, underTest.getId());
		assertNull(underTest.toString());
		assertEquals(0, underTest.getStockQuantity());
		assertNull(underTest.getAmount());

	}

	/**
	 * Parasoft Jtest UTA: Test for setName(String)
	 *
	 * @see com.parasoft.bookstore2.ProductInfo#setName(String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetName() throws Throwable {
		// Given
		ProductInfo underTest = new ProductInfo();

		// When
		String title = "title"; // UTA: default value
		underTest.setName(title);

		// Then - assertions for this instance of ProductInfo
		assertEquals(0, underTest.getId());
		assertEquals("title", underTest.toString());
		assertEquals(0, underTest.getStockQuantity());
		assertNull(underTest.getAmount());

	}

	/**
	 * Parasoft Jtest UTA: Test for setStockQuantity(int)
	 *
	 * @see com.parasoft.bookstore2.ProductInfo#setStockQuantity(int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetStockQuantity() throws Throwable {
		// Given
		ProductInfo underTest = new ProductInfo();

		// When
		int quantity_in_stock = 0; // UTA: default value
		underTest.setStockQuantity(quantity_in_stock);

		// Then - assertions for this instance of ProductInfo
		assertEquals(0, underTest.getId());
		assertNull(underTest.toString());
		assertEquals(0, underTest.getStockQuantity());
		assertNull(underTest.getAmount());

	}

	/**
	 * Parasoft Jtest UTA: Test for toString()
	 *
	 * @see com.parasoft.bookstore2.ProductInfo#toString()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testToString() throws Throwable {
		// Given
		ProductInfo underTest = new ProductInfo();

		// When
		String result = underTest.toString();

		// Then - assertions for result of method toString()
		assertNull(result);

		// Then - assertions for this instance of ProductInfo
		assertEquals(0, underTest.getId());
		assertEquals(0, underTest.getStockQuantity());
		assertNull(underTest.getAmount());

	}
}