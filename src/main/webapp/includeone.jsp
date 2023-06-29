<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>includeone</title>
</head>
<body>
안녕하세요. 쇼핑몰 중심 JSP 시작입니다!!!
	<jsp:include page="total_image.jsp" flush="true">
		<jsp:param  name="name" value="includeone" />
		<jsp:param  name="imgName" value="puppy.jpg"/>
	</jsp:include>
안녕하세요. 쇼핑몰 중심 JSP 끝 부분입니다.!!!
</body>
</html>