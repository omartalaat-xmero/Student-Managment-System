/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package studentmanagementsystem;
import javax.swing.JOptionPane;

/**
 *
 * @author MAHMOUD TALAAT
 */
public class Adminlogin extends javax.swing.JFrame {

    /**
     * Creates new form instlogin
     */
    public  Adminlogin() {
        initComponents();
        this.setVisible(true);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainpanel = new javax.swing.JPanel();
        text = new javax.swing.JLabel();
        ipID = new javax.swing.JTextField();
        joinbutton = new javax.swing.JButton();
        cancelbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainpanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Admin login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(51, 0, 153))); // NOI18N
        mainpanel.setForeground(new java.awt.Color(51, 51, 51));

        text.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        text.setText("Enter your ID :");

        ipID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipIDActionPerformed(evt);
            }
        });

        joinbutton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        joinbutton.setText("Join");
        joinbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                joinbuttonMouseClicked(evt);
            }
        });
        joinbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joinbuttonActionPerformed(evt);
            }
        });

        cancelbutton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cancelbutton.setText("Cancel");
        cancelbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelbuttonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mainpanelLayout = new javax.swing.GroupLayout(mainpanel);
        mainpanel.setLayout(mainpanelLayout);
        mainpanelLayout.setHorizontalGroup(
            mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainpanelLayout.createSequentialGroup()
                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainpanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ipID, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainpanelLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(joinbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(cancelbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        mainpanelLayout.setVerticalGroup(
            mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainpanelLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text)
                    .addComponent(ipID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(joinbutton)
                    .addComponent(cancelbutton))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainpanel.getAccessibleContext().setAccessibleName("student login");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void joinbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joinbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_joinbuttonActionPerformed
    
    private void joinbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_joinbuttonMouseClicked
        // TODO add your handling code here:
        if (ipID.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Enter Your ID ");
        }
        else if(ipID.getText().equals("Admin")){
            new Admininterface();
            this.dispose();
        }
        else {
            JOptionPane.showMessageDialog(null,"wrong id");
        }
    }//GEN-LAST:event_joinbuttonMouseClicked

    private void ipIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ipIDActionPerformed

    private void cancelbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelbuttonMouseClicked
        // TODO add your handling code here:
        new AppStart();
        this.dispose();
    }//GEN-LAST:event_cancelbuttonMouseClicked

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
            java.util.logging.Logger.getLogger(Adminlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Adminlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Adminlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adminlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Adminlogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelbutton;
    private javax.swing.JTextField ipID;
    private javax.swing.JButton joinbutton;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JLabel text;
    // End of variables declaration//GEN-END:variables
}
