public class Mindfulness {
    private String activityType;  // Type of mindfulness activity (e.g., "Meditation")
    private double duration;      // Duration in minutes

    // Constructor to initialize the mindfulness session
    public Mindfulness(String activityType, double duration) {
        setActivityType(activityType);
        setDuration(duration);
    }

    // Getter and setter for activityType
    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        if (activityType == null || activityType.isEmpty()) {
            throw new IllegalArgumentException("Activity type cannot be null or empty.");
        }
        this.activityType = activityType;
    }

    // Getter and setter for duration
    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        if (duration < 0) {
            throw new IllegalArgumentException("Duration must be positive.");
        }
        this.duration = duration;
    }

    // Method to track mindfulness progress
    public void trackMindfulness() {
        System.out.println("Mindfulness session tracked!");
        System.out.println("Activity Type: " + activityType);
        System.out.println("Duration: " + duration + " minutes");
    }

    // Static method to calculate total mindfulness time from multiple sessions
    public static double calculateTotalMindfulnessTime(Mindfulness[] sessions) {
        double totalTime = 0;
        for (Mindfulness session : sessions) {
            totalTime += session.getDuration();
        }
        return totalTime;
    }

    // Override toString to display session details
    @Override
    public String toString() {
        return "Mindfulness Session Details:\n" +
                "Activity Type: " + activityType + "\n" +
                "Duration: " + duration + " minutes";
    }
}