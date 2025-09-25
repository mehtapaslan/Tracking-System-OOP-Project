import java.time.LocalDateTime;
import java.util.Scanner;

public class MainTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        // Create instances of trackers
        CaloriesTracker caloriesTracker = new CaloriesTracker("Daily Calorie Tracker");
        System.out.print("Enter your height in meters: ");
        double height = getPositiveDouble(scanner);
        WeightTracker weightTracker = new WeightTracker("Weight Tracker", height);

        while (running) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Start Calorie Tracking");
            System.out.println("2. Set Start Time");
            System.out.println("3. Add Calories");
            System.out.println("4. Stop Calorie Tracking");
            System.out.println("5. Set End Time");
            System.out.println("6. Display Calorie Tracking Info");
            System.out.println("7. Add Weight Entry");
            System.out.println("8. Set Target Weight");
            System.out.println("9. Display Weight Tracking Info");
            System.out.println("10. Exit");
            System.out.print("Your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    caloriesTracker.startTracking();
                    break;
                case 2:
                    // Set Start Time
                    System.out.print("Enter start time for tracker (yyyy-MM-dd HH:mm): ");
                    scanner.nextLine(); // To consume the newline left by nextInt
                    String startInput = scanner.nextLine();
                    LocalDateTime startTime = LocalDateTime.parse(startInput);
                    caloriesTracker.setStartTime(startTime);
                    break;
                case 3:
                    // Add Calories
                    System.out.print("Enter calories consumed: ");
                    int calories = scanner.nextInt();
                    caloriesTracker.addCalories(calories);
                    break;
                case 4:
                    // Stop Tracking
                    caloriesTracker.stopTracking();
                    break;
                case 5:
                    // Set End Time
                    System.out.print("Enter end time for tracker (yyyy-MM-dd HH:mm): ");
                    scanner.nextLine(); // To consume the newline left by nextInt
                    String endInput = scanner.nextLine();
                    LocalDateTime endTime = LocalDateTime.parse(endInput);
                    caloriesTracker.setEndTime(endTime);
                    break;
                case 6:
                    // Display Calorie Tracking Info
                    caloriesTracker.track();
                    break;
                case 7:
                    // Add Weight Entry
                    System.out.print("Enter your current weight in kg: ");
                    double weight = getPositiveDouble(scanner);
                    weightTracker.addWeightEntry(weight);
                    break;
                case 8:
                    // Set Target Weight
                    System.out.print("Enter your target weight in kg: ");
                    double targetWeight = getPositiveDouble(scanner);
                    weightTracker.setTargetWeight(targetWeight);
                    break;
                case 9:
                    // Display Weight Tracking Info
                    weightTracker.track();
                    break;
                case 10:
                    running = false;
                    System.out.println("Exiting the application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
        scanner.close();
    }

    // Helper method to get a positive double value from the user
    private static double getPositiveDouble(Scanner scanner) {
        double value;
        while (true) {
            value = scanner.nextDouble();
            if (value > 0) {
                break;
            } else {
                System.out.print("Please enter a positive value: ");
            }
        }
        return value;
    }
}