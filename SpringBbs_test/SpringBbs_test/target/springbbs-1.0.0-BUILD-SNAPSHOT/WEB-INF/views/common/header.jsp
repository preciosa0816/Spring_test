<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
	<link rel="stylesheet" href="/common/css/common.css" type="text/css" />
	<script src="/common/js/jquery-1.12.0.min.js"> </script>
</head>
<%	//세션 정보 가져온다.


boolean isLogin = false;
	if(session != null && "Y".equals(session.getAttribute("isLogin"))){
		isLogin = true;
	}

%>
<body>
		<script type="text/javascript">

		/**
		
			1.id html input 테그에 내용 입력시 영문만 입력 하도록 한다.
			2.id 또는 password 필드에 "" (공백) 값이 들어가면 값을 입력하라는 경고창 출력한다.
			  2.2 id input html 테그에 "" 시 다음과 같이 출력 alert("아이디를 입력해 주시기 바랍니다.");
			  2.3 password input html 테그에 "" 시 다음과 같이 출력 alert("비밀번호를 입력해 주시기 바랍니다.");
			3.각 필드에 값이 입력 되면 userInfo 객체를 참고 하여 id,password 입력값하고 같으면 login() 함수 호출. 아니라면 alert("아이디,패스워드가 틀립니다"); 경고창 출력
			4.로그인 함수 호출 하면 로그인이 완료된 화면이 보여지게 되는데 div id 가 context인 항목에 장진철 님이 로그인 하셧습니다. 라고 출력 한다. 
		*/
		
		
		function logout(){
			location.href="/login/logout.action";
		}

		</script>
<%=isLogin %>


<div class="fixed-header">
	<div>
		<%
			if(isLogin){
		%>
			회원님이 로그인 하셧습니다.<input type="button" value="로그아웃" onclick="logout()"/>
		
		<%
			}else{
		%>
				<a href="/login/login.action" >로그인</a>		
		<%
			}
		%>
	</div>
	<br><br>
	여기에 보통 쇼핑몰 카테고리 메뉴나 회원 로그인 버튼 같은게 나옵니다.
</div>

<!-- <div  align="center"  style=" border: 2px solid; text-align: center; padding: 20px"> -->
<div>"