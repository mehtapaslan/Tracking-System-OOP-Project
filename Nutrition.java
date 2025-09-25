public class Nutrition extends Meal {
    private double protein;
    private double carbs;
    private double fats;

    // Constructor that extends Meal and adds nutritional information
    public Nutrition(String mealName, double calories, String time, double protein, double carbs, double fats) {
        super(mealName, calories, time); // Call the parent constructor (Meal)
        setProtein(protein);
        setCarbs(carbs);
        setFats(fats);
    }

    // Getters and Setters for nutritional content
    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        if (protein < 0) {
            throw new IllegalArgumentException("Protein content cannot be negative.");
        }
        this.protein = protein;
    }

    public double getCarbs() {
        return carbs;
    }

    public void setCarbs(double carbs) {
        if (carbs < 0) {
            throw new IllegalArgumentException("Carbohydrate content cannot be negative.");
        }
        this.carbs = carbs;
    }

    public double getFats() {
        return fats;
    }

    public void setFats(double fats) {
        if (fats < 0) {
            throw new IllegalArgumentException("Fat content cannot be negative.");
        }
        this.fats = fats;
    }

    // Overriding the toString method to include nutritional information
    @Override
    public String toString() {
        return "\nNutritional Info: " +
                "\nProtein: " + protein + "g, " +
                "\nCarbs: " + carbs + "g, " +
                "\nFats: " + fats + "g, ";
    }
}