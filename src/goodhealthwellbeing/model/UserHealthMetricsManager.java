package goodhealthwellbeing.model;

import goodhealthwellbeing.output.HealthMetricsOutput;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Michael Babik
*/

/**
 * This class manages health metrics for users.
 * It stores and retrieves health metric data associated with each user.
 */

public class UserHealthMetricsManager {

    // A map to store users health metrics with their email as the key.
    // The maps value is an instance of HealthMetricsOutput representing the health metrics for that user.
    private Map<String, HealthMetricsOutput> userHealthMetrics;

    public UserHealthMetricsManager() {
        userHealthMetrics = new HashMap<>();
    }

    /**
     * Stores health metrics for a specific user.
     * It uses the users email as a key to store the associated health metrics in the map.
     */
    public void saveUserMetrics(User user, HealthMetricsOutput metrics) {
        userHealthMetrics.put(user.getEmail(), metrics);
    }

    /**
     * Retrieves health metrics for a specific user.
     * Uses the users email to find and return their associated health metrics.
     */
    public HealthMetricsOutput getUserMetrics(User user) {
        return userHealthMetrics.get(user.getEmail());
    }
}
