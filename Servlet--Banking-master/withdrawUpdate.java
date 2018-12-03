
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


public class withdrawUpdate extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           String name = request.getParameter("name");
            out.println("Welcome " + name);
            String accountnumber = request.getParameter("accountnumber");
            int drawnAmount , amount = 0 ,  PresentAmount = 0;
            drawnAmount = Integer.parseInt(  request.getParameter("amount"));
            
            Class.forName("org.apache.derby.jdbc.ClientDriver");
           Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Banking ","madan","madan");
           PreparedStatement create = con.prepareStatement("select * from MADAN.REGISTER  WHERE ACCOUNTNUMBER = '"+accountnumber+"'");
           ResultSet rs;
           rs = create.executeQuery();
           
           while(rs.next()){
               amount = rs.getInt("AMOUNT");
           }
            if(drawnAmount < amount){
                PresentAmount = amount - drawnAmount ;
            }else{
                  response.sendRedirect("errorpage.jsp");
            }
            String str = "UPDATE MADAN.REGISTER SET AMOUNT = ?";
           //out.println("1");
           PreparedStatement ps = con.prepareStatement(str);
           //out.println("2");
           ps.setInt(1, PresentAmount);
           //out.println("3");
           int rt = ps.executeUpdate();
           
           out.println("Your account has been decreased by  --->" + drawnAmount + "<br>");
           out.println("Balance is : " + PresentAmount);
        }
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(withdrawUpdate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(withdrawUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(withdrawUpdate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(withdrawUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
