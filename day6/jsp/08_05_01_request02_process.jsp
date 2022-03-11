<%@ page contentType="text/html; charset=utf-8"%>
<% request.setCharacterEncoding("utf-8"); %><!-- post 방식은 무조건!! encoding -->

<jsp:useBean id="memberBean" class="com.dto.MemberBean" />
<jsp:setProperty name="memberBean" property="*"/>
<%-- <jsp:setProperty name="memberBean" property="id" param="user_id"/> --%>
<%-- <jsp:setProperty name="memberBean" property="name" param="name"/> --%>

아이디: <jsp:getProperty name="memberBean" property="id"/><br><!-- out.print 가 작동한다 -->
이름: <jsp:getProperty name="memberBean" property="name"/><br>
취미: <jsp:getProperty name="memberBean" property="hobby"/><br>
	<%
         String[] hobby = memberBean.getHobby();
         for(int i=0;i<hobby.length;i++){
             if(hobby[i] != null){
                 out.write(hobby[i]);
                 if(i != (hobby.length-1)) out.write(", ");
             }
         }
     
     %>