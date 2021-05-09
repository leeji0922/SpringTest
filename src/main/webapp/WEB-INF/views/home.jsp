<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  상품수:	${requestScope.totalProductNum} </P>
<P> 총 상품의 재고 : ${requestScope.showAllStock}</P>
<ol>
	<c:forEach var="j" items="${showProdcut}" begin="0" end="2" step="1" varStatus="show"> <%-- var:사용할 변수명 itens: Collection 객체(List,ArrayListm, Map 등) --%>
		<li>${show.count}: 상품 명 <c:out value="${j}" /></li>
	</c:forEach>
</ol>

<P>회원가입</P>
<table>
	<tr>
		<td>이름 : </td>
		<td><input type="text" name="name"></td>
	</tr>
	<tr>
		<td>아이디 : </td>
		<td><input type="text" name="id"></td>
	</tr>
	<tr>
		<td>나이 : </td>
		<td><input type="text" name="age"></td>
	</tr>
	<tr>
		<td>주소 : </td>
		<td><input type="text" name="address"></td>
	</tr>
	 <tr>
        <td>
        	<input type="button" value="확인" onclick="location.href='http://localhost:8888/lji/member.do'">
        	<input type="reset" value="취소">
        </td>
</table>

</body>
</html>