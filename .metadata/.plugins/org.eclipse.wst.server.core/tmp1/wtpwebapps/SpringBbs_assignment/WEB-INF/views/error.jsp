<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<%		
	String msg = (request.getAttribute("msg") != null) ? (String)request.getAttribute("msg") : "";
	String returnUrl = (String)request.getAttribute("returnUrl");
	String error = (String)request.getAttribute("error");
%>

<script type="text/javascript">

alert("<%=error%>");
//history.back();
location.href="<%=returnUrl%>";
</script>

</body>
</html>