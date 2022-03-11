<%@ page contentType="text/html; charset=utf-8"%>
<%
  String ids = request.getParameter("id")!= null ? request.getParameter("id") : "아이디없음";
%>
<html>
<head>
<title>Implicit Objects</title>
</head>
<body>
	<form action="08_05_01_request01_process.jsp" method="get">
	<!-- <form method="get"> -->
		<p>	아 이 디 : <input type="text" name="id" value="<%=ids %>"></p>
		<p>	비밀번호 : <input type="password" name="passwd"></p>
		<input type="submit" value="전송" />
	</form>
</body>
</html>