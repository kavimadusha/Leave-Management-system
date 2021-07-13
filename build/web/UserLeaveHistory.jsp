<%-- 
    Document   : UserLeaveHistory
    Created on : Jun 26, 2021, 10:55:31 PM
    Author     : Raushan PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>My Leaves</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/user.css"
    </head>
    <body>
        <div class="sidebar">
        <a href="UserLeaveReq.jsp">Request A Leave</a>
        <a href="UserLeaveInfo.jsp">My Remaining Leaves</a>
        <a class="active" href="UserLeaveHistory.jsp">My Leaves</a>
        <a href="UserChangePassword.jsp">Change Password</a>
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
        <h2>My Leave Ststus</h2>
        <table id="emp" border="1">
            <thead>
                <tr>
                    <th>From Date</th>
                    <th>To Date</th>
                    <th>No of Date</th>
                    <th>Leave Type</th>
                    <th>Reason</th>
                    <th>Status</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>05/07/2021</td>
                    <td>08/07/2021</td>
                    <td>03 Days</td>
                    <td>Casual Leave</td>
                    <td>Wedding Preparation</td>
                    <td>PENDING...</td>
                </tr>
                <tr>
                    <td>12/05/2021</td>
                    <td>13/05/2021</td>
                    <td>02 Days</td>
                    <td>Casual Leave</td>
                    <td>Family Trip</td>
                    <td>APPROVED</td>
                </tr>
                <tr>
                    <td>03/03/2021</td>
                    <td>04/03/2021</td>
                    <td>01 Days</td>
                    <td>Annual Leave</td>
                    <td>Mothers Birthday</td>
                    <td>APPROVED</td>
                </tr>
            </tbody>
        </table>
        </div>
</body>
</html>
