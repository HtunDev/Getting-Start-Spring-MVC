<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring MVC</title>
</head>
<body>
	<h1>Hello ! My name is Htun Dev and I'm From JDC.</h1>

	<p>
		<c:out value="${message}"></c:out>
	</p>

	<ul>
		<li><c:url value="/legacyController" var="legacyLink"></c:url> <a
			href="${legacyLink}">Legacy Controller</a></li>
	</ul>
</body>
</html>