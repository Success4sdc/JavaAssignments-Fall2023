// Filename: Insured.java
// Written by Sandi Cook
// Written on September 20, 2023

/*
 * Purpose: Define the Insured interface, which outlines the methods that concrete classes implementing it must have.
 * Description: This interface defines two methods, setCoverage() and getCoverage(), which must be implemented by any
 * concrete class that implements the Insured interface.
 */

public interface Insured 
{
    // Abstract method to set the coverage for an insured object
    public abstract void setCoverage();

    // Abstract method to get the coverage value for an insured object
    public abstract int getCoverage();
}
