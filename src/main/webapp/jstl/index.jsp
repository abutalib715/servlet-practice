<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 10/7/2023
  Time: 12:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Index Page</title>
</head>
<body>

<%--1. Out tag--%>
<%--2. Set tag - set variable--%>
<c:set var="i" value="45" scope="application"></c:set>
<c:out value="${i}"></c:out>

<%--2. Remove tag - remove variable--%>
<%--<c:remove var="i"></c:remove>--%>
<c:out value="${i}">This is default value</c:out>

<%--2. If tag --%>
<c:if test="${i == 45}">
    <h4>Yes i is 45</h4>
</c:if>

<%--Switch Case--%>
<c:choose>
    <c:when test="${i >10}">
        <h4>I is greater than 10</h4>
    </c:when>
    <c:when test="${i <10}">
        <h4>I is less than 10</h4>
    </c:when>
    <c:otherwise>
        <h4>I is equal to 10</h4>
    </c:otherwise>
</c:choose>


<%--foreach tag--%>
<c:forEach var="j" begin="1" end="10">
    <h5>The value of j is <c:out value="${j}"></c:out></h5>
</c:forEach>

<%--URL Making--%>
<c:url var="myurl" value="http://www.google.com">
    <c:param name="q" value="abutalib java deleloper"></c:param>
</c:url>

<%--Redirect--%>
<c:redirect url="${myurl}"></c:redirect>
</body>
</html>
