<%--
  Created by IntelliJ IDEA.
  User: Раимбек
  Date: 29.07.2019
  Time: 18:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>

<head>
    <title>Taxi Park Management Application</title>
</head>
<body>
<form  name = "form1" action="controller" method="post">
    <INPUT TYPE="HIDDEN" NAME="command">
    <table border="1" cellpadding="5">
        <tr><td>Main Menu</td></tr>
        <tr>
            <td>
                    <input type="button" value="Add New Car" onclick="button1()">
            </td>
        </tr>
        <tr>
            <td>
                    <input type="button" value="List All Cars" onclick="button2()">
            </td>
        </tr>
    </table>
</form>
<SCRIPT LANGUAGE="JavaScript">
    <!--
    function button1()
    {
        document.form1.command.value= "to_add_car";
        form1.submit();
    }
    function button2()
    {
        document.form1.command.value = "to_car_list";
        form1.submit();
    }
    // -->
</SCRIPT>
</body>
</html>
