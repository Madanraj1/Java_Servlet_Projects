
package com.beans;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;


public class WelcomePageAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String ExistingUser = "existinguser";
    private static final String NewUser = "newuser";
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
         
        HomePageBean HPB = (HomePageBean)form;
        String str1 = HPB.getR1();
        
         
            if(str1.equals("ExistingUser")){
                
                return mapping.findForward(ExistingUser);
                
            }
            else {
                
            return mapping.findForward(NewUser);
            }
    }
       
    
}
