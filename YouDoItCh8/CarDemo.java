// CarDemo.java
// Written by Sandra Cook
// Written on: September 15, 2023

// A demonstration program for the Car class
public class CarDemo {
    public static void main(String[] args) {
        // Create two Car objects with different attributes
        Car firstCar = new Car(2021, Model.MINIVAN, Color.BLUE);
        Car secondCar = new Car(2024, Model.CONVERTIBLE, Color.RED);

        // Display information about the cars
        firstCar.display();
        secondCar.display();
    }
}
