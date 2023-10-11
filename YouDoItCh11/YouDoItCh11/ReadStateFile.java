//Filename ReadStateFile.java
//Written by Sandi Cook
//Written on October 6, 2023

/*
 * Purpose: Reads a random access file of customer records and displays the total balance due.
 * Description: The program prompts the user for the name of the file to read. Then, it opens the file and reads each record. For each record, the program displays the customer ID, name, state, and balance. The program also keeps a total of all the balances. After all the records have been read, the program displays the total balance due.
 */

import java.nio.file.*;
import java.io.*;
import java.nio.file.attribute.*;
import static java.nio.file.StandardOpenOption.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Scanner;

public class ReadStateFile 
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
        String fileName;
        System.out.print("Enter name of file to use >> ");
        fileName = kb.nextLine();
        fileName = "" + fileName;
        Path file = Paths.get(fileName);
        final String ID_FORMAT = "000";
        final String NAME_FORMAT = "     ";
        final int NAME_LENGTH = NAME_FORMAT.length();
        final String HOME_STATE = "WI";
        final String BALANCE_FORMAT = "0000.00";
        String delimiter = ",";
        String s = ID_FORMAT + delimiter +
            NAME_FORMAT + delimiter + HOME_STATE +
             delimiter + BALANCE_FORMAT +
             System.getProperty("line.separator");
        final int RECSIZE = s.length();
        byte data[] = s.getBytes();
        final String EMPTY_ACCT = "000";
        String[] array = new String[4];
        double balance;
        double total = 0;

        try 
        {
            BasicFileAttributes attr =
                Files.readAttributes(file, BasicFileAttributes.class);
            System.out.println("\nAttributes of the file:");
            System.out.println("Creation time " +
                attr.creationTime());
            System.out.println("Size " + attr.size());
        } 
        catch (IOException e) {
            System.out.println("IO Exception");
        }

        try (InputStream iStream = new
            BufferedInputStream(Files.newInputStream(file));
             BufferedReader reader = new
                 BufferedReader(new InputStreamReader(iStream))) {
            System.out.println("\nAll non-default records:\n");
            s = reader.readLine();
            while (s != null) {
                array = s.split(delimiter);
                if (!array[0].equals(EMPTY_ACCT)) {
                    balance = Double.parseDouble(array[3]);
                    System.out.println("ID #" + array[0] + " "
                        + array[1] + array[2]
                        + " $" + array[3]);
                    total += balance;
                }
                s = reader.readLine();
            }
            System.out.println("Total of all balances is $"
                + total);
        } 
        catch (Exception e) {
            System.out.println("Message: " + e);
        }

        try (FileChannel fc = (FileChannel) Files.newByteChannel(file, READ)) {
            ByteBuffer buffer = ByteBuffer.wrap(data);
            int findAcct;
            System.out.print("\nEnter account to seek >> ");
            findAcct = kb.nextInt();
            fc.position(findAcct * RECSIZE);
            fc.read(buffer);
            s = new String(data);
            System.out.println("Desired record: " + s);
        } 
        catch (Exception e) {
            System.out.println("Message: " + e);
        }
    }
}
