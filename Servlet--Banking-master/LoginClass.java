
package maddy;
   import java.sql.*;  

public class LoginClass {
    
public static boolean validate(String accountnumber,String name , String pass){  
boolean status=false;  
try{  
Class.forName("org.apache.derby.jdbc.ClientDriver");  
Connection con=DriverManager.getConnection(  
"jdbc:derby://localhost:1527/Banking ","madan","madan");  
      
PreparedStatement ps=con.prepareStatement(  
"select * from MADAN.REGISTER where ACCOUNTNUMBER=? and NAME=? and PASSWORD=?");  
ps.setString(1,accountnumber);  
ps.setString(2,name);  
ps.setString(3, pass);
      
ResultSet rs=ps.executeQuery();  
status=rs.next();  
          
}catch(Exception e){System.out.println(e);}  
return status;  
}  
} 
    
    

