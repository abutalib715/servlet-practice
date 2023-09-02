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
<h4 id="message"></h4>
<form action="register" id="myform">
    <input type="text" name="username" placeholder="Username"><br><br>
    <input type="password" name="password" placeholder="Password"><br><br>
    <input type="email" name="email" placeholder="Email"><br><br>

    <button type="submit">Submit</button>
</form>

<div class="loader" style="display: none">
    Please Wait...
</div>

<script src="https://code.jquery.com/jquery-3.7.1.min.js"
        integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
</body>
<script>
    $(document).ready(function () {
        console.log("Page is ready");

        $("#myform").on("submit", function (event) {
            event.preventDefault();
            var formData = $(this).serialize();
            console.log(formData);

            $(".loader").show();
            $("#myform").hide();


            $.ajax({
                url: "register",
                data: formData,
                type: "POST",
                success: function (data) {
                    console.log(data);
                    $(".loader").hide();
                    $("#myform").show();

                    if(data.trim() === "success")
                        $("#message").html("Successfully Saved");
                    else
                        $("#message").html("Something Went Wrong!");

                },
                error: function (data) {
                    console.log(data);
                    $("#message").html("Something Went Wrong!");
                    $(".loader").hide();
                    $("#myform").show();
                }
            })

        })
    })
</script>
</html>
