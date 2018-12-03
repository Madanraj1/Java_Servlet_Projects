/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billpractice;


import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.*;
public class Signup extends javax.swing.JFrame {
     
  Connection con;
  Statement st;
  PreparedStatement ps;
  
    
    public Signup() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        sign_username = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        sign_password = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        sign_companyname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        sign_phonenumber = new javax.swing.JTextField();
        sign_address = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        sign_state = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        sign_city = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(146, 230, 232));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SignUp");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(65, 183, 186));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("username");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sign_username.setBackground(new java.awt.Color(146, 230, 232));
        sign_username.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sign_username.setForeground(new java.awt.Color(255, 255, 255));
        sign_username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sign_username.setText("Username");
        sign_username.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        sign_username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sign_usernameMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Password");
        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sign_password.setBackground(new java.awt.Color(146, 230, 232));
        sign_password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sign_password.setForeground(new java.awt.Color(255, 255, 255));
        sign_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sign_password.setText("Password");
        sign_password.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        sign_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sign_passwordMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CompanName");
        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sign_companyname.setBackground(new java.awt.Color(146, 230, 232));
        sign_companyname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sign_companyname.setForeground(new java.awt.Color(255, 255, 255));
        sign_companyname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sign_companyname.setText("CompanyName");
        sign_companyname.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        sign_companyname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sign_companynameMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PhoneNumber");
        jLabel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sign_phonenumber.setBackground(new java.awt.Color(146, 230, 232));
        sign_phonenumber.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sign_phonenumber.setForeground(new java.awt.Color(255, 255, 255));
        sign_phonenumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sign_phonenumber.setText("Phonenumber");
        sign_phonenumber.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        sign_phonenumber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sign_phonenumberMouseClicked(evt);
            }
        });

        sign_address.setBackground(new java.awt.Color(146, 230, 232));
        sign_address.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sign_address.setForeground(new java.awt.Color(255, 255, 255));
        sign_address.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sign_address.setText("Address");
        sign_address.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        sign_address.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sign_addressMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Address");
        jLabel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("State");
        jLabel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sign_state.setBackground(new java.awt.Color(146, 230, 232));
        sign_state.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sign_state.setForeground(new java.awt.Color(255, 255, 255));
        sign_state.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sign_state.setText("State");
        sign_state.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        sign_state.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sign_stateMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("City");
        jLabel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sign_city.setBackground(new java.awt.Color(146, 230, 232));
        sign_city.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sign_city.setForeground(new java.awt.Color(255, 255, 255));
        sign_city.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sign_city.setText("City");
        sign_city.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        sign_city.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sign_cityMouseClicked(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(65, 183, 186));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(224, 205, 83));
        jButton1.setText("CreateAccount");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(sign_city, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(sign_username, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(sign_password, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(sign_companyname, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(sign_phonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(sign_address, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(sign_state, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sign_username)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sign_password)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sign_companyname)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sign_phonenumber)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sign_address)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sign_state)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(sign_city)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      String username,password,companyname,phonenumber,address,state,city;
      
      try{
          username = sign_username.getText();
          password = sign_password.getText();
          companyname = sign_companyname.getText();
          phonenumber = sign_phonenumber.getText();
          address = sign_address.getText();
          state = sign_state.getText();
          city = sign_state.getText();
          
          
          
         Class.forName("org.apache.derby.jdbc.ClientDriver");
         con = DriverManager.getConnection("jdbc:derby://localhost:1527/billprint","madan","madan");
         st = con.createStatement();
         ps = con.prepareStatement("INSERT INTO MADAN.USERDATABASE VALUES(?,?,?,?,?,?,?)");
         
          
         ps.setString(1,username);
         ps.setString(2,password);
         ps.setString(3,companyname);
         ps.setString(4,phonenumber);
         ps.setString(5,address);
         ps.setString(6,state );
         ps.setString(7,city);
         ps.executeUpdate();
         
         CloseMe();
         LoginForm1 obj = new LoginForm1();
         obj.setVisible(true);
      }catch(Exception e){
          
          
      }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void sign_usernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sign_usernameMouseClicked
       sign_username.setText("");
    }//GEN-LAST:event_sign_usernameMouseClicked

    private void sign_passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sign_passwordMouseClicked
        sign_password.setText("");
    }//GEN-LAST:event_sign_passwordMouseClicked

    private void sign_companynameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sign_companynameMouseClicked
       sign_companyname.setText("");
    }//GEN-LAST:event_sign_companynameMouseClicked

    private void sign_phonenumberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sign_phonenumberMouseClicked
        sign_phonenumber.setText("");
    }//GEN-LAST:event_sign_phonenumberMouseClicked

    private void sign_addressMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sign_addressMouseClicked
       sign_address.setText("");
    }//GEN-LAST:event_sign_addressMouseClicked

    private void sign_stateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sign_stateMouseClicked
       sign_state.setText("");
    }//GEN-LAST:event_sign_stateMouseClicked

    private void sign_cityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sign_cityMouseClicked
       sign_city.setText("");
    }//GEN-LAST:event_sign_cityMouseClicked

   
   private void CloseMe(){
        WindowEvent meClose = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(meClose);
        
        
    }     
        
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField sign_address;
    private javax.swing.JTextField sign_city;
    private javax.swing.JTextField sign_companyname;
    private javax.swing.JTextField sign_password;
    private javax.swing.JTextField sign_phonenumber;
    private javax.swing.JTextField sign_state;
    private javax.swing.JTextField sign_username;
    // End of variables declaration//GEN-END:variables
}
