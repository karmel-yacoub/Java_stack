<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<title>Add a Song</title>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="/dashboard">Dashboard</a>

	<form:form action="/songs/new" method="post" modelAttribute="song">
		<p>
			<form:label path="title">Title</form:label>
			<form:errors path="title" />
			<form:input path="title" />
		</p>
		<p>
			<form:label path="artist">Artist</form:label>
			<form:errors path="artist" />
			<form:textarea path="artist" />
		</p>
		
		  <p><form:errors path="rating" class="alert alert-danger"/></p>
		    <p>
		        <form:label  path="rating">Rating(1-10): </form:label>
		        
		        <form:select  path="rating">
		        	<c:forEach begin="1" end="10" var="loop">
    					<form:option value="${loop}"> ${loop} </form:option>
					</c:forEach>
				</form:select>
		    </p>
		    <input class="btn btn-outline-dark " style="color: black; background:white; border: solid 2px black;" type="submit" value="Add Song"/>
	</form:form>
</body>
</html>