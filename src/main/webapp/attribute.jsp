<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<div class="container">
    <h1>My Form</h1>
    <form action="servlet-one">
        N1: <input type="text" name="n1">
        N2: <input type="text" name="n2">

        <button type="submit">Submit</button>
    </form>
</div>
</body>
</html>