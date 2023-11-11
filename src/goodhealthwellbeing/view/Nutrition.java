
package goodhealthwellbeing.view;

import java.awt.event.ActionEvent;

/*
 * 11/11/23
 * Nutrition.java
 * @author ryans
 */
public class Nutrition extends javax.swing.JFrame {

    public Nutrition() {
        
        initComponents();
        
        macroInfoButton.addActionListener((ActionEvent e) -> {
            MacroInfo macro = new MacroInfo();
            macro.setVisible(true);
            Nutrition.this.setVisible(false);
        });
        
        calorieTrackerButton.addActionListener((ActionEvent e) -> {
            CalorieTracker cal = new CalorieTracker();
            cal.setVisible(true);
            Nutrition.this.setVisible(false);
        });
        
        homeButton.addActionListener((ActionEvent e) -> {
            Modules module = new Modules();
            module.setVisible(true);
            Nutrition.this.setVisible(false);
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nutrtionMainPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();
        calorieTrackerButton = new javax.swing.JButton();
        macroInfoButton = new javax.swing.JButton();
        nutritionPrompt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nutrtionMainPanel.setBackground(new java.awt.Color(255, 255, 255));
        nutrtionMainPanel.setPreferredSize(new java.awt.Dimension(800, 500));
        nutrtionMainPanel.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 500));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        nutrtionMainPanel.add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 500);

        homeButton.setText("HOME");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        nutrtionMainPanel.add(homeButton);
        homeButton.setBounds(420, 30, 72, 23);

        calorieTrackerButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        calorieTrackerButton.setText("Calorie Tracker");
        calorieTrackerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calorieTrackerButtonActionPerformed(evt);
            }
        });
        nutrtionMainPanel.add(calorieTrackerButton);
        calorieTrackerButton.setBounds(430, 340, 160, 60);

        macroInfoButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        macroInfoButton.setText("Macro Info");
        macroInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                macroInfoButtonActionPerformed(evt);
            }
        });
        nutrtionMainPanel.add(macroInfoButton);
        macroInfoButton.setBounds(610, 340, 160, 60);

        nutritionPrompt.setForeground(new java.awt.Color(0, 0, 0));
        nutritionPrompt.setText("Welcome to your Nutrition hub! Please select the service you wish to use.");
        nutritionPrompt.setAlignmentY(0.0F);
        nutritionPrompt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nutrtionMainPanel.add(nutritionPrompt);
        nutritionPrompt.setBounds(410, 180, 390, 50);

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
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homeButtonActionPerformed

    private void calorieTrackerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calorieTrackerButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calorieTrackerButtonActionPerformed

    private void macroInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_macroInfoButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_macroInfoButtonActionPerformed

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
    private javax.swing.JButton calorieTrackerButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton macroInfoButton;
    private javax.swing.JLabel nutritionPrompt;
    private javax.swing.JPanel nutrtionMainPanel;
    // End of variables declaration//GEN-END:variables
}
