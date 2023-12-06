package goodhealthwellbeing.view.components.health_module.logic;

import javax.swing.*;

/**
 * HealthMetricsValidator.java
 * @author Michael Babik
 */
public class HealthMetricsValidator {

    // Visual Validation logic for the weight input field.
    public void validateWeightInput(String input, JLabel invalidWeight) {

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
    public void validateStepsInput(String input, JLabel invalidSteps) {

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
    public void validateTargetWeightInput(String input, JLabel invalidTargetWeight, JTextField healthmetricsCurrentWeightInput) {

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
    public void validateExerciseInput(String input, JLabel invalidTime) {

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

    /**
     * Validates the user input fields for current weight, steps, target weight and exercise minutes.
     * Ensures that the inputs are within specified valid ranges and are in the correct format.
     */
    public boolean validateInputs(String currentWeightStr, String stepsStr, String targetWeightStr, String exerciseMinutesStr, JLabel errorData) {

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

}
