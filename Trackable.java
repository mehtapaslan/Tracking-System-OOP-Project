public interface Trackable {
    // Method to track the activity
    void track();
    // Method to get the date of the tracked activity
    void startTracking();
    void stopTracking();
    boolean isCompleted();
}