/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Users;

import Config.Session;
import Config.config;
import Config.passwordHasher;
import LoginPage.Login;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Raven
 */
public class ChangePass extends javax.swing.JFrame {

    /** Creates new form User */
    public ChangePass() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        idDisplay = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        header7 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        header14 = new javax.swing.JPanel();
        Acc_lname1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Acc_fname1 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        oldpass = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        newpass = new javax.swing.JPasswordField();
        jLabel36 = new javax.swing.JLabel();
        conpass = new javax.swing.JPasswordField();
        save = new javax.swing.JLabel();
        save1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(153, 0, 51));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(0, 102, 102));
        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        idDisplay.setText("ID:");
        jPanel10.add(idDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 16, 80, 30));

        jLabel16.setFont(new java.awt.Font("Berlin Sans FB", 1, 24)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Account Information");
        jPanel10.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 610, 40));

        jLabel28.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("X");
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });
        jPanel10.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 40, 40));

        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 60));

        header7.setBackground(new java.awt.Color(255, 255, 255));
        header7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel9.add(header7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, 280));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 150, 40));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel11.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 290));

        header14.setBackground(new java.awt.Color(0,0,0,60));
        header14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Acc_lname1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Acc_lname1.setForeground(new java.awt.Color(255, 255, 255));
        Acc_lname1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Acc_lname1.setText("FirstName");
        Acc_lname1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        header14.add(Acc_lname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 140, 30));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gwwapo-removebg-preview.png"))); // NOI18N
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        header14.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 80));

        Acc_fname1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Acc_fname1.setForeground(new java.awt.Color(255, 255, 255));
        Acc_fname1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Acc_fname1.setText("Lname");
        Acc_fname1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        header14.add(Acc_fname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 130, 30));

        jPanel11.add(header14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 130, 130));

        jPanel9.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, 330));

        jLabel34.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel34.setText("type Old Pass");
        jPanel9.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 90, -1));
        jPanel9.add(oldpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 150, -1));

        jLabel35.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel35.setText("Enter New Pass");
        jPanel9.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 130, -1));
        jPanel9.add(newpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 150, -1));

        jLabel36.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel36.setText("Confirm Pass:");
        jPanel9.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 100, -1));

        conpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conpassActionPerformed(evt);
            }
        });
        jPanel9.add(conpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 150, -1));

        save.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        save.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        save.setText("BACK");
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMouseClicked(evt);
            }
        });
        jPanel9.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 50, 30));

        save1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        save1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        save1.setText("SAVE");
        save1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                save1MouseClicked(evt);
            }
        });
        jPanel9.add(save1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 70, 30));

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 22, 670, 390));

        setSize(new java.awt.Dimension(764, 473));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
    }//GEN-LAST:event_formWindowActivated

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel28MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void conpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conpassActionPerformed

    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked

        accountDetails ad = new accountDetails();
        ad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_saveMouseClicked

    private void save1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save1MouseClicked
        try{
            config conf = new config();
            Session ses = Session.getInstance();

            String query = "SELECT * from users WHERE id = '"+ses.getId()+"'";
            ResultSet rs = conf.getData(query);

            if(rs.next()){

                String  olddbpass=rs.getString("pname");
                String oldhash = passwordHasher.hashPassword(oldpass.getText());
                if(olddbpass.equals(oldhash)){
                    String npass=passwordHasher.hashPassword(newpass.getText());
                    conf.updateData("UPDATE users SET pname ='"+npass+"' ");
                    JOptionPane.showMessageDialog(null,"updated  Succesfully!");
                    Login lg = new Login();
                    lg.setVisible(true);
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(null,"Old password is incorrect!");
                }

            }
        }catch(SQLException | NoSuchAlgorithmException ex){
            System.out.println(""+ ex);
        }
    }//GEN-LAST:event_save1MouseClicked

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
            java.util.logging.Logger.getLogger(ChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Acc_fname1;
    private javax.swing.JLabel Acc_lname1;
    private javax.swing.JPasswordField conpass;
    private javax.swing.JPanel header14;
    private javax.swing.JPanel header7;
    private javax.swing.JLabel idDisplay;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField newpass;
    private javax.swing.JTextField oldpass;
    private javax.swing.JLabel save;
    private javax.swing.JLabel save1;
    // End of variables declaration//GEN-END:variables

}
