package com.cssl.web;

import java.util.List;

import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.cssl.interceptor.MyInterceptor;

/**
 * WebMVC开发的自动配置类
 * @author tym
 *
 */
@Component
public class MyWebConfiger implements WebMvcConfigurer {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		registry.addInterceptor(new MyInterceptor())
				.addPathPatterns("/**")
				.excludePathPatterns("/image/**");
	}

	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.configureMessageConverters(converters);
	}

	
	
}
