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
<a href="/languages">Dashboard</a>
<a href="/languages/delete/${language.id}">Delete</a>
<container>
<form:form action="/languages/edit/${language.id}" method="post" modelAttribute="language">
		<p>
			<form:label path="name">Name</form:label>
			<form:errors path="name" />
			<form:input path="name" value="${language.name}"/>
			</p>
		<p>
			<form:label path="creator">Description</form:label>
			<form:errors path="creator" />
			<form:textarea path="creator"  value="${language.creator}"/>
			
		</p>
		<p>
			<form:label path="currentVersion">Version</form:label>
			<form:errors path="currentVersion" />
			<form:input path="currentVersion"  value="${language.currentVersion}"/>
		</p>
		<input type="submit" value="Submit" />
</form:form>
</container>

</body>
</html>