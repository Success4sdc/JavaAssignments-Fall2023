//Sandi Cook
//October 10, 2023
//LinkedListDemo.java

import java.util.LinkedList;

public class LinkedListDemo 
{
    public static void main(String[] args) 
    {
        // Create a LinkedList to store names
        LinkedList<String> names = new LinkedList<String>();

        // Add names to the LinkedList and display it after each addition
        names.add("Anee");
        display(names);
        names.add("Brian");
        display(names);
        names.add("Zelda");
        display(names);

        // Insert "Juan" at index 2 and display the updated list
        names.add(2, "Juan");
        display(names);

        // Remove the element at index 1 and display the updated list
        names.remove(1);
        display(names);

        // Set the element at index 0 to "Dinh" and display the updated list
        names.set(0, "Dinh");
        display(names);

        // Add "Lee" to the end of the list and display the final list
        names.add("Lee");
        display(names);
    }

    // Display method for the LinkedList
    public static void display(LinkedList<String> names) 
    {
        // Print the size of the list and the list itself
        System.out.println("\nThe size of the list is " + names.size());
        System.out.println(names);
    }
}
