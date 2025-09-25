public class Yoga {
    private double duration; // Duration of the yoga session in minutes
    private String yogaType; // Type of yoga session (e.g., "Vinyasa", "Hatha", etc.)

    // Constructor to initialize the yoga session details
    public Yoga(double duration, String yogaType) {
        this.duration = duration;
        this.yogaType = yogaType;
    }

    // Getter for duration of the yoga session
    public double getDuration() {return duration;}

    // Setter for duration of the yoga session
    public void setDuration(double duration) {
        this.duration = duration;
    }

    // Getter for yoga type (e.g., Vinyasa, Hatha, etc.)
    public String getYogaType() {
        return yogaType;
    }

    // Setter for yoga type
    public void setYogaType(String yogaType) {
        this.yogaType = yogaType;
    }
}