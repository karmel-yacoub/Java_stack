<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>New Book</h1>
	<form:form action="/edit/${book.id}" method="post" modelAttribute="book">
		<p>
			<form:label path="title">Title</form:label>
			<form:errors path="title" />
			<form:input path="title" value="${book.title}"/>
			</p>
		<p>
			<form:label path="description">Description</form:label>
			<form:errors path="description" />
			<form:textarea path="description"  value="${book.description}"/>
			
		</p>
		<p>
			<form:label path="language">Language</form:label>
			<form:errors path="language" />
			<form:input path="language"  value="${book.language}"/>
		</p>
		<p>
			<form:label path="numberOfPages">Pages</form:label>
			<form:errors path="numberOfPages" />
			<form:input type="number" path="numberOfPages"  value="${numberOfPages.title}"/>
		</p>
		<input type="submit" value="Submit" />
	</form:form>
</body>
</body>
</html>