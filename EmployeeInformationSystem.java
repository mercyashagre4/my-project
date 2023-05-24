/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template

/**
 *
 * @author WIN-10
 */
package employee.information.system;
import java.io.BufferedReader;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
interface Operation
{
    boolean authentication(String username, String pin);
    void loginManager();
    
}

class Employee
{
    String Firstname;
    String fathername;
     String Id;
    String depart;
    double salary;
   String phone_no;
    int age;
    String sex;
     public Employee(String name,String fathername, String Id, String depart, String sex,String phone_no, double salary, int age)
    {
      this.Firstname=name;
      this.fathername=fathername;
      this.Id=Id;
      this.depart=depart;
      this.salary=salary;
      this.phone_no=phone_no;
      this.age=age;
      this.sex=sex;
    } 
}
class EmployeeInformation implements  Operation {
   
    static String getSizeofObject(String fileName){
        String numberOFObject="";
        try {
            FileInputStream fin = new FileInputStream(fileName);
            Scanner sd = new Scanner(new File(fileName));
            numberOFObject= sd.next();
        }catch(IOException e) {
            System.out.println(e.getMessage());
        }
        return numberOFObject;
    }
    ArrayList<Employee>employees= new ArrayList<Employee>();
    String fileUsername="username.txt";
    String filePassword="password.txt";
    String userName = getSizeofObject(fileUsername);
    String password = getSizeofObject(filePassword);
   
    void addEmployee() {
        try {
            
             Scanner input=new Scanner(System.in);
            Scanner sc=new Scanner(System.in);
            FileWriter fw = new FileWriter("employeeInform.txt", true);
             BufferedWriter bw = new BufferedWriter(fw);
       System.out.println("ENTER THE FOLLOWING DETAILS TO ADD EMPLOYEE TO ORGANIZATION");
           
              System.out.println("Enter Employee name: ");
            String Firstname = sc.nextLine();
            while (Firstname == null ||Firstname.isEmpty()) 
            {
            System.out.println("Please enter Employee name :");
           Firstname = sc.nextLine().trim();
            if (Firstname.isEmpty()) {
                System.out.println("name is necessary, please try again.");
            }
         }
             System.out.println("Enter Employee Father name: ");
            String fathername = sc.nextLine();
            while (fathername  == null ||fathername.isEmpty()) 
            {
            System.out.println("Please enter Employee Father name :");
            fathername= sc.nextLine().trim();
            if (fathername.isEmpty()) {
                System.out.println(" Father name is necessary, please try again.");
            }
         }
           
            System.out.println("Enter employee ID: ");
            String Id = input.nextLine();
             while (Id == null || Id.isEmpty()) 
             {
            System.out.println("Please enter Employee ID :");
            Id = input.nextLine().trim();
             if (Id.isEmpty()) {
                System.out.println("Id is necessary, please try again.");
            }
         }
            System.out.println("Enter employee Departement: ");
            String depart=input.nextLine();
            System.out.println("Enter employee age: ");
           int age = input.nextInt();
           //almost the age of employee is between 15 and 70
            while(age <15 || age>70)
            {
                
                System.out.println("Invalid input. Please enter the age again:");
                 age = input.nextInt();
            }
            age=age;
            System.out.println("Enter the employee phone number");
            String phone_no=sc.nextLine();
            //to restrict the digit of phone number in to 10 digit
            while(phone_no.length()!=10)
            {
             System.out.println("Please Enter Employee phone no its length is 10 digits");
             phone_no=sc.nextLine();
            }
             phone_no= phone_no;
            System.out.println("Enter employee Sex: ");
            String sex=sc.nextLine();
            while (!sex.equalsIgnoreCase("M") && !sex.equalsIgnoreCase("F")) 
            {
            System.out.println("Invalid input. Please enter M or F:");
            sex = sc.nextLine();
         }
            sex = sex;
           // input.nextLine();
          
            System.out.println("Enter employee Salary: ");
            double salary=input.nextDouble();

            Employee emp = new Employee(Firstname,fathername, Id, depart,sex,  phone_no, salary, age);
            employees.add(emp);

            StringBuilder sb = new StringBuilder();
                     sb.append(" ID : ").append(emp.Id)
                    .append("\n NAME : ").append(emp.Firstname)
                    .append("\n FATHER NAME : ").append(emp.fathername)
                    .append("\n SEX  : ").append(emp.sex.toUpperCase())
                    .append("\n DEPARTEMENT : ").append(emp.depart) 
                    .append("\n AGE : ").append(emp.age)
                    .append("\n PHONE NUMBER : ").append(emp.phone_no)
                    .append("\n SALAR : ").append(emp.salary)
                             
                    .append("\n***********************\n");
            bw.write(sb.toString());

            bw.close();
            fw.close();
            System.out.println("Employee added and written to employeeInfo.txt successfully!");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
  public void updateEmployee()
    {  
        
         Scanner sc=new Scanner(System.in);
      System.out.print("Enter employee id to update: ");
        String id = sc.nextLine();
        
        try {
            BufferedReader br = new BufferedReader(new FileReader("employeeInform.txt"));
            StringBuilder updatedFile = new StringBuilder();
            String line;
            boolean found = false;
            while ((line = br.readLine()) != null) {
                if (line.contains(" ID : " + id)) {
                   
                    found = true;
                     
                    while (!(line = br.readLine()).contains("***********************")) {
                       
                        
                        // Skipping lines of employee with specified ID
                    }
                    continue;
                     
                     
                }
                updatedFile.append(line).append("\n");
                
            }
            
            br.close();
            if (!found) {
                System.out.println("Employee Information is not found.");
                
            } else {
                FileWriter fw = new FileWriter("employeeInform.txt");
                fw.write(updatedFile.toString());
                fw.close();
              
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            
             Scanner input=new Scanner(System.in);
            FileWriter fw = new FileWriter("employeeInform.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);

           System.out.println("ENTER THE FOLLOWING DETAILS TO UPDATE EMPLOYEE INFORMATION");
              System.out.println("Enter New employee name: ");
            String Firstname = sc.nextLine();
             while (Firstname   == null ||Firstname  .isEmpty()) 
             {
            System.out.println("Please Enter  New Employee name :");
           Firstname = sc.nextLine().trim();
            if (Firstname.isEmpty()) {
                System.out.println("name is necessary, please try again.");
            }
         }
            System.out.println("Enter New employee Father name: ");
            String fathername = sc.nextLine();
             while (fathername  == null ||fathername.isEmpty()) 
             {
            System.out.println("Please Enter New Employee Father name :");
            fathername= sc.nextLine().trim();
            if (fathername .isEmpty()) {
                System.out.println(" Father name is necessary, please try again.");
            }
         }
          
            System.out.println("Enter New Employee ID: ");
            String Id = input.nextLine();
            while (Id == null || Id.isEmpty()) 
            {
            System.out.println("Please enter Employee ID :");
            Id = input.nextLine().trim();
            if (Id.isEmpty()) {
                System.out.println("Id is necessary, please try again.");
            }
         }
            System.out.println("Enter New Employee Departement: ");
            String depart=input.nextLine();
            System.out.println("Enter New Employee age: ");
            int age = input.nextInt();
             while(age <15 || age>70)
             {
                //the age of employee may be between 15 and 70
                System.out.println("Invalid input. Please enter the  age again:");
                 age = input.nextInt();
             }
            age=age;
            System.out.println("Enter New Employee phone number");
            String phone_no=sc.nextLine();
             while(phone_no.length()!=10)
            {
             System.out.println("Please Enter New Employee phone no its length is 10 digits");
             phone_no=sc.nextLine();
            }
             phone_no= phone_no;
            System.out.println("Enter New Employee Sex: ");
            String sex=sc.nextLine();
            while (!sex.equalsIgnoreCase("M") && !sex.equalsIgnoreCase("F")) 
            {
           System.out.println("Invalid input. Please enter M or F:");
           sex = sc.nextLine();
            }
           sex = sex;
           
            System.out.println("Enter New Employee Salary: ");
            double salary=input.nextDouble();

            Employee emp = new Employee(Firstname,fathername, Id, depart,sex,  phone_no, salary, age);
            employees.add(emp);

            StringBuilder sb = new StringBuilder();
                     sb.append(" ID : ").append(emp.Id)
                    .append("\n NAME : ").append(emp.Firstname)
                    .append("\n FATHER NAME : ").append(emp.fathername)       
                    .append("\n SEX  : ").append(emp.sex.toUpperCase())
                    .append("\n DEPARTEMENT : ").append(emp.depart) 
                    .append("\n AGE : ").append(emp.age)
                    .append("\n PHONE NUMBER : ").append(emp.phone_no)
                    .append("\n SALAR : ").append(emp.salary)
                             
                    .append("\n***********************\n");
            bw.write(sb.toString());

            bw.close();
            fw.close();
            System.out.println("Employee updated and written to employeeInfo.txt successfully!");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
              
        
   }
 public void deleteEmployee(String id) {
    
        try {
            BufferedReader br = new BufferedReader(new FileReader("employeeInform.txt"));
            StringBuilder updatedFile = new StringBuilder();
            String line;
            boolean found = false;
            while ((line = br.readLine()) != null) {
                if (line.contains(" ID : " + id)) {
                    System.out.println("Employee Information is Found!");
                    found = true;
                    while (!(line = br.readLine()).contains("***********************")) {
                        // Skipping lines of employee with specified ID
                    }
                    continue;
                }
                updatedFile.append(line).append("\n");
            }
            br.close();
            if (!found) {
                System.out.println("Employee Information is not Found.");
            } else {
                FileWriter fw = new FileWriter("employeeInform.txt");
                fw.write(updatedFile.toString());
                fw.close();
                System.out.println("Employee  Successfully Deleted.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
  public void displayAll()
  {
      int flag=0;
        try {

            FileReader fr = new FileReader("employeeInform.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;

            while ((line = br.readLine()) != null) {
                flag++;
                if(flag==1){
                    System.out.println("All Empoyee Information is Here :-");
                }
                System.out.println(line);
            }
          if(flag==0){
              System.out.println("There is no employee Added to the file.");
          }

            br.close();
            fr.close();
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }

  public void searchEmployee() {
      Scanner sc=new Scanner(System.in);
        System.out.print("Enter employee ID to search: ");
        int id = sc.nextInt();
        try {
            BufferedReader br = new BufferedReader(new FileReader("employeeInform.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains(" ID : " + id)) {
                    System.out.println("Employee Information is found!");
                    System.out.println(line);
                    while (!(line = br.readLine()).contains("***********************")) {
                        System.out.println(line);
                    }

                    return;
                }
            }
            System.out.println("Employee Information not found.");
            br.close();
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
 
     
 
     
  
   public boolean authentication(String username, String pin) {
        boolean checked = false;
        if (username.equals(userName)) {
            if (pin.equals(password))
                checked = true;
            else
                System.out.print("incorrect password ");
        } else {
            if (pin.equals(password))
                System.out.print("incorrect username ");
            else
                System.out.print("incorrect username and  password ");
        }
        return checked;
   }
   public void loginManager()
    {
       Scanner scan=new Scanner(System.in);
        String inputName,inputPassword;
        int chance=1;
             for( ;;) {
            System.out.println("  Enter  Your Manager user name:");
            inputName = scan.nextLine();
            while ( inputName == null ||  inputName.isEmpty()) 
                      {
              System.out.println("Please enter the username :");
              inputName= scan.nextLine().trim();
             if ( inputName.isEmpty()) {
              System.out.println("username is necessary, please try again.");
                   }
                  }
            System.out.println("Enter Your Manager  Password");
            inputPassword = scan.nextLine();
             while (inputPassword == null || inputPassword.isEmpty()) 
                      {
              System.out.println("Please enter Your password :");
             inputPassword=  scan.nextLine().trim();
             if (inputPassword.isEmpty()) {
              System.out.println("password is necessary, please try again.");
                   }
                   }
            if (authentication(inputName,inputPassword))
            {
                 System.out.println("                YOU ARE AUTHORIZED TO USE THIS SECTION    ");
                System.out.println("---------------------------------------------------------------");
                 int choice;
                 do
   { 
    
        Scanner input=new Scanner(System.in);
        Scanner sca=new Scanner(System.in);
       
      System.out.println("\n*********Welcome To The Employee Informatoin System*********");
      
       System.out.println("1. To add Employee");
     System.out.println("2. To update Employee");
     System.out.println("3. To Delete Employee");
     System.out.println("4. TO Display all Employee");
     System.out.println("5. To Search"); 
     System.out.println("6. To Exit"); 
     System.out.println("Please enter your choice  :");
      choice=input.nextInt();
   
    switch(choice)
    {
        case 1:
            
           addEmployee();
           
            break;
        case 2:
             
            updateEmployee();
             break;
        case 3:
             
              Scanner sc=new Scanner(System.in);
        System.out.print("Enter employee ID to delete: ");
        String id = sc.nextLine();
             deleteEmployee(id);
             break;
        case 4:
             
            displayAll();
             break;
        case 5:
             
              searchEmployee();
             break;
        case 6:
            System.out.println("GoodBye");
            break;
        default:
             System.out.println("wrong choice please enter your choice again");
        
    }
    }while(choice!=6);
                 break;
            }
       else
            {
              if (chance == 3) {
                    System.out.println("maximum attempt reached  authentication failed ");
                    break;
                } else {
                    chance++;
                    System.out.println((":   " + (4 - chance) + " attempt left from 3"));
                   
                }  
            }
            
}
             
    }
    void register()
    {
         String newString;
         Scanner input=new Scanner (System.in);
         try {
                    System.out.println("Enter Your username");
                    newString = input.nextLine();
                      
                    while (newString == null || newString.isEmpty()) 
                      {
              System.out.println("Please enter the username :");
             newString= input.nextLine().trim();
             if (newString.isEmpty()) {
              System.out.println("username is necessary, please try again.");
                   }
                  }
                userName = newString;
                    FileWriter fw = new FileWriter(fileUsername);
                    fw.write(userName);
                    fw.close();
                    System.out.println("Enter Your password");
                    newString = input.nextLine();
                    while (newString == null || newString.isEmpty()) 
                      {
              System.out.println("Please enter Your password :");
             newString= input.nextLine().trim();
             if (newString.isEmpty()) {
              System.out.println("password is necessary, please try again.");
                   }
                  }
                    password = newString;
                    fw = new FileWriter(filePassword);
                    fw.write(password);
                   
                    fw.close();
                     System.out .println("YOU ARE SUCCESSFULLY REGISTERED");
                }catch (IOException e){
                    System.out.println("something went wrong while you register ");
                }
    }
}
    class Main{
         ArrayList<EmployeeInformation>employees= new ArrayList<EmployeeInformation>();
     
         public static void main(String[] args) {
     
             Scanner input=new Scanner (System.in);
        int choice;
         EmployeeInformation employees=new EmployeeInformation();
         System.out.println("$$$$$$$$$$$$$$$$--"  +
                   "WELCOME TO EMPLOYEE INFORMATION SYSTEM"  +
                   "--$$$$$$$$$$$$$$$$$$$");
    try{
            do
            {
      System.out.println(" ");
      System.out.println(" ");
      System.out.println(" 1) TO REGISTER AS A NEW MANAGER"  +
                          "\n 2) TO LOGIN AS A MANAGER"   +
                          "\n 3) TO CLOSE THE SYSTEM");
    
      System.out.println("Please enter your choice");
         choice=input.nextInt();
         switch(choice)
         {
             case 1:
              employees.register();
                 
                 break;
             case 2:
         
          employees.loginManager();
            break;
             case 3:
                 System.out.println("GOOD BYE");
                 break;
             default:
         System.out.println("xxxxxxxxxxx &wrong input   :program terminated xxxx");
         break;
         }
            }  while(choice!=3);     
   
                   
    }
    catch (Exception e) {
                System.out.println("--xx something went wrong   :program terminated xx--");
    }
    }
    }
    