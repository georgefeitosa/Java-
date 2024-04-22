import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
/**Reading a line from a file 
 * Course: CSIS 293
 * Professor: A.Nuzen
 * @author zyBooks
 * @since 2024
 */
public class ReadTxtFileSample extends Object{
   public static void main (String[] args) throws IOException {
      FileInputStream fileByteStream = null; // File input stream
      Scanner inFS = null;                   // Scanner object
      String line;                           // Data from file

      // Try to open file
      System.out.println("Opening file readme.txt.");
      fileByteStream = new FileInputStream("readme.txt");
      inFS = new Scanner(fileByteStream);
      
      // File is open and valid if we got this far 
      // (otherwise exception thrown)

      System.out.println("Reading a line.");
      line = inFS.nextLine();

      // Output line read from file
      System.out.println("line read from file  " + line);

      // Done with file, so try to close it
      System.out.println("Closing file readme.txt");

      fileByteStream.close(); 
      inFS.close();
   }
}
