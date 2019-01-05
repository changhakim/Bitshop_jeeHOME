
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<% 
	String id = request.getParameter("id");
	String pass = request.getParameter("pass");
	String name = request.getParameter("name");
	
	double w = Integer.parseInt(request.getParameter("weight"));
	double h = Integer.parseInt(request.getParameter("height"));
	%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>가입한 아이디<%= id %></h3>
	<h3>비밀번호:*******</h3>
	<h3>이름<%= name %></h3>
</body>
</html>