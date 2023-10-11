// Car.java
// Written by Sandra Cook
// Written on: September 15, 2023

// A class representing a Car
public class Car {
    private int year;
    private Model model;
    private Color color;

    // Constructor to initialize Car object
    public Car(int yr, Model m, Color c) {
        year = yr;
        model = m;
        color = c;
    }

    // Display method to show car details
    public void display() {
        System.out.println("Car is a " + year + " " + color + " " + model);
    }
}
