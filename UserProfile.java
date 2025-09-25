public class UserProfile extends User {
    private String profilePicture; // User's profile picture
    private String email; // User's email address
    private String phoneNumber; // User's phone number

    // Constructor
    public UserProfile(String name, int age, double weight, double height, String gender, String profilePicture, String email, String phoneNumber) {
        super(name, age, weight, height, gender); // Call the constructor of the superclass (User )
        this.profilePicture = profilePicture; // Initialize profile picture
        this.email = email; // Initialize email
        this.phoneNumber = phoneNumber; // Initialize phone number
    }

    @Override
    public void setProfile() {
        // Set up the user profile
        System.out.println("User  profile set for: " + getName());
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Profile Picture: " + profilePicture);
    }
    @Override
    public void updateProfile() {
        // Update the user profile
        System.out.println("User  profile updated for: " + getName());
        // Here you could add logic to update email or phone number
    }

    @Override
    public double calculateBMI() {
        // Check if height is greater than 0 and weight is positive
        if (height > 0 && weight > 0) {
            // Convert height from cm to meters
            double heightInMeters = height / 100.0;
            // Calculate and return the Body Mass Index (BMI)
            return weight / (heightInMeters * heightInMeters);
        } else {
            throw new IllegalArgumentException("Height and weight must be greater than 0");
        }
    }

    public void displayProfile() {
        System.out.println("User Profile Details:");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Gender: " + getGender());
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Profile Picture: " + profilePicture);
        System.out.printf("BMI: %.2f%n", calculateBMI());
    }
}