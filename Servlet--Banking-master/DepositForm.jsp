

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="homepage.css">
        <title>Deposit Form</title>
    </head>
    <body>
        <form action="DepositForm" method="post">
        <table id="customers">
  <tr>
    <th>Deposit</th>
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
      <td>Amount</td>
      <td><input type="text" name="newamount"/></td>
  </tr>
  <tr>
      <td><input type="submit" value="Submit"/></td>
        </tr>
</table>
        </form>
    </body>
</html>
