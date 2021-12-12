package com.education.springbbs.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.education.springbbs.dto.user.UserDto;

public class LoginInterceptor extends HandlerInterceptorAdapter {

	
	// preHandle() : 컨트롤러보다 먼저 수행되는 메서드
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		
		 HttpSession session = request.getSession();
		 UserDto user =  (UserDto)session.getAttribute("login");
		 
		
		 if ( user == null ){
	            // 로그인이 안되어 있는 상태임으로 로그인 폼으로 다시 돌려보냄(redirect)
	            response.sendRedirect("/login/login.action");
	            return false; // 더이상 컨트롤러 요청으로 가지 않도록 false로 반환함
	        }	          
	        // preHandle의 return은 컨트롤러 요청 uri로 가도 되냐 안되냐를 허가하는 의미임
	        // 따라서 true로하면 컨트롤러 uri로 가게 됨.
		 System.out.println("=============preHandle 실행 ====================");
		     System.out.println("로그인 완료 상태 ==> name : "+user.getName());
	        return true;
	}

	 // 컨트롤러가 수행되고 화면이 보여지기 직전에 수행되는 메서드
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		super.postHandle(request, response, handler, modelAndView);
		
		System.out.println("=============postHandle 실행 ====================");
	}

	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("=============afterCompletion 실행 ====================");
		super.afterCompletion(request, response, handler, ex);
	}

	@Override
	public void afterConcurrentHandlingStarted(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("=============afterConcurrentHandlingStarted 실행 ====================");
		super.afterConcurrentHandlingStarted(request, response, handler);
	}
	
	

}
