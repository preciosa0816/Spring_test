<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@include file="../includes/header.jsp"%>

<!-- 목록페이지에서 링크를 통해 GET 방식으로 특정한 번호의 게시물을 조회할 수 있는 기능 작성
	게시물 번호를 보여줄 수 있는 필드를 추가하고 모든 데이터는 readonly를 지정해서 작성. 수정/삭제 버튼 추가 -->
<script type="text/javascript">
	//수정 버튼을 누른다면 bno값을 같이 전달하고 list로 이동하는 경우 bno태그를 지우고 리스트페이지로 이동.
		$(document).ready(function(){
			var operForm=$("#operForm");
			$("button[data-oper='modify']").on("click", function(e){
				operForm.attr("action","/board/modify").submit();	
				});
			$("button[data-oper='list']").on("click",function(e){
				operForm.find("#bno").remove();
				operForm.attr("action","/board/list");
				operForm.submit();
			});
		});	
	</script>

<div class="row">
	<div class="col-lg-12">
		<h1 class="page-header">Board Read</h1>
	</div>
	<!-- /.col-lg-12 -->
</div>
<!-- /.row -->
<div class="row">
	<div class="col-lg-12">
		<div class="panel panel-default">
			<div class="panel-heading">Board Read Page</div>
			<!-- /.panel-heading -->
			<div class="panel-body">


				<div class="form-group">
					<label>Bno</label> <input class="form-control" name="bno"
						value='<c:out value="${board.bno}"/>' readonly="readonly">
				</div>

				<div class="form-group">
					<label>Title</label> <input class="form-control" name="title"
						value='<c:out value="${board.title}"/>' readonly="readonly">
				</div>

				<div class="form-group">
					<label>Text area</label>
					<textArea class="form-control" rows="3" name='content'
						readonly="readonly"><c:out value="${board.content}" />
				</textArea>
				</div>

				<div class="form-group">
					<label>Writer</label> <input class="form-control" name="writer"
						value='<c:out value="${board.writer}"/>' readonly="readonly">
				</div>


				<button data-oper='modify' class="btn btn-default"
					onclick='location.href="/board/modify?bno=<c:out value='${board.bno}'/>"'>
					Modify</button>
				<button data-oper='list' class="btn btn-info"
					onclick="location.href='/board/list'">List</button>

				<form id="operForm" action="/board/modify" method="get">
					<input type="hidden" id="bno" name="bno" value="<c:out value='${board.bno }'/>">
					<input type="hidden" name="pageNum" value='<c:out value="${cri.pageNum }"/>'>
					<input type="hidden" name="amount" value='<c:out value="${cri.amount }"/>'>
					<input type="hidden" name="keyword" value='<c:out value="${cri.keyword }"/>'>
					<input type="hidden" name="type" value='<c:out value="${cri.type}"/>'>
				</form>
			</div>
			<!-- /.panel-body -->
		</div>
		<!-- /.panel -->
	</div>
	<!-- /.col-lg-6 -->
</div>
<!-- /.row -->
<%@include file="../includes/footer.jsp"%>