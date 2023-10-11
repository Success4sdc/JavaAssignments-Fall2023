// Filename: VegetarianMenu.java
// Written by: Sandi Cook
// Written on: October 2, 2023

/*
 * Purpose: This class represents a menu of vegetarian entrées that extends the Menu class.
 */

public class VegetarianMenu extends Menu 
{

    // The vegetarian entrée choices.
    String[] vegEntreeChoices = {"Spinach Lasagna", "Cheese Enchiladas", "Fruit Plate"};

    /**
     * Constructs a VegetarianMenu object.
     *
     * Assigns each vegetarian selection to the Menu superclass entreeChoices array.
     */
    public VegetarianMenu() 
    {
        super();
        for (int x = 0; x < vegEntreeChoices.length; ++x) 
        {
            entreeChoices[x] = vegEntreeChoices[x];
        }
    }
}
