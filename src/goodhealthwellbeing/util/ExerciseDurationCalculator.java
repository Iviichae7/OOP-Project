package goodhealthwellbeing.util;

/**
 * @author Michael Babik
*/

public class ExerciseDurationCalculator {

    /**
     * Calculates the adjusted exercise duration based on the user's current exercise duration
     * and their health goal. 
     * @param currentDuration
     * @param healthGoal
     * @return 
     */
    public String calculate(String currentDuration, String healthGoal) {
        
        int durationInMinutes = Integer.parseInt(currentDuration);
        double factor = 1.0;
        
        if ("Lose Weight".equals(healthGoal)) {
            factor = 1.6;
        } else if ("Gain Weight".equals(healthGoal)) {
            factor = 1.8;
        }
        
        durationInMinutes = (int) Math.round(durationInMinutes * factor);
        
        int roundedDuration = roundToNearest(durationInMinutes);

        return DurationFormatter.convertMinutesToHoursAndMinutes(String.valueOf(roundedDuration));
    }
    
    /**
     * Rounds the given duration to the nearest interval.
     * In this case the interval is set to 15 minutes.
     */
    private int roundToNearest(int duration){
        
        int left = duration % 15;
        
        if(left == 0){
            return duration;
        }
        
        return duration + (15 - left);
    }
}
