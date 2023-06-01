



import java.io.*;
import java.util.*;

public class StudentManagementSystem1 {

    // A class to represent a student
    static class Student {
        String name; // name of the student
        int age; // age of the student
        int totalMark; // total mark of the student
        String grade; // grade of the student

        // Constructor to initialize the fields
        public Student(String name, int age, int totalMark, String grade) {
            this.name = name;
            this.age = age;
            this.totalMark = totalMark;
            this.grade = grade;
        }

        // A method to write the student details to a file
        public void writeToFile(PrintWriter pw) {
            pw.println(name + " " + age + " " + totalMark + " " + grade);
        }

        // A method to read the student details from a file
        public static Student readFromFile(Scanner sc) {
            if (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] tokens = line.split(" ");
                if (tokens.length == 4) {
                    String name = tokens[0];
                    int age = Integer.parseInt(tokens[1]);
                    int totalMark = Integer.parseInt(tokens[2]);
                    String grade = tokens[3];
                    return new Student(name, age, totalMark, grade);
                }
            }
            return null;
        }

        // A method to display the student details
        public void display() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Total Mark: " + totalMark);
            System.out.println("Grade: " + grade);
        }
    }

    // A class to represent the student management system
    static class SMS {
        ArrayList<Student> students; // a list of students
        String fileName; // the name of the file to store the students

        // Constructor to initialize the fields
        public SMS(String fileName) {
            this.fileName = fileName;
            students = new ArrayList<>();
            loadFromFile(); // load the students from the file
        }

        // A method to load the students from the file
        public void loadFromFile() {
            try {
                File file = new File(fileName);
                if (file.exists()) {
                    Scanner sc = new Scanner(file);
                    while (sc.hasNextLine()) {
                        Student s = Student.readFromFile(sc);
                        if (s != null) {
                            students.add(s);
                        }
                    }
                    sc.close();
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found: " + fileName);
            }
        }

        // A method to save the students to the file
        public void saveToFile() {
            try {
                PrintWriter pw = new PrintWriter(fileName);
                for (Student s : students) {
                    s.writeToFile(pw);
                }
                pw.close();
            } catch (FileNotFoundException e) {
                System.out.println("File not found: " + fileName);
            }
        }

        // A method to register a new student
        public void registerStudent() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the name of the student:");
            String name = sc.nextLine();
            System.out.println("Enter the age of the student:");
            int age = sc.nextInt();
            System.out.println("Enter the total mark of the student:");
            int totalMark = sc.nextInt();
            System.out.println("Enter the grade of the student:");
            String grade = sc.next();
            Student s = new Student(name, age, totalMark, grade);
            students.add(s); // add the student to the list
            saveToFile(); // save the list to the file
            System.out.println("Student registered successfully.");
        }

        // A method to display the details of all registered students
        public void displayStudents() {
            if (students.isEmpty()) {
                System.out.println("No students registered.");
            } else {
                for (Student s : students) {
                    s.display();
                    System.out.println("-----------------");
                }
            }
        }

        // A method to display the main menu and handle user input
        public void run() {
            Scanner sc = new Scanner(System.in);
            boolean exit = false;
            while (!exit) {
                System.out.println("Welcome to Student Management System");
                System.out.println("1. Register a new student");
                System.out.println("2. Display details of registered students");
                System.out.println("3. Exit");
                System.out.println("Enter your choice:");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        registerStudent();
                        break;
                    case 2:
                        displayStudents();
                        break;
                    case 3:
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            }
            System.out.println("Thank you for using Student Management System.");
        }
    }

    // The main method to create and run the SMS object
    public static void main(String[] args) {
        SMS sms = new SMS("stud_Info.txt");
        sms.run();
    }
}