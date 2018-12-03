
package maddy;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DepositUpdate extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            int PreviousAmount = 0 , NewAmount , PresentAmount;
            
            NewAmount = Integer.parseInt( request.getParameter("newamount"));
            String name = request.getParameter("name");
            
            out.println("Welcome  " + name  + "<br>");
            
           Class.forName("org.apache.derby.jdbc.ClientDriver");
           Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Banking ","madan","madan");
           PreparedStatement create = con.prepareStatement("select * from MADAN.REGISTER");
           ResultSet rs;
           rs = create.executeQuery();
           
           while(rs.next()){
               int accountnumber = rs.getInt("ACCOUNTNUMBER");
               PreviousAmount = rs.getInt("AMOUNT");
           
            out.println("AccountNumber : " + accountnumber + "<br>");
            out.println("Previous amount :" + PreviousAmount + "<br>");
            out.println("New Amount : "+ NewAmount + "<br>");
           
          // out.println("0");
           PresentAmount = NewAmount + PreviousAmount ;
         // out.println("0");
           String str = "UPDATE MADAN.REGISTER SET AMOUNT = ? WHERE ACCOUNTNUMBER = '"+accountnumber+"' ";
           //out.println("1");
           PreparedStatement ps = con.prepareStatement(str);
           //out.println("2");
           ps.setInt(1, PresentAmount);
           //out.println("3");
           int rt = ps.executeUpdate();
          // out.println("4");
           out.println("Amount Deposited <br>");
         //  out.println("6");
           out.println("PresentAmount :" + PresentAmount);
           con.close();
           }
            
    }
    }
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DepositUpdate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DepositUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DepositUpdate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DepositUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
