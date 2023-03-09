/**
 * 
 */
package com.parasoft.parabank.dao.jdbc;

import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;

import com.parasoft.parabank.domain.News;
import java.util.Date;
import java.util.List;
import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for JdbcNewsDao
 *
 * @see com.parasoft.parabank.dao.jdbc.JdbcNewsDao
 * @author devtest
 */
public class JdbcNewsDaoTest {

	/**
	 * Parasoft Jtest UTA: Test for getLatestNewsDate()
	 *
	 * @see com.parasoft.parabank.dao.jdbc.JdbcNewsDao#getLatestNewsDate()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetLatestNewsDate() throws Throwable {
		// Given
		JdbcNewsDao underTest = new JdbcNewsDao();

		// When
		Date result = underTest.getLatestNewsDate();

		// Then - assertions for this instance of JdbcNewsDao
		assertNull(underTest.getJdbcTemplate());

	}

	/**
	 * Parasoft Jtest UTA: Test for getNews()
	 *
	 * @see com.parasoft.parabank.dao.jdbc.JdbcNewsDao#getNews()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetNews() throws Throwable {
		// Given
		JdbcNewsDao underTest = new JdbcNewsDao();

		// When
		List<News> result = underTest.getNews();

		// Then - assertions for this instance of JdbcNewsDao
		assertNull(underTest.getJdbcTemplate());

	}

	/**
	 * Parasoft Jtest UTA: Test for getNewsForDate(Date)
	 *
	 * @see com.parasoft.parabank.dao.jdbc.JdbcNewsDao#getNewsForDate(Date)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetNewsForDate() throws Throwable {
		// Given
		JdbcNewsDao underTest = new JdbcNewsDao();

		// When
		Date date = mock(Date.class);
		List<News> result = underTest.getNewsForDate(date);

		// Then - assertions for this instance of JdbcNewsDao
		assertNull(underTest.getJdbcTemplate());

	}
}