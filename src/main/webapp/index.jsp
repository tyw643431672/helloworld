<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="testSessionAttributes" method="post">
		姓名：<input type="text" name="username"><br> 密码：<input
			type="password" name="password"><br> <input
			type="submit" value="提交" />
	</form>
	<br />
	<br />
	<form action="testXXX" method="post">
		<input type="hidden" name="id" value="1">
		<!-- 姓名：<input type="text" name="username"><br>  -->
		<input type="submit" value="提交" />
	</form>
	<br/>
	<br/>
	<a href="testView">testView</a>
	<br/>
	<br/>
	<a href="testRedirect">testRedirect</a>
	<br/>
	<br/>
	<a href="testEdit">testEdit</a>
	
</body>
</html>