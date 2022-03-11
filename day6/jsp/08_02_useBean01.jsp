<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
<title>Action Tag</title>
</head>
<body>
	<jsp:useBean id="date" class="java.util.Date" />
<%-- 	<%@ page import="java.util.Date" %>
	<%
	Date date=new Date ();
	
	%> --%>
	<p><% out.print("오늘의 날짜 및 시각");%>	
	<p><%=date.toLocaleString()%><br><br>
	<hr>
	
	<jsp:useBean id="memberBean" class="com.dto.MemberBean" />
<%-- 	<%@ import ="com.dto.MemberBean" %>
	<% MemberBean memberBean= new MemberBean  %> --%>
	<%
		memberBean.setId(1);
		memberBean.setName("김효진");
		out.print("아이디: "+memberBean.getId()+"<br>");
		out.print("이름: " +memberBean.getName());
	%>
</body>
</html>
