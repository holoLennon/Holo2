package com.holo.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.holo.Interceptor.RootInterceptor;

@Configuration
public class WebInterceptorConfig extends WebMvcConfigurerAdapter{
	
	
	/**
	 * 添加拦截器
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		String interceptorUrl="/**";
		registry.addInterceptor(new RootInterceptor()).addPathPatterns(interceptorUrl);
	}
}
