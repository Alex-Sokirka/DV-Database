/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mainform;

import functionality.AddingForm;
import functionality.GetSetInformation;
import java.awt.Color;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ihorg
 */
public class AuthFormJFrame extends javax.swing.JFrame {
    
    //VARIABLES
    private static String s;
    private static AddingForm addingForm;
    private static ResultSet rs;
    private static Connection conn;
    private static Statement stmt;
    private static final String tableName = "users";

    /**
     * Creates new form AuthFormJFrame
     */
    public AuthFormJFrame() {
        try {
            initComponents();
            getSettings();
            setLanguage();
            getContentPane().setBackground(new Color(234,222,196));
            jTextField5.requestFocus();
            addingForm = new AddingForm();
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/dvdb","Halyn","123");
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(AuthFormJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void getSettings() {
        try {
            String allSettings = "select * from settings";
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/dvdb","Halyn","123");
            stmt = conn.createStatement();
            rs = stmt.executeQuery(allSettings);
            if(rs.next()){
                GetSetInformation.setAppTheme(Integer.parseInt(rs.getString("theme")));
                GetSetInformation.setAppLanguage(Integer.parseInt(rs.getString("language")));
                GetSetInformation.setAppTextSize(Integer.parseInt(rs.getString("text_size")));
                GetSetInformation.setAppTextType(Integer.parseInt(rs.getString("text_type")));
                GetSetInformation.setAppTextFont(Integer.parseInt(rs.getString("text_font")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AuthFormJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private Integer getRowCount(String tableName) {
        try {
            String query = "select count(*) from "+tableName;
            ResultSet rs = stmt.executeQuery(query);
            rs.next();
            int count = rs.getInt(1);
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(AuthFormJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    private String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            byte[] resultByteArray = md.digest();
            StringBuilder sb = new StringBuilder();
            for(byte b : resultByteArray) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(AuthFormJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        registerButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField3 = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jPasswordField2 = new javax.swing.JPasswordField();
        messageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Авторизація");

        jLabel2.setForeground(new java.awt.Color(153, 153, 0));
        jLabel2.setText("Прізвище");

        jLabel3.setForeground(new java.awt.Color(153, 153, 0));
        jLabel3.setText("Ім'я");

        jLabel4.setForeground(new java.awt.Color(153, 153, 0));
        jLabel4.setText("Логін");

        jLabel5.setForeground(new java.awt.Color(153, 153, 0));
        jLabel5.setText("Пароль");

        jTextField1.setBackground(new java.awt.Color(255, 255, 204));
        jTextField1.setForeground(new java.awt.Color(153, 153, 0));

        jTextField2.setBackground(new java.awt.Color(255, 255, 204));
        jTextField2.setForeground(new java.awt.Color(153, 153, 0));

        jTextField3.setBackground(new java.awt.Color(255, 255, 204));
        jTextField3.setForeground(new java.awt.Color(153, 153, 0));

        registerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/photodb/admin.png"))); // NOI18N
        registerButton.setContentAreaFilled(false);
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(153, 153, 0));
        jLabel6.setText("Повторити пароль");

        jLabel7.setForeground(new java.awt.Color(153, 153, 0));
        jLabel7.setText("Логін");

        loginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/photodb/admin.png"))); // NOI18N
        loginButton.setContentAreaFilled(false);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        jPasswordField1.setBackground(new java.awt.Color(255, 255, 204));
        jPasswordField1.setForeground(new java.awt.Color(153, 153, 0));

        jPasswordField3.setBackground(new java.awt.Color(255, 255, 204));
        jPasswordField3.setForeground(new java.awt.Color(153, 153, 0));

        jLabel8.setForeground(new java.awt.Color(153, 153, 0));
        jLabel8.setText("Пароль");

        jTextField5.setBackground(new java.awt.Color(255, 255, 204));
        jTextField5.setForeground(new java.awt.Color(153, 153, 0));

        jPasswordField2.setBackground(new java.awt.Color(255, 255, 204));
        jPasswordField2.setForeground(new java.awt.Color(153, 153, 0));

        messageLabel.setForeground(new java.awt.Color(153, 153, 0));
        messageLabel.setText("...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(27, 27, 27))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94))))
            .addGroup(layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(messageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(messageLabel)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // TO REGISTER
    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        try {
            String ps1 = new String(this.jPasswordField1.getPassword());
            String ps2 = new String(this.jPasswordField2.getPassword());
            s = "insert into users values("+(getRowCount(tableName)+1)+",'"+jTextField1.getText()+"','"+jTextField2.getText()+"','"+jTextField3.getText()+"','"+hashPassword(ps1)+"','reader',"+(getRowCount(tableName)+1)+")";
            String checkLogin = "select * from users where login='"+jTextField3.getText()+"'";
            rs = stmt.executeQuery(checkLogin);
            if(jTextField1.getText().equals("") || jTextField2.getText().equals("") || jTextField3.getText().equals("") || ps1.equals("")) {
                if(GetSetInformation.getAppLanguage()==0) {
                    messageLabel.setText("Заповніть всі поля!");
                } else {
                    messageLabel.setText("Fill in all the fields!");
                }
            }
            else if(!ps1.equals(ps2)) {
                if(GetSetInformation.getAppLanguage()==0) {
                    messageLabel.setText("Паролі не співпадають");
                } else {
                    messageLabel.setText("Passwords do not match");
                }
            }
            else if(rs.next()){
               if(GetSetInformation.getAppLanguage()==0) {
                    messageLabel.setText("Такий користувач вже існує!!!");
                } else {
                    messageLabel.setText("Such a user already exists !!!");
                }
            }
            else {
                addingForm.addRecord(s);
                if(GetSetInformation.getAppLanguage()==0) {
                    messageLabel.setText("Ви успішно зареєстровані!");
                } else {
                    messageLabel.setText("You are successfully registered!");
                }
            }
        } catch (SQLException ex) {
           Logger.getLogger(AuthFormJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_registerButtonActionPerformed
    // TO LOGIN
    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        String psf = new String(this.jPasswordField3.getPassword());
        String psdb = "";
        String userAccess = "";
        try {
            rs = stmt.executeQuery("select * from users where login='"+jTextField5.getText()+"'");
            while(rs.next()) {
                psdb = rs.getString("password");
                userAccess = rs.getString("access");
            }
            if(psdb.equals(hashPassword(psf))) {
                GetSetInformation.setUserAccess(userAccess);
                new MainFormJFrame().setVisible(true);
            }
            else {
                if(GetSetInformation.getAppLanguage()==0) {
                    messageLabel.setText("Неправильний логін або пароль");
                } else {
                    messageLabel.setText("Invalid login or password");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(AuthFormJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_loginButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AuthFormJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AuthFormJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AuthFormJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AuthFormJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AuthFormJFrame().setVisible(true);
            }
        });
    }

    private void setLanguage() {
        //LANGUAGE
        if(GetSetInformation.getAppLanguage()==1) {
            jLabel2.setText("Surname");
            jLabel3.setText("Name");
            jLabel4.setText("Login");
            jLabel5.setText("Password");
            jLabel6.setText("Repeat password");
            jLabel7.setText("Login");
            jLabel8.setText("Password");
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JButton registerButton;
    // End of variables declaration//GEN-END:variables
}
