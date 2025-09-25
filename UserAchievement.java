import java.util.ArrayList;
import java.util.List;

public class UserAchievement {
    private User user; // Association with the user
    private List<String> achievements; // List of achievements

    public UserAchievement(User user) {
        this.user = user;
        this.achievements = new ArrayList<>();
    }

    // Method to add an achievement
    public void addAchievement(String achievement) {
        achievements.add(achievement);
        System.out.println("Achievement added for " + user.getName() + ": " + achievement);
    }

    // Method to list achievements
    public void listAchievements() {
        System.out.println("Achievements of " + user.getName() + ":");
        for (String achievement : achievements) {
            System.out.println("- " + achievement);
        }
    }

    public void displayAchievements() {
        System.out.println("Achievements:");
        if (achievements.isEmpty()) {
            System.out.println("No achievements recorded.");
        } else {
            for (String achievement : achievements) {
                System.out.println("- " + achievement);
            }
        }
    }

    // Method to get the user
    public User getUser () {
        return user;
    }

    // Method to set the user
    public void setUser (User user) {
        this.user = user;
    }
}