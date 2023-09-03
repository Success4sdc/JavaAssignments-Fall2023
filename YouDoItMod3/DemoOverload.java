// Filename: DemoOverload.java
// Written by Sandi Cook
// Written on September 3, 2023

/*
This program demonstrates method overloading in Java.

The `displayDate()` method is overloaded three times.
The first version of the method takes a single integer argument, which represents the month.
The second version of the method takes two integer arguments, which represent the month and day.
The third version of the method takes three integer arguments, which represent the month, day, and year.

The `main()` method calls the `displayDate()` method three times, passing different arguments each time.
The output of the program is as follows:

    Event date 6/1/2024
    Event date 6/24/2024
    Event date 6/24/2023

As you can see, the `displayDate()` method prints the event date in the format `mm/dd/yyyy`.
The date format is determined by the number of arguments passed to the method.
*/

public class DemoOverload {

    public static void main(String[] args) {
        int month = 6, day = 24, year = 2023;

        // Call the first version of the displayDate() method.
        displayDate(month);

        // Call the second version of the displayDate() method.
        displayDate(month, day);

        // Call the third version of the displayDate() method.
        displayDate(month, day, year);
    }

    // This method prints the event date in the format `mm/1/2024`.
    public static void displayDate(int mm) {
        System.out.println("Event date " + mm + "/1/2024");
    }

    // This method prints the event date in the format `mm/dd/2024`.
    public static void displayDate(int mm, int dd) {
        System.out.println("Event date " + mm + "/" + dd + "/2024");
    }

    // This method prints the event date in the format `mm/dd/yyyy`.
    public static void displayDate(int mm, int dd, int yy) {
        System.out.println("Event date " + mm + "/" + dd + "/" + yy);
    }
}
