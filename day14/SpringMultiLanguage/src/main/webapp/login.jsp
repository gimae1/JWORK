<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
<title><spring:message code="message.user.login.title"/></title>
<style>
.container{margin : 0 auto; width : 70%;}
.container div {padding : 20px ;margin : 0 auto; width : 500px ;border : 1px solid black;}
form p{text-align : center}
</style>
</head>
<body>

<div class="jumbotron jumbotron-fluid">
  <div class="container">
    <h1><spring:message code="message.user.login.title"/></h1>   
   <p> <a href="login.do?lang=en"><spring:message code="message.user.login.language.en"/></a> </p>
    <p><a href="login.do?lang=ko"><spring:message code="message.user.login.language.ko"/></a> </p>
    
  </div>
</div>

<div class="container">
      
    <form action="login.do" method="post">   <!-- localhost:8080/MVCProject02/login.do--> 
    <div>   
		<p><spring:message code="message.user.login.id"/><input type="text" name="id" value="${userVO.id}"></p>
		<p><spring:message code="message.user.login.password"/><input type="password" name="password" value="${userVO.password}" ></p>
		<p><input type="submit" value="<spring:message code="message.user.login.loginBtn"/>"/></p>
    </div>
	</form>
	
	
	
</div>
</body>
</html>