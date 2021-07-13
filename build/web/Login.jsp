<%-- 
    Document   : Login
    Created on : Jun 25, 2021, 11:01:24 PM
    Author     : Raushan PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="css/login.css">
    </head>
    <body>
        <div class="background">
            <div class="center">
             <img src="img/logo.jpg" id="profilepic">
                <br><br>
             <h2>Leave Management System</h2>
                <h3> user login </h3>
             <form action="LoginServlet" method="POST">
              <div>
                  <input type="text" name="empid" class="inputbox" placeholder="Employee ID" required="">
              </div>
              <br>
              <div>
                  <input type="password" name="password" class="inputbox" placeholder="Password" required="">
              </div>
              <br>
              <br>
              <div>
                  <input type="submit" value="LOGIN" /><br>
                  <input type="reset" value="Clear" />
              </div>
             </form> <br>
            </div>
         </div>
    </body>
</html>
