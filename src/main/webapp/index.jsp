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
<%--    <a href="web">First Servlet</a>--%>
<%--    <a href="second">Second Servlet</a>--%>
<%--    <a href="third">Third Servlet</a>--%>
<div class="container">
    <h1>My Form</h1>
    <form action="register" method="post">
        <table>
            <tr>
                <td>Enter Your Name:</td>
                <td><input type="text" name="userName" placeholder="Enter name here"></td>
            </tr>
            <tr>
                <td>Enter Your Password:</td>
                <td><input type="password" name="userPassword" placeholder="Enter password here"></td>
            </tr>
            <tr>
                <td>Enter Your Password:</td>
                <td><input type="text" name="userEmail" placeholder="Enter email here"></td>
            </tr>
            <tr>
                <td>Select Gender</td>
                <td>
                    <input type="radio" name="gender" value="male">Male &nbsp;
                    <input type="radio" name="gender" value="female">Female
                </td>
            </tr>
            <tr>
                <td>Select Course</td>
                <td>
                    <select name="course" id="course">
                        <option value="php">PHP</option>
                        <option value="java">Java</option>
                        <option value="python">Python</option>
                        <option value="css">CSS</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>
                    <input type="checkbox" name="terms" value="checked">
                </td>
                <td>
                    Accept Terms & Condition
                </td>
            </tr>
            <tr>
                <td></td>
                <td>
                    <button type="submit">Submit</button>
                    <button type="reset">Reset</button>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>