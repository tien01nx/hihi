/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Model.User;
import static techmaser.TechMaser.users;

/**
 *
 * @author ADMIN
 */
public class Login extends javax.swing.JFrame {
int dem = 0;
    /**
     * Creates new form Login
     */
    public Login() {
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
        txtUsername = new javax.swing.JTextField();
        checkUsername = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        checkPassword = new javax.swing.JLabel();
        txtForgotPassword = new javax.swing.JLabel();
        txtRegister = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/img.png"))); // NOI18N

        jLabel2.setText("Tài khoản:");

        jLabel3.setText("icon");

        checkUsername.setForeground(new java.awt.Color(255, 0, 0));
        checkUsername.setText("checkUsername");

        jLabel5.setText("Mật khẩu:");

        jLabel6.setText("icon");

        checkPassword.setForeground(new java.awt.Color(255, 0, 51));
        checkPassword.setText("jLabel4");

        txtForgotPassword.setForeground(new java.awt.Color(0, 255, 102));
        txtForgotPassword.setText("Quên mật khẩu");
        txtForgotPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtForgotPasswordMouseClicked(evt);
            }
        });

        txtRegister.setForeground(new java.awt.Color(255, 0, 0));
        txtRegister.setText("Đăng Ký");
        txtRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtRegisterMouseClicked(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(51, 204, 255));
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Đăng Nhập");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(txtForgotPassword))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                                .addComponent(txtRegister)
                                .addGap(75, 75, 75))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkPassword)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkUsername)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(btnLogin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3))
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6))
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkPassword)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtForgotPassword)
                    .addComponent(txtRegister))
                .addGap(18, 18, 18)
                .addComponent(btnLogin)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtForgotPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtForgotPasswordMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        ForgotPassword forgot = new ForgotPassword();
        forgot.setVisible(true);
    }//GEN-LAST:event_txtForgotPasswordMouseClicked

    private void txtRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRegisterMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        Register register = new Register();
        register.setVisible(true);
    }//GEN-LAST:event_txtRegisterMouseClicked

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String username = txtUsername.getText();
        String password = new String(txtPassword.getPassword());
        StringBuilder sb = new StringBuilder();

        if (username.equals("")) {
            checkUsername.setText("Tài khoản không được để trống");
            checkUsername.requestFocus();
        } else {
            checkUsername.setText("");
        }
        //
        if (password.equals("")) {
            checkPassword.setText("Mật khẩu không được để trống");
            checkPassword.requestFocus();
        } else {
            checkPassword.setText("");
            for (User u : users) {

                if (u.getUsername().equals(username) && u.getPassword().equals(password)) {
                    //flag= false;
                    this.setVisible(false);
                    Account manageView = new Account();
                    manageView.setVisible(true);

                } else {
                    checkPassword.setText("Tài khoản hoặc mật khẩu không chính xác");
                    dem++;
                }

            }
        }

        //          JOptionPane.showConfirmDialog(this, users.toString() );

//        if (dem == 3) {
//            this.setVisible(false);
//            Register manageView = new Register();
//            manageView.setVisible(true);
//        }
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel checkPassword;
    private javax.swing.JLabel checkUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel txtForgotPassword;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JLabel txtRegister;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
