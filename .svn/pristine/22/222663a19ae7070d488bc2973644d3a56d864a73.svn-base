package com.cssl.web;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.cssl.service.UsersService;


@WebFilter(urlPatterns="/*")
public class MyFilter implements Filter{
		
	private UsersService service;
	

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		ServletContext application = filterConfig.getServletContext();
		//获得spring的IoC容器
		ApplicationContext ctx=WebApplicationContextUtils.getWebApplicationContext(application);
		service = ctx.getBean(UsersService.class);
		System.out.println("init:"+service);
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		
		System.out.println("============doFilter:"+service);
		arg2.doFilter(arg0, arg1);
		System.out.println("============doFilter:after");
	}

	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		Filter.super.destroy();
	}

}
