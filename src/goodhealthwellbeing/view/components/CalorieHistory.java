package goodhealthwellbeing.view.components;

import goodhealthwellbeing.util.TotalCaloriesList;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 * CalorieHistory.java
 * @author Ryan Stokes
 */
public class CalorieHistory extends javax.swing.JFrame {

     DefaultListModel dlm;
     TotalCaloriesList tcl;
    /**
     * Creates new form CalorieHistory
     * @throws java.io.FileNotFoundException
     */
    public CalorieHistory() throws FileNotFoundException {
        initComponents();
        dlm = new DefaultListModel();
        tcl = TotalCaloriesList.getInstance();
        tcl.loadFile();
        loadCals();
        
        homeButton.addActionListener((ActionEvent e) -> {
            CalorieTracker calTrack = new CalorieTracker();
            calTrack.setVisible(true);
            CalorieHistory.this.setVisible(false);
        });
    }
    
    public void totalCalorieLoad(){
    }
    
    private void loadCals()
    {
        dlm.clear();
        
        for(int i = 1; i < tcl.getCalories().size(); i++)
        {
            dlm.addElement(tcl.getCalories().get(i));
        }
        
        this.jList1.setModel(dlm);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        calorieTrackerMainPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        loginLogo = new javax.swing.JLabel();
        logoRights = new javax.swing.JLabel();
        homeButton = new javax.swing.JButton();
        lblPrompt1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        calorieTrackerMainPanel.setBackground(new java.awt.Color(255, 255, 255));
        calorieTrackerMainPanel.setPreferredSize(new java.awt.Dimension(800, 500));
        calorieTrackerMainPanel.setLayout(null);

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
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoRights, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginLogo))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(loginLogo)
                .addGap(28, 28, 28)
                .addComponent(logoRights, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        calorieTrackerMainPanel.add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 500);

        homeButton.setBackground(new java.awt.Color(255, 255, 255));
        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_back.png"))); // NOI18N
        homeButton.setBorderPainted(false);
        homeButton.setContentAreaFilled(false);
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        calorieTrackerMainPanel.add(homeButton);
        homeButton.setBounds(420, 30, 50, 30);

        lblPrompt1.setBackground(new java.awt.Color(0, 0, 0));
        lblPrompt1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPrompt1.setForeground(new java.awt.Color(0, 0, 0));
        lblPrompt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrompt1.setText("Calorie History");
        calorieTrackerMainPanel.add(lblPrompt1);
        lblPrompt1.setBounds(410, 80, 380, 30);

        jScrollPane1.setViewportView(jList1);

        calorieTrackerMainPanel.add(jScrollPane1);
        jScrollPane1.setBounds(430, 120, 340, 300);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(calorieTrackerMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(calorieTrackerMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CalorieHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalorieHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalorieHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalorieHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new CalorieHistory().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(CalorieHistory.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel calorieTrackerMainPanel;
    private javax.swing.JButton homeButton;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPrompt1;
    private javax.swing.JLabel loginLogo;
    private javax.swing.JLabel logoRights;
    // End of variables declaration//GEN-END:variables
}
