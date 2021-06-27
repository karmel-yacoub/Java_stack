<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="/dashboard"> Dashboard</a>
	<h1>Top Ten Songs:</h1>
	<ol>
		<c:forEach items="${top}" var="top">
			<li><h5>${top.rating}-<a href="/show/${top.id }">${top.title}</a>-${top.artist}
				</h5></li>
		</c:forEach>
	</ol>

</body>
</html>