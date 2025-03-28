/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

import admin.addForm;
import admin.Admins;
import Config.Session;
import Config.config;
import LoginPage.Login;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Raven
 */
public class UsersForm extends javax.swing.JFrame {

    /**
     * 
     */
    public UsersForm() {
        initComponents();
        displayData();
    }
      Color nc=new Color( 0,0,153);
       Color hc=new Color(77,85,204);
    
    public void displayData(){
        try{
            config conf = new config();
            ResultSet rs = conf.getData("SELECT * FROM users");
            table_users.setModel(DbUtils.resultSetToTableModel(rs));
             rs.close();
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        adds = new javax.swing.JPanel();
        U_id2 = new javax.swing.JLabel();
        edit = new javax.swing.JPanel();
        U_id3 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_users = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel9.setBackground(new java.awt.Color(102, 0, 51));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(0, 102, 102));
        jPanel10.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 51, 102)));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Berlin Sans FB", 1, 24)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("BOOKING ADMIN DASHBOARD");
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

        jPanel12.setBackground(new java.awt.Color(0, 102, 102));
        jPanel12.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 51, 102)));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Berlin Sans FB", 1, 24)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("BOOKING ADMIN DASHBOARD");
        jPanel12.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 610, 40));

        jLabel29.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("X");
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
        });
        jPanel12.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 40, 40));

        jPanel10.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 60));

        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 60));

        jPanel11.setBackground(new java.awt.Color(153, 0, 51));
        jPanel11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 150, 50));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gwapo-removebg-preview.png"))); // NOI18N
        jPanel11.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 110));

        adds.setBackground(new java.awt.Color(153, 153, 255));
        adds.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addsMouseExited(evt);
            }
        });
        adds.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        U_id2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        U_id2.setForeground(new java.awt.Color(255, 255, 255));
        U_id2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        U_id2.setText("ADD");
        U_id2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        U_id2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                U_id2MouseClicked(evt);
            }
        });
        adds.add(U_id2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 80, 10));

        jPanel11.add(adds, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 150, 30));

        edit.setBackground(new java.awt.Color(153, 153, 255));
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editMouseExited(evt);
            }
        });
        edit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        U_id3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        U_id3.setForeground(new java.awt.Color(255, 255, 255));
        U_id3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        U_id3.setText("EDIT");
        U_id3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        U_id3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                U_id3MouseClicked(evt);
            }
        });
        edit.add(U_id3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 80, 10));

        jPanel11.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 150, 30));

        id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id.setText("ID:");
        id.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel11.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 150, 30));

        jLabel1.setBackground(new java.awt.Color(153, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel11.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 110));

        jPanel9.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 150, 330));

        jScrollPane1.setViewportView(table_users);

        jPanel9.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 500, 310));

        getContentPane().add(jPanel9);
        jPanel9.setBounds(41, 33, 670, 390);

        setSize(new java.awt.Dimension(769, 503));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
         Session ses = Session.getInstance();
       
        
        if (ses.getId()==0){
           JOptionPane.showMessageDialog(null,"No accout verefied, Login first!");
           Login lg = new Login();
           lg.setVisible(true);
           this.dispose();
           
        }else{
       id.setText(""+ses.getId());
        
       
        }
          
        
    }//GEN-LAST:event_formWindowActivated

    private void idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_idMouseClicked

    private void U_id1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_U_id1MouseClicked
        addForm af=new addForm();
        af.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_U_id1MouseClicked

    private void u_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_u_addMouseClicked
        addForm af=new addForm();
        af.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_u_addMouseClicked

    private void u_addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_u_addMouseEntered

        adds.setBackground(nc);
    }//GEN-LAST:event_u_addMouseEntered

    private void u_addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_u_addMouseExited
        adds.setBackground(hc);
    }//GEN-LAST:event_u_addMouseExited

    private void U_id12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_U_id12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_U_id12MouseClicked

    private void u_editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_u_editMouseClicked
          int rowIndex  = table_users.getSelectedRow();
           if(rowIndex < 0){
               JOptionPane.showMessageDialog(null,"Please Select Item!");
           }else{
               
               try{
            config conf = new config();
                 TableModel tbl= table_users.getModel();
              ResultSet rs=conf.getData("SELECT * FROM users WHERE id ='"+tbl.getValueAt(rowIndex, 0)+"'"); 
            if(rs.next()){  
                
                 addForm adf = new addForm();
               adf.id.setText(""+rs.getString("id"));
              adf.fname.setText(""+rs.getString("fname"));
              adf.lname.setText(""+rs.getString("lname"));
              
               adf.gender.setSelectedItem(""+rs.getString("gender"));
               adf.email.setText(""+rs.getString("email"));
               adf.uname.setText(""+rs.getString("uname"));
               adf.pname.setText(""+rs.getString("pname"));
               adf.contact.setText(""+rs.getString("contact"));
                 
               adf.add.setEnabled(false);
               adf.update.setEnabled(true);
               adf.setVisible(true);
              this.dispose();
            }
               }catch(SQLException ex){
                   System.out.println(""+ex);
               }
           }
        
        
    }//GEN-LAST:event_u_editMouseClicked

    private void u_editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_u_editMouseEntered
         edit.setBackground(nc);
    }//GEN-LAST:event_u_editMouseEntered

    private void u_editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_u_editMouseExited
       
         edit.setBackground(hc);
    }//GEN-LAST:event_u_editMouseExited

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel28MouseClicked

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel29MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Admins ads= new Admins();
        ads.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void U_id2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_U_id2MouseClicked

    }//GEN-LAST:event_U_id2MouseClicked

    private void addsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addsMouseClicked

        addForm login = new addForm();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addsMouseClicked

    private void addsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addsMouseEntered

        adds.setBackground(nc);
    }//GEN-LAST:event_addsMouseEntered

    private void addsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addsMouseExited
        adds.setBackground(hc);
    }//GEN-LAST:event_addsMouseExited

    private void U_id3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_U_id3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_U_id3MouseClicked

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked

        int rowIndex  = table_users.getSelectedRow();
        if(rowIndex < 0){
            JOptionPane.showMessageDialog(null,"Please Select Item!");
        }else{

            try{
                config conf = new config();
                TableModel tbl= table_users.getModel();
                ResultSet rs=conf.getData("SELECT * FROM users WHERE id ='"+tbl.getValueAt(rowIndex, 0)+"'");
                if(rs.next()){

                    addForm adf = new addForm();
                    adf.id.setText(""+rs.getString("id"));
                    adf.fname.setText(""+rs.getString("fname"));
                    adf.lname.setText(""+rs.getString("lname"));

                    adf.gender.setSelectedItem(""+rs.getString("gender"));
                    adf.email.setText(""+rs.getString("email"));
                    adf.uname.setText(""+rs.getString("uname"));
                    adf.pname.setText(""+rs.getString("pname"));
                    adf.contact.setText(""+rs.getString("contact"));

                    adf.add.setEnabled(false);
                    adf.update.setEnabled(true);
                    adf.setVisible(true);
                    this.dispose();
                }
            }catch(SQLException ex){
                System.out.println(""+ex);
            }
        }
    }//GEN-LAST:event_editMouseClicked

    private void editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseEntered
        edit.setBackground(nc);
    }//GEN-LAST:event_editMouseEntered

    private void editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseExited
        edit.setBackground(hc);
    }//GEN-LAST:event_editMouseExited

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
            java.util.logging.Logger.getLogger(UsersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsersForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel U_id2;
    private javax.swing.JLabel U_id3;
    private javax.swing.JPanel adds;
    private javax.swing.JPanel edit;
    private javax.swing.JLabel id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_users;
    // End of variables declaration//GEN-END:variables
}
