<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<title>Member</title>
</head>
<body>
	<h1>
		회원가입
	</h1>
	
	<form>
		<table>
			<tr>
				<td id="title">회원이름</td>
				<td>
					<input type="text" name="name" maxlength="20">
				</td>
			</tr>
			<tr>
				<td id="title">회원아이디</td>
				<td>
					<input type="text" name="id" maxlength="20">
				</td>
			</tr>
			<tr>
				<td id="title">나이</td>
				<td>
					<input type="text" name="age" maxlength="20">
				</td>
			</tr>
			<tr>
				<td id="title">주소</td>
				<td>
					<input type="text" name="address" maxlength="20">
				</td>
			</tr>
		</table>
		
	
	</form>
	
</body>
</html>