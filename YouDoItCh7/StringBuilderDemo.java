//Filename: StringBuilderDemo.java
//Written by: Sandi Cook
//Written on: _____________________

/*
Purpose: This program demonstrates the use of the StringBuilder class in Java.
It initializes two StringBuilder objects, nameString and addressString, and then displays their capacities.
It also sets the length of these StringBuilder objects and prints them.
*/

public class StringBuilderDemo {

    public static void main(String[] args) {
        StringBuilder nameString = new StringBuilder("Barbara");
        int nameStringCapacity = nameString.capacity();
        System.out.println("Capacity of nameString is " + nameStringCapacity);

        StringBuilder addressString = new StringBuilder("6311 Hickory Nut Grove Road");
        int addStringCapacity = addressString.capacity();
        System.out.println("Capacity of addressString is " + addStringCapacity);

        nameString.setLength(20);
        System.out.println("The name is " + nameString + "end");

        addressString.setLength(20);
        System.out.println("The address is " + addressString);
    }
}
