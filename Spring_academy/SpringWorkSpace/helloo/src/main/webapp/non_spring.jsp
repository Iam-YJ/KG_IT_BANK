<%@page import="vo.PersonVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	PersonVO p1 = new PersonVO();
	p1.setName("김민준");
	p1.setAge(20);
	p1.setTel("010-3666-6768");
	
	PersonVO p2 = new PersonVO("손승연",28,"010-7244-4472");
	
	pageContext.setAttribute("p1", p1);
	request.setAttribute("p2", p2);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<p>${p1.name } / ${p1.age } / ${p1.tel }</p>
		<p>${p2.name } / ${p2.age } / ${p2.tel }</p>
	</div>
</body>
</html>
























