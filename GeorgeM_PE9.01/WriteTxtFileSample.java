import java.io.PrintWriter;
import java.io.FileOutputStream;

/**Write a few lines to text file 
 * Course: CSIS 293
 * Professor: A.Nuzen
 * @author zyBooks
 * @since 2024
 */
public class WriteTxtFileSample extends Object{
  public static void main(String[] args)  {
     FileOutputStream fileStream = null;
     PrintWriter outFS = null;

     // Try to open file
     fileStream = new FileOutputStream("myoutfile.txt");
     outFS = new PrintWriter(fileStream);

     // Arriving here implies that the file can now be written
     // to, otherwise an exception would have been thrown.
     outFS.println("Hello");
     outFS.println("1 2 3");

     // Done with file, so try to close
     // Note that close() may throw an IOException on failure
     outFS.close();
  }
}

