package com.wu.controller;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.wu.domain.User;

public class MyInterceptor implements HandlerInterceptor{
	
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
//		System.out.println("¿π‘ÿ«Î«Û");
//		String method = request.getMethod();
//		System.out.println("method=="+method);
//		
//		String contextPath = request.getContextPath();
//		System.out.println("contextPath=="+contextPath);
//		
		String requestURI = request.getRequestURI();
//		System.out.println("requestURI=="+requestURI);
//		
		User use = (User)request.getSession().getAttribute("use");
//		System.out.println("use1==="+use);
		
		if(requestURI.indexOf("/login/search") > 0){
			return true;
		}
		if(use != null){
			return true;
		}else{
//			request.getRequestDispatcher("/login.html").forward(request, response);
			response.sendRedirect("/SSMBlog/login.html");
			return false;
		}
		
	}
	
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			@Nullable ModelAndView modelAndView) throws Exception {
//		System.out.println("¿π‘ÿœÏ”¶");
	}
	
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
			@Nullable Exception ex) throws Exception {
//		System.out.println("“≥√Ê‰÷»æÕÍ≥…∫Û¿πΩÿ");
	}
}
