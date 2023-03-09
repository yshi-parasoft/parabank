/**
 * 
 */
package com.parasoft.parabank.web.controller;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

import com.parasoft.parabank.domain.News;
import com.parasoft.parabank.domain.logic.impl.NewsManagerImpl;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

/**
 * Parasoft Jtest UTA: Test class for NewsController
 *
 * @see com.parasoft.parabank.web.controller.NewsController
 * @author devtest
 */
public class NewsControllerTest {

	/**
	 * Parasoft Jtest UTA: Test for getRecent(int)
	 *
	 * @see com.parasoft.parabank.web.controller.NewsController#getRecent(int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetRecent() throws Throwable {
		// Given
		NewsController underTest = new NewsController();
		NewsManagerImpl newsManagerValue = mockNewsManagerImpl();
		ReflectionTestUtils.setField(underTest, "newsManager", newsManagerValue);

		// When
		int count = 0; // UTA: default value
		ResponseEntity<List<News>> result = underTest.getRecent(count);

		// Then - assertions for result of method getRecent(int)
		assertNotNull(result);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of NewsManagerImpl
	 */
	private static NewsManagerImpl mockNewsManagerImpl() throws Throwable {
		NewsManagerImpl newsManagerValue = mock(NewsManagerImpl.class);
		Map<Date, List<News>> getLatestNewsResult = new HashMap<Date, List<News>>(); // UTA: default value
		doReturn(getLatestNewsResult).when(newsManagerValue).getLatestNews();
		return newsManagerValue;
	}

	/**
	 * Parasoft Jtest UTA: Test for getRecent(int)
	 *
	 * @see com.parasoft.parabank.web.controller.NewsController#getRecent(int)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testGetRecent2() throws Throwable {
		// Given
		NewsController underTest = new NewsController();
		NewsManagerImpl newsManagerValue = mockNewsManagerImpl2();
		ReflectionTestUtils.setField(underTest, "newsManager", newsManagerValue);

		// When
		int count = 0; // UTA: default value
		ResponseEntity<List<News>> result = underTest.getRecent(count);

		// Then - assertions for result of method getRecent(int)
		assertNotNull(result);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of NewsManagerImpl
	 */
	private static NewsManagerImpl mockNewsManagerImpl2() throws Throwable {
		NewsManagerImpl newsManagerValue = mock(NewsManagerImpl.class);
		Map<Date, List<News>> getLatestNewsResult = new HashMap<Date, List<News>>(); // UTA: default value
		Date key = mock(Date.class);
		List<News> value = new ArrayList<News>(); // UTA: default value
		News item = mock(News.class);
		value.add(item);
		getLatestNewsResult.put(key, value);
		doReturn(getLatestNewsResult).when(newsManagerValue).getLatestNews();
		return newsManagerValue;
	}

	/**
	 * Parasoft Jtest UTA: Test for handleRequest(Model)
	 *
	 * @see com.parasoft.parabank.web.controller.NewsController#handleRequest(Model)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testHandleRequest() throws Throwable {
		// Given
		NewsController underTest = new NewsController();
		NewsManagerImpl newsManagerValue = mockNewsManagerImpl3();
		ReflectionTestUtils.setField(underTest, "newsManager", newsManagerValue);

		// When
		Model model = mockModel();
		ModelAndView result = underTest.handleRequest(model);

		// Then - assertions for result of method handleRequest(Model)
		assertNotNull(result);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of NewsManagerImpl
	 */
	private static NewsManagerImpl mockNewsManagerImpl3() throws Throwable {
		NewsManagerImpl newsManagerValue = mock(NewsManagerImpl.class);
		Map<Date, List<News>> getNewsResult = new HashMap<Date, List<News>>(); // UTA: default value
		Date key = mock(Date.class);
		List<News> value = new ArrayList<News>(); // UTA: default value
		News item = mock(News.class);
		value.add(item);
		getNewsResult.put(key, value);
		doReturn(getNewsResult).when(newsManagerValue).getNews();
		return newsManagerValue;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of Model
	 */
	private static Model mockModel() throws Throwable {
		Model model = mock(Model.class);
		Map<String, Object> asMapResult = new HashMap<String, Object>(); // UTA: default value
		String key2 = "key2"; // UTA: default value
		Object value2 = new Object(); // UTA: default value
		asMapResult.put(key2, value2);
		doReturn(asMapResult).when(model).asMap();
		return model;
	}
}