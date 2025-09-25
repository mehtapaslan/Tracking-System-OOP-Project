// Membership class to manage user membership details
public class Membership {
    protected String membershipType; // Membership type
    protected double membershipFee; // Membership fee
    protected String startDate; // Membership start date
    protected String endDate; // Membership end date


    // Constructor
    public Membership(String membershipType){
        this.membershipType = membershipType;
    }
    public Membership(String membershipType, double membershipFee, String startDate, String endDate) {
        this.membershipType = membershipType; // Initialize membership type
        this.membershipFee = membershipFee; // Initialize membership fee
        this.startDate = startDate; // Initialize start date
        this.endDate = endDate; // Initialize end date
    }
    // Getters
    public String getMembershipType() {
        return membershipType;
    }

    public double getMembershipFee() {
        return membershipFee;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }
    // Method to display membership details
    public void displayMembershipDetails() {
        System.out.println("Membership Details:");
        System.out.println("Membership Type: " + membershipType);
        System.out.println("Membership Fee: " + membershipFee);
        System.out.println("Start Date: " + startDate);
        System.out.println("End Date: " + endDate);
    }
}