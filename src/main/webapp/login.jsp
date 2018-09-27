<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	login.jsp
	<br/>
	<br/>
	
	<form:form action="update" method="post" commandName="user">
		
		id:<form:input path="id" /><br/>
		name:<form:input path="username"/><br/>
		性别:<form:radiobuttons path="sex" items="${sex}"/><br/>
		<%-- <form:select path="path" items="${path}" ></form:select>
		<input type="text" name="password" value="${user.password}"><br/> --%>
		<input type="submit" value="提交">
	</form:form>	
	
	
</body>
</html>