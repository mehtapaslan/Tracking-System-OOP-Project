public class AppSettings extends Settings {
    private boolean notificationsEnabled;
    private String language; // Example: "en", "tr"
    private String theme; // Example: "dark", "light"

    public AppSettings(boolean notificationsEnabled, String language, String theme) {
        super("App Settings");
        this.notificationsEnabled = notificationsEnabled;
        this.language = language;
        this.theme = theme;
    }

    public boolean isNotificationsEnabled() {
        return notificationsEnabled;
    }

    public void setNotificationsEnabled(boolean notificationsEnabled) {
        this.notificationsEnabled = notificationsEnabled;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    @Override
    public void displaySettings() {
        System.out.println("Settings Name: " + getSettingsName());
        System.out.println("Notifications: " + (notificationsEnabled ? "Enabled" : "Disabled"));
        System.out.println("Language: " + language);
        System.out.println("Theme: " + theme);
    }
}

