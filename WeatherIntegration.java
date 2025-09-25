import java.util.Random;
public class WeatherIntegration {

    // Mocked weather data for demonstration purposes
    private String currentWeather;
    private double temperature;

    // Constructor
    public WeatherIntegration() {
        // Initialize with default weather data
        this.currentWeather = "Sunny";
        this.temperature = 25.0; // Default temperature in Celsius
    }
    public String getCurrentWeather(String location) {
        // Simulated weather data based on the location
        simulateWeather(location);
        return String.format("Current weather in %s: %s with a temperature of %.1f°C.", location, currentWeather, temperature);
    }
    public String getWorkoutRecommendations() {
        StringBuilder recommendations = new StringBuilder();

        switch (currentWeather.toLowerCase()) {
            case "sunny":
                recommendations.append("The ideal time for outdoor workouts is early morning or late evening to avoid high temperatures.\n");
                recommendations.append("Recommended activities: Running, cycling, or a light jog.");
                break;
            case "cloudy":
                recommendations.append("The ideal time for outdoor workouts is early morning or late evening.\n");
                recommendations.append("Recommended activities: Hiking or walking in a park.");
                break;
            case "rainy":
            case "stormy":
                recommendations.append("It's best to stay indoors today. Consider yoga or gym workouts.");
                break;
            default:
                recommendations.append("Check the weather later for better outdoor workout opportunities.");
                break;
        }

        return recommendations.toString();
    }

    // Simulates weather conditions for demonstration
    private void simulateWeather(String location) {
        String[] weatherConditions = {"Sunny", "Cloudy", "Rainy", "Stormy"};
        Random random = new Random();
        currentWeather = weatherConditions[random.nextInt(weatherConditions.length)];
        temperature = 15 + random.nextDouble() * 15; // Random temperature between 15°C and 30°C
    }

    @Override
    public String toString() {
        return String.format("WeatherIntegration{currentWeather='%s', temperature=%.1f}", currentWeather, temperature);
    }
}