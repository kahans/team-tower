<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>글 목록</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>글쓴이</th>
			<th>작성일</th>
		</tr>
		<c:forEach var="board" items="${list}">
			<tr>
			
				<td>${board.bNo}</td>
				<td>${board.bTitle}</td>
				<td>${board.mId}</td>
				<td>${board.bDate}</td>
			
			
			</tr>
		</c:forEach>
	</table>
</body>
</html>