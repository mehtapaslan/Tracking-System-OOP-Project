public class StepCounter {
    private int stepsTaken; // Number of steps taken
    private int dailyStepGoal; // Daily step goal

    // Constructor to initialize StepCounter with a step goal
    public StepCounter(int dailyStepGoal) {
        this.dailyStepGoal = dailyStepGoal;
        this.stepsTaken = 0; // Start with 0 steps
    }

    // Method to add steps
    public void addSteps(int steps) {
        if (steps > 0) {
            stepsTaken += steps;
        } else {
            System.out.println("Invalid step count. Steps must be positive.");
        }
    }

    // Method to reset the steps taken for the new day
    public void resetSteps() {
        stepsTaken = 0;
    }

    // Method to get the current number of steps taken
    public int getStepsTaken() {
        return stepsTaken;
    }

    // Method to get the daily step goal
    public int getDailyStepGoal() {
        return dailyStepGoal;
    }

    // Method to check if the step goal has been reached
    public boolean isGoalAchieved() {
        return stepsTaken >= dailyStepGoal;
    }

    // Method to display the current step status
    public void displayStepStatus() {
        System.out.println("Steps Taken: " + stepsTaken);
        System.out.println("Daily Step Goal: " + dailyStepGoal);
        System.out.println("Goal Achieved: " + (isGoalAchieved() ? "Yes" : "No"));
    }
}