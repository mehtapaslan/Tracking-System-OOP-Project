import java.util.Scanner;

public class MainSettings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instances of AppSettings, UserSettings, and NotificationSettings
        AppSettings appSettings = new AppSettings(true, "en", "light");
        UserSettings userSettings = new UserSettings(false, 10000, true);
        NotificationSettings notificationSettings = new NotificationSettings(true, true, false);
        ResetSettings resetSettings = new ResetSettings();

        while (true) {
            System.out.println("Settings Menu");
            System.out.println("1. View Settings");
            System.out.println("2. Update Settings");
            System.out.println("3. Reset Settings");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer

            switch (choice) {
                case 1:
                    // View all settings
                    System.out.println("\n");
                    appSettings.displaySettings();
                    System.out.println("\n");
                    userSettings.displaySettings();
                    System.out.println("\n");
                    notificationSettings.displaySettings();
                    System.out.println("\n");

                    break;

                case 2:
                    // Update settings
                    System.out.println("\nWhich settings do you want to update?");
                    System.out.println("1. App Settings");
                    System.out.println("2. User Settings");
                    System.out.println("3. Notification Settings");
                    System.out.print("Choose an option: ");
                    int updateChoice = scanner.nextInt();
                    scanner.nextLine(); // Clear the buffer

                    switch (updateChoice) {
                        case 1:
                            System.out.print("Enable notifications (true/false): ");
                            appSettings.setNotificationsEnabled(scanner.nextBoolean());
                            System.out.print("Set language (e.g., 'en', 'tr'): ");
                            appSettings.setLanguage(scanner.next());
                            System.out.print("Set theme (e.g., 'light', 'dark'): ");
                            appSettings.setTheme(scanner.next());
                            break;

                        case 2:
                            System.out.print("Make profile public (true/false): ");
                            userSettings.setProfilePublic(scanner.nextBoolean());
                            System.out.print("Set daily step goal: ");
                            userSettings.setDailyStepGoal(scanner.nextInt());
                            System.out.print("Enable health tracking (true/false): ");
                            userSettings.setEnableHealthTracking(scanner.nextBoolean());
                            break;

                        case 3:
                            System.out.print("Enable email notifications (true/false): ");
                            notificationSettings.setEmailNotificationsEnabled(scanner.nextBoolean());
                            System.out.print("Enable push notifications (true/false): ");
                            notificationSettings.setPushNotificationsEnabled(scanner.nextBoolean());
                            System.out.print("Enable SMS notifications (true/false): ");
                            notificationSettings.setSmsNotificationsEnabled(scanner.nextBoolean());
                            break;

                        default:
                            System.out.println("Invalid choice.");
                    }
                    break;

                case 3:
                    // Reset settings
                    System.out.println("\nWhich settings do you want to reset?");
                    System.out.println("1. App Settings");
                    System.out.println("2. User Settings");
                    System.out.println("3. Notification Settings");
                    System.out.println("4. All Settings");
                    System.out.print("Choose an option: ");
                    int resetChoice = scanner.nextInt();

                    switch (resetChoice) {
                        case 1:
                            resetSettings.resetAppSettings(appSettings);
                            break;
                        case 2:
                            resetSettings.resetUserSettings(userSettings);
                            break;
                        case 3:
                            resetSettings.resetNotificationSettings(notificationSettings);
                            break;
                        case 4:
                            resetSettings.resetAppSettings(appSettings);
                            resetSettings.resetUserSettings(userSettings);
                            resetSettings.resetNotificationSettings(notificationSettings);
                            break;
                        default:
                            System.out.println("Invalid choice.");
                    }
                    break;

                case 4:
                    // Exit program
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}