<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.List"%>
<%@page import="com.springbook.biz.board.impl.BoardDAO" %>    
<%@page import="com.springbook.biz.board.BoardVO" %>    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
<title>글 목록</title>

<style type="text/css">

.listtable{margin : 0 auto; width : 70%;}
.containermt{margin : 0 auto; width : 200px; height : 20px;}
 table{border-bottom : 1px solid lightgray; border-collapse: collapse; }
p{text-align : center;}
button{height : 40px;}
</style>

</head>
<body>
<div class="jumbotron jumbotron-fluid">
  <div class="container">
	<h1> 글 목록</h1>
	<h3> ${userName} 님 환영합니다...</h3>
	<div class="container">
  <div class="clearfix">
    <span class="float-right"><a href="logout.do">LOGOUT</a></span>
  </div>
</div>

  </div>
</div>

<hr>
<!-- 검색 시작 -->
<div class="container mt-3">
<form action="getBoardList.do" method="post">
   <div class="input-group mt-3 mb-3">
	 <div class="form-group">
      <select class="form-control" id="sel1" name="searchCondition">
  		<option value = "TITLE">제목</option>
		<option value = "CONTENT">내용</option>
      </select>
     </div>
      	<input type="text" class="form-control" name="searchKeyword" placeholder="내용을 입력하세요">
     	<button class="btn btn-secondary" type="submit">검색</button>
   </div>
</form>
</div>
<!-- 검색 종료 -->

<div class="container">
  <table class="table table-hover">
	<thead>
      <tr>
       <th>번호</th>
		<th>제목</th>
		<th>작성자</th>
		<th>등록일</th>
		<th>조회수</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach items="${boardList}" var="board">
<tr>
	<td>${board.seq}</td>
	<td><a href="getBoard.do?seq=${board.seq}">${board.title}</a></td>
	<td>${board.writer}</td>
	<td>${board.regDate}</td>
	<td>${board.cnt}</td>
</tr>
</c:forEach>
    </tbody>
</table>
</div>
<hr>
<p><a href="insertBoard.jsp">새글 등록</a></p>


</body>
</html>