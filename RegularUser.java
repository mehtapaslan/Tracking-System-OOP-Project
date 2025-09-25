public class RegularUser extends User {
    private Membership membership; // Membership instance

    // Constructor
    public RegularUser(String name, int age, double weight, double height, String gender, Membership membership) {
        super(name, age, weight, height, gender);
        this.membership = membership; // Initialize membership
    }
    public void displayRegularUserDetails() {
        System.out.println("--- Membership Details ---");
        if (membership != null) {
            membership.displayMembershipDetails();
        } else {
            System.out.println("No membership assigned.");
        }
    }
    @Override
    public void setProfile() {
        System.out.println("Regular user profile set for: " + getName());
    }

    @Override
    public void updateProfile() {
        System.out.println("Regular user profile updated for: " + getName());
    }

    @Override
    public double calculateBMI() {
        return weight / (height * height);
    }

    // Getter and Setter for Membership
    public Membership getMembership() {
        return membership;
    }

    public void setMembership(Membership membership) {
        this.membership = membership;
    }
}
