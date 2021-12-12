<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/header.jsp" %>
<script>
	$(document).ready(function(){
		
		alert("제이쿼리 로딩 완료 write");
		
	});
</script>

<div  align="center" class="container">
<form action="/board/write.do" method="post">

<table border="1">
	<caption>게시판 글쓰기</caption>
	<tr>
		<th>이름</th>
		<td><input type="text" name="name" /></td>
	</tr>
	<tr>
		<th>제목</th>
		<td><input type="text" name="title" /></td>
	</tr>
	<tr>
		<th>비밀번호</th>
		<td><input type="password" name="password" /></td>
	</tr>
	<tr>
		<th>내용</th>
		<td><textarea name="content" cols="40" rows="5"></textarea></td>
	</tr>
	<tr>
		<td colspan="2">
			<input type="submit" value="글쓰기" />
		</td>
	</tr>
</table>
</form>
</div>
</body>
</html>
