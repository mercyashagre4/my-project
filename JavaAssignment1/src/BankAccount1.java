

//Encapsulation

//4) Encapsulation

//What is Encapsulation?
//Encapsulation is the process of wrapping data and methods into a single unit, called a class, and restricting access to the data from outside the class. 
//In Java, encapsulation is implemented using access modifiers, such as public, private, and protected. 
//Public data and methods can be accessed from anywhere, private data and methods can only be accessed within the same class, and protected data and methods can be accessed within the same class and its subclasses.

//Why we use Encapsulation?
//We use Encapsulation because it helps to protect the data within a class from being modified accidentally or maliciously, and helps to ensure that the class remains stable and easy to maintain over time. 
//Encapsulation allows us to control access to the data within the class and ensures that it is modified in a safe and secure manner.
//By using public methods to interact with the private instance variables, we can ensure that the state of the object remains consistent and that the class is easy to maintain over time.
//to allow outside access to the instance variables, public methods called getters and setters are defined, which are used to retrieve and modify the values of the instance variables, respectively. 
//For Example:


public class BankAccount1 {
    private String accountNumber;  //private instance variable
    private double balance;   //private instance variable
      public void deposit(double amount) {
        balance += amount;
    }
  public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }
  public double getBalance() { //getBalance method to return Balannce
        return balance;
    }
  public String getAccountNumber() { //getAccountNumber method to return accountNumber
        return accountNumber;
    }
  public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
 }
 public static void main(String[] args) {
        BankAccount1 myAccount = new BankAccount1(); //creating an object myAccount of class BankAccount
        myAccount.setAccountNumber("123456");  //calling method setAccountNumber and passing a parameter
        myAccount.deposit(1000);  //calling method deposit and passing a parameter
        myAccount.withdraw(500);  //calling method withdraw and passing a parameter
        System.out.println("Account number: " + myAccount.getAccountNumber());
        System.out.println("Balance: " + myAccount.getBalance());
    }
}
/**We have a BankAccount class that has two private instance variables accountNumber and balance. These variables are encapsulated within the class, meaning that they can only be accessed and 
 *modified through the public methods provided by the class.
*The public methods deposit and withdraw allows to add or subtract from the account balance. The withdraw method checks if the balance is sufficient before making the withdrawal.
*The public methods getBalance and getAccountNumber allows to retrieve the account balance and number respectively. The method setAccountNumber allows  to set the account number.
*The private access modifier on the accountNumber and balance instance variables restricts direct access to them from outside the class. The public methods provide controlled access to these variables,
*ensuring that they are modified in a safe and secure manner.
*encapsulation helps to protect the data within a class from being modified accidentally or maliciously, and helps to ensure that the class remains stable and easy to maintain over time.
*/
//The output of the code will be:

//Account number: 123456
//Balance: 500.0

