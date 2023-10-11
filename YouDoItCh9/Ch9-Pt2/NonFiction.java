// Filename: NonFiction.java
// Written by Sandi Cook
// Written on September 22, 2023

/*
 * Purpose:  Define a subclass of Book for non-fiction books.
 * Description: This class, NonFiction, is a subclass of Book and represents non-fiction books.
 *              It includes a constructor that sets the title and calls setPrice() to set
 *              the price for all non-fiction books to $37.99.
 */

public class NonFiction extends Book 
{
    // Constructor for NonFiction books
    public NonFiction(String title) 
    {
        super(title); // Call the constructor of the parent class (Book) with title
        setPrice();   // Set the price for non-fiction books
    }

    // Implementation of the abstract setPrice() method
    @Override
    public void setPrice() 
    {
        // Price for NonFiction books is set to $37.99
        super.setPrice(37.99);
    }
}
