// Filename: Dog.java
// Written by Sandi Cook
// Written on September 20, 2023

/*
 * Purpose: Define the Dog class that extends the Animal class.
 * Description: This class represents a dog and implements the speak() method to make the dog say "Woof!".
 */
public class Dog extends Animal 
{
    // Override the speak() method to specify the dog's sound
    @Override
    public void speak() 
    {
        System.out.println("Woof!"); // Print "Woof!" when the dog speaks
    }
}
