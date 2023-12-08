package goodhealthwellbeing.view.ui;

import java.awt.event.ActionEvent;

import goodhealthwellbeing.model.User;
import goodhealthwellbeing.model.UserManager;
import goodhealthwellbeing.view.components.MentalHealthGUI;
import goodhealthwellbeing.view.components.health_module.HealthMetrics;
import goodhealthwellbeing.view.components.Nutrition;

/**
 * Modules.java
 * @author Michael Babik
 */

/**
 * This class manages different modules such as Health Metrics, Nutrition, and Mental Health, allowing
 * users to navigate between these features.
 */
public class Modules extends javax.swing.JFrame {
    
    // Static instance for implementing Singleton pattern.
    private static Modules instance;

/**
     * Creates new form Modules
     */
    Modules() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        modulesHealthMetricsBtn.addActionListener((ActionEvent e) -> {
            User currentUser = UserManager.getUser().getCurrentUser();
            HealthMetrics healthMetrics = new HealthMetrics(currentUser);
            
            healthMetrics.setVisible(true);
            Modules.this.setVisible(false);
        });
        
        modulesNutritionsBtn.addActionListener((ActionEvent e) -> {
            Nutrition nutrition = new Nutrition();
            nutrition.setVisible(true);
            Modules.this.setVisible(false);
        });
    }
    
    /**
     * Singleton method to ensure only one instance of Modules class is created.
     * If the instance does not exist then it's created. Otherwise the existing instance
     * is returned.
     * @return 
     */
    public static Modules getInstance() {
        if (instance == null) {
            instance = new Modules();
        }
        
        instance.updateUI();
        return instance;
    }
    
    /**
     * Updates the user interface elements.
     * If a user is currently logged in their full name is displayed on the UI.
     */
     private void updateUI() {
        User currentUser = UserManager.getUser().getCurrentUser();
        if (currentUser != null) {
            currentUserLabel.setText(currentUser.getFullName());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        modulesMainPanel = new javax.swing.JPanel();
        loginLeftPanel = new javax.swing.JPanel();
        modulesLogo = new javax.swing.JLabel();
        modulesRights = new javax.swing.JLabel();
        modulesWellBeingBtn = new javax.swing.JButton();
        modulesHealthMetricsBtn = new javax.swing.JButton();
        modulesNutritionsBtn = new javax.swing.JButton();
        modulesOption = new javax.swing.JLabel();
        modulesWelcome = new javax.swing.JLabel();
        currentUserLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        modulesMainPanel.setBackground(new java.awt.Color(255, 255, 255));
        modulesMainPanel.setPreferredSize(new java.awt.Dimension(800, 500));
        modulesMainPanel.setLayout(null);

        loginLeftPanel.setBackground(new java.awt.Color(0, 102, 102));
        loginLeftPanel.setPreferredSize(new java.awt.Dimension(400, 500));
        loginLeftPanel.setLayout(null);

        modulesLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ApplicationLogo.png"))); // NOI18N
        loginLeftPanel.add(modulesLogo);
        modulesLogo.setBounds(25, 33, 350, 350);

        modulesRights.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        modulesRights.setForeground(new java.awt.Color(255, 255, 255));
        modulesRights.setText("© 2023 Good Health & Well Being. All Rights Reserved");
        loginLeftPanel.add(modulesRights);
        modulesRights.setBounds(30, 431, 341, 17);

        modulesMainPanel.add(loginLeftPanel);
        loginLeftPanel.setBounds(0, 0, 400, 500);

        modulesWellBeingBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_well-being.png"))); // NOI18N
        modulesWellBeingBtn.setBorder(null);
        modulesWellBeingBtn.setBorderPainted(false);
        modulesWellBeingBtn.setContentAreaFilled(false);
        modulesWellBeingBtn.setFocusPainted(false);
        modulesWellBeingBtn.setPreferredSize(new java.awt.Dimension(105, 25));
        modulesWellBeingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modulesWellBeingBtnActionPerformed(evt);
            }
        });
        modulesMainPanel.add(modulesWellBeingBtn);
        modulesWellBeingBtn.setBounds(510, 340, 190, 90);

        modulesHealthMetricsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_health-metrics.png"))); // NOI18N
        modulesHealthMetricsBtn.setBorder(null);
        modulesHealthMetricsBtn.setBorderPainted(false);
        modulesHealthMetricsBtn.setContentAreaFilled(false);
        modulesHealthMetricsBtn.setFocusPainted(false);
        modulesHealthMetricsBtn.setPreferredSize(new java.awt.Dimension(105, 25));
        modulesMainPanel.add(modulesHealthMetricsBtn);
        modulesHealthMetricsBtn.setBounds(510, 140, 190, 90);

        modulesNutritionsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_nutrition.png"))); // NOI18N
        modulesNutritionsBtn.setBorder(null);
        modulesNutritionsBtn.setBorderPainted(false);
        modulesNutritionsBtn.setContentAreaFilled(false);
        modulesNutritionsBtn.setFocusPainted(false);
        modulesNutritionsBtn.setPreferredSize(new java.awt.Dimension(105, 25));
        modulesMainPanel.add(modulesNutritionsBtn);
        modulesNutritionsBtn.setBounds(510, 240, 190, 90);

        modulesOption.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/options.png"))); // NOI18N
        modulesMainPanel.add(modulesOption);
        modulesOption.setBounds(560, 60, 80, 60);

        modulesWelcome.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        modulesWelcome.setForeground(new java.awt.Color(0, 102, 102));
        modulesWelcome.setText("Welcome");
        modulesMainPanel.add(modulesWelcome);
        modulesWelcome.setBounds(550, 30, 110, 30);

        currentUserLabel.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        modulesMainPanel.add(currentUserLabel);
        currentUserLabel.setBounds(680, 30, 120, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(modulesMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(modulesMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modulesWellBeingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modulesWellBeingBtnActionPerformed
        dispose();
        MentalHealthGUI mentalHealth =new MentalHealthGUI();
        mentalHealth.setVisible(true);

    }//GEN-LAST:event_modulesWellBeingBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel currentUserLabel;
    private javax.swing.JPanel loginLeftPanel;
    private javax.swing.JButton modulesHealthMetricsBtn;
    private javax.swing.JLabel modulesLogo;
    private javax.swing.JPanel modulesMainPanel;
    private javax.swing.JButton modulesNutritionsBtn;
    private javax.swing.JLabel modulesOption;
    private javax.swing.JLabel modulesRights;
    private javax.swing.JLabel modulesWelcome;
    private javax.swing.JButton modulesWellBeingBtn;
    // End of variables declaration//GEN-END:variables
}
