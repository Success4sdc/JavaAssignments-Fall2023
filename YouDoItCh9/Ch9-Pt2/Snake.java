// Filename: Snake.java
// Written by Sandi Cook
// Written on September 20, 2023

/*
 * Purpose: Define the Snake class that extends the Animal class.
 * Description: This class represents a snake and implements the speak() method to make the snake say "Ssss!".
 */

public class Snake extends Animal 
{
    @Override
    public void speak() 
    {
        System.out.println("Ssss!");
    }
}
