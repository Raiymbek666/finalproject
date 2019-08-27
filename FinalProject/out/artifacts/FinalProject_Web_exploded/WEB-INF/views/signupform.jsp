<%--
  Created by IntelliJ IDEA.
  User: raiymbek
  Date: 2019-08-04
  Time: 21:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<form name="form1" action="controller" method="post">
    <INPUT TYPE="HIDDEN" NAME="command">
<SCRIPT LANGUAGE="JavaScript">
    <!--
    function button1()
    {
        document.form1.command.value = "sign_up";
        form1.submit();
    }
    // -->
</SCRIPT>
<head>
    <title>Signup</title>
</head>
<body>

    <table border="1" cellpadding="5">
        <tr>
            <th>Name</th>
            <th><input type="text" name="name"></th>
        </tr>
        <tr>
            <th>Surname</th>
            <th><input type="text" name="surname"></th>
        </tr>
        <tr>
            <th>Login</th>
            <th><input type="text" name="login"></th>
        </tr>
        <tr>
            <th>Password</th>
            <th><input type="password" name="password"></th>
        </tr>
        <tr>
            <th><input type="reset" value="Reset"></th>
            <th><input type="button" value="Sign Up" onclick="button1()"></th>
        </tr>
    </table>
</body>
</form>
</html>
