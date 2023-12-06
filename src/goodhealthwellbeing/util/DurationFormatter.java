package goodhealthwellbeing.util;

/**
 * DurationFormatter.java
 * @author Michael Babik
 */

public class DurationFormatter {


    /**
     * Converts a string minutes into a formatted string showing
     * the equivalent duration in hours and minutes.
     * @param minutesInput the string to be converted
     *                     into hours and minutes
     *                     e.g. "120" -> "2 hrs 0 mins".
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
