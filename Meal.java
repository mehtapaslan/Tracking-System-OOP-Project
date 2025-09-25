public class Meal {
    private String mealName; // Name of the meal
    private double calories; // Calories in the meal
    private String time; // Time of the meal

    // Constructor
    public Meal(String mealName, double calories, String time) {
        this.mealName = mealName;
        this.calories = calories;
        this.time = time;
    }

    // Getter for mealName
    public String getMealName() {
        return mealName;
    }

    // Setter for mealName
    public void setMealName(String mealName) {
        this.mealName = mealName;
    }

    // Getter for calories
    public double getCalories() {
        return calories;
    }

    // Setter for calories
    public void setCalories(double calories) {
        this.calories = calories;
    }
    // Getter for time
    public String getTime() {
        return time;
    }

    // Setter for time
    public void setTime(String time) {
        this.time = time;
    }
}
