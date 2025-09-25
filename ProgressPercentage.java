public class ProgressPercentage {
    private int totalTasks;
    private int completedTasks;

    // Constructor
    public ProgressPercentage(int totalTasks) {
        if (totalTasks <= 0) {
            throw new IllegalArgumentException("Total tasks must be greater than zero.");
        }
        this.totalTasks = totalTasks;
        this.completedTasks = 0;
    }

    // Method to update completed tasks
    public void updateCompletedTasks(int completed) {
        if (completed < 0 || completed > totalTasks) {
            throw new IllegalArgumentException("Completed tasks must be between 0 and total tasks.");
        }
        this.completedTasks = completed;
    }

    // Method to calculate progress percentage
    public double calculateProgress() {
        return ((double) completedTasks / totalTasks) * 100;
    }

    // Method to display progress percentage
    public void displayProgress() {
        System.out.printf("Progress: %.2f%% (%d/%d tasks completed)%n", calculateProgress(), completedTasks, totalTasks);
    }

    // Getters and Setters
    public int getTotalTasks() {
        return totalTasks;
    }

    public void setTotalTasks(int totalTasks) {
        if (totalTasks <= 0) {
            throw new IllegalArgumentException("Total tasks must be greater than zero.");
        }
        this.totalTasks = totalTasks;
    }

    public int getCompletedTasks() {
        return completedTasks;
    }

    public void setCompletedTasks(int completedTasks) {
        updateCompletedTasks(completedTasks);
    }
}
