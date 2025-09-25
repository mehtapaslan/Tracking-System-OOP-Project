import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Tracker {
    protected String date; // Date of the tracked activity
    protected String description; // Description of the tracked activity

    // Constructor
    public Tracker(String description) {
        this.description = description;
        this.date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    // Abstract method to track the activity
    public abstract void track();

    // Method to display the details of the tracked activity
    public void displayDetails() {
        System.out.println("Description: " + description);
        System.out.println("Date: " + date);
    }

    // Getter for the date
    public String getDate() {
        return date;
    }

    // Setter for the date
    public void setDate(String date) {
        this.date = date;
    }
}
