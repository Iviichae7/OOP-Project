package goodhealthwellbeing.model;

import goodhealthwellbeing.output.HealthMetricsOutput;
import goodhealthwellbeing.util.DurationFormatter;
import goodhealthwellbeing.util.ExerciseDurationCalculator;
import goodhealthwellbeing.util.TargetStepCalculator;
import goodhealthwellbeing.util.TargetWeightCalculator;

/**
 * @author Michael Babik
*/

/**
 * This class is responsible for processing health metrics inputs.
 * It uses different calculators to compute target steps exercise duration and target weight based on user inputs.
 */
public class HealthMetricsProcessor {

    private final TargetStepCalculator stepCalculator = new TargetStepCalculator();
    private final ExerciseDurationCalculator durationCalculator = new ExerciseDurationCalculator();
    private final TargetWeightCalculator weightCalculator = new TargetWeightCalculator();

    public HealthMetricsProcessor() {
    }

    /**
     * Processes the input health metrics and computes the outputs.
     * Formats the exercise minutes into a more readable format.
     * It then parses the string inputs into numeric types.
     * It then calculates the target steps exercise duration and target weight
     * based on the users health goal and returns the calculated values in a HealthMetricsOutput.
     */
    public HealthMetricsOutput processInputs(String currentWeight, String steps, String targetWeight, String healthGoal, String exerciseMinutes) {
        String exerciseDuration = DurationFormatter.convertMinutesToHoursAndMinutes(exerciseMinutes);

        int stepsInt = Integer.parseInt(steps);
        int currentWeightDouble = Integer.parseInt(currentWeight);
        int targetWeightDouble = Integer.parseInt(targetWeight);

        int targetSteps = stepCalculator.calculate(stepsInt, healthGoal);
        String targetExerciseDuration = durationCalculator.calculate(exerciseMinutes, healthGoal);
        String targetWeightStr = weightCalculator.calculate(currentWeightDouble, targetWeightDouble, healthGoal);

        // Create and return the HealthMetricsOutput object with calculated values.
        return new HealthMetricsOutput(currentWeight + " kg", steps + " Steps", targetWeight + " kg", exerciseDuration,
                                       targetWeightStr, targetSteps + " Steps", targetExerciseDuration);
    }
}
