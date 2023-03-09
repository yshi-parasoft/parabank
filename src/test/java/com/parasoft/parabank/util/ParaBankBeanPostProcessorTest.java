/**
 * 
 */
package com.parasoft.parabank.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

/**
 * Parasoft Jtest UTA: Test class for ParaBankBeanPostProcessor
 *
 * @see com.parasoft.parabank.util.ParaBankBeanPostProcessor
 * @author devtest
 */
public class ParaBankBeanPostProcessorTest {

	/**
	 * Parasoft Jtest UTA: Test for forceResolver(List)
	 *
	 * @see com.parasoft.parabank.util.ParaBankBeanPostProcessor#forceResolver(List)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testForceResolver() throws Throwable {
		// Given
		ParaBankBeanPostProcessor underTest = new ParaBankBeanPostProcessor();
		SessionParamArgumentResolver aResolver = mock(SessionParamArgumentResolver.class);
		underTest.setResolver(aResolver);

		// When
		List<HandlerMethodArgumentResolver> resolvers = new ArrayList<HandlerMethodArgumentResolver>(); // UTA: default value
		underTest.forceResolver(resolvers);

		// Then - assertions for argument 1 of method forceResolver(List)
		assertNotNull(resolvers);
		assertEquals(1, resolvers.size());

	}

	/**
	 * Parasoft Jtest UTA: Test for forceResolver(List)
	 *
	 * @see com.parasoft.parabank.util.ParaBankBeanPostProcessor#forceResolver(List)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testForceResolver2() throws Throwable {
		// Given
		ParaBankBeanPostProcessor underTest = new ParaBankBeanPostProcessor();

		// When
		List<HandlerMethodArgumentResolver> resolvers = new ArrayList<HandlerMethodArgumentResolver>(); // UTA: default value
		underTest.forceResolver(resolvers);

		// Then - assertions for argument 1 of method forceResolver(List)
		assertNotNull(resolvers);
		assertEquals(1, resolvers.size());

	}

	/**
	 * Parasoft Jtest UTA: Test for forceResolver(List)
	 *
	 * @see com.parasoft.parabank.util.ParaBankBeanPostProcessor#forceResolver(List)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testForceResolver3() throws Throwable {
		// Given
		ParaBankBeanPostProcessor underTest = new ParaBankBeanPostProcessor();
		SessionParamArgumentResolver aResolver = mock(SessionParamArgumentResolver.class);
		underTest.setResolver(aResolver);

		// When
		List<HandlerMethodArgumentResolver> resolvers = new ArrayList<HandlerMethodArgumentResolver>(); // UTA: default value
		HandlerMethodArgumentResolver item = mockHandlerMethodArgumentResolver();
		resolvers.add(item);
		underTest.forceResolver(resolvers);

		// Then - assertions for argument 1 of method forceResolver(List)
		assertNotNull(resolvers);
		assertEquals(2, resolvers.size());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of HandlerMethodArgumentResolver
	 */
	private static HandlerMethodArgumentResolver mockHandlerMethodArgumentResolver() throws Throwable {
		HandlerMethodArgumentResolver item = mock(HandlerMethodArgumentResolver.class);
		return item;
	}

	/**
	 * Parasoft Jtest UTA: Test for postProcessAfterInitialization(Object, String)
	 *
	 * @see com.parasoft.parabank.util.ParaBankBeanPostProcessor#postProcessAfterInitialization(Object, String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testPostProcessAfterInitialization() throws Throwable {
		// Given
		ParaBankBeanPostProcessor underTest = new ParaBankBeanPostProcessor();

		// When
		Object aParamObject = null; // UTA: provided value
		String aParamString = "aParamString"; // UTA: default value
		Object result = underTest.postProcessAfterInitialization(aParamObject, aParamString);

		// Then - assertions for result of method postProcessAfterInitialization(Object, String)
		assertNull(result);

	}

	/**
	 * Parasoft Jtest UTA: Test for postProcessAfterInitialization(Object, String)
	 *
	 * @see com.parasoft.parabank.util.ParaBankBeanPostProcessor#postProcessAfterInitialization(Object, String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testPostProcessAfterInitialization2() throws Throwable {
		// Given
		ParaBankBeanPostProcessor underTest = new ParaBankBeanPostProcessor();

		// When
		RequestMappingHandlerAdapter aParamObject = mock(RequestMappingHandlerAdapter.class);
		String aParamString = "aParamString"; // UTA: default value
		Object result = underTest.postProcessAfterInitialization(aParamObject, aParamString);

		// Then - assertions for result of method postProcessAfterInitialization(Object, String)
		assertNotNull(result);

	}

	/**
	 * Parasoft Jtest UTA: Test for postProcessBeforeInitialization(Object, String)
	 *
	 * @see com.parasoft.parabank.util.ParaBankBeanPostProcessor#postProcessBeforeInitialization(Object, String)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testPostProcessBeforeInitialization() throws Throwable {
		// Given
		ParaBankBeanPostProcessor underTest = new ParaBankBeanPostProcessor();

		// When
		Object aParamObject = new Object(); // UTA: default value
		String aParamString = "aParamString"; // UTA: default value
		Object result = underTest.postProcessBeforeInitialization(aParamObject, aParamString);

		// Then - assertions for result of method postProcessBeforeInitialization(Object, String)
		assertNotNull(result);

	}

}