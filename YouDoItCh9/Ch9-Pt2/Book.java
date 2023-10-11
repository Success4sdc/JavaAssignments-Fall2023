// Filename: Book.java
// Written by Sandi Cook
// Written on September 22, 2023

/*
 * Purpose:  Define an abstract class for books.
 * Description: This abstract class, Book, includes a String field for the book's title
 *              and provides a constructor that requires the book title and defines
 *              getter methods for retrieving the title and price. It also declares
 *              an abstract method named setPrice() which should be implemented by
 *              concrete subclasses.
 */

public abstract class Book {
    private String title;
    private double price;

    // Constructor that requires the book title
    public Book(String title) {
        this.title = title;
    }

    // Getter method for retrieving the title
    public String getTitle() {
        return title;
    }

    // Getter method for retrieving the price
    public double getPrice() {
        return price;
    }

    // Abstract method to set the price (to be implemented by subclasses)
    public abstract void setPrice();
    
    // Protected setter for price to allow subclasses to set the price
    protected void setPrice(double price) {
        this.price = price;
    }
}
