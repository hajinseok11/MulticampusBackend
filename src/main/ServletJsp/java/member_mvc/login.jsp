<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<form method = "post" action = "/serverweb/member/mvc/login">
			아이디: <input type = "text" name = "id"/><br/>
			패스워드: <input type = "text" name = "pass"/><br/>
			<input type = "submit" value = "로그인"/><br/>
		</form>
	</body>
</html>