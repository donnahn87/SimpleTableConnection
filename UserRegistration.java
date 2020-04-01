/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpletableconnection;
import java.sql.Connection;
import java.sql.*;  
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.Random;
/**
 *
 * @author Vinay
 */
public class UserRegistration extends javax.swing.JFrame {

    /**
     * Creates new form userFrame
     */
    public UserRegistration() {
        initComponents();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_fullName = new javax.swing.JTextField();
        txt_username = new javax.swing.JTextField();
        txt_address = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        txt_phone = new javax.swing.JTextField();
        button_userRegister = new java.awt.Button();
        button3 = new java.awt.Button();
        button_AlreadyRegistered = new java.awt.Button();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(436, 498));
        getContentPane().setLayout(null);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Full Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(175, 70, 80, 20);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(175, 115, 59, 16);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(175, 160, 58, 16);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(190, 210, 50, 16);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Address");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(180, 250, 48, 16);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Phone");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(185, 300, 36, 16);

        txt_fullName.setBackground(new java.awt.Color(102, 102, 102));
        txt_fullName.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_fullName);
        txt_fullName.setBounds(140, 84, 130, 24);

        txt_username.setBackground(new java.awt.Color(102, 102, 102));
        txt_username.setForeground(new java.awt.Color(255, 255, 255));
        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });
        getContentPane().add(txt_username);
        txt_username.setBounds(140, 130, 130, 24);

        txt_address.setBackground(new java.awt.Color(102, 102, 102));
        txt_address.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_address);
        txt_address.setBounds(140, 270, 130, 24);

        txt_email.setBackground(new java.awt.Color(102, 102, 102));
        txt_email.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_email);
        txt_email.setBounds(140, 225, 130, 24);

        txt_password.setBackground(new java.awt.Color(102, 102, 102));
        txt_password.setForeground(new java.awt.Color(255, 255, 255));
        txt_password.setMinimumSize(new java.awt.Dimension(15, 24));
        txt_password.setPreferredSize(new java.awt.Dimension(15, 24));
        getContentPane().add(txt_password);
        txt_password.setBounds(140, 175, 130, 24);

        txt_phone.setBackground(new java.awt.Color(102, 102, 102));
        txt_phone.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_phone);
        txt_phone.setBounds(140, 317, 130, 24);

        button_userRegister.setLabel("Sign up");
        button_userRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_userRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(button_userRegister);
        button_userRegister.setBounds(10, 400, 80, 40);

        button3.setActionCommand("button_clearRegister");
        button3.setLabel("Clear");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        getContentPane().add(button3);
        button3.setBounds(330, 400, 80, 40);

        button_AlreadyRegistered.setLabel("Already Registered");
        button_AlreadyRegistered.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_AlreadyRegisteredActionPerformed(evt);
            }
        });
        getContentPane().add(button_AlreadyRegistered);
        button_AlreadyRegistered.setBounds(150, 400, 120, 40);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vinay\\Desktop\\New Folder\\unknown.png")); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, -50, 430, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_AlreadyRegisteredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_AlreadyRegisteredActionPerformed
        // TODO add your handling code here:
        new UserLogin().setVisible(true);
        setVisible(false);
        //dispose(); is to delete a frame only do this when intent is to not use the frame again
    }//GEN-LAST:event_button_AlreadyRegisteredActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        // TODO add your handling code here:
        txt_username.setText("");
        txt_password.setText("");
        txt_address.setText("");
        txt_phone.setText("");
        txt_email.setText("");
        txt_fullName.setText("");
    }//GEN-LAST:event_button3ActionPerformed

    private void button_userRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_userRegisterActionPerformed
        // TODO add your handling code here:
        String username = txt_username.getText();
        String password = String.valueOf(txt_password.getPassword());
        String name = txt_fullName.getText();
        String phone = txt_phone.getText();
        String address = txt_address.getText();
        String email = txt_email.getText();
        Connection conn = null;
        PreparedStatement pstmt = null;

        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql:///customerstuff","root","And98rew");
            pstmt = conn.prepareStatement("insert into user_info values(?, ?, ?, ?, ?, ?, 0, 0, id, 0)");
            pstmt.setString(3, name);
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            pstmt.setString(4, email);
            pstmt.setString(5, address);
            pstmt.setString(6, phone);
            int i = pstmt.executeUpdate();
            if (i > 0) {
                JOptionPane.showMessageDialog(null, "Data saved");
            }
            else {
                JOptionPane.showMessageDialog(null, "Data not saved");
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        new UserLogin().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_button_userRegisterActionPerformed

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(UserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button3;
    private java.awt.Button button_AlreadyRegistered;
    private java.awt.Button button_userRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_fullName;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_phone;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
