<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
<title>Security</title>
</head>
<body>
	<form name="loginForm" action="j_security_check" method="post">
		<p>	사용자명: <input type="text" name="j_username">
		<p>	비밀번호 : <input type="password" name="j_password">
		<p>	<input type="submit" value="전송">
	</form>
</body>
</html>
<!-- 인증방식을 form tag 로 설정햇을 때-> 
action =j_security_check  이런 형식으로 해주어야 한다.
	<input type="text" name="j_username">
	<input type="password" name="j_password"> 라고 설정해 주는 것이 문법이다
	
	시큐리티 설정
-->