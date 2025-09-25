import java.util.List;
public interface FitnessPlan {

    List<String> getActivities();

    // Method to log a workout session
    void logWorkout(String activityType, double duration, double caloriesBurned);

    // Method to get the total duration of workouts for the day
    double getTotalWorkoutDuration();

    // Method to get the total calories burned for the day
    double getTotalCaloriesBurned();
}