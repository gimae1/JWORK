<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
<title>Action Tag</title>
</head>
<body>
	<%-- <jsp:useBean id="person" class="com.dto.Person" /> --%>
	<jsp:useBean id="person" class="com.dto.Person" scope="request" /><!-- scope : defalut 값  = reqeust -->
	<%-- 	<%@page import="com.dto.Person" %>
	<%
	Person person =new Person();
	%> --%>
	<p>	아이디 : <%=person.getId()%>
	<p>	이 름 : <%=person.getName()%>
</body>
</html>