import java.io.*;

public class TestFileIO {

    // Method to write text to a file
    public static int WriteTxt(String fileName, String text) {
        try {
            FileOutputStream fileStream = new FileOutputStream(fileName);
            PrintWriter outFS = new PrintWriter(fileStream);

            // Write the text to the file
            outFS.println(text);

            // Close the PrintWriter
            outFS.close();
            
            return 0; // Return 0 to indicate success
        } catch (IOException e) {
            // If an IOException occurs, return -1 to indicate failure
            e.printStackTrace();
            return -1;
        }
    }

    public static void main(String[] args) {
        // The poem text
        String poem = "The Road Not Taken\n" +
                "BY ROBERT FROST\n\n" +
                "Two roads diverged in a yellow wood,\n" +
                "And sorry I could not travel both\n" +
                "And be one traveler, long I stood\n" +
                "And looked down one as far as I could\n" +
                "To where it bent in the undergrowth;\n\n" +
                "I shall be telling this with a sigh\n" +
                "Somewhere ages and ages hence:\n" +
                "Two roads diverged in a wood, and I—\n" +
                "I took the one less traveled by,\n" +
                "And that has made all the difference.";

        // Write the poem to a file
        int result = WriteTxt("theroad.txt", poem);

        // Check if writing was successful
        if (result == 0) {
            System.out.println("File 'theroad.txt' has been successfully created with the poem.");
        } else {
            System.out.println("Error occurred while writing to file 'theroad.txt'.");
        }
    }
}
