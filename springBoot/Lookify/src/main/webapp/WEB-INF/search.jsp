<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<p><a href="/dashboard"></a></p>
<h2>Song by artist:<c:out value="${search}"/></h2>
	<form action="/search"  method="POST">
			<input type="text" name="search" placeholder="Search Artist">
			<button type="submit">Search</button>
	</form>
<table>
    <thead>
        <tr>
            <th>Name</th>
            <th>rating</th>
            <th>action</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${result}" var="artist">
        <tr>
            <td><a href ="/show/${artist.id}"><c:out value="${artist.title}"/></a></td>
            <td><c:out value="${artist.rating}"/></td>
            <td><a href="/delete/${artist.id }"><c:out value="${artist.id}"/>delete</a></td>
        </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>