package goodhealthwellbeing.view.components;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import javax.swing.ButtonGroup;

import goodhealthwellbeing.data.HealthMetricsHistoryManager;
import goodhealthwellbeing.model.HealthMetricsProcessor;
import goodhealthwellbeing.model.User;
import goodhealthwellbeing.model.UserHealthMetricsManager;
import goodhealthwellbeing.output.HealthMetricsOutput;
import goodhealthwellbeing.view.ui.Modules;

public class HealthMetrics extends javax.swing.JFrame {
    
    private final ButtonGroup buttonGroup;
    private User currentUser; // The logged-in user
    private HealthMetricsProcessor processor = new HealthMetricsProcessor();
    private UserHealthMetricsManager metricsManager = new UserHealthMetricsManager();
    private HealthMetricsHistoryManager historyManager = new HealthMetricsHistoryManager();

    public HealthMetrics(User user) {
        this.currentUser = user;
        initComponents();
        
        buttonGroup = new ButtonGroup();
        buttonGroup.add(healthmetricsRadioLoseWeight);
        buttonGroup.add(healthmetricsRadioGainWeight);
        buttonGroup.add(healthmetricsRadioStayHealthy);
        healthmetricsRadioLoseWeight.setSelected(true);
        
        if (currentUser != null) {
            currentUserLabel2.setText(currentUser.getFullName());
        }
        
        this.setLocationRelativeTo(null);

        healthmetricsSaveBtn.addActionListener((java.awt.event.ActionEvent evt) -> {
            healthmetricsSaveBtnActionPerformed(evt);
        });
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
        currentUserLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        healthmetricsRecommendationsLabel.setBounds(25, 288, 161, 22);

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
        weightOutput.setBounds(83, 84, 110, 17);

        durationOutput.setText("Duration");
        healthmetricLeftPanel.add(durationOutput);
        durationOutput.setBounds(83, 144, 110, 17);

        stepsOutput.setText("Steps");
        healthmetricLeftPanel.add(stepsOutput);
        stepsOutput.setBounds(83, 190, 120, 17);

        targetOutput.setText("Target");
        healthmetricLeftPanel.add(targetOutput);
        targetOutput.setBounds(83, 242, 110, 17);

        targetGoal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/recGoal.png"))); // NOI18N
        healthmetricLeftPanel.add(targetGoal);
        targetGoal.setBounds(25, 337, 35, 35);

        stepsGoal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/recSteps.png"))); // NOI18N
        healthmetricLeftPanel.add(stepsGoal);
        stepsGoal.setBounds(25, 402, 35, 35);

        weightGoal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/recWeight.png"))); // NOI18N
        healthmetricLeftPanel.add(weightGoal);
        weightGoal.setBounds(170, 400, 35, 35);

        durationGoal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/recDuration.png"))); // NOI18N
        healthmetricLeftPanel.add(durationGoal);
        durationGoal.setBounds(170, 340, 35, 35);

        durationGoalOutput.setText("TargetDuration");
        healthmetricLeftPanel.add(durationGoalOutput);
        durationGoalOutput.setBounds(210, 360, 90, 17);

        weightGoalOutput.setText("TaregetWeight");
        healthmetricLeftPanel.add(weightGoalOutput);
        weightGoalOutput.setBounds(210, 420, 90, 17);

        targetGoalOutput.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        targetGoalOutput.setText("Lose Weight");
        healthmetricLeftPanel.add(targetGoalOutput);
        targetGoalOutput.setBounds(66, 356, 70, 14);

        stepsGoalOutput.setText("TargetSteps");
        healthmetricLeftPanel.add(stepsGoalOutput);
        stepsGoalOutput.setBounds(66, 421, 80, 17);

        seperator4.setForeground(new java.awt.Color(204, 204, 204));
        healthmetricLeftPanel.add(seperator4);
        seperator4.setBounds(25, 269, 252, 13);

        hmBackBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_back.png"))); // NOI18N
        hmBackBtn.setBorder(null);
        hmBackBtn.setBorderPainted(false);
        hmBackBtn.setContentAreaFilled(false);
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
        healthmetricHistoryBtn.setBorderPainted(false);
        healthmetricHistoryBtn.setContentAreaFilled(false);
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
        seperator2.setBounds(36, 17, 140, 13);
        healthmetricsRightPanel.add(seperator3);
        seperator3.setBounds(295, 17, 150, 13);

        healthmetricsCurrentWeightLabel.setText("Current Weight");
        healthmetricsRightPanel.add(healthmetricsCurrentWeightLabel);
        healthmetricsCurrentWeightLabel.setBounds(36, 56, 164, 17);
        healthmetricsRightPanel.add(healthmetricsCurrentWeightInput);
        healthmetricsCurrentWeightInput.setBounds(36, 78, 164, 27);

        healthmetricsTargetWeightLabel.setText("Target Weight");
        healthmetricsRightPanel.add(healthmetricsTargetWeightLabel);
        healthmetricsTargetWeightLabel.setBounds(36, 108, 164, 17);
        healthmetricsRightPanel.add(healthmetricsExcerciseInput);
        healthmetricsExcerciseInput.setBounds(265, 136, 180, 27);

        healthmetricsStepsLabel.setText("Steps per Day");
        healthmetricsRightPanel.add(healthmetricsStepsLabel);
        healthmetricsStepsLabel.setBounds(355, 56, 100, 17);

        healthmetricsStepsInput.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        healthmetricsStepsInput.setMinimumSize(new java.awt.Dimension(15, 24));
        healthmetricsRightPanel.add(healthmetricsStepsInput);
        healthmetricsStepsInput.setBounds(265, 78, 180, 24);

        healthmetricsExcerciseLabel.setText("Excercise Duration");
        healthmetricsRightPanel.add(healthmetricsExcerciseLabel);
        healthmetricsExcerciseLabel.setBounds(335, 108, 130, 17);

        healthmetricsTargetWeightInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                healthmetricsTargetWeightInputActionPerformed(evt);
            }
        });
        healthmetricsRightPanel.add(healthmetricsTargetWeightInput);
        healthmetricsTargetWeightInput.setBounds(36, 136, 164, 27);

        healthmetricsRadioLoseWeight.setBackground(new java.awt.Color(255, 255, 255));
        healthmetricsRadioLoseWeight.setText("Lose Weight");
        healthmetricsRadioLoseWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                healthmetricsRadioLoseWeightActionPerformed(evt);
            }
        });
        healthmetricsRightPanel.add(healthmetricsRadioLoseWeight);
        healthmetricsRadioLoseWeight.setBounds(36, 190, 130, 21);

        healthmetricsRadioGainWeight.setBackground(new java.awt.Color(255, 255, 255));
        healthmetricsRadioGainWeight.setText("Gain Weight");
        healthmetricsRightPanel.add(healthmetricsRadioGainWeight);
        healthmetricsRadioGainWeight.setBounds(204, 190, 130, 21);

        healthmetricsRadioStayHealthy.setBackground(new java.awt.Color(255, 255, 255));
        healthmetricsRadioStayHealthy.setText("Stay Healthy");
        healthmetricsRadioStayHealthy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                healthmetricsRadioStayHealthyActionPerformed(evt);
            }
        });
        healthmetricsRightPanel.add(healthmetricsRadioStayHealthy);
        healthmetricsRadioStayHealthy.setBounds(346, 190, 120, 21);

        healthmetricsSaveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_save-goal.png"))); // NOI18N
        healthmetricsSaveBtn.setBorder(null);
        healthmetricsSaveBtn.setContentAreaFilled(false);
        healthmetricsSaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                healthmetricsSaveBtnActionPerformed(evt);
            }
        });
        healthmetricsRightPanel.add(healthmetricsSaveBtn);
        healthmetricsSaveBtn.setBounds(320, 293, 125, 38);

        currentUserLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        currentUserLabel2.setForeground(new java.awt.Color(0, 0, 0));
        currentUserLabel2.setText("Michael Babik");
        healthmetricsRightPanel.add(currentUserLabel2);
        currentUserLabel2.setBounds(190, 10, 110, 20);

        healthmetricMainPanel.add(healthmetricsRightPanel);
        healthmetricsRightPanel.setBounds(320, 0, 480, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(healthmetricMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(healthmetricMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void healthmetricHistoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_healthmetricHistoryBtnActionPerformed
        HealthMetricsOutput output = new HealthMetricsOutput(
            weightOutput.getText(), 
            stepsOutput.getText(), 
            targetOutput.getText(), 
            durationOutput.getText(),
            weightGoalOutput.getText(),
            stepsGoalOutput.getText(), 
            durationGoalOutput.getText()
        );
        String healthGoal = getSelectedHealthGoal();

        try {
            historyManager.writeMetricsToFile(output, healthGoal);

            String fileContent = historyManager.readMetricsFromFile();
        } catch (IOException e) {
        }

        try {
            File file = new File("OOP-Project/src/goodhealthwellbeing/data/healthmetrics_history.txt");
            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.OPEN)) {
                Desktop.getDesktop().open(file);
            } else {
            }
        } catch (IOException e) {
        }
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

    private String getSelectedHealthGoal() {
        if (healthmetricsRadioLoseWeight.isSelected()) {
            return "Lose Weight";
        } else if (healthmetricsRadioGainWeight.isSelected()) {
            return "Gain Weight";
        } else if (healthmetricsRadioStayHealthy.isSelected()) {
            return "Stay Healthy";
        }
        return "";
    }

    private void displayOutputs(HealthMetricsOutput output) {
        weightOutput.setText(output.weightOutput);
        stepsOutput.setText(output.stepsOutput);
        targetOutput.setText(output.targetOutput);
        durationOutput.setText(output.durationOutput);

        weightGoalOutput.setText(healthmetricsTargetWeightInput.getText() + " kg");

        targetGoalOutput.setText(getSelectedHealthGoal());

        durationGoalOutput.setText(output.targetDuration);
        stepsGoalOutput.setText(output.targetSteps);
    }

    private void healthmetricsSaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_healthmetricsSaveBtnActionPerformed
        String currentWeight = healthmetricsCurrentWeightInput.getText();
        String steps = healthmetricsStepsInput.getText();
        String targetWeight = healthmetricsTargetWeightInput.getText();
        String exerciseMinutes = healthmetricsExcerciseInput.getText();
        String healthGoal = getSelectedHealthGoal();

        HealthMetricsOutput output = processor.processInputs(currentWeight, steps, targetWeight, healthGoal, exerciseMinutes);

        displayOutputs(output);

        metricsManager.saveUserMetrics(currentUser, output);
    }//GEN-LAST:event_healthmetricsSaveBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel currentUserLabel2;
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
