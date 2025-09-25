import java.util.ArrayList;
import java.util.List;

public class DailySleepPlan implements SleepPlan {

    private double sleepGoal; // Daily sleep goal (hours)
    private double totalSleepDuration; // Total sleep duration recorded for the day
    private String sleepQuality; // Sleep quality
    private List<Sleep> sleepRecords; // List to store individual sleep records

    // Constructor
    public DailySleepPlan() {
        this.sleepGoal = 0.0;
        this.totalSleepDuration = 0.0; // Initial sleep duration is 0 hours
        this.sleepQuality = "Undefined"; // Initially set to undefined
        this.sleepRecords = new ArrayList<>();
    }

    // Method implementations
    @Override
    public void logSleepDuration(double hours) {
        if (hours < 0) {
            System.out.println("Sleep duration cannot be negative!");
            return;
        }
        totalSleepDuration += hours;
        evaluateSleepQuality(); // Update sleep quality
    }

    @Override
    public double getTotalSleepDuration() {
        return totalSleepDuration;
    }
    public void setSleepGoal(double goal) {
        if (goal <= 0) {
            System.out.println("Sleep goal must be a positive value!");
        } else {
            this.sleepGoal = goal;
        }
    }
    @Override
    public String getSleepQuality() {
        return sleepQuality;
    }

    // Helper method to evaluate sleep quality
    private void evaluateSleepQuality() {
        if (totalSleepDuration >= sleepGoal) {
            sleepQuality = "Excellent";
        } else if (totalSleepDuration >= sleepGoal * 0.8) {
            sleepQuality = "Good";
        } else {
            sleepQuality = "Poor";
        }
    }

    public void sendSleepReminder() {
        if (totalSleepDuration < sleepGoal) {
            System.out.println("Reminder: You need more sleep to reach your daily sleep goal!");
        } else {
            System.out.println("Congratulations! You've reached your daily sleep goal.");
        }
    }

    public void displaySleepPlan() {
        System.out.println("Daily Sleep Goal: " + sleepGoal + " hours");
        System.out.println("Total Sleep Duration: " + totalSleepDuration + " hours");
        System.out.println("Sleep Quality: " + sleepQuality);
    }
}
