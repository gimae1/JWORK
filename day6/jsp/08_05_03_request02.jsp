<%@ page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Implicit Objects</title>
<style>
table {border-collapse: collapse;}
table, th, td {border: 1px solid #000;}
th {background-color: #ccc;}
td, th {padding: 10px 20px;}
</style>
</head>
<body>
	<%
		String hostValue = request.getHeader("host");
		String alValue = request.getHeader("accept-language");
	%>
	<table>
		<tr><th>호스트명</th><th>설정된 언어</th></tr>
		<tr><td><%=hostValue%></td><td><%=alValue%></td></tr>
	</table>
</body>
</html>