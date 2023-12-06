package goodhealthwellbeing.util;

/**
 * TargetWeightCalculator.java
 * @author Michael Babik
 */

public class TargetWeightCalculator {

    /**
     * Calculates the adjusted target weight based on the user's current weight
     * and their health goal.
     * @param currentWeight the user's current weight
     *                        e.g. "70" -> 70 kg
     * @param targetWeight the user's target weight
     *                        e.g. "65" -> 65 kg
     * @param healthGoal the user's health goal
     * @return the adjusted target weight
     */
    public String calculate(double currentWeight, double targetWeight, String healthGoal) {

        /* If the user's health goal is to lose weight, then the target weight
           should be decreased by 5 kg.
           If the user's health goal is to gain weight, then the target weight
           should be increased by 5 kg.
           Otherwise, the target weight should be the same as the user's target weight.
        */
        if ("Lose Weight".equals(healthGoal)) {
            return (currentWeight - 5) + " kg";
        } else if ("Gain Weight".equals(healthGoal)) {
            return (currentWeight + 5) + " kg";
        } else {
            return targetWeight + " kg";
        }
    }
}
