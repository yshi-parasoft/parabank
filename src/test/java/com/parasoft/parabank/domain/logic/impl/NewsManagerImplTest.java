/**
 * 
 */
package com.parasoft.parabank.domain.logic.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.nullable;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

import com.parasoft.parabank.dao.NewsDao;
import com.parasoft.parabank.domain.News;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for NewsManagerImpl
 *
 * @see com.parasoft.parabank.domain.logic.impl.NewsManagerImpl
 * @author devtest
 */
public class NewsManagerImplTest {

	/**
	 * Parasoft Jtest UTA: Test for getLatestNews()
	 *
	 * @see com.parasoft.parabank.domain.logic.impl.NewsManagerImpl#getLatestNews()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetLatestNews() throws Throwable {
		// Given
		NewsDao newsDao = mockNewsDao();
		NewsManagerImpl underTest = new NewsManagerImpl(newsDao);

		// When
		Map<Date, List<News>> result = underTest.getLatestNews();

		// Then - assertions for result of method getLatestNews()
		assertNotNull(result);
		assertEquals(1, result.size());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of NewsDao
	 */
	private static NewsDao mockNewsDao() throws Throwable {
		NewsDao newsDao = mock(NewsDao.class);
		List<News> getNewsForDateResult = new ArrayList<News>(); // UTA: default value
		News item = mock(News.class);
		getNewsForDateResult.add(item);
		doReturn(getNewsForDateResult).when(newsDao).getNewsForDate(nullable(Date.class));
		return newsDao;
	}

	/**
	 * Parasoft Jtest UTA: Test for getNews()
	 *
	 * @see com.parasoft.parabank.domain.logic.impl.NewsManagerImpl#getNews()
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetNews() throws Throwable {
		// Given
		NewsDao newsDao = mockNewsDao2();
		NewsManagerImpl underTest = new NewsManagerImpl(newsDao);

		// When
		Map<Date, List<News>> result = underTest.getNews();

		// Then - assertions for result of method getNews()
		assertNotNull(result);
		assertEquals(1, result.size());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of NewsDao
	 */
	private static NewsDao mockNewsDao2() throws Throwable {
		NewsDao newsDao = mock(NewsDao.class);
		List<News> getNewsResult = new ArrayList<News>(); // UTA: default value
		News item = mock(News.class);
		getNewsResult.add(item);
		doReturn(getNewsResult).when(newsDao).getNews();
		return newsDao;
	}
}