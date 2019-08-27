<%--
  Created by IntelliJ IDEA.
  User: Раимбек
  Date: 03.08.2019
  Time: 21:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<SCRIPT LANGUAGE="JavaScript">
    <!--
    function button1()
    {
        document.form1.command.value = "to_add_car";
        form1.submit();
    }
    function button2()
    {
        document.form1.command.value = "to_car_list";
        form1.submit();
    }
    function button3()
    {
        document.form1.command.value = "add_car";
        form1.submit();
    }

    // -->
</SCRIPT>
<form name="form1" action="controller" method="post">
    <input type="hidden" name="command">
        <head>
            <title>Taxi Park Application</title>
            <tr>
                <td>
                    <div>
                        <h2>
                            <div>
                                <input type="button" value="Add New Car" onclick="button1()">
                                <input type="button" value="List All Cars" onclick="button2()">
                            </div>
                        </h2>
                    </div>
                </td>
            </tr>
        </head>
    <body>
    <table border="1" cellpadding="5">
        <tr>
            <td>Mark:</td>
            <td><input type="text" name="mark"></td>
        </tr>
        <tr>
            <td>Model:</td>
            <td><input type="text" name="model"></td>
        </tr>
        <tr>
            <td>Year:</td>
            <td><input type="text" name="year"></td>
        </tr>
        <tr>
            <td>Color:</td>
            <td><input type="text" name="color"></td>
        </tr>
        <tr>
            <td>
                <input type="button" value="Save" onclick="button3()">
            </td>
        </tr>
    </table>
    </body>
</form>
</html>
