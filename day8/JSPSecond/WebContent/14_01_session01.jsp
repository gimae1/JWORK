<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
<title>Session</title>
</head>
<body>
	<form action="14_01_session01_process.jsp" method="POST">
	<!-- 세션 만료 시점은 브라우저가 종료되는 때 까지(설정된 시간 끝까지) -->
		<p>	아 이 디 : <input type="text" name="id">
		<p>	비밀번호 : <input type="text" name="passwd">
		<p>	<input type="submit" value="전송">
	</form>
</body>
</html>