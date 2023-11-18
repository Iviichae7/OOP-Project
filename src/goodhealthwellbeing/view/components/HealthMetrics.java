
package goodhealthwellbeing.view.components;

import javax.swing.ButtonGroup;

import goodhealthwellbeing.view.ui.Modules;

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
        duration = new javax.swing.JLabel();
        weight = new javax.swing.JLabel();
        steps = new javax.swing.JLabel();
        target = new javax.swing.JLabel();
        weightOutput = new javax.swing.JLabel();
        durationOutput = new javax.swing.JLabel();
        stepsOutput = new javax.swing.JLabel();
        targetOutput = new javax.swing.JLabel();
        targetGoal = new javax.swing.JLabel();
        stepsGoal = new javax.swing.JLabel();
        weightGoal = new javax.swing.JLabel();
        durationGoal = new javax.swing.JLabel();
        durationGoalOutput = new javax.swing.JLabel();
        weightGoalOutput = new javax.swing.JLabel();
        targetGoalOutput = new javax.swing.JLabel();
        stepsGoalOutput = new javax.swing.JLabel();
        seperator4 = new javax.swing.JSeparator();
        hmBackBtn = new javax.swing.JButton();
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
        healthmetricLeftPanel.setLayout(null);

        healthmetricsMainLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        healthmetricsMainLabel.setText("HEALTH METRICS");
        healthmetricLeftPanel.add(healthmetricsMainLabel);
        healthmetricsMainLabel.setBounds(16, 18, 159, 22);

        healthmetricsRecommendationsLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        healthmetricsRecommendationsLabel.setText("Recommendations");
        healthmetricLeftPanel.add(healthmetricsRecommendationsLabel);
        healthmetricsRecommendationsLabel.setBounds(25, 288, 165, 22);

        seperator0.setForeground(new java.awt.Color(204, 204, 204));
        seperator0.setOrientation(javax.swing.SwingConstants.VERTICAL);
        healthmetricLeftPanel.add(seperator0);
        seperator0.setBounds(301, 18, 13, 424);

        duration.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/duration.png"))); // NOI18N
        healthmetricLeftPanel.add(duration);
        duration.setBounds(25, 120, 40, 40);

        weight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/weight.png"))); // NOI18N
        healthmetricLeftPanel.add(weight);
        weight.setBounds(25, 60, 40, 40);

        steps.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/steps.png"))); // NOI18N
        healthmetricLeftPanel.add(steps);
        steps.setBounds(25, 166, 40, 40);

        target.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/goal.png"))); // NOI18N
        healthmetricLeftPanel.add(target);
        target.setBounds(25, 218, 40, 40);

        weightOutput.setText("Weight ");
        healthmetricLeftPanel.add(weightOutput);
        weightOutput.setBounds(83, 84, 41, 16);

        durationOutput.setText("Duration");
        healthmetricLeftPanel.add(durationOutput);
        durationOutput.setBounds(83, 144, 47, 16);

        stepsOutput.setText("Steps");
        healthmetricLeftPanel.add(stepsOutput);
        stepsOutput.setBounds(83, 190, 49, 16);

        targetOutput.setText("Target");
        healthmetricLeftPanel.add(targetOutput);
        targetOutput.setBounds(83, 242, 35, 16);

        targetGoal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/recGoal.png"))); // NOI18N
        healthmetricLeftPanel.add(targetGoal);
        targetGoal.setBounds(25, 337, 35, 35);

        stepsGoal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/recSteps.png"))); // NOI18N
        healthmetricLeftPanel.add(stepsGoal);
        stepsGoal.setBounds(25, 402, 35, 35);

        weightGoal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/recWeight.png"))); // NOI18N
        healthmetricLeftPanel.add(weightGoal);
        weightGoal.setBounds(148, 402, 35, 35);

        durationGoal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/recDuration.png"))); // NOI18N
        healthmetricLeftPanel.add(durationGoal);
        durationGoal.setBounds(148, 337, 35, 35);

        durationGoalOutput.setText("TargetDuration");
        healthmetricLeftPanel.add(durationGoalOutput);
        durationGoalOutput.setBounds(195, 356, 82, 16);

        weightGoalOutput.setText("TaregetWeight");
        healthmetricLeftPanel.add(weightGoalOutput);
        weightGoalOutput.setBounds(195, 421, 80, 16);

        targetGoalOutput.setText("TargetGoal");
        healthmetricLeftPanel.add(targetGoalOutput);
        targetGoalOutput.setBounds(66, 356, 61, 16);

        stepsGoalOutput.setText("TargetSteps");
        healthmetricLeftPanel.add(stepsGoalOutput);
        stepsGoalOutput.setBounds(66, 421, 67, 16);

        seperator4.setForeground(new java.awt.Color(204, 204, 204));
        healthmetricLeftPanel.add(seperator4);
        seperator4.setBounds(25, 269, 252, 13);

        hmBackBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_back.png"))); // NOI18N
        hmBackBtn.setBorder(null);
        hmBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hmBackBtnActionPerformed(evt);
            }
        });
        healthmetricLeftPanel.add(hmBackBtn);
        hmBackBtn.setBounds(227, 18, 50, 27);

        healthmetricMainPanel.add(healthmetricLeftPanel);
        healthmetricLeftPanel.setBounds(0, 0, 320, 500);

        healthmetricsRightPanel.setBackground(new java.awt.Color(255, 255, 255));
        healthmetricsRightPanel.setPreferredSize(new java.awt.Dimension(500, 500));
        healthmetricsRightPanel.setLayout(null);

        healthmetricsHistoryLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        healthmetricsHistoryLabel.setText("History");
        healthmetricsRightPanel.add(healthmetricsHistoryLabel);
        healthmetricsHistoryLabel.setBounds(36, 336, 70, 30);

        healthmetricHistoryBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        healthmetricHistoryBtn.setBorder(null);
        healthmetricHistoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                healthmetricHistoryBtnActionPerformed(evt);
            }
        });
        healthmetricsRightPanel.add(healthmetricHistoryBtn);
        healthmetricHistoryBtn.setBounds(36, 384, 409, 60);

        seperator1.setForeground(new java.awt.Color(204, 204, 204));
        healthmetricsRightPanel.add(seperator1);
        seperator1.setBounds(112, 349, 331, 19);
        healthmetricsRightPanel.add(seperator2);
        seperator2.setBounds(36, 17, 164, 13);
        healthmetricsRightPanel.add(seperator3);
        seperator3.setBounds(265, 17, 180, 13);

        healthmetricsUserLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        healthmetricsUserLabel.setText("User");
        healthmetricsRightPanel.add(healthmetricsUserLabel);
        healthmetricsUserLabel.setBounds(218, 6, 29, 17);

        healthmetricsCurrentWeightLabel.setText("Current Weight");
        healthmetricsRightPanel.add(healthmetricsCurrentWeightLabel);
        healthmetricsCurrentWeightLabel.setBounds(36, 56, 164, 16);
        healthmetricsRightPanel.add(healthmetricsCurrentWeightInput);
        healthmetricsCurrentWeightInput.setBounds(36, 78, 164, 24);

        healthmetricsTargetWeightLabel.setText("Target Weight");
        healthmetricsRightPanel.add(healthmetricsTargetWeightLabel);
        healthmetricsTargetWeightLabel.setBounds(36, 108, 164, 16);
        healthmetricsRightPanel.add(healthmetricsExcerciseInput);
        healthmetricsExcerciseInput.setBounds(265, 136, 180, 24);

        healthmetricsStepsLabel.setText("Steps per Day");
        healthmetricsRightPanel.add(healthmetricsStepsLabel);
        healthmetricsStepsLabel.setBounds(368, 56, 77, 16);

        healthmetricsStepsInput.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        healthmetricsRightPanel.add(healthmetricsStepsInput);
        healthmetricsStepsInput.setBounds(265, 78, 180, 24);

        healthmetricsExcerciseLabel.setText("Excercise Duration");
        healthmetricsRightPanel.add(healthmetricsExcerciseLabel);
        healthmetricsExcerciseLabel.setBounds(342, 108, 103, 16);

        healthmetricsTargetWeightInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                healthmetricsTargetWeightInputActionPerformed(evt);
            }
        });
        healthmetricsRightPanel.add(healthmetricsTargetWeightInput);
        healthmetricsTargetWeightInput.setBounds(36, 136, 164, 24);

        healthmetricsRadioLoseWeight.setBackground(new java.awt.Color(255, 255, 255));
        healthmetricsRadioLoseWeight.setText("Lose Weight");
        healthmetricsRadioLoseWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                healthmetricsRadioLoseWeightActionPerformed(evt);
            }
        });
        healthmetricsRightPanel.add(healthmetricsRadioLoseWeight);
        healthmetricsRadioLoseWeight.setBounds(36, 190, 101, 28);

        healthmetricsRadioGainWeight.setBackground(new java.awt.Color(255, 255, 255));
        healthmetricsRadioGainWeight.setText("Gain Weight");
        healthmetricsRightPanel.add(healthmetricsRadioGainWeight);
        healthmetricsRadioGainWeight.setBounds(204, 190, 99, 28);

        healthmetricsRadioStayHealthy.setBackground(new java.awt.Color(255, 255, 255));
        healthmetricsRadioStayHealthy.setText("Stay Healthy");
        healthmetricsRadioStayHealthy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                healthmetricsRadioStayHealthyActionPerformed(evt);
            }
        });
        healthmetricsRightPanel.add(healthmetricsRadioStayHealthy);
        healthmetricsRadioStayHealthy.setBounds(346, 190, 99, 28);

        healthmetricsSaveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_save-goal.png"))); // NOI18N
        healthmetricsSaveBtn.setBorder(null);
        healthmetricsRightPanel.add(healthmetricsSaveBtn);
        healthmetricsSaveBtn.setBounds(320, 293, 125, 38);

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

    private void hmBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hmBackBtnActionPerformed
        Modules modules = Modules.getInstance();
        modules.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_hmBackBtnActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new HealthMetrics().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel duration;
    private javax.swing.JLabel durationGoal;
    private javax.swing.JLabel durationGoalOutput;
    private javax.swing.JLabel durationOutput;
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
    private javax.swing.JButton hmBackBtn;
    private javax.swing.JSeparator seperator0;
    private javax.swing.JSeparator seperator1;
    private javax.swing.JSeparator seperator2;
    private javax.swing.JSeparator seperator3;
    private javax.swing.JSeparator seperator4;
    private javax.swing.JLabel steps;
    private javax.swing.JLabel stepsGoal;
    private javax.swing.JLabel stepsGoalOutput;
    private javax.swing.JLabel stepsOutput;
    private javax.swing.JLabel target;
    private javax.swing.JLabel targetGoal;
    private javax.swing.JLabel targetGoalOutput;
    private javax.swing.JLabel targetOutput;
    private javax.swing.JLabel weight;
    private javax.swing.JLabel weightGoal;
    private javax.swing.JLabel weightGoalOutput;
    private javax.swing.JLabel weightOutput;
    // End of variables declaration//GEN-END:variables
}
