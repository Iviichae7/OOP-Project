package goodhealthwellbeing.view.components;

import goodhealthwellbeing.data.HealthMetricsHistoryManager;
import goodhealthwellbeing.model.HealthMetricsProcessor;
import goodhealthwellbeing.model.User;
import goodhealthwellbeing.model.UserHealthMetricsManager;
import goodhealthwellbeing.output.HealthMetricsOutput;
import goodhealthwellbeing.view.ui.Modules;

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.function.Consumer;

public class HealthMetrics extends javax.swing.JFrame {

    private final ButtonGroup buttonGroup = new ButtonGroup();;
    private final User currentUser;
    private final HealthMetricsProcessor processor = new HealthMetricsProcessor();
    private final UserHealthMetricsManager metricsManager = new UserHealthMetricsManager();
    private final HealthMetricsHistoryManager historyManager = new HealthMetricsHistoryManager();

    public HealthMetrics(User user) {
        this.currentUser = user;
        initComponents();
        setupUI();
        this.setLocationRelativeTo(null);
    }

    // Setting up the UI components and displaying the current user.
    private void setupUI() {
        setupButtonGroup();
        setupActionListeners();
        setupInputFieldValidation();
        displayCurrentUser();
    }

    // Displays the current users full name.
    private void displayCurrentUser() {
        if (currentUser != null) {
            currentUserLabel2.setText(currentUser.getFullName());
        }
    }

    // Sets up the button group for health goals lose weight, gain weight etc. lose weight by default.
    private void setupButtonGroup() {
        buttonGroup.add(healthmetricsRadioLoseWeight);
        buttonGroup.add(healthmetricsRadioGainWeight);
        buttonGroup.add(healthmetricsRadioStayHealthy);
        healthmetricsRadioLoseWeight.setSelected(true);
    }

    // Sets up the listeners for all of the buttons. Save, reset and history.
    private void setupActionListeners() {
        healthmetricsSaveBtn.addActionListener(this::healthmetricsSaveBtnActionPerformed);
        healthmetricsResetBtn.addActionListener(this::healthmetricsResetBtnActionPerformed);
        healthmetricHistoryBtn.addActionListener(this::healthmetricHistoryBtnActionPerformed);
        hmBackBtn.addActionListener(this::hmBackBtnActionPerformed);
        deleteBtn.addActionListener(this::deleteBtnActionPerformed);
    }

    // Validation key listeners for the input fields
    private void setupInputFieldValidation() {
        setupKeyListener(healthmetricsCurrentWeightInput, this::validateWeightInput);
        setupKeyListener(healthmetricsStepsInput, this::validateStepsInput);
        setupKeyListener(healthmetricsTargetWeightInput, this::validateTargetWeightInput);
        setupKeyListener(healthmetricsExcerciseInput, this::validateExerciseInput);
    }

    /**
     * A key listener for a given JTextField to perform custom validation logic.
     * Whenever a key is released in the text field the current text of the field
     * is retrieved and passed to the specified validation logic.
     * Listening to key release events and a Consumer interface to abstract the validation logic.
     */
    private void setupKeyListener(JTextField field, Consumer<String> validationLogic) {
        field.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                validationLogic.accept(field.getText());
            }
        });
    }

    // Visual Validation logic for the weight input field.
    private void validateWeightInput(String input) {

        try {
            int weight = Integer.parseInt(input);
            boolean isValid = weight > 0 && weight <= 200;
            invalidWeight.setVisible(!isValid);

            if (!isValid) {
                invalidWeight.setText("Invalid Weight entered!");
            } else {
                invalidWeight.setText("");
            }
        } catch (NumberFormatException ex) {
            invalidWeight.setVisible(true);
            invalidWeight.setText("Invalid format.");
        }
    }

    // Visual Validation logic for the steps input field.
    private void validateStepsInput(String input) {

        try {
            int steps = Integer.parseInt(input);
            boolean isValid = steps >= 0 && steps <= 40000;
            invalidSteps.setVisible(!isValid);

            if (!isValid) {
                invalidSteps.setText("Must be 0 - 40,000.");
            } else {
                invalidSteps.setText("");
            }
        } catch (NumberFormatException ex) {
            invalidSteps.setVisible(true);
            invalidSteps.setText("Invalid format.");
        }
    }

    // Visual Validation logic for the target weight input field.
    private void validateTargetWeightInput(String input) {

        try {
            int targetWeight = Integer.parseInt(input);
            int currentWeight = Integer.parseInt(healthmetricsCurrentWeightInput.getText());
            boolean isValid = targetWeight >= currentWeight - 30 && targetWeight <= currentWeight + 30;
            invalidTargetWeight.setVisible(!isValid);

            if (!isValid) {
                invalidTargetWeight.setText("Goal unachievable.");
            } else {
                invalidTargetWeight.setText("");
            }
        } catch (NumberFormatException ex) {
            invalidTargetWeight.setVisible(true);
            invalidTargetWeight.setText("Invalid format.");
        }
    }

    // Visual Validation logic for the exercise minutes input field.
    private void validateExerciseInput(String input) {

        try {
            int exerciseMinutes = Integer.parseInt(input);
            boolean isValid = exerciseMinutes > 0 && exerciseMinutes <= 180;
            invalidTime.setVisible(!isValid);

            if (!isValid) {
                invalidTime.setText("Must be 0 - 180 minutes.");
            } else {
                invalidTime.setText("");
            }
        } catch (NumberFormatException ex) {
            invalidTime.setVisible(true);
            invalidTime.setText("Invalid format.");
        }
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
        errorData = new javax.swing.JLabel();
        healthmetricsResetBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();

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
                .addGap(25, 25, 25)
                .addGroup(healthmetricLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(healthmetricLeftPanelLayout.createSequentialGroup()
                        .addComponent(healthmetricsMainLabel)
                        .addGap(43, 43, 43)
                        .addComponent(hmBackBtn))
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
                        .addComponent(durationGoalOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
//        healthmetricHistoryBtn.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                healthmetricHistoryBtnActionPerformed(evt);
//            }
//        });
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
        healthmetricsCurrentWeightInput.setBounds(36, 78, 168, 26);

        healthmetricsTargetWeightLabel.setText("Target Weight");
        healthmetricsRightPanel.add(healthmetricsTargetWeightLabel);
        healthmetricsTargetWeightLabel.setBounds(36, 130, 168, 17);
        healthmetricsRightPanel.add(healthmetricsExcerciseInput);
        healthmetricsExcerciseInput.setBounds(270, 151, 170, 30);

        healthmetricsStepsLabel.setText("Steps per Day");
        healthmetricsRightPanel.add(healthmetricsStepsLabel);
        healthmetricsStepsLabel.setBounds(270, 56, 170, 20);

        healthmetricsStepsInput.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        healthmetricsStepsInput.setMinimumSize(new java.awt.Dimension(15, 24));
        healthmetricsRightPanel.add(healthmetricsStepsInput);
        healthmetricsStepsInput.setBounds(270, 78, 170, 26);

        healthmetricsExcerciseLabel.setText("Excercise Duration");
        healthmetricsRightPanel.add(healthmetricsExcerciseLabel);
        healthmetricsExcerciseLabel.setBounds(270, 130, 170, 17);
        healthmetricsRightPanel.add(healthmetricsTargetWeightInput);
        healthmetricsTargetWeightInput.setBounds(36, 151, 168, 30);

        healthmetricsRadioLoseWeight.setBackground(new java.awt.Color(255, 255, 255));
        healthmetricsRadioLoseWeight.setText("Lose Weight");
        healthmetricsRightPanel.add(healthmetricsRadioLoseWeight);
        healthmetricsRadioLoseWeight.setBounds(36, 227, 134, 21);

        healthmetricsRadioGainWeight.setBackground(new java.awt.Color(255, 255, 255));
        healthmetricsRadioGainWeight.setText("Gain Weight");
        healthmetricsRightPanel.add(healthmetricsRadioGainWeight);
        healthmetricsRadioGainWeight.setBounds(200, 227, 122, 21);

        healthmetricsRadioStayHealthy.setBackground(new java.awt.Color(255, 255, 255));
        healthmetricsRadioStayHealthy.setText("Stay Healthy");
        healthmetricsRightPanel.add(healthmetricsRadioStayHealthy);
        healthmetricsRadioStayHealthy.setBounds(340, 227, 120, 21);

        healthmetricsSaveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_save (2).png"))); // NOI18N
        healthmetricsSaveBtn.setBorder(null);
        healthmetricsSaveBtn.setBorderPainted(false);
        healthmetricsSaveBtn.setContentAreaFilled(false);
        healthmetricsSaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                healthmetricsSaveBtnActionPerformed(evt);
            }
        });
        healthmetricsRightPanel.add(healthmetricsSaveBtn);
        healthmetricsSaveBtn.setBounds(368, 299, 75, 32);

        currentUserLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        currentUserLabel2.setForeground(new java.awt.Color(0, 0, 0));
        currentUserLabel2.setText("Michael Babik");
        healthmetricsRightPanel.add(currentUserLabel2);
        currentUserLabel2.setBounds(190, 10, 110, 20);

        invalidTime.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        invalidTime.setForeground(new java.awt.Color(255, 51, 51));
        healthmetricsRightPanel.add(invalidTime);
        invalidTime.setBounds(270, 191, 170, 18);

        invalidTargetWeight.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        invalidTargetWeight.setForeground(new java.awt.Color(255, 51, 51));
        healthmetricsRightPanel.add(invalidTargetWeight);
        invalidTargetWeight.setBounds(36, 191, 168, 19);

        invalidWeight.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        invalidWeight.setForeground(new java.awt.Color(255, 51, 51));
        healthmetricsRightPanel.add(invalidWeight);
        invalidWeight.setBounds(36, 106, 168, 20);

        invalidSteps.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        invalidSteps.setForeground(new java.awt.Color(255, 51, 51));
        healthmetricsRightPanel.add(invalidSteps);
        invalidSteps.setBounds(270, 106, 170, 20);

        errorData.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        errorData.setForeground(new java.awt.Color(255, 0, 0));
        healthmetricsRightPanel.add(errorData);
        errorData.setBounds(40, 260, 224, 20);

        healthmetricsResetBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_reset (1).png"))); // NOI18N
        healthmetricsResetBtn.setBorder(null);
        healthmetricsResetBtn.setBorderPainted(false);
        healthmetricsResetBtn.setContentAreaFilled(false);
        healthmetricsResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                healthmetricsResetBtnActionPerformed(evt);
            }
        });
        healthmetricsRightPanel.add(healthmetricsResetBtn);
        healthmetricsResetBtn.setBounds(287, 299, 75, 32);

        deleteBtn.setBackground(new java.awt.Color(255, 0, 0));
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        healthmetricsRightPanel.add(deleteBtn);
        deleteBtn.setBounds(40, 300, 76, 27);

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

    // Back button to return to the modules page.
    private void hmBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hmBackBtnActionPerformed
        Modules modules = Modules.getInstance();
        modules.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_hmBackBtnActionPerformed

    // Save button to save the current user's health metrics.
    private void healthmetricsSaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_healthmetricsSaveBtnActionPerformed
        // Get the user input.
        String currentWeightStr = healthmetricsCurrentWeightInput.getText();
        String stepsStr = healthmetricsStepsInput.getText();
        String targetWeightStr = healthmetricsTargetWeightInput.getText();
        String exerciseMinutesStr = healthmetricsExcerciseInput.getText();
        String healthGoal = getSelectedHealthGoal();

        // Validate the inputs.
        if (!validateInputs(currentWeightStr, stepsStr, targetWeightStr, exerciseMinutesStr)) {
            return;
        }

        // Process the inputs and display the outputs.
        HealthMetricsOutput output = processor.processInputs(currentWeightStr, stepsStr, targetWeightStr, healthGoal, exerciseMinutesStr);
        displayOutputs(output);

        // Save the users health metrics.
        metricsManager.saveUserMetrics(currentUser, output);

        // Write the metrics to a file.
        try {
            historyManager.writeMetricsToFile(output, healthGoal, currentUser);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error while writing/reading the file: " + e.getMessage(),
                    "File Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_healthmetricsSaveBtnActionPerformed

    /**
     * Validates the user input fields for current weight, steps, target weight and exercise minutes.
     * Ensures that the inputs are within specified valid ranges and are in the correct format.
     */
    private boolean validateInputs(String currentWeightStr, String stepsStr, String targetWeightStr, String exerciseMinutesStr) {

        try {
            int currentWeight = Integer.parseInt(currentWeightStr);
            int steps = Integer.parseInt(stepsStr);
            int targetWeight = Integer.parseInt(targetWeightStr);
            int exerciseMinutes = Integer.parseInt(exerciseMinutesStr);

            errorData.setText("");

            // The actual validation logic for the inputs, where if the inputs are invalid the user cant save and an error message is displayed.
            return !(currentWeight <= 0 || currentWeight > 200 ||
                     steps < 0 || steps > 40000 ||
                     targetWeight < currentWeight - 30 ||
                     targetWeight > currentWeight + 30 ||
                     exerciseMinutes <= 0 || exerciseMinutes > 180);
        } catch (NumberFormatException e) {
            errorData.setText("Invalid format in one or more fields!");
            return false;
        }
    }

    /**
     * Writes the current health metrics to a file and read the file in text file format.
     * The file is located in the data folder of the project.
     */
    private void healthmetricHistoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_healthmetricHistoryBtnActionPerformed

        // Get the current health metrics.
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

        // Open the txt file
        try {
            String filePath = historyManager.getFilePath();
            File file = new File(filePath);

            if (!file.exists()) {
                JOptionPane.showMessageDialog(this, "No data available.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Check if the file is supported on the system.
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

    // Reset button to reset all of the input and output fields.
    private void healthmetricsResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_healthmetricsResetBtnActionPerformed
        resetInputs();
        resetOutputs();
        buttonGroup.clearSelection();
        healthmetricsRadioLoseWeight.setSelected(true);
    }//GEN-LAST:event_healthmetricsResetBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        try {
            historyManager.deleteUserMetrics(currentUser);
            metricsManager.deleteUserMetrics(currentUser);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error while deleting the user data: " + e.getMessage(),
                    "Delete Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    // Resets all of the input fields.
    private void resetInputs() {
        healthmetricsCurrentWeightInput.setText("");
        healthmetricsStepsInput.setText("");
        healthmetricsTargetWeightInput.setText("");
        healthmetricsExcerciseInput.setText("");
        invalidWeight.setText("");
        invalidSteps.setText("");
        invalidTargetWeight.setText("");
        invalidTime.setText("");
        errorData.setText("");
    }

    // Resets all of the output fields.
    private void resetOutputs() {
        weightOutput.setText("Weight");
        stepsOutput.setText("Steps");
        targetOutput.setText("Target");
        durationOutput.setText("Duration");
        weightGoalOutput.setText("TargetWeight");
        stepsGoalOutput.setText("TargetSteps");
        durationGoalOutput.setText("TargetDuration");
        targetGoalOutput.setText("Lose Weight");
    }

    // Save button to save the current users health metrics.
    private String getSelectedHealthGoal() {
        return healthmetricsRadioLoseWeight.isSelected() ? "Lose Weight" :
                (healthmetricsRadioGainWeight.isSelected() ? "Gain Weight" :
                        (healthmetricsRadioStayHealthy.isSelected() ? "Stay Healthy" :
                                ""));
    }

    // Displays the outputs for the current users health metrics.
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel currentUserLabel2;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel duration;
    private javax.swing.JLabel durationGoal;
    private javax.swing.JLabel durationGoalOutput;
    private javax.swing.JLabel durationOutput;
    private javax.swing.JLabel errorData;
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
    private javax.swing.JButton healthmetricsResetBtn;
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
