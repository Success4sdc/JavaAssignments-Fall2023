//Sandi Cook
//October 10, 2023
//Purchase.java

public class Purchase implements Comparable<Purchase> 
{
    //Add two fields to the class that hold a category 
    //(for example, groceries or gas) and a price.
    private String category;
    private double price;
    
    //Create a constructor that accepts two parameters 
    //that are used to set the two fields.
    public Purchase(String cat, double pr) 
    {
        category = cat;
        price = pr;
    }

    // Include methods that return the value of each field.
    public String getCategory() 
    {
        return category;
    }

    public double getPrice() 
    {
        return price;
    }
    //Override the Object class compareTo() method to use the 
    //String class compareTo() method to compare a Purchase’s 
    //category with another Purchase’s category. 
    @Override
    public int compareTo(Purchase p) {
        int result;
        result = category.compareTo(p.getCategory());
        return result;
    }
}
