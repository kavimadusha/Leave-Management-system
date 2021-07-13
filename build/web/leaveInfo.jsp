<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : EmpL
    Created on : Jun 26, 2021, 4:19:25 PM
    Author     : Raushan PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Employee Leave Info</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/admin.css"
    </head>
    <body>
        <div class="sidebar">
        <a href="Admin.jsp">Leave Requests</a>
        <a class="active" href="leaveInfo.jsp">leave Info</a>
        <a href="ManEmp.jsp">Manage Employee</a>
        <a href="RequestLeave.jsp">Request A Leave</a>
        <a href="MyLeaves.jsp">My Leaves</a>
        <a href="ChangePassword.jsp">Change Password</a>
        </div>



        <div class="content">
            <table>
                <tr>
                  <td><img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSgDjAhlxkHCZYVBPMe6XaQ4oWRR2o-c8hMWPaeotGZ9O_0a-u5aqGEWO4zDie8yAFNTg&usqp=CAU" width="200" hight="250"></td>
                  <td><h1>Leave Management System</h1></td>
                  <td><button class="logout" onclick="location.href='Login.jsp'" ><b>Log Out</b></button></td>
                </tr>
            </table>
        <hr>
        <h2>Check Employee Leave Status</h2>
        <table id="emp" border="1">
            <thead>
                <tr>
                    <th>Emp Id</th>
                    <th>Emp Name</th>
                    <th>Remaining Casual Leaves</th>
                    <th>Remaining Medical Leaves</th>
                    <th>Remaining Annual Leaves</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>10535</td>
                    <td>John Deo</td>
                    <td>05 Days</td>
                    <td>07 Days</td>
                    <td>12 Days</td>
                </tr>
                <tr>
                    <td>19245</td>
                    <td>Jane Deo</td>
                    <td>06 Days</td>
                    <td>07 Days</td>
                    <td>10 Days</td>
                </tr>
                <tr>
                    <td>13225</td>
                    <td>Brian Cooper</td>
                    <td>07 Days</td>
                    <td>04 Days</td>
                    <td>13 Days</td>
                </tr>
            </tbody>
        </table>
    </body>
</html>
