<%-- 
    Document   : UserLeaveReq
    Created on : Jun 26, 2021, 10:43:22 PM
    Author     : Raushan PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <head>
        <title>Request A Leave</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/user.css"
    </head>
    </head>
    <body>
        <div class="sidebar">
        <a class="active" href="UserLeaveReq.jsp">Request A Leave</a>
        <a href="UserLeaveInfo.jsp">My Remaining Leaves</a>
        <a href="UserLeaveHistory.jsp">My Leaves</a>
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
        <h2>Request A Leave</h2>
        <form action="LeaveRequestServlet" method="POST">
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
                    <td>Emp Name:</td>
                    <td><input id="ipt" type="text" name="empname" required=""></td>
                </tr>
                <tr>
                    <td><br></td>
                </tr>
                <tr>
                    <td>From Date:</td>
                    <td><input id="ipt" type="date" name="frm" required=""></td>
                </tr>
                <tr>
                    <td><br></td>
                </tr>
                <tr>
                    <td>To Date:</td>
                    <td><input id="ipt" type="date" name="to" required=""></td>
                </tr>
                <tr>
                    <td><br></td>
                </tr>
                <tr>
                    <td>Reason For Leave:</td>
                    <td><textarea id="ipt" name="reason" rows="4" cols="20" required=""></textarea></td>
                </tr>
                <tr>
                    <td><br></td>
                </tr>
                <tr>
                    <td>Leave Type:</td>
                    <td>
                        <select id="ipt" name="type">
                            <option value="casual">Causal Leave</option>
                            <option value="medical">Medical Leave</option>
                            <option value="annual">Annual Leave</option>
                        </select>
                    </td>
                </tr>
            </table>
            </center>
            <br>
            <center>
                <input class="submit" type="submit" value="Submit" />
                <input class="reset" type="reset" value="Cancel" />
            </center>
        </form>
        </div>
    </body>
</html>

