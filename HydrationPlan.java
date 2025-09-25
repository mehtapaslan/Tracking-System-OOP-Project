public interface HydrationPlan {
    // Method to log water intake
    void logWaterIntake(double amount, String time); // amount in liters or milliliters
    // Method to get the total water intake for the day
    double getTotalWaterIntake();
}
