<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 9/1/2023
  Time: 9:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sign Up</title>
</head>
<body>
<form action="register">
    <input type="text" name="username" placeholder="Username"><br><br>
    <input type="password" name="password" placeholder="Password"><br><br>
    <input type="email" name="email" placeholder="Email"><br><br>

    <button type="submit">Submit</button>
</form>

<div class="loader" style="display: none">
    Please Wait...
</div>

<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
<script>
    $(document).ready(function(){
        console.log("Page is ready");
    })
</script>
</body>
</html>
