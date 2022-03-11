<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
   <title> Implicit Objects </title> 
</head>
<body>
   <p>요청 URI : <%=request.getRequestURI() %>
   <p>컨텍스트 경로 : <%=request.getContextPath() %>
   <p>서버 이름  : <%=request.getServerName() %>
   <p>서버 포트  : <%=request.getServerPort() %>
   <p>쿼리문  : <%=request.getQueryString() %>
</body>
</html>