





import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentManagementSystem {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = "stud_Info.txt";

        OUTER:
        while (true) {
            try {
                System.out.println("Enter 1 to register a student, 2 to display registered students, or 0 to exit:");
                String choice = br.readLine();
                switch (choice) {
                    case "1" -> {
                        try {
                            FileWriter fw = new FileWriter(fileName, true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            PrintWriter pw = new PrintWriter(bw);
                            
                            System.out.println("Enter student name:");
                            String name = br.readLine();
                            
                            System.out.println("Enter student age:");
                            int age = Integer.parseInt(br.readLine());
                            
                            System.out.println("Enter student total mark:");
                            int totalMark = Integer.parseInt(br.readLine());
                            
                            String grade = calculateGrade(totalMark);
                            
                            pw.println(name + " " + age + " " + totalMark + " " + grade);
                            pw.close();
                        } catch (IOException e) {
                            System.out.println("Error writing to file.");
                        }
                    }
                    case "2" -> {
                        try {
                            FileReader fr = new FileReader(fileName);
                            BufferedReader brFile = new BufferedReader(fr);
                            
                            String line;
                            while ((line = brFile.readLine()) != null) {
                                String[] studentInfo = line.split(" ");
                                System.out.println("Name: " + studentInfo[0] + ", Age: " + studentInfo[1] + ", Total Mark: " + studentInfo[2] + ", Grade: " + studentInfo[3]);
                            }
                            brFile.close();
                        } catch (IOException e) {
                            System.out.println("Error reading from file.");
                        }
                    }
                    case "0" -> {
                        System.out.println("Exiting program...");
                        break OUTER;
                    }
                    default -> System.out.println("Invalid choice. Please enter 1, 2, or 0.");
                }
            } catch (IOException ex) {
                Logger.getLogger(StudentManagementSystem.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static String calculateGrade(int totalMark) {
        if (totalMark >= 90) {
            return "A+";
        } else if (totalMark >= 80) {
            return "A";
        } else if (totalMark >= 70) {
            return "B+";
        } else if (totalMark >= 60) {
            return "B";
        } else if (totalMark >= 50) {
            return "C+";
        } else if (totalMark >= 40) {
            return "C";
        } else {
            return "F";
        }
    }
}