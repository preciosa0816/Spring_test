<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>
<%@include file="../includes/header.jsp"%>
 <script>
$(document).ready(function(e) {
	var check=null;
	<sec:authorize access="isAuthenticated()">
	check='<sec:authentication property="principal.username"/>';
	</sec:authorize>
	$("#forms").on("click", function(e){
		if(!check){
			alert("로그인이 필요합니다.");
			return false;
			
		}
		
	});
});


</script>
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">희망도서 신청</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            	희망도서 신청가이드 
                        </div>
                        <div>
                        <div><a style="background-color: lightblue; color:white; font-size:15px; float:left; margin-left:7px; border:1px solid lightblue;">이용안내</a></div>
                        <div><a id='forms' href='/wish/forms' style="font-size:15px; float:left; margin-left:7px;  border:1px solid lightblue;">신청</a></div>
                        </div>
                        <hr>
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-lg-6">
                               
                                    <img src='/resources/img/BookApp_guide.png'>
                                </div>
                                <!-- /.col-lg-6 (nested) -->
                            </div>
                            <!-- /.row (nested) -->
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
       <%@include file="../includes/footer.jsp"%>