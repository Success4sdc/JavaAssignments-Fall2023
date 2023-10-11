import java.nio.file.*;
import java.io.*;
import java.nio.file.attribute.*;
import static java.nio.file.StandardOpenOption.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Scanner;

public class ReadStateFile {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        String fileName;

        System.out.print("Enter name of file to use >> ");
        fileName = kb.nextLine();
        fileName = "" + fileName;
        Path file = Paths.get(fileName);

        final String ID_FORMAT = "000";
        final String NAME_FORMAT = "          ";
        final int NAME_LENGTH = NAME_FORMAT.length();
        final String HOME_STATE = "WI";
        final String BALANCE_FORMAT = "0000.00";
        String delimiter = ",";
        String s = ID_FORMAT + delimiter + NAME_FORMAT + delimiter + HOME_STATE + delimiter + BALANCE_FORMAT + System.getProperty("line.separator");
        final int RECSIZE = s.length();

        byte data[] = s.getBytes();
        final String EMPTY_ACCT = "000";
        String[] array = new String[4];
        double balance;
        double total = 0;

        try {
            BasicFileAttributes attr = Files.readAttributes(file, BasicFileAttributes.class);
            System.out.println("\nAttributes of the file:");
            System.out.println("Creation time " + attr.creationTime());
            System.out.println("Size " + attr.size());
        } catch (IOException e) {
            System.out.println("IO Exception");
        }

        try (FileChannel fc = (FileChannel) Files.newByteChannel(file, READ)) {

            System.out.println("\n\nRecord Data");

            ByteBuffer buffer = ByteBuffer.wrap(data);
            int id = 1;

            while (fc.read(buffer) > 0) {

                String record = new String(data);
                array = record.split(delimiter);

                if (!array[0].equals(EMPTY_ACCT)) {
                    System.out.println("Record " + id + ":");
                    System.out.println("ID     : " + array[0]);
                    System.out.println("Name  : " + array[1]);
                    System.out.println("State : " + array[2]);
                    balance = Double.parseDouble(array[3]);
                    System.out.println("Balance: " + balance);
                    total += balance;
                }

                id++;
                buffer.clear();
            }

            System.out.println("\nTotal customer balance due: " + total);

        } catch (IOException e) {
            System.out.println("IO Exception");
        }

    }

}
