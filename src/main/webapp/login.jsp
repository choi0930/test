<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 페이지</title>
<link rel="stylesheet" type="text/css" href="css/login.css">

</head>
<body>
	<section id="main">
		<div id="main2">
		<div id = "main_text">
		<p>로그인<p>
		</div>
		
		<input class="in" type="text" placeholder="아이디를 입력하세요" size="30" style="margin-bottom: 20px;"><br>
		<input  class="in" type="text" placeholder="비밀번호를 입력하세요"size="30"><br>
		<span style="margin-right:150px; "><input type="radio"><label>아이디 저장</label></span><br>
		<button>로그인</button><br>
		
		<a href="member.jsp">회원가입</a> | <a href="#">아이디 찾기/비밀번호 찾기</a>
		</div> 
	</section>
</body>
</html>