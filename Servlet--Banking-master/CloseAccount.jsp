<%-- 
    Document   : HomePage
    Created on : Jul 22, 2018, 1:21:24 PM
    Author     : Navkaar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="homepage.css">
        <title>Colose account Form</title>
    </head>
    <body>
        <form action="CloseAccount" method="post">
        <table id="customers">
  <tr>
    <th>Close Account</th>
    <th>Form</th>
    
  </tr>
  
  <tr>
  <td> Name </td>
  <td><input type="text" name="name"/></td>
   
  </tr>
  <tr>
    <td>Account Number </td>
    <td><input type="text" name="accountnumber"/></td>
  </tr>
  <tr>
    <td>Password</td>
    <td><input type="text" name="password"/></td>
  </tr>
  
  <tr>
      <td><input type="submit" value="Submit"/></td>
        </tr>
</table>
        </form>
    </body>
</html>
