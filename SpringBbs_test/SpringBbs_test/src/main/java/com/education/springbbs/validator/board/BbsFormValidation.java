package com.education.springbbs.validator.board;

import javax.annotation.Resource;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.education.springbbs.dto.board.BoardDto;

@Component
public class BbsFormValidation implements Validator {

	@Resource
	public MessageSource messageSource;
	
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return BoardDto.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {		
				
		BoardDto bean = (BoardDto)target;
		
		if("".equals(bean.getTitle())){
			errors.rejectValue("title", "error.required");
		}else	if("".equals(bean.getContent())){
			errors.rejectValue("content", "error.required");
		}else	if("".equals(bean.getPassword())){
			errors.rejectValue("password", "error.required");
		}
		
	}


}
