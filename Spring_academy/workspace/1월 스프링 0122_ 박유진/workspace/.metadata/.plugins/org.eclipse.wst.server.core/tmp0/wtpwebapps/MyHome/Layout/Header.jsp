<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	#header , .footer {
		border : 1px black solid;
		width : 600px;
		height : 40px;
		padding-top : 12px;
	}
	
	#main {
		width : 600px;
		min-height : 400px;
		padding-top : 15px;
	}
	#border {
		border : 1px solid black;
	}
	#table {
		width: 450px;
		border : 1px solid black;
		border-spacing: 0px;
	}
	#button{
		width : 450px;
		text-align: right;
		padding-top: 15px;
	}
	#link{
		text-decoration: none;
		font-weight: bold;
	}
	a{
		text-decoration: none;
		font-weight: bold;
	}
</style>
</head>
<body>
	<div align="center">
		<div align="center" id = "header"  >
			<c:if test="${sessionScope.login != null }">
				<a href = "/MyHome/Member/MyPage.jsp">MyPage</a> | 
				<a href = "/MyHome/Login/Logout.jsp" style="text-decoration: none;">Logout</a> |
			</c:if>
			<c:if test="${sessionScope.login == null }">
				<a href = "/MyHome/Login.do">Login</a> | 
				<a href = "/MyHome/Member/JoinForm.jsp" style="text-decoration: none;">Join</a> | 
			</c:if>
			<%--<a href = "/MyHome/Member/MyPage.jsp" style="text-decoration: none;">MyPage</a> | 
			<a href = "/MyHome/Login/Logout.jsp" style="text-decoration: none;">Logout</a> | 
			
			<a href = "/MyHome/Login/LoginForm.jsp" style="text-decoration: none;">Login</a> | 
			<a href = "/MyHome/Member/JoinForm.jsp" style="text-decoration: none;">Join</a> | 
			--%>
			<a href = "/MyHome/Board/BoardList.brd" style="text-decoration: none;">Board</a> | 
			<a href = "/MyHome/Index.jsp" style="text-decoration: none;">Home</a>
		</div>		
		<div align="center" id = "main">
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		