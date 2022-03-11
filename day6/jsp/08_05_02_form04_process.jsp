<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
<title>Form Processing</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");

// 		String id = request.getParameter("id");
// 		String passwd = request.getParameter("passwd");
// 		String name = request.getParameter("name");
// 		String phone1 = request.getParameter("phone1");
// 		String phone2 = request.getParameter("phone2");
// 		String phone3 = request.getParameter("phone3");
// 		String sex = request.getParameter("sex");
// 		String hobby1 = request.getParameter("hobby1");
// 		String hobby2 = request.getParameter("hobby2");
// 		String hobby3 = request.getParameter("hobby3");
// 		String comment = request.getParameter("comment");
	%>
	<jsp:useBean id="mem" class="com.dto.MemberBean02" /><!-- java bean 연결 -->
	<jsp:setProperty property="*" name="mem"/><!-- 전송받은 데이터(form4에서 )를 bean 에다가 선언(=저장=초기화) -->
	
	<p> 아이디 : <jsp:getProperty property="id" name="mem" /><!-- bean에서 데이터 가져옴 -->
	<p>	비밀번호 : <jsp:getProperty property="passwd" name="mem" />
	<p>	이름 : <jsp:getProperty property="name" name="mem" />
	<p>	연락처 : <jsp:getProperty property="phone1" name="mem" />
	- <jsp:getProperty property="phone2" name="mem" />
	- <jsp:getProperty property="phone3" name="mem" />
	<p>	성별 : <jsp:getProperty property="sex" name="mem" />
	<p>	취미 : <jsp:getProperty property="hobby" name="mem" />
<%
	String[] values = request.getParameterValues("hobby");
	if (values != null) {
		for (int i = 0 ; i < values.length ; i++) {
			out.println(values[i]);
		}
	}
%>
	<p>	가입 인사 : <jsp:getProperty property="comment" name="mem" />
	
<%-- 	<p> 아이디 : <%=id%> --%>
<%-- 	<p>	비밀번호 : <%=passwd%> --%>
<%-- 	<p>	이름 : <%=name%> --%>
<%-- 	<p>	연락처 : <%=phone1%>-<%=phone2%>-<%=phone3%> --%>
<%-- 	<p>	성별 : <%=sex%> --%>
<%-- 	<p>	취미 : <%=hobby1%> <%=hobby2%> <%=hobby3%> --%>
<%-- 	<p>	가입 인사 : <%=comment%> --%>
</body>
</html>