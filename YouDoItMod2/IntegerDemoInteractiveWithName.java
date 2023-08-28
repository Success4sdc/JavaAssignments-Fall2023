//Filename IntegerDemoInteractiveWithName.java
//Written by Sandi Cook
//Written on August 24, 2023

import java.util.Scanner;

public class IntegerDemoInteractiveWithName {

	public static void main(String[] args) {

        int anInt;
        byte aByte;
        short aShort;
        long aLong; 
        String name;      ;


        try (Scanner input = new Scanner(System.in)) {

        System.out.print("Please enter an integer >> "); 
        anInt = input.nextInt();
        System.out.print("Please enter a byte integer >> "); 
        aByte = input.nextByte();
        System.out.print("Please enter a short integer >> "); 
        aShort = input.nextShort();
        System.out.print("Please enter a long integer >> "); 
        aLong = input.nextLong();

        do {
            System.out.print("Please enter your name >> "); 
            name = input.nextLine();
        } while (name.isEmpty());
        
	
        System.out.println("The int is " + anInt);
        System.out.println("The byte is " + aByte);
        System.out.println("The short is " + aShort);
        System.out.println("The long is " + aLong);
        System.out.println("Thank you, " + name);

}
        }
}
