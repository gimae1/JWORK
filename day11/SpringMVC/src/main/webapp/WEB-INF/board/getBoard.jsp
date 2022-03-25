<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.springbook.biz.board.impl.BoardDAO" %>    
<%@page import="com.springbook.biz.board.BoardVO" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
<title>글 상세</title>
<style type="text/css">
.container{margin-top : 30px; margin-bottom: 30px; }
p{text-align: center;}
</style>
</head>
<body>
<div class="jumbotron jumbotron-fluid">
  <div class="container">
	<h1>글 상세</h1>
	<div class="container">
  <div class="clearfix">
    <span class="float-right"><a href="logout.do">LOGOUT</a></span>
  </div>
</div>
  </div>
</div>
<hr>
<form action="updateBoard.do" method="post">
<input name="seq" type="hidden" value="${board.seq }">
<div class="container"> 
  <table class="table table-bordered">


    <tbody>
      <tr>
       	<td style="width : 100px"> 제목</td>
		<td><input name="title" type="text" value="${board.title }"></td>
      </tr>
	<tr>
		<td style="width : 100px"> 작성자</td>
		<td> ${board.writer }</td>
		</tr>
	<tr>
		<td style="width : 100px"> 내용</td>
		<td style="height : 150px"><textarea name="content">${board.content }</textarea></td>
	</tr>
	<tr>
		<td style="width : 100px"> 등록일</td>
		<td>${board.regDate} </td>
	</tr>
	<tr>
		<td style="width : 100px"> 조회수</td>
		<td>${board.cnt }</td>
	</tr>

    </tbody>
  </table>
</div>
<div class="container">
  <div class="clearfix">
    <span class="float-right"><input type="submit" value="글 수정"></span>
  </div>
</div>
</form>
<hr>
<p><a href="insertBoard.jsp">글 등록</a><span>&nbsp;|&nbsp;</span>
<a href="deleteBoard.do?seq=${board.seq }">글 삭제</a><span>&nbsp;|&nbsp;</span>
<a href="getBoardList.do">글 목록</a></p>
</body>
</html>


