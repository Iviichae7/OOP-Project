package goodhealthwellbeing.util;

/**
 * @author Michael Babik
*/

public class DurationFormatter {

    
    /**
     * Converts a string minutes into a formatted string showing
     * the equivalent duration in hours and minutes. 
     * @param minutesInput
     * @return 
     */
    public static String convertMinutesToHoursAndMinutes(String minutesInput) {
        try {
            int totalMinutes = Integer.parseInt(minutesInput);
            int hours = totalMinutes / 60;
            int minutes = totalMinutes % 60;
            return hours + " hrs " + minutes + " mins";
        } catch (NumberFormatException e) {
            return "Invalid input";
        }
    }
}
