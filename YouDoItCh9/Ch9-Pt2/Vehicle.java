// Filename: Vehicle.java
// Written by Sandi Cook
// Written on September 20, 2023

/*
 * Purpose: Define the abstract Vehicle class.
 * Description: This abstract class represents a vehicle and contains data fields for power source, number of wheels, and price.
 * It also includes constructors and methods for setting and getting these values.
 */

public abstract class Vehicle 
{
    private String powerSource; // Data field for the power source of the vehicle
    private int wheels; // Data field for the number of wheels of the vehicle
    protected int price; // Data field for the price of the vehicle (protected to allow access by child classes)

    // Constructor for the Vehicle class that initializes powerSource and wheels
    public Vehicle(String powerSource, int wheels) 
    {
        setPowerSource(powerSource);
        setWheels(wheels);
        setPrice();
    }

    // Getter method for retrieving the power source of the vehicle
    public String getPowerSource() 
    {
        return powerSource;
    }

    // Getter method for retrieving the number of wheels of the vehicle
    public int getWheels() 
    {
        return wheels;
    }

    // Getter method for retrieving the price of the vehicle
    public int getPrice() 
    {
        return price;
    }

    // Setter method for setting the power source of the vehicle
    public void setPowerSource(String source) 
    {
        powerSource = source;
    }

    // Setter method for setting the number of wheels of the vehicle
    public void setWheels(int numWheels) 
    {
        wheels = numWheels;
    }

    // Abstract method for setting the price of the vehicle (to be implemented by child classes)
    public abstract void setPrice();
}
