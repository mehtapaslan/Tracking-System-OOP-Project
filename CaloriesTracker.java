import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CaloriesTracker extends Tracker implements Trackable {
    private int caloriesConsumed; // Total calories consumed
    private LocalDateTime startTime; // Start time of tracking
    private LocalDateTime endTime; // End time of tracking
    private boolean completed; // Tracking status
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public CaloriesTracker(String description) {
        super(description); // Call the constructor of Tracker
        this.caloriesConsumed = 0;
        this.completed = false; // Initialize completed status
    }

    @Override
    public void startTracking() {
        if (!completed) {
            startTime = LocalDateTime.now();
            System.out.println("Tracking started for " + description + " at: " + startTime.format(formatter));
        } else {
            System.out.println("Tracking has already been completed. Please reset to start again.");
        }
    }

    @Override
    public void stopTracking() {
        if (!completed) {
            endTime = LocalDateTime.now();
            completed = true;
            System.out.println("Tracking stopped for " + description + " at: " + endTime.format(formatter));
        } else {
            System.out.println("Tracking is already completed.");
        }
    }

    @Override
    public boolean isCompleted() {
        return completed;
    }

    @Override
    public void track() {
        // Logic to track calorie intake
        System.out.println("Tracking calorie intake...");
        displayDetails();
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
        System.out.println("Start time set to: " + startTime.format(formatter));
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
        System.out.println("End time set to: " + endTime.format(formatter));
    }

    public void addCalories(int calories) {
        if (calories > 0) {
            caloriesConsumed += calories;
            System.out.println(calories + " calories added. Total: " + caloriesConsumed);
        } else {
            System.out.println("Calories must be a positive value.");
        }
    }

    public int getCaloriesConsumed() {
        return caloriesConsumed;
    }

    @Override
    public void displayDetails() {
        System.out.println("Calorie Tracking Information:");
        System.out.println("Description: " + description);
        System.out.println("Total Calories Consumed: " + caloriesConsumed);
        System.out.println("Tracking Started At: " + (startTime != null ? startTime.format(formatter) : "Not set"));
        System.out.println("Tracking Stopped At: " + (endTime != null ? endTime.format(formatter) : "Not set"));
        System.out.println("Tracking Completed: " + (completed ? "Yes" : "No"));
    }
}
