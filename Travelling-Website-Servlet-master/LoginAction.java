
package com.beans;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;


public class LoginAction extends org.apache.struts.action.Action {

  
    private static final String Customer = "customer";
    private static final String Error = "error";
   
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        LoginBean LG = (LoginBean)form;
        String username = LG.getUsername();
        String password = LG.getPassword();
        
        if(username.equals("madan") && password.equals("madan")){
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            return mapping.findForward(Customer);
            
        }
        
        else{
            return mapping.findForward(Error);
        }
        
       
    }
}
