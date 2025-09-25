public class ResetSettings {

    // Reset AppSettings to default
    public void resetAppSettings(AppSettings appSettings) {
        appSettings.setNotificationsEnabled(true); // Default: notifications enabled
        appSettings.setLanguage("en"); // Default: English
        appSettings.setTheme("light"); // Default: light theme
        System.out.println("App settings have been reset to default.");
    }

    // Reset UserSettings to default
    public void resetUserSettings(UserSettings userSettings) {
        userSettings.setProfilePublic(false); // Default: profile private
        userSettings.setDailyStepGoal(10000); // Default: 10,000 steps
        userSettings.setEnableHealthTracking(true); // Default: health tracking enabled
        System.out.println("User settings have been reset to default.");
    }

    // Reset NotificationSettings to default
    public void resetNotificationSettings(NotificationSettings notificationSettings) {
        notificationSettings.setEmailNotificationsEnabled(true); // Default: email notifications enabled
        notificationSettings.setPushNotificationsEnabled(true); // Default: push notifications enabled
        notificationSettings.setSmsNotificationsEnabled(false); // Default: SMS notifications disabled
        System.out.println("Notification settings have been reset to default.");
    }
}

