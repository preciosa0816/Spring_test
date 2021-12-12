<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="/WEB-INF/views/common/header.jsp" %>
<script>

<%
	Cookie[] cookies = request.getCookies();
	String id = "";
	if(cookies != null) {
		for(Cookie c : cookies) {
			if(c.getName().trim().equals("id")) {
				id= c.getValue();
			}
		}
	}

%>

function login(){
	var input_id = document.getElementById("id");
	var input_pass = document.getElementById("password");
	
	input_id.restrict = "A-Z a-z";

	if(input_id.value == ""){
		alert("아이디를 입력해 주시기 바랍니다.");
		return ;
	}

	if(input_pass.value ==""){
		alert("비밀번호를 입력해 주시기 바랍니다.");
		return ;
	}
	
	$("#loginForm").submit();

}

function fn_press_han(obj){
	if(event.keyCode == 8 || event.keyCode == 9 || event.keyCode == 37 || event.keyCode == 39
	|| event.keyCode == 46) return;
	obj.value = obj.value.replace(/[\ㄱ-ㅎ ㅏ-ㅣ 가-힣 0-9]/g, '');
}

</script>

	<!-- 	onclick onkeydown onkeyup   -->
	
		<div class="container">
		<form id="loginForm" action="/login/login.action" method="post">
			<div class="login_input">	
			로기인 하기<br>
				<input type="text" id="id" name="id" value="<%=id%>"  onkeydown="fn_press_han(this);" "/><br>
				<input type="password" id="password" name="password"  />
			
				<div class="ck">
					<input type="checkbox" name="exCK" id="exCK" <% if(id.length() > 1) out.println("checked"); %> />ID 저장(이것은 쿠키로 구현...)<br>
				</div>
				<input type="button" id="exBtn" value="로그인" onclick="login()" />
			</div>
			</form>
		</div>
	

<%@ include file="/WEB-INF/views/common/footer.jsp" %>
