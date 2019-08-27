<%--
  Created by IntelliJ IDEA.
  User: Раимбек
  Date: 29.07.2019
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<SCRIPT LANGUAGE="JavaScript">
    <!--
    function button1()
    {
        document.form1.command.value = "delete_car";
        form1.submit();
    }
    function button2()
    {
        document.form1.command.value = "to_edit_car";
        form1.submit();
    }
    function button3()
    {
        document.form1.command.value = "to_add_car";
        form1.submit();
    }
    function button4()
    {
        document.form1.command.value = "to_car_list";
        form1.submit();
    }
    // -->
</SCRIPT>
<form name="form1" action="controller" method="post">
<input type="hidden" name="command">
<head>
    <title>Taxi Park Application</title>
        <div>
            <h2>
                <div>
                    <input type="button" value="ADD NEW CAR" onclick=button3()>
                    <input type="button" value="List All Cars" onclick=button4()>
                </div>
            </h2>
        </div>
</head>
<body>
    <div>
        <table border="1" cellpadding="5">
            <caption><h2>List of Cars</h2></caption>
            <tr>
                <th>ID</th>
                <th>Mark</th>
                <th>Model</th>
                <th>Year</th>
                <th>Color</th>
                <th>Actions</th>
            </tr>
            <c:forEach var="car" items="${listCar}">
                <tr>
                    <td><c:out value="${car.carId}" /></td>
                    <td><c:out value="${car.mark}" /></td>
                    <td><c:out value="${car.model}" /></td>
                    <td><c:out value="${car.year}" /></td>
                    <td><c:out value="${car.color}" /></td>
                    <td>
                            <input type="hidden" name="car_id" value="${car.carId}">
                            <input type="button" value="Edit" onclick="button2()">
                            <input type="button" value="Delete" onclick="button1()">
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</form>
</html>
