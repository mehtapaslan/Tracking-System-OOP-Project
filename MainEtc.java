import java.time.LocalDateTime;
import java.util.Scanner;

public class MainEtc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a Notification object
        System.out.print("Do you want to read the notification? (yes/no): ");
        String userInput = scanner.nextLine();
        Notification notification = new Notification("New Message", "This is a new notification.", LocalDateTime.now());
        if (userInput.equalsIgnoreCase("yes")) {
            notification.markAsRead(); // Mark the notification as read
        } else if (userInput.equalsIgnoreCase("no")) {
            System.out.println("You chose not to read the notification.");
        } else {
            System.out.println("Invalid input. Please enter 'yes' or 'no'.");
        } notification.displayNotification();

        // Create a weather integration
        System.out.print("\nEnter your location: "); // Get user location
        String location = scanner.nextLine(); // Ensure this reads the full line
        WeatherIntegration weatherIntegration = new WeatherIntegration();
        String currentWeatherInfo = weatherIntegration.getCurrentWeather(location); // Get current weather information
        System.out.println(currentWeatherInfo);
        String workoutRecommendations = weatherIntegration.getWorkoutRecommendations(); // Get workout recommendations
        System.out.println(workoutRecommendations);

        //Create an advertisement system
        System.out.print("\nEnter your membership type (Gold/Silver/Bronze): "); // Get membership type from the user
        String membershipType = scanner.nextLine();
        Membership membership = new Membership(membershipType);// Create Membership object
        AdManager adManager = new AdManager(membership);// Create AdManager and display ads
        adManager.displayAds();

        //Create a payment method
        System.out.print("\nEnter payment method (e.g., Credit Card, PayPal): ");
        String paymentMethod = scanner.nextLine();  // User input for payment method
        // Create a Payment object with membership type and payment method
        Payment payment = new Payment(membershipType, paymentMethod);
        payment.displayMembershipDetails();

        // Create a mindfulness system
        System.out.print("\nEnter the number of mindfulness sessions: ");
        int numSessions = Integer.parseInt(scanner.nextLine());
        Mindfulness[] sessions = new Mindfulness[numSessions];
        for (int i = 0; i < numSessions; i++) {
            // Loop through to get user input for each session
            System.out.print("Enter activity type (e.g., Meditation): ");
            String activityType = scanner.nextLine();
            System.out.print("Enter duration in minutes: ");
            double duration = Double.parseDouble(scanner.nextLine());
            sessions[i] = new Mindfulness(activityType, duration);
            sessions[i].trackMindfulness(); // Track each session
        } double totalTime = Mindfulness.calculateTotalMindfulnessTime(sessions);
        System.out.println("Total Mindfulness Time: " + totalTime + " minutes");

        //Create a step counter
        System.out.print("\nEnter your daily step goal: ");
        int dailyStepGoal = scanner.nextInt();
        StepCounter stepCounter = new StepCounter(dailyStepGoal);
        while (true) {// Loop for adding steps
            System.out.print("Enter the number of steps to add (or -1 to exit): ");
            int steps = scanner.nextInt();
            if (steps == -1) {// Exit condition
                break; }
            stepCounter.addSteps(steps);// Add steps
            stepCounter.displayStepStatus();}

        // Create a progress system
        System.out.print("\nEnter the total number of tasks: ");
        int totalTasks = scanner.nextInt();
        ProgressPercentage progress = new ProgressPercentage(totalTasks);
        System.out.print("Enter the number of completed tasks: ");
        int completedTasks = scanner.nextInt();
        try {
            progress.updateCompletedTasks(completedTasks);
            progress.displayProgress(); // Display the current progress
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());}
        System.out.println();

        // Create a heart rate measurement
        int heartRate = 75; // Hardcoded heart rate value
        LocalDateTime measurementTime = LocalDateTime.now(); // Current time for measurement
        HeartRate heartRateMeasurement = new HeartRate(heartRate, measurementTime);
        heartRateMeasurement.displayHeartRateInfo(); // Display heart rate info

        scanner.close();
        System.out.println("Exiting the program...");
    }
}

