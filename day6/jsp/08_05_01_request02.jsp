<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
<title>Implicit Objects</title>
</head>
<body>
	<form action="08_05_01_request02_process.jsp" method="post">
		<p>	아 이 디 : <input type="text" name="id">
		<p>	이름 : <input type="text" name="name">
		<!-- <p>	이름 : <input type="text" name="user_name"> -->
		<p>취미</p>
		<input type="checkbox" name="hobby" value="영화">영화
		<input type="checkbox" name="hobby" value="독서">독서
		<input type="checkbox" name="hobby" value="여행">여행
		
		<p>	<input type="submit" value="전송" />
	</form>
</body>
</html>