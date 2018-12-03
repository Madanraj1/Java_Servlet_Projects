/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billpractice;

/**
 *
 * @author user
 */
public class mainclass {
    
    public static void main(String ar[]){
        
          java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillForm().setVisible(true);
            }
        });
          
          java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm1().setVisible(true);
            }
        });
          
           java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
}
}

