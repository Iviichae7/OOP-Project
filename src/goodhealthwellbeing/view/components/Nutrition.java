
package goodhealthwellbeing.view.components;

import java.awt.event.ActionEvent;

import goodhealthwellbeing.view.ui.Modules;

/*
 * 11/11/23
 * Nutrition.java
 * @author ryans
 */
public class Nutrition extends javax.swing.JFrame {

    public Nutrition() {
        
        initComponents();
        
        btnBmr.addActionListener((ActionEvent e) -> {
            BmrCalc bmr = new BmrCalc();
            bmr.setVisible(true);
            Nutrition.this.setVisible(false);
        });
        
        btnMacroInfo.addActionListener((ActionEvent e) -> {
            MacroSelect macro = new MacroSelect();
            macro.setVisible(true);
            Nutrition.this.setVisible(false);
        });
        
        btnCalTrack.addActionListener((ActionEvent e) -> {
            CalorieTracker cal = new CalorieTracker();
            cal.setVisible(true);
            Nutrition.this.setVisible(false);
        });
        
        btnHome.addActionListener((ActionEvent e) -> {
            Modules modules = Modules.getInstance();
            modules.setVisible(true);
            Nutrition.this.setVisible(false);
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nutrtionMainPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        loginLogo = new javax.swing.JLabel();
        logoRights = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        btnCalTrack = new javax.swing.JButton();
        btnMacroInfo = new javax.swing.JButton();
        nutritionPrompt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnBmr = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nutrtionMainPanel.setBackground(new java.awt.Color(255, 255, 255));
        nutrtionMainPanel.setPreferredSize(new java.awt.Dimension(800, 500));
        nutrtionMainPanel.setLayout(null);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginLogo)
                    .addComponent(logoRights, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(loginLogo)
                .addGap(46, 46, 46)
                .addComponent(logoRights)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        nutrtionMainPanel.add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 500);

        btnHome.setBackground(new java.awt.Color(255, 255, 255));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_back.png"))); // NOI18N
        btnHome.setBorder(null);
        btnHome.setBorderPainted(false);
        btnHome.setContentAreaFilled(false);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        nutrtionMainPanel.add(btnHome);
        btnHome.setBounds(420, 30, 50, 30);

        btnCalTrack.setBackground(new java.awt.Color(255, 255, 255));
        btnCalTrack.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCalTrack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_calorie-tracker.png"))); // NOI18N
        btnCalTrack.setBorderPainted(false);
        btnCalTrack.setContentAreaFilled(false);
        btnCalTrack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalTrackActionPerformed(evt);
            }
        });
        nutrtionMainPanel.add(btnCalTrack);
        btnCalTrack.setBounds(500, 360, 190, 90);

        btnMacroInfo.setBackground(new java.awt.Color(255, 255, 255));
        btnMacroInfo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnMacroInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_macro-info.png"))); // NOI18N
        btnMacroInfo.setBorderPainted(false);
        btnMacroInfo.setContentAreaFilled(false);
        btnMacroInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMacroInfoActionPerformed(evt);
            }
        });
        nutrtionMainPanel.add(btnMacroInfo);
        btnMacroInfo.setBounds(500, 260, 190, 90);

        nutritionPrompt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nutritionPrompt.setForeground(new java.awt.Color(0, 0, 0));
        nutritionPrompt.setText("Welcome to your Nutrition hub! ");
        nutritionPrompt.setAlignmentY(0.0F);
        nutritionPrompt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nutrtionMainPanel.add(nutritionPrompt);
        nutritionPrompt.setBounds(500, 80, 260, 20);

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Please select the service you wish to use.");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nutrtionMainPanel.add(jLabel1);
        jLabel1.setBounds(490, 110, 280, 20);

        btnBmr.setBackground(new java.awt.Color(255, 255, 255));
        btnBmr.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBmr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_bmr-calc.png"))); // NOI18N
        btnBmr.setBorderPainted(false);
        btnBmr.setContentAreaFilled(false);
        btnBmr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBmrActionPerformed(evt);
            }
        });
        nutrtionMainPanel.add(btnBmr);
        btnBmr.setBounds(500, 160, 190, 90);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(nutrtionMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(nutrtionMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnCalTrackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalTrackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalTrackActionPerformed

    private void btnMacroInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMacroInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMacroInfoActionPerformed

    private void btnBmrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBmrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBmrActionPerformed

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
            java.util.logging.Logger.getLogger(Nutrition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nutrition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nutrition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nutrition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Nutrition().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBmr;
    private javax.swing.JButton btnCalTrack;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnMacroInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel loginLogo;
    private javax.swing.JLabel logoRights;
    private javax.swing.JLabel nutritionPrompt;
    private javax.swing.JPanel nutrtionMainPanel;
    // End of variables declaration//GEN-END:variables
}
