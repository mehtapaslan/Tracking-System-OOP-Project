import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HeartRate {
    private int heartRate; // Current heart rate in beats per minute (BPM)
    private LocalDateTime measurementTime; // Date and time of the heart rate measurement

    public HeartRate(int heartRate, LocalDateTime measurementTime) {
        setHeartRate(heartRate); // Use setter for validation
        this.measurementTime = measurementTime;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        if (heartRate < 0) {
            throw new IllegalArgumentException("Heart rate must be a non-negative value.");
        }
        this.heartRate = heartRate;
    }

    public LocalDateTime getMeasurementTime() {
        return measurementTime;
    }

    public void displayHeartRateInfo() {
        // Define the desired date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy HH:mm:ss");

        // Format the measurement time
        String formattedTime = measurementTime.format(formatter);

        System.out.println("Heart Rate Record:");
        System.out.println("Heart Rate: " + heartRate + " BPM");
        System.out.println("Measurement Time: " + formattedTime);
    }

    @Override
    public String toString() {
        return "HeartRate{" +
                "heartRate=" + heartRate +
                ", measurementTime=" + measurementTime +
                '}';
    }
}