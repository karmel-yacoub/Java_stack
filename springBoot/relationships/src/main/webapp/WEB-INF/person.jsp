<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>New Person</h1>
<form:form action="/person/new" method="post" modelAttribute="person">
		<p>
			<form:label path="firstName">First Name</form:label>
			<form:errors path="firstName" />
			<form:input path="firstName" />
		</p>
		<p>
			<form:label path="lastName">LastName</form:label>
			<form:errors path="lastName" />
			<form:textarea path="lastName" />
		</p>
	
		    <input class="btn btn-outline-dark " style="color: black; background:white; border: solid 2px black;" type="submit" value="create"/>
	</form:form>
</body>
</html>