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
import javax.swing.JOptionPane;

public class HealthMetrics extends javax.swing.JFrame {
    
    private final ButtonGroup buttonGroup;
    private final User currentUser;
    private final HealthMetricsProcessor processor = new HealthMetricsProcessor();
    private final UserHealthMetricsManager metricsManager = new UserHealthMetricsManager();
    private final HealthMetricsHistoryManager historyManager = new HealthMetricsHistoryManager();

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
        invalidTime = new javax.swing.JLabel();
        invalidTargetWeight = new javax.swing.JLabel();
        invalidWeight = new javax.swing.JLabel();
        invalidSteps = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        duration.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/duration.png"))); // NOI18N

        weight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/weight.png"))); // NOI18N

        steps.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/steps.png"))); // NOI18N

        target.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/goal.png"))); // NOI18N

        weightOutput.setText("Weight ");

        durationOutput.setText("Duration");

        stepsOutput.setText("Steps");

        targetOutput.setText("Target");

        targetGoal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/recGoal.png"))); // NOI18N

        stepsGoal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/recSteps.png"))); // NOI18N

        weightGoal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/recWeight.png"))); // NOI18N

        durationGoal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/recDuration.png"))); // NOI18N

        durationGoalOutput.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        durationGoalOutput.setText("TargetDuration");

        weightGoalOutput.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        weightGoalOutput.setText("TaregetWeight");

        targetGoalOutput.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        targetGoalOutput.setText("Lose Weight");

        stepsGoalOutput.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        stepsGoalOutput.setText("TargetSteps");

        seperator4.setForeground(new java.awt.Color(204, 204, 204));

        hmBackBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_back.png"))); // NOI18N
        hmBackBtn.setBorder(null);
        hmBackBtn.setBorderPainted(false);
        hmBackBtn.setContentAreaFilled(false);
        hmBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hmBackBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout healthmetricLeftPanelLayout = new javax.swing.GroupLayout(healthmetricLeftPanel);
        healthmetricLeftPanel.setLayout(healthmetricLeftPanelLayout);
        healthmetricLeftPanelLayout.setHorizontalGroup(
            healthmetricLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(healthmetricLeftPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(healthmetricLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(healthmetricLeftPanelLayout.createSequentialGroup()
                        .addComponent(healthmetricsMainLabel)
                        .addGap(52, 52, 52)
                        .addComponent(hmBackBtn))
                    .addGroup(healthmetricLeftPanelLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(healthmetricLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(healthmetricLeftPanelLayout.createSequentialGroup()
                                .addComponent(weight)
                                .addGap(18, 18, 18)
                                .addComponent(weightOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(healthmetricLeftPanelLayout.createSequentialGroup()
                                .addComponent(duration)
                                .addGap(18, 18, 18)
                                .addComponent(durationOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(healthmetricLeftPanelLayout.createSequentialGroup()
                                .addComponent(steps)
                                .addGap(18, 18, 18)
                                .addComponent(stepsOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(healthmetricLeftPanelLayout.createSequentialGroup()
                                .addComponent(target)
                                .addGap(18, 18, 18)
                                .addComponent(targetOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(seperator4, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(healthmetricsRecommendationsLabel)
                            .addGroup(healthmetricLeftPanelLayout.createSequentialGroup()
                                .addComponent(stepsGoal)
                                .addGap(6, 6, 6)
                                .addComponent(stepsGoalOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(weightGoal)
                                .addGap(5, 5, 5)
                                .addComponent(weightGoalOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(healthmetricLeftPanelLayout.createSequentialGroup()
                                .addComponent(targetGoal)
                                .addGap(6, 6, 6)
                                .addComponent(targetGoalOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(durationGoal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(durationGoalOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seperator0, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        healthmetricLeftPanelLayout.setVerticalGroup(
            healthmetricLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(healthmetricLeftPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(healthmetricLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(healthmetricLeftPanelLayout.createSequentialGroup()
                        .addGroup(healthmetricLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(healthmetricsMainLabel)
                            .addComponent(hmBackBtn))
                        .addGap(15, 15, 15)
                        .addGroup(healthmetricLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(weight)
                            .addGroup(healthmetricLeftPanelLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(weightOutput)))
                        .addGap(19, 19, 19)
                        .addGroup(healthmetricLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(duration)
                            .addGroup(healthmetricLeftPanelLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(durationOutput)))
                        .addGap(5, 5, 5)
                        .addGroup(healthmetricLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(steps)
                            .addGroup(healthmetricLeftPanelLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(stepsOutput)))
                        .addGap(11, 11, 11)
                        .addGroup(healthmetricLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(target)
                            .addGroup(healthmetricLeftPanelLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(targetOutput)))
                        .addGap(10, 10, 10)
                        .addComponent(seperator4, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(healthmetricsRecommendationsLabel)
                        .addGap(25, 25, 25)
                        .addGroup(healthmetricLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(healthmetricLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(targetGoal)
                                .addGroup(healthmetricLeftPanelLayout.createSequentialGroup()
                                    .addGap(19, 19, 19)
                                    .addComponent(targetGoalOutput)))
                            .addGroup(healthmetricLeftPanelLayout.createSequentialGroup()
                                .addGroup(healthmetricLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(durationGoalOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(durationGoal))
                                .addGap(2, 2, 2)))
                        .addGap(28, 28, 28)
                        .addGroup(healthmetricLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(healthmetricLeftPanelLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(stepsGoal))
                            .addGroup(healthmetricLeftPanelLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(stepsGoalOutput))
                            .addComponent(weightGoal)
                            .addGroup(healthmetricLeftPanelLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(weightGoalOutput))))
                    .addComponent(seperator0, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

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
        healthmetricsTargetWeightLabel.setBounds(40, 130, 164, 17);
        healthmetricsRightPanel.add(healthmetricsExcerciseInput);
        healthmetricsExcerciseInput.setBounds(270, 150, 170, 30);

        healthmetricsStepsLabel.setText("Steps per Day");
        healthmetricsRightPanel.add(healthmetricsStepsLabel);
        healthmetricsStepsLabel.setBounds(270, 60, 100, 17);

        healthmetricsStepsInput.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        healthmetricsStepsInput.setMinimumSize(new java.awt.Dimension(15, 24));
        healthmetricsRightPanel.add(healthmetricsStepsInput);
        healthmetricsStepsInput.setBounds(270, 80, 170, 24);

        healthmetricsExcerciseLabel.setText("Excercise Duration");
        healthmetricsRightPanel.add(healthmetricsExcerciseLabel);
        healthmetricsExcerciseLabel.setBounds(270, 130, 130, 17);
        healthmetricsRightPanel.add(healthmetricsTargetWeightInput);
        healthmetricsTargetWeightInput.setBounds(34, 150, 170, 27);

        healthmetricsRadioLoseWeight.setBackground(new java.awt.Color(255, 255, 255));
        healthmetricsRadioLoseWeight.setText("Lose Weight");
        healthmetricsRightPanel.add(healthmetricsRadioLoseWeight);
        healthmetricsRadioLoseWeight.setBounds(40, 220, 130, 21);

        healthmetricsRadioGainWeight.setBackground(new java.awt.Color(255, 255, 255));
        healthmetricsRadioGainWeight.setText("Gain Weight");
        healthmetricsRightPanel.add(healthmetricsRadioGainWeight);
        healthmetricsRadioGainWeight.setBounds(200, 220, 130, 21);

        healthmetricsRadioStayHealthy.setBackground(new java.awt.Color(255, 255, 255));
        healthmetricsRadioStayHealthy.setText("Stay Healthy");
        healthmetricsRightPanel.add(healthmetricsRadioStayHealthy);
        healthmetricsRadioStayHealthy.setBounds(340, 220, 120, 21);

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

        invalidTime.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        invalidTime.setForeground(new java.awt.Color(255, 51, 51));
        invalidTime.setText("Invalid Steps Entered!");
        healthmetricsRightPanel.add(invalidTime);
        invalidTime.setBounds(270, 190, 130, 13);

        invalidTargetWeight.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        invalidTargetWeight.setForeground(new java.awt.Color(255, 51, 51));
        invalidTargetWeight.setText("Invalid Weight entered!");
        healthmetricsRightPanel.add(invalidTargetWeight);
        invalidTargetWeight.setBounds(40, 190, 150, 13);

        invalidWeight.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        invalidWeight.setForeground(new java.awt.Color(255, 51, 51));
        healthmetricsRightPanel.add(invalidWeight);
        invalidWeight.setBounds(40, 110, 150, 0);

        invalidSteps.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        invalidSteps.setForeground(new java.awt.Color(255, 51, 51));
        invalidSteps.setText("Invalid Steps Entered!");
        healthmetricsRightPanel.add(invalidSteps);
        invalidSteps.setBounds(270, 110, 130, 13);

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
            JOptionPane.showMessageDialog(this, "Error while writing/reading the file: " + e.getMessage(),
                                      "File Error", JOptionPane.ERROR_MESSAGE);
        }

        try {
            File file = new File("OOP-Project/src/goodhealthwellbeing/data/healthmetrics_history.txt");
            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.OPEN)) {
                Desktop.getDesktop().open(file);
            } else {
                JOptionPane.showMessageDialog(this, "Not supported on your system.",
                                          "Unsupported Operation", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error while opening the file: " + e.getMessage(),
                                      "File Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_healthmetricHistoryBtnActionPerformed

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
    private javax.swing.JLabel invalidSteps;
    private javax.swing.JLabel invalidTargetWeight;
    private javax.swing.JLabel invalidTime;
    private javax.swing.JLabel invalidWeight;
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
