<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dashboard</title>
</head>
<body>
	<a href="/songs/new">Add New</a>
	<a href="/search/topten">Top Songs</a>

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
        <c:forEach items="${songs}" var="song">
        <tr>
            <td><a href ="/show/${song.id}"><c:out value="${song.title}"/></a></td>
            <td><c:out value="${song.rating}"/></td>
            <td><a href="/delete/${song.id }"><c:out value="${song.id}"/>delete</a></td>
        </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>