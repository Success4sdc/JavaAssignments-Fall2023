// Filename: Animal.java
// Written by Sandi Cook
// Written on September 20, 2023
/*
 * Purpose: Define the abstract Animal class.
 * Description: This abstract class represents an animal and includes data fields for the animal's name.
 * It provides abstract methods for making the animal speak and getter/setter methods for the name.
 */

public abstract class Animal 
{
    private String name; // Data field for the name of the animal

    // Abstract method for making the animal speak (to be implemented by subclasses)
    public abstract void speak();

    // Getter method for retrieving the name of the animal
    public String getName() 
    {
        return name;
    }

    // Setter method for setting the name of the animal
    public void setName(String animalName) 
    {
        name = animalName;
    }
}
