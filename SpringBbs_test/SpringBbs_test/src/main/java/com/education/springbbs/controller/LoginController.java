package com.education.springbbs.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.education.springbbs.dto.user.UserDto;

@Controller
@RequestMapping("/login/*")
public class LoginController {
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@RequestMapping("login.action")
	public String login(Model model, HttpServletRequest request,HttpServletResponse response,	HttpSession session	) throws Exception{
		//db에서 해당 값을 읽어왔다고 가정.
		String dbId = "silee";
		String dbPw = "1234";
		String name = "이상일";
		
		String id = (String)request.getParameter("id");
		String pw = (String)request.getParameter("password");
		String cookieCheck = (String)request.getParameter("exCK");
		
		//System.out.println("exCK===============>>>"+request.getParameter("exCK"));

		System.out.println("=========== controller login 실행===============>>>");
		
		
		
		Cookie cookie = null;
		if(cookieCheck !=null && cookieCheck.trim().equals("on")) {			
			cookie = new Cookie("id", id);
			cookie.setMaxAge(60*60*24);
			response.addCookie(cookie);
		} else {
			cookie = new Cookie("id", null);
			cookie.setMaxAge(0);
			response.addCookie(cookie);
		}
		
		//사용자가 존재 하는게 확인 되면 세션을 생성 후 게시판 페이지로 이동 시킨다.
		if(dbId.equals(id) && dbPw.equals(pw)){
			HttpSession session1 = request.getSession(true);
			
			UserDto user = new UserDto();
			
			user.setLogin_id(id);
			user.setName(name);
			//user.setPassword(pw);
			
			session1.setAttribute("isLogin", "Y");
			session1.setAttribute("login", user);
			
			return "redirect:/board/list.action?pg=1";
		}
		
		

		return "/login/login";
	}
	
	
	@RequestMapping(value="/logout")
	public String logout(Model model,
			HttpServletRequest request,
			HttpServletResponse response
			) throws Exception{

			HttpSession session = request.getSession(false);
			
			
			if(session != null && "Y".equals((String) session.getAttribute("isLogin")) ){
				session.invalidate();
			}
		
		

		return "login/login";
	}
}
