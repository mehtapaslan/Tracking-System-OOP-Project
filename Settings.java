public abstract class Settings {
    private String settingsName;

    public Settings(String settingsName) {
        this.settingsName = settingsName;
    }

    public String getSettingsName() {
        return settingsName;
    }

    public void setSettingsName(String settingsName) {
        this.settingsName = settingsName;
    }

    public abstract void displaySettings();
}
