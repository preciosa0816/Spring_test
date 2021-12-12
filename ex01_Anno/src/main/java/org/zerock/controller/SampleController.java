package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller //Controller=Servlet(JSP) //Controller:Spring MVC 컨트롤러 객체임을 명시 
@RequestMapping("/sample/*")
@Log4j
public class SampleController {
	
	@RequestMapping("")
	public void basic() {
		log.info("basic.............................................");
	}
	
	@RequestMapping("/basicOnlyGet")
	public void basicGet2() {
		log.info("basicGet.............................................");
	}
}
