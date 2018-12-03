
package com.beans;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;


public class Registration extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String Error = "error";
    private static final String Success = "success";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        Connector cn = new Connector();
        Connection con = cn.createConnection();
        
        SignupPageBean rBean = (SignupPageBean)form;
        String Email = rBean.getEmail();
        String Password = rBean.getPassword();
        String Username = rBean.getUsername();
        String PhoneNumber = rBean.getPhoneNumber();
        String msg;
        Statement CheckUserID = con.createStatement();
        ResultSet rs = CheckUserID.executeQuery("SELECT USERNAME From REGISTER WHERE USERNAME='"+Username+"'");
        if(rs.next()){
            msg = "Specified userID alredy exist";
            request.setAttribute("errmsg", msg);
            return mapping.findForward(Error);
        }
        else {
            
            String InsertQuery = "INSERT INTO REGISTER VALUES ('"+Email+"' , '"+Password+"' , '"+Username+"' , '"+PhoneNumber+"' ) ";
            System.out.println(InsertQuery);
            Statement addUser = con.createStatement();
            addUser.executeUpdate(InsertQuery);
            request.setAttribute("NewUser", Username);
            return mapping.findForward(Success);
        }
        
        
        
        
        
    
    }
}
