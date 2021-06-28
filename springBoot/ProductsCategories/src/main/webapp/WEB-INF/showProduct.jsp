<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>
		<c:out value="${product.name}"/>
	</h1>
	<c:forEach items="${productFromController.categories }" var="cat">
	<li>${cat.name }</li>
	</c:forEach>
	<form action="/add_category/${productFromController.id}" method="POST">
	<select name="category">
	<c:forEach items="${unlisted}var="cate">
	<option value="${cate.id}">${cate.name}</option>
	</select>
	</c:forEach>
	</form>

</body>
</html>