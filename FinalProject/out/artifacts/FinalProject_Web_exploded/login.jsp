<%--
  Created by IntelliJ IDEA.
  User: Раимбек
  Date: 29.07.2019
  Time: 17:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<SCRIPT LANGUAGE="JavaScript">
    <!--
    function button1()
    {
        document.form1.command.value = "to_sign_up";
        form1.submit();
    }
    function button2()
    {
        document.form1.command.value = "to_cabinet";
        form1.submit();
    }

    // -->
</SCRIPT>


<head>

</head>
<body>
<form name="form1" action="controller" method="post">
    <input type="hidden" name="command" value="to_cabinet"/>
    <table border="1" cellpadding="5">
        <tr>
            <td>Enter Login</td>
            <td><input type="text" name="login"></td>
        </tr>
        <tr>
            <td>Enter password</td>
            <td><input type="password" name="password"></td>
        </tr>
        <tr>
            <td><input type="button" value="Sign Up" onclick="button1()"></td>
            <td><input type="button" value="Login" onclick="button2()"></td>

        </tr>
    </table>
</form>
</body>
</html>