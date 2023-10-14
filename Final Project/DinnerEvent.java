// As of 10-11-23: Filename: DinnerEvent.java
// As of 10-11-23: Author: Sandi Cook
// As of 10-11-23: Date: October 11, 2023
// As of 10-11-23: Purpose: This class extends the Event class and represents dinner events 
// As of 10-11-23: catered by Yummy Catering. It adds functionality to store and retrieve meal 
// As of 10-11-23: choices for dinner events and calculates the total price based on the event 
// As of 10-11-23: type and meal choice.

public class DinnerEvent extends Event {
    private int mealChoice;

    // Constants for meal choices
    private static final String[] MEAL_CHOICES = {"Chicken", "Beef", "Vegetarian"};
    private static final double[] MEAL_PRICES = {25.0, 30.0, 22.0};

    // Default constructor
    public DinnerEvent() {
        // Initialize meal choice to 0 (Chicken)
        mealChoice = 0;
    }

    // As of 10-11-23: Method to set the meal choice
    public void setMealChoice(int mealChoice) {
        if (mealChoice >= 0 && mealChoice < MEAL_CHOICES.length) {
            this.mealChoice = mealChoice;
        } else {
            // If mealChoice is out of bounds, set it to 0 (Chicken)
            this.mealChoice = 0;
        }
    }

    // As of 10-11-23: Method to get the meal choice as a String
    public String getMealChoice() {
        return MEAL_CHOICES[mealChoice];
    }

    // As of 10-11-23: Method to calculate the total price of the dinner event
    public double calculateEventPrice() {
        double basePrice = getBasePrice();
        double mealPrice = MEAL_PRICES[mealChoice];
        return basePrice + mealPrice;
    }

    // As of 10-11-23: Method to calculate the base price based on the event type
    public double getBasePrice() {
        // Assuming the same prices as in the Event class
        double[] EVENT_PRICES = {40.0, 25.0, 20.0, 32.0, 50.0};
        if (getEventType() >= 0 && getEventType() < EVENT_PRICES.length) {
            return EVENT_PRICES[getEventType()];
        } else {
            // If eventType is out of bounds, return a default base price (e.g., 0.0)
            return 0.0;
        }
    }

    // As of 10-11-23: Other methods and constructors as needed
}
