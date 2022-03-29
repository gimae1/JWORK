<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
<style type="text/css">
h1{ text-align : center;} 
.container{margin : 0 auto; width : 70%;}
.container div {padding : 20px ;margin : 0 auto; width : 500px ;border : 1px solid black;}
form p{text-align : center}
</style>
<title>Main page</title>
</head>
<body>
</head>
<body>

<div class="jumbotron jumbotron-fluid">
  <div class="container">
<h1>게시판 프로그램</h1>
  </div>
</div>
<hr>

<div class="container">
      
    <form action="login.do" method="post">   <!-- localhost:8080/MVCProject02/login.do--> 
    <div>   
		<p>아 &nbsp;이 &nbsp;디 &nbsp;<input type="text" name="id" value="${userVO.id}"></p>
		<p>비밀번호 &nbsp;<input type="password" name="password" value="${userVO.password}" ></p>
		<p><input type="submit" value="로그인"></p>
    </div>
	</form>
	
	
	
</div>
	<p><a href="login.do">로그인</a></p>
	<p><a href="getBoardlist.do">글 목록 바로가기</a></p>


<hr>

</body>
</html>