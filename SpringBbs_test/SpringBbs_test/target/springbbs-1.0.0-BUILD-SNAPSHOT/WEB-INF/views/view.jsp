<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="/WEB-INF/views/common/header.jsp" %>
<script>
	/* $(document).ready(function(){
		
		fnCommentSave = function(){
			
			var param = {
				comment: $("#comment").val()
			};
			
			$.ajax({
				type : "post",
				url : "/comment/write.action",
				data: param,
				dataType: "json",
				success : function(data){
					if(data != null && data.length > 0){
						
						var html = "";
						
						for (var i = 0; i < data.length; i++) {
							html += "<li>"+data[i].COMMENT_CONTENT+"</li>";
						}
						
						$("#comment_list").html(html);
					}
				},
				error : function(e){
					console.log(e)
				}
			});
		}
	}); */
</script>
<div  align="center" class="container">

<form action="/board/write.action" method="post">
	<table border="1">
	<caption>게시판 상세보기</caption>
		<tr>
			<td    style="width: 100px;">번호</td>
			<td>${boardDto.num}</td>
		</tr>
		<tr>
			<td>이름</td>
			<td><input name="name" value="${boardDto.name}"></td>
		</tr>
		<tr>
			<td>제목</td>
			<td><input name="name" value="${boardDto.title}"></td>
		</tr>
		<tr>
			<td>날짜</td>
			<td>${boardDto.writeday}</td>
		</tr>
		<tr>
			<td>조회수</td>
			<td>${boardDto.readcount}</td>
		</tr>
		<tr>
			<td>내용</td>
			<td><input name="name" value="${boardDto.content}"></td>
		</tr>
	</table><br/>
</form>	
	
	
	<a href="list.action">리스트</a> |
	<a href="updateForm.action?num=${boardDto.num}">수정</a> |
	<a href="deleteForm.action?num=${boardDto.num}">삭제</a>

</div>
<%@ include file="/WEB-INF/views/common/footer.jsp" %>
