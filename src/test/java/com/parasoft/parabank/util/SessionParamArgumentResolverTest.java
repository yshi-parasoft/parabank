/**
 * 
 */
package com.parasoft.parabank.util;

import static org.junit.Assert.assertFalse;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.lang.annotation.Annotation;
import javax.servlet.http.HttpServletRequest;
import org.junit.Test;
import org.springframework.core.MethodParameter;
import org.springframework.web.HttpSessionRequiredException;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.ModelAndViewContainer;

/**
 * Parasoft Jtest UTA: Test class for SessionParamArgumentResolver
 *
 * @see com.parasoft.parabank.util.SessionParamArgumentResolver
 * @author devtest
 */
public class SessionParamArgumentResolverTest {

	/**
	 * Parasoft Jtest UTA: Test for extractSessionParameter(MethodParameter, NativeWebRequest)
	 *
	 * @see com.parasoft.parabank.util.SessionParamArgumentResolver#extractSessionParameter(MethodParameter, NativeWebRequest)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = HttpSessionRequiredException.class)
	public void testExtractSessionParameter() throws Throwable {
		// Given
		SessionParamArgumentResolver underTest = new SessionParamArgumentResolver();

		// When
		MethodParameter aParameter = mockMethodParameter();
		NativeWebRequest aWebRequest = mockNativeWebRequest();
		underTest.extractSessionParameter(aParameter, aWebRequest);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of MethodParameter
	 */
	private static MethodParameter mockMethodParameter() throws Throwable {
		MethodParameter aParameter = mock(MethodParameter.class);
		Annotation getParameterAnnotationResult = mock(Annotation.class);
		doReturn(getParameterAnnotationResult).when(aParameter).getParameterAnnotation((Class) any());

		Class getParameterTypeResult = Class.forName("java.lang.Object"); // UTA: default value
		doReturn(getParameterTypeResult).when(aParameter).getParameterType();
		return aParameter;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of NativeWebRequest
	 */
	private static NativeWebRequest mockNativeWebRequest() throws Throwable {
		NativeWebRequest aWebRequest = mock(NativeWebRequest.class);
		HttpServletRequest getNativeRequestResult = mock(HttpServletRequest.class);
		when(aWebRequest.getNativeRequest()).thenReturn(getNativeRequestResult);
		return aWebRequest;
	}

	/**
	 * Parasoft Jtest UTA: Test for resolveArgument(MethodParameter, ModelAndViewContainer, NativeWebRequest, WebDataBinderFactory)
	 *
	 * @see com.parasoft.parabank.util.SessionParamArgumentResolver#resolveArgument(MethodParameter, ModelAndViewContainer, NativeWebRequest, WebDataBinderFactory)
	 * @author devtest
	 */
	@Test(timeout = 10000, expected = HttpSessionRequiredException.class)
	public void testResolveArgument() throws Throwable {
		// Given
		SessionParamArgumentResolver underTest = new SessionParamArgumentResolver();

		// When
		MethodParameter aParameter = mockMethodParameter2();
		ModelAndViewContainer aMavContainer = mock(ModelAndViewContainer.class);
		NativeWebRequest aWebRequest = mockNativeWebRequest2();
		WebDataBinderFactory aBinderFactory = mock(WebDataBinderFactory.class);
		underTest.resolveArgument(aParameter, aMavContainer, aWebRequest, aBinderFactory);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of MethodParameter
	 */
	private static MethodParameter mockMethodParameter2() throws Throwable {
		MethodParameter aParameter = mock(MethodParameter.class);
		Annotation getParameterAnnotationResult = mock(Annotation.class);
		doReturn(getParameterAnnotationResult).when(aParameter).getParameterAnnotation((Class) any());

		Class getParameterTypeResult = Class.forName("java.lang.Object"); // UTA: default value
		doReturn(getParameterTypeResult).when(aParameter).getParameterType();
		return aParameter;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of NativeWebRequest
	 */
	private static NativeWebRequest mockNativeWebRequest2() throws Throwable {
		NativeWebRequest aWebRequest = mock(NativeWebRequest.class);
		HttpServletRequest getNativeRequestResult = mock(HttpServletRequest.class);
		when(aWebRequest.getNativeRequest()).thenReturn(getNativeRequestResult);
		return aWebRequest;
	}

	/**
	 * Parasoft Jtest UTA: Test for supportsParameter(MethodParameter)
	 *
	 * @see com.parasoft.parabank.util.SessionParamArgumentResolver#supportsParameter(MethodParameter)
	 * @author devtest
	 */
	@Test(timeout = 10000)
	public void testSupportsParameter() throws Throwable {
		// Given
		SessionParamArgumentResolver underTest = new SessionParamArgumentResolver();

		// When
		MethodParameter aParameter = mock(MethodParameter.class);
		boolean result = underTest.supportsParameter(aParameter);

		// Then - assertions for result of method supportsParameter(MethodParameter)
		assertFalse(result);

	}
}