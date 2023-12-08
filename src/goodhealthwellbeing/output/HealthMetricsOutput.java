package goodhealthwellbeing.output;

/**
 * HealthMetricsOutput.java
 * @author Michael Babik
 */

/**
 * Plain Old Java Object representing the output of health metrics.
 * It is used for encapsulating various health-related metrics.
 */
public class HealthMetricsOutput {
    public final String weightOutput;
    public final String durationOutput;
    public final String stepsOutput;
    public final String targetOutput;

    public final String targetWeight;
    public final String targetSteps;
    public final String targetDuration;

    public HealthMetricsOutput(String weightOutput, String stepsOutput, String targetOutput, String durationOutput,
                               String targetWeight, String targetSteps, String targetDuration) {
        this.weightOutput = weightOutput;
        this.durationOutput = durationOutput;
        this.stepsOutput = stepsOutput;
        this.targetOutput = targetOutput;

        this.targetWeight = targetWeight;
        this.targetSteps = targetSteps;
        this.targetDuration = targetDuration;
    }
}
