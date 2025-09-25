import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DailyFitnessPlan implements FitnessPlan {
    private List<Fitness> activities; // List of Fitness activities
    private double totalWorkoutDuration; // Total workout duration
    private double totalCaloriesBurned; // Total calories burned
    private double dailyWorkoutGoal; // Daily workout goal
    private Map<String, Double> workoutLog; // Daily workout log

    public DailyFitnessPlan() {
        this.activities = new ArrayList<>();
        this.totalWorkoutDuration = 0.0;
        this.totalCaloriesBurned = 0.0;
        this.dailyWorkoutGoal = 0.0;
        this.workoutLog = new HashMap<>();
    }

    @Override
    public List<String> getActivities() {
        List<String> activityNames = new ArrayList<>();
        for (Fitness activity : activities) {
            activityNames.add(activity.getActivity());
        }
        return activityNames;
    }

    @Override
    public void logWorkout(String activityType, double duration, double caloriesBurned) {
        if (duration > 0 && caloriesBurned > 0) {
            // Create a new Fitness object
            Fitness newActivity = new Fitness(activityType, duration);
            // Add the activity to the list
            activities.add(newActivity);

            // Update total duration and calories burned
            totalWorkoutDuration += duration; // Convert from hours to minutes and add
            totalCaloriesBurned += caloriesBurned;

            // Update daily workout log
            String currentDate = java.time.LocalDate.now().toString();
            workoutLog.put(currentDate, workoutLog.getOrDefault(currentDate, 0.0) + duration * 60); // Store in minutes
        } else {
            System.out.println("Workout duration and calories burned must be positive values.");
        }
    }

    @Override
    public double getTotalWorkoutDuration() {
        return totalWorkoutDuration;
    }

    @Override
    public double getTotalCaloriesBurned() {
        return totalCaloriesBurned;
    }

    public void setDailyWorkoutGoal(double goal) {
        if (goal > 0) {
            this.dailyWorkoutGoal = goal;
        } else {
            System.out.println("The daily workout goal must be a positive value.");
        }
    }

    public void sendFitnessReminder() {
        if (totalWorkoutDuration < dailyWorkoutGoal) {
            System.out.println("Reminder: You need to do more exercise to reach your daily workout goal!");
        } else {
            System.out.println("Congratulations! You've exceeded your daily workout goal.");
        }
    }

    public void displayFitnessActivity() {
        System.out.println("Daily Fitness Activity Plan:");
        System.out.println("Goal: " + dailyWorkoutGoal + " minutes");
        System.out.println("Total Workout Duration: " + totalWorkoutDuration + " minutes");
        System.out.println("Total Calories Burned: " + totalCaloriesBurned + " calories");
    }
}
