//Filename: Sandwich.java
// Written by Sandi Cook
// Written on September 3, 2023

/*
* Purpose: Represents a sandwich with attributes for the main ingredient, bread type, and price.
* Provides methods to get and set values for each of these attributes.
*/
public class Sandwich 
{
    private String mainIngredient;
    private String breadType;
    private double price;

    // Default constructor
   // public Sandwich() {}

    // Getters and Setters for mainIngredient
    public String getMainIngredient() 
    {
        return mainIngredient;
    }

    public void setMainIngredient(String mainIngredient) 
    {
        this.mainIngredient = mainIngredient;
    }

    // Getters and Setters for breadType
    public String getBreadType() 
    {
        return breadType;
    }

    public void setBreadType(String breadType) 
    {
        this.breadType = breadType;
    }

    // Getters and Setters for price
    public double getPrice() 
    {
        return price;
    }

    public void setPrice(double price) 
    {
        this.price = price;
    }
}
