package goodhealthwellbeing.data;

import goodhealthwellbeing.output.HealthMetricsOutput;

import java.io.*;
import java.nio.file.*;
import java.util.stream.Collectors;

/**
 * @author Michael Babik
*/

public class HealthMetricsHistoryManager {

    private static final String FILE_PATH = "OOP-Project/src/goodhealthwellbeing/data/healthmetrics_history.txt";

    public void writeMetricsToFile(HealthMetricsOutput output, String healthGoal) throws IOException {
        Path path = Paths.get(FILE_PATH);
        Files.createDirectories(path.getParent());

        try (BufferedWriter writer = Files.newBufferedWriter(path, StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {
            String content = buildContent(output, healthGoal);
            writer.write(content);
            writer.newLine();
        }
    }

    public String readMetricsFromFile() throws IOException {
        Path path = Paths.get(FILE_PATH);
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            return reader.lines().collect(Collectors.joining("\n"));
        }
    }

    private String buildContent(HealthMetricsOutput output, String healthGoal) {
        return "User Input\n" +
               "Weight: " + output.weightOutput + "\n" +
               "Steps: " + output.stepsOutput + "\n" +
               "Target Weight: " + output.targetOutput + "\n" +
               "Exercise Duration: " + output.durationOutput + "\n\n" +
               "Recommendations for User\n" +
               "Health Goal: " + healthGoal + "\n" +
               "Target Weight: " + output.targetWeight + "\n" +
               "Target Steps: " + output.targetSteps + "\n" +
               "Target Duration: " + output.targetDuration + "\n";
    }
    
}

