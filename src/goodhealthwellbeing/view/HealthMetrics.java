
package goodhealthwellbeing.view;

import javax.swing.ButtonGroup;

public class HealthMetrics extends javax.swing.JFrame {
    
    private final ButtonGroup buttonGroup;

    public HealthMetrics() {
        initComponents();
        
        buttonGroup = new ButtonGroup();
        buttonGroup.add(healthmetricsRadioLoseWeight);
        buttonGroup.add(healthmetricsRadioGainWeight);
        buttonGroup.add(healthmetricsRadioStayHealthy);
        healthmetricsRadioLoseWeight.setSelected(true);
        
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        healthmetricMainPanel = new javax.swing.JPanel();
        healthmetricLeftPanel = new javax.swing.JPanel();
        healthmetricsMainLabel = new javax.swing.JLabel();
        healthmetricsRecommendationsLabel = new javax.swing.JLabel();
        seperator0 = new javax.swing.JSeparator();
        healthmetricsRightPanel = new javax.swing.JPanel();
        healthmetricsHistoryLabel = new javax.swing.JLabel();
        healthmetricHistoryBtn = new javax.swing.JButton();
        seperator1 = new javax.swing.JSeparator();
        seperator2 = new javax.swing.JSeparator();
        seperator3 = new javax.swing.JSeparator();
        healthmetricsUserLabel = new javax.swing.JLabel();
        healthmetricsCurrentWeightLabel = new javax.swing.JLabel();
        healthmetricsCurrentWeightInput = new javax.swing.JTextField();
        healthmetricsTargetWeightLabel = new javax.swing.JLabel();
        healthmetricsExcerciseInput = new javax.swing.JTextField();
        healthmetricsStepsLabel = new javax.swing.JLabel();
        healthmetricsStepsInput = new javax.swing.JTextField();
        healthmetricsExcerciseLabel = new javax.swing.JLabel();
        healthmetricsTargetWeightInput = new javax.swing.JTextField();
        healthmetricsRadioLoseWeight = new javax.swing.JRadioButton();
        healthmetricsRadioGainWeight = new javax.swing.JRadioButton();
        healthmetricsRadioStayHealthy = new javax.swing.JRadioButton();
        healthmetricsSaveBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        healthmetricMainPanel.setBackground(new java.awt.Color(153, 153, 153));
        healthmetricMainPanel.setPreferredSize(new java.awt.Dimension(800, 500));
        healthmetricMainPanel.setLayout(null);

        healthmetricLeftPanel.setBackground(new java.awt.Color(255, 255, 255));
        healthmetricLeftPanel.setPreferredSize(new java.awt.Dimension(300, 500));

        healthmetricsMainLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        healthmetricsMainLabel.setText("HEALTH METRICS");

        healthmetricsRecommendationsLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        healthmetricsRecommendationsLabel.setText("Recommendations");

        seperator0.setForeground(new java.awt.Color(204, 204, 204));
        seperator0.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout healthmetricLeftPanelLayout = new javax.swing.GroupLayout(healthmetricLeftPanel);
        healthmetricLeftPanel.setLayout(healthmetricLeftPanelLayout);
        healthmetricLeftPanelLayout.setHorizontalGroup(
            healthmetricLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(healthmetricLeftPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(healthmetricLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(healthmetricsMainLabel)
                    .addComponent(healthmetricsRecommendationsLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addComponent(seperator0, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        healthmetricLeftPanelLayout.setVerticalGroup(
            healthmetricLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, healthmetricLeftPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(healthmetricLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(healthmetricLeftPanelLayout.createSequentialGroup()
                        .addComponent(seperator0)
                        .addGap(73, 73, 73))
                    .addGroup(healthmetricLeftPanelLayout.createSequentialGroup()
                        .addComponent(healthmetricsMainLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 291, Short.MAX_VALUE)
                        .addComponent(healthmetricsRecommendationsLabel)
                        .addGap(147, 147, 147))))
        );

        healthmetricMainPanel.add(healthmetricLeftPanel);
        healthmetricLeftPanel.setBounds(0, 0, 320, 500);

        healthmetricsRightPanel.setBackground(new java.awt.Color(255, 255, 255));
        healthmetricsRightPanel.setPreferredSize(new java.awt.Dimension(500, 500));

        healthmetricsHistoryLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        healthmetricsHistoryLabel.setText("History");

        healthmetricHistoryBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        healthmetricHistoryBtn.setBorder(null);
        healthmetricHistoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                healthmetricHistoryBtnActionPerformed(evt);
            }
        });

        seperator1.setForeground(new java.awt.Color(204, 204, 204));

        healthmetricsUserLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        healthmetricsUserLabel.setText("User");

        healthmetricsCurrentWeightLabel.setText("Current Weight");

        healthmetricsTargetWeightLabel.setText("Target Weight");

        healthmetricsStepsLabel.setText("Steps per Day");

        healthmetricsStepsInput.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        healthmetricsExcerciseLabel.setText("Excercise Duration");

        healthmetricsTargetWeightInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                healthmetricsTargetWeightInputActionPerformed(evt);
            }
        });

        healthmetricsRadioLoseWeight.setBackground(new java.awt.Color(255, 255, 255));
        healthmetricsRadioLoseWeight.setText("Lose Weight");
        healthmetricsRadioLoseWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                healthmetricsRadioLoseWeightActionPerformed(evt);
            }
        });

        healthmetricsRadioGainWeight.setBackground(new java.awt.Color(255, 255, 255));
        healthmetricsRadioGainWeight.setText("Gain Weight");

        healthmetricsRadioStayHealthy.setBackground(new java.awt.Color(255, 255, 255));
        healthmetricsRadioStayHealthy.setText("Stay Healthy");
        healthmetricsRadioStayHealthy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                healthmetricsRadioStayHealthyActionPerformed(evt);
            }
        });

        healthmetricsSaveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_save-goal.png"))); // NOI18N
        healthmetricsSaveBtn.setBorder(null);

        javax.swing.GroupLayout healthmetricsRightPanelLayout = new javax.swing.GroupLayout(healthmetricsRightPanel);
        healthmetricsRightPanel.setLayout(healthmetricsRightPanelLayout);
        healthmetricsRightPanelLayout.setHorizontalGroup(
            healthmetricsRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, healthmetricsRightPanelLayout.createSequentialGroup()
                .addGap(0, 36, Short.MAX_VALUE)
                .addGroup(healthmetricsRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(healthmetricsRightPanelLayout.createSequentialGroup()
                        .addComponent(healthmetricsRadioLoseWeight)
                        .addGap(67, 67, 67)
                        .addComponent(healthmetricsRadioGainWeight)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(healthmetricsRadioStayHealthy))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, healthmetricsRightPanelLayout.createSequentialGroup()
                        .addComponent(seperator2)
                        .addGap(18, 18, 18)
                        .addComponent(healthmetricsUserLabel)
                        .addGap(18, 18, 18)
                        .addComponent(seperator3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, healthmetricsRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(healthmetricHistoryBtn)
                        .addComponent(healthmetricsHistoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(healthmetricsRightPanelLayout.createSequentialGroup()
                        .addGroup(healthmetricsRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(healthmetricsTargetWeightInput)
                            .addComponent(healthmetricsCurrentWeightLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(healthmetricsTargetWeightLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(healthmetricsCurrentWeightInput, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(healthmetricsRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(healthmetricsRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(healthmetricsRightPanelLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(healthmetricsRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(healthmetricsStepsLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(healthmetricsExcerciseLabel, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addGroup(healthmetricsRightPanelLayout.createSequentialGroup()
                                    .addGap(65, 65, 65)
                                    .addComponent(healthmetricsStepsInput)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, healthmetricsRightPanelLayout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(healthmetricsExcerciseInput, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(healthmetricsSaveBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(35, 35, 35))
            .addGroup(healthmetricsRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(healthmetricsRightPanelLayout.createSequentialGroup()
                    .addGap(112, 112, 112)
                    .addComponent(seperator1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(37, Short.MAX_VALUE)))
        );
        healthmetricsRightPanelLayout.setVerticalGroup(
            healthmetricsRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, healthmetricsRightPanelLayout.createSequentialGroup()
                .addGroup(healthmetricsRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(healthmetricsRightPanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(healthmetricsRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seperator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seperator3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(healthmetricsRightPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(healthmetricsUserLabel)))
                .addGap(26, 26, 26)
                .addGroup(healthmetricsRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(healthmetricsCurrentWeightLabel)
                    .addComponent(healthmetricsStepsLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(healthmetricsRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(healthmetricsCurrentWeightInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(healthmetricsStepsInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(healthmetricsRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(healthmetricsTargetWeightLabel)
                    .addComponent(healthmetricsExcerciseLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(healthmetricsRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(healthmetricsExcerciseInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(healthmetricsTargetWeightInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(healthmetricsRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(healthmetricsRadioStayHealthy)
                    .addComponent(healthmetricsRadioLoseWeight)
                    .addComponent(healthmetricsRadioGainWeight))
                .addGap(75, 75, 75)
                .addComponent(healthmetricsSaveBtn)
                .addGap(5, 5, 5)
                .addComponent(healthmetricsHistoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(healthmetricHistoryBtn)
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(healthmetricsRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, healthmetricsRightPanelLayout.createSequentialGroup()
                    .addContainerGap(349, Short.MAX_VALUE)
                    .addComponent(seperator1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(132, 132, 132)))
        );

        healthmetricMainPanel.add(healthmetricsRightPanel);
        healthmetricsRightPanel.setBounds(320, 0, 480, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(healthmetricMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(healthmetricMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void healthmetricHistoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_healthmetricHistoryBtnActionPerformed
        
    }//GEN-LAST:event_healthmetricHistoryBtnActionPerformed

    private void healthmetricsTargetWeightInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_healthmetricsTargetWeightInputActionPerformed
        
    }//GEN-LAST:event_healthmetricsTargetWeightInputActionPerformed

    private void healthmetricsRadioLoseWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_healthmetricsRadioLoseWeightActionPerformed
        
    }//GEN-LAST:event_healthmetricsRadioLoseWeightActionPerformed

    private void healthmetricsRadioStayHealthyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_healthmetricsRadioStayHealthyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_healthmetricsRadioStayHealthyActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new HealthMetrics().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton healthmetricHistoryBtn;
    private javax.swing.JPanel healthmetricLeftPanel;
    private javax.swing.JPanel healthmetricMainPanel;
    private javax.swing.JTextField healthmetricsCurrentWeightInput;
    private javax.swing.JLabel healthmetricsCurrentWeightLabel;
    private javax.swing.JTextField healthmetricsExcerciseInput;
    private javax.swing.JLabel healthmetricsExcerciseLabel;
    private javax.swing.JLabel healthmetricsHistoryLabel;
    private javax.swing.JLabel healthmetricsMainLabel;
    private javax.swing.JRadioButton healthmetricsRadioGainWeight;
    private javax.swing.JRadioButton healthmetricsRadioLoseWeight;
    private javax.swing.JRadioButton healthmetricsRadioStayHealthy;
    private javax.swing.JLabel healthmetricsRecommendationsLabel;
    private javax.swing.JPanel healthmetricsRightPanel;
    private javax.swing.JButton healthmetricsSaveBtn;
    private javax.swing.JTextField healthmetricsStepsInput;
    private javax.swing.JLabel healthmetricsStepsLabel;
    private javax.swing.JTextField healthmetricsTargetWeightInput;
    private javax.swing.JLabel healthmetricsTargetWeightLabel;
    private javax.swing.JLabel healthmetricsUserLabel;
    private javax.swing.JSeparator seperator0;
    private javax.swing.JSeparator seperator1;
    private javax.swing.JSeparator seperator2;
    private javax.swing.JSeparator seperator3;
    // End of variables declaration//GEN-END:variables
}
