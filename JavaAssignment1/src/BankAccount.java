

   // class and object

//main method is in Bank.java
   
	class BankAccount { //name of a class
	int accountNum = 0;
	float accountBalance = 0;
	public BankAccount() {  //creating a constructor of the class which do not have a return type
	}
	public BankAccount(int accountNumber, float balance) { //overloaded constructor   
	accountNum = accountNumber;
	accountBalance = balance;
	}
           void setAccountNumber(int num) {    // a method with one parameter type of Int
	accountNum = num;
	}
              void withdraw(float amount) {  // a method with one parameter type of float
	accountBalance = accountBalance - amount;
	}
	
	void deposit(float amount) {  // a method with one parameter type of float
	accountBalance = accountBalance + amount;
	}
	void status(){  // a method to display the account number and balance
	System.out.println("Account Number: "+accountNum);
	System.out.println("Account Balance: "+accountBalance);
	}
	}
	
//the output of the code will be:
//Account Number: 456
//Account Balance: 1000.0
//Account Number: 142
//Account Balance: 1500.0
