<%--
  Created by IntelliJ IDEA.
  User: Раимбек
  Date: 29.07.2019
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Taxi Park Application</title>
</head>
<body>
<center>
    <h1>Taxi Park Management Application</h1>
    <h2>
        <a href="controller?command=to_add_car">Add New Car</a>
        <a href="controller?command=to_car_list">List All Cars</a>

    </h2>
</center>
<div align="center">
    <c:if test="${car != null}">
    <form action="update" method="post">
        </c:if>
        <c:if test="${car == null}">
        <form action="insert" method="post">
            </c:if>
            <table border="1" cellpadding="5">
                <caption>
                    <h2>
                        <c:if test="${car != null}">
                            Edit Car
                        </c:if>
                        <c:if test="${car == null}">
                            Add New Car
                        </c:if>
                    </h2>
                </caption>
                <c:if test="${car != null}">
                    <input type="hidden" name="id" value="<c:out value='${car.id}' />" />
                </c:if>
                <tr>
                    <th>Mark: </th>
                    <td>
                        <input type="text" name="mark" size="45"
                               value="<c:out value='${car.mark}' />"
                        />
                    </td>
                </tr>
                <tr>
                    <th>Model: </th>
                    <td>
                        <input type="text" name="model" size="45"
                               value="<c:out value='${car.model}' />"
                        />
                    </td>
                </tr>
                <tr>
                    <th>Year: </th>
                    <td>
                        <input type="text" name="year" size="5"
                               value="<c:out value='${car.year}' />"
                        />
                    </td>
                </tr>
                <tr>
                    <th>Color: </th>
                    <td>
                        <input type="text" name="color" size="5"
                               value="<c:out value='${car.color}' />"
                        />
                    </td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="Save" />
                    </td>
                </tr>
            </table>
        </form>
</div>
</body>
</html>
