package goodhealthwellbeing.model;

import goodhealthwellbeing.output.HealthMetricsOutput;
import goodhealthwellbeing.data.HealthMetricsHistoryManager;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.nio.file.*;
import java.io.FileNotFoundException;


/**
 * UserHealthMetricsManager.java
 * @author Michael Babik
*/

/**
 * This class manages health metrics for users.
 * It stores and retrieves health metric data associated with each user.
 */

public class UserHealthMetricsManager {

    // A map to store users health metrics with their email as the key.
    // The maps value is an instance of HealthMetricsOutput representing the health metrics for that user.
    private final Map<String, HealthMetricsOutput> userHealthMetrics;

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

    /**
     * Deletes health metrics for a specific user.
     * Uses the users email to find and delete their associated health metrics.
     */
    public void deleteUserMetrics(User user) throws IOException, IOException {
        HealthMetricsHistoryManager historyManager = new HealthMetricsHistoryManager();
        String filePath = historyManager.getFilePath();
        Path path = Paths.get(filePath);
        if (!Files.exists(path)) {
            throw new FileNotFoundException("The file " + filePath + " does not exist.");
        }

        // List<String> lines = Files.readAllLines(path) written by @Github Co-pilot
        List<String> lines = Files.readAllLines(path);
        lines.removeIf(line -> line.contains(user.getEmail()));
        Files.write(path, lines);
    }
}
