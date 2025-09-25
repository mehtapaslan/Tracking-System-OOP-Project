import java.util.HashMap;
import java.util.Map;

public class RewardSystem {
    private int points; // User's total points
    private Map<String, Boolean> badges; // Map of badges (badge name and unlocked status)
    private int stepsGoal = 10000; // Example: default steps goal for a day
    private int caloriesGoal = 2000; // Example: default daily calories goal
    private int workoutGoalInMinutes = 30; // Example: default workout time goal in minutes

    // Constructor to initialize the reward system
    public RewardSystem() {
        this.points = 0;
        this.badges = new HashMap<>();
        initializeBadges(); // Initialize default badges
    }

    // Initialize default badges
    private void initializeBadges() {
        badges.put("First Step", false);  // For completing the first workout or activity
        badges.put("10k Steps", false);   // For reaching 10k steps
        badges.put("Calories Crusher", false);  // For reaching daily calories goal
        badges.put("Fitness Pro", false); // For achieving a specific workout goal
    }

    // Method to earn points based on activities or achievements
    public void earnPoints(int pointsEarned) {
        points += pointsEarned;
        System.out.println("You earned " + pointsEarned + " points! Total points: " + points);
    }

    // Method to unlock a badge
    public void unlockBadge(String badgeName) {
        if (badges.containsKey(badgeName) && !badges.get(badgeName)) {
            badges.put(badgeName, true);
            System.out.println("Congratulations! You unlocked the '" + badgeName + "' badge!");
        }
    }

    // Method to check if user has unlocked a specific badge
    public boolean hasUnlockedBadge(String badgeName) {
        return badges.getOrDefault(badgeName, false);
    }

    // Method to track daily step count
    public void trackSteps(int steps) {
        if (steps >= stepsGoal) {
            earnPoints(50);  // Earn points for completing the steps goal
            unlockBadge("10k Steps");
        }
    }

    // Method to track daily calories consumed
    public void trackCalories(int calories) {
        if (calories <= caloriesGoal) {
            earnPoints(40);  // Earn points for meeting the calorie goal
            unlockBadge("Calories Crusher");
        }
    }

    // Method to track workout time
    public void trackWorkout(int minutes) {
        if (minutes >= workoutGoalInMinutes) {
            earnPoints(30);  // Earn points for completing the workout goal
            unlockBadge("Fitness Pro");
        }
    }

    // Getter for total points
    public int getPoints() {
        return points;
    }

    // Method to get a list of unlocked badges
    public Map<String, Boolean> getUnlockedBadges() {
        return badges;
    }

    // Display current rewards and progress
    public void displayRewards() {
        System.out.println("Total Points: " + points);
        System.out.println("Unlocked Badges:");
        for (Map.Entry<String, Boolean> entry : badges.entrySet()) {
            String badgeName = entry.getKey();
            String status = entry.getValue() ? "Unlocked" : "Locked";
            System.out.println(badgeName + ": " + status);
        }
    }
}