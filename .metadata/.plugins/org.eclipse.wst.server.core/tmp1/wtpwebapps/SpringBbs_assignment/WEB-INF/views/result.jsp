<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<%		
	String msg = (request.getAttribute("msg") != null) ? (String)request.getAttribute("msg") : "";
	String returnUrl = (String)request.getAttribute("returnUrl");
	String error = (String)request.getAttribute("error");
%>
<body>
<script type="text/javascript">
alert("<%=msg%>");
location.href="<%=returnUrl%>";
</script>
</body>
</html>