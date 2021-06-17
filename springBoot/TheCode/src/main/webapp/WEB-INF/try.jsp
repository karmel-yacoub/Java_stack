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
<p><c:out value="${error}"/></p>
<form action="/code" method="Post">
  <label for="code">What is the code?</label><br><br>
  <input type="text" id="code" name="code">
  <input type="submit" value="Try code">
</form>
</body>
</html>