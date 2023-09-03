// Filename: TestInfo.java
// Written by Sandi Cook
// Written on September 3, 2023

/*
This program calls the `displayInfo()` method from the `ParadiseInfo` class.

The `main()` method prints a message and then calls the `displayInfo()` method.
The `displayInfo()` method prints a message from Paradise Day Spa.
*/

public class TestInfo {

    public static void main(String[] args) {
        // Print a message.
        System.out.println("Calling method from another class:");

        // Call the `displayInfo()` method from the `ParadiseInfo` class.
        ParadiseInfo.displayInfo();
    }
}
