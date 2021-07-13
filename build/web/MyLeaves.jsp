<%-- 
    Document   : MyLeaves
    Created on : Jun 26, 2021, 9:07:39 PM
    Author     : Raushan PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>My Leaves</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/admin.css"
    </head>
    <body>
        <div class="sidebar">
        <a href="Admin.jsp">Leave Requests</a>
        <a href="leaveInfo.jsp">leave Info</a>
        <a href="ManEmp.jsp">Manage Employee</a>
        <a href="RequestLeave.jsp">Request A Leave</a>
        <a class="active" href="MyLeaves.jsp">My Leaves</a>
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
        <h2>My Leaves</h2>
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
                    <td>28/06/2021</td>
                    <td>29/06/2021</td>
                    <td>02 Days</td>
                    <td>Annual Leave</td>
                    <td>Family Function</td>
                    <td>PENDING...</td>
                </tr>
                <tr>
                    <td>21/05/2021</td>
                    <td>22/05/2021</td>
                    <td>02 Days</td>
                    <td>Medical Leave</td>
                    <td>Medical Checkup</td>
                    <td>APPROVED</td>
                </tr>
                <tr>
                    <td>03/03/2021</td>
                    <td>06/03/2021</td>
                    <td>03 Days</td>
                    <td>Annual Leave</td>
                    <td>Trip</td>
                    <td>DECLINED</td>
                </tr>
                <tr>
                    <td>12/02/2021</td>
                    <td>12/02/2021</td>
                    <td>01 Day</td>
                    <td>Casual Leave</td>
                    <td>Birthday Event.</td>
                    <td>APPROVED</td>
                </tr>  
            </tbody>
        </table>
        </div>
</body>
</html>
