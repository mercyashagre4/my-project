


import java.io.*;
import java.util.*;

public class VirusDetection {

    // A method to read a line from a file and scan it for a target string
    public static boolean scanLine(File file, String target) {
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if (line.contains(target)) {
                    sc.close();
                    return true; // target string found
                }
            }
            sc.close();
            return false; // target string not found
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file.getName());
            return false;
        }
    }

    // The main method to test the scanLine method
    public static void main(String[] args) {
        File file = new File("test.txt"); // the file to scan
        String target = "malware"; // the target string to look for
        boolean result = scanLine(file, target); // call the scanLine method
        if (result) {
            System.out.println("Virus detected!");
        } else {
            System.out.println("No virus detected.");
        }
    }
}
