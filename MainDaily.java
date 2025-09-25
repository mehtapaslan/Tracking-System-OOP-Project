import java.time.LocalDate;
import java.util.Scanner;

public class MainDaily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate date = LocalDate.now();
        System.out.println("Date: " + date);

        // --- Fitness Plan ---
        DailyFitnessPlan myFitnessPlan = new DailyFitnessPlan();
        System.out.print("Enter your daily workout goal (minutes): ");
        myFitnessPlan.setDailyWorkoutGoal(scanner.nextDouble());
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter workout activity: ");
        String fitnessActivity = scanner.nextLine();
        System.out.print("Enter workout duration (minutes): ");
        double workoutDuration = scanner.nextDouble();
        System.out.print("Enter calories burned: ");
        double caloriesBurned = scanner.nextDouble();
        myFitnessPlan.logWorkout(fitnessActivity, workoutDuration, caloriesBurned);
        myFitnessPlan.displayFitnessActivity();
        myFitnessPlan.sendFitnessReminder();

        // --- Hydration Plan ---
        DailyHydrationPlan myHydrationPlan = new DailyHydrationPlan();
        System.out.print("\nEnter your daily hydration goal (liters): ");
        myHydrationPlan.setHydrationGoal(scanner.nextDouble());
        System.out.print("Enter water intake (liters): ");
        double waterIntake = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter time of intake (e.g., '08:00 AM'): ");
        String time = scanner.nextLine();
        myHydrationPlan.logWaterIntake(waterIntake,time);
        myHydrationPlan.displayHydrationPlan();
        myHydrationPlan.sendHydrationReminder();

        // --- Meal Plan ---
        DailyMealPlan myMealPlan = new DailyMealPlan();
        System.out.print("\nEnter your daily calorie intake goal (calories): ");
        myMealPlan.setCaloricGoal(scanner.nextDouble());
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter meal name: ");
        String mealName = scanner.nextLine();
        System.out.print("Enter meal time (e.g., '08:00 AM'): ");
        String mealTime = scanner.nextLine();
        System.out.print("Enter meal calories: ");
        double mealCalories = scanner.nextDouble();
        System.out.print("Enter protein content (gram): ");//Nutrition
        double protein = scanner.nextDouble();
        System.out.print("Enter carbs content (gram): ");
        double carbs = scanner.nextDouble();
        System.out.print("Enter fats content (gram): ");
        double fats = scanner.nextDouble();
        myMealPlan.addMeal(mealName, mealCalories);
        myMealPlan.displayMealPlan();
        myMealPlan.sendMealReminder();
        Nutrition meal = new Nutrition(mealName, mealCalories, mealTime, protein, carbs, fats);// Create Nutrition object
        System.out.println("\nMeal Details: " +mealName + meal.toString());

        // --- Sleep Plan ---
        DailySleepPlan mySleepPlan = new DailySleepPlan();
        System.out.print("\nEnter your daily sleep goal (hours): ");
        mySleepPlan.setSleepGoal(scanner.nextDouble());
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter sleep duration (hours): ");
        double sleepDuration = scanner.nextDouble();
        mySleepPlan.logSleepDuration(sleepDuration);
        mySleepPlan.displaySleepPlan();
        mySleepPlan.sendSleepReminder();

        // --- Yoga Plan ---
        DailyYogaPlan myYogaPlan = new DailyYogaPlan();
        System.out.print("\nEnter your daily yoga goal (minutes): ");
        myYogaPlan.setDailyYogaGoal(scanner.nextDouble());
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter yoga session details: ");
        String yogaDetails = scanner.nextLine();
        System.out.print("Enter yoga session duration (minutes): ");
        double yogaDuration = scanner.nextDouble();
        myYogaPlan.logYogaSession(yogaDetails, yogaDuration);
        myYogaPlan.displayYogaSessions();
        myYogaPlan.getMeditationLevel();
        myYogaPlan.sendYogaReminder();

        scanner.close();
        System.out.println("Exiting the program...");
    }
}