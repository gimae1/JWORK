<%@ page contentType = "text/html; charset=utf-8" %>
<%@ page import = "java.util.Enumeration" %>
<html>
<head><title>헤더 목록 출력</title></head>
<body>
<h1>request객체의 헤더 관련 메서드</h1>
<%
/* 	getHeaderNames() : 모든 헤더의 이름을 가져옴 */
//Enumeration : itrator와 마찬가지로 컬렉션프레임워크의 값을 요소단위로 떼어오기 위한 인터페이스임
	Enumeration headerEnum = request.getHeaderNames();
	while(headerEnum.hasMoreElements()) {
		String headerName = (String)headerEnum.nextElement();
		//getHeader("헤더명") : 지정한 헤더의 값을 가져옴.
		String headerValue = request.getHeader(headerName);
%>
<%= headerName %> = <%= headerValue %> <br>
<%
	}
%>

</body>
</html>
