<%@page import="com.education.springbbs.dto.board.BoardDto"%>
<%@page import="java.util.List"%>
<%@page import="com.education.springbbs.util.Util"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
	int count = !Util.isNull(request.getAttribute("count")) ? (Integer)request.getAttribute("count") : 0;
	int startRow = (request.getAttribute("startRow") != null) ? (Integer)request.getAttribute("startRow") : 0;
	int endRow = (request.getAttribute("endRow") != null) ? (Integer)request.getAttribute("endRow") : 0;
	int startPage = (request.getAttribute("startPage") != null) ? (Integer)request.getAttribute("startPage") : 0;
	int endPage = (request.getAttribute("endPage") != null) ? (Integer)request.getAttribute("endPage") : 0;
	int pg = (request.getAttribute("pg") != null) ? (Integer)request.getAttribute("pg") : 0;
	int pageCount = (request.getAttribute("pageCount") != null) ? (Integer)request.getAttribute("pageCount") : 0;
	
	List<BoardDto> list = (request.getAttribute("list")!= null) ? (List)request.getAttribute("list") : null;
%>
<%@ include file="/WEB-INF/views/common/header.jsp" %>
<script>
	$(document).ready(function(){
		
		//alert("제이쿼리 로딩 완료 list");
		
	});
</script>

<div  align="center" class="container">

		<table border="1">
			<caption>게시판 리스트</caption>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>이름</th>
				<th>날짜</th>
				<th>조회수</th>
			</tr>
			
			<%
			for(int i = 0; i< list.size() ; i++){
				BoardDto dto = list.get(i);
			%>
			<tr>
				<td><%=dto.getNum() %></td>
				<td><a href="/board/view.action?num=<%=dto.getSeq() %>"><%=dto.getTitle() %></a></td>
				<td><%=dto.getName() %></td>
				<td><%=dto.getWriteday() %></td>
				<td><%=dto.getReadcount()%></td>
			</tr>		
			<%
			}
			%>
				
		</table>
	
	<table>
		<form action="/board/list.action" method="post">
			<tr>
				<td>
				검색 : <input type="text" name="searchValue" /> 
				<select name="searchKey">
					<option value="title">제목</option>
					<option value="name">이름</option>
				</select>
				<input type="submit" value="검색" /> 
				</td>
			</tr>
		</form>
	</table>

	<table>
		<tr>
			<td>			
			<%
			if(count > 0){
				if(pg == 1){
					
			%>
				<span style="color:lightgrey">[이전블럭]</span>		
			<%
				}else if(pg > 1){
			%>
				<a href="/board/list.action?pg=${pg - 1}">[이전블럭]</a>
			<%
				} 
				
				for(int i = startPage; i<= endPage ; i++ ){
				
					if(pg==i){
			%>			
						[<%=i %>]
			<%
					}else if(pg != i ){
			%>	
						<a href="/board/list.action?pg=<%=i%>">[<%=i%>]</a>
			<%	
					}
				}
				
				if(pg == pageCount){
				
			%>
				<span style="color:lightgrey">[다음블럭]</span>
			<%	
				}else if(pg < pageCount){
					
			%>
				<a href="/board/list.action?pg=<%=pg +1 %>">[다음블럭]</a>
			<%		
				}
			}
			%>
	
			</td>
		</tr>
	</table>
	<div class="btn">
		<a href="writeForm.action">글쓰기</a>
	</div>
</div>


<%@ include file="/WEB-INF/views/common/footer.jsp" %>
