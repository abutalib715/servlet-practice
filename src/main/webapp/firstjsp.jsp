<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 9/16/2023
  Time: 4:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>First JSP Page</title>
</head>
<body>
<h1>My First JSP Page</h1>

<%@ include file="header.jsp" %>
<%!
    int a = 10;
    int b = 39;
    String name = "Abu Talib";

    public int doSum(int a, int b) {
        return a + b;
    }

    public String reverse(String name) {
        StringBuffer sb = new StringBuffer(name);
        return sb.reverse().toString();
    }
%>

<%
    out.println(a);
    out.println(b);
    out.println(doSum(a, b));
    out.println(reverse(name));
%>

<h1>Sum is: <%= doSum(a, b) %>
</h1>


<h2>TAGLIB INFO</h2>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="fullname" value="Abu Talib"></c:set>
<c:out value="${fullname}"></c:out>
<c:if test="${7>6}">
    <h3>Condition true</h3>
</c:if>

</body>
</html>
