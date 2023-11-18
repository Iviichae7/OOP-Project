package goodhealthwellbeing.util;

/**
 * @author Michael Babik
*/

public class ExerciseDurationCalculator {

    public String calculate(String currentDuration, String healthGoal) {
        int durationInMinutes = Integer.parseInt(currentDuration);
        if ("Lose Weight".equals(healthGoal)) {
            durationInMinutes = (int) (durationInMinutes * 1.5);
        } else if ("Gain Weight".equals(healthGoal)) {
            durationInMinutes = (int) (durationInMinutes * 1.1);
        }
        return DurationFormatter.convertMinutesToHoursAndMinutes(String.valueOf(durationInMinutes));
    }
}
