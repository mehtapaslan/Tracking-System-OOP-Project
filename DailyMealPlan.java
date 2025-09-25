import java.util.ArrayList;
import java.util.List;

public class DailyMealPlan implements MealPlan {
    private List<Meal> meals; // List to store Meal objects
    private double caloricGoal; // Daily caloric goal
    private double totalCalories; // Total daily calorie intake

    public DailyMealPlan() {
        this.meals = new ArrayList<>();
        this.totalCalories = 0.0;
    }

    @Override
    public void addMeal(String mealName, double calories) {
        if (calories > 0) {
            Meal meal = new Meal(mealName, calories, ""); // Create a new Meal object
            meals.add(meal); // Add the meal to the list
            totalCalories += calories; // Update total calorie intake
        } else {
            System.out.println("Calories must be a positive value.");
        }
    }

    @Override
    public void removeMeal(String mealName) {
        Meal mealToRemove = null;
        for (Meal meal : meals) {
            if (meal.getMealName().equals(mealName)) {
                mealToRemove = meal; // Find the meal to remove
                break;
            }
        }
        if (mealToRemove != null) {
            totalCalories -= mealToRemove.getCalories(); // Deduct calories
            meals.remove(mealToRemove); // Remove the meal from the list
        } else {
            System.out.println("Meal not found: " + mealName);
        }
    }

    @Override
    public double getTotalCalories() {
        return totalCalories;
    }

    public void setCaloricGoal(double goal) {
        if (goal > 0) {
            this.caloricGoal = goal;
        } else {
            System.out.println("The daily caloric goal must be a positive value.");
        }
    }
    public void sendMealReminder() {
        if (totalCalories < caloricGoal) {
            System.out.println("Reminder: You need to eat more to reach your daily caloric goal!");
        } else {
            System.out.println("Congratulations! You've exceeded your daily caloric goal.");
        }
    }
    public void displayMealPlan() {
        System.out.println("Daily Meal Plan:");
        System.out.println("Daily Caloric Goal: " + caloricGoal + " calories");
        System.out.println("Total Caloric Intake: " + totalCalories + " calories");
    }
}

