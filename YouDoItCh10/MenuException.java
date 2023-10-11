// Filename: MenuException.java
// Written by: Sandi Cook
// Written on: October 2, 2023

/*
 * Purpose: This class represents a custom exception that can be thrown when a menu selection is invalid.
 */

public class MenuException extends Exception 
{

    /**
     * Constructs a MenuException object.
     *
     * @param choice The invalid menu selection.
     */
    public MenuException(String choice) 
    {
        super(choice);
    }
}
