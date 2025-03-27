/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Users;

import Config.Session;
import LoginPage.Login;

/**
 *
 * @author Raven
 */
public class accountDetails extends javax.swing.JFrame {

    /** Creates new form User */
    public accountDetails() {
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
        header14 = new javax.swing.JPanel();
        Acc_lname1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Acc_fname1 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        utype = new javax.swing.JComboBox<>();
        email = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        cpass = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();

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

        header7.add(header14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 130, 130));

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

        jPanel9.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, 330));

        jLabel33.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel33.setText("First Name:");
        jPanel9.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 90, -1));
        jPanel9.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 150, -1));

        jLabel30.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("Last Name:");
        jPanel9.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 90, -1));
        jPanel9.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 150, -1));

        jLabel31.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel31.setText("Gender:");
        jPanel9.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 90, -1));

        gender.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        gender.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });
        jPanel9.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 150, -1));

        jLabel32.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel32.setText("User Type:");
        jPanel9.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 90, -1));

        utype.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        utype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Staff" }));
        utype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utypeActionPerformed(evt);
            }
        });
        jPanel9.add(utype, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 150, -1));
        jPanel9.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 150, -1));

        jLabel24.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Email:");
        jPanel9.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 90, -1));

        jLabel23.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Contact #:");
        jPanel9.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 90, -1));
        jPanel9.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 150, -1));

        cpass.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cpass.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cpass.setText("CHANGE PASS");
        cpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cpassMouseClicked(evt);
            }
        });
        jPanel9.add(cpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 90, 30));
        jPanel9.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 150, -1));

        jLabel34.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel34.setText("Username:");
        jPanel9.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 90, -1));

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 22, 670, 390));

        setSize(new java.awt.Dimension(764, 473));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Session ses = Session.getInstance();
       
         idDisplay.setText(""+ses.getId());
          fname.setText(""+ses.getFname());
           lname.setText(""+ses.getLnmae());
            gender.setSelectedItem(""+ses.getGender());
             utype.setSelectedItem(""+ses.getAccount_type());
             email.setText(""+ses.getEmail());
               uname.setText(""+ses.getUname());
                
                   contact.setText(""+ses.getContact());
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

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void utypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_utypeActionPerformed

    private void cpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpassMouseClicked

        ChangePass cp = new ChangePass();
        cp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cpassMouseClicked

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
            java.util.logging.Logger.getLogger(accountDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(accountDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(accountDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(accountDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new accountDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Acc_fname1;
    private javax.swing.JLabel Acc_lname1;
    private javax.swing.JTextField contact;
    private javax.swing.JLabel cpass;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JPanel header14;
    private javax.swing.JPanel header7;
    private javax.swing.JLabel idDisplay;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField uname;
    private javax.swing.JComboBox<String> utype;
    // End of variables declaration//GEN-END:variables

}
