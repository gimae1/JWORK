<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!-- prefix : vendor prefix 주요 웹 브라우저 공급자가 
새로운 실험적인 기능을 제공할 때 이전 버전의 웹 브라우저에 그 사실을 알려주기 위해 사용하는
 접두사(prefix)를 의미합니다.  -->
<html>
<head>
<title>Directives Tag</title>
</head>
<body>
	<c:forEach var="k" begin="1" end="10" step="1"><!-- 선언 : 시작 : 끝 : 중간단계(1씩 증가) -->
		<p><c:out value="${k}"/>번입니다.</p><!-- out.print 와 동일하지만 보안을 위해 적어주는 태그 -->
	</c:forEach>

</body>
</html>