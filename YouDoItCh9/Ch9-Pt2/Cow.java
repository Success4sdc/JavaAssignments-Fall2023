// Filename: Cow.java
// Written by Sandi Cook
// Written on September 20, 2023

/*
 * Purpose: Define the Cow class that extends the Animal class.
 * Description: This class represents a cow and implements the speak() method to make the cow say "Moo!".
 */

public class Cow extends Animal 
{
    @Override
    public void speak() 
    {
        System.out.println("Moo!");
    }
}
