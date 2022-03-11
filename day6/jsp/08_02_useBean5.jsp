<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
<title>Action Tag</title>
</head>
<body>

	<jsp:useBean id="memberBean" class="com.dto.MemberBean" />
<%-- 	<%@page import ="com.dto.MemberBean" %> --%>
<%-- 	<% MemberBean memberBean =new MemberBean %> --%>
	<!-- property: 멤버 변수명을 의미함. -->
	<jsp:setProperty name="memberBean" property="id" value="2" />
<%-- 	<% memberBean.setId(2) %> --%>
	
	<%="아이디: " + memberBean.getId()%><br>
	이름 : <jsp:getProperty name="memberBean" property="name" /><br>
		<%-- 	<% memberBean.getName() %> --%>
</body>
</html>
