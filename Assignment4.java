/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package thursdayclass;

import javax.swing.JOptionPane;

/**
 *
 * @author ks
 */
import java.sql.*;
public class Assignment4 extends javax.swing.JFrame {

    /**
     * Creates new form Assignment4
     */
    public Assignment4() {
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

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 5));

        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jButton1.setText("ONLINE SALARY MANAGEMENT SYSTEM");

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("NET SALARY");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setText("RETRIEVE FROM DB");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("EMPLOYEE - NAMES:");

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("MONTHLY SALARY");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("HEALTH INSURANCE:");

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setText("ANNUAL SALARY");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setText("SAVE DATA");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton7.setText("CANCEL");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("PROVIDENT FUND:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("GROSS - SALARY:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("TRANSPORT ALLOWANCE:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("INCOME TAX IN %:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("EMPLOYEE - NID:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(39, 39, 39)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton5)
                                .addGap(48, 48, 48)
                                .addComponent(jButton6)
                                .addGap(41, 41, 41)
                                .addComponent(jButton7))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField8)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton2)
                                    .addGap(48, 48, 48)
                                    .addComponent(jButton3)
                                    .addGap(41, 41, 41)
                                    .addComponent(jButton4)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButton1)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         if("".equals(jTextField1.getText())){
            JOptionPane.showMessageDialog(null,"Please Employee Names is required");
        }
        else if("".equals(jTextField2.getText())){
            JOptionPane.showMessageDialog(null,"Please Employee NID is required");
        }
        else if("".equals(jTextField3.getText())){
            JOptionPane.showMessageDialog(null,"Please Enter gross salary");
        }
        else if("".equals(jTextField4.getText())){
            JOptionPane.showMessageDialog(null,"Please Enter transport allowance");
        }
        else if("".equals(jTextField5.getText())){
            JOptionPane.showMessageDialog(null,"Please Enter provident fund");
        }
        else if("".equals(jTextField6.getText())){
            JOptionPane.showMessageDialog(null,"Please Enter income tax");
        }
        else if("".equals(jTextField7.getText())){
            JOptionPane.showMessageDialog(null,"Please Enter Health insurance");
        }
        else{
            try{
                double gross_salary = Double.parseDouble(jTextField3.getText());
                double transport = Double.parseDouble(jTextField4.getText());
                double provident = Double.parseDouble(jTextField5.getText());
                double income = Double.parseDouble(jTextField6.getText());
                double health = Double.parseDouble(jTextField7.getText());
                
                double monthly = gross_salary + transport - (income + health + provident);
                
                jTextField8.setText(String.format("Monthly salary is: %.2f",monthly));
                
            }catch(Exception e){
                 JOptionPane.showMessageDialog(null,"Error: "+e);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if("".equals(jTextField1.getText())){
            JOptionPane.showMessageDialog(null,"Please Employee Names is required");
        }
        else if("".equals(jTextField2.getText())){
            JOptionPane.showMessageDialog(null,"Please Employee NID is required");
        }
        else if("".equals(jTextField3.getText())){
            JOptionPane.showMessageDialog(null,"Please Enter gross salary");
        }
        else if("".equals(jTextField4.getText())){
            JOptionPane.showMessageDialog(null,"Please Enter transport allowance");
        }
        else if("".equals(jTextField5.getText())){
            JOptionPane.showMessageDialog(null,"Please Enter provident fund");
        }
        else if("".equals(jTextField6.getText())){
            JOptionPane.showMessageDialog(null,"Please Enter income tax");
        }
        else if("".equals(jTextField7.getText())){
            JOptionPane.showMessageDialog(null,"Please Enter Health insurance");
        }
        else{
            try{
                double gross_salary = Double.parseDouble(jTextField3.getText());
                double transport = Double.parseDouble(jTextField4.getText());
                double provident = Double.parseDouble(jTextField5.getText());
                double income = Double.parseDouble(jTextField6.getText());
                double health = Double.parseDouble(jTextField7.getText());
                
                double netsalary = gross_salary + transport - (income + health + provident);
                double monthly = netsalary;
                double annual = monthly * 12;
                jTextField8.setText(String.format("Annual salary is: %.2f",annual));
                
            }catch(Exception e){
                 JOptionPane.showMessageDialog(null,"Error: "+e);
            }
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        String EmpName = jTextField1.getText();
        Connection con = null;
        PreparedStatement prepare = null;
        ResultSet rs = null;
         try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3307/morningdb","root","");
                prepare = con.prepareStatement("SELECT * FROM morningtb where EmployeeNames = ?");
                prepare.setString(1, EmpName);
                rs = prepare.executeQuery();
                
                while (rs.next()){
                    jTextField1.setText(rs.getString("EmployeeNames"));
                    jTextField2.setText(rs.getString("EmployeeNID"));
                    jTextField3.setText(rs.getString("grosssalary"));
                    jTextField4.setText(rs.getString("transportallowance"));
                    jTextField5.setText(rs.getString("providentfund"));
                    jTextField6.setText(rs.getString("incometax"));
                    jTextField7.setText(rs.getString("Healthinsurance"));
                }
                
                
              }catch(Exception e){
                 JOptionPane.showMessageDialog(null,"Error: "+e);
            }
               finally{
             try{
                 con.close();
                 prepare.close();
                 rs.close();
             }
            catch(Exception e){
                 JOptionPane.showMessageDialog(null,"Error: "+e);
            }
          }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        
                    jTextField1.setText(null);
                    jTextField2.setText(null);
                    jTextField3.setText(null);
                    jTextField4.setText(null);
                    jTextField5.setText(null);
                    jTextField6.setText(null);
                    jTextField7.setText(null);
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if("".equals(jTextField1.getText())){
            JOptionPane.showMessageDialog(null,"Please Employee Names is required");
        }
        else if("".equals(jTextField2.getText())){
            JOptionPane.showMessageDialog(null,"Please Employee NID is required");
        }
        else if("".equals(jTextField3.getText())){
            JOptionPane.showMessageDialog(null,"Please Enter gross salary");
        }
        else if("".equals(jTextField4.getText())){
            JOptionPane.showMessageDialog(null,"Please Enter transport allowance");
        }
        else if("".equals(jTextField5.getText())){
            JOptionPane.showMessageDialog(null,"Please Enter provident fund");
        }
        else if("".equals(jTextField6.getText())){
            JOptionPane.showMessageDialog(null,"Please Enter income tax");
        }
        else if("".equals(jTextField7.getText())){
            JOptionPane.showMessageDialog(null,"Please Enter Health insurance");
        }
        else{
            try{
                double gross_salary = Double.parseDouble(jTextField3.getText());
                double transport = Double.parseDouble(jTextField4.getText());
                double provident = Double.parseDouble(jTextField5.getText());
                double income = Double.parseDouble(jTextField6.getText());
                double health = Double.parseDouble(jTextField7.getText());
                
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/morningdb","root","");
                PreparedStatement prepare = con.prepareStatement("INSERT INTO morningtb VALUES (?,?,?,?,?,?,?)");
                prepare.setString(1, jTextField1.getText());
                prepare.setString(2, jTextField2.getText());
                prepare.setString(3, jTextField3.getText());
                prepare.setString(4, jTextField4.getText());
                prepare.setString(5, jTextField5.getText());
                prepare.setString(6, jTextField6.getText());
                prepare.setString(7, jTextField7.getText());
                
                int i = prepare.executeUpdate();
                if(i>0){
                      JOptionPane.showMessageDialog(null,"Data Saved Successful");
                }
              
                
            }catch(Exception e){
                 JOptionPane.showMessageDialog(null,"Error: "+e);
            }
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if("".equals(jTextField1.getText())){
            JOptionPane.showMessageDialog(null,"Please Employee Names is required");
        }
        else if("".equals(jTextField2.getText())){
            JOptionPane.showMessageDialog(null,"Please Employee NID is required");
        }
        else if("".equals(jTextField3.getText())){
            JOptionPane.showMessageDialog(null,"Please Enter gross salary");
        }
        else if("".equals(jTextField4.getText())){
            JOptionPane.showMessageDialog(null,"Please Enter transport allowance");
        }
        else if("".equals(jTextField5.getText())){
            JOptionPane.showMessageDialog(null,"Please Enter provident fund");
        }
        else if("".equals(jTextField6.getText())){
            JOptionPane.showMessageDialog(null,"Please Enter income tax");
        }
        else if("".equals(jTextField7.getText())){
            JOptionPane.showMessageDialog(null,"Please Enter Health insurance");
        }
        else{
            try{
                double gross_salary = Double.parseDouble(jTextField3.getText());
                double transport = Double.parseDouble(jTextField4.getText());
                double provident = Double.parseDouble(jTextField5.getText());
                double income = Double.parseDouble(jTextField6.getText());
                double health = Double.parseDouble(jTextField7.getText());
                
                double netsalary = gross_salary + transport - (income + health + provident);
                
                jTextField8.setText(String.format("Net salary is: %.2f",netsalary));
                
            }catch(Exception e){
                 JOptionPane.showMessageDialog(null,"Error: "+e);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Assignment4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Assignment4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Assignment4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Assignment4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Assignment4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
