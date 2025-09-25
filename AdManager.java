public class AdManager {
    private Membership membership; // Membership object to determine user type
    private String[] silverAds; // Array to store Silver ads
    private String[] bronzeAds; // Array to store Bronze ads
    private String[] commonAds; // Array to store common ads for all memberships

    public AdManager(Membership membership) {
        this.membership = membership;
        this.silverAds = new String[]{
                "Exclusive Silver member offer: 15% off on all products!",
                "Silver members get priority customer support!",
                "Upgrade to Gold and enjoy better perks!"
        };
        this.bronzeAds = new String[]{
                "Bronze member special: Free month trial on selected services!",
                "Upgrade to Silver and enjoy better perks!"
        };
        this.commonAds = new String[]{
                "Get 20% off your first month of membership!",
                "Join now and get a free personal training session!"
        };
    }

    // Method to display ads based on membership type
    public void displayAds() {
        System.out.println("Advertisements for you:");

        // Display ads based on membership type
        if (membership.getMembershipType().equalsIgnoreCase("Gold")) {
            System.out.println("Thank you for being a Gold member! Enjoy an ad-free experience.");
        } else {
            // Show common ads for all memberships
            for (String ad : commonAds) {
                System.out.println("- " + ad);
            }

            // Show specific ads based on membership type
            if (membership.getMembershipType().equalsIgnoreCase("Silver")) {
                for (String ad : silverAds) {
                    System.out.println("- " + ad);
                }
            } else if (membership.getMembershipType().equalsIgnoreCase("Bronze")) {
                for (String ad : bronzeAds) {
                    System.out.println("- " + ad);
                }
            }
        }
    }
}