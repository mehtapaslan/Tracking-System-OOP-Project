public class NotificationSettings extends Settings {
    private boolean emailNotificationsEnabled;
    private boolean pushNotificationsEnabled;
    private boolean smsNotificationsEnabled;

    public NotificationSettings(boolean emailNotificationsEnabled, boolean pushNotificationsEnabled, boolean smsNotificationsEnabled) {
        super("Notification Settings");
        this.emailNotificationsEnabled = emailNotificationsEnabled;
        this.pushNotificationsEnabled = pushNotificationsEnabled;
        this.smsNotificationsEnabled = smsNotificationsEnabled;
    }

    public boolean isEmailNotificationsEnabled() {
        return emailNotificationsEnabled;
    }

    public void setEmailNotificationsEnabled(boolean emailNotificationsEnabled) {
        this.emailNotificationsEnabled = emailNotificationsEnabled;
    }

    public boolean isPushNotificationsEnabled() {
        return pushNotificationsEnabled;
    }

    public void setPushNotificationsEnabled(boolean pushNotificationsEnabled) {
        this.pushNotificationsEnabled = pushNotificationsEnabled;
    }

    public boolean isSmsNotificationsEnabled() {
        return smsNotificationsEnabled;
    }

    public void setSmsNotificationsEnabled(boolean smsNotificationsEnabled) {
        this.smsNotificationsEnabled = smsNotificationsEnabled;
    }

    @Override
    public void displaySettings() {
        System.out.println("Settings Name: " + getSettingsName());
        System.out.println("Email Notifications: " + (emailNotificationsEnabled ? "Enabled" : "Disabled"));
        System.out.println("Push Notifications: " + (pushNotificationsEnabled ? "Enabled" : "Disabled"));
        System.out.println("SMS Notifications: " + (smsNotificationsEnabled ? "Enabled" : "Disabled"));
    }
}
