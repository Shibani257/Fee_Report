
import javax.swing.JOptionPane;


public class accountlog extends javax.swing.JFrame {

   
    public accountlog() {
        initComponents();
        setTitle("AccountLogin");
        
    } 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        acclogin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        passwo = new javax.swing.JLabel();
        usernm = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        back = new javax.swing.JButton();
        username = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setForeground(new java.awt.Color(51, 0, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        acclogin.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        acclogin.setText("ACCOUNT LOGIN");
        jPanel1.add(acclogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\aJAVA PROJECCT WALPAPE\\download (1).jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 150, 110));

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        passwo.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        passwo.setText("PASSWORD");
        jPanel2.add(passwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 90, 30));
        jPanel2.add(usernm, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 150, 30));
        jPanel2.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 150, 30));

        login.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        login.setForeground(new java.awt.Color(255, 51, 51));
        login.setText("LOGIN");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel2.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 130, 30));

        back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back.setForeground(new java.awt.Color(255, 0, 0));
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel2.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 130, 30));

        username.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        username.setText("USER NAME");
        jPanel2.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 90, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 310, 190));

        jLabel2.setBackground(new java.awt.Color(102, 102, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/585663098-blue-background-wallpaper.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 610, 240));

        setSize(new java.awt.Dimension(610, 271));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
    new FEEREPORT().setVisible(true);
    this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
      
			String username=usernm.getText();
			char ch[]=jPasswordField1.getPassword();
			String password=String.valueOf(ch);
			if(username.equals("account")&&password.equals("aks")){
				new Accountsection().setVisible(true);
                                this.setVisible(false);
				
			}else{
				JOptionPane.showMessageDialog(accountlog.this,"Sorry, username or password error!");
				usernm.setText("");
                               jPasswordField1.setText("");
			}
    }//GEN-LAST:event_loginActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new accountlog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acclogin;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JButton login;
    private javax.swing.JLabel passwo;
    private javax.swing.JLabel username;
    private javax.swing.JTextField usernm;
    // End of variables declaration//GEN-END:variables

    void Visible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
