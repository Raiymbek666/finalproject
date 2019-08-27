<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Раимбек
  Date: 04.08.2019
  Time: 12:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<SCRIPT LANGUAGE="JavaScript">
    <!--
    function button1()
    {
        document.form1.command.value = "edit_car";
        form1.submit();
    }

    // -->
</SCRIPT>
<form name="form1" type="controller" method="post">
    <%--<input type="hidden" name="command">--%>
    <head>

    </head>

    <body>
        <table border="1" cellpadding="5" name = "table1">
            <%--<c:forEach var="car" items="${listCar}">--%>
            <tr>
                <td>ID:</td>
                <td><input type="text" name="car_id" value="${car.carId}" readonly></td>
            </tr>
            <tr>
                <td>Mark:</td>
                <td><input type="text" name="mark" value="${car.mark}"></td>
            </tr>
            <tr>
                <td>Model:</td>
                <td><input type="text" name="model" value="${car.model}"></td>
            </tr>
            <tr>
                <td>Year:</td>
                <td><input type="text" name="year" value="${car.year}"></td>
            </tr>
            <tr>
                <td>Color:</td>
                <td><input type="text" name="color" value="${car.color}"></td>
            </tr>
            <tr>
                <td>
                    <input type="submit" value="Save">
                    <input type="hidden" name="command" value="edit_car">
                        <%--<input type="button" value="Save" onclick="button1()">--%>
                </td>
            </tr>
            <%--</c:forEach>--%>
        </table>
    </body>
</form>
</html>
