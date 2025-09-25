public class Sleep {
    private double hours; // Hours of sleep
    private String sleepType; // Could represent sleep type (e.g., "Night Sleep", "Nap", etc.)

    // Constructor
    public Sleep(double hours, String sleepType) {
        this.hours = hours;
        this.sleepType = sleepType;
    }

    // Getter for hours of sleep
    public double getHours() {
        return hours;
    }

    // Setter for hours of sleep
    public void setHours(double hours) {
        this.hours = hours;
    }

    // Getter for sleep type (e.g., night sleep, nap, etc.)
    public String getSleepType() {
        return sleepType;
    }

    // Setter for sleep type
    public void setSleepType(String sleepType) {
        this.sleepType = sleepType;
    }

}