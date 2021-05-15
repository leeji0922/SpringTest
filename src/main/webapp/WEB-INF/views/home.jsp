<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%@ page session="false" %> --%>
<%-- <%@page isELIgnored="false"%> --%>
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
<!-- begin="0" end="2" step="1" -->

	<c:forEach var="j" items="${showProduct}" varStatus="show"> <%-- var:사용할 변수명 itens: Collection 객체(List,ArrayListm, Map 등) --%>
		<li>${show.count}: 상품 명 : ${j}</li>
	</c:forEach>
</ol>

<form action="member.do" method="post">
	<table>
		<tr>
			이름 :
			<input type="text" name="userName" /><br>
		</tr>
		<tr>
			아이디 :
			<input type="text" name="userId" /><br>
		</tr>
		<tr>
			비밀번호 :
			<input type="password" name="userPassword" /><br>
		</tr>
		<tr>
			나이 :
			<input type="text" name="userAge" /><br>
		</tr>
		<tr>
			주소 :
			<input type="text" name="userAddress" /><br>
		</tr>
		<tr>
			<input type="submit" value="확인">
		</tr>
	</table>
</form>

<form action="findmember.do">
	<table>
		<tr>
			찾으실 아이디
			<input type="text" name="id" /><br>
		</tr>
		<tr>
			<input type="submit" value="확인">
		</tr>
	</table>
</form>

<form action="editmember.do" method="post">
	<table>
		<tr>
			아이디:
			<input type="text" name="id"><br>
		</tr>
		<tr>
			이름:
			<input type="text" name="name"><br>
		</tr>
		<tr>
			나이:
			<input type="text" name="age"><br>
		</tr>
		<tr>
			주소:
			<input type="text" name="address"><br>
		</tr>
		<tr>
			<input type="submit" value="확인">
		</tr>
	</table>
</form>

<c:choose>
	<c:when test="${sessionScope.mvo==null} ">
		<form action="login.do" method="post">
			<input type="text" name="id">
			<input type="password" name="password">
			<input type="submit" value="로그인">
		</form>
	</c:when>
	<c:otherwise>${sessionScope.mvo.name} 님 환영합니다.
	</c:otherwise>
</c:choose>


</body>
</html>