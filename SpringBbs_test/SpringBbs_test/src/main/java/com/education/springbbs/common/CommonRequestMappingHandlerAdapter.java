package com.education.springbbs.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

public class CommonRequestMappingHandlerAdapter extends RequestMappingHandlerAdapter {

	@Override
	protected ModelAndView handleInternal(HttpServletRequest request, HttpServletResponse response,
			HandlerMethod handlerMethod) throws Exception {
		// TODO Auto-generated method stub
		
		
		System.out.println("=======###########==========RequestMappingHandlerAdapter의  handleInternal call!!==============="+handlerMethod.getMethod().getName());
		
		return super.handleInternal(request, response, handlerMethod);
	}


	
	
	

}
