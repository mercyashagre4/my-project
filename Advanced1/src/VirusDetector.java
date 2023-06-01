


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class VirusDetector {

    public static void main(String[] args) {

        String fileName = "file.txt"; // Replace with the name of your file
        String targetString = "malware"; // Replace with the string you want to detect
        boolean virusFound = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(targetString)) {
                    virusFound = true;
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (virusFound) {
            System.out.println("Virus found!");
        } else {
            System.out.println("No virus found.");
        }
    }
}

