<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
<title>Action Tag</title>
</head>
<body>
	<jsp:useBean id="bean" class="com.dao.Calculator" />
<%-- 	<%@page import = "com.dao.Calculator" %>
	<% 
	Calculator bean = new Calculator
	%> --%>
	<%
		int m = bean.process(5);
		out.print("5의 3제곱 :  " + m);
	%>
</body>
</html>
