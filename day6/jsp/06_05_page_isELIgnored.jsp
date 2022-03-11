<%@ page contentType="text/html; charset=utf-8"%>
<%-- <%@ page isELIgnored="true"%> 지시 속성--%>
<html>
<head>
<title>Directives Tag</title>
</head>
<body>
	<%
		request.setAttribute("RequestAttribute", "request 내장 객체");
	%>
	<%
	String s = (String)	request.getAttribute("RequestAttribute");
	%>
	
	${requestScope.RequestAttribute}
</body>
</html>