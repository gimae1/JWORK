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
<title>새글 등록</title>
<style type="text/css">
p{text-align: center;}
</style>
</head>
<body>
<div class="jumbotron jumbotron-fluid">
  <div class="container">
<h1> 글 등록</h1>
  </div>
</div>
<hr>
<form action="insertBoard_proc.jsp" method="post">
<div class="container">
  <table class="table table-bordered">
    <tbody>
      <tr>
       	<td style="width : 100px"> 제목</td>
			<td><input type="text" name="title"></td>
      </tr>
	<tr>
		<td style="width : 100px"> 작성자</td>
		<td><input type="text" name="writer"></td>
		</tr>
	<tr>
		<td style="width : 100px"> 내용</td>
		<td style="height : 150px"><textarea name="content" cols="90" rows="10"></textarea></td>
	</tr>


    </tbody>
  </table>
</div>
<div class="container">
  <div class="clearfix">
    <span class="float-right"><td colspan="2" align="center"><input type="submit" name="새글 등록"></td></span>
  </div>
</div>
</form>
<hr>
<p><a href="getBoardList.jsp">글 목록 가기</a></p>
</body>
</html>