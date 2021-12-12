<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- all or member or admin -->
	<h1>/sample/all page</h1>

	<!-- 익명의 사용자인 경우(로그인을 하지 않은 경우 포함) -->
	<sec:authorize access="isAnonymous()">
		<a href="/customLogin">로그인</a> 	<!-- 로그인을 표시함. 클릭시 로그인처리(commonController) -->
	</sec:authorize>
	<!-- 인증된 사용자인경우 -->


	<sec:authorize access="isAuthenticated()">
		<a href="/customLogout">로그아웃</a> <!-- 로그아웃을 표시함. 클릭시 로그아웃처리(commonController) -->
	</sec:authorize>


</body>
</html>