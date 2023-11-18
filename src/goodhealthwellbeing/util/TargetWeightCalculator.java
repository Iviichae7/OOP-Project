package goodhealthwellbeing.util;

/**
 * @author Michael Babik
*/

public class TargetWeightCalculator {

    public String calculate(double currentWeight, double targetWeight, String healthGoal) {
        if ("Lose Weight".equals(healthGoal)) {
            return (currentWeight - 5) + " kg";
        } else if ("Gain Weight".equals(healthGoal)) {
            return (currentWeight + 5) + " kg";
        } else {
            return targetWeight + " kg";
        }
    }
}
