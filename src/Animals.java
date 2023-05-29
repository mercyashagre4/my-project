
  // Abstraction

//main method is in Abstraction.java
            
       // we use abstract keyword to achieve it
	abstract class Animals {    // an abstract class that cannot be instantiated
	abstract void walk();       // abstract method
	
	Animals() {                      // creating a  Constructor 
	System.out.println("You're creating a new animal");
	}
	public void eat() {        //concrete method
	System.out.println("Animal eats!");
	}
	}
	class Horse extends Animals {
	Horse() {
	System.out.println("Created a Horse..");
	}
        @Override
	public void walk() { //a class Horse defining the abstract method of Animals
	System.out.println("Horses walk using their  four legs.");
	}
	}
	class Duck extends Animals {    //a class Duck defining the abstract method of Animals
        @Override
	public void walk() { 
	System.out.println(" A Duck walking Cuuk-Du-Cuu");
	}}
	
	// Pure-abstraction --------------------------
	interface Animal {
	int legs = 2;   // Always fixed or Static
	
	void walk();   // Only defining walk method, here ( By default it is public )
	                        // Animal(){
	                        // Show an error coz interfaces doesn't have constructors into it..
	                       // }
                                     // void eat(){
	                       // This'll also show error coz it neither contains any non-abstract method nor any
	                     // method implementation
	                    // }
                 }
	interface Chicku {
	}
	// To implement abstraction we use implements keyword
	class Chicken implements Animal, Chicku {    //a class can implement more than one interface
        @Override
	public void walk() {                                             // Implementation goes here 
	System.out.println("cool chicken!!");
	}
	}
	
//so the sequence of the output will be:
// You're creating a new animal
//created a Horse
// Horses walk using their  four legs.
//Animal eats!
// A Duck walking Cuuk-Du-Cuu

