
//Abstraction main method


// 2) Abstraction

//What is Abstraction?
//Abstraction - is hiding the implementation details and showing only important or useful parts to the users.
//It is the process of hiding complex implementation details and exposing only the essential features of an object or system. 
//In Java, abstraction is implemented using abstract classes and interfaces.
//An abstract class is a class that cannot be instantiated, but can be sub classed. An interface is a collection of abstract methods, which define the behavior of an object. 

//Why we use abstraction?
//To simplify complex systems: Abstraction allows us to focus on the essential features of a system, while ignoring the non-essential details.
//This makes it easier to understand and work with complex systems.
//To increase flexibility and maintainability: Abstraction allows us to create systems that are more flexible and easier to maintain. 
//By hiding the implementation details of a system behind an abstraction layer, we can make changes to the implementation without affecting the rest of the system.
//for Example:



public class Abstraction {
	public static void main(String[] args) { 
	Horse myHorse = new Horse();        /* Constructor chaining means it calls the constructor of its                     super class first, that is the constructor of abstract class Animal then it calls its own constructor. */
               myHorse.walk();                // Prints  horses walk using their  four legs.
	
	// Animals animal = new Animals();     // Run-time error
	// animal.walk();     //error
	
	 myHorse.eat();              //prints : Animal eats!
	Chicken chicken = new Chicken();
	chicken.walk();            // prints  cool chicken!!
              Duck duck = new Duck();
	duck.walk();            // prints A Duck walking Cuuk-Du-Cuu
	}
	}
//so the sequence of the output will be:
// You're creating a new animal
//created a Horse..
// Horses walk using their  four legs.
//Animal eats!
//cool chicken!!
//you're creating a new animal
// A Duck walking Cuuk-Du-Cuu

