import java.util.ArrayList;
import java.util.List;

public class DailyYogaPlan implements YogaPlan {
    private List<Yoga> yogaSessions; // List to store Yoga session objects
    private double dailyYogaGoal; // Daily yoga practice goal in minutes
    private double totalYogaDuration; // Total duration of yoga sessions in minutes
    private String meditationLevel; // Meditation level description

    public DailyYogaPlan() {
        this.yogaSessions = new ArrayList<>();
        this.dailyYogaGoal = 0;
        this.totalYogaDuration = 0;
        this.meditationLevel = "Unknown";
    }

    @Override
    public List<String> getSessionDetails() {
        List<String> sessionDetails = new ArrayList<>();
        for (Yoga session : yogaSessions) {
            sessionDetails.add(session.getYogaType() + " - " + session.getDuration() + " minutes");
        }
        return sessionDetails;
    }

    public void setDailyYogaGoal(double goal) {
        if (goal > 0) {
            this.dailyYogaGoal = goal;
        } else {
            System.out.println("Yoga goal must be positive.");
        }
    }
    public void logYogaSession(String yogaType, double duration) {
        if (duration > 0) {
            Yoga newSession = new Yoga(duration, yogaType); // Create a new Yoga session object
            yogaSessions.add(newSession); // Add to the list
            totalYogaDuration += duration; // Update total duration
        } else {
            System.out.println("Yoga session duration must be positive.");
        }
    }

    @Override
    public String getMeditationLevel() {
        if (totalYogaDuration >= dailyYogaGoal) {
            meditationLevel = "Advanced";
        } else if (totalYogaDuration >= dailyYogaGoal * 0.75) {
            meditationLevel = "Intermediate";
        } else {
            meditationLevel = "Beginner";
        }
        return meditationLevel;
    }

    public void sendYogaReminder() {
        if (totalYogaDuration < dailyYogaGoal) {
            System.out.println("Reminder: Your daily yoga goal is " + dailyYogaGoal + " minutes. Keep practicing!");
        } else {
            System.out.println("Congratulations! You've reached your daily yoga goal.");
        }
    }
    public void displayYogaSessions () {
        System.out.println("Daily Yoga Sessions:");
        System.out.println("Daily Yoga Goal: " + dailyYogaGoal + " minutes");
        System.out.println("Total Yoga Duration: " + totalYogaDuration + " minutes");
        System.out.println("Meditation Level: " + meditationLevel);
        }
    }
