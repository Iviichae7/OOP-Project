package goodhealthwellbeing.util;

/**
 * @author Michael Babik
*/

public class TargetStepCalculator {

    public int calculate(int currentSteps, String healthGoal) {
        if ("Lose Weight".equals(healthGoal)) {
            return (int) (currentSteps * 1.2);
        } else if ("Gain Weight".equals(healthGoal)) {
            return (int) (currentSteps * 1.1);
        } else {
            return currentSteps;
        }
    }
}
