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
<table>
    <thead>
        <tr>
            <th>Name</th>
            <th>Creator</th>
            <th>Version</th>
            <th>action</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${languages}" var="lang">
        <tr>
            <td><a href ="/languages/${lang.id}"><c:out value="${lang.name}"/></a></td>
            <td><c:out value="${lang.creator}"/></td>
            <td><c:out value="${lang.currentVersion}"/></td>
            
            <td><a href="/languages/edit/${lang.id}">edit</a>&nbsp; &nbsp;<a href="/languages/delete/${lang.id}">delete</a></td>
        </tr>
        </c:forEach>
    </tbody>
</table>

	 <form:form action="" method="post" modelAttribute="language">
		<p>
			<form:label path="name">Name</form:label>
			<form:errors path="name" />
			<form:input path="name" />
		</p>
		<p>
			<form:label path="creator">Creator</form:label>
			<form:errors path="creator" />
			<form:textarea path="creator" />
		</p>
		<p>
			<form:label path="currentVersion">Version</form:label>
			<form:errors path="currentVersion" />
			<form:input path="currentVersion" />
		</p>
		<input type="submit" value="Submit"/>
	</form:form>

</body>
</html>