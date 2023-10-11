// Filename: UseAnimals.java
// Written by Sandi Cook
// Written on September 20, 2023

/*
 * Purpose: Demonstrate the use of different animal classes that extend the Animal class.
 * Description: This program creates instances of Dog, Cow, and Snake classes, sets their names, and makes them speak.
 */

public class UseAnimals 
{
    public static void main(String[] args) 
    {
        // Create instances of Dog, Cow, and Snake
        Dog myDog = new Dog();
        Cow myCow = new Cow();
        Snake mySnake = new Snake();

        // Set names for the animals
        myDog.setName("My dog Murphy");
        myCow.setName("My cow Elsie");
        mySnake.setName("My snake Sammy");

        // Display and make each animal speak
        System.out.print(myDog.getName() + " says ");
        myDog.speak();

        System.out.print(myCow.getName() + " says ");
        myCow.speak();

        System.out.print(mySnake.getName() + " says ");
        mySnake.speak();
    }
}
