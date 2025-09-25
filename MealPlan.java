public interface MealPlan {
    // Method to add a meal to the meal plan
    void addMeal(String mealName, double calories);
    // Method to remove a meal from the meal plan
    void removeMeal(String mealName);
    // Method to get the total calories consumed for the day
    double getTotalCalories();
}