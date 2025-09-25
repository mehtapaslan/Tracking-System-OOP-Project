import java.util.ArrayList;
import java.util.List;

public class UserHistory {

    // Attributes
    private String userName; // User name
    private List<String> activities; // List to store activities

    // Constructor
    public UserHistory(String userName) {
        this.userName = userName; // Initialize the user name
        this.activities = new ArrayList<>(); // Initialize the activities list
    }

    // Method to add an activity
    public void addActivity(String activity) {
        activities.add(activity); // Add the activity to the list
    }

    // Method to retrieve all activities
    public List<String> getActivities() {
        return activities; // Return the list of activities
    }

    // Method to clear all activities
    public void clearActivities() {
        activities.clear(); // Clear the activities list
    }

    // Method to display user history
    public void displayHistory() {
        System.out.println("User  Name: " + userName); // Print the user name
        System.out.println("Activities:"); // Print the header for activities
        if (activities.isEmpty()) {
            System.out.println("No activities recorded.");
        } else {
            for (String activity : activities) {
                System.out.println("- " + activity); // Print each activity
            }
        }
    }

    // New display method for summarized user history
    public void displaySummary() {
        System.out.println("User  History Summary:");
        System.out.println("User  Name: " + userName);
        System.out.println("Total Activities Recorded: " + activities.size());
        if (!activities.isEmpty()) {
            System.out.println("Most Recent Activity: " + activities.get(activities.size() - 1));
        } else {
            System.out.println("No recent activities available.");
        }
    }
}