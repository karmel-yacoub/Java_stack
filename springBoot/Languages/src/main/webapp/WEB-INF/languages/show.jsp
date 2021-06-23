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
<a href="/languages">Dashboard</a>

<p><c:out value="${language.name}"/></p>
<p><c:out value="${language.creator}"/></p>
<p><c:out value="${language.currentVersion}"/></p>

<a href="/languages/${language.id}/edit">Edit</a>
<a href="/languages/delete/${language.id}">Delete</a>

</body>
</html>