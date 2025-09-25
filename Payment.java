import java.time.LocalDate;

public class Payment extends Membership {
    private String paymentMethod; // Payment method (e.g., Credit Card, PayPal)

    // Constructor
    public Payment(String membershipType, String paymentMethod) {
        super(membershipType, 0.0, LocalDate.now().toString(), ""); // Varsayılan değerlerle Membership başlat
        this.paymentMethod = paymentMethod;
        setMembershipDetails();
    }

    // Setter for membership details based on membership type
    private void setMembershipDetails() {
        boolean valid = false;

        // Continue until a valid membership type is provided
        while (!valid) {
            switch (this.membershipType.toLowerCase()) {
                case "gold":
                    this.membershipFee = 300.0;
                    this.endDate = LocalDate.now().plusMonths(12).toString();
                    valid = true;
                    break;
                case "silver":
                    this.membershipFee = 200.0;
                    this.endDate = LocalDate.now().plusMonths(6).toString();
                    valid = true;
                    break;
                case "bronze":
                    this.membershipFee = 100.0;
                    this.endDate = LocalDate.now().plusMonths(3).toString();
                    valid = true;
                    break;
                default:
                    System.out.println("Invalid membership type. Please enter 'Gold', 'Silver', or 'Bronze'.");
                    // If an invalid type is entered, return and allow retry
                    return; // Exit the method and trigger a re-call for correct input
            }
        }
    }

        // Method to display payment details
        @Override
        public void displayMembershipDetails () {
            super.displayMembershipDetails();
            System.out.println("Payment Method: " + paymentMethod);
        }
}
