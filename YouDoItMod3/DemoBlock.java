// Filename: demo_block.java
// Written by Sandi Cook
// Written on September 3, 2023

/*
This program demonstrates the block scope of variables in Java.

The program first declares an integer variable `x` and assigns it the value 1111.
Then, it enters a block and declares another integer variable `y` and assigns it the value 2222.
The program then prints the values of `x` and `y`.

Next, the program enters another block and declares an integer variable `z` and assigns it the value 3333.
The program then prints the values of `x`, `y`, and `z`.

Finally, the program calls the `demoMethod()` method.
The `demoMethod()` method declares two integer variables `x` and `y` and assigns them the values 8888 and 9999, respectively.
The method then prints the values of `x` and `y`.

The program then prints the values of `x` and `z` outside of the blocks.

The output of the program is as follows:

    Demonstrating block scope
    In first block x is 1111
    In second block x is 1111
    In second block y is 2222
    In third block x is 1111
    In third block z is 3333
    In demoMethod x is 8888
    In demoMethod block y is 9999
    After method x is 1111
    After method block z is 3333
    At the end x is 1111

As you can see, the variable `x` is accessible in all three blocks, even though it is declared in the first block.
The variable `y` is only accessible in the second block, and the variable `z` is only accessible in the third block.
The variable `x` declared in the `demoMethod()` method is a different variable from the variable `x` declared in the main method.
*/

public class DemoBlock {

    public static void main(String[] args) {
        System.out.println("Demonstrating block scope");
        int x = 1111;
        System.out.println("In first block x is " + x);
        {
            int y = 2222;
            System.out.println("In second block x is " + x);
            System.out.println("In second block y is " + y);
        }
        {
            int z = 3333;
            System.out.println("In third block x is " + x);
            System.out.println("In third block z is " + z);
            demoMethod();
            System.out.println("After method x is " + x);
            System.out.println("After method block z is " + z);
        }
        System.out.println("At the end x is " + x);
    }

    public static void demoMethod() {
        int x = 8888, y = 9999;
        System.out.println("In demoMethod x is " + x);
        System.out.println("In demoMethod block y is " + y);
    }
}
