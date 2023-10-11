import java.nio.file.*; //import libraries
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;
import java.text.*;
public class CreateFilesBasedOnState
{//beginning of class CreateFilesBasedOnState
   public static void main(String[] args) 
   {//beginning of main method
        Scanner input = new Scanner(System.in);
                Path inStateFile = // Path objects for in-state and out-of-state customers.
        Paths.get("InStateCusts.txt");
        Path outOfStateFile = 
         Paths.get("OutOfStateCusts.txt");
        final String ID_FORMAT = "000"; // String to format the empty files.
        final String NAME_FORMAT = "          ";
        final int NAME_LENGTH = NAME_FORMAT.length();
        final String HOME_STATE = "WI";
        final String BALANCE_FORMAT = "0000.00";
        String delimiter = ",";
        String s = ID_FORMAT + 
         delimiter + NAME_FORMAT + delimiter + 
         HOME_STATE + delimiter + BALANCE_FORMAT + System.getProperty("line.separator");
        final int RECSIZE = s.length();
        FileChannel fcIn = null; // Two FileChannel references.
        FileChannel fcOut = null;     
        String idString;// String and integer representations of the customer's account number.
        int id;
        String name; // The customer's name, state, and balance fields.
        String state;
        double balance;        
        final String QUIT = "999"; // QUIT constant.              
        createEmptyFile(inStateFile, s);// Create the empty files.
        createEmptyFile(outOfStateFile, s);        
        try
        {//first code block of try block #1
           fcIn = (FileChannel)Files.newByteChannel 
            (inStateFile, CREATE, WRITE); 
           fcOut = (FileChannel)Files.newByteChannel 
            (outOfStateFile, CREATE, WRITE);
            System.out.print("Enter customer account number >> "); 
            idString = input.nextLine(); 
            while(!(idString.equals(QUIT))) 
            {//second block of try block #1
            id = Integer.parseInt(idString);
            System.out.print("Enter name for customer >> "); 
            name = input.nextLine();
            StringBuilder sb = new StringBuilder(name); 
            sb.setLength(NAME_LENGTH); 
            name = sb.toString();   
            System.out.print("Enter state >> "); 
            state = input.nextLine();
            System.out.print("Enter balance >> "); 
            balance = input.nextDouble(); 
            input.nextLine();
            DecimalFormat df = new DecimalFormat(BALANCE_FORMAT);
            s = idString + delimiter + name + delimiter + state + delimiter + 
               df.format(balance) + System.getProperty("line.separator");
            byte data[] = s.getBytes();
            ByteBuffer buffer = ByteBuffer.wrap(data);
         if(state.equals(HOME_STATE)) 
         {//third block of try block#1
            fcIn.position(id * RECSIZE); 
            fcIn.write(buffer);
         }//end of third block of try block#1
         else 
         {//beginning of else clause inside try block #1
            fcOut.position(id * RECSIZE); 
            fcOut.write(buffer);
         }//end of else clause inside try block #1
         System.out.print("Enter next customer account number or " 
            + QUIT + " to quit >> "); 
         idString = input.nextLine();         
}//end of second block inside try block#1
         fcIn.close(); 
         fcOut.close();
}//end of try block #1
   catch (Exception e) 
   {//begin catch block for try block #1
   System.out.println("Error message: " + e); 
   }//end catch block for try block #1
  }//close main method
    public static void createEmptyFile(Path file, String s)// Method to create an empty file to hold random access records (pg. 473)
    {//beginning of createEmptyFile
    final int NUMRECS = 1000;    
    try
    {//beginning of try block #2
    OutputStream outputStr = 
      new BufferedOutputStream
      (Files.newOutputStream(file,CREATE)); 
      BufferedWriter writer =
         new BufferedWriter(new OutputStreamWriter(outputStr));      
      for(int count = 0; count < NUMRECS; ++count) 
         writer.write(s, 0, s.length()); 
         writer.close();
    }//end of try block #2
    catch(Exception e) 
   {//beginning of catch block
   System.out.println("Error message: " + e); 
   }//end of catch block
  }//end of createEmptyFile
 }//end class CreateFileBasedOnState
 