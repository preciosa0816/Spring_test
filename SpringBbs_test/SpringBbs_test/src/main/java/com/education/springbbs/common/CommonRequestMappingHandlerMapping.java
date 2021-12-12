package com.education.springbbs.common;

import java.lang.reflect.Method;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

public class CommonRequestMappingHandlerMapping extends RequestMappingHandlerMapping {

	
	
	
	@Override
	protected RequestMappingInfo getMappingForMethod(Method method, Class<?> handlerType) {
		// TODO Auto-generated method stub
		RequestMapping requestMapping = method.getAnnotation(RequestMapping.class);
		
		
		String[] arrUri = requestMapping.value();
		
		for(String uri: arrUri) {
			System.out.println("==============RequestMappingHandlerMapping의  uri!! ================="+uri);	
		}
		
		System.out.println("==============RequestMappingHandlerMapping의 getMappingForMethod call!! ================="+method.getName());
		return super.getMappingForMethod(method, handlerType);
	}


}
