import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Notification {
    private String title; // Title of the notification
    private String message; // Message content of the notification
    private LocalDateTime dateTime; // Date and time for the notification
    private boolean isRead; // Status of the notification (read/unread)

    // Constructor
    public Notification(String title, String message, LocalDateTime dateTime) {
        this.title = title;
        this.message = message;
        this.dateTime = dateTime;
        this.isRead = false; // Notification is unread by default
    }

    // Getter and Setter methods
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public boolean isRead() {
        return isRead;
    }

    public void markAsRead() {
        isRead = true;
    }

    // Method to display notification info
    public void displayNotification() {
        // Define the desired date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy HH:mm:ss");

        // Format the dateTime
        String formattedDateTime = dateTime.format(formatter);

        // Display notification information
        System.out.println("Title: " + title);
        System.out.println("Message: " + message);
        System.out.println("Date and Time: " + formattedDateTime);
        System.out.println("Status: " + (isRead ? "Read" : "Unread"));
    }
}
