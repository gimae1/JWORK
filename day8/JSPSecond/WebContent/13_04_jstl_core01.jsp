<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>core태그</title>
</head>
<body>
<h2>c:set태그 - 변수의 값을 설정(setAttriubte 와 동일한 역할을 한다.)</h2>
<c:set var="num" value="50"/>
<%-- <c:set var="num" >50</c:set>--%>
<!--여는태그 닫는태그 같이 사용하면 출력할 수 있다. -->
num값은 : ${num}<br><hr>
<!-- ${} ->톰캣에서 제공하는 표현식(EL) -->
<!-- jsp 태그 lib 의 태그들은 jsp태그 안에서는 사용할 수 없다 -->


<h2>c:out태그 - 변수의 값을 출력</h2>
<c:out value="${num}" default="0"/>, 
<c:out value="작성자" default="Admin" />, 
<c:out value="hello world!!!!!!!" /><br><hr>

<h2>c:forEach태그 - 반복문 수행</h2>
범위안에서 반복문을 수행한다. for와 동일한 역할을 한다.<br>
begin : 초기 값, end : 마지막 값 , step : 증감값<br><br>
<c:out value="수식: resNum = {(i+num-2)%7}" /><br>
<c:forEach var="i" begin="1" end="10" step="1">
	<c:set var="resNum" value="${(i+num-2)%7}"></c:set>
	<c:out value="num: ${num}" />
	<c:out value="i: ${i}" />
	<c:out value="resNum: ${resNum}" /><br>
</c:forEach><hr>

<h2>c:if태그 - 조건문 수행</h2>
조건문을 수행한다. if와 동일한 역할을 한다.<br>
<jsp:useBean id="memberBean" class="com.dto.MemberBean" /><!--EL 표현식은 객체를 만든 클래스를 private 벗겨서 새로 클래스를 만들어 접근 가능한 클래스로 활용을 한다.  -->
<!--EL 표현식은 private 라도 접근을 할 수있다.  -->
<c:if test="${memberBean.name eq '이루마'}">
       <p>이름은 ${memberBean.name}입니다.</p>
</c:if><hr>

<jsp:setProperty property="name" name="memberBean" value="홍길순"/>
<h2>c:choose / c:when태그 - 조건문 수행</h2>
if, else 구문 역할을 한다.<br>
<c:choose>
  <c:when test="${memberBean.name eq '고길동'}">
    <p>이름은 ${memberBean.name}입니다.</p>
  </c:when>
  <c:when test="${memberBean.name eq '홍길순'}">
     <p>이름은 ${memberBean.name}입니다.</p>
  </c:when>
  <c:otherwise>
    <p>이름은 ${memberBean.name}입니다.</p>
  </c:otherwise>
</c:choose>
<!-- jstl tag(c:choose) 안에서 주석을 치면 error 남 -->
</body>
</html>