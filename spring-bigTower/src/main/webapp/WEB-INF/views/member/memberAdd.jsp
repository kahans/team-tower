<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원등록</title>
</head>
<body>
	<form action="<c:url value='/memberAdd'/>" method="post">
		<table>
			<tr>
				<th align="left">ID</th>
				<td><input type="text" id="mId" name="mId"/></td>
			</tr>
			<tr>
				<th align="left">PW</th>
				<td><input type="password" id="mPw" name="mPw"/></td>
			</tr>
			<tr>
				<th align="left">NAME</th>
				<td><input type="text" id="mName" name="mName"/></td>
			</tr>
			<tr>
				<th align="left">권한</th>
				<td>
					<select id="mLevel" name="mLevel">
						<option value="관리자">관리자</option>
						<option value="일반">일반</option>
					</select>
				</td>
			</tr>
			<tr align="center">
				<td colspan="2" >
					<input type="submit" value="가입확인"/>
				</td>
			<tr>
		
		</table>
	</form>
</body>
</html>