<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>New Product</h1>
 <form:form action="/product" method="post" modelAttribute="product">
		<p>
			<form:label path="name">Name</form:label>
			<form:errors path="name" />
			<form:input path="name" />
		</p>
		<p>
			<form:label path="description">Description</form:label>
			<form:errors path="description" />
			<form:textarea path="description" />
		</p>
		<p>
			<form:label path="price">price</form:label>
			<form:errors path="price" />
			<form:input type="text" path="price"/>
		</p>
		<input type="submit" value="Create"/>
	</form:form>
</body>
</html>