//Filename: DemoArray.java
//Written by Sandi Cook
//Written on: September 15, 2023

/*
Purpose: This Java program demonstrates the use of arrays to store and display salary values.
*/

public class DemoArray {
    public static void main(String[] args) {
        // Create an array to store salary values
        double[] salaries = new double[4];

        // Initialize the array elements with salary values
        salaries[0] = 16.25;
        salaries[1] = 17.55;
        salaries[2] = 18.25;
        salaries[3] = 19.85;

        // Display the salaries one by one
        System.out.println("Salaries one by one are:");
        System.out.println(salaries[0]);
        System.out.println(salaries[1]);
        System.out.println(salaries[2]);
        System.out.println(salaries[3]);

        // Attempting to access an element outside the array's bounds will generate an error
        System.out.println(salaries[4]);
    }
}
