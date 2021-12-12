package com.education.springbbs.util;

import java.io.Writer;
import java.util.Locale;

import javax.servlet.http.HttpServletResponse;

import org.springframework.context.MessageSource;
import org.springframework.validation.BindingResult;

public class Util {

  public static String getValidateMsg(MessageSource messageSource,BindingResult bindingResult,boolean codeFlag){
		
		String propertiesKey = bindingResult.getFieldError().getCode()+"."+bindingResult.getFieldError().getField();
		String result ="";
		if(codeFlag ==true)
			result = bindingResult.getFieldError().getField();
		else{
			result =result +" : "+ messageSource.getMessage(propertiesKey,null,Locale.getDefault());
		}
		
		return result;
	}
	
	public static String getValidateMsg(MessageSource messageSource,BindingResult bindingResult){
		
		String propertiesKey = bindingResult.getFieldError().getCode()+"."+bindingResult.getFieldError().getField();
	
		return  messageSource.getMessage(propertiesKey,null,Locale.getDefault());
	}
	
	public static boolean isNull(Object param){
		if(param == null){
			return true;
		}
		
		return false;
	}
	
	
   public static void write(HttpServletResponse response, String str) throws Exception {

        response.setContentType("text/html; charset=utf-8");
        response.setCharacterEncoding("UTF-8");

        Writer writer = null;

        try {
            writer = response.getWriter();
            writer.write(str);
        } finally {
            try {
                writer.close();
            } catch (Exception e) {
            }
        }
    }
}
