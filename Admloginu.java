
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;


public class Admloginu extends javax.swing.JFrame {
    private Object frame;

 
    public Admloginu() {
        initComponents();
        setTitle("admin login");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        username = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        password = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 255, 255));
        jPanel4.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("ADMIN LOGIN");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(0, 0, 180, 20);

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 510, 30));

        jPanel3.setBackground(new java.awt.Color(0, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        username.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        username.setText("NAME");
        jPanel3.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 54, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 150, 30));

        password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        password.setText("PASSWORD");
        jPanel3.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 90, 40));
        jPanel3.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 151, 33));

        login.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        login.setForeground(new java.awt.Color(255, 102, 51));
        login.setText("LOGIN");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel3.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 130, 30));

        back.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        back.setForeground(new java.awt.Color(255, 51, 0));
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel3.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 120, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 510, 220));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/585663098-blue-background-wallpaper.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 280));

        setSize(new java.awt.Dimension(552, 328));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new FEEREPORT().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed

        String username=jTextField1.getText();
        char ch[]=jPasswordField1.getPassword();
        String password=String.valueOf(ch);
        if(username.equals("admin")&&password.equals("aks")){
            new AdminSection().setVisible(true);
            this.setVisible(false);

        }else{
            JOptionPane.showMessageDialog(Admloginu.this,"Sorry, username or password error!");
            jTextField1.setText("");
            jPasswordField1.setText("");
        }
    }//GEN-LAST:event_loginActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

  
    public static void main(String args[]) {
        

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admloginu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton login;
    private javax.swing.JLabel password;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
