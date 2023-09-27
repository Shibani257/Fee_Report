import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.text.*;
import java.awt.print.*;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

public class addstdnt extends javax.swing.JFrame {
 Connection conn=null;
 ResultSet rs=null;
 PreparedStatement po=null;
    public addstdnt() throws SQLException {
        initComponents();
        setTitle("StudentInformation");
       conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/fee","root","");
       Update_table();
    }

    private void Update_table(){
     try {
         String sql="select * from stuinfo";
         po=conn.prepareStatement(sql);
         rs=po.executeQuery();
         jTable1.setModel(DbUtils.resultSetToTableModel(rs));
     } catch (SQLException ex) {
         Logger.getLogger(addstdnt.class.getName()).log(Level.SEVERE, null, ex);
     }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        course = new javax.swing.JLabel();
        fees = new javax.swing.JLabel();
        paid = new javax.swing.JLabel();
        addrs = new javax.swing.JLabel();
        city = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        contact = new javax.swing.JLabel();
        jTextFieldadrs = new javax.swing.JTextField();
        namefieldSID = new javax.swing.JTextField();
        jTextFieldemail = new javax.swing.JTextField();
        jTextFieldcourse = new javax.swing.JTextField();
        jTextFieldfees = new javax.swing.JTextField();
        jTextFieldpaid = new javax.swing.JTextField();
        jTextFieldcontact = new javax.swing.JTextField();
        jTextFieldcity = new javax.swing.JTextField();
        jTextFieldstete = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        namefield1 = new javax.swing.JTextField();
        name1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextFieldsearch = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        jLabel6.setText("jLabel6");

        jLabel7.setText("jLabel7");

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("ADD STUDENT");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 80, 310, 30));

        name.setBackground(new java.awt.Color(0, 255, 255));
        name.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        name.setForeground(new java.awt.Color(51, 255, 255));
        name.setText("ST_ID");
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 130, 70, 40));

        email.setBackground(new java.awt.Color(0, 255, 255));
        email.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        email.setForeground(new java.awt.Color(51, 255, 255));
        email.setText("EMAIL");
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 220, 90, 30));

        course.setBackground(new java.awt.Color(0, 255, 255));
        course.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        course.setForeground(new java.awt.Color(51, 255, 255));
        course.setText("COURSE");
        getContentPane().add(course, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 260, 66, 27));

        fees.setBackground(new java.awt.Color(0, 255, 255));
        fees.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fees.setForeground(new java.awt.Color(51, 255, 255));
        fees.setText("FEES");
        getContentPane().add(fees, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 310, -1, 20));

        paid.setBackground(new java.awt.Color(0, 255, 255));
        paid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        paid.setForeground(new java.awt.Color(51, 255, 255));
        paid.setText("PAID");
        getContentPane().add(paid, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 350, 41, -1));

        addrs.setBackground(new java.awt.Color(0, 255, 255));
        addrs.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addrs.setForeground(new java.awt.Color(51, 255, 255));
        addrs.setText("ADDRESS");
        getContentPane().add(addrs, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 410, -1, -1));

        city.setBackground(new java.awt.Color(0, 255, 255));
        city.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        city.setForeground(new java.awt.Color(51, 255, 255));
        city.setText("CITY");
        getContentPane().add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 470, -1, 20));

        jLabel2.setBackground(new java.awt.Color(0, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 255));
        jLabel2.setText("STATE:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 500, 60, 30));

        contact.setBackground(new java.awt.Color(0, 255, 255));
        contact.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        contact.setForeground(new java.awt.Color(51, 255, 255));
        contact.setText("CONTACT");
        getContentPane().add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 540, -1, 20));

        jTextFieldadrs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldadrsActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldadrs, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 390, 200, 60));

        namefieldSID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namefieldSIDActionPerformed(evt);
            }
        });
        getContentPane().add(namefieldSID, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 140, 180, 30));
        getContentPane().add(jTextFieldemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 220, 180, 30));
        getContentPane().add(jTextFieldcourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 260, 180, 30));

        jTextFieldfees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldfeesActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldfees, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 300, 180, 30));
        getContentPane().add(jTextFieldpaid, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 340, 180, 30));

        jTextFieldcontact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldcontactActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 540, 180, 30));
        getContentPane().add(jTextFieldcity, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 460, 180, 30));

        jTextFieldstete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldsteteActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldstete, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 500, 180, 30));

        back.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        back.setForeground(new java.awt.Color(255, 51, 0));
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 620, 180, 40));

        jTable1.setBackground(new java.awt.Color(102, 102, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 750, 530));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 204, 255));
        jButton1.setText("INSERT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 590, 100, 30));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 153, 204));
        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 590, 90, 30));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 102, 204));
        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 590, 90, 30));

        namefield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namefield1ActionPerformed(evt);
            }
        });
        getContentPane().add(namefield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 180, 180, 30));

        name1.setBackground(new java.awt.Color(0, 255, 255));
        name1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        name1.setForeground(new java.awt.Color(51, 255, 255));
        name1.setText("NAME");
        getContentPane().add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 180, 70, 30));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 561, -1, -1));

        jTextFieldsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldsearchActionPerformed(evt);
            }
        });
        jTextFieldsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldsearchKeyPressed(evt);
            }
        });
        getContentPane().add(jTextFieldsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 160, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 0));
        jLabel3.setText("SEARCH STUDENT ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 20));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 0, 0));
        jButton4.setText("PRINT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, 120, 30));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(153, 0, 102));
        jButton5.setText("CLEARE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 110, 100, 30));

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));
        jPanel2.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("STUDENT INFORMATION");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 10, 270, 30);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 40));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/585663098-blue-background-wallpaper.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1170, 630));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldfeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldfeesActionPerformed
      
    }//GEN-LAST:event_jTextFieldfeesActionPerformed

    private void jTextFieldadrsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldadrsActionPerformed
      
    }//GEN-LAST:event_jTextFieldadrsActionPerformed

    private void jTextFieldsteteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldsteteActionPerformed
       
    }//GEN-LAST:event_jTextFieldsteteActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
            new Accountsection().setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void namefieldSIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namefieldSIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namefieldSIDActionPerformed

    private void jTextFieldcontactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldcontactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldcontactActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        try{
           
           String sql="Insert into stuinfo (ST_ID,NAME,EMAIL,COURSE,FEES,PAID,ADDRESS,CITY,STATE,CONTACT) values(?,?,?,?,?,?,?,?,?,?)";
      po=conn.prepareStatement(sql);
      po.setString(1, namefieldSID.getText());
      po.setString(2,namefield1.getText());
      po.setString(3,jTextFieldemail.getText());
      po.setString(4, jTextFieldcourse.getText());
      po.setString(5,jTextFieldfees.getText());
      po.setString(6,jTextFieldpaid.getText());
      po.setString(7,jTextFieldadrs.getText());
      po.setString(8,jTextFieldcity.getText());
      po.setString(9,jTextFieldstete.getText());    
      po.setString(10,jTextFieldcontact.getText());
      
      po.execute(); 
      JOptionPane.showMessageDialog(null, "saved");
          
       
       }catch(SQLException  e){
           JOptionPane.showMessageDialog(null, e);
       } Update_table();
       namefieldSID.setText("");
       namefield1.setText("");
      jTextFieldemail.setText("");
      jTextFieldcourse.setText("") ;  
      jTextFieldfees.setText("");
       jTextFieldpaid.setText("");   
        jTextFieldadrs.setText("");    
                jTextFieldcity.setText("");
                jTextFieldstete.setText("");
                
               
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    
       try{
        String sid=namefieldSID.getText();
        String namea=namefield1.getText();
       String emaila=jTextFieldemail.getText();
       String courcea=jTextFieldcourse.getText();
       String feesa=jTextFieldfees.getText();
       String paida=jTextFieldpaid.getText();
        String addrsa=jTextFieldadrs.getText();
         String citya=jTextFieldcity.getText();
          String statea=jTextFieldstete.getText();
           
            String contacta=jTextFieldcontact.getText();
            
            String sql="update  stuinfo set ST_ID='"+sid+"',NAME='"+namea+"',EMAIL='"+emaila+"',COURSE='"+courcea+"',FEES='"+feesa+"',PAID='"+paida+"',ADDRESS='"+addrsa+"',CITY='"+citya+"',STATE='"+statea+"',CONTACT='"+contacta+"' where ST_ID='"+sid+"'   ";  
       po=conn.prepareStatement(sql);
       po.execute();
       JOptionPane.showMessageDialog(null, "updated");
        
        }catch(SQLException  e){
            JOptionPane.showMessageDialog(null, e);
        }  Update_table();
         namefieldSID.setText("");
         namefield1.setText("");
      jTextFieldemail.setText("");
      jTextFieldcourse.setText("") ;  
      jTextFieldfees.setText("");
       jTextFieldpaid.setText("");   
        jTextFieldadrs.setText("");    
                jTextFieldcity.setText("");
                jTextFieldstete.setText("");
                
               

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      String sql="delete from stuinfo where ST_ID=?";
      try{
          po=conn.prepareStatement(sql);
          po.setString(1, namefieldSID.getText());
          po.execute();
          JOptionPane.showMessageDialog(null,"deleted");
      }catch(Exception e){
          JOptionPane.showMessageDialog(null, e);
      }Update_table();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try{
            int row=jTable1.getSelectedRow();
            String Table_clicked=(jTable1.getModel().getValueAt(row, 0).toString());
            String sql="select * from stuinfo where ST_ID='"+Table_clicked+"'";
             po=conn.prepareStatement(sql);
         rs=po.executeQuery();
         if(rs.next()){
             String s=rs.getString("ST_ID");
             namefieldSID.setText(s);
             
             String s1=rs.getString("NAME");
             namefield1.setText(s1);
             
            String s2=rs.getString("EMAIL");
            jTextFieldemail.setText(s2);
            
             String s3=rs.getString("COURSE");
             jTextFieldcourse.setText(s3);
             
              String s4=rs.getString("FEES");
              jTextFieldfees.setText(s4);
              
               String s5=rs.getString("PAID");               
               jTextFieldpaid.setText(s5);
               
                String s6=rs.getString("ADDRESS");
                jTextFieldadrs.setText(s6);
                
                 String s7=rs.getString("CITY");
                jTextFieldstete.setText(s7);
                 
                  String s8=rs.getString("STATE");
                  jTextFieldstete.setText(s8);
                  
                  
                   
                    String s10=rs.getString("CONTACT");
                    jTextFieldcontact.setText(s10);
             
         }
         
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void namefield1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namefield1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namefield1ActionPerformed

    private void jTextFieldsearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldsearchKeyPressed
            try{
                  String sql="select * from stuinfo where ST_ID=?";
                  po=conn.prepareStatement(sql);
                  po.setString(1, jTextFieldsearch.getText());
                  
                  
                  rs=po.executeQuery();
                  if(rs.next()){
                      String s1=rs.getString("ST_ID");
                      namefieldSID.setText(s1);
                      
                      String s2=rs.getString("NAME");
                      namefield1.setText(s2);
                      
                      String s3=rs.getString("EMAIL");
                      jTextFieldemail.setText(s3);
                      
                       String s4=rs.getString("COURSE");
                       jTextFieldcourse.setText(s4);
                       
                        String s5=rs.getString("FEES");
                        jTextFieldfees.setText(s5);
                        
                         String s6=rs.getString("PAID");
                         jTextFieldpaid.setText(s6);
                         
                          String s7=rs.getString("ADDRESS");
                          jTextFieldadrs.setText(s7);
                          
                           String s8=rs.getString("CITY");
                           jTextFieldcity.setText(s8);
                           
                            String s9=rs.getString("STATE");
                            jTextFieldstete.setText(s9);
                            
                             String s10=rs.getString("CONTACT");
                             jTextFieldcontact.setText(s10);
                             
                      
                  }
                  
                    
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        
         
        
        
        
    }//GEN-LAST:event_jTextFieldsearchKeyPressed

    private void jTextFieldsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldsearchActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       MessageFormat header=new MessageFormat("Report prient");
         MessageFormat footer=new MessageFormat("page{0,number,integer}");
         try {
             jTable1.print(JTable.PrintMode.NORMAL,header,footer);
         } catch (PrinterException ex) {
             Logger.getLogger(addstdnt.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      namefieldSID.setText("");
      namefield1.setText("");
      jTextFieldemail.setText("");
      jTextFieldcourse.setText("");
      jTextFieldfees.setText("");
      jTextFieldpaid.setText("");
      jTextFieldadrs.setText("");
      jTextFieldcity.setText("");
      jTextFieldstete.setText("");
      jTextFieldcontact.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

   
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
            java.util.logging.Logger.getLogger(addstdnt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addstdnt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addstdnt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addstdnt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new addstdnt().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(addstdnt.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addrs;
    private javax.swing.JButton back;
    private javax.swing.JLabel city;
    private javax.swing.JLabel contact;
    private javax.swing.JLabel course;
    private javax.swing.JLabel email;
    private javax.swing.JLabel fees;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldadrs;
    private javax.swing.JTextField jTextFieldcity;
    private javax.swing.JTextField jTextFieldcontact;
    private javax.swing.JTextField jTextFieldcourse;
    private javax.swing.JTextField jTextFieldemail;
    private javax.swing.JTextField jTextFieldfees;
    private javax.swing.JTextField jTextFieldpaid;
    private javax.swing.JTextField jTextFieldsearch;
    private javax.swing.JTextField jTextFieldstete;
    private javax.swing.JLabel name;
    private javax.swing.JLabel name1;
    private javax.swing.JTextField namefield1;
    private javax.swing.JTextField namefieldSID;
    private javax.swing.JLabel paid;
    // End of variables declaration//GEN-END:variables
}
