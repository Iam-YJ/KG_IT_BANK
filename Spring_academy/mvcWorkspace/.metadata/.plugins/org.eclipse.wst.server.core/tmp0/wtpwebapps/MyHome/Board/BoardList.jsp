<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/Layout/Header.jsp"/>
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
								<a href="/MyHome/ReadContent.brd?seq=${dto.seq }">${dto.title }</a>
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
		<c:if test="${login != null }">
			<div id = "button">
				<input type="button" value="글쓰기" onclick="location.href='/MyHome/WriteForm.brd'">
			</div>
		</c:if>
		<c:if test="${start >= 11 }">
			<a href="/MyHome/BoardList.brd?start=${start - 10 }">[이전]</a>
		</c:if>
		<c:if test="${start >= 6 }">
			<a href="/MyHome/BoardList.brd?start=${start - 5 }">[${nowPage - 1 }]</a>
		</c:if>
		[${nowPage }]
		<c:if test="${start + 5 <= total }">
			<a href="/MyHome/BoardList.brd?start=${start + 5 }">[${nowPage + 1 }]</a>
		</c:if>
		<c:if test="${start + 10 <= total }">
			<a href="/MyHome/BoardList.brd?start=${start + 10 }">[다음]</a>
		</c:if>
	</div>
<jsp:include page="/Layout/Footer.jsp"/>
















