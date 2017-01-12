<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>자료등록</title>
</head>
<body>
	<form action="<c:url value='/fileUpload'/>">
		<table>
			<tr>
				<th>파일제목</th>
				<td><input type="text" name="fileName"></td>
			</tr>
			<tr>
				<th>파일내용</th>
				<td><input type="text" name="fileAuth"></td>
			</tr>
			<tr>
				<th>파일첨부</th>
				<td><input type="file" name="multipartFile"></td>
			</tr>
			<tr>
				<td><input type="submit" value="확인"></td>
			</tr>
		</table>
	</form>
</body>
</html>