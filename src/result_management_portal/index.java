/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package result_management_portal;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.*;
/*
 *
 * @author sundharmoorthyg
 */
public class index extends javax.swing.JFrame {

    /**
     * Creates new form index
     */
    public index() {
        initComponents();
        //scaleImage();
    }
//
//    public void scaleImage(){
//        ImageIcon icon = new ImageIcon("");
//        Image img = icon.getImage();
//        Image imgScale = img.getScaledInstance(jLabel1.getWidth(),jLabel1.getHeight(),Image.SCALE_SMOOTH);
//        ImageIcon scaleIcon = new ImageIcon(imgScale);
//        jLabel1.setIcon(scaleIcon);
//}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        STUDENT = new javax.swing.JButton();
        ADMIN = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        STUDENT.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        STUDENT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/result_management_portal/icons8-student-42.png"))); // NOI18N
        STUDENT.setText("STUDENT");
        STUDENT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STUDENTActionPerformed(evt);
            }
        });
        getContentPane().add(STUDENT, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 558, 150, 50));

        ADMIN.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        ADMIN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/result_management_portal/icons8-admin-42.png"))); // NOI18N
        ADMIN.setText("ADMIN");
        ADMIN.setMaximumSize(new java.awt.Dimension(144, 48));
        ADMIN.setMinimumSize(new java.awt.Dimension(144, 48));
        ADMIN.setPreferredSize(new java.awt.Dimension(144, 48));
        ADMIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADMINActionPerformed(evt);
            }
        });
        getContentPane().add(ADMIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 560, 150, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/result_management_portal/boy-5731001_1280.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-160, 0, 1260, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void STUDENTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STUDENTActionPerformed
        setVisible(false);
        new studentAdmin().setVisible(true);
    }//GEN-LAST:event_STUDENTActionPerformed

    private void ADMINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADMINActionPerformed
          setVisible(false);
          new adminIndex().setVisible(true);
    }//GEN-LAST:event_ADMINActionPerformed

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
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADMIN;
    private javax.swing.JButton STUDENT;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
