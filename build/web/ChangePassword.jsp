<%-- 
    Document   : AdminInfo
    Created on : Jun 26, 2021, 4:19:57 PM
    Author     : Raushan PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Change Password</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/admin.css"
    </head>
    <body>
        <div class="sidebar">
        <a href="Admin.jsp">Leave Requests</a>
        <a href="leaveInfo.jsp">leave Info</a>
        <a href="ManEmp.jsp">Manage Employee</a>
        <a href="RequestLeave.jsp">Request A Leave</a>
        <a href="MyLeaves.jsp">My Leaves</a>
        <a class="active" href="ChangePassword.jsp">Change Password</a>
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
        <h2>Change Password</h2>
        <form action="ChangePasswordServlet" method="POST">
        <center>
            <table id="opt">
                <tr>
                    <td>Emp ID:</td>
                    <td><input id="ipt" type="text" name="empid"></td>
                </tr>
                <tr>
                    <td><br></td>
                </tr>
                <tr>
                    <td>Current Password:</td>
                    <td><input id="ipt" type="password" name="cpw"></td>
                </tr>
                <tr>
                    <td><br></td>
                </tr>
                <tr>
                    <td>New Password:</td>
                    <td><input id="ipt" type="password" name="npw" required=""></td>
                </tr>
                <tr>
                    <td><br></td>
                </tr>
                <tr>
                    <td>Re-Enter new Password:</td>
                    <td><input id="ipt" type="password" name="rpw" required=""></td>
                </tr>
                <tr>
                    <td><br></td>
                </tr>
            </table>
        </center>
            <br>
        <center>
            <input class="submit" type="submit" value="Change Password" />
            <input class="reset" type="reset" value="Cancel" />
        </center>
        </form>
        </div>
    </body>
</html>
