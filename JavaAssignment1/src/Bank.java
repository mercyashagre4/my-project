

// class and object main method


//1) Class and object

//What are Classes and Objects?

//Classes and Objects are the fundamental building blocks of Object-Oriented Programming (OOP). 
//A class is a blueprint or template for creating objects, which define the properties and behaviors of the objects. 
//In Java, a class is defined using the keyword "class", followed by the class name, and the class body enclosed in curly braces.
//An object is an instance of a class, which is created using the "new" keyword. 
//Why we use classes and objects in Java?

//They make it easy to create complex objects and applications in Java by providing a template for creating objects that share common characteristics and behavior.
//They ensure code reusability by allowing us to use existing classes and objects as building blocks for new ones, without having to rewrite the same code.
//They support encapsulation, inheritance, and polymorphism, which are the key features of Object Oriented Programming. 
//For Example:



public class Bank {
	public static void main(String[] arg) {
	BankAccount account1 = new BankAccount();  //creating an object account1 of a class BankAccount
	account1.setAccountNumber(456);    //calling method setAccountNumber using the object account1
	account1.deposit(1000);   //calling method deposit using the object account1
	account1.status();    //calling method deposit using the object account1
	BankAccount account2 = new BankAccount(142, 2000);   //creating an object account2 of a class BankAccount and initializing 
	account2.withdraw(500);   // calling method withdraw using the object account2
	account2.status();   //calling method status using the object account2
	}
	}

//the output of the code will be:
//Account Number: 456
//Account Balance: 1000.0
//Account Number: 142
//Account Balance: 1500.0

