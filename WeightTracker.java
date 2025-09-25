import java.util.ArrayList;
import java.util.List;

public class WeightTracker extends Tracker {
    private List<Double> weightHistory; // Stores the weight history
    private double height; // User's height in meters
    protected double weight; // User's weight in kilograms
    private double targetWeight; // User's target weight in kilograms

    // Constructor
    public WeightTracker(String description, double height) {
        super(description);
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be greater than zero.");
        }
        this.height = height;
        this.weightHistory = new ArrayList<>();
    }

    // Adds a weight entry to the history
    public void addWeightEntry(double weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Weight must be greater than zero.");
        }
        weightHistory.add(weight);
        System.out.println("Weight entry added: " + weight + " kg");
    }
    // Calculates the BMI (Body Mass Index)
    public double calculateBMI() {
        // Check if height is greater than 0 and weight is positive
        if (height > 0 && weight > 0) {
            // Convert height from cm to meters
            double heightInMeters = height / 100.0;
            // Calculate and return the Body Mass Index (BMI)
            return weight / (heightInMeters * heightInMeters);
        } else {
            throw new IllegalArgumentException("Height and weight must be greater than 0");
        }
    }

    // Sets the target weight
    public void setTargetWeight(double targetWeight) {
        if (targetWeight <= 0) {
            throw new IllegalArgumentException("Target weight must be greater than zero.");
        }
        this.targetWeight = targetWeight;
        System.out.println("Target weight set to: " + targetWeight + " kg");
    }

    // Getter for target weight
    public double getTargetWeight() {
        return targetWeight;
    }

    // Display details of the weight tracker
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Height: " + height + " m");
        System.out.println("Weight History: " + weightHistory);
        System.out.println("Target Weight: " + targetWeight + " kg");
        if (!weightHistory.isEmpty()) {
            System.out.println("Latest BMI: " + String.format("%.2f", calculateBMI()));
        }
    }

    // Override the abstract method to track activity
    @Override
    public void track() {
        System.out.println("Tracking weight...");
        displayDetails();
    }
}