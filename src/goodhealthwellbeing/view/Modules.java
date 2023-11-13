
package goodhealthwellbeing.view;

import java.awt.event.ActionEvent;

public class Modules extends javax.swing.JFrame {

    public Modules() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        modulesHealthMetricsBtn.addActionListener((ActionEvent e) -> {
            HealthMetrics healthmetrics = new HealthMetrics();
            healthmetrics.setVisible(true);
            Modules.this.setVisible(false);
        });
        
        modulesNutritionsBtn.addActionListener((ActionEvent e) -> {
            Nutrition nutrition = new Nutrition();
            nutrition.setVisible(true);
            Modules.this.setVisible(false);
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        modulesMainPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        modulesLogo = new javax.swing.JLabel();
        modulesRights = new javax.swing.JLabel();
        modulesWellBeingBtn = new javax.swing.JButton();
        modulesHealthMetricsBtn = new javax.swing.JButton();
        modulesNutritionsBtn = new javax.swing.JButton();
        modulesOption = new javax.swing.JLabel();
        modulesWelcome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        modulesMainPanel.setBackground(new java.awt.Color(255, 255, 255));
        modulesMainPanel.setPreferredSize(new java.awt.Dimension(800, 500));
        modulesMainPanel.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 500));

        modulesLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ApplicationLogo.png"))); // NOI18N

        modulesRights.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        modulesRights.setForeground(new java.awt.Color(255, 255, 255));
        modulesRights.setText("© 2023 Good Health & Well Being. All Rights Reserved");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(modulesRights)
                    .addComponent(modulesLogo))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(modulesLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(modulesRights)
                .addGap(52, 52, 52))
        );

        modulesMainPanel.add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 500);

        modulesWellBeingBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_well-being.png"))); // NOI18N
        modulesWellBeingBtn.setBorder(null);
        modulesWellBeingBtn.setPreferredSize(new java.awt.Dimension(105, 25));
        modulesMainPanel.add(modulesWellBeingBtn);
        modulesWellBeingBtn.setBounds(510, 340, 190, 90);

        modulesHealthMetricsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_health-metrics.png"))); // NOI18N
        modulesHealthMetricsBtn.setBorder(null);
        modulesHealthMetricsBtn.setBorderPainted(false);
        modulesHealthMetricsBtn.setPreferredSize(new java.awt.Dimension(105, 25));
        modulesMainPanel.add(modulesHealthMetricsBtn);
        modulesHealthMetricsBtn.setBounds(510, 140, 190, 90);

        modulesNutritionsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_nutrition.png"))); // NOI18N
        modulesNutritionsBtn.setBorder(null);
        modulesNutritionsBtn.setPreferredSize(new java.awt.Dimension(105, 25));
        modulesNutritionsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modulesNutritionsBtnActionPerformed(evt);
            }
        });
        modulesMainPanel.add(modulesNutritionsBtn);
        modulesNutritionsBtn.setBounds(510, 240, 190, 90);

        modulesOption.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/options.png"))); // NOI18N
        modulesMainPanel.add(modulesOption);
        modulesOption.setBounds(560, 60, 80, 60);

        modulesWelcome.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        modulesWelcome.setForeground(new java.awt.Color(0, 102, 102));
        modulesWelcome.setText("Welcome");
        modulesMainPanel.add(modulesWelcome);
        modulesWelcome.setBounds(550, 30, 106, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(modulesMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(modulesMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modulesNutritionsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modulesNutritionsBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modulesNutritionsBtnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Modules().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
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
