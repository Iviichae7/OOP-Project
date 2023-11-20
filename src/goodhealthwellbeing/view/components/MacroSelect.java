
package goodhealthwellbeing.view.components;

import goodhealthwellbeing.output.ProteinOutput;
import goodhealthwellbeing.output.FatOutput;
import goodhealthwellbeing.output.CarbohydrateOutput;
import goodhealthwellbeing.util.*;
import java.awt.event.ActionEvent;

/**
 * 11/11/23
 * Nutrition.java
 * @author ryans
 */
public class MacroSelect extends javax.swing.JFrame {

    /**
     * Creates new form MacroInfo
     */
    
    public MacroSelect() {
        initComponents();
          
        homeButton.addActionListener((ActionEvent e) -> {
            Nutrition nutrition = new Nutrition();
            nutrition.setVisible(true);
            MacroSelect.this.setVisible(false);
            
        });
        
        carbButton.addActionListener((ActionEvent e) -> {
            Macro macro = new CarbohydrateOutput();
            lblEnergy.setText(macro.getEnergy());
            txtDescription.setText(macro.getDescription());
        });
        
        proteinButton.addActionListener((ActionEvent e) -> {
            Macro macro = new ProteinOutput();
            lblEnergy.setText(macro.getEnergy());
            txtDescription.setText(macro.getDescription());
        });
        
        fatButton.addActionListener((ActionEvent e) -> {
            Macro macro = new FatOutput();
            lblEnergy.setText(macro.getEnergy());
            txtDescription.setText(macro.getDescription());
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        macroInfoMainPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        loginLogo = new javax.swing.JLabel();
        logoRights = new javax.swing.JLabel();
        homeButton = new javax.swing.JButton();
        fatButton = new javax.swing.JButton();
        carbButton = new javax.swing.JButton();
        proteinButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblEnergy = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        lblSources = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        macroInfoMainPanel.setBackground(new java.awt.Color(255, 255, 255));
        macroInfoMainPanel.setPreferredSize(new java.awt.Dimension(800, 500));
        macroInfoMainPanel.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 500));

        loginLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ApplicationLogo.png"))); // NOI18N

        logoRights.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        logoRights.setForeground(new java.awt.Color(255, 255, 255));
        logoRights.setText("© 2023 Good Health & Well Being. All Rights Reserved");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoRights, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginLogo))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(loginLogo)
                .addGap(31, 31, 31)
                .addComponent(logoRights, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        macroInfoMainPanel.add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 500);

        homeButton.setBackground(new java.awt.Color(255, 255, 255));
        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_back.png"))); // NOI18N
        homeButton.setBorder(null);
        homeButton.setBorderPainted(false);
        homeButton.setContentAreaFilled(false);
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        macroInfoMainPanel.add(homeButton);
        homeButton.setBounds(420, 10, 50, 30);

        fatButton.setBackground(new java.awt.Color(255, 255, 255));
        fatButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        fatButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_fats (2).png"))); // NOI18N
        fatButton.setBorder(null);
        fatButton.setBorderPainted(false);
        fatButton.setContentAreaFilled(false);
        fatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fatButtonActionPerformed(evt);
            }
        });
        macroInfoMainPanel.add(fatButton);
        fatButton.setBounds(650, 80, 170, 40);

        carbButton.setBackground(new java.awt.Color(255, 255, 255));
        carbButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        carbButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_carbohydrate (1).png"))); // NOI18N
        carbButton.setBorder(null);
        carbButton.setBorderPainted(false);
        carbButton.setContentAreaFilled(false);
        carbButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carbButtonActionPerformed(evt);
            }
        });
        macroInfoMainPanel.add(carbButton);
        carbButton.setBounds(380, 80, 170, 40);

        proteinButton.setBackground(new java.awt.Color(255, 255, 255));
        proteinButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        proteinButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_protein (2).png"))); // NOI18N
        proteinButton.setBorder(null);
        proteinButton.setBorderPainted(false);
        proteinButton.setContentAreaFilled(false);
        proteinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proteinButtonActionPerformed(evt);
            }
        });
        macroInfoMainPanel.add(proteinButton);
        proteinButton.setBounds(515, 80, 170, 40);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Select which Macronutrient you want to learn more about!");
        macroInfoMainPanel.add(jLabel1);
        jLabel1.setBounds(420, 50, 410, 16);

        lblEnergy.setForeground(new java.awt.Color(0, 0, 0));
        lblEnergy.setText("Energy Per Gram");
        macroInfoMainPanel.add(lblEnergy);
        lblEnergy.setBounds(420, 130, 220, 30);

        jScrollPane1.setForeground(new java.awt.Color(0, 0, 0));

        txtDescription.setColumns(20);
        txtDescription.setLineWrap(true);
        txtDescription.setRows(5);
        txtDescription.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtDescription);

        macroInfoMainPanel.add(jScrollPane1);
        jScrollPane1.setBounds(420, 170, 360, 140);

        lblSources.setForeground(new java.awt.Color(0, 0, 0));
        lblSources.setText("Sources");
        macroInfoMainPanel.add(lblSources);
        lblSources.setBounds(420, 330, 100, 16);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(macroInfoMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(macroInfoMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homeButtonActionPerformed

    private void carbButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carbButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carbButtonActionPerformed

    private void fatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fatButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fatButtonActionPerformed

    private void proteinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proteinButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proteinButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MacroSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MacroSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MacroSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MacroSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MacroSelect().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton carbButton;
    private javax.swing.JButton fatButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEnergy;
    private javax.swing.JLabel lblSources;
    private javax.swing.JLabel loginLogo;
    private javax.swing.JLabel logoRights;
    private javax.swing.JPanel macroInfoMainPanel;
    private javax.swing.JButton proteinButton;
    private javax.swing.JTextArea txtDescription;
    // End of variables declaration//GEN-END:variables
}
