//Sandi Cook
//October 10, 2023
//ForEachDemo.java

import java.util.*;

public class ForEachDemo 
{
    public static void main(String[] args) 
    {
        // Create a LinkedList to store sales amounts
        LinkedList<Integer> sales = new LinkedList<Integer>();
        
        // Add sales amounts to the LinkedList
        sales.add(75);
        sales.add(81);
        sales.add(43);
        sales.add(55);
        
        // Use a foreach loop to iterate through the LinkedList and print each sales amount
        for (int amt : sales) 
        {
            System.out.print(amt + " ");
        }
        
        System.out.println(); // Print a new line after displaying the sales amounts
    }
}
