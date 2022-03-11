<%@ page contentType="text/html; charset=utf-8"%>
<!Doctype html>
<html>
<head>
<title>Action Tag</title>
</head>
<body>
	<h2>이 파일은 first.jsp입니다.</h2>
	<p>======first.jsp페이지의 시작부분입니다. =========</p>
	<jsp:forward page="08_01_second.jsp" /><!-- first.jsp 가 아닌 second.jsp 의 실행 결과가 브라우저에 나타난다 forward 방식 : url 바뀌지 않는다 -->
	<!-- redirecting 방식 : url 주소 바뀜 파라미터 전송 안함  -->
<%-- 	<jsp:include page="08_01_second.jsp" /> --%><!-- action tag : 이 태그를 만나면 실행 -->
<%-- 	<%@ include file="08_01_second.jsp"%> --%><!-- 파일을 먼저 이 jsp 파일에 포함 시킨 후 에 실행 -->
	<p>======first.jsp페이지의 끝입니다. =========</p>
</body>
</html>