//Filename TestFusedLoopTime.java
//Written by Sandi Cook
//Written on September 10, 2023

/**
 * Purpose:
 * The TestFusedLoopTime class is designed to compare the execution times of two different loop structures: 
 * one where two methods (method1 and method2) are called in separate loops and another where both methods 
 * are called within a single loop. This comparison helps in understanding the performance implications of 
 * using fused (combined) loops versus separate loops.
 * 
 * Description:
 * The class contains the following main components:
 * 1. Variables: 
 *    - startTime and endTime to capture the start and end nanoseconds of the loop executions.
 *    - x as the loop control variable.
 *    - Constants REPEAT and FACTOR to define the number of loop iterations and the conversion factor 
 *      from nanoseconds to milliseconds, respectively.
 * 2. Loop Structures:
 *    - Two separate loops, each calling method1 and method2 respectively, 5 million times.
 *    - A single loop that calls both method1 and method2 5 million times each.
 * 3. Output:
 *    - After each loop structure execution, the elapsed time in milliseconds is printed to the console.
 * 4. Stub Methods:
 *    - method1 and method2 are stub methods with no internal logic, serving as placeholders for the demonstration.
*/
import java.time.LocalDateTime;

public class TestFusedLoopTime 
{
    public static void main(String[] args) 
    {
        // Create variables to hold starting and ending times for loop execution.
        // Also declare a loop control variable, x, and two named constants.
        int startTime, endTime;
        int x;
        final int REPEAT = 5_000_000;
        final int FACTOR = 1_000_000;

        // Declare a LocalDateTime object, initialize it to a starting time, 
        // and extract its nanoseconds component.
        LocalDateTime now;
        now = LocalDateTime.now();
        startTime = now.getNano();

        // In a loop that repeats 5 million times, call method1().
        // When the calls to method1() are complete, execute a second loop 
        // that also repeats 5 million times, calling method2().
        for (x = 0; x < REPEAT; ++x) {
            method1();
        }
        for (x = 0; x < REPEAT; ++x) {
            method2();
        }

        // When both loops are finished, get the current time, extract the nanoseconds value,
        // and display the difference between the start time and the end time, expressed in milliseconds.
        now = LocalDateTime.now();
        endTime = now.getNano();
        System.out.println("Time for loops executed separately: " + ((endTime - startTime) / FACTOR) + " milliseconds");

        // Get a new starting time, and, within a single loop, call method1() and method2() 5 million times each.
        now = LocalDateTime.now();
        startTime = now.getNano();
        for (x = 0; x < REPEAT; ++x) 
        {
            method1();
            method2();
        }

        // Get the ending time for the loop, and display the value of the elapsed interval.
        now = LocalDateTime.now();
        endTime = now.getNano();
        System.out.println("Time for loops executed in a block: " + ((endTime - startTime) / FACTOR) + " milliseconds");
    }

    // Create the two methods named method1() and method2(). 
    // Each is simply a stub—a method that contains no statements.
        public static void method1() {
        // Stub method
    }

    public static void method2() {
        // Stub method
    }
}
