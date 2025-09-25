import java.util.Scanner;

public class MainUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an admin user
        AdminUser adminUser = new AdminUser("James", 35, 65, 160, "Male", "SuperAdmin");
        adminUser.setProfile(); // Set admin profile
        System.out.println("Admin Level: " + adminUser.getAdminLevel());

        // Create a user profile
        System.out.print("\nEnter your name: ");// Get user input
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Enter your weight (kg): ");
        double weight = scanner.nextDouble();
        System.out.print("Enter your height (cm): ");
        double height = scanner.nextDouble();
        scanner.nextLine(); // Clear the newline character
        System.out.print("Enter your gender (Male/Female): ");
        String gender = scanner.nextLine();
        System.out.print("Enter your profile picture URL or description: ");
        String picture = scanner.nextLine();
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();
        System.out.print("Enter your phone number: ");
        String phone = scanner.nextLine();
        UserProfile user = new UserProfile(name, age, weight, height, gender, picture, email, phone);// Create the user profile
        user.displayProfile();// Display user's information

        //Create a regular user
        System.out.print("\nEnter your membership type (Gold/Silver/Bronze): ");
        String membershipType = scanner.nextLine();
        System.out.print("Enter your membership fee: ");
        double membershipFee = scanner.nextDouble();
        scanner.nextLine(); // Clear the newline character
        System.out.print("Enter membership start date (yyyy-mm-dd): ");
        String startDate = scanner.nextLine();
        System.out.print("Enter membership end date (yyyy-mm-dd): ");
        String endDate = scanner.nextLine();
        Membership membership = new Membership(membershipType, membershipFee, startDate, endDate);// Create a Membership instance
        RegularUser regularUser = new RegularUser(name, age, weight, height, gender, membership);// Create a RegularUser instance
        regularUser.getMembership().displayMembershipDetails();

        //Create a user achievement
        UserAchievement userAchievement = new UserAchievement(regularUser ); // Create UserAchievement instance
        while (true) {
            System.out.print("Enter an achievement to add (or type 'exit' to finish): ");
            String achievement = scanner.nextLine();
            if (achievement.equalsIgnoreCase("exit")) {
                break; // Exit condition
            }
            userAchievement.addAchievement(achievement);
        }userAchievement.listAchievements();

        //Create a reward system
        RewardSystem rewardSystem = new RewardSystem(); // Create RewardSystem instance
        System.out.print("Enter the number of steps taken today: ");// Prompt user to track the number of steps taken
        int steps = scanner.nextInt();
        rewardSystem.trackSteps(steps); // Track steps
        System.out.print("Enter the calories consumed today: ");// Prompt user to track calories consumed
        int calories = scanner.nextInt();
        rewardSystem.trackCalories(calories); // Track calories
        System.out.print("Enter the workout time in minutes: ");// Prompt user to track workout time
        int workoutMinutes = scanner.nextInt();
        rewardSystem.trackWorkout(workoutMinutes); // Track workout time
        rewardSystem.displayRewards(); // Display rewards

        //Create a user history
        UserHistory userHistory = new UserHistory(name); // Create UserHistory instance
        while (true) {
            System.out.print("Enter an activity to add (or type 'exit' to finish): ");
            String activity = scanner.nextLine();
            if (activity.equalsIgnoreCase("exit")) {
                break; // Exit condition
            }
            userHistory.addActivity(activity); // Add activity to user history
        }
        userHistory.displayHistory(); // Display all activities
        userHistory.displaySummary(); // Display summary of user history

        // Create a community
        System.out.print("\nEnter the name of the community: ");
        Community myCommunity = new Community(scanner.nextLine());
        while (true) {
            try {
                System.out.print("\n1.Add Member  2.Remove Member  3.Add Post  4.View Members  5.View Posts  6.Exit\nChoose: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Clean up newline after reading integer

                if (choice == 6) break;

                switch (choice) {
                    case 1 -> {
                        System.out.print("Member name: ");
                        myCommunity.addMember(scanner.nextLine());
                    }
                    case 2 -> {
                        System.out.print("Member to remove: ");
                        myCommunity.removeMember(scanner.nextLine());
                    }
                    case 3 -> {
                        System.out.print("Post content: ");
                        myCommunity.addPost(scanner.nextLine());
                    }
                    case 4 -> myCommunity.displayMembers();
                    case 5 -> myCommunity.displayPosts();
                    default -> System.out.println("Invalid choice, try again.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input, please try again.");
                scanner.nextLine(); // Clear the buffer to prevent infinite loop on invalid input
            }
        }
        scanner.close();
        System.out.println("Exiting the program...");
    }
}
