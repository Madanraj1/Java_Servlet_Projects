
package maddy;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DisplayBalance extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           String accountnumber = request.getParameter("accountnumber");
            String name = request.getParameter("name");
            out.println("Welcome  " + name  + "<br>");
            Class.forName("org.apache.derby.jdbc.ClientDriver");  
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/Banking ","madan","madan");  
            PreparedStatement ps=con.prepareStatement("select * from MADAN.REGISTER WHERE ACCOUNTNUMBER = '"+accountnumber+"'");
             ResultSet rs;
            rs = ps.executeQuery();
            while(rs.next()){
                int account =rs.getInt("ACCOUNTNUMBER");
                String username = rs.getString("NAME");
                int Amount = rs.getInt("AMOUNT");
                int Phone = rs.getInt("PHONE");
                
                 out.println("Account Number :" + account + "<br>");
                 out.println("Name : "+ username  + "<br>");
                 out.println("Amount :" + Amount  + "<br>");
                 out.println("Phone :" + Phone);
                 break;
            }
           
        }
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(DisplayBalance.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DisplayBalance.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(DisplayBalance.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DisplayBalance.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
