package goodhealthwellbeing.view.components.health_module.logic;

import goodhealthwellbeing.view.components.health_module.HealthMetrics;

import javax.swing.*;

/**
 * HealthMetricsUI.java
 * @Author Michael Babik
 */

public class HealthMetricsUI {

    private final HealthMetrics healthMetrics;

    // Constructor
    public HealthMetricsUI(HealthMetrics healthMetrics) {
        this.healthMetrics = healthMetrics;
    }

    // Displays the current user in the label.
    public void displayCurrentUser(JLabel currentUserLabel2) {
        if (healthMetrics.getCurrentUser() != null) {
            currentUserLabel2.setText(healthMetrics.getCurrentUser().getFullName());
        }
    }

    // Sets up the button group for health goals lose weight, gain weight etc. lose weight by default.
    public void setupButtonGroup(ButtonGroup buttonGroup, JRadioButton healthmetricsRadioLoseWeight, JRadioButton healthmetricsRadioGainWeight, JRadioButton healthmetricsRadioStayHealthy) {
        buttonGroup.add(healthmetricsRadioLoseWeight);
        buttonGroup.add(healthmetricsRadioGainWeight);
        buttonGroup.add(healthmetricsRadioStayHealthy);
        healthmetricsRadioLoseWeight.setSelected(true);
    }

    // Resets all the output fields.
    public void resetOutputs(JLabel weightOutput, JLabel stepsOutput, JLabel targetOutput, JLabel durationOutput, JLabel weightGoalOutput, JLabel stepsGoalOutput, JLabel durationGoalOutput, JLabel targetGoalOutput) {
        weightOutput.setText("Weight");
        stepsOutput.setText("Steps");
        targetOutput.setText("Target");
        durationOutput.setText("Duration");
        weightGoalOutput.setText("TargetWeight");
        stepsGoalOutput.setText("TargetSteps");
        durationGoalOutput.setText("TargetDuration");
        targetGoalOutput.setText("Lose Weight");
    }

    // Resets all the input fields.
    public void resetInputs(JTextField healthmetricsCurrentWeightInput, JTextField healthmetricsStepsInput, JTextField healthmetricsTargetWeightInput, JTextField healthmetricsExcerciseInput, JLabel invalidWeight, JLabel invalidSteps, JLabel invalidTargetWeight, JLabel invalidTime, JLabel errorData) {
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
}
