
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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        modulesMainPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        modulesWellBeingBtn = new javax.swing.JButton();
        modulesHealthMetricsBtn = new javax.swing.JButton();
        modulesNutritionsBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        modulesMainPanel.setBackground(new java.awt.Color(255, 255, 255));
        modulesMainPanel.setPreferredSize(new java.awt.Dimension(800, 500));
        modulesMainPanel.setLayout(null);

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

        modulesMainPanel.add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 500);

        modulesWellBeingBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_well-being.png"))); // NOI18N
        modulesWellBeingBtn.setBorder(null);
        modulesWellBeingBtn.setPreferredSize(new java.awt.Dimension(105, 25));
        modulesMainPanel.add(modulesWellBeingBtn);
        modulesWellBeingBtn.setBounds(510, 340, 190, 90);

        modulesHealthMetricsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_health-metrics.png"))); // NOI18N
        modulesHealthMetricsBtn.setBorder(null);
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/options.png"))); // NOI18N
        modulesMainPanel.add(jLabel1);
        jLabel1.setBounds(560, 60, 80, 60);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Welcome");
        modulesMainPanel.add(jLabel2);
        jLabel2.setBounds(550, 30, 105, 30);

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton modulesHealthMetricsBtn;
    private javax.swing.JPanel modulesMainPanel;
    private javax.swing.JButton modulesNutritionsBtn;
    private javax.swing.JButton modulesWellBeingBtn;
    // End of variables declaration//GEN-END:variables
}
