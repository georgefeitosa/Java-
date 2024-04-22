import java.io.*;
import java.util.Scanner;

public class TestFileIO2 {

    // Method to write text to a file
    public static int WriteTxt(String fileName, String text) {
        try {
            FileOutputStream fileStream = new FileOutputStream(fileName);
            PrintWriter outFS = new PrintWriter(fileStream); 
               // Write to file message
        System.out.println("Write to file -> " + fileName);

        // Write the text to the file
        outFS.println(text);

        // Close the PrintWriter
        outFS.close();

        // Close file message
        System.out.println("Close file -> " + fileName);

        
            return 0; // Return 0 to indicate success
        } catch (IOException e) {
            // If an IOException occurs, return -1 to indicate failure
            e.printStackTrace();
            return -1;
        }
    }

    // Method to read text from a file
    public static int ReadTxt(String fileName) {
        try {
            FileInputStream fileByteStream = new FileInputStream(fileName);
            Scanner inFS = new Scanner(fileByteStream);
            int lineCount = 0;

            // Read lines from the file
            while (inFS.hasNextLine()) {
                String line = inFS.nextLine().trim(); // Trim to exclude leading and trailing whitespaces

                // Exclude blank lines
                if (!line.isEmpty()) {
                    System.out.println(line);
                    lineCount++;
                }
            }

            // Output the total number of lines in the poem
            System.out.println("There are " + lineCount + " lines in the poem.\n\n");

            // Close the file streams
            fileByteStream.close();
            inFS.close();

            return 0; // Return 0 to indicate success
        } catch (IOException e) {
            // If an IOException occurs, return -1 to indicate failure
            e.printStackTrace();
            return -1;
        }
    }

    public static void main(String[] args) {
        // The poem text
        String poem = 
                "Two roads diverged in a yellow wood,\n" +
                "And sorry I could not travel both\n" +
                "And be one traveler, long I stood\n" +
                "And looked down one as far as I could\n" +
                "To where it bent in the undergrowth;\n\n" +
                "I shall be telling this with a sigh\n" +
                "Somewhere ages and ages hence:\n" +
                "Two roads diverged in a wood, and I—\n" +
                "I took the one less traveled by,\n" +
                "And that has made all the difference.\n\n" 
                + "The Road Not Taken\n" +
                "BY ROBERT FROST\n\n";

        // Write the poem to a file
        int writeResult = WriteTxt("theroad.txt", poem);
        // Check if writing was successful
        if (writeResult == 0) {
            System.out.println("\nRead from file -> theroad.txt\n");
        } else {
            System.out.println("Error occurred while writing to file 'theroad.txt'.");
            return;
        }

        // Read the poem from the file
        int readResult = ReadTxt("theroad.txt");

        // Check if reading was successful
        if (readResult == 0) {
            System.out.println("Closed file -> theroad.txt");
        } else {
            System.out.println("Error occurred while reading file 'theroad.txt'.");
        }
    }
}
