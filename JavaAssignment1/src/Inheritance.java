

//Inheritance main methhod

//3) Inheritance

//What is Inheritance?
//Inheritance is the process of creating new classes from existing classes, where the new classes inherit the properties and behaviors of the existing classes. 
//The existing class is called the superclass or parent class, and the new class is called the subclass or child class.
//In Java, inheritance is implemented using the "extends" key word. 


//Why we use Inheritance?
//We use Inheritance in Java because it allows a child class to inherit the attributes and methods of its parent class, which can save time and reduce code duplication.
//The child class can also add its own attributes and methods or override the ones inherited from the parent class.
// Inheritance inherit from one generation to the next one
// In other words, if one class wants the property of another class into it
//it Increases the reusability - parent/base class & child/sub class
//can be of 4 types - Single-level, Multi-level, hierarchical, Hybrid (combined), Mutliple/Interfaces.




public class Inheritance {
	    public static void main(String[] args) {
	        Traingle t = new Traingle();
	        t.color = "Yellow!";
	        System.out.println(t.color);
                       t.printArea();
	     Circle c = new Circle();
	        c.color = "Orange!!";
	        System.out.println(c.color);
	        c.printArea();
	    }
	}
//the output of the code will be:
//Yellow!
//Displays Area!

//Orange!!
//Displays Area!


