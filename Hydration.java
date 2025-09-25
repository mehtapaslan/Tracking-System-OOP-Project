public class Hydration {
    private double amount; // Water intake in liters
    private String time; // Time of the hydration record

    // Constructor
    public Hydration(double amount, String time) {
        this.amount = amount;
        this.time = time;
    }

    // Getter for amount
    public double getAmount() {
        return amount;
    }

    // Setter for amount
    public void setAmount(double amount) {
        this.amount = amount;
    }

    // Getter for time
    public String getTime() {
        return time;
    }

    // Setter for time
    public void setTime(String time) {
        this.time = time;
    }
}

