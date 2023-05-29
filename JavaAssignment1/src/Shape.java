

//Inheritance 


//main method is in Inheritance.java

class Shape {
	    String color;
	    int l = 12;
	    int r = 5;
	    int h = 14;
	
	    public void printArea() {
	        System.out.println("Displays Area!\n");
	    }
	}
	
	// Now we can inherit the property of the shape class
	// 1.Single-Level Inheritance ( Child class of Shape )
	class Traingle extends Shape {
	    // No need to define here as it inherits into it
	    public void area(int l, int h) {
	        System.out.println(1 / 2 * l * h);
	    }
	}
         // 2. Multi-Level Inheritance ( derived from Triangle class )
	class EquilateralTriangle extends Traingle {
            @Override
	    public void area(int l, int h) {
	        System.out.println(1 / 2 * l * h);
	    }
	}
	// 3. Hierarchial Inheritance ( child class of Shape )
	class Circle extends Shape {
	    public void area(int r) {
	        System.out.println((3.14) * r * r);
	    }
	}


//the output of the code will be:
//Yellow!
//Displays Area!

//Orange!!
//Displays Area!


