package goodhealthwellbeing.util;

/**
 * TargetStepCalculator.java
 * @author Michael Babik
 */

public class TargetStepCalculator {

    /**
     * Calculates the adjusted target steps based on the user's current steps
     * and their health goal.
     * @param currentSteps the user's current steps
     *                        e.g. "12000" -> 12000 steps
     * @param healthGoal the user's health goal
     *                        e.g. "Lose Weight"
     * @return the adjusted target steps
     */
    public int calculate(int currentSteps, String healthGoal) {

        double weight = 1.0;

        /*
          If the user's health goal is to lose weight, then the target steps
          should be increased by 30%.
          If the user's health goal is to gain weight, then the target steps
          should be increased by 10%.
          Otherwise, the target steps should be increased by 10%.
         */
        if ("Lose Weight".equals(healthGoal)) {
            weight = 1.3;
        } else if ("Gain Weight".equals(healthGoal)) {
            return (int) (currentSteps * 1.1);
        } else {
            weight = 1.1;
        }

        double calculate = currentSteps * weight;

        // Round to the nearest 100.
        return (int) (Math.round(calculate / 100.0) * 100);
    }
}
