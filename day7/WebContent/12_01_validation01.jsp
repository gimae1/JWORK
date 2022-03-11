<%@ page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Validation</title>
<meta charset="utf-8">
<!-- 파비콘(해당 사이트를 나타내는 아이콘) 에러 시 주석처리 풀기 -->
<!-- <link rel="shortcut icon" href="data:image/x-icon" type="image/x-icon"> -->
<style>
form {width:60%; margin:0 auto; padding:10px; text-align:center;}
</style>
</head>
<body>
	<form name="loginForm" action="12_01_validation_process.jsp" method="post">
	<fieldset>
		<legend>로그인</legend>
		<label for="uid">아&nbsp;이&nbsp;디&nbsp;&nbsp;: </label>
		<input type="text" name="id" id="uid" required><br>
		<label for="upw">비밀번호&nbsp;: </label>
		<input type="password" name="passwd" id="upw" required><br><br>
		<!-- <input type="submit" value="전송"> -->
 		<input type="button" value="전송" onclick="checkLogin()">
	</fieldset>
	</form>

<script>
	 function checkLogin() {
		var form = document.loginForm;//documen. 뒤에 올수잇는요소는 form 에 있는 name 만 핸들링 가능하다
		if (form.id.value == "") {
			alert("아이디를 입력해 주세요.");
			form.id.focus();
			return false;
		} else if (form.passwd.value == "") {
			alert("비밀번호를 입력해 주세요");
			form.passwd.focus();
			return false;
		}			
		console.log("값 가져오기: ");
		console.log("아이디 : " + document.loginForm.id.value + "\n" +  "비밀번호 : " + document.loginForm.passwd.value);
		form.submit();
	} 
</script>
</body>
</html>