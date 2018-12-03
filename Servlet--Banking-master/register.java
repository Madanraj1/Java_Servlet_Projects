
package maddy;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class register extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException , NamingException , SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
          out.println("1");
            Connector cn = new Connector();
            out.println("2");
            Connection con = cn.createConnection();
            out.println("3");
            
            String accountnumber = request.getParameter("account");
            String name = request.getParameter("name");
            String password = request.getParameter("password");
            String repassword = request.getParameter("repassword");
            String amount  = request.getParameter("amount");
            String address = request.getParameter("address");
            String phone = request.getParameter("phone");
            String msg;
            Statement CheckUserID = con.createStatement();
            out.println("4");
            ResultSet rs = CheckUserID.executeQuery("Select ACCOUNTNUMBER From REGISTER WHERE ACCOUNTNUMBER='"+accountnumber+"' ");
            out.println("5");
            
            if(rs.next()){
                msg = "Specified userID already exist";
                request.setAttribute("errmsg", msg);
                response.sendRedirect("errorpage.jsp");
                out.println("6");
            }else{
                String insertquery = "INSERT INTO MADAN.REGISTER VALUES ('"+accountnumber+"','"+name+"','"+password+"','"+amount+"','"+address+"','"+phone+"') ";
               out.println("7");
                System.out.print(insertquery);
                out.println("8");
                Statement addUser = con.createStatement();
                out.println("9");
                addUser.executeUpdate(insertquery);
                out.println("10");
                request.setAttribute("NewUser", name);
                response.sendRedirect("success.jsp");
            }
            
        }
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (NamingException ex) {
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (NamingException ex) {
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
