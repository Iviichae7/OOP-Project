package goodhealthwellbeing.util;

/**
 * @author Michael Babik
*/

public class TargetStepCalculator {

    public int calculate(int currentSteps, String healthGoal) {
        
        double weight = 1.0;
        
        if ("Lose Weight".equals(healthGoal)) {
            weight = 1.3;
        } else if ("Gain Weight".equals(healthGoal)) {
            return (int) (currentSteps * 1.1);
        } else {
            weight = 1.1;
        }
        
        double calculate = currentSteps * weight;
        
        return (int) (Math.round(calculate / 100.0) * 100);
    }
}
