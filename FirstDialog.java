
/**

 * Description: Use JDialog to output Hello Class messages
 * Student Name: George Matos
 * Course Name: CSIS-293 SP24
 * Prof: A Nuzen
 * Purpose: Copy Hello.java and rename it to FirstDialog
 * convert output consoles into GUI dialog
 * 
 */
/**
 * 
* Purpose: Illustrates a simple Java Hello Class
* by convention, a Java class identifier begins with Capital Letter or UpperCamel
Capitalization
* <pre>
* Student Name: George Matos
* Class: CSIS-293
* Prof: A Nuzen
* Project Name: Hello
* Java Class Name: Hello
* Version: 1.0
* File:Hello.java
* Prerequisite: None
* Dependencies: None
* </pre>
* @author Professor: Ahn Nuzen
* <a href = "mailto:ahn.nuzen@gcccd.edu">email</a>
* <br>Date: February 5 2024
* javadoc -author -d docs *.java
*/
import javax.swing.JOptionPane;
 

public class Hello {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,
                "Hello there!\nGood to see you");
    }
}


