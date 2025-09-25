public class AdminUser extends User {
    private String adminLevel;

    public AdminUser(String name, int age, double weight, double height, String gender, String adminLevel) {
        super(name, age, weight, height, gender);
        this.adminLevel = adminLevel;
    }

    @Override
    public void setProfile() {
        // Setting up admin profile
        System.out.println("Admin profile set: " + name);
    }

    @Override
    public void updateProfile() {
        // Updating admin profile
        System.out.println("Admin profile updated: " + name);
    }

    @Override
    public double calculateBMI() {
        return weight / (height * height);
    }

    public String getAdminLevel() {
        return adminLevel;
    }

    public void setAdminLevel(String adminLevel) {
        this.adminLevel = adminLevel;
    }
}
