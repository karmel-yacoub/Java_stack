<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Submitted Info</h1>
    <p>Your Name : <c:out value="${name}"/></p>
    <p>Dojo Location: <c:out value="${location}"/></p>
    <p>Favorite Language: <c:out value="${favlanguage}"/></p>
    <p>Comment (optional): <c:out value="${comment}"/></p>
</body>
</html>