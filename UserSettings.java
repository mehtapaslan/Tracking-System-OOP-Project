public class UserSettings extends Settings {
    private boolean isProfilePublic;
    private int dailyStepGoal;
    private boolean enableHealthTracking;

    public UserSettings(boolean isProfilePublic, int dailyStepGoal, boolean enableHealthTracking) {
        super("User Settings");
        this.isProfilePublic = isProfilePublic;
        this.dailyStepGoal = dailyStepGoal;
        this.enableHealthTracking = enableHealthTracking;
    }

    public boolean isProfilePublic() {
        return isProfilePublic;
    }

    public void setProfilePublic(boolean profilePublic) {
        isProfilePublic = profilePublic;
    }

    public int getDailyStepGoal() {
        return dailyStepGoal;
    }

    public void setDailyStepGoal(int dailyStepGoal) {
        this.dailyStepGoal = dailyStepGoal;
    }

    public boolean isEnableHealthTracking() {
        return enableHealthTracking;
    }

    public void setEnableHealthTracking(boolean enableHealthTracking) {
        this.enableHealthTracking = enableHealthTracking;
    }

    @Override
    public void displaySettings() {
        System.out.println("Settings Name: " + getSettingsName());
        System.out.println("Profile Public: " + (isProfilePublic ? "Yes" : "No"));
        System.out.println("Daily Step Goal: " + dailyStepGoal);
        System.out.println("Health Tracking: " + (enableHealthTracking ? "Enabled" : "Disabled"));
    }
}
