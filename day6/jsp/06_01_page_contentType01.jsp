<%@ page contentType="text/html; charset=utf-8"%>
<%-- <%@ page contentType="text/html"%> --%>
<%-- <%@ page pageEncoding="utf-8"%> --%>
<%@ page import="java.util.*" %>
<!Doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Directives Tag</title>
</head>
<body>
	<%
	Date d3 = new Date();
	%>
	오늘의 정보 : <%=d3%><br>
	오늘의 정보 : <%=d3.toLocaleString()%><br>
</body>
</html>