/**
 * 
 */
package com.parasoft.parabank.domain.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.parasoft.parabank.domain.News;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for NewsUtil
 *
 * @see com.parasoft.parabank.domain.util.NewsUtil
 * @author devtest
 */
public class NewsUtilTest {

	/**
	 * Parasoft Jtest UTA: Test for createNewsMap(News[])
	 *
	 * @see com.parasoft.parabank.domain.util.NewsUtil#createNewsMap(News[])
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testCreateNewsMap() throws Throwable {
		// When
		News[] news = new com.parasoft.parabank.domain.News[0]; // UTA: default value
		Map<Date, List<News>> result = NewsUtil.createNewsMap(news);

		// Then - assertions for result of method createNewsMap(News[])
		assertNotNull(result);
		assertEquals(0, result.size());

	}

	/**
	 * Parasoft Jtest UTA: Test for createNewsMap(List)
	 *
	 * @see com.parasoft.parabank.domain.util.NewsUtil#createNewsMap(List)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testCreateNewsMap2() throws Throwable {
		// When
		List<News> news = new ArrayList<News>(); // UTA: default value
		Map<Date, List<News>> result = NewsUtil.createNewsMap(news);

		// Then - assertions for result of method createNewsMap(List)
		assertNotNull(result);
		assertEquals(0, result.size());

	}

	/**
	 * Parasoft Jtest UTA: Test for createNewsMap(List)
	 *
	 * @see com.parasoft.parabank.domain.util.NewsUtil#createNewsMap(List)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testCreateNewsMap3() throws Throwable {
		// When
		List<News> news = new ArrayList<News>(); // UTA: default value
		News item = mock(News.class);
		news.add(item);
		Map<Date, List<News>> result = NewsUtil.createNewsMap(news);

		// Then - assertions for result of method createNewsMap(List)
		assertNotNull(result);
		assertEquals(1, result.size());

	}

}