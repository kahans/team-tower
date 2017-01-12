<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>글 작성</title>
</head>
<body>
<form action="<c:url value='/boardrAdd'/>" method="post" enctype="multipart/form-data">
		<table>
			<tr>
				<th align="left">TITLE</th>
				<td><input type="text" id="bTitle" name="bTitle"/></td>
			</tr>
			<tr>
				<th align="left">PW</th>
				<td><input type="password" id="bPw" name="bPw"/></td>
			</tr>
			<tr>
				<th align="left">Content</th>
				<td><input type="text" id="bContent" name="bContent"/></td>
			</tr>
			<jsp:include page="../files/fileUpload.jsp"></jsp:include>
			<tr align="center">
				<td colspan="2" >
					<input type="submit" value="작성하기"/>
				</td>
			<tr>
		
		</table>
	</form>

</body>
</html>