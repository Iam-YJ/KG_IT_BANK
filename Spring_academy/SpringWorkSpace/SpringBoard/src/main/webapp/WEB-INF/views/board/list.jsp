<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	<table id = "table">
		<tr>
			<th id = "border">번호</th>
			<th id = "border">글제목</th>
			<th id = "border">아이디</th>
			<th id = "border">작성일</th>
			<th id = "border">조회수</th>
		</tr>
		<c:choose>
			<c:when test="${list != null }">
				<c:forEach var = "dto" items="${list }">
					<tr>
						<td id="border" align="center">${dto.seq }</td>
						<td id="border" >
							<a href="/bbs/readContent.do?seq=${dto.seq }">${dto.title }</a>
						</td>
						<td id="border" >${dto.id }</td>
						<td id="border" >${dto.logtime }</td>
						<td id="border" >${dto.hit }</td>
					</tr>
				</c:forEach>
			</c:when>
			<c:otherwise>
				<tr>
					<th colspan="5" id = "border">작성한 글이 없습니다</th>
				</tr>
			</c:otherwise>
		</c:choose>
	</table>
</div>
</body>
</html>