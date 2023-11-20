package goodhealthwellbeing.util;

/**
 * @author Michael Babik
*/

public class ExerciseDurationCalculator {

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
    
    private int roundToNearest(int duration){
        
        int left = duration % 15;
        
        if(left == 0){
            return duration;
        }
        
        return duration + (15 - left);
    }
}
