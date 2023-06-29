<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입 페이지</title>
<link rel="stylesheet" type="text/css" href="css/member.css">
</head>
<body>
<section id="main" style="width:500px; margin:0 auto; ">
	<h1>회원가입</h1>
	<div id="main2">
	
	<form name="frmMember" action="mServlet" method="post">
		<table>
			<tr>
				<td width="120" ><span class="label_span">*</span>아이디</td>
				<td><input type="text" name="id" size="25" ></td>
			</tr>
			<tr>
				<td style="vertical-align: top;"><span class="label_span">*</span>비밀번호</td>
				<td><input type="password" name="pwd" size="25"><br><span style="font-size: 7px;">6~15자 영문과 숫자,특수문자 조합</span></td>
			</tr>
			<tr>
				<td><span class="label_span">*</span>비밀번호 확인</td>
				<td><input type="password" name ="pwdCheck" size="25"></td>
			</tr>
			<tr>
				<td><span class="label_span">*</span>이름 입력</td>
				<td><input type="text" name="name" size="25"></td>
			</tr>
			<tr>
				<td>이메일 입력</td>
				<td><input type="text" name="email" size="10">
					<select name="emailSelect">
						<option selected value="직접입력">직접입력</option>					
						<option value="@naver.com">@naver.com</option>
						<option value="@gmail.com">@gamil.com</option>
						<option value="@nate.net">@nate.net</option>
					</select> 
				</td>
			</tr>
			<tr>
				<td>전화번호 입력</td>
				<td><input type="text" name="tel" size="25"></td>
			</tr>
			<tr>
				<td><span class="label_span">*</span>휴대전화 입력</td>
				<td><input type="text" name="tel2" size="25"></td>
			</tr>
			<tr>
				<td>주소</td>
				<td><input type="text" name="address" size="10"><button id="address_button" >우편번호 검색</button></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="text" name="address2" placeholder="상세주소 입력" size="25"></td>
			</tr>
		</table>
		
		<button id="next">이전</button>
		<input type="submit" value="가입하기">
		</form>
		</div>
		
</section>
</body>
</html>