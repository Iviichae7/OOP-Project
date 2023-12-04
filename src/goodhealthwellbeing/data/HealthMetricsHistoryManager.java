package goodhealthwellbeing.data;

import goodhealthwellbeing.output.HealthMetricsOutput;
import goodhealthwellbeing.model.User;
import java.util.List;
import java.io.*;
import java.nio.file.*;
import java.util.stream.Collectors;

/*
  @author Michael Babik
*/

/**
 * Manages the history of health metrics.
 * Responsible for writing and reading health metrics data to and from a file.
 */
public class HealthMetricsHistoryManager {

    private static final String FILE_PATH = "src/goodhealthwellbeing/data/healthmetrics_history.txt";

    public void writeMetricsToFile(HealthMetricsOutput output, String healthGoal, User user) throws IOException {
        // Creates the string path into a path object
        Path path = Paths.get(FILE_PATH);

        // Makes sure the path exists, if not it creates.
        Files.createDirectories(path.getParent());

        // Writing text data to the file.
        try (BufferedWriter writer = Files.newBufferedWriter(path, StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {

            // Builds the string
            String content = buildContent(output, healthGoal, user);

            // Writes the content to the file.
            writer.write(content);

            // Adds a new line for separation between entries.
            writer.newLine();
        }
    }

    public String getFilePath() {
        return FILE_PATH;
    }

    /**
     * Reads and returns the entire health metrics history from the file as a single string.
     *
     * @return A string containing all the health metrics data from the file.
     * @throws IOException If an I/O error occurs or the file doesn't exist.
     */
    public String readMetricsFromFile() throws IOException {

        Path path = Paths.get(FILE_PATH);

        if (!Files.exists(path)) {
            throw new FileNotFoundException("The file " + FILE_PATH + " does not exist.");
        }
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            // Collect all lines in the file into a single string separated by new lines.
            return reader.lines().collect(Collectors.joining("\n"));
        }
    }

    public void deleteUserMetrics(User user) throws IOException {
        Path path = Paths.get(FILE_PATH);
        if (!Files.exists(path)) {
            throw new FileNotFoundException("The file " + FILE_PATH + " does not exist.");
        }

        List<String> lines = Files.readAllLines(path);
        lines.removeIf(line -> line.contains(user.getEmail()));
        lines.removeIf(line -> line.contains(user.getFullName()));
        Files.write(path, lines);
    }

    /**
     * Builds a formatted string to the file from the HealthMetricsOutput and health goal.
     *
     * @param output     The HealthMetricsOutput object to format.
     * @param healthGoal The health goal of the user for example "Lose Weight", "Gain weight" etc.
     * @return A formatted string.
     */
    private String buildContent(HealthMetricsOutput output, String healthGoal, User user) {
        return
                "_".repeat(40) + "\n" +
                        "User Email: " + user.getEmail() + "\n" +
                        "User Input\n" +
                        "Weight: " + output.weightOutput + "\n" +
                        "Steps: " + output.stepsOutput + "\n" +
                        "Target Weight: " + output.targetOutput + "\n" +
                        "Exercise Duration: " + output.durationOutput + "\n\n" +
                        "Recommendations for User: " + user.getFullName() + "\n" +
                        "Health Goal: " + healthGoal + "\n" +
                        "Target Weight: " + output.targetWeight + "\n" +
                        "Target Steps: " + output.targetSteps + "\n" +
                        "Target Duration: " + output.targetDuration + "\n" +
                        "_".repeat(40) + "\n";
    }

}

