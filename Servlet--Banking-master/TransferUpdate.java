
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


public class TransferUpdate extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
        String youraccount , targetaccount ;
        int youramount = 0 , targetamount ,transferamount = 0 ,gettingamount;
        
        youraccount = request.getParameter("accountnumber");
        targetaccount = request.getParameter("targetaccount");
        targetamount = Integer.parseInt( request.getParameter("amount"));
            
        
         Class.forName("org.apache.derby.jdbc.ClientDriver");
           Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Banking ","madan","madan");
           PreparedStatement create = con.prepareStatement("select * from MADAN.REGISTER");
           ResultSet rs;
           rs = create.executeQuery();
            while(rs.next()){
                youramount = rs.getInt("AMOUNT");
            }
            out.println("Amount to transfer" + targetamount);
            //youraccount updation
            out.println("1");
            transferamount =  youramount - targetamount;
            out.println("2");
            String str = "UPDATE MADAN.REGISTER SET AMOUNT = ? WHERE ACCOUNTNUMBER = '"+youraccount+"' ";
            out.println("3");
            PreparedStatement ps = con.prepareStatement(str);
            out.println("4");
             ps.setInt(1, transferamount);
             out.println("5");
             int rt = ps.executeUpdate();
            // out.println("amounttransferred");
             //tagetaccount updation
            
             gettingamount = transferamount;
             out.println("6");
             String str1 = "UPDATE MADAN.REGISTER SET AMOUNT = ? WHERE ACCOUNTNUMBER = '"+targetaccount+"' ";
             PreparedStatement ps1 = con.prepareStatement(str1);
             ps1.setInt(1, gettingamount);
             int rt1 = ps1.executeUpdate();
             //completed tranfering
             
             out.println("Amount transfered from :" + youraccount +"<br>" + "To" + targetaccount +"<br>"+ gettingamount);
             
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TransferUpdate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TransferUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TransferUpdate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TransferUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
