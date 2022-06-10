<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/styles.css"/>
</head>
<body>
	<h1> JSTL DEMO</h1>
	
	<h1> Display value from controller</h1>
	
	<p> <c:out value="${jspPetName }"></c:out></p>
	<p> ${jspPetName } </p>
	<p> ${jspAge }</p>
	
	<h1> If-statement</h1>
		<p> ${isAlive } </p>
		<c:if test="${isAlive == true}">
			<p> ${jspPetName } is not dead.</p>
		</c:if>
		
		<c:if test="${isThirsty == true}">
			<p> ${jspPetName } is thirsty.</p>
		</c:if>
		
	<h1> If-else statement</h1>
		<c:choose>
			<c:when test="${jspAge > 10}">
				<p> ${jspPetName } is old. </p>
			</c:when>
			<c:otherwise>
				<p> ${jspPetName } is young </p>
 			</c:otherwise>
		</c:choose>

	<h1> for-loop</h1>
	<h5> Hard coded loop</h5>
	<ul>
		<li> ${jspRides.get(0) }</li>
		<li> ${jspRides.get(1) }</li>
		<li> ${jspRides.get(2) }</li>
	</ul>
	
	<h5> real loop</h5>
	<ul>
		<c:forEach var="eachRide" items="${jspRides }">
			<li class="redText"> <c:out value="${eachRide }"></c:out> </li>
		</c:forEach>
	</ul>
	
	
	<button class="btn btn-danger"> Testing bootstrap</button>
	
	
</body>
</html>