<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="input.do">
	<table border=1>
			<tr>
				<th colspan=2 align=center>입력해주세요</th>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type=text id="name" name="name"></td>
			</tr>

			<tr>
				<td>이메일</td>
				<td><input type=text id="email" name="email"></td>
			</tr>
			<tr>
				<td colspan=2 align=center><input type=submit value="등록"></td>
			</tr>
		</table>
</form>
</body>
</html>