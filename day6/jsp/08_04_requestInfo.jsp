<%@ page contentType = "text/html; charset=utf-8" %>
<% request.setCharacterEncoding("utf-8"); %>
<html>
<head><title>클라이언트 및 서버 정보</title><meta charset="utf-8"></head>
<body>
<h2>URL 구성 : </h2>
<h2>http://localhost:8090/JSPFirst/08_04requestInfo.jsp</h2>
<h3>프로토콜 :  http</h3>
<h3>ip주소(=서버이름) : localhost</h3>
<h3>포트번호 : 8090</h3>
<h3>경로 : /JSPFirst/08_04requestInfo.jsp</h3>
<dl>
	<dt><strong style="font-weight:bolder">localhost</strong></dt>
	<dd>IPv4 주소 형식 값으로 표시: 127.0.0.1 </dd>
	<dd>IPv6 주소 형식 값으로 표시: 0:0:0:0:0:0:0:1 </dd>
</dl>

<ul>
	<li>클라이언트IP = <%= request.getRemoteAddr() %><br>
		<small style="color:red">localhost부분을 IPv6값을 String으로 가져 옴. String으로 반환</small>
	</li>
	<li>요청정보 길이 = <%= request.getContentLength() %><br><!-- post 방식의 요청정보 길이만 받아올 수 있다.  -->
		<small style="color:red">클라이언트가 전송한 요청 정보의 길이(post로 보낸 데이터만)를 구함. long으로 반환</small>
	</li>
	<li>요청정보 인코딩 = <%= request.getCharacterEncoding() %><br>
		<small style="color:red">클라이언트가 전송한 요청 정보의 문자셋을 구함. String으로 반환</small>
	</li>
	<li>요청정보 컨텐츠타입 = <%= request.getContentType() %><br>
		<small style="color:red">클라이언트가 전송한 요청 정보(post로 보낸 데이터만)의 컨텐츠 타입을 구함. String으로 반환</small>
	</li>
	<li>요청정보 프로토콜 = <%= request.getProtocol() %></li>
	<li>요청정보 전송방식 = <%= request.getMethod() %></li>
	<li>
		요청 URI = <%= request.getRequestURI() %><br>
		<small style="color:red">URL에서 경로를 구함. String으로 반환</small>		
	</li>
	<li>
		컨텍스트 경로 = <%= request.getContextPath() %><br>
		<small style="color:red">현재 페이지의 컨텍스트 경로를 구함. String으로 반환</small>
	</li>
	<li>서버이름(연결시 사용한 서버 이름) = <%= request.getServerName() %></li>
	<li>서버포트 = <%= request.getServerPort() %></li>
	<li>
		파라미터 정보1 = <%=request.getParameter("id")%><br>
		파라미터 정보2 = <%=java.net.URLDecoder.decode(request.getParameter("name"))%><br>
<%-- 		파라미터 정보2 = <%=request.getParameter("name")%><br> --%>
	</li>
</ul>
</body>
</html>
