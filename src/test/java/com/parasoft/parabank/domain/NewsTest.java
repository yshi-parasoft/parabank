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

import java.util.Date;
import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for News
 *
 * @see com.parasoft.parabank.domain.News
 * @author devtest
 */
public class NewsTest {

	/**
	 * Parasoft Jtest UTA: Test for equals(Object)
	 *
	 * @see com.parasoft.parabank.domain.News#equals(Object)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testEquals() throws Throwable {
		// Given
		News underTest = new News();

		// When
		Object obj = null; // UTA: provided value
		boolean result = underTest.equals(obj);

		// Then - assertions for result of method equals(Object)
		assertFalse(result);

		// Then - assertions for this instance of News
		assertEquals(0, underTest.getId());
		assertNull(underTest.getDate());
		assertNull(underTest.getHeadline());
		assertNull(underTest.getStory());

	}

	/**
	 * Parasoft Jtest UTA: Test for equals(Object)
	 *
	 * @see com.parasoft.parabank.domain.News#equals(Object)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testEquals2() throws Throwable {
		// Given
		News underTest = new News();

		// When
		News obj = new News(); // UTA: default value
		boolean result = underTest.equals(obj);

		// Then - assertions for result of method equals(Object)
		assertTrue(result);

		// Then - assertions for this instance of News
		assertEquals(0, underTest.getId());
		assertNull(underTest.getDate());
		assertNull(underTest.getHeadline());
		assertNull(underTest.getStory());

	}

	/**
	 * Parasoft Jtest UTA: Test for getDate()
	 *
	 * @see com.parasoft.parabank.domain.News#getDate()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetDate() throws Throwable {
		// Given
		News underTest = new News();

		// When
		Date result = underTest.getDate();

		// Then - assertions for result of method getDate()
		assertNull(result);

		// Then - assertions for this instance of News
		assertEquals(0, underTest.getId());
		assertNull(underTest.getHeadline());
		assertNull(underTest.getStory());

	}

	/**
	 * Parasoft Jtest UTA: Test for getHeadline()
	 *
	 * @see com.parasoft.parabank.domain.News#getHeadline()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetHeadline() throws Throwable {
		// Given
		News underTest = new News();

		// When
		String result = underTest.getHeadline();

		// Then - assertions for result of method getHeadline()
		assertNull(result);

		// Then - assertions for this instance of News
		assertEquals(0, underTest.getId());
		assertNull(underTest.getDate());
		assertNull(underTest.getStory());

	}

	/**
	 * Parasoft Jtest UTA: Test for getId()
	 *
	 * @see com.parasoft.parabank.domain.News#getId()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetId() throws Throwable {
		// Given
		News underTest = new News();

		// When
		int result = underTest.getId();

		// Then - assertions for result of method getId()
		assertEquals(0, result);

		// Then - assertions for this instance of News
		assertNull(underTest.getDate());
		assertNull(underTest.getHeadline());
		assertNull(underTest.getStory());

	}

	/**
	 * Parasoft Jtest UTA: Test for getStory()
	 *
	 * @see com.parasoft.parabank.domain.News#getStory()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetStory() throws Throwable {
		// Given
		News underTest = new News();

		// When
		String result = underTest.getStory();

		// Then - assertions for result of method getStory()
		assertNull(result);

		// Then - assertions for this instance of News
		assertEquals(0, underTest.getId());
		assertNull(underTest.getDate());
		assertNull(underTest.getHeadline());

	}

	/**
	 * Parasoft Jtest UTA: Test for hashCode()
	 *
	 * @see com.parasoft.parabank.domain.News#hashCode()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testHashCode() throws Throwable {
		// Given
		News underTest = new News();

		// When
		int result = underTest.hashCode();

		// Then - assertions for result of method hashCode()
		// assertEquals(0, result);// UTA: Expected value may be unstable

		// Then - assertions for this instance of News
		assertEquals(0, underTest.getId());
		assertNull(underTest.getDate());
		assertNull(underTest.getHeadline());
		assertNull(underTest.getStory());

	}

	/**
	 * Parasoft Jtest UTA: Test for setDate(Date)
	 *
	 * @see com.parasoft.parabank.domain.News#setDate(Date)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetDate() throws Throwable {
		// Given
		News underTest = new News();

		// When
		Date date = mock(Date.class);
		underTest.setDate(date);

		// Then - assertions for this instance of News
		assertEquals(0, underTest.getId());
		assertNotNull(underTest.getDate());
		assertNull(underTest.getHeadline());
		assertNull(underTest.getStory());

	}

	/**
	 * Parasoft Jtest UTA: Test for setHeadline(String)
	 *
	 * @see com.parasoft.parabank.domain.News#setHeadline(String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetHeadline() throws Throwable {
		// Given
		News underTest = new News();

		// When
		String headline = "headline"; // UTA: default value
		underTest.setHeadline(headline);

		// Then - assertions for this instance of News
		assertEquals(0, underTest.getId());
		assertNull(underTest.getDate());
		assertEquals("headline", underTest.getHeadline());
		assertNull(underTest.getStory());

	}

	/**
	 * Parasoft Jtest UTA: Test for setId(int)
	 *
	 * @see com.parasoft.parabank.domain.News#setId(int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetId() throws Throwable {
		// Given
		News underTest = new News();

		// When
		int id = 0; // UTA: default value
		underTest.setId(id);

		// Then - assertions for this instance of News
		assertEquals(0, underTest.getId());
		assertNull(underTest.getDate());
		assertNull(underTest.getHeadline());
		assertNull(underTest.getStory());

	}

	/**
	 * Parasoft Jtest UTA: Test for setStory(String)
	 *
	 * @see com.parasoft.parabank.domain.News#setStory(String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSetStory() throws Throwable {
		// Given
		News underTest = new News();

		// When
		String story = "story"; // UTA: default value
		underTest.setStory(story);

		// Then - assertions for this instance of News
		assertEquals(0, underTest.getId());
		assertNull(underTest.getDate());
		assertNull(underTest.getHeadline());
		assertEquals("story", underTest.getStory());

	}

	/**
	 * Parasoft Jtest UTA: Test for toString()
	 *
	 * @see com.parasoft.parabank.domain.News#toString()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testToString() throws Throwable {
		// Given
		News underTest = new News();

		// When
		String result = underTest.toString();

		// Then - assertions for result of method toString()
		assertEquals("News [id=0, date=null, headline=null, story=null]", result);

		// Then - assertions for this instance of News
		assertEquals(0, underTest.getId());
		assertNull(underTest.getDate());
		assertNull(underTest.getHeadline());
		assertNull(underTest.getStory());

	}
}