import java.util.ArrayList;
import java.util.List;

public class DailyHydrationPlan implements HydrationPlan {
    private List<Hydration> hydrationRecords; // List of hydration records
    private double totalWaterIntake; // Total water intake in liters
    private double hydrationGoal; // Hydration goal in liters

    // Constructor
    public DailyHydrationPlan() {
        this.hydrationRecords = new ArrayList<>();
        this.totalWaterIntake = 0.0;
        this.hydrationGoal = 0.0;
    }
    // Overriding method to get total water intake
    @Override
    public double getTotalWaterIntake() {
        return totalWaterIntake;
    }
    // Method to log water intake with time
    @Override
    public void logWaterIntake(double amount, String time) {
        if (amount > 0) {
            Hydration newRecord = new Hydration(amount, time); // Default time as "N/A"
            hydrationRecords.add(newRecord); // Add to the list
            totalWaterIntake += amount; // Update total intake
        } else {
            System.out.println("Water intake must be a positive value.");
        }
    }
    // Setter for hydration goal
    public void setHydrationGoal(double goal) {
        if (goal > 0) {
            this.hydrationGoal = goal;
        } else {
            System.out.println("Hydration goal must be a positive value.");
        }
    }
    // Method to send a hydration reminder
    public void sendHydrationReminder() {
        if (totalWaterIntake < hydrationGoal) {
            System.out.println("Reminder: You need to drink more water to reach your daily hydration goal!");
        } else {
            System.out.println("Congratulations! You've exceeded your daily hydration goal.");
        }
    }

    public void displayHydrationPlan() {
        System.out.println("Daily Hydration Plan:");
        System.out.println("Goal: " + hydrationGoal + " liters");
        System.out.println("Total Water Intake: " + totalWaterIntake + " liters");
    }
}
