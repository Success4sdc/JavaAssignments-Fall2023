// Filename: YummyMotto.java
// Written by Sandi Cook
// Written on September 3, 2023

/*
* Purpose: This program prints the Yummy Catering motto with a border.
*
* Description:
* The program first declares a string variable called `motto` and assigns it the value of "Yummy makes the food that makes it a party".
* It then declares an integer variable called `length` and assigns it the length of the `motto` string.
* Next, the program prints a top border using the `System.out.println()` method.
* Then, the program prints the `motto` string using the `System.out.println()` method.
* Finally, the program prints a bottom border using the `System.out.println()` method.
*/
public class YummyMotto2 {

  public static void main(String[] args) {
    String motto = "Yummy makes the food that makes it a party";
    int length = motto.length();

    // Print the top border.
    System.out.println("******************************************");

    // Print the motto.
    System.out.println(motto);

    // Print the bottom border.
    System.out.println("******************************************");
  }

}
