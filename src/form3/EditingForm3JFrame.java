/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package form3;

import form1.EditingForm1JFrame;
import functionality.GetSetInformation;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ihorg
 */
public class EditingForm3JFrame extends javax.swing.JFrame {

    //VARIABLES
    private static Connection conn;
    private static Statement stmt;
    private static ResultSet rs;
    private static String[][] tableDataArr;
    private static Integer currentRow,currentId;
    private static final String tableName = "personnel";
    
    /**
     * Creates new form EditingForm3JFrame
     */
    public EditingForm3JFrame() {
        initComponents();
        setInterfaceSettings();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        tableDataArr = new String[GetSetInformation.getRowCount()][GetSetInformation.getColCount()];
        System.out.println();
        currentRow = GetSetInformation.getCurrentRow();
        System.out.println();
        currentId = GetSetInformation.getCurrentId();
        DataPreparing();
        setDataOnTextFields();
    }
    
    //DATA PREPARING
    private void DataPreparing() {
        try {
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/dvdb","Halyn","123");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from "+tableName);
            while(rs.next()) {
                for(int j = 0;j<GetSetInformation.getColCount();j++){
                    tableDataArr[rs.getRow()-1][j] = rs.getString(j+1);
                }
            }
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    //SET DATA ON TEXTFIELDS
    private void setDataOnTextFields() {
        jTextField2.setText(tableDataArr[currentRow][1]);
        jTextField3.setText(tableDataArr[currentRow][2]);
        jTextField4.setText(tableDataArr[currentRow][3]);
        jTextField5.setText(tableDataArr[currentRow][4]);
        jTextField6.setText(tableDataArr[currentRow][5]);
        jTextField7.setText(tableDataArr[currentRow][6]);
        jTextField8.setText(tableDataArr[currentRow][7]);
        jTextField9.setText(tableDataArr[currentRow][8]);
        jTextField10.setText(tableDataArr[currentRow][9]);
        jTextField11.setText(tableDataArr[currentRow][10]);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        prev = new javax.swing.JButton();
        next = new javax.swing.JButton();
        save = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Редагування запису працівника");

        prev.setText("<");
        prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevActionPerformed(evt);
            }
        });

        next.setText(">");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/photodb/save.png"))); // NOI18N
        save.setContentAreaFilled(false);
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/photodb/cancel.png"))); // NOI18N
        exit.setContentAreaFilled(false);
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jLabel11.setText("Стать");

        jLabel3.setText("Ім'я");

        jLabel5.setText("Посада");

        jLabel8.setText("Дата народження");

        jLabel4.setText("По батькові");

        jLabel9.setText("Телефон");

        jLabel6.setText("Зарплата");

        jLabel7.setText("Місто");

        jLabel10.setText("Пошта");

        jLabel2.setText("Прізвище");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextField10, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField9, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(prev, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(prev, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //SAVE
    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        try {
            stmt = conn.createStatement();
            String s = "update "+tableName+" set surname ='"+jTextField2.getText()+"',name='"+jTextField3.getText()+"',mid_name='"+jTextField4.getText()+"',position='"+jTextField5.getText()+"',salary="+jTextField6.getText()+",city='"+jTextField7.getText()+"',date_of_birth='"+jTextField8.getText()+"',phone='"+jTextField9.getText()+"',email='"+jTextField10.getText()+"',gender='"+jTextField11.getText()+"' where act_id ="+currentId;
            System.out.println(s);
            stmt.executeUpdate(s);        
        } catch (SQLException ex) {
            Logger.getLogger(EditingForm1JFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saveActionPerformed
    //EXIT
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        new Form3JFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_exitActionPerformed
    //PREV
    private void prevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevActionPerformed
        if (currentRow == 0){
           currentRow = GetSetInformation.getRowCount()-1;
           currentId = Integer.parseInt(tableDataArr[currentRow][0]);
       }
       else {
           currentRow-=1;
           currentId = Integer.parseInt(tableDataArr[currentRow][0]);
       }
       setDataOnTextFields();
    }//GEN-LAST:event_prevActionPerformed
    //NEXT
    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        if (currentRow == GetSetInformation.getRowCount()-1){
           currentRow = 0;
           currentId = Integer.parseInt(tableDataArr[currentRow][0]);
       }
       else {
           currentRow+=1;
           currentId = Integer.parseInt(tableDataArr[currentRow][0]);
       }
       setDataOnTextFields();
    }//GEN-LAST:event_nextActionPerformed

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
            java.util.logging.Logger.getLogger(EditingForm3JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditingForm3JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditingForm3JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditingForm3JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditingForm3JFrame().setVisible(true);
            }
        });
    }
    
    private void setInterfaceSettings() {
        //THEME
        getContentPane().setBackground(GetSetInformation.getFormBackground());
        jTextField2.setBackground(GetSetInformation.getElementBackground());
        jTextField3.setBackground(GetSetInformation.getElementBackground());
        jTextField4.setBackground(GetSetInformation.getElementBackground());
        jTextField5.setBackground(GetSetInformation.getElementBackground());
        jTextField6.setBackground(GetSetInformation.getElementBackground());
        jTextField7.setBackground(GetSetInformation.getElementBackground());
        jTextField8.setBackground(GetSetInformation.getElementBackground());
        jTextField9.setBackground(GetSetInformation.getElementBackground());
        jTextField10.setBackground(GetSetInformation.getElementBackground());
        jTextField11.setBackground(GetSetInformation.getElementBackground());
        prev.setBackground(GetSetInformation.getElementBackground());
        next.setBackground(GetSetInformation.getElementBackground());
        jTextField2.setForeground(GetSetInformation.getForeGround());
        jTextField3.setForeground(GetSetInformation.getForeGround());
        jTextField4.setForeground(GetSetInformation.getForeGround());
        jTextField5.setForeground(GetSetInformation.getForeGround());
        jTextField6.setForeground(GetSetInformation.getForeGround());
        jTextField7.setForeground(GetSetInformation.getForeGround());
        jTextField8.setForeground(GetSetInformation.getForeGround());
        jTextField9.setForeground(GetSetInformation.getForeGround());
        jTextField10.setForeground(GetSetInformation.getForeGround());
        jTextField11.setForeground(GetSetInformation.getForeGround());
        jLabel2.setForeground(GetSetInformation.getForeGround());
        jLabel3.setForeground(GetSetInformation.getForeGround());
        jLabel4.setForeground(GetSetInformation.getForeGround());
        jLabel5.setForeground(GetSetInformation.getForeGround());
        jLabel6.setForeground(GetSetInformation.getForeGround());
        jLabel7.setForeground(GetSetInformation.getForeGround());
        jLabel8.setForeground(GetSetInformation.getForeGround());
        jLabel9.setForeground(GetSetInformation.getForeGround());
        jLabel10.setForeground(GetSetInformation.getForeGround());
        jLabel11.setForeground(GetSetInformation.getForeGround());
        prev.setForeground(GetSetInformation.getElementBackground());
        next.setForeground(GetSetInformation.getElementBackground());
        //LANGUAGE
        if(GetSetInformation.getAppLanguage()==1) {
            jLabel2.setText("Surname");
            jLabel3.setText("Name");
            jLabel4.setText("Mid name");
            jLabel5.setText("Position");
            jLabel6.setText("Salary");
            jLabel7.setText("City");
            jLabel8.setText("Birth date");
            jLabel9.setText("Phone");
            jLabel10.setText("Email");
            jLabel11.setText("Gender");
        }
        //TEXT
        jLabel2.setFont(new Font(GetSetInformation.getTextFont(), GetSetInformation.getTextType(), GetSetInformation.getTextSize()));
        jLabel3.setFont(new Font(GetSetInformation.getTextFont(), GetSetInformation.getTextType(), GetSetInformation.getTextSize()));
        jLabel4.setFont(new Font(GetSetInformation.getTextFont(), GetSetInformation.getTextType(), GetSetInformation.getTextSize()));
        jLabel5.setFont(new Font(GetSetInformation.getTextFont(), GetSetInformation.getTextType(), GetSetInformation.getTextSize()));
        jLabel6.setFont(new Font(GetSetInformation.getTextFont(), GetSetInformation.getTextType(), GetSetInformation.getTextSize()));
        jLabel7.setFont(new Font(GetSetInformation.getTextFont(), GetSetInformation.getTextType(), GetSetInformation.getTextSize()));
        jLabel8.setFont(new Font(GetSetInformation.getTextFont(), GetSetInformation.getTextType(), GetSetInformation.getTextSize()));
        jLabel9.setFont(new Font(GetSetInformation.getTextFont(), GetSetInformation.getTextType(), GetSetInformation.getTextSize()));
        jLabel10.setFont(new Font(GetSetInformation.getTextFont(), GetSetInformation.getTextType(), GetSetInformation.getTextSize()));
        jLabel11.setFont(new Font(GetSetInformation.getTextFont(), GetSetInformation.getTextType(), GetSetInformation.getTextSize()));
        jTextField2.setFont(new Font(GetSetInformation.getTextFont(), GetSetInformation.getTextType(), GetSetInformation.getTextSize()));
        jTextField3.setFont(new Font(GetSetInformation.getTextFont(), GetSetInformation.getTextType(), GetSetInformation.getTextSize()));
        jTextField4.setFont(new Font(GetSetInformation.getTextFont(), GetSetInformation.getTextType(), GetSetInformation.getTextSize()));
        jTextField5.setFont(new Font(GetSetInformation.getTextFont(), GetSetInformation.getTextType(), GetSetInformation.getTextSize()));
        jTextField6.setFont(new Font(GetSetInformation.getTextFont(), GetSetInformation.getTextType(), GetSetInformation.getTextSize()));
        jTextField7.setFont(new Font(GetSetInformation.getTextFont(), GetSetInformation.getTextType(), GetSetInformation.getTextSize()));
        jTextField8.setFont(new Font(GetSetInformation.getTextFont(), GetSetInformation.getTextType(), GetSetInformation.getTextSize()));
        jTextField9.setFont(new Font(GetSetInformation.getTextFont(), GetSetInformation.getTextType(), GetSetInformation.getTextSize()));
        jTextField10.setFont(new Font(GetSetInformation.getTextFont(), GetSetInformation.getTextType(), GetSetInformation.getTextSize()));
        jTextField11.setFont(new Font(GetSetInformation.getTextFont(), GetSetInformation.getTextType(), GetSetInformation.getTextSize()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JButton next;
    private javax.swing.JButton prev;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}
