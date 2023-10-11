// Filename: Fiction.java
// Written by Sandi Cook
// Written on September 22, 2023

/*
 * Purpose:  Define a subclass of Book for fiction books.
 * Description: This class, Fiction, is a subclass of Book and represents fiction books.
 *              It includes a constructor that sets the title and calls setPrice() to set
 *              the price for all fiction books to $24.99.
 */

public class Fiction extends Book 
{
    // Constructor for Fiction books
    public Fiction(String title) 
    {
        super(title); // Call the constructor of the parent class (Book) with title
        setPrice();   // Set the price for fiction books
    }

    // Implementation of the abstract setPrice() method
    @Override
    public void setPrice() 
    {
        // Price for Fiction books is set to $24.99
        super.setPrice(24.99);
    }
}
