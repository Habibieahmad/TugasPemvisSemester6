/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;
import config.Connect;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.JOptionPane;

/**
 *
 * @author Habibie Ahmad
 */
public class FormLogin extends javax.swing.JFrame {
    private Connection conn = new Connect().dbConnection();    
    Icon iconError = new javax.swing.ImageIcon(getClass().getResource("/images/icon-message-error.png"));    
    /**
     * Creates new form FormLogin
     */
    public FormLogin() {
        initComponents();
        setIconFrame();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jExt = new javax.swing.JLabel();
        jMin = new javax.swing.JLabel();
        jpUsername = new javax.swing.JPanel();
        jpPassword = new javax.swing.JPanel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jpLogin = new javax.swing.JButton();
        jpIconEye = new javax.swing.JPanel();
        iShow = new javax.swing.JLabel();
        iHide = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN Pertalife");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jExt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jExt.setForeground(new java.awt.Color(153, 153, 153));
        jExt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jExt.setText("X");
        jExt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jExt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jExtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jExtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jExtMouseExited(evt);
            }
        });

        jMin.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        jMin.setForeground(new java.awt.Color(153, 153, 153));
        jMin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMin.setText("-");
        jMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMinMouseExited(evt);
            }
        });

        jpUsername.setBackground(new java.awt.Color(153, 153, 153));
        jpUsername.setForeground(new java.awt.Color(255, 255, 255));
        jpUsername.setPreferredSize(new java.awt.Dimension(100, 5));

        javax.swing.GroupLayout jpUsernameLayout = new javax.swing.GroupLayout(jpUsername);
        jpUsername.setLayout(jpUsernameLayout);
        jpUsernameLayout.setHorizontalGroup(
            jpUsernameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpUsernameLayout.setVerticalGroup(
            jpUsernameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jpPassword.setBackground(new java.awt.Color(153, 153, 153));
        jpPassword.setPreferredSize(new java.awt.Dimension(40, 5));

        javax.swing.GroupLayout jpPasswordLayout = new javax.swing.GroupLayout(jpPassword);
        jpPassword.setLayout(jpPasswordLayout);
        jpPasswordLayout.setHorizontalGroup(
            jpPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpPasswordLayout.setVerticalGroup(
            jpPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        txtUsername.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(153, 153, 153));
        txtUsername.setText("Enter Your Username...");
        txtUsername.setToolTipText("");
        txtUsername.setBorder(null);
        txtUsername.setName(""); // NOI18N
        txtUsername.setSelectionColor(new java.awt.Color(255, 68, 56));
        txtUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsernameFocusLost(evt);
            }
        });
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsernameKeyPressed(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(153, 153, 153));
        txtPassword.setText("Enter Your Password...");
        txtPassword.setBorder(null);
        txtPassword.setEchoChar('\u0000');
        txtPassword.setSelectionColor(new java.awt.Color(255, 68, 56));
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-logo.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-user.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-lock.png"))); // NOI18N

        jpLogin.setBackground(new java.awt.Color(0, 0, 0));
        jpLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jpLogin.setForeground(new java.awt.Color(255, 255, 255));
        jpLogin.setText("LOGIN");
        jpLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpLoginMouseExited(evt);
            }
        });
        jpLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpLoginActionPerformed(evt);
            }
        });

        jpIconEye.setBackground(new java.awt.Color(255, 255, 255));
        jpIconEye.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpIconEye.setLayout(new java.awt.CardLayout());

        iShow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-view.png"))); // NOI18N
        iShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iShowMouseClicked(evt);
            }
        });
        jpIconEye.add(iShow, "card2");

        iHide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-hidden.png"))); // NOI18N
        iHide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iHideMouseClicked(evt);
            }
        });
        jpIconEye.add(iHide, "card2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jMin, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jExt, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUsername))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jpLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                                    .addComponent(jpPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                                    .addComponent(jpUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jpIconEye, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(64, 64, 64))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jMin, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jExt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUsername)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(jpUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpIconEye, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jpPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jpLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setIconFrame(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/icon-logo.png")));
    }
    
    private void reset(){
        iShow.setVisible(true);
        iHide.setVisible(false);
        txtUsername.setText("Enter Your Username...");
        txtPassword.setText("Enter Your Password...");
        txtPassword.setEchoChar('\u0000');
    }       
    
    private void login(){
        if(!txtUsername.getText().equals("") && !txtPassword.getText().equals("")){
            try{
                String sql = "SELECT * FROM admin WHERE username='" + txtUsername.getText() + "' AND password='" + txtPassword.getText() + "'";
                java.sql.Statement stmt = conn.createStatement();
                ResultSet login = stmt.executeQuery(sql);
                if (login.next()) {
//                    config.Session.setId(login.getString("id_users"));
//                    config.Session.setUsername(login.getString("username"));
//                    config.Session.setPassword(login.getString("password"));
//                    config.Session.setNama(login.getString("nama"));
//                    config.Session.setTgl_lahir(login.getString("tgl_lahir"));
//                    config.Session.setNoHp(login.getString("no_hp"));
//                    config.Session.setJk(login.getString("jk"));
//                    config.Session.setAlamat(login.getString("alamat"));
//                    config.Session.setRole(login.getString("role"));
                    new FormMenu().show();
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "<html><p style=\"font-size:11px; width:200px;\"><b style=\"font-size:14px;\">Login Gagal!</b><br>Username atau Password Salah.</p></html>", "Failed!", JOptionPane.ERROR_MESSAGE,iconError);
                }
            } catch (SQLException e){}       
            reset();
        }else{
            JOptionPane.showMessageDialog(null, "<html><p style=\"font-size:11px; width:200px;\"><b style=\"font-size:14px;\">Login Gagal!</b><br>Username atau Password Tidak Boleh Kosong.</p></html>", "Failed!", JOptionPane.ERROR_MESSAGE,iconError);
        }        
    }
    
    private void jExtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jExtMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jExtMouseClicked

    private void jExtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jExtMouseEntered
        // TODO add your handling code here:
        jExt.setForeground(Color.RED);
    }//GEN-LAST:event_jExtMouseEntered

    private void jExtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jExtMouseExited
        // TODO add your handling code here:
        jExt.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_jExtMouseExited

    private void jMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMinMouseClicked
        // TODO add your handling code here:
        this.setExtendedState(FormLogin.ICONIFIED);
    }//GEN-LAST:event_jMinMouseClicked

    private void jMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMinMouseEntered
        // TODO add your handling code here:
        jMin.setForeground(Color.RED);
    }//GEN-LAST:event_jMinMouseEntered

    private void jMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMinMouseExited
        // TODO add your handling code here:
        jMin.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_jMinMouseExited

    private void txtUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusGained
        // TODO add your handling code here:
        jpUsername.setBackground(Color.BLACK);
        txtUsername.setForeground(Color.BLACK);
        if(txtUsername.getText().equals("Enter Your Username...")){
            txtUsername.setText("");
        }
    }//GEN-LAST:event_txtUsernameFocusGained

    private void txtUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusLost
        // TODO add your handling code here:
        jpUsername.setBackground(new Color(153,153,153));
        txtUsername.setForeground(new Color(153,153,153));
        if(txtUsername.getText().equals("")){
            txtUsername.setText("Enter Your Username...");
        }
    }//GEN-LAST:event_txtUsernameFocusLost

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            login();
        }
    }//GEN-LAST:event_txtUsernameKeyPressed

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        // TODO add your handling code here:
        jpPassword.setBackground(Color.BLACK);
        txtPassword.setForeground(Color.BLACK);
        if(txtPassword.getText().equals("Enter Your Password...")){
            txtPassword.setText("");
            txtPassword.setEchoChar('\u25cf');
        }
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        // TODO add your handling code here:
        jpPassword.setBackground(new Color(153,153,153));
        txtPassword.setForeground(new Color(153,153,153));
        if(txtPassword.getText().equals("")){
            txtPassword.setEchoChar('\u0000');
            txtPassword.setText("Enter Your Password...");
        }
    }//GEN-LAST:event_txtPasswordFocusLost

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            login();
        }
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void jpLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpLoginActionPerformed
        // TODO add your handling code here:
        login();
    }//GEN-LAST:event_jpLoginActionPerformed

    private void jpLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpLoginMouseEntered
        // TODO add your handling code here:
        jpLogin.setBackground(new Color(15,15,15));
    }//GEN-LAST:event_jpLoginMouseEntered

    private void jpLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpLoginMouseExited
        // TODO add your handling code here:
        jpLogin.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_jpLoginMouseExited

    private void iHideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iHideMouseClicked
        // TODO add your handling code here:
        iShow.setVisible(true);
        iHide.setVisible(false);
        txtPassword.setEchoChar('\u25cf');
    }//GEN-LAST:event_iHideMouseClicked

    private void iShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iShowMouseClicked
        // TODO add your handling code here:
        iShow.setVisible(false);
        iHide.setVisible(true);
        txtPassword.setEchoChar('\u0000');
    }//GEN-LAST:event_iShowMouseClicked

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
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iHide;
    private javax.swing.JLabel iShow;
    private javax.swing.JLabel jExt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpIconEye;
    private javax.swing.JButton jpLogin;
    private javax.swing.JPanel jpPassword;
    private javax.swing.JPanel jpUsername;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
