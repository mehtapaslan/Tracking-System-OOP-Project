public class Fitness {
    private String activity; // Type of activity (e.g., "Running", "Yoga", etc.)
    private double duration; // Duration of the activity in hours

    // Constructor
    public Fitness(String activity, double duration) {
        this.activity = activity;
        this.duration = duration;
    }

    // Getter for activity type
    public String getActivity() {
        return activity;
    }

    // Setter for activity type
    public void setActivity(String activity) {
        this.activity = activity;
    }

    // Getter for duration
    public double getDuration() {
        return duration;
    }

    // Setter for duration
    public void setDuration(double duration) {
        this.duration = duration;
    }
}
